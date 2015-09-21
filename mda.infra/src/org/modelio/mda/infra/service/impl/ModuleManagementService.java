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


package org.modelio.mda.infra.service.impl;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.ModuleException;
import org.modelio.app.core.IModelioEventService;
import org.modelio.app.core.IModelioService;
import org.modelio.app.core.ModelioEnv;
import org.modelio.app.core.events.ModelioEvent;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.gproject.data.project.GProperties.Entry;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.IModuleCache;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.ModuleSorter;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.AbstractIRTModuleListener;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.mda.infra.service.IModuleRegistry;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.mda.infra.service.IRTModuleListener;
import org.modelio.mda.infra.service.UnknownModuleException;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.collections.TopologicalSorter.CyclicDependencyException;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.net.UriPathAccess;
import org.modelio.vbasic.progress.NullProgress;

/**
 * Module services.
 */
@objid ("8dd0dee5-f1b7-11e1-af52-001ec947c8cc")
@Creatable
public class ModuleManagementService implements IModuleManagementService {
    @objid ("ca5e85e3-0c73-11e2-a703-001ec947c8cc")
    @Inject
    @Optional
    private ModelioEnv env;

    @objid ("0996ff85-73ef-4e69-8cac-750f8353272c")
    private ManagerModuleListener eventFirer;

    @objid ("877d9db1-0e30-11e2-baba-001ec947c8cc")
    @Inject
    @Optional
    private IMModelServices mModelServices;

    @objid ("2a611be9-f348-11e1-9458-001ec947c8cc")
    @Inject
    @Optional
    private IModelioEventService modelioEventService;

    @objid ("ff9c9181-da55-4e7a-a451-5004f40ccf05")
    @Inject
    @Optional
    private IModuleCache moduleCache;

    @objid ("495b93d1-f2b5-11e1-af52-001ec947c8cc")
    private IModuleRegistryAccess moduleRegistry = new ModuleRegistry();

    @objid ("2bb63eee-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public void activateModule(GModule gModule) throws ModuleException {
        IRTModule rtModule = getIRTModule(gModule);
        
        rtModule.getController().activate();
    }

    @objid ("2bb63ef2-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public void deactivateModule(GModule gModule) throws ModuleException {
        IRTModule rtModule = getIRTModule(gModule);
        
        rtModule.getController().deactivate();
    }

    @objid ("4d2b74de-1390-4a06-beae-8fe3d8508d04")
    @Override
    public IRTModule getIRTModule(GModule gModule) {
        return getModuleRegistry().getModule(gModule);
    }

    @objid ("2bb63ef6-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public IModuleRegistry getModuleRegistry() {
        return this.moduleRegistry;
    }

    @objid ("008f6d9e-96dd-103f-87fd-001ec947cd2a")
    @Override
    public String getName() {
        return "ModuleManagementService";
    }

    @objid ("2bb63ed3-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public <T extends IPeerModule> T getPeerModule(Class<T> metaclass) throws UnknownModuleException {
        try {
            for (IRTModule module : this.moduleRegistry.getStartedModules()) {
                IPeerModule peerModule = module.getPeerModule();
                String metaclassInterfaceName = metaclass.getCanonicalName();
                Class<? extends IPeerModule> peerModuleClass = peerModule.getClass();
                for (Class<?> interf : peerModuleClass.getInterfaces()) {
                    String interfName = interf.getCanonicalName();
                    if (interfName.equals(metaclassInterfaceName)) {
                        return metaclass.cast(peerModule);
                    }
                }
            }
        } catch (ClassCastException e) {
            MdaInfra.LOG.error(e);
        }
        throw new UnknownModuleException(
                String.format( "The '%s' class is not kwown as a Java module." , metaclass.getName())
                );
    }

    @objid ("2bb63ee9-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public void installModule(GProject gProject, URI moduleUri, IAuthData authData) throws ModuleException {
        try (UriPathAccess access = new UriPathAccess(moduleUri, authData)){
            Path archivePath = access.getPath();
        
            this.installModule(gProject, archivePath, moduleUri);
        } catch (IOException e) {
            throw new ModuleException(FileUtils.getLocalizedMessage(e), e);
        }
    }

    @objid ("961eaa7b-0a72-446d-a252-417ecd3c17a5")
    @Override
    public void installModule(GProject gProject, Path moduleFilePath) throws ModuleException {
        installModule(gProject, moduleFilePath, moduleFilePath.toUri());
    }

    @objid ("b60fdf1c-0d64-11e2-ae8f-002564c97630")
    @Override
    public void removeModule(GModule gModule) throws ModuleException {
        getIRTModule(gModule).getController().removeFromProject(true);
    }

    @objid ("2bb63edc-f1ed-11e1-af52-001ec947c8cc")
    @SuppressWarnings("deprecation")
    @Override
    public void startAllModules(GProject gProject, final IProgressMonitor aMonitor) {
        SubMonitor progress = SubMonitor.convert(aMonitor);
        List<GModule> gModules = gProject.getModules();
        progress.setWorkRemaining(gModules.size());
        
        // Sort the module list by start order
        List<GModule> sortedModules = getSortedModules(gModules);
        
        // Load all modules, but start only activated modules.
        for (GModule gModule : sortedModules) {
            try {
                // Load the module
                IRTModule rtModule = this.moduleRegistry.loadRTModule( gModule);
                rtModule.getListeners().add(this.eventFirer);
        
                // If the module has the property "SELECT_ON_OPEN", consider it's a first install
                final Entry toSelect = gModule.getParameters().getProperty(GModule.SELECT_ON_OPEN);
                if (toSelect != null && toSelect.getValue().equals("true")) {
                    // It's a first install : install, activate and start
                    rtModule.getController().install();
        
                    // Remove the property, next time it will be a simple start
                    gModule.getParameters().remove(GModule.SELECT_ON_OPEN);
                } else if (gModule.isActivated()) {
                    // Start the module
                    progress.subTask(MdaInfra.I18N.getMessage("ModuleStartProgress.Starting", rtModule.getLabel(),
                            rtModule.getVersion().toString()));
        
                    rtModule.getController().start();
                }
            } catch (ModuleException e) {
                MdaInfra.LOG.warning("%s v%s module start failed : %s", gModule.getName(), gModule.getVersion(), e.getLocalizedMessage());
                MdaInfra.LOG.debug(e);
            } catch (RuntimeException | LinkageError e) {
                MdaInfra.LOG.error("%s v%s module start unexpected error : %s", gModule.getName(), gModule.getVersion(), e.toString());
                MdaInfra.LOG.error(e);
            }
            progress.worked(1);
        
        }
        progress.done();
    }

    @objid ("2bb63ee1-f1ed-11e1-af52-001ec947c8cc")
    @Override
    public void stopAllModules(GProject project) {
        // Unload modules in any order : closeModule() will unload dependencies first.
        for (IRTModule module : new ArrayList<>(getModuleRegistry().getModules())) {
            closeModule(module);
        }
    }

    @objid ("b5a61523-1207-11e2-8ab5-001ec947c8cc")
    @Inject
    @Optional
    @SuppressWarnings("unused")
    void onProjectClosed(@EventTopic(ModelioEventTopics.PROJECT_CLOSED) GProject gProject, IEclipseContext context) {
        // The current project has been closed, remove this instance from the context
        // until another project is opened.
        context.remove(IModuleManagementService.class);
        
        // dispose the module registry and create a new one.
        this.moduleRegistry.dispose();
        this.moduleRegistry = new ModuleRegistry();
        
        this.eventFirer = null;
    }

    @objid ("b5a6151d-1207-11e2-8ab5-001ec947c8cc")
    @Inject
    @Optional
    void onProjectOpening(@EventTopic(ModelioEventTopics.PROJECT_OPENING) GProject gProject, IEclipseContext context) {
        // A project is being opened, put this instance in the context so it can be used
        // to manipulate modules on the current project.
        context.set(IModuleManagementService.class, this);
        
        this.moduleRegistry.setProjectName(gProject.getName());
        
        this.eventFirer = new ManagerModuleListener(this.modelioEventService, this, this.moduleRegistry);
    }

    /**
     * Unload definitively a module beginning by modules depending on him.
     * @param module the module to unload.
     */
    @objid ("050708da-7140-4e40-b847-497d6a674dda")
    private void closeModule(IRTModule module) {
        try {
            // Stop dependent modules first
            for (IRTModule m : module.getModuleUsers()) {
                closeModule(m);
            }
            for (IRTModule m : module.getModuleOptionalUsers()) {
                closeModule(m);
            }
        
            module.getController().close();
        } catch (ModuleException | RuntimeException | LinkageError e) {
            MdaInfra.LOG.warning("'"+module.getName()+"' module does not want to close:");
            MdaInfra.LOG.warning(e);
        }
    }

    /**
     * Sort the module list by start order.
     * @param gModules a module list
     * @return the sorted list
     */
    @objid ("13acb1e6-ab67-4456-853e-401c51d4c810")
    private List<GModule> getSortedModules(List<GModule> gModules) {
        List<GModule> sortedModules;
        try {
            sortedModules = ModuleSorter.sortModules(gModules);
        } catch (CyclicDependencyException e) {
            MdaInfra.LOG.error(e);
            // Try to remove cycle and sort again
            Collection<GModule> cycle = e.getCycle();
            sortedModules = new ArrayList<>(gModules);
            sortedModules.removeAll(cycle);
            try {
                sortedModules = ModuleSorter.sortModules(gModules);
                // Append cycle at first position
                sortedModules.addAll(0, cycle);
            } catch (CyclicDependencyException e2) {
                // Return original list as last resort.
                sortedModules = gModules;
            }
        }
        return sortedModules;
    }

    @objid ("c73d0384-ced7-40fa-a066-b7c60c83b87d")
    private void installModule(GProject gProject, Path moduleFilePath, URI origUri) throws ModuleException {
        GModule newGModule = null;
        try {
            IModuleHandle rtModuleHandle = this.moduleCache.getModuleHandle(moduleFilePath, null);
            // Is module in the cache?
            if (rtModuleHandle == null) {
                throw new ModuleException(MdaInfra.I18N.getMessage("ModuleExceptionMessage.InvalidArchivePath", moduleFilePath.toString()));
            }
        
            // Are dependencies missing or incompatible?
            ModuleResolutionHelper.checkCanInstall(rtModuleHandle, gProject) ;
        
        
            // Determine whether it is a first deployment or it is an upgrade.
            // For this, we have to look for the old module.
            GModule previouslyInstalledGModule = ModuleResolutionHelper.getGModuleByHandle(gProject, rtModuleHandle);
            if (previouslyInstalledGModule == null) {
                // Install the GModule in the GProject
                NullProgress monitor = new NullProgress(); // TODO have a progress monitor as parameter
                newGModule = gProject.installModule(rtModuleHandle, origUri, monitor);
        
                // Instantiate a RTModule
                IRTModule rt = this.moduleRegistry.loadRTModule(newGModule);
                boolean ok = false;
                try {
        
                    // Install, activate and start
                    rt.getListeners().add(this.eventFirer);
                    rt.getController().install();
                    ok = true;
                } finally {
                    if (! ok) {
                        // Uninstall the GModule
                        gProject.removeModule(newGModule);
        
                        // Unregister the module registered by loadModule()
                        this.moduleRegistry.removeModule(rt);
                    }
                }
        
            } else {
                // Update existing module
                IRTModule startedOldModule = getModuleRegistry().getModule(previouslyInstalledGModule);
        
                startedOldModule.getController().updateTo(rtModuleHandle, moduleFilePath);
        
                newGModule = startedOldModule.getGModule();
            }
        
            if (newGModule != null) {
                //Note 08/04/2015: this event is not used
                this.modelioEventService.postSyncEvent(this, ModelioEvent.MODULE_DEPLOYED, newGModule);
            }
        } catch (IOException e) {
            throw new ModuleException(MdaInfra.I18N.getMessage(
                    "ModuleExceptionMessage.CannotInstallModule",
                    FileUtils.getLocalizedMessage(e)), e);
        }
    }

    /**
     * {@link IRTModuleListener} put on all modules to:
     * <ul>
     * <li> fire matching events in {@link IModelioEventService}.
     * <li> update the module registry
     * </ul>
     */
    @objid ("c8933b50-72a5-4f2a-95e2-d939d2e0c555")
    static class ManagerModuleListener extends AbstractIRTModuleListener {
        @objid ("1ec8b1d5-8823-4321-ba3c-e6ef71bb305d")
        private IModelioEventService modelioEventService;

        @objid ("449e5f30-ddb6-4b7f-8897-c8eddf506e4f")
        private IModelioService svc;

        @objid ("929dfc59-f10d-4420-b1da-590dfdc514d5")
        private IModuleRegistryAccess registry;

        @objid ("80cdb293-d5b0-4049-8a21-55868df62944")
        public ManagerModuleListener(IModelioEventService modelioEventService, IModelioService svc, IModuleRegistryAccess registry) {
            super();
            this.modelioEventService = modelioEventService;
            this.svc = svc;
            this.registry = registry;
        }

        @objid ("9746356e-40fa-4903-b565-e2286c9b3793")
        @Override
        public void moduleStarted(IRTModule module) {
            this.registry.addStartedModule(module);
            this.modelioEventService.postSyncEvent(this.svc, ModelioEvent.MODULE_STARTED, module);
        }

        @objid ("15d214dc-5a51-4efd-ac17-1e0d65243498")
        @Override
        public void moduleStopping(IRTModule module) {
            this.registry.removeStartedModule(module);
            this.modelioEventService.postSyncEvent(this.svc, ModelioEvent.MODULE_STOPPED, module);
        }

        @objid ("0ee6579a-656a-4041-aa67-0dbaceb275db")
        @Override
        public void moduleLoaded(IRTModule module) {
            this.registry.addModule(module);
        }

        @objid ("0d6324df-9fbd-4ce2-8dd9-1c83298d2794")
        @Override
        public void moduleRemoved(IRTModule module) {
            this.registry.removeModule(module);
            this.modelioEventService.postSyncEvent(this.svc, ModelioEvent.MODULE_REMOVED, module);
        }

    }

}
