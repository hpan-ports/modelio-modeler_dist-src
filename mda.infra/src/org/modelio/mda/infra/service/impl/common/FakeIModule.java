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


package org.modelio.mda.infra.service.impl.common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.script.ScriptEngine;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
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
import org.modelio.gproject.module.GModule;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vbasic.version.Version;

/**
 * This class represents special modules that just contains extensions or not yet loaded modules.
 * <p>
 * LocalModule was a FakeModule.
 */
@objid ("b317e521-f11c-11e1-af52-001ec947c8cc")
public class FakeIModule implements IModule {
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

    @objid ("df9b4dec-7ba5-4f81-bbcc-4d657141a38c")
    private GModule gmodule;

    @objid ("bdbc6e3b-68d2-45b2-ba3d-217f5adee3ac")
    private IModelingSession modelingSession;

    @objid ("d57c21c6-6536-48a0-837f-ff4a3a2d75ad")
    private ResourceBundle manifestBundle;

    /**
     * Instantiate a fake module.
     * @param modelingSession a modeling session.
     * @param gmodule the low level module.
     * @param moduleUserConfiguration the user version of the module configuration
     * @param moduleApiConfiguration the api version of the module configuration
     */
    @objid ("b317e52b-f11c-11e1-af52-001ec947c8cc")
    public FakeIModule(IModelingSession modelingSession, GModule gmodule, IModuleUserConfiguration moduleUserConfiguration, IModuleAPIConfiguration moduleApiConfiguration) {
        this.modelingSession = modelingSession;
        this.gmodule = gmodule;
        this.moduleComponent = gmodule.getModuleElement();
        this.moduleConfiguration = moduleUserConfiguration;
        this.moduleSession = new IModuleSession() {
        
            @Override
            public void upgrade(Version oldVersion, Map<String, String> oldParameters)
                    throws ModuleException {
                // noop
            }
        
            @Override
            public void unselect() throws ModuleException {
                // noop
            }
        
            @Override
            public void stop() throws ModuleException {
                // noop
            }
        
            @Override
            public boolean start() throws ModuleException {
                // no problem
                return true;
            }
        
            @Override
            public boolean select() throws ModuleException {
                // no problem
                return true;
            }
        };
        
        this.peerModule = new DefaultPeerModule(this.moduleComponent, moduleApiConfiguration);
    }

    /**
     * Get the configuration associated to this module.
     * 
     * Module configuration provide access to module parameter and resource paths
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
            return getManifestBundle().getString("ModuleDescription");
        } catch (MissingResourceException e) {
            MdaInfra.LOG.debug("%s module: %s",getName(), e.toString());
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
            return getManifestBundle().getString("ModuleLabel");
        } catch (MissingResourceException e) {
            MdaInfra.LOG.debug("%s module: %s",getName(), e.toString());
            return getName();
        }
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
        return this.gmodule.getName();
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
        return this.gmodule.getVersion();
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
     * Get the {@link ResourceBundle} corresponding to the localized manifest/manifest.properties file in the module resources.
     * @return the resource bundle
     * @throws java.util.MissingResourceException if the file is not found
     */
    @objid ("b31ca9cd-f11c-11e1-af52-001ec947c8cc")
    private ResourceBundle getManifestBundle() throws MissingResourceException {
        if (this.manifestBundle == null) {
            final Path manifestDir = getConfiguration().getModuleResourcesPath();
            try (final URLClassLoader cl = new URLClassLoader(new URL[] { manifestDir.toUri().toURL() })) {
                // Create a class loader initialized with the 'manifest' directory
                // in module resource,
                // then give it to ResourceBundle.getBundle(...)
                this.manifestBundle = ResourceBundle.getBundle("module", Locale.getDefault(), cl);
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
        return this.manifestBundle;
    }

    /**
     * Method automatically called just before the disposal of the module.
     * <p>
     * The <code>uninit</code> method allows the developer to execute the desired un-initialization code at this step. For example,
     * if IViewpoints have been registered in the {@link #init()} method, this method is the perfect place to remove them.
     * <p>
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("b31ca9e1-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void uninit() {
        // Nothing to do.
    }

    @objid ("0ece6228-caed-4b9c-acf4-b47bc5785f07")
    @Override
    public String getLabel(String key) {
        try {
            return getManifestBundle().getString(key);
        } catch (MissingResourceException e) {
            MdaInfra.LOG.warning("%s module: %s",getName(), e.toString());
            return key;
        }
    }

    @objid ("4e7caa03-87cc-47b7-bb2e-0bd4564efc72")
    @Override
    public LicenseInfos getLicenseInfos() {
        return new LicenseInfos(Status.UNDEFINED, null, "");
    }

    @objid ("735d5918-d254-4f33-b24a-6bb51badf83d")
    @Override
    public String getModuleImagePath() {
        return null;
    }

    @objid ("301a2420-ba51-4e56-9bc0-8ff331acd0be")
    @Override
    public Image getImage(Stereotype stereotype, ImageType type) {
        return null;
    }

    @objid ("9a8e299e-ab1f-435e-bb89-d418e84a70d1")
    @Override
    public ScriptEngine getJythonEngine() {
        return null;
    }

    @objid ("4fee89c3-5819-4cff-84f1-09538634322b")
    @Override
    public String getLabel(Stereotype stereotype) {
        return stereotype.getLabelKey().isEmpty() ? stereotype.getName() : stereotype.getLabelKey();
    }

    @objid ("b7e4de18-0d5b-4ae5-9c46-96832922a39b")
    @Override
    public String getLabel(TagType tagType) {
        return tagType.getLabelKey().isEmpty() ? tagType.getName() : tagType.getLabelKey();
    }

    @objid ("b147f814-b1f7-427d-860d-19e5267cccd5")
    @Override
    public String getLabel(NoteType noteType) {
        return noteType.getLabelKey().isEmpty() ? noteType.getName() : noteType.getLabelKey();
    }

    @objid ("e1800aa0-10ac-4bb8-9ce7-4f6c5e3c8acb")
    @Override
    public String getLabel(ExternDocumentType docType) {
        return docType.getLabelKey().isEmpty() ? docType.getName() : docType.getLabelKey();
    }

    @objid ("cc50ba62-dbc9-4dac-852b-bfd7621125c5")
    @Override
    public IModelingSession getModelingSession() {
        return this.modelingSession;
    }

    @objid ("d81947c8-6373-4c32-a6d3-6f56059ed19f")
    @Override
    public Version getRequiredModelioVersion() {
        return new Version(0,0,0);
    }

    @objid ("9145dd56-ee9e-4053-af01-e809267a5d59")
    @Override
    public String getLabel(PropertyDefinition pdef) {
        return pdef.getName();
    }

    @objid ("fb3cf5bb-03ba-4807-bcf8-eefdcf029230")
    @Override
    public String getDescription(PropertyDefinition pdef) {
        return pdef.getNoteContent("ModelerModule", "description");
    }

}
