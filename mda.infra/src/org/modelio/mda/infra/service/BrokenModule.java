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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vbasic.version.Version;

/**
 * This class is instantiated when a module is incomplete:
 * <ul>
 * <li>main Java class cannot be loaded or instantiated for any reason.</li>
 * <li>module component is missing.</li>
 * </ul>
 */
@objid ("55ed822f-2f2d-11e2-8f16-002564c97630")
public class BrokenModule implements IRTModule {
    @objid ("8d85794d-2f2d-11e2-8f16-002564c97630")
    private String moduleName;

    @objid ("8d79928b-2f2d-11e2-8f16-002564c97630")
    private IModuleSession moduleSession;

    @objid ("8d79928c-2f2d-11e2-8f16-002564c97630")
    private IPeerModule peerModule;

    @objid ("8d79928d-2f2d-11e2-8f16-002564c97630")
    private IModuleUserConfiguration moduleConfiguration;

    @objid ("8d79928e-2f2d-11e2-8f16-002564c97630")
    protected IParameterEditionModel parameterEditionModel;

    @objid ("8d799290-2f2d-11e2-8f16-002564c97630")
    private Version moduleVersion;

    /**
     * Broken cause.
     */
    @objid ("428811bb-6fe4-40fc-a0a8-cffb893f24c6")
    private ModuleException cause;

    @objid ("e811795f-aece-446c-a648-ae3dcc48c450")
    private GModule gmodule;

    /**
     * Instantiate a fake module. the module configuration
     * @param modelingSession a modeling session.
     * @param gmodule the GModule
     * @param moduleUserConfiguration the user version of the module configuration
     * @param moduleApiConfiguration the api version of the module configuration
     * @param cause the cause of the module failure.
     */
    @objid ("8d799291-2f2d-11e2-8f16-002564c97630")
    public BrokenModule(final IModelingSession modelingSession, GModule gmodule, final IModuleUserConfiguration moduleUserConfiguration, final IModuleAPIConfiguration moduleApiConfiguration, ModuleException cause) {
        this.gmodule = gmodule;
        this.moduleName = gmodule.getName();
        this.moduleVersion = gmodule.getVersion();
        this.moduleConfiguration = moduleUserConfiguration;
        this.moduleSession = new BrokenModuleSession(this);
        this.peerModule = new BrokenPeerModule(this.moduleName, this.moduleVersion, moduleApiConfiguration);
        
        this.cause = cause;
    }

    @objid ("8d79929d-2f2d-11e2-8f16-002564c97630")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.moduleConfiguration;
    }

    /**
     * Build a description from the module name, version and failure cause.
     */
    @objid ("8d7bf3cb-2f2d-11e2-8f16-002564c97630")
    @Override
    public String getDescription() {
        final StringWriter sw = new StringWriter();
        final PrintWriter sb = new PrintWriter(sw);
        
        String scause = this.cause.getLocalizedMessage(); 
        sb.println(MdaInfra.I18N.getMessage("BrokenModule.desc", this.moduleName, this.moduleVersion, scause));
        
        if (this.cause != null) {
            sb.println(MdaInfra.I18N.getMessage("BrokenModule.cause"));
            sb.println();
            this.cause.printStackTrace(sb);
        }
        return sw.toString();
    }

    @objid ("8d7bf3de-2f2d-11e2-8f16-002564c97630")
    @Override
    public String getLabel() {
        return this.getName();
    }

    @objid ("8d7bf3e4-2f2d-11e2-8f16-002564c97630")
    @Override
    public ModuleComponent getModel() {
        return null;
    }

    @objid ("8d7bf3ea-2f2d-11e2-8f16-002564c97630")
    @Override
    public String getName() {
        return this.moduleName;
    }

    /**
     * Returns the peer module, connected to this module.
     * <p>
     * The peer module represents the public services of this current module.
     * @return The associated peer module
     */
    @objid ("8d7bf3f6-2f2d-11e2-8f16-002564c97630")
    @Override
    public IPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Returns the session that is connected to the module.
     * <p>
     * The developer can:
     * <ul>
     * <li>return <code>this</code> and redefine all the operations directly in the module definition.</li>
     * <li>return an instance of IModuleSession and implement all the needed operations.</li>
     * </ul>
     * @see IModuleSession
     * @return the session that is connected to the module
     */
    @objid ("8d7bf3fc-2f2d-11e2-8f16-002564c97630")
    @Override
    public IModuleSession getSession() {
        return this.moduleSession;
    }

    @objid ("8d7e5527-2f2d-11e2-8f16-002564c97630")
    @Override
    public Version getVersion() {
        return this.moduleVersion;
    }

    @objid ("8d7e552d-2f2d-11e2-8f16-002564c97630")
    @Override
    public void init() {
        // Nothing to do.
    }

    @objid ("8d7e5537-2f2d-11e2-8f16-002564c97630")
    @Override
    public Collection<IModuleAction> getModuleActions(ActionLocation location) {
        return Collections.emptyList();
    }

    @objid ("8d7e5540-2f2d-11e2-8f16-002564c97630")
    @Override
    public void registerAction(ActionLocation location, IModuleAction action) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("8d7e5546-2f2d-11e2-8f16-002564c97630")
    @Override
    public List<IModuleAction> getActions(ActionLocation location) {
        return Collections.emptyList();
    }

    /**
     * Returns current runtime state of this module.
     * @return the current runtime state of this module.
     */
    @objid ("8d7e5563-2f2d-11e2-8f16-002564c97630")
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
    @objid ("8d7e5569-2f2d-11e2-8f16-002564c97630")
    @Override
    public void setState(final ModuleRuntimeState runtimeState) {
        throw new UnsupportedOperationException(this.moduleName
                + ": runtime state of this module cannot be changed since it is broken.",getDownError());
    }

    @objid ("8d7e556e-2f2d-11e2-8f16-002564c97630")
    @Override
    public void uninit() {
        // Nothing to do.
    }

    @objid ("8d7e5572-2f2d-11e2-8f16-002564c97630")
    @Override
    public Image getModuleImage() {
        return null;
    }

    @objid ("b20e07ea-7964-4246-a269-910f0462ac91")
    @Override
    public List<DiagramToolDescriptor> getDiagramTools() {
        return Collections.emptyList();
    }

    @objid ("2b370b80-d4e5-4b78-85d2-f6891189ce0e")
    @Override
    public List<DiagramCustomizationDescriptor> getDiagramCustomizations() {
        return Collections.emptyList();
    }

    @objid ("96162d4e-16cf-425d-b203-d71f36e60b2e")
    @Override
    public void registerCustomizedTool(String id, IDiagramTool diagramCommand) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("48c7c719-127e-4366-b4a1-8866388d2250")
    @Override
    public void registerDiagramCustomization(Stereotype stereotype, Class<? extends AbstractDiagram> baseDiagramClass, IDiagramCustomizer customizer) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("e818050b-7c1b-4404-8ed6-587e11bc6959")
    @Override
    public String getLabel(String key) {
        return key;
    }

    @objid ("173d5386-8def-43d2-88ed-e606700709b6")
    @Override
    public LicenseInfos getLicenseInfos() {
        return new LicenseInfos(Status.UNDEFINED, null, "");
    }

    @objid ("58ff62c5-fc6c-49ab-9058-5bd45e585968")
    @Override
    public <I> I instanciateExternProcessor(String className, Class<I> clazz, Object... initargs) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("e1f84c7a-f9cc-408e-90a8-c3d6dafa1615")
    @Override
    public List<WizardContribution> getDiagramWizardContributions() {
        return Collections.emptyList();
    }

    @objid ("5c5026e7-eb82-4da1-b2c7-c02d0eafa0da")
    @Override
    public void registerDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("60192a53-93ae-4d38-8df9-708fe7510b81")
    @Override
    public void unregisterDiagramWizardContribution(ContributorCategory category, IDiagramWizardContributor contributor) {
        throw new UnsupportedOperationException(getDownError());
    }

    @objid ("42807927-83ff-4a84-8a81-42cc89019595")
    @Override
    public Collection<IModulePropertyPanel> getPropertyPanels() {
        return Collections.emptyList();
    }

    @objid ("b4601bec-fed4-4a4b-b423-96c15ea352a5")
    @Override
    public IModule getIModule() {
        return new BrokenIModule(this);
    }

    @objid ("e8d39e41-54e4-491d-af38-54c3be6bee47")
    @Override
    public String getModuleImagePath() {
        return null;
    }

    @objid ("de21128b-1225-4e82-bbfd-d00c0b30673f")
    @Override
    public ModuleException getDownError() {
        return this.cause;
    }

    @objid ("be3d4111-cd80-4f82-aa52-120829547814")
    @Override
    public GModule getGModule() {
        return this.gmodule;
    }

}
