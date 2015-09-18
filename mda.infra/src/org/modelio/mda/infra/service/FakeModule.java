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
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
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
 * This class represents special modules that just contains extensions. LocalModule is a FakeModule.
 */
@objid ("b317e521-f11c-11e1-af52-001ec947c8cc")
public class FakeModule implements IRTModule {
    @objid ("b317e523-f11c-11e1-af52-001ec947c8cc")
    private IModuleSession moduleSession;

    @objid ("b317e524-f11c-11e1-af52-001ec947c8cc")
    private IPeerModule peerModule;

    @objid ("b317e525-f11c-11e1-af52-001ec947c8cc")
    private IModuleUserConfiguration moduleConfiguration;

    @objid ("b317e526-f11c-11e1-af52-001ec947c8cc")
    protected IParameterEditionModel parameterEditionModel;

    @objid ("b317e528-f11c-11e1-af52-001ec947c8cc")
    private ModuleComponent moduleComponent;

    @objid ("8d6a9729-03e6-11e2-8e1f-001ec947c8cc")
    private ImageRegistry imageRegistry;

    @objid ("df9b4dec-7ba5-4f81-bbcc-4d657141a38c")
    private GModule gmodule;

    /**
     * Instantiate a fake module.
     * @param modelingSession a modeling session.
     * @param gmodule the low level module.
     * @param moduleUserConfiguration the user version of the module configuration
     * @param moduleApiConfiguration the api version of the module configuration
     */
    @objid ("b317e52b-f11c-11e1-af52-001ec947c8cc")
    public FakeModule(IModelingSession modelingSession, GModule gmodule, IModuleUserConfiguration moduleUserConfiguration, IModuleAPIConfiguration moduleApiConfiguration) {
        this.gmodule = gmodule;
        this.moduleComponent = gmodule.getModuleElement();
        this.moduleConfiguration = moduleUserConfiguration;
        this.moduleSession = new RTModuleSession(this);
        this.peerModule = new DefaultPeerModule(this.moduleComponent, moduleApiConfiguration);
        
        Display.getDefault().syncExec(new Runnable() {
            @SuppressWarnings("synthetic-access")
            @Override
            public void run() {
                FakeModule.this.imageRegistry = new ImageRegistry();
            }
        });
    }

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("b317e531-f11c-11e1-af52-001ec947c8cc")
    @Override
    public List<IModuleAction> getActions(ActionLocation location) {
        return Collections.emptyList();
    }

    /**
     * Get the configuration associated to this module.
     * 
     * Jxbv2Module configuration provide access to module parameter and resource paths
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("b317e53a-f11c-11e1-af52-001ec947c8cc")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.moduleConfiguration;
    }

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("b317e540-f11c-11e1-af52-001ec947c8cc")
    @Override
    public String getDescription() {
        try {
            return this.getManifestBundle().getString("ModuleDescription");
        } catch (MissingResourceException e) {
            MdaInfra.LOG.warning(MdaInfra.PLUGIN_ID, this.getName() + " module: " + e.toString());
            return "";
        }
    }

    /**
     * Get the module label that is displayed in dialog boxes and other GUIU parts.
     * @return The module label.
     */
    @objid ("b317e559-f11c-11e1-af52-001ec947c8cc")
    @Override
    public String getLabel() {
        try {
            return this.getManifestBundle().getString("ModuleLabel");
        } catch (MissingResourceException e) {
            MdaInfra.LOG.error(MdaInfra.PLUGIN_ID, this.getName() + " module: " + e.toString());
            return this.getName();
        }
    }

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("b317e55e-f11c-11e1-af52-001ec947c8cc")
    @Override
    public Collection<IModuleAction> getModuleActions(ActionLocation location) {
        return Collections.emptyList();
    }

    /**
     * Always returns null.
     * @return an Jxbv2Image for this module.
     */
    @objid ("b317e567-f11c-11e1-af52-001ec947c8cc")
    @Override
    public Image getModuleImage() {
        return null;
    }

    /**
     * Returns the {@link ModuleComponent} model associated with this module.
     * @return the {@link ModuleComponent} model associated with this module.
     */
    @objid ("b31a4776-f11c-11e1-af52-001ec947c8cc")
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
    @objid ("b31a4782-f11c-11e1-af52-001ec947c8cc")
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
    @objid ("b31a478e-f11c-11e1-af52-001ec947c8cc")
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
    @objid ("b31a47a2-f11c-11e1-af52-001ec947c8cc")
    @Override
    public IModuleSession getSession() {
        return this.moduleSession;
    }

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("b31a47a8-f11c-11e1-af52-001ec947c8cc")
    @Override
    public Version getVersion() {
        return new Version(0, 0, 0, 0);
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
    @objid ("b31a47b7-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void init() {
        // Nothing to do.
    }

    /**
     * Register a module action for the contextual popupmenu(s) of the application.
     * @param location The action insertion point in the popupmenu (see {@link ActionLocation})
     * @param action Action to store
     */
    @objid ("b31a47bb-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void registerAction(ActionLocation location, IModuleAction action) {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the {@link ResourceBundle} corresponding to the localized manifest/manifest.properties file in the module resources.
     * @return the resource bundle
     * @throws java.util.MissingResourceException if the file is not found
     */
    @objid ("b31ca9cd-f11c-11e1-af52-001ec947c8cc")
    private ResourceBundle getManifestBundle() throws MissingResourceException {
        final Path manifestDir = this.getConfiguration().getModuleResourcesPath();
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
        return null;
    }

    @objid ("b31ca9d1-f11c-11e1-af52-001ec947c8cc")
    private boolean isStereotypeOwner(Stereotype stereotype) {
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
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("b31ca9d6-f11c-11e1-af52-001ec947c8cc")
    @Override
    public ModuleRuntimeState getState() {
        return ModuleRuntimeState.Started;
    }

    /**
     * Sets the runtime state of this module.
     * <p>
     * <em>This method is not meant to be called by clients. Use of this method can result in unspecified behaviors.</em>
     * </p>
     * @param runtimeState the new runtime state of this module.
     */
    @objid ("b31ca9dc-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void setState(final ModuleRuntimeState runtimeState) {
        // do nothing
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
    @objid ("b31ca9e1-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void uninit() {
        // Nothing to do.
    }

    @objid ("3d7b844d-b393-44f5-ab81-53f1ab98c59e")
    @Override
    public List<DiagramToolDescriptor> getDiagramTools() {
        return Collections.emptyList();
    }

    @objid ("31417efe-8b98-43e1-b88d-e8e285f7a809")
    @Override
    public List<DiagramCustomizationDescriptor> getDiagramCustomizations() {
        return Collections.emptyList();
    }

    @objid ("621ca5a8-ac69-41b5-8dfb-9da097200776")
    @Override
    public void registerCustomizedTool(String id, IDiagramTool diagramCommand) {
        // not defined for fake modules
    }

    @objid ("826feab8-ad79-4610-b8c4-d4ec211cc557")
    @Override
    public void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer) {
        // not defined for fake modules
    }

    @objid ("0ece6228-caed-4b9c-acf4-b47bc5785f07")
    @Override
    public String getLabel(String key) {
        return key;
    }

    @objid ("4e7caa03-87cc-47b7-bb2e-0bd4564efc72")
    @Override
    public LicenseInfos getLicenseInfos() {
        return new LicenseInfos(Status.UNDEFINED, null, "");
    }

    @objid ("62c88539-71ba-4cd2-b31d-53e4e778e3e5")
    @Override
    public <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs) {
        return null;
    }

    @objid ("80b9d88a-648e-4310-b32e-ed7727b6b2f7")
    @Override
    public List<WizardContribution> getDiagramWizardContributions() {
        return Collections.emptyList();
    }

    @objid ("2aa0fc02-1ae5-43be-abfb-19f79b95560f")
    @Override
    public void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        // Nothing to do
    }

    @objid ("38cd6ebc-001d-43f5-abcd-2969d1501866")
    @Override
    public void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        // Nothing to do
    }

    @objid ("c5b7a9d3-52f3-4cc1-9d44-ae43e90cd6ef")
    @Override
    public Collection<IModulePropertyPanel> getPropertyPanels() {
        return Collections.emptyList();
    }

    @objid ("490bb9a5-3d32-4232-9b7b-605b8a93682a")
    @Override
    public IModule getIModule() {
        return null;
    }

    @objid ("735d5918-d254-4f33-b24a-6bb51badf83d")
    @Override
    public String getModuleImagePath() {
        return null;
    }

    @objid ("34dd04b4-852e-4c4b-a31c-db60037d2875")
    @Override
    public ModuleException getDownError() {
        return null;
    }

    @objid ("233d6a13-8f44-4cfd-a7ba-6d036eaacf3a")
    @Override
    public GModule getGModule() {
        return this.gmodule;
    }

}
