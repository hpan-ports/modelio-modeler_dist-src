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
                                    

package org.modelio.mda.infra.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.help.internal.HelpPlugin;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.api.diagram.tools.IDiagramTool;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.ILicenseInfos;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IModuleSession;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.ModuleException;
import org.modelio.api.module.commands.ActionLocation;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.api.module.contrib.WizardContribution;
import org.modelio.api.module.propertiesPage.IModulePropertyPanel;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.gproject.module.GModule;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vbasic.version.Version;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

@objid ("bb7d18a6-71bf-4d80-a7b1-9c20a9e7e37f")
class RTModule implements IRTModule {
    @objid ("550670e9-032a-11e2-9fca-001ec947c8cc")
    private List<Bundle> docBundles = new ArrayList<>();

    /**
     * Runtime state, defaults to loaded.
     */
    @objid ("02a8d537-99e0-11e1-b1e0-001ec947c8cc")
    private ModuleRuntimeState runtimeState = ModuleRuntimeState.Loaded;

    @objid ("b78d572d-0e9d-11e0-8636-001ec947cd2a")
    private final Map<ActionLocation, List<IModuleAction>> actionsRegistry;

    @objid ("2faae81d-5aea-4757-96f2-640170b13a48")
    public List<DiagramToolDescriptor> diagramTools = new ArrayList<>();

    @objid ("883deeea-dc80-464c-b27e-21304e6c1835")
    private List<DiagramCustomizationDescriptor> diagramCustomizations = new ArrayList<>();

    @objid ("14877ba4-3d14-436f-8deb-29cb8f09957c")
    private List<WizardContribution> wizardContributions = new ArrayList<>();

    @objid ("39a165df-929a-4ac1-b125-3e4c3ea47620")
    protected List<IModulePropertyPanel> propertyPanels = new ArrayList<>();

    @objid ("9913e429-1db4-4660-9a29-d1585057b984")
    private IModule iModule;

    @objid ("40b66137-2252-4d3c-95ac-cb4511cf84fa")
    private IModuleSession moduleSession;

    @objid ("89a3d21e-4579-46f6-8623-310d0240c0c9")
    private GModule gmodule;

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("b7921bd8-0e9d-11e0-8636-001ec947cd2a")
    @Override
    public List<IModuleAction> getActions(ActionLocation location) {
        if (this.actionsRegistry.containsKey(location))
            return this.actionsRegistry.get(location);
        else
            return Collections.emptyList();
    }

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("a0457016-479d-11df-a533-001ec947ccaf")
    @Override
    @Deprecated
    public Collection<IModuleAction> getModuleActions(ActionLocation location) {
        return getActions(location);
    }

    /**
     * Register a module action for the contextual popupmenu(s) of the application.
     * @param location The action insertion point in the popupmenu (see {@link ActionLocation})
     * @param action Action to store
     */
    @objid ("a047d2c5-479d-11df-a533-001ec947ccaf")
    @Override
    public void registerAction(ActionLocation location, IModuleAction action) {
        List<IModuleAction> actionsList = this.actionsRegistry.get(location);
        // Register the command in the moduleActions registry
        actionsList.add(action);
    }

    @objid ("aa1fa07b-3f01-49f9-9138-33d937183699")
    @Override
    public final void registerCustomizedTool(String id, IDiagramTool diagramCommand) {
        this.diagramTools.add(new DiagramToolDescriptor(id, diagramCommand));
    }

    @objid ("f3dfe929-371b-4cce-bcd1-9d42ae8d4b4a")
    @Override
    public final void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer) {
        this.diagramCustomizations.add(new DiagramCustomizationDescriptor(stereotype, baseDiagramClass, customizer));
    }

    @objid ("3291a949-c2d8-43af-9e8e-1f99b12d1240")
    @Override
    @SuppressWarnings("unchecked")
    public <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs) {
        try {
            // Look for a standard class
            Class<I> cls = (Class<I>) Class.forName(className, true, this.getIModule().getClass().getClassLoader());
        
            Class<?>[] initargsTypes = new Class[initargs.length];
            for (int i = 0; i < initargs.length; i++) {
                initargsTypes[i] = initargs[i].getClass();
            }
        
            Constructor<?> constr = cls.getConstructors()[0];
            return (I) constr.newInstance(initargs);
        } catch (ClassNotFoundException | ClassCastException | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            MdaInfra.LOG.warning(e.toString());
        }
        return null;
    }

    @objid ("930fd91e-ce1a-416e-beca-3937c613b26a")
    private void installDocs() {
        for (Path docFile : this.iModule.getConfiguration().getDocpath()) {
            try {
                BundleContext bundleContext = InternalPlatform.getDefault().getBundleContext();
        
                Bundle bundleDoc = bundleContext.installBundle("reference:file:/" + docFile);
                bundleDoc.start(Bundle.START_TRANSIENT);
        
                this.docBundles.add(bundleDoc);
        
            } catch (Exception e) { // Ignore
                // Doc DuplicateBundleException: doc already installed
                if (!e.getClass().getSimpleName().equals("DuplicateBundleException")) {
                    MdaInfra.LOG.warning(e.toString());
                }
            }
        }
        
        // Force the help to reload
        if (!this.docBundles.isEmpty()) {
            HelpPlugin.getTocManager().clearCache();
        }
    }

    @objid ("d43767a1-8219-4723-9d5e-56155bec0751")
    private void installStyles() {
        for (Entry<String, Path> style : this.iModule.getConfiguration().getStylePath().entrySet()) {
            try {
                if (Files.exists(style.getValue())) {
                    Modelio.getInstance().getDiagramService().registerStyle(style.getKey(), "default", style.getValue().toFile());
                }
            } catch (Exception e) { // Ignore
                // Doc DuplicateBundleException: doc already installed
                if (!e.getClass().getSimpleName().equals("DuplicateBundleException")) {
                    MdaInfra.LOG.warning(e.toString());
                }
            }
        }
    }

    @objid ("f22df734-674d-43b6-858d-12e0d2990f78")
    protected void uninstallDocs() {
        if (!this.docBundles.isEmpty()) {
            for (Bundle bundleDoc : this.docBundles) {
                try {
                    bundleDoc.stop();
                    bundleDoc.uninstall();
                } catch (BundleException e) {
                    MdaInfra.LOG.warning(e.toString());
                }
            }
        
            // Empty the local bundle cache this.docBundles.clear();
        
            // Force the help to reload
            HelpPlugin.getTocManager().clearCache();
        }
    }

    @objid ("b300704c-a26a-4940-b32f-ff9dae0dd308")
    @Override
    public void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        this.wizardContributions.add(new WizardContribution(category, contributor));
    }

    @objid ("6132acde-d1ed-4257-8b90-b77e8eb16a73")
    @Override
    public void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        this.wizardContributions.remove(new WizardContribution(category, contributor));
    }

    @objid ("6656d131-48a5-4cc6-ad9e-c5fb969aaaf0")
    @Override
    public List<WizardContribution> getDiagramWizardContributions() {
        return this.wizardContributions;
    }

    /**
     * Return the defined property panels
     * @return The collection of property panels
     */
    @objid ("c0e4c841-da08-40ff-9f85-5ca1dad1423c")
    @Override
    public List<IModulePropertyPanel> getPropertyPanels() {
        return this.propertyPanels;
    }

    /**
     * Get ids of all defined diagram tools.
     * @return the toolIds.
     */
    @objid ("762d4fa9-9dc4-42bd-93cd-a16d6c7562c6")
    @Override
    public final List<DiagramToolDescriptor> getDiagramTools() {
        return this.diagramTools;
    }

    @objid ("b84b3e8b-6e3f-4f65-8494-8ee3c15ca3ae")
    @Override
    public final List<DiagramCustomizationDescriptor> getDiagramCustomizations() {
        return this.diagramCustomizations;
    }

    /**
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("0236648a-99e0-11e1-b1e0-001ec947c8cc")
    @Override
    public ModuleRuntimeState getState() {
        return this.runtimeState;
    }

    /**
     * Sets the runtime state of this module.
     * <p>
     * <em>This method is not meant to be called by clients. Use of this method can result in unspecified behaviours.</em>
     * </p>
     * @param runtimeState the new runtime state of this module.
     */
    @objid ("02366491-99e0-11e1-b1e0-001ec947c8cc")
    @Override
    public void setState(final ModuleRuntimeState runtimeState) {
        this.runtimeState = runtimeState;
    }

    /**
     * Method automatically called just after the creation of the module.
     * <p>
     * <p>
     * 
     * The module is automatically instantiated at the beginning of the mda lifecycle and the constructor implementation is not
     * accessible to the module developer.
     * <p>
     * <p>
     * 
     * The <code>init</code> method allows the developer to execute the desired initialization code at this step. For example, this
     * is the perfect place to register any IViewpoint this module provides.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("a047d2c4-479d-11df-a533-001ec947ccaf")
    @Override
    public void init() {
        this.iModule.init();
        installDocs();
        installStyles();
    }

    /**
     * Method automatically called just before the disposal of the module.
     * <p>
     * <p>
     * 
     * 
     * The <code>uninit</code> method allows the developer to execute the desired un-initialization code at this step. For example,
     * if IViewpoints have been registered in the {@link #init()} method, this method is the perfect place to remove them.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("08fa08b1-a354-11e1-abf7-001ec947c8cc")
    @Override
    public void uninit() {
        uninstallDocs();
        this.iModule.uninit();
    }

    @objid ("6a8d552f-e55f-4b45-9ee4-c3eaa092f085")
    public RTModule(IModule iModule, GModule gmodule) {
        this.iModule = iModule;
        this.gmodule = gmodule;
        this.moduleSession = new RTModuleSession(this);
        // Initialize the moduleActions collections.
        this.actionsRegistry = new HashMap<>();
        this.actionsRegistry.put(ActionLocation.menu, new ArrayList<IModuleAction>());
        this.actionsRegistry.put(ActionLocation.toolbar, new ArrayList<IModuleAction>());
        this.actionsRegistry.put(ActionLocation.property, new ArrayList<IModuleAction>());
        this.actionsRegistry.put(ActionLocation.contextualpopup, new ArrayList<IModuleAction>());
        this.actionsRegistry.put(ActionLocation.diagramtoolbar, new ArrayList<IModuleAction>());
    }

    @objid ("bb8632e0-0621-4ea9-b388-18b29a8fcb86")
    @Override
    public String getName() {
        return this.iModule.getName();
    }

    @objid ("e41220e2-e736-4a10-9c7c-78182bd2dfc9")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.iModule.getConfiguration();
    }

    @objid ("23189bec-c7f1-43a3-860d-0e8e1b1f7ac4")
    @Override
    public String getDescription() {
        return this.iModule.getDescription();
    }

    @objid ("b3d5ba33-36b5-4bd2-8263-d237ef5cb9c1")
    @Override
    public String getLabel() {
        return this.iModule.getLabel();
    }

    @objid ("48233090-ef38-45dd-860d-763dedeb3b59")
    @Override
    public Version getVersion() {
        return this.iModule.getVersion();
    }

    @objid ("1b5d19d7-6649-49ee-9295-e532458505d3")
    @Override
    public ILicenseInfos getLicenseInfos() {
        return this.iModule.getLicenseInfos();
    }

    @objid ("6623aff6-4621-485c-abc8-7db39fd118b6")
    @Override
    public IModuleSession getSession() {
        return this.moduleSession;
    }

    @objid ("0054f7dd-81cb-4c95-84c5-d413f8d270e4")
    @Override
    public IModule getIModule() {
        return this.iModule;
    }

    @objid ("67b2d2bb-fe9e-4a26-82f4-7119072cbe90")
    @Override
    public String getLabel(String key) {
        return this.iModule.getLabel(key);
    }

    @objid ("a17f0429-d185-40ca-82a6-e4a20f054aef")
    @Override
    public Image getModuleImage() {
        return this.iModule.getModuleImage();
    }

    @objid ("24d5834f-5e92-488a-8bcd-0a5fd6e68093")
    @Override
    public ModuleComponent getModel() {
        return this.iModule.getModel();
    }

    @objid ("1ca9b27c-05d2-4af0-a3af-26771b437445")
    @Override
    public IPeerModule getPeerModule() {
        return this.iModule.getPeerModule();
    }

    @objid ("ec9c27ad-5be0-4b52-9482-3ce6cfe93026")
    @Override
    public String getModuleImagePath() {
        return this.iModule.getModuleImagePath();
    }

    @objid ("5c3d05be-599c-4cf6-a41b-84939c8ef4e9")
    @Override
    public ModuleException getDownError() {
        return null;
    }

    @objid ("f5ddea42-fc9d-46a5-b4cc-bdf77844d736")
    @Override
    public GModule getGModule() {
        return this.gmodule;
    }

}
