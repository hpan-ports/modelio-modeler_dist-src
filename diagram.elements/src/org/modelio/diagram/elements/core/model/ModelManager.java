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


package org.modelio.diagram.elements.core.model;

import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.EContextService;
import org.modelio.api.module.IMdaExpert;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.diagram.elements.core.obfactory.IModelLinkFactory;
import org.modelio.diagram.elements.core.obfactory.ModelLinkFactory;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.mda.infra.service.IModuleService;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Makes the link between the Gm model and the Ob model.
 * 
 * @author cma
 */
@objid ("8084e16d-1dec-11e2-8cad-001ec947c8cc")
public class ModelManager {
    @objid ("79b94beb-a3cd-4099-bc70-2c3d9dd32ef9")
    private final IActivationService activationService;

    @objid ("5dccea2d-ff30-4181-a9fe-4ccbfe5e7491")
    private final EContextService contextService;

    @objid ("f9d9d464-36b2-4751-9006-1808eec09eb4")
    private final IMdaExpert mdaExpert;

    @objid ("8087436f-1dec-11e2-8cad-001ec947c8cc")
    private final IModelLinkFactory modelLinkFactory;

    @objid ("80874370-1dec-11e2-8cad-001ec947c8cc")
    private final IMModelServices modelServices;

    @objid ("b0b221c9-534f-4cf4-8173-7277a586be5f")
    private final IModelioNavigationService navigationService;

    @objid ("8084e16f-1dec-11e2-8cad-001ec947c8cc")
    private final ICoreSession session;

    @objid ("47924b71-db5f-471f-b5f4-94fbb969aa47")
    private Path projectPath;

    /**
     * Create a model manager.
     * @param context the Eclipse 4 context
     */
    @objid ("80874372-1dec-11e2-8cad-001ec947c8cc")
    public ModelManager(IEclipseContext context) {
        IProjectService projectService = context.get(IProjectService.class);
        this.projectPath = projectService.getOpenedProject().getProjectPath();
        this.session = projectService.getSession();
        this.modelServices = context.get(IMModelServices.class);
        this.contextService = context.get(EContextService.class);
        this.activationService = context.get(IActivationService.class);
        this.navigationService = context.get(IModelioNavigationService.class);
        this.mdaExpert = context.get(IModuleService.class).getMdaExpert();
        this.modelLinkFactory = new ModelLinkFactory(this.modelServices);
    }

    /**
     * @return the Modelio activation service.
     */
    @objid ("227c2c9f-6f33-4516-bcc9-ab88159c61c1")
    public IActivationService getActivationService() {
        return this.activationService;
    }

    /**
     * @return the E4 context service.
     */
    @objid ("7f2d7c50-bec3-4126-b425-e2cb58866454")
    public EContextService getContextService() {
        return this.contextService;
    }

    /**
     * Get the MDA expert to ask for example whether a stereotyped element can be put under an element.
     * @return the MDA expert.
     * @since Modelio 3.4
     */
    @objid ("89e718ad-29b0-4240-8c0f-b60913d44af7")
    public IMdaExpert getMdaExpert() {
        return this.mdaExpert;
    }

    /**
     * Get the diagram project metamodel.
     * @return the project metamodel.
     */
    @objid ("ca6379a1-405d-4ac6-919c-0ff23c094e40")
    public final MMetamodel getMetamodel() {
        return getModelingSession().getMetamodel();
    }

    /**
     * Get the model factory used to create a model object
     * in the same repository as the given object.
     * @param referent a model object
     * @return a model factory.
     */
    @objid ("8087438a-1dec-11e2-8cad-001ec947c8cc")
    public IModelFactory getModelFactory(MObject referent) {
        return this.modelServices.getModelFactory();
    }

    /**
     * Get the Ob link factory.
     * @return the link factory.
     */
    @objid ("80874378-1dec-11e2-8cad-001ec947c8cc")
    public IModelLinkFactory getModelLinkFactory() {
        return this.modelLinkFactory;
    }

    /**
     * Get the Modelio model services.
     * @return the model services.
     */
    @objid ("78b5a580-598c-11e2-8539-00137282c51b")
    public IMModelServices getModelServices() {
        return this.modelServices;
    }

    /**
     * Get the modeling session.
     * @return the modeling session.
     */
    @objid ("8087437d-1dec-11e2-8cad-001ec947c8cc")
    public ICoreSession getModelingSession() {
        return this.session;
    }

    /**
     * @return the Modelio navigation service
     */
    @objid ("2e5c9d82-50ca-43c7-8a89-b39870fccb4b")
    public IModelioNavigationService getNavigationService() {
        return this.navigationService;
    }

    /**
     * Resolve an MRef.
     * @param <E>
     * the type of the element, makes an automatic cast.
     * @param ref The reference to resolve
     * @return the found MObject or <i>null</i> if the element is not present in the project.
     */
    @objid ("80874382-1dec-11e2-8cad-001ec947c8cc")
    @SuppressWarnings("unchecked")
    public <E extends Element> E resolveRef(MRef ref) {
        return (E) getModelingSession().getModel().findByRef(ref, IModel.NODELETED);
    }

    /**
     * Get the project directory path.
     * @return the project directory path.
     */
    @objid ("7be8cb01-accf-412a-b3b9-0583785bf23c")
    public Path getProjectPath() {
        return this.projectPath;
    }

}
