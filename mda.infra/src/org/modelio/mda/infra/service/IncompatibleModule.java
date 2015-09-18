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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.api.diagram.tools.IDiagramTool;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.module.ILicenseInfos.Status;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IModuleAPIConfiguration;
import org.modelio.api.module.IModuleSession;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.api.module.IParameterEditionModel;
import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.LicenseInfos;
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
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vbasic.version.Version;

/**
 * This class is instantiated when a module is not compatible with the current Modelio version.</br> It usually means a metamodel
 * too old, or newer than the current one.
 */
@objid ("b31f0c67-f11c-11e1-af52-001ec947c8cc")
class IncompatibleModule implements IRTModule {
    @objid ("b31f0c69-f11c-11e1-af52-001ec947c8cc")
    private IModuleSession moduleSession;

    @objid ("b31f0c6a-f11c-11e1-af52-001ec947c8cc")
    private IPeerModule peerModule;

    @objid ("b31f0c6b-f11c-11e1-af52-001ec947c8cc")
    private IModuleUserConfiguration moduleConfiguration;

    @objid ("b31f0c6c-f11c-11e1-af52-001ec947c8cc")
    protected IParameterEditionModel parameterEditionModel;

    @objid ("b31f0c6e-f11c-11e1-af52-001ec947c8cc")
    private GModule gmodule;

    @objid ("b6f596e1-004c-44fb-b6b9-a3c22be14380")
    private ModuleComponent moduleComponent;

    /**
     * Instantiate a fake module.
     * @param modelingSession a modeling session.
     * @param gmodule the module model element.
     * @param moduleUserConfiguration the user version of the module configuration
     * @param moduleApiConfiguration the api version of the module configuration
     */
    @objid ("b31f0c72-f11c-11e1-af52-001ec947c8cc")
    public IncompatibleModule(final IModelingSession modelingSession, final GModule gmodule, final IModuleUserConfiguration moduleUserConfiguration, final IModuleAPIConfiguration moduleApiConfiguration) {
        this.gmodule = gmodule;
        this.moduleComponent = gmodule.getModuleElement();
        this.moduleConfiguration = moduleUserConfiguration;
        this.moduleSession = new BrokenModuleSession(this);
        this.peerModule = new DefaultPeerModule(this.moduleComponent, moduleApiConfiguration);
    }

    /**
     * Get the configuration associated to this module.
     * 
     * Jxbv2Module configuration provide access to module parameter and resource paths
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("b31f0c7b-f11c-11e1-af52-001ec947c8cc")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.moduleConfiguration;
    }

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("b3216e7f-f11c-11e1-af52-001ec947c8cc")
    @Override
    public String getDescription() {
        return "Incompatible with current version of Modelio : " + getName() + " " + getVersion();
    }

    /**
     * Get the module label that is displayed in dialog boxes and other GUIU parts.
     * @return The module label.
     */
    @objid ("b3216e99-f11c-11e1-af52-001ec947c8cc")
    @Override
    public String getLabel() {
        try {
            ResourceBundle manifestBundle = this.getManifestBundle();
            if (manifestBundle != null) {
                return manifestBundle.getString("ModuleLabel");
            }
        } catch (MissingResourceException e) {
            MdaInfra.LOG.error(MdaInfra.PLUGIN_ID, this.getName() + " module: " + e.toString());
        }
        return this.getName();
    }

    /**
     * Returns the {@link ModuleComponent} model associated with this module.
     * @return the {@link ModuleComponent} model associated with this module.
     */
    @objid ("b3216ea4-f11c-11e1-af52-001ec947c8cc")
    @Override
    public ModuleComponent getModel() {
        return this.moduleComponent;
    }

    /**
     * Used to return the module name.
     * <p>
     * <p>
     * The module name corresponds to the name of the module, as defined in the <i>MDA Designer<i> tool.
     * @return The module name
     */
    @objid ("b3216eaa-f11c-11e1-af52-001ec947c8cc")
    @Override
    public String getName() {
        return this.moduleComponent.getName();
    }

    /**
     * Returns the peer module, connected to this module.
     * <p>
     * The peer module represents the public services of this current module.
     * @return The associated peer module
     */
    @objid ("b3216eb6-f11c-11e1-af52-001ec947c8cc")
    @Override
    public IPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Returns the session that is connected to the module.
     * <p>
     * <p>
     * The developer can:
     * <p>
     * 
     * <ul>
     * <li>return <code>this</code> and redefine all the operations directly in the module definition.</li>
     * <li>return an new instance of IModuleSession and implement all the needed operations.</li>
     * </ul>
     * @see IModuleSession
     * @return the session that is connected to the module
     */
    @objid ("b3216ebc-f11c-11e1-af52-001ec947c8cc")
    @Override
    public IModuleSession getSession() {
        return this.moduleSession;
    }

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("b3216ec2-f11c-11e1-af52-001ec947c8cc")
    @Override
    public Version getVersion() {
        return new Version(this.moduleComponent.getMajVersion() + "." + this.moduleComponent.getMinVersion() + "."
                                        + this.moduleComponent.getMinMinVersion());
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
    @objid ("b3216ec8-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void init() {
        // Nothing to do.
    }

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("b323d0d6-f11c-11e1-af52-001ec947c8cc")
    @Override
    public Collection<IModuleAction> getModuleActions(ActionLocation location) {
        return Collections.emptyList();
    }

    /**
     * Register a module action for the contextual popupmenu(s) of the application.
     * @param location The action insertion point in the popupmenu (see {@link ActionLocation})
     * @param action Action to store
     */
    @objid ("b323d0df-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void registerAction(ActionLocation location, IModuleAction action) {
        // Do nothing.
    }

    /**
     * Get the {@link ResourceBundle} corresponding to the localized manifest/manifest.properties file in the module resources.
     * @return the resource bundle
     * @throws java.util.MissingResourceException if the file is not found
     */
    @objid ("b323d0ed-f11c-11e1-af52-001ec947c8cc")
    private ResourceBundle getManifestBundle() throws MissingResourceException {
        final Path manifestDir = this.getConfiguration().getModuleResourcesPath();
        if (manifestDir != null) {
            try (final URLClassLoader cl = new URLClassLoader(new URL[] { manifestDir.toUri().toURL() })) {
                // Create a class loader initialized with the 'manifest' directory
                // in module resource,
                // then give it to ResourceBundle.getBundle(...)
                return ResourceBundle.getBundle("module", Locale.getDefault(), cl);
            } catch (MalformedURLException e) {
                throw new MissingResourceException(e.getLocalizedMessage(), "module", "");
            } catch (MissingResourceException e) {
                MissingResourceException e2 = new MissingResourceException(e.getLocalizedMessage() + " in '" + manifestDir.toUri()
                        + "'", e.getClassName(), e.getKey());
                e2.initCause(e);
                throw e2;
            } catch (IOException e) {
                MdaInfra.LOG.error(e);
            }
        }
        return null;
    }

    @objid ("b323d0f1-f11c-11e1-af52-001ec947c8cc")
    private boolean isStereotypeOwner(final Stereotype stereotype) {
        final Profile profile = stereotype.getOwner();
        if (profile != null) {
            ModuleComponent module = profile.getOwnerModule();
            if (module != null) {
                return module.equals(this.moduleComponent);
            } else {
                final ModelTree owner = profile.getOwner();
                return this.moduleComponent.equals(owner);
            }
        }
        return false;
    }

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("b323d100-f11c-11e1-af52-001ec947c8cc")
    @Override
    public List<IModuleAction> getActions(ActionLocation location) {
        return Collections.emptyList();
    }

    /**
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("b323d11d-f11c-11e1-af52-001ec947c8cc")
    @Override
    public ModuleRuntimeState getState() {
        return ModuleRuntimeState.Incompatible;
    }

    /**
     * Sets the runtime state of this module.
     * <p>
     * <em>This method is not meant to be called by clients. Use of this method can result in unspecified behaviours.</em>
     * </p>
     * @param runtimeState the new runtime state of this module.
     */
    @objid ("b323d123-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void setState(final ModuleRuntimeState runtimeState) {
        throw new UnsupportedOperationException(this.moduleComponent.getName()
                + ": runtime state of this module cannot be changed since it is incompatible with this version of Modelio");
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
    @objid ("b3263334-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void uninit() {
        // Nothing to do.
    }

    @objid ("999fbce5-178f-11e2-aa0d-002564c97630")
    @Override
    public final Image getModuleImage() {
        return null;
    }

    @objid ("5bd75a92-9528-441b-9583-dbd1df085035")
    @Override
    public List<DiagramToolDescriptor> getDiagramTools() {
        return Collections.emptyList();
    }

    @objid ("63d67f64-1d09-4fbb-a8ab-60574ed4132e")
    @Override
    public List<DiagramCustomizationDescriptor> getDiagramCustomizations() {
        return Collections.emptyList();
    }

    @objid ("9af4e771-e83b-4058-91e4-fed4bd42e457")
    @Override
    public void registerCustomizedTool(String id, IDiagramTool diagramCommand) {
        // not defined for incompatible modules
    }

    @objid ("c37dc2a6-c339-4b48-9b9f-9e7c6ca220f1")
    @Override
    public void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer) {
        // not defined for incompatible modules
    }

    @objid ("baab6ed8-1444-4cdc-813a-6a88e9ef8979")
    @Override
    public String getLabel(String key) {
        return key;
    }

    @objid ("a16af633-2c8e-4203-a4fc-51e1a0c2b882")
    @Override
    public LicenseInfos getLicenseInfos() {
        return new LicenseInfos(Status.UNDEFINED, null, "");
    }

    @objid ("69dd482a-c8e3-4fa6-aa67-47c1037b62df")
    @Override
    public <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs) {
        return null;
    }

    @objid ("a0fe5450-9b6e-4d3a-8978-4bd18bbb4fae")
    @Override
    public List<WizardContribution> getDiagramWizardContributions() {
        return Collections.emptyList();
    }

    @objid ("937d4edc-f35f-44a0-b5ec-1bf8aaca8efe")
    @Override
    public void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        // Nothing to do
    }

    @objid ("1951b07c-d819-4242-829d-14654433d355")
    @Override
    public void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        // Nothing to do
    }

    @objid ("a0185889-15be-4b81-b6e5-e566a6dc3752")
    @Override
    public Collection<IModulePropertyPanel> getPropertyPanels() {
        return Collections.emptyList();
    }

    @objid ("d0bb7608-1d21-44c3-81bb-9d480fb0ea21")
    @Override
    public IModule getIModule() {
        return new BrokenIModule(this);
    }

    @objid ("19dacf7a-d5ef-47b7-918d-96b584c76323")
    @Override
    public String getModuleImagePath() {
        return null;
    }

    @objid ("120193b0-06e4-44d4-a03a-5cdfefdbbd92")
    @Override
    public ModuleException getDownError() {
        return new ModuleException(getDescription());
    }

    @objid ("3b036229-7322-456b-bed3-05dbc56b45ce")
    @Override
    public GModule getGModule() {
        return this.gmodule;
    }

}
