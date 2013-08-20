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
                                    

package org.modelio.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;
import org.eclipse.e4.ui.model.application.ui.menu.MPopupMenu;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.swt.modeling.EMenuService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.core.picking.IPickingSession;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.property.ui.ModelPropertyPanelProvider;
import org.modelio.vcore.session.api.blob.BlobCopier;
import org.modelio.vcore.session.api.blob.BlobInfo;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vcore.session.api.blob.IBlobProvider;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * ModelProperty plugin main model class.
 * 
 * This class stores a reference to the current project, and listens to open/close events.
 */
@objid ("8fb871ca-c068-11e1-8c0a-002564c97630")
public class PropertyView {
    @objid ("0332c358-fe92-41f0-83ce-61881d425384")
    private static final String POPUPID = "org.modelio.property.popupmenu";

    @objid ("8fb871ce-c068-11e1-8c0a-002564c97630")
     ModelPropertyPanelProvider view;

    @objid ("86a2b971-cf24-11e1-80a9-002564c97630")
     GProject project;

    @objid ("ab38a695-d004-11e1-9020-002564c97630")
    private IMModelServices modelService;

    @objid ("06bda2d0-16d1-11e2-aa0d-002564c97630")
    private IModelioPickingService pickingService;

    @objid ("6398bde1-5bbe-44c2-aa6e-c24ad0d38bd7")
    private Composite parentComposite;

    @objid ("f60bed7a-0c12-4103-af97-3637ba7fb13f")
     EMenuService menuService;

    @objid ("250993c0-d688-4063-bac7-ee55d9cf381f")
    private IBlobProvider blobProvider;

    /**
     * Called by the framework to create the view and initialize it.
     * @param projectService the project service.
     * @param modelServices the model service.
     * @param modelioPickingService the picking service.
     * @param parent the composite the view must add its content into.
     * @param selection the application selection.
     */
    @objid ("8fb871cf-c068-11e1-8c0a-002564c97630")
    @PostConstruct
    public void createControls(IProjectService projectService, @Optional IMModelServices modelServices, IModelioPickingService modelioPickingService, Composite parent, @Optional
@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, @Optional EMenuService theMenuService) {
        this.parentComposite = parent;
        
        // Sometimes, the view is instantiated only after the project is opened
        if (projectService != null && projectService.getOpenedProject() != null) {
            onProjectOpened(projectService.getOpenedProject(), modelServices, modelioPickingService, theMenuService);
            if (selection != null) {
                update(selection);
            }
        }
    }

    @objid ("8fb871d4-c068-11e1-8c0a-002564c97630")
    @Optional
    @Inject
    public void update(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (this.view == null) {
            if (this.project != null) {
                // Create the view content
                this.view = new ModelPropertyPanelProvider();
                this.view.activateEdition(this.project.getSession(), this.modelService, this.pickingService);
                this.view.create(this.parentComposite);
                this.parentComposite.layout();
                Display.getDefault().asyncExec(new Runnable() {
        
                    @Override
                    public void run() {
                        MPopupMenu popupMenu = PropertyView.this.menuService.registerContextMenu(PropertyView.this.view.getTreeViewer().getTree(), POPUPID);
                        MMenu menu = MMenuFactory.INSTANCE.createMenu();
                        popupMenu.getChildren().add(menu);
                    }
                });
            } else {
                return;
            }
        } else if (this.view.isPinned()) {
            return;
        }
        
        if (selection != null && selection.size() == 1) {
            for (Object selectedElement : selection.toList()) {
                if (selectedElement instanceof IAdaptable) {
                    MObject elt = (MObject) ((IAdaptable) selectedElement).getAdapter(MObject.class);
                    if (elt != null) {
                        this.view.setInput(elt);
                        return;
                    }
                } else if (selectedElement instanceof MObject) {
                    this.view.setInput(selectedElement);
                    return;
                }
            }
        }
        this.view.setInput(null);
    }

    /**
     * This method is called after a project opening.
     * 
     * Keep a reference to the modeling session and model services.
     */
    @objid ("8fb871da-c068-11e1-8c0a-002564c97630")
    @Optional
    @Inject
    void onProjectOpened(@EventTopic(ModelioEventTopics.PROJECT_OPENED) final GProject openedProject, @Optional IMModelServices mmService, @Optional IModelioPickingService modelioPickingService, @Optional EMenuService theMenuService) {
        this.project = openedProject;
        this.modelService = mmService;
        this.pickingService = modelioPickingService;
        this.menuService = theMenuService;
        
        // Activate edition on the view
        if (this.view != null) {
            this.view.activateEdition(this.project != null ? this.project.getSession() : null, this.modelService, this.pickingService);
        }
        
        // Register the blob provider, for local stereotype images.
        if (this.project != null) {
            this.blobProvider = new IBlobProvider() {
        
                @Override
                public Collection<String> getRelatedBlobs(MObject obj) {
                    List<String> blobKeys = new ArrayList<>();
                    if (obj instanceof Stereotype) {
                        blobKeys.add(getIconKey(obj));
                        blobKeys.add(getImageKey(obj));
                    }
                    return blobKeys;
                }
                
                @Override
                public void objectCopied(MObject from, IRepository fromRepo, MObject to, IRepository toRepo) {
                    if (from instanceof Stereotype) {
                        IBlobInfo toInfo = new BlobInfo(getIconKey(to), "icon for "+to.getName());
                        BlobCopier.copy(getIconKey(from), fromRepo, toInfo, toRepo);
        
                        toInfo = new BlobInfo(getImageKey(to), "image for "+to.getName());
                        BlobCopier.copy(getImageKey(from), fromRepo, toInfo, toRepo);
                    }
                }
                
                private String getIconKey(MObject obj) {
                    return obj.getUuid() + ".icon";
                }
        
                private String getImageKey(MObject obj) {
                    return obj.getUuid() + ".image";
                }
            };
            this.project.getSession().getBlobSupport().addBlobProvider(this.blobProvider);
        }
    }

    /**
     * Called when a project is closed.
     * 
     * On session close un-reference the modeling session and model services.
     */
    @objid ("8fb871e3-c068-11e1-8c0a-002564c97630")
    @Inject
    @Optional
    void onProjectClosed(@EventTopic(ModelioEventTopics.PROJECT_CLOSED) GProject closedProject) {
        // Unregister blob provider
        if (closedProject != null && this.blobProvider != null) {
            this.project.getSession().getBlobSupport().removeBlobProvider(this.blobProvider);
            this.blobProvider = null;
        }
        
        this.project = null;
        this.modelService = null;
    }

    @objid ("06be8d36-16d1-11e2-aa0d-002564c97630")
    @Focus
    void setFocus() {
        if (this.view != null) {
            this.view.getComposite().setFocus();
        }
    }

    @objid ("06be8d39-16d1-11e2-aa0d-002564c97630")
    @Inject
    @Optional
    @SuppressWarnings("unused")
    void onPickingStart(@EventTopic(ModelioEventTopics.PICKING_START) final IPickingSession session) {
        // Temporary pin the view when picking is in progress
        this.view.setPinned(true);
    }

    @objid ("06beb44b-16d1-11e2-aa0d-002564c97630")
    @Inject
    @SuppressWarnings("unused")
    @Optional
    void onPickingSessionStop(@EventTopic(ModelioEventTopics.PICKING_STOP) final IPickingSession session) {
        // Unpit the view
        this.view.setPinned(false);
    }

    @objid ("650c6290-def7-47cf-85e5-e4eb3466e275")
    public ModelPropertyPanelProvider getPanel() {
        return this.view;
    }

}
