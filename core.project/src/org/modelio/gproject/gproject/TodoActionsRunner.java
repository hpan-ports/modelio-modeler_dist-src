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
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.GAuthConf;
import org.modelio.gproject.data.project.GProperties;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.data.project.todo.InstallModuleDescriptor;
import org.modelio.gproject.data.project.todo.RemoveModuleDescriptor;
import org.modelio.gproject.data.project.todo.TodoActionDescriptor;
import org.modelio.gproject.data.project.todo.TodoDescriptor;
import org.modelio.gproject.data.project.todo.UpdateModuleDescriptor;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.net.UriPathAccess;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;

/**
 * Service to execute a {@link TodoDescriptor} on a {@link GProject}.
 * 
 * @since Modelio 3.4
 */
@objid ("b0456a4d-7b5e-41bc-a1fd-729576106f18")
public class TodoActionsRunner {
    @objid ("ee1a4da9-f7a2-4c29-bbbb-ef7223aebd5d")
    private List<Failure> failures = new ArrayList<>();

    @objid ("03fcf8d2-46f1-4621-a497-984e4038af90")
    private GProject project;

    /**
     * Initialize a project configurer with an open project
     * @param project an opened project.
     */
    @objid ("2472947b-a249-420d-949f-1716db09fdf5")
    public TodoActionsRunner(GProject project) {
        this.project = project;
    }

    /**
     * Execute the project to-do actions.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("c3db9b10-229a-46f8-ae63-4fe72faf9083")
    public void execute(IModelioProgress monitor) {
        List<TodoActionDescriptor> actions = this.project.getTodo().getActions();
        
        SubProgress mon = SubProgress.convert(monitor, actions.size());
        
        for (Iterator<TodoActionDescriptor> it = actions.iterator();
                it.hasNext();) {
            TodoActionDescriptor action = it.next();
            if (action instanceof InstallModuleDescriptor) {
                InstallModuleDescriptor desc = (InstallModuleDescriptor) action;
                if (callInstallModule(desc, mon.newChild(1))) {
                    it.remove();
                }
            } else if (action instanceof UpdateModuleDescriptor) {
                UpdateModuleDescriptor desc = (UpdateModuleDescriptor) action;
                if (callUpgradeModule(desc, mon.newChild(1))) {
                    it.remove();
                }
            } else if (action instanceof RemoveModuleDescriptor) {
                RemoveModuleDescriptor desc = (RemoveModuleDescriptor) action;
                if(callRemoveModule(desc, mon.newChild(1))) {
                    it.remove();
                }
        
            }
        }
    }

    /**
     * Get to actions execution failures.
     * @return execution failures.
     */
    @objid ("d4b53dad-014b-4a21-adad-5546d5679b8c")
    public List<Failure> getFailures() {
        return this.failures;
    }

    /**
     * @return the handled project
     */
    @objid ("31e21fd4-617e-4dc4-8b4b-fa2875e2b381")
    public GProject getProject() {
        return this.project;
    }

    @objid ("e9f68115-229b-4f49-be1b-d1655cd886cc")
    protected GModule getModule(String name) throws IOException {
        for (GModule gModule : this.project.getModules()) {
            if (gModule.getName().equals(name)) {
                return gModule;
            }
        }
        
        throw new IOException(String.format("No '%s' module in the project", name));
    }

    /**
     * Install a new module.
     * <p>
     * May be redefined.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @param md the new module descriptor.
     * @throws java.io.IOException in case of failure
     */
    @objid ("cf6db2cb-a424-499a-a716-a15e4d31a80a")
    protected void installModule(ModuleDescriptor md, IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 25);
        
        IAuthData authData = new AuthResolver(getProject()).resolve(md);
        try (UriPathAccess access = new UriPathAccess(md.getArchiveLocation(), authData)){
            // Install the module as if the user asked for it
            // The module may change some parameters on upgrade, they won't be lost.
            Path archivePath = access.getPath();
        
            IModuleHandle handle = this.project.getModuleCatalog().getModuleHandle(archivePath, mon.newChild(10));
        
            this.project.installModule(handle, md.getArchiveLocation(), mon.newChild(10));
        
            // Overwrite default module parameters with the server parameters
            // Note: 'm' is invalid after installModule(...)
            GModule newGModule = getModule(md.getName());
            reconfigureModule(newGModule, md, mon.newChild(5));
        }
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
    @objid ("2805553c-e7dd-48e2-8bb3-9cf5fadd2eaa")
    protected void reconfigureModule(GModule m, ModuleDescriptor desc, IModelioProgress mon) throws IOException {
        m.setScope(desc.getScope());
        
        if (m.getAuthData() == null) {
            m.setAuthData(GAuthConf.from(desc.getAuthDescriptor()));
        } else {
            m.getAuthData().reconfigure(desc.getAuthDescriptor());
        }
        
        GProperties myParameters = m.getParameters();
        GProperties descParams = desc.getParameters();
        
        for (GProperties.Entry theirParam : descParams.entries()) {
            final GProperties.Entry myParam = myParameters.getProperty(theirParam.getName());
            if (myParam == null || theirParam.getScope()==DefinitionScope.SHARED || myParam.getScope()==DefinitionScope.SHARED) {
                myParameters.setProperty(theirParam.getName(), theirParam.getValue(), theirParam.getScope());
            }
        }
        
        // Shared parameters that are not on the server anymore become local
        for (GProperties.Entry p : myParameters.entries()) {
            if (p.getScope()==DefinitionScope.SHARED && descParams.getProperty(p.getName()) == null) {
                p.setScope(DefinitionScope.LOCAL);
            }
        }
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
    @objid ("3c2e7adf-d545-4b59-a806-359cac491966")
    protected void removeModule(GModule m, IModelioProgress mon) throws IOException {
        this.project.removeModule(m);
    }

    /**
     * Update a module to another version.
     * <p>
     * May be redefined.
     * @param m the module to update
     * @param md the new module descriptor
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure
     */
    @objid ("59be1f0e-aac2-4d4b-8dd8-99fe120ccbba")
    protected void upgradeModule(GModule m, ModuleDescriptor md, IModelioProgress monitor) throws IOException {
        SubProgress mon = SubProgress.convert(monitor, 30);
        mon.subTask(CoreProject.getMessage("ProjectSynchro.updateModule",
                m.getName(), m.getVersion(), md.getVersion()));
        
        removeModule(m, mon.newChild(10));
        installModule(md, mon.newChild(10));
        
        reconfigureModule(m, md, mon.newChild(10));
    }

    /**
     * Record failure to synchronize a module.
     * @param moduleDescriptor a module descriptor if available
     * @param module the module if available
     * @param cause the error
     */
    @objid ("f8442abd-44fe-4eca-95ec-d9af05294ce9")
    private void addFailure(TodoActionDescriptor desc, Throwable cause) {
        Failure failure = new Failure(desc, cause);
        this.failures.add(failure);
    }

    @objid ("3cc8ca71-4bb9-465a-8387-604aca080f2f")
    private boolean callInstallModule(InstallModuleDescriptor desc, IModelioProgress mon) {
        ModuleDescriptor md = desc.getModuleDescriptor();
        
        try {
            installModule(md, mon);
            return true;
        } catch (IOException | RuntimeException e) {
            addFailure(desc, e);
            return false;
        }
    }

    @objid ("4b0bcc91-8910-4dee-ba93-1704198dac27")
    private boolean callReconfigureModule(UpdateModuleDescriptor desc, SubProgress mon) {
        GModule m = null;
        try {
            m = getModule(desc.getOldModuleName());
            reconfigureModule(m, desc.getNewModuleDescriptor(), mon);
            return true;
        } catch (IOException | RuntimeException e) {
            addFailure(desc, e);
            return false;
        }
    }

    @objid ("c1612e1a-a02b-4b5d-a127-8d30a71c632c")
    private boolean callRemoveModule(RemoveModuleDescriptor desc, SubProgress mon) {
        GModule m = null;
        try {
            m = getModule(desc.getModuleName());
            removeModule(m, mon);
            return true;
        } catch (IOException | RuntimeException e) {
            addFailure(desc, e);
            return false;
        }
    }

    @objid ("680cb347-9f31-495d-9609-d3065b7a5c37")
    private boolean callUpgradeModule(UpdateModuleDescriptor desc, IModelioProgress mon) {
        ModuleDescriptor fd = desc.getNewModuleDescriptor();
        GModule m = null;
        try {
            m = getModule(desc.getOldModuleName());
            upgradeModule(m, fd, mon);
            return true;
        } catch (IOException | RuntimeException e) {
            addFailure(desc, e);
            return false;
        }
    }

    /**
     * Action failure.
     */
    @objid ("f7f0b441-1990-492b-bdfa-eeb6d726919a")
    public static class Failure {
        @objid ("c16f8a3f-f28b-4497-98f7-64a0c166b0e8")
        private TodoActionDescriptor desc;

        @objid ("6977681b-71c4-4702-8f73-7e8830866cbf")
        private Throwable error;

        @objid ("63615304-f1e2-4ee0-9f8a-2a9f7592f639")
        Failure(TodoActionDescriptor desc, Throwable error) {
            super();
            this.desc = desc;
            this.error = error;
        }

        /**
         * @return the failed action
         */
        @objid ("3fe8a00b-c62c-4d31-bedb-bc98e57ab2ec")
        public TodoActionDescriptor getAction() {
            return this.desc;
        }

        /**
         * @return the failure cause
         */
        @objid ("cadb4321-789d-40a1-97ed-5642fef4c185")
        public Throwable getError() {
            return this.error;
        }

        @objid ("59a2cf75-8559-4b05-a584-9f217c38c3fc")
        @Override
        public String toString() {
            return this.desc.getLocalizedLabel()+" failed:"+this.error.toString();
        }

    }

}
