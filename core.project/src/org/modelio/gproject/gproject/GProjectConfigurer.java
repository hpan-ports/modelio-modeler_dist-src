/* 
 * Copyright 2013-2015 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */


package org.modelio.gproject.gproject;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.AuthDescriptor;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.DescriptorServices;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties.Entry;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.data.project.todo.InstallModuleDescriptor;
import org.modelio.gproject.data.project.todo.RemoveModuleDescriptor;
import org.modelio.gproject.data.project.todo.TodoDescriptor;
import org.modelio.gproject.data.project.todo.UpdateModuleDescriptor;
import org.modelio.gproject.fragment.Fragments;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.remote.GRemoteProject;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.ModuleSorter;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.collections.TopologicalSorter.CyclicDependencyException;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

/**
 * Reconfigure an opened project with a new project descriptor.
 * <p>
 * This class will be redefined in GUI plugins to update the modules.
 */
@objid ("ec2c8fb7-cc48-46d2-82ee-fe56b40646ce")
public class GProjectConfigurer {
    @objid ("009e7105-8a6c-48ba-bb6d-d1f0826d6a1d")
    private List<Failure> failures = new ArrayList<>();

    @objid ("547b67ec-3786-42fc-85a2-41591e0032ae")
    private Map<String, ModuleChange> moduleChanges;

    @objid ("1d3e1140-30aa-43c0-b311-4d317632b27f")
    private GProject project;

    @objid ("7e021cf9-8a5b-4c19-a048-ebc392b77c5b")
    private TodoDescriptor todo;

    /**
     * Initialize a project configurer with an open project
     * @param project an opened project.
     */
    @objid ("59b929ba-abcb-4e5c-8ffa-c9ed636e1d07")
    public GProjectConfigurer(GProject project) {
        this.project = project;
        this.todo = project.getTodo();
    }

    /**
     * Get the list of fragments or modules that couldn't be installed/removed or modified.
     * @return the failures list.
     */
    @objid ("97df6319-296e-4234-b887-8c0941659964")
    public List<Failure> getFailures() {
        return this.failures;
    }

    /**
     * Get the modules modified by the last synchronization.
     * @return the module changes.
     */
    @objid ("51292fd2-af65-4427-9381-d57e982ea91b")
    public Collection<ModuleChange> getModuleChanges() {
        return this.moduleChanges.values();
    }

    /**
     * @return the configured project.
     */
    @objid ("0eedda80-36d2-49cb-9fb3-0e57bbad694a")
    public GProject getProject() {
        return this.project;
    }

    /**
     * Reconfigure the project with the given new descriptor.
     * <p>
     * Replaces the project content. Old fragments will be removed, new ones will be added and mount.
     * @param newDesc the new project description
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("cb5025f3-61d6-4aed-9e1a-55dc13c2b4be")
    public final void reconfigure(ProjectDescriptor newDesc, IModelioProgress monitor) {
        this.failures = new ArrayList<>();
        
        int nticks = 10 * (newDesc.getModules().size() + newDesc.getFragments().size() + 1);
        SubProgress mon = SubProgress.convert(monitor, nticks);
        
        if(! this.project.getName().equals(newDesc.getName())) {
            // Project renamed, no pb
            this.project.setName(newDesc.getName());
        }
        
        if(! this.project.getRemoteLocation().equals(newDesc.getRemoteLocation())) {
            // Project adress on server renamed, no pb
            try {
                this.project.setRemoteLocation(newDesc.getRemoteLocation());
            } catch (URISyntaxException e) {
                this.failures.add(new Failure(e));
            }
        }
        
        if (! this.project.getType().toString().equals(newDesc.getType())) {
            // different type, this is a different project.
            throw new IllegalArgumentException(this+" incompatible with "+ newDesc.getType());
        }
        
        this.project.reconfigureProperties(newDesc.getProperties(), mon.newChild(10));
        
        //TODO I don't know what to do if project login changes.
        @SuppressWarnings("unused")
        boolean authChanged = this.project.getAuthConfiguration().reconfigure(newDesc.getAuthDescriptor());
        
        // Modules
        reconfigureModules(newDesc, mon);
        
        // Fragments
        reconfigureFragments(newDesc, mon);
        
        mon.subTask("");
    }

    /**
     * Synchronize the project against its remote configuration.
     * <p>
     * Does nothing on local projects.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return <code>true</code> if the configuration was changed, <code>false</code> if no change was made.
     * @throws java.io.IOException in case of failure.
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException in case of authentication error.
     */
    @objid ("cd85e181-73c6-4b4b-9f6e-10cd4e201570")
    public boolean synchronize(IModelioProgress monitor) throws GProjectAuthenticationException, IOException {
        if (getProject() instanceof GRemoteProject) {
            String title = CoreProject.getMessage("GProjectConfigurer.Synchronizing",getProject().getName());
        
            SubProgress mon = SubProgress.convert(monitor, title, 1000);
        
            GRemoteProject rp = (GRemoteProject) getProject();
        
            ProjectDescriptor newDesc = new ProjectWriter(rp).writeProject();
            IAuthData authData  = rp.getAuthConfiguration().getAuthData();
            ProjectDescriptor newServerDesc = GProjectFactory.getRemoteDescriptor(newDesc, authData, mon.newChild(100));
        
            if (newServerDesc == null) {
                final String msg = CoreProject.getMessage("GProjectConfigurer.NoRemoteProjectDescriptor", rp.getRemoteLocation());
                rp.getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(new IOException(msg)));
                Log.trace(new IOException(msg));
            } else if (getProject().needsReconfiguration(newServerDesc)) {
        
                DescriptorServices.removeSharedPart(newDesc);
                DescriptorServices.merge(newServerDesc, newDesc);
                newDesc.cleanup();
        
                reconfigure(newDesc, mon.newChild(950));
        
                getProject().save(mon.newChild(50));
                return true;
            }
        }
        return false;
    }

    /**
     * Fetch a module handle for the given descriptor.
     * <p>
     * Prompt for authentication if needed.
     * @param md a module descriptor
     * @return the module handle
     * @throws java.nio.file.FileSystemException in case of failure
     * @throws java.io.IOException in case of failure
     */
    @objid ("6bd85c21-db36-429e-af73-a810237123e2")
    protected IModuleHandle fetchModuleHandle(ModuleDescriptor md) throws FileSystemException, IOException {
        try {
            return getProject().getModuleHandle(null, md);
        } catch (AccessDeniedException e) {
            AuthDescriptor authDesc = md.getAuthDescriptor();
            final IAuthData badAuthData = authDesc.getData() ;
            if (authDesc.getScope() == DefinitionScope.LOCAL || badAuthData == null) {
                // Authentication may be modified locally, prompt user for correct ones
                final String moduleLabel = md.getName()+" "+md.getVersion();
                IAuthData authData = handleAccessDeniedException(moduleLabel, md.getArchiveLocation(), badAuthData, e);
                if (authData != null) {
                    authDesc.setData(authData);
                    return fetchModuleHandle(md);
                }
            }
            throw e;
        }
    }

    /**
     * Called when authentication fails on a fragment or a module.
     * <p>
     * Returns null by default.
     * Subclasses may prompt the user for new authentication data.
     * @param name the name of the module/fragment that cannot be accessed
     * @param uri the location of the element
     * @param data the failred authentication data
     * @param e the failure
     * @return the new authentication data to try or null to abort.
     */
    @objid ("c04acc39-33bc-4c9f-9f8b-60ccd0013634")
    protected IAuthData handleAccessDeniedException(String name, URI uri, IAuthData data, AccessDeniedException e) {
        // aborts by default
        return null;
    }

    /**
     * Install a new module.
     * <p>
     * May be redefined.
     * @param fd the new module descriptor.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("ea6f1023-85dd-4f21-816a-090fee511246")
    protected void installModule(ModuleDescriptor fd, IModelioProgress mon) throws IOException {
        Objects.requireNonNull(fd, "no module descriptor");
        
        InstallModuleDescriptor desc = new InstallModuleDescriptor();
        
        desc.setDescriptor(fd);
        this.todo.getActions().add(desc);
    }

    /**
     * Default implementation replaces share scoped parameters with the news.
     * <p>
     * Local scope parameters are left untouched.
     * To be redefined for a better behavior.
     * @param m the module to update
     * @param desc the new module parameters.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("5b042a6f-1415-4f2c-95ce-7010b25d1e09")
    protected void reconfigureModule(GModule m, ModuleDescriptor desc, IModelioProgress mon) throws IOException {
        m.setScope(desc.getScope());
        m.setOriginalArchiveUri(desc.getArchiveLocation());
        
        if (m.getAuthData() == null) {
            m.setAuthData(GAuthConf.from(desc.getAuthDescriptor()));
        } else {
            m.getAuthData().reconfigure(desc.getAuthDescriptor());
        }
        
        GProperties myParameters = m.getParameters();
        GProperties descParams = desc.getParameters();
        
        for (Entry theirParam : descParams.entries()) {
            final Entry myParam = myParameters.getProperty(theirParam.getName());
            if (myParam == null || theirParam.getScope()==DefinitionScope.SHARED || myParam.getScope()==DefinitionScope.SHARED) {
                myParameters.setProperty(theirParam.getName(), theirParam.getValue(), theirParam.getScope());
            }
        }
        
        // Shared parameters that are not on the server anymore become local
        for (Entry p : myParameters.entries()) {
            if (p.getScope()==DefinitionScope.SHARED && descParams.getProperty(p.getName()) == null) {
                p.setScope(DefinitionScope.LOCAL);
            }
        }
    }

    @objid ("b1f40ad6-421b-4f4e-8f75-26baf1b405cc")
    protected void reconfigureModules(ProjectDescriptor newDesc, SubProgress mon) {
        this.moduleChanges = new HashMap<>();
        
        // Iterates old modules descriptors
        for (GModule oldModule : this.project.getModules()) {
            ModuleChange entry = this.moduleChanges.get(oldModule.getName());
            if (entry == null) {
                final IModuleHandle oldHandle = oldModule.getModuleHandle();
                entry = new ModuleChange(null, oldModule, oldHandle);
                this.moduleChanges.put(oldModule.getName(), entry);
            } else {
                entry.oldModule = oldModule;
            }
        }
        
        // Iterates new modules descriptors
        ProjectWriter pw = new ProjectWriter(getProject());
        
        for (ModuleDescriptor md : newDesc.getModules()) {
            try {
                IModuleHandle mh = fetchModuleHandle(md);
        
                ModuleChange entry = this.moduleChanges.get(md.getName());
                if (entry == null) {
                    // It's a new module
                    entry = new ModuleChange(md, null, mh);
                    this.moduleChanges.put(mh.getName(), entry);
                } else {
                    // It's an existing module
                    if(pw.writeModuleDescriptor(entry.oldModule).equals(md)) {
                        // No change, remove entry
                        this.moduleChanges.remove(md.getName());
                    } else {
                        entry.newDesc = md;
                        entry.newHandle = mh;
                    }
                }
        
            } catch (IOException | RuntimeException e) {
                // report failure
                addFailure(md, null, e);
        
                // record this module to be ignored for changes
                this.moduleChanges.remove(md.getName());
            }
        }
        
        // Process modules changes
        List<IModuleHandle> allModuleHandles = new ArrayList<>( newDesc.getModules().size());
        for (ModuleChange change : this.moduleChanges.values()) {
            if (change.newHandle != null) {
                allModuleHandles.add(change.newHandle);
            }
        }
        
        // Process modules changes in installation order
        for (IModuleHandle h : getSortedModules(allModuleHandles, this.moduleChanges)) {
            ModuleChange entry = this.moduleChanges.get(h.getName());
            if (entry.newDesc == null) {
                // module deleted
                callRemoveModule(entry.oldModule, mon.newChild(10));
            } else if (entry.oldModule == null) {
                // new module
                callInstallModule(entry, mon.newChild(10));
            } else if (entry.oldModule.getModuleHandle().equals(entry.newHandle)) {
                // old test : entry.newDesc.getVersion().equals(entry.oldModule.getVersion())
                // module updated
                // Same version, just update parameters
                callReconfigureModule(entry.oldModule, entry.newDesc, mon.newChild(10));
            } else {
        
                // module updated
                // Another version
                callUpgradeModule(entry, mon.newChild(10));
            }
        }
    }

    /**
     * Uninstall a module.
     * <p>
     * By default postpone the action in the to-do descriptor.
     * To be redefined to add other behavior.
     * @param m the module to remove.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("27503c90-5d40-4bbf-a76d-02a69d9db936")
    protected void removeModule(GModule m, IModelioProgress mon) throws IOException {
        RemoveModuleDescriptor desc = new RemoveModuleDescriptor();
        desc.setModuleName(m.getName());
        this.todo.getActions().add(desc);
    }

    /**
     * Update a module to another version.
     * <p>
     * May be redefined.
     * <p>
     * By default postpone the operation in the project to-do list.
     * @param oldModule the module to update
     * @param md the new module descriptor
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("f7e455f8-2eed-4888-b017-baaa46ffb9c5")
    protected void upgradeModule(GModule oldModule, ModuleDescriptor md, IModelioProgress monitor) throws IOException {
        UpdateModuleDescriptor desc = new UpdateModuleDescriptor();
        desc.setNewModuleDescriptor(md);
        desc.setOldModuleName(oldModule.getName());
        
        this.todo.getActions().add(desc);
    }

    /**
     * Record failure to synchronize a module.
     * @param moduleDescriptor a module descriptor if available
     * @param module the module if available
     * @param cause the error
     */
    @objid ("c8223389-c506-4fb9-b8ad-365e419d0866")
    private void addFailure(ModuleDescriptor moduleDescriptor, GModule module, Throwable cause) {
        Failure failure = new Failure(moduleDescriptor, module, cause);
        this.failures.add(failure);
    }

    /**
     * Record failure to synchronize a fragment.
     * @param f the fragment if available
     * @param fd a fragment descriptor if available
     * @param cause the error
     */
    @objid ("30814275-e282-4d16-a5cc-3a6ec0e2e4a2")
    private void addFailure(IProjectFragment f, FragmentDescriptor fd, Exception cause) {
        this.failures.add(new Failure(fd, f, cause));
    }

    @objid ("289fd0a5-9690-48cf-8e1b-80aac5a6c6a7")
    private void callInstallModule(ModuleChange entry, IModelioProgress mon) {
        mon.subTask("Installing "+entry.newDesc.getName()+" "+entry.newDesc.getVersion()+"...");
        
        try {
            installModule(entry.newDesc, mon);
        } catch (IOException | RuntimeException e) {
            addFailure(entry.newDesc, null, e);
        }
    }

    @objid ("61098f30-1054-4e06-9088-15b447fa0ba8")
    private void callReconfigureFragment(SubProgress mon, IProjectFragment f, FragmentDescriptor fd) {
        mon.subTask(CoreProject.getMessage("GProjectConfigurer.SynchronizingFragment",f.getId()));
        
        try {
            f.reconfigure(fd, mon);
        } catch (Exception e) {
            addFailure(f, fd, e);
        }
    }

    @objid ("fff74949-a51e-4e31-a32a-3886cf44e49e")
    private void callReconfigureModule(GModule m, ModuleDescriptor fd, SubProgress mon) {
        try {
            reconfigureModule(m, fd, mon);
        } catch (IOException | RuntimeException e) {
            addFailure(fd, m, e);
        }
    }

    @objid ("cd5fa51e-1823-463d-abdb-e133715bcdc7")
    private void callRemoveModule(GModule m, SubProgress mon) {
        mon.subTask("Removing "+m.getName()+" "+m.getVersion()+"...");
        
        try {
            removeModule(m, mon);
        } catch (IOException | RuntimeException e) {
            addFailure(null, m, e);
        }
    }

    @objid ("0d2ee5da-eb51-44c0-b4a7-80b839df1679")
    private void callUpgradeModule(ModuleChange ch, IModelioProgress mon) {
        try {
             upgradeModule(ch.oldModule, ch.newDesc, mon);
        } catch (IOException | RuntimeException e) {
            addFailure(ch.newDesc, ch.oldModule, e);
        }
    }

    /**
     * Sort the module handles by dependency order.
     * <p>
     * Reports and does best effort in case of dependency cycle.
     * @param allModuleHandles the handles to sort
     * @param map the changes map for failure reporting
     * @return the sorted handle.
     */
    @objid ("c0e139b9-622f-4467-aa25-f19e0082df37")
    private List<IModuleHandle> getSortedModules(List<IModuleHandle> allModuleHandles, Map<String, ModuleChange> map) {
        List<IModuleHandle> sortedHandles;
        
        try {
            sortedHandles = ModuleSorter.sortHandles(allModuleHandles);
        } catch (CyclicDependencyException e) {
            // Report an error for each module involved in the cycle
            // note : the cycle members list is not sorted.
            for (IModuleHandle h : e.<IModuleHandle>getCycle()) {
                ModuleChange entry = map.get(h.getName());
                addFailure(entry.newDesc, entry.oldModule, e);
            }
        
            try {
                // Sort the not cycled part and append the cycle at end
                sortedHandles = new ArrayList<>(allModuleHandles);
                sortedHandles.removeAll(e.getCycle());
        
                sortedHandles = ModuleSorter.sortHandles(allModuleHandles);
                sortedHandles.addAll(e.<IModuleHandle>getCycle());
            } catch (CyclicDependencyException e2) {
                // Last resort, return the not sorted list
                sortedHandles = allModuleHandles;
            }
        }
        return sortedHandles;
    }

    @objid ("6544e0cf-9f0a-4bcc-ba4b-6127a3b52b79")
    private void reconfigureFragments(ProjectDescriptor newDesc, SubProgress mon) {
        ProjectWriter dfact = new ProjectWriter(getProject());
        
        List<FragmentDescriptor> newFragments = new ArrayList<>( newDesc.getFragments());
        
        for (IProjectFragment f : this.project.getOwnFragments()) {
            boolean found = false;
            for (Iterator<FragmentDescriptor> it = newFragments.iterator(); it.hasNext() && !found;) {
                FragmentDescriptor fd = it.next();
                if (fd.getId().equals(f.getId()) && fd.getType().equals(f.getType())) {
                    found = true;
        
                    if (! dfact.writeFragmentDescriptor(f).equals(fd)) {
                        callReconfigureFragment(mon.newChild(10), f, fd);
                    }
        
                    it.remove();
                }
            }
        
            if (! found) {
                mon.subTask(CoreProject.getMessage("GProjectConfigurer.RemovingFragment",f.getId()));
                this.project.unregisterFragment(f);
                try {
                    mon.subTask(CoreProject.getMessage("GProjectConfigurer.DeletingFragment",f.getId()));
                    f.delete();
                } catch (IOException | RuntimeException e) {
                    this.failures.add(new Failure(null,f,e));
                }
            }
        }
        
        
        // Add new fragments
        for (FragmentDescriptor fd : newFragments) {
            IProjectFragment fragment = Fragments.getFactory(fd).instantiate(fd);
            mon.subTask(CoreProject.getMessage("GProjectConfigurer.AddingFragment",fd.getId()));
            try {
                this.project.registerFragment(fragment, mon.newChild(10));
            } catch (FragmentConflictException | RuntimeException e) {
                this.project.getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(e));
            }
        }
    }

    /**
     * Represents the failure of a module operation.
     */
    @objid ("49c099d0-c1f6-4746-8b05-12ae4cd6cdd4")
    public static class Failure {
        @objid ("2fd2395a-5cf0-46c8-adf0-844df7c293fd")
        private String source;

        @objid ("16f77fd4-79ec-4837-b886-67c937e29282")
        private Throwable cause;

        /**
         * Create a project synchronization failure.
         * @param cause the failure
         */
        @objid ("e2917e1e-41a4-488d-aad9-906be423298d")
        Failure(Throwable cause) {
            this.cause = cause;
        }

        /**
         * Create a module synchronization failure.
         * @param moduleDescriptor module descriptor
         * @param module a GModule
         * @param cause the failure
         */
        @objid ("814f883c-1dd2-4457-a383-060d5163ee0c")
        Failure(ModuleDescriptor moduleDescriptor, GModule module, Throwable cause) {
            this.cause = cause;
            this.source = computeSourceIdentifier(moduleDescriptor, module, null, null);
        }

        /**
         * @return the cause of the failure.
         */
        @objid ("d5f9d62f-98c2-44fd-9d54-5640f0d3ff1a")
        public Throwable getCause() {
            return this.cause;
        }

        @objid ("3e47560b-9e5c-4264-80aa-7c2dba722069")
        @Override
        public String toString() {
            String id = getSourceIdentifier();
            
            String msg = this.cause.getLocalizedMessage();
            if (this.cause instanceof IOException) {
                msg = FileUtils.getLocalizedMessage((IOException) this.cause);
            }
            
            if (msg == null || msg.isEmpty()) {
                msg = this.cause.toString();
            }
            return id + ": " + msg;
        }

        /**
         * Get an identifier for the failed element
         * @return a string
         */
        @objid ("8e564601-527a-4735-ac6c-b94ac4644925")
        public String getSourceIdentifier() {
            return this.source;
        }

        /**
         * Create a module synchronization failure.
         * @param source the failure source
         * @param cause the failure
         */
        @objid ("3a2a5179-12ef-4d15-a2c5-42db8f4f4146")
        public Failure(String source, Throwable cause) {
            this.cause = cause;
            this.source = source;
        }

        @objid ("4d2b24d8-4cdd-4aa5-8bf2-3f53cda3c08e")
        private String computeSourceIdentifier(ModuleDescriptor moduleDescriptor, GModule module, FragmentDescriptor fragmentDescriptor, IProjectFragment fragment) {
            String name = "?";
            String version = "?";
            String id = "Project";
            
            if (module != null) {
                name = module.getName();
                version = module.getVersion().toString();
                id = name+" v"+version;
            } else if (moduleDescriptor != null) {
                name = moduleDescriptor.getName();
                version = moduleDescriptor.getVersion().toString();
                id = name+" v"+version;
            } else if (fragment != null) {
                name = fragment.getId();
                id = name;
            } else if (fragmentDescriptor != null) {
                name = fragmentDescriptor.getId();
                id = name;
            }
            return id;
        }

        /**
         * Create a fragment synchronization failure.
         * @param fd fragment descriptor
         * @param f a fragment
         * @param cause the failure
         */
        @objid ("3f610ba3-2d64-4b43-909f-5a3317804a7e")
        Failure(FragmentDescriptor fd, IProjectFragment f, Throwable cause) {
            this.cause = cause;
            this.source = computeSourceIdentifier(null, null, fd, f);
        }

    }

    /**
     * Detail for a module to install/remove/update.
     */
    @objid ("f23595d2-e710-49ae-8ed3-23310ba619ef")
    private static class ModuleChange {
        @objid ("e93c6b8b-3b63-4147-886d-486502b1118c")
         ModuleDescriptor newDesc;

        @objid ("8b081b1d-9829-47c3-b826-f77907477005")
         GModule oldModule;

        @objid ("8fa8fde9-9eb6-4668-9a4c-0db51cea420c")
         IModuleHandle newHandle;

        /**
         * @param newDesc new module descriptor
         * @param oldModule old module
         * @param newHandle new module handle
         */
        @objid ("1313212f-7dc8-4df3-9d65-f9915a9f9fb0")
        ModuleChange(ModuleDescriptor newDesc, GModule oldModule, IModuleHandle newHandle) {
            super();
            this.newDesc = newDesc;
            this.oldModule = oldModule;
            this.newHandle = newHandle;
        }

    }

}
