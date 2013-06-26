/*
 * Copyright 2013 Modeliosoft
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
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.descriptor.DescriptorServices;
import org.modelio.gproject.descriptor.FragmentDescriptor;
import org.modelio.gproject.descriptor.GProperties.Entry;
import org.modelio.gproject.descriptor.GProperties;
import org.modelio.gproject.descriptor.ModuleDescriptor;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.descriptor.ProjectWriter;
import org.modelio.gproject.fragment.Fragments;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.remote.GRemoteProject;
import org.modelio.gproject.module.GModule;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

/**
 * Reconfigure an opened project with a new project descriptor.
 * <p>
 * This class will be redefined in GUI plugins to update the modules.
 */
@objid ("ec2c8fb7-cc48-46d2-82ee-fe56b40646ce")
public class GProjectConfigurer {
    @objid ("1d3e1140-30aa-43c0-b311-4d317632b27f")
    private GProject project;

    @objid ("009e7105-8a6c-48ba-bb6d-d1f0826d6a1d")
    private List<Failure> failures = new ArrayList<>();

    /**
     * Initialize a project configurer with an open project
     * @param project an opened project.
     */
    @objid ("59b929ba-abcb-4e5c-8ffa-c9ed636e1d07")
    public GProjectConfigurer(GProject project) {
        this.project = project;
    }

    /**
     * @return the configured project.
     */
    @objid ("0eedda80-36d2-49cb-9fb3-0e57bbad694a")
    public GProject getProject() {
        return this.project;
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
     * Tells whether the project configuration is different than the given configuration.
     * @param serverDesc a server project configuration
     * @return <code>true</code> if the project configuration is different.
     */
    @objid ("9fe74f75-ee6a-4de6-b76b-625124f78bce")
    public boolean needsReconfiguration(ProjectDescriptor serverDesc) {
        ProjectDescriptor currentDesc = new ProjectWriter().write(this.project);
        DescriptorServices.removeLocalPart(currentDesc);
        return ! serverDesc.equals(currentDesc);
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
        
        if (! this.project.getType().toString().equals(newDesc.getType())) {
            // different type, this is a different project.
            throw new IllegalArgumentException(this+" incompatible with "+ newDesc.getType());
        }
        
        this.project.reconfigureProperties(newDesc.getProperties(), mon.newChild(10));
        
        //TODO I don't know what to do if project login changes.
        boolean authChanged = this.project.getAuthConfiguration().reconfigure(newDesc.getAuthDescriptor());
        
        // Modules
        List<ModuleDescriptor> newModules = new ArrayList<>( newDesc.getModules());
        for (GModule m : new ArrayList<>(this.project.getModules())) {
            boolean found = false;
            for (Iterator<ModuleDescriptor> it = newModules.iterator(); it.hasNext() && !found;) {
                ModuleDescriptor fd = it.next();
                if (fd.getName().equals(m.getName())) {
                    found = true;
                    if (fd.getVersion().equals(m.getVersion())) {
                        // Same version, just update parameters
                        callReconfigureModule(m, fd, mon.newChild(10));
                    } else {
                        // Another version
                        callUpgradeModule(m, fd, mon.newChild(10));
                    }
                    it.remove();
                }
            }
            
            if (! found) {
                callRemoveModule(m, mon.newChild(10));
            }
        }
        
        for (ModuleDescriptor fd : newModules) {
            callInstallModule(fd, mon.newChild(10));
        }
        
        
        // Fragments
        List<FragmentDescriptor> newFragments = new ArrayList<>( newDesc.getFragments());
        
        for (IProjectFragment f : new ArrayList<>(this.project.getOwnFragments())) {
            boolean found = false;
            for (Iterator<FragmentDescriptor> it = newFragments.iterator(); it.hasNext() && !found;) {
                FragmentDescriptor fd = it.next();
                if (fd.getId().equals(f.getId()) && fd.getType().equals(f.getType())) {
                    found = true;
                    callReconfigureFragment(mon.newChild(10), f, fd);
                    it.remove();
                }
            }
            
            if (! found) {
                mon.subTask("Removing "+f.getId()+" fragment...");
                this.project.unregisterFragment(f);
            }
        }
        
        // Add new fragments
        for (FragmentDescriptor fd : newFragments) {
            IProjectFragment fragment = Fragments.getFactory(fd).instantiate(fd);
            mon.subTask("Adding "+fd.getId()+" fragment...");
            this.project.registerFragment(fragment, mon.newChild(10));
        }
        
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
            String title = "Synchronizing "+getProject().getName()+" ...";
            
            SubProgress mon = SubProgress.convert(monitor, title, 1000);
            
            GRemoteProject rp = (GRemoteProject) getProject();
            
            ProjectDescriptor newDesc = new ProjectWriter().write(rp);
            IAuthData authData  = rp.getAuthConfiguration().getAuthData();
            ProjectDescriptor newServerDesc = GProjectFactory.getRemoteDescriptor(newDesc, authData, mon.newChild(100));
            
            if (needsReconfiguration(newServerDesc)) {
                
                DescriptorServices.removeSharedPart(newDesc);
                //DescriptorServices.resolveUris(newDesc, getProjectDataPath().toUri()); 
                DescriptorServices.merge(newServerDesc, newDesc);
                newDesc.cleanup();
        
                this.reconfigure(newDesc, mon.newChild(950));
                getProject().save(mon.newChild(50));
                return true;
            }
        }
        return false;
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
        this.project.loadModuleDescriptor(mon, fd);
    }

    /**
     * Update a module to another version.
     * <p>
     * May be redefined.
     * @param m the module to update
     * @param fd the new module descriptor
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("f7e455f8-2eed-4888-b017-baaa46ffb9c5")
    protected void upgradeModule(GModule m, ModuleDescriptor fd, IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 30);
        removeModule(m, mon.newChild(10));
        installModule(fd, mon.newChild(10));
        
        reconfigureModule(m, fd, mon.newChild(10));
    }

    /**
     * Uninstall a module.
     * <p>
     * To be redefined to add other behavior.
     * @param m the module to remove.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("27503c90-5d40-4bbf-a76d-02a69d9db936")
    protected void removeModule(GModule m, IModelioProgress mon) throws IOException {
        this.project.removeModule(m);
    }

    /**
     * Default implementation replaces current parameters with the news.
     * <p>
     * To be redefined for a better behavior.
     * @param m the module to update
     * @param fd the new module parameters.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("5b042a6f-1415-4f2c-95ce-7010b25d1e09")
    protected void reconfigureModule(GModule m, ModuleDescriptor fd, IModelioProgress mon) throws IOException {
        m.setScope(fd.getScope());
        
        m.getAuthData().reconfigure(fd.getAuthDescriptor());
        
        GProperties parameters = m.getParameters();
        parameters.entries().clear();
        for (Entry p : fd.getParameters().entries()) {
            parameters.setProperty(p.getName(), p.getValue(), p.getScope());
        }
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
        
        GProjectEvent ev = new GProjectEvent();
        ev.message = failure.toString();
        ev.throwable = cause;
        ev.type = GProjectEventType.WARNING;
        this.project.getMonitorSupport().fireMonitors(ev);
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

    @objid ("61098f30-1054-4e06-9088-15b447fa0ba8")
    private void callReconfigureFragment(SubProgress mon, IProjectFragment f, FragmentDescriptor fd) {
        mon.subTask("Synchronizing "+f.getId()+" ...");
        
        try {
            f.reconfigure(fd, mon);
        } catch (Exception e) {
            addFailure(f, fd, e);
        }
    }

    @objid ("cd5fa51e-1823-463d-abdb-e133715bcdc7")
    private void callRemoveModule(GModule m, SubProgress mon) {
        mon.subTask("Removing "+m.getName()+" "+m.getVersion()+"...");
        
        try {
            removeModule(m, mon);
        } catch (IOException e) {
            addFailure(null, m, e);
        }
    }

    @objid ("fff74949-a51e-4e31-a32a-3886cf44e49e")
    private void callReconfigureModule(GModule m, ModuleDescriptor fd, SubProgress mon) {
        try {
            reconfigureModule(m, fd, mon);
        } catch (IOException e) {
            addFailure(fd, m, e);
        }
    }

    @objid ("289fd0a5-9690-48cf-8e1b-80aac5a6c6a7")
    private void callInstallModule(ModuleDescriptor fd, IModelioProgress mon) {
        mon.subTask("Installing "+fd.getName()+" "+fd.getVersion()+"...");
        
        try {
            installModule(fd, mon);
        } catch (IOException e) {
            addFailure(fd, null, e);
        }
    }

    @objid ("0d2ee5da-eb51-44c0-b4a7-80b839df1679")
    private void callUpgradeModule(GModule m, ModuleDescriptor fd, IModelioProgress mon) {
        try {
            upgradeModule(m, fd, mon);
        } catch (IOException e) {
            addFailure(fd, m, e);
        }
    }

    /**
     * Represents the failure of a module operation.
     */
    @objid ("49c099d0-c1f6-4746-8b05-12ae4cd6cdd4")
    public static class Failure {
        @objid ("dbc6c1bf-4a8b-4c14-9235-e441214e4f28")
        private ModuleDescriptor moduleDescriptor;

        @objid ("ddf9b0ab-e22a-4538-8d26-a4162dab289c")
        private GModule module;

        @objid ("435b6dda-cfcd-4db4-b93b-f6e526478b0e")
        private FragmentDescriptor fragmentDescriptor;

        @objid ("7be4fa17-0868-4df5-9d04-02ee46a42933")
        private IProjectFragment fragment;

        @objid ("16f77fd4-79ec-4837-b886-67c937e29282")
        private Throwable cause;

        @objid ("e2917e1e-41a4-488d-aad9-906be423298d")
        Failure(ModuleDescriptor moduleDescriptor, GModule module, Throwable cause) {
            this.module = module;
            this.moduleDescriptor = moduleDescriptor;
            this.cause = cause;
        }

        @objid ("814f883c-1dd2-4457-a383-060d5163ee0c")
        Failure(FragmentDescriptor fd, IProjectFragment f, Throwable cause) {
            this.fragment = f;
            this.fragmentDescriptor = fd;
            this.cause = cause;
        }

        /**
         * @return the module that couldn't be removed or updated.
         */
        @objid ("c9e53646-0fee-4f57-aa47-f750d94d957d")
        public GModule getModule() {
            return this.module;
        }

        /**
         * @return the descriptor of the moduel that couldn't be added or updated.
         */
        @objid ("6106295f-61b3-43c0-9cc6-4b067e46bf49")
        public ModuleDescriptor getModuleDescriptor() {
            return this.moduleDescriptor;
        }

        /**
         * @return the cause of the failure.
         */
        @objid ("d5f9d62f-98c2-44fd-9d54-5640f0d3ff1a")
        public Throwable getCause() {
            return this.cause;
        }

        /**
         * @return the failed fragment
         */
        @objid ("844bb24b-f36e-4569-8dc4-4a5756ad22c4")
        public IProjectFragment getFragment() {
            return this.fragment;
        }

        /**
         * @return the descriptor of the failed fragment
         */
        @objid ("5bb4005c-1a7c-4ad9-aa5b-de2afec43d92")
        public FragmentDescriptor getFragmentDescriptor() {
            return this.fragmentDescriptor;
        }

        @objid ("3e47560b-9e5c-4264-80aa-7c2dba722069")
        @Override
        public String toString() {
            String id = getSourceIdentifier();
            
            String msg = this.cause.getLocalizedMessage();
            if (this.cause instanceof FileSystemException)
                msg = FileUtils.getLocalizedMessage((FileSystemException) this.cause);
            
            if (msg == null || msg.isEmpty())
                msg = this.cause.toString();
            return id + ": " + msg;
        }

        /**
         * Get an identifier for the failed element
         * @return a string
         */
        @objid ("8e564601-527a-4735-ac6c-b94ac4644925")
        public String getSourceIdentifier() {
            String name = "?";
            String version = "?";
            String id = "?";
            
            if (this.module != null) {
                name = this.module.getName();
                version = this.module.getVersion().toString();
                id = name+" v"+version;
            } else if (this.moduleDescriptor != null) {
                name = this.moduleDescriptor.getName();
                version = this.moduleDescriptor.getVersion().toString();
                id = name+" v"+version;
            } else if (this.fragment != null) {
                name = this.fragment.getId();
                id = name;
            } else if (this.fragmentDescriptor != null) {
                name = this.fragmentDescriptor.getId();
                id = name;
            }
            return id;
        }

    }

}
