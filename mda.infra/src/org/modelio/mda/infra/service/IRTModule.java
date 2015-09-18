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

import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.api.diagram.tools.IDiagramTool;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vbasic.version.Version;

/**
 * Represents the runtime module .
 * <p>
 * This is a decorator around the {@link IModule} module main class.
 */
@objid ("0b2b294b-5b6b-4f97-a949-d55206272bc7")
public interface IRTModule {
    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("45f7535b-65cd-11e0-b0ca-001ec947cd2a")
    List<IModuleAction> getActions(ActionLocation location);

    /**
     * Get all defined diagram custommizations.
     * @return the toolIds.
     * @since 2.2.1
     */
    @objid ("e2451778-d148-4ae8-a844-4b8f1d595e29")
    List<DiagramCustomizationDescriptor> getDiagramCustomizations();

    /**
     * Get all defined diagram tools.
     * @return the toolIds.
     * @since 2.2.1
     */
    @objid ("95bb2bb4-dcc8-440e-97e6-142a6ef06048")
    List<DiagramToolDescriptor> getDiagramTools();

    @objid ("6311e30d-8d61-45f4-9d7e-5d56b94c942d")
    List<WizardContribution> getDiagramWizardContributions();

    /**
     * Returns the collection of {@link IModuleAction} associated with passed location.
     * @param location the location for which actions are to be returned.
     * @return the collection of {@link IModuleAction} associated with passed location.
     */
    @objid ("45f75357-65cd-11e0-b0ca-001ec947cd2a")
    Collection<IModuleAction> getModuleActions(ActionLocation location);

    /**
     * Return the defined property panels
     * @return The collection of property panels
     */
    @objid ("a2f280ad-c994-4ef4-9234-81df89611597")
    Collection<IModulePropertyPanel> getPropertyPanels();

    /**
     * Register a module action for the contextual popupmenu(s) of the application.
     * @param location The action insertion point in the popupmenu (see {@link ActionLocation})
     * @param action Action to store
     */
    @objid ("45f75359-65cd-11e0-b0ca-001ec947cd2a")
    void registerAction(ActionLocation location, IModuleAction action);

    /**
     * Register a new palette Tool.<br>
     * @see IDiagramTool
     * @param id the tool id
     * @param diagramCommand The tool behavior.
     * @since 3.3.0
     */
    @objid ("ce3b3659-a28b-49e2-a537-68e57028b324")
    void registerCustomizedTool(String id, IDiagramTool diagramCommand);

    /**
     * Register a customizer for a stereotyped diagram.
     * @param stereotype the diagram stereotype which the customizer is intended for
     * @param baseDiagramClass the base diagram editor to customize
     * @param customizer the customizer implementation
     * @since 2.2.1
     */
    @objid ("8aa419b1-2030-4444-9e9b-423219fec74a")
    void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer);

    @objid ("d6afacce-53ab-44f2-903c-a62e32bc8fd9")
    void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor);

    @objid ("bc5436a9-9dbd-4d67-87b4-b4a90dc2f387")
    void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor);

    /**
     * Instantiate a matrix external processor.
     * @param <I> the required type
     * @param className the full class name
     * @param clazz the required type ?
     * @param initargs the constructor arguments
     * @return the processor instance
     */
    @objid ("4b8ff81b-0d93-4388-87e9-1a8cbf5fbf9c")
    <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs);

    /**
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("0cf32e9f-99de-11e1-b1e0-001ec947c8cc")
    ModuleRuntimeState getState();

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("b397dcbe-a57c-4095-94d7-2b9b613d8c72")
    String getDescription();

    /**
     * Get the module label that is displayed in dialog boxes and other GUIU parts.
     * @return The module label.
     */
    @objid ("8f4d773e-0420-400a-bb63-880b45b3960e")
    String getLabel();

    /**
     * Used to return the module name.
     * <p>
     * <p>
     * The module name corresponds to the name of the module, as defined in the <i>MDA Designer<i> tool.
     * @return The module name
     */
    @objid ("7d59d674-06e9-406c-8f08-77593db693ac")
    String getName();

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("702796b6-c0a8-48da-922a-4ae0f2eddf24")
    Version getVersion();

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
    @objid ("080724f7-eb2b-41e0-8a8e-d27388ab86e1")
    void init();

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
    @objid ("b0863a5a-d6fe-4941-875e-d8e1317ab3c8")
    void uninit();

    @objid ("3761bc04-1bb6-4087-85f1-5455ca11b347")
    ILicenseInfos getLicenseInfos();

    /**
     * Get the configuration associated to this module.
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("287cc5f6-be23-48cf-96f2-bdb2dd36c745")
    IModuleUserConfiguration getConfiguration();

    @objid ("8b0813ff-3522-4a23-8ea3-5ebe8c9bb78a")
    IModuleSession getSession();

    /**
     * @return the wrapped module main class instance.
     */
    @objid ("39a44507-1601-4f58-82a4-5e17390511e6")
    IModule getIModule();

    @objid ("0c2059ab-950c-4748-ac39-1aa22871c0e2")
    String getLabel(String id);

    @objid ("ba1f2e26-3707-47b0-b6e3-684327e132d9")
    Image getModuleImage();

    @objid ("1dc73620-2192-42c8-8bf3-55679e491c72")
    ModuleComponent getModel();

    @objid ("c15b86d3-254b-4b42-a0e0-004911e12ebc")
    IPeerModule getPeerModule();

    @objid ("0840206c-36d7-4dd4-a8be-a1dcdc40c8e3")
    void setState(ModuleRuntimeState newState);

    @objid ("8317e6d2-2f1e-4556-9614-bd17a40c26c6")
    String getModuleImagePath();

    /**
     * For a broken or incompatible module, returns the exception that caused the module loading fail.
     * <p>
     * The exception message is expected to be directly displayed to the user.
     * So the message has to be translated and as user friendly as possible
     * @return the break cause or null if the module is not broken.
     */
    @objid ("3f78af6e-4413-4c46-a57c-405019f10862")
    ModuleException getDownError();

    /**
     * Get the low level module.
     * @return the GModule
     */
    @objid ("c95df398-87c6-43b6-afcf-8243bf63092e")
    GModule getGModule();

}
