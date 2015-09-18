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

import javax.script.ScriptEngine;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.model.IModelingSession;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * All Modelio module classes must implement this interface.
 * <p>
 * <p>
 * <p>
 * <p>
 * In practice, the Modelio modules implement the {@link IModule} interface .
 * <p>
 * <p>
 * The {@link IModule} interface is implemented by the <i>MDA Designer</i> tool thanks to the {@code AbstractJavaModule}
 * class.<br>
 * The {@link IModule} can never be used by another module developer.<br>
 * Only the peer module ({@link IPeerModule}) can be accessed, as described below:
 * <p>
 * <p>
 * <code>
 * IPeerModule module = Modelio.getModelingSession().getPeerModule (MacroPeerModule.class);
 * </code>
 * <p>
 * <p>
 */
@objid ("01f40414-0000-32a9-0000-000000000000")
public interface IModule {
    /**
     * Get the configuration associated to this module.
     * 
     * Module configuration provide access to module parameter and resource paths
     * @see IModuleUserConfiguration
     * @return the module configuration.
     */
    @objid ("01f40414-0000-32d1-0000-000000000000")
    IModuleUserConfiguration getConfiguration();

    /**
     * Used to return the module description.
     * @return The module description
     */
    @objid ("01f40414-0000-32b2-0000-000000000000")
    String getDescription();

    /**
     * Get the image provided by the module for a given stereotype. The module should return an image if the stereotype
     * is provided by itself, null in the other case. The image life cycle must be handled by the module.
     * @param stereotype a stereotype
     * @param type the image type
     * @return the stereotype image, or null if the module provides none.
     */
    @objid ("e3b2b60f-de71-11dd-afed-0014222a9f79")
    Image getImage(Stereotype stereotype, ImageType type);

    /**
     * Get the Jython scripting engine configured for having access to all the module classes and the public classes of
     * all required modules.
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
    @objid ("864713ba-6248-11de-9398-001ec947ccaf")
    ScriptEngine getJythonEngine();

    @objid ("21c1f31d-75dc-11dd-9866-0014222a9f79")
    String getLabel(Stereotype stereotype);

    @objid ("c84d65ab-3c3a-4cd0-a94b-64db4b821fe1")
    String getLabel(TagType tagType);

    @objid ("e7e0e25f-aaf4-4f0f-bb3b-286cfc6bb10a")
    String getLabel(NoteType noteType);

    @objid ("b8f127fa-71e4-4e5f-8b43-184e9b77c62f")
    String getLabel(ExternDocumentType docType);

    @objid ("4f710aac-819b-48e2-9cac-ec4e804e5ab9")
    String getLabel();

    @objid ("d7e1eff0-1d64-4d07-a6b0-00135b260e18")
    String getLabel(String key);

    @objid ("d0f20abf-b0ac-404e-ae01-2c75875c3643")
    ILicenseInfos getLicenseInfos();

    /**
     * Returns the {@link ModuleComponent} model associated with this module.
     * @return the {@link ModuleComponent} model associated with this module.
     */
    @objid ("01f40414-0000-3b83-0000-000000000000")
    ModuleComponent getModel();

    /**
     * Get the ModelComponent contributor associated to this module.
     * @see IModelComponentContributor
     * @return the module configuration.
     */
    @objid ("1f42ee4a-65e6-11e0-9853-001ec947cd2a")
    IModelComponentContributor getModelComponentContributor(IModelComponent mc);

    /**
     * Returns the modeling session this module is loaded into.
     * @return the modeling session this module is loaded into.
     */
    @objid ("7990c085-65db-11e0-9853-001ec947cd2a")
    IModelingSession getModelingSession();

    /**
     * Returns an Image for this module.
     * @return an Image for this module. Might be <code>null</code>.
     */
    @objid ("9567ce16-8bc1-11dd-ad20-0014222a9f79")
    Image getModuleImage();

    /**
     * Used to return the module name.
     * <p>
     * <p>
     * The module name corresponds to the name of the module, as defined in the <i>MDA Designer<i> tool.
     * @return The module name
     */
    @objid ("01f40414-0000-32ae-0000-000000000000")
    String getName();

    /**
     * Get the parameters model as it must be shown in the module parameters edition dialog.
     * @return The parameters edition model.
     */
    @objid ("f8cddd33-8f94-11dd-bbe0-001ec947ccaf")
    IParameterEditionModel getParametersEditionModel();

    /**
     * Returns the peer module, connected to this module.
     * <p>
     * The peer module represents the public services of this current module.
     * @return The associated peer module
     */
    @objid ("01f40414-0000-32c3-0000-000000000000")
    IPeerModule getPeerModule();

    /**
     * Returns the minimum Modelio version that authorize the Module to be activated.
     * @return The minimum Modelio version
     */
    @objid ("45f75358-65cd-11e0-b0ca-001ec947cd2a")
    Version getRequiredModelioVersion();

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
    @objid ("01f40414-0000-3206-0000-000000000000")
    IModuleSession getSession();

    /**
     * Used to return the module version.
     * @return The module version
     */
    @objid ("01f40414-0000-32b6-0000-000000000000")
    Version getVersion();

    /**
     * Method automatically called just after the creation of the module.
     * <p>
     * <p>
     * 
     * The module is automatically instantiated at the beginning of the mda lifecycle and the constructor implementation
     * is not accessible to the module developer.
     * <p>
     * <p>
     * 
     * The <code>init</code> method allows the developer to execute the desired initialization code at this step. For
     * example, this is the perfect place to register any IViewpoint this module provides.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("01f40414-0000-320a-0000-000000000000")
    void init();

    /**
     * Method automatically called just before the disposal of the module.
     * <p>
     * <p>
     * 
     * 
     * The <code>uninit</code> method allows the developer to execute the desired un-initialization code at this step.
     * For example, if IViewpoints have been registered in the {@link #init()} method, this method is the perfect place
     * to remove them.
     * <p>
     * <p>
     * 
     * This method should never be called by the developer because it is already invoked by the tool.
     */
    @objid ("0a40ab62-a354-11e1-abf7-001ec947c8cc")
    void uninit();

    /**
     * Get the path to the image representing the module.
     * @return a path relative to the module's resource path.
     */
    @objid ("0bf45a9b-8afe-42fd-b7d0-06cd1a0421d0")
    String getModuleImagePath();

    @objid ("8e52ef63-72a1-11dd-a1d1-001ec947cd2a")
    public enum ImageType {
        ICON,
        IMAGE;
    }

}
