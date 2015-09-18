/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.module;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.script.ScriptEngine;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.ILicenseInfos.Status;
import org.modelio.api.module.paramEdition.DefaultParametersEditionModel;
import org.modelio.api.module.script.IScriptService;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.version.Version;

/**
 * Default implementation of the {@link IModule} interface.
 * <p>
 * All Modelio java modules should inherit from this class.
 */
@objid ("a0456ff1-479d-11df-a533-001ec947ccaf")
public abstract class AbstractJavaModule implements IModule {
    @objid ("c16c9761-1b60-4ffe-ae88-13eb6e4ed015")
    protected ImageRegistry imageRegistry;

    @objid ("6cb39783-51ae-42a6-8ad9-922f905d82d3")
    private Image moduleImage;

    @objid ("a047d2d7-479d-11df-a533-001ec947ccaf")
    private final IModuleUserConfiguration configuration;

    /**
     * The Jython engine.
     */
    @objid ("a0457056-479d-11df-a533-001ec947ccaf")
    private javax.script.ScriptEngine jythonEngine = null;

    @objid ("a047d254-479d-11df-a533-001ec947ccaf")
    private final IModelingSession modelingSession;

    @objid ("a047d256-479d-11df-a533-001ec947ccaf")
    protected IParameterEditionModel parameterEditionModel = null;

    @objid ("e0323981-edf0-11e1-82c2-001ec947ccaf")
    private ModuleComponent moduleComponent;

    @objid ("fdd785e3-7c11-4a4e-81a2-5d16c5db84c2")
    private final ResourceBundle I18N;

    /**
     * Main constructor, to instantiate a new module.
     * @param modelingSession the current session.
     * @param moduleComponent the Module representing this module in the model.
     * @param moduleConfiguration the configuration of this module.
     */
    @objid ("a0457000-479d-11df-a533-001ec947ccaf")
    public AbstractJavaModule(IModelingSession modelingSession, ModuleComponent moduleComponent, IModuleUserConfiguration moduleConfiguration) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                AbstractJavaModule.this.imageRegistry = new ImageRegistry();
            }
        });
        
        this.modelingSession = modelingSession;
        this.moduleComponent = moduleComponent;
        this.configuration = moduleConfiguration;
        
        this.I18N = getManifestBundle();
        
        loadModuleImage();
    }

    @objid ("a047d2c2-479d-11df-a533-001ec947ccaf")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractJavaModule other = (AbstractJavaModule) obj;
        if (this.moduleComponent == null) {
            if (other.moduleComponent != null)
                return false;
        } else if (!this.moduleComponent.equals(other.moduleComponent))
            return false;
        return true;
    }

    /**
     * Get the configuration associated to this module.
     * 
     * Module configuration provide access to module parameter and resource paths
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("a0457012-479d-11df-a533-001ec947ccaf")
    @Override
    public IModuleUserConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("a047d2f5-479d-11df-a533-001ec947ccaf")
    @Override
    public String getDescription() {
        try {
            return this.I18N.getString("ModuleDescription");
        } catch (MissingResourceException e) {
            Modelio.getInstance().getLogService().warning(this, e.toString());
            return "";
        }
    }

    /**
     * Get the image provided by the module for a given stereotype. The module should return an image if the stereotype is provided
     * by itself, null in the other case. The image life cycle must be handled by the module.
     * @param stereotype a stereotype
     * @param type the image type
     * @return the stereotype image, or null if the module provides none.
     */
    @objid ("a047d2d2-479d-11df-a533-001ec947ccaf")
    @Override
    public Image getImage(Stereotype stereotype, ImageType type) {
        // If only the stereotype was specified we search directly from it.
        if (stereotype != null) {
            String key = getImageKey(stereotype, type);
        
            Image image = this.imageRegistry.get(key);
        
            if (image == null) {
                ImageDescriptor desc = getImageDescriptor(stereotype, type);
                if (desc != null) {
                    this.imageRegistry.put(key, desc);
                    image = this.imageRegistry.get(key);
                }
            }
            return image;
        }
        return null;
    }

    /**
     * Get the image descriptor provided by the module for a given stereotype. The module should return an image if the stereotype
     * is provided by itself, null in the other case.
     * @param stereotype a stereotype
     * @param imageType the image type
     * @return the stereotype image, or null if the module provides none.
     */
    @objid ("a047d266-479d-11df-a533-001ec947ccaf")
    private ImageDescriptor getImageDescriptor(Stereotype stereotype, ImageType imageType) {
        // If the stereotype is not owned by the current module we return null.
        if (!this.isStereotypeOwner(stereotype)) {
            return null;
        }
        
        ImageDescriptor desc = null;
        Path moduleDirectory = getConfiguration().getModuleResourcesPath();
        String relativePath = null;
        
        if (imageType == ImageType.ICON) {
            relativePath = stereotype.getIcon();
        } else if (imageType == ImageType.IMAGE) {
            relativePath = stereotype.getImage();
        }
        
        if (relativePath == null || relativePath.equals("")) {
            return null;
        }
        
        try {
            Path imageFile = moduleDirectory.resolve(relativePath);
            if (!Files.isRegularFile(imageFile) && relativePath.startsWith(getName())) {
                // Compatibility mode with modelio 1.2, remove the module's name
                relativePath = relativePath.substring(getName().length() + 1);
                imageFile = moduleDirectory.resolve(relativePath);
            }
        
            if (Files.isRegularFile(imageFile)) {
                URL imageUrl = imageFile.toUri().toURL();
                desc = ImageDescriptor.createFromURL(imageUrl);
                if (desc != ImageDescriptor.getMissingImageDescriptor()) {
                    return desc;
                }
                return null;
            }
        } catch (MalformedURLException e) {
            Modelio.getInstance().getLogService().error(this, e.getMessage());
        }
        return desc;
    }

    /**
     * Get the Jython scripting engine configured for having access to all the module classes and the public classes of all required
     * modules.
     * 
     * The following variables are already bound:
     * <ul>
     * <li>SESSION : the MDA modeling session</li>
     * <li> {@link IModule} MODULE : this module</li>
     * <li> {@link ClassLoader} CLASSLOADER : the class loader of the module</li>
     * </ul>
     * @see <a href="http://www.jython.org" > The Jython project homepage</a>
     * @return The Jython scripting engine.
     */
    @objid ("a047d267-479d-11df-a533-001ec947ccaf")
    @Override
    public ScriptEngine getJythonEngine() {
        if (this.jythonEngine == null) {
            IScriptService scriptService = Modelio.getInstance().getScriptService();
            this.jythonEngine = scriptService.getScriptEngine(getClass().getClassLoader());
        
            // preset a few variables
            this.jythonEngine.put("SESSION", getModelingSession());
            this.jythonEngine.put("MODULE", this);
            this.jythonEngine.put("modelingSession", getModelingSession());
            this.jythonEngine.put("module", this);
        }
        return this.jythonEngine;
    }

    @objid ("a047d268-479d-11df-a533-001ec947ccaf")
    @Override
    public String getLabel(Stereotype stereotype) {
        return getLabel(stereotype.getLabelKey());
    }

    /**
     * Get the path to the image representing the module.
     * @return a path relative to the module's resource path.
     */
    @objid ("a0457017-479d-11df-a533-001ec947ccaf")
    @Override
    public abstract String getModuleImagePath();

    /**
     * Returns the {@link ModuleComponent} model associated with this module.
     * @return the {@link ModuleComponent} model associated with this module.
     */
    @objid ("a047d24e-479d-11df-a533-001ec947ccaf")
    @Override
    public ModuleComponent getModel() {
        return this.moduleComponent;
    }

    /**
     * Returns the modeling session this module is loaded into.
     * @return the modeling session this module is loaded into.
     */
    @objid ("a047d24f-479d-11df-a533-001ec947ccaf")
    @Override
    public IModelingSession getModelingSession() {
        return this.modelingSession;
    }

    /**
     * Used to return the module name.
     * <p>
     * <p>
     * The module name corresponds to the name of the module, as defined in the <i>MDA Designer<i> tool.
     * @return The module name
     */
    @objid ("a047d250-479d-11df-a533-001ec947ccaf")
    @Override
    public String getName() {
        return this.moduleComponent.getName();
    }

    /**
     * Get the parameters model as it must be shown in the module parameters edition dialog.
     * @return The parameters edition model.
     */
    @objid ("a047d251-479d-11df-a533-001ec947ccaf")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null)
            this.parameterEditionModel = new DefaultParametersEditionModel(this);
        return this.parameterEditionModel;
    }

    /**
     * Get the ModelComponent contributor associated to this module.
     * @see IModelComponentContributor
     * @return the module configuration.
     */
    @objid ("757687e3-65e6-11e0-9853-001ec947cd2a")
    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return null;
    }

    /**
     * Returns the minimum Modelio version that authorize the Module to be activated.
     * @return The minimum Modelio version
     */
    @objid ("a0457065-479d-11df-a533-001ec947ccaf")
    @Override
    public Version getRequiredModelioVersion() {
        return new Version(this.moduleComponent.getMinBinVersionCompatibility());
    }

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("a0457068-479d-11df-a533-001ec947ccaf")
    @Override
    public Version getVersion() {
        return new Version(this.moduleComponent.getMajVersion() + "." + this.moduleComponent.getMinVersion() + "."
                                        + this.moduleComponent.getMinMinVersion());
    }

    @objid ("a0457027-479d-11df-a533-001ec947ccaf")
    @Override
    public String toString() {
        final StringBuilder stringBuffer = new StringBuilder(40);
        stringBuffer.append(getClass().getSimpleName());
        stringBuffer.append(" '");
        stringBuffer.append(getName());
        stringBuffer.append("' {");
        stringBuffer.append(this.moduleComponent.getUuid());
        stringBuffer.append("} module");
        return stringBuffer.toString();
    }

    @objid ("a045700f-479d-11df-a533-001ec947ccaf")
    private static String getImageKey(Stereotype stereotype, ImageType imageType) {
        return "module." + stereotype.getCompositionOwner().getName() + "." + stereotype.getBaseClassName() + "."
                                        + stereotype.getName() + "." + imageType.name();
    }

    /**
     * Get the {@link ResourceBundle} corresponding to the localized module.properties file in the module resources.
     * @return the resource bundle
     * @throws java.util.MissingResourceException if the file is not found
     */
    @objid ("a0457010-479d-11df-a533-001ec947ccaf")
    private ResourceBundle getManifestBundle() throws MissingResourceException {
        Path moduleResourcesPath = getConfiguration().getModuleResourcesPath();
        try (final URLClassLoader cl = new URLClassLoader(new URL[] { moduleResourcesPath.toUri().toURL() })) {
            // Create a class loader initialized with the 'manifest' directory
            // in module resource, then give it to ResourceBundle.getBundle(...)
            return ResourceBundle.getBundle("module", Locale.getDefault(), cl);
        } catch (MalformedURLException e) {
            throw new MissingResourceException(e.getLocalizedMessage(), "module", "");
        } catch (MissingResourceException e) {
            MissingResourceException e2 = new MissingResourceException(e.getLocalizedMessage() + " in '"
                    + moduleResourcesPath.toUri().toString() + "'", e.getClassName(), e.getKey());
            e2.initCause(e);
            Modelio.getInstance().getLogService().error(this, e.getLocalizedMessage());
            throw e2;
        } catch (IOException e) {
            Modelio.getInstance().getLogService().error(this, e);
        }
        return null;
    }

    /**
     * Returns true if the given stereotype belongs to the module.
     * @param stereotype the stereotype to test
     * @return true if the given stereotype belongs to the module.
     */
    @objid ("a0457011-479d-11df-a533-001ec947ccaf")
    private boolean isStereotypeOwner(Stereotype stereotype) {
        final Profile profile = stereotype.getOwner();
        if (profile != null) {
            ModuleComponent module = profile.getOwnerModule();
            if (module != null) {
                return module.equals(this.moduleComponent);
            }
            final ModelTree owner = profile.getOwner();
            return this.moduleComponent.equals(owner);
        }
        return false;
    }

    @objid ("466b0c4f-9748-11e0-8975-001ec947cd2a")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.moduleComponent == null) ? 0 : this.moduleComponent.hashCode());
        return result;
    }

    @objid ("9994c01e-178f-11e2-aa0d-002564c97630")
    @Override
    public final Image getModuleImage() {
        return this.moduleImage;
    }

    @objid ("4ebad2e9-f676-49ec-b469-d1a1bff5a3f8")
    @Override
    public final String getLabel(TagType tagType) {
        return getLabel(tagType.getLabelKey());
    }

    @objid ("21578d5d-20c4-430e-b2af-fc29f9adbdb7")
    @Override
    public final String getLabel(NoteType noteType) {
        return getLabel(noteType.getLabelKey());
    }

    @objid ("441cfa36-d192-4147-ac55-060f7021df55")
    @Override
    public final String getLabel(ExternDocumentType docType) {
        return getLabel(docType.getLabelKey());
    }

    @objid ("df3e4b34-2623-4b44-9752-f76656be1e4e")
    @Override
    public String getLabel(final String key) {
        if (this.I18N == null)
            return key;
        if (key == null)
            return "";
        try {
            if (key.startsWith("%")) {
                return this.I18N.getString(key.substring(1));
            }
        } catch (MissingResourceException e) {
            // MdaInfra.LOG.warning("Missing Resource :" + value);
        }
        return key;
    }

    /**
     * Get the module label that is displayed in dialog boxes and other GUIU parts.
     * @return The module label.
     */
    @objid ("552faba7-de2d-4c53-9a68-274bfdd999e3")
    @Override
    public String getLabel() {
        try {
            if (this.I18N != null) {
                return this.I18N.getString("ModuleLabel");
            }
        } catch (MissingResourceException e) {
            Modelio.getInstance().getLogService().error(this, e.getMessage());
        }
        return getName();
    }

    @objid ("ce0cb21c-74f2-42ff-b7ca-21e0c8db96c8")
    @Override
    public ILicenseInfos getLicenseInfos() {
        return new LicenseInfos(Status.FREE, null, "");
    }

    @objid ("b94d549d-34be-44da-ad77-2f2c7f1b6d60")
    @Override
    public void init() {
    }

    @objid ("76129bb9-06df-437d-903c-f08d241d7025")
    @Override
    public void uninit() {
        if(this.moduleImage !=  null){
            this.moduleImage.dispose();
        }
    }

    @objid ("947ecfb3-ac67-40c1-8296-07733f7718a3")
    private void loadModuleImage() {
        try{
            String relativePath = getModuleImagePath();
            final Path moduleDirectory = getConfiguration().getModuleResourcesPath();
            Path imageFile = moduleDirectory.resolve(relativePath.substring(1));
                   
            if (Files.isRegularFile(imageFile)) {
                this.moduleImage =  new Image(null, imageFile.toFile().getAbsolutePath());
            }
        }catch(Exception e){
              
        }
    }

}
