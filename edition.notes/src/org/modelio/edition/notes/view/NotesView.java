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


package org.modelio.edition.notes.view;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.edition.notes.panelprovider.NotesPanelProvider;
import org.modelio.gproject.gproject.GProject;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IModelChangeListener;
import org.modelio.vcore.session.api.model.change.IModelChangeSupport;
import org.modelio.vcore.session.api.model.change.IStatusChangeEvent;
import org.modelio.vcore.session.api.model.change.IStatusChangeListener;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * The NotesView drives a "Notes and Constraints" panel provided by NotesPanelProvider
 * 
 * NotesView only manages the view life cycle:
 * <ul>
 * <li>creation of the GUI => {@link NotesView#createControls(IProjectService, Composite, IStructuredSelection, EMenuService, IEclipseContext)}</li>
 * <li>project opening => {@link NotesView#onProjectOpened(GProject, IActivationService, IStructuredSelection)}</li>
 * <li>project closing => {@link NotesView#onProjectClosing(GProject)}</li>
 * <li>application selection changes => {@link NotesView#onSelectionChange(IStructuredSelection)}</li>
 * </ul>
 * 
 * <p>
 * NotesView does not provide the GUI itself, the GUI is provided by the <i>panel</i> IPanelProvider instance.
 * </p>
 * 
 * The selection model is composed of a <b>current element</b> and a <b>current item</b>:
 * <ul>
 * <li>the current element is the model element whose note items are currently listed.</li>
 * <li>the current item is the particular note, constraint or extern document whose contents is currently shown.</li> </ol>
 */
@objid ("fba32286-19e5-11e2-ad19-002564c97630")
public class NotesView implements IModelChangeListener, IStatusChangeListener {
    /**
     * The Notes view ID.
     */
    @objid ("7565c9ee-01d0-4617-bcb0-e1c3594a782d")
    public static final String VIEW_ID = "org.modelio.edition.notes.notesview";

    @objid ("9f5f220a-32bc-4ddc-81fd-ce15f63e860d")
    private static final String POPUPID = "org.modelio.edition.notes.popupmenu";

    /**
     * Use a static context to avoid initialization issues...
     */
    @objid ("9543d492-9864-465d-91ca-2881869a4703")
    @Optional
    @Inject
    public static EContextService contextService;

    /**
     * Instance counter for debugging ?
     */
    @objid ("986c4e1c-bed2-414d-bf90-89376048edba")
    public static int nbinstances = 0;

    @objid ("a4ecfa86-487d-47af-9197-b800f3a97d96")
     NotesPanelProvider panel;

    /**
     * Use this with {@link Display#asyncExec(Runnable)} to update the view in the SWT thread.
     */
    @objid ("90485b93-3e02-4bdc-960b-0620ff6d846b")
    private final UpdateViewRunnable viewUpdater = new UpdateViewRunnable();

    @objid ("0c2605ed-30b7-405b-9a5d-3670f2f89a3a")
    protected Composite parentComposite = null;

    /**
     * Constructor.
     */
    @objid ("ca31b44f-fe5b-4a0e-adfa-92600a4bc6db")
    public NotesView() {
    }

    /**
     * Get the notes panel.
     * @return the current notes panel.
     */
    @objid ("f5a048c6-3634-409c-bd26-94494f9ce41d")
    public NotesPanelProvider getNotesPanel() {
        return this.panel;
    }

    /**
     * Called by the framework to create the view and initialize it.
     * @param projectService the project service.
     * @param parent the composite the view must add its content into.
     * @param selection the application selection.
     * @param theMenuService Eclipse menu service
     * @param context E4 context
     */
    @objid ("9c61c640-b8fb-4c3c-b0d6-62fc01ed9324")
    @PostConstruct
    public void createControls(IProjectService projectService, Composite parent, @Optional @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, @Optional EMenuService theMenuService, IEclipseContext context) {
        this.parentComposite = parent;
        
        this.panel = new NotesPanelProvider();
        ContextInjectionFactory.inject(NotesView.this.panel, context);
        this.panel.createPanel(NotesView.this.parentComposite);
        
        theMenuService.registerContextMenu(NotesView.this.getNotesPanel().getTreeViewer().getTree(), POPUPID);
        NotesView.this.parentComposite.layout(true, true);
        
        // Sometimes, the view is instantiated only after the project is opened
        if (projectService != null && projectService.getOpenedProject() != null) {
            projectService.getOpenedProject().getSession().getModelChangeSupport().addModelChangeListener(this);
            projectService.getOpenedProject().getSession().getModelChangeSupport().addStatusChangeListener(this);
            if (selection != null) {
                onSelectionChange(selection);
            }
        }
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    @objid ("fb5fa01d-324d-4f0a-802e-1ffb63bd91b2")
    @Focus
    void setFocus() {
        if (this.panel != null) {
            this.panel.setFocus();
        }
    }

    /**
     * This method is called after a project opening.
     * <p>
     * Registers model listeners.
     */
    @objid ("d7a0aaf0-1a32-4e94-89bd-86c0d3391e57")
    @Inject
    @Optional
    void onProjectOpened(@UIEventTopic(ModelioEventTopics.PROJECT_OPENED) final GProject openedProject, @Optional final IActivationService activationService, @Optional @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (openedProject == null) {
            return;
        }
        
        this.panel.setActivationService(activationService);
        
        openedProject.getSession().getModelChangeSupport().addModelChangeListener(this);
        openedProject.getSession().getModelChangeSupport().addStatusChangeListener(this);
        
        if (selection != null) {
            onSelectionChange(selection);
        }
    }

    /**
     * Called when a project is closed. On session close un-reference the project.
     */
    @objid ("57ee9dc7-9d64-4d7a-9941-7ab9928ffce8")
    @Inject
    @SuppressWarnings("unused")
    @Optional
    void onProjectClosing(@UIEventTopic(ModelioEventTopics.PROJECT_CLOSING) final GProject closedProject) {
        final NotesPanelProvider lpanel = NotesView.this.panel;
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                if (lpanel != null) {
                    lpanel.setInput(null);
                }
            }
        });
    }

    /**
     * @return the control that has keyboard focus.
     */
    @objid ("97210557-9959-4572-9740-6fd20e4c17da")
    public Control getFocusControl() {
        return this.parentComposite.getDisplay().getFocusControl();
    }

    /**
     * This listener is activated when the selection changes in the workbench.<br>
     * Its responsibility is to set the NotesView's current element.
     * @param selection the current modelio selection.
     */
    @objid ("5565698e-2918-4551-ba17-8e9893e5e18b")
    @Optional
    @Inject
    public void onSelectionChange(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        // This method listen to the selection changes in the workbench.
        if (selection != null && this.panel != null) {
            final List<MObject> selectedElements = new ArrayList<>();
            for (final Object object : selection.toList()) {
                if (object instanceof MObject) {
                    selectedElements.add((MObject) object);
                } else if (object instanceof IAdaptable) {
                    final MObject adapter = (MObject) ((IAdaptable) object).getAdapter(MObject.class);
                    if (adapter != null) {
                        selectedElements.add(adapter);
                    }
                }
            }
        
            if (selectedElements.size() > 0) {
                this.panel.setInput(selectedElements.get(0));
                this.panel.getPanel().layout(true, true);
            }
        }
    }

/*
     * Called when the model is modified (element status modification) (non-Javadoc)
     *
     * @see
     * org.modelio.vcore.session.api.model.change.IStatusChangeListener#statusChanged(org.modelio.vcore.session.api.model.change
     * .IStatusChangeEvent)
     */
    @objid ("a1db0319-7627-4d95-827e-f8ca43551ddb")
    @Override
    public void statusChanged(IStatusChangeEvent event) {
        this.panel.getPanel().getDisplay().asyncExec(this.viewUpdater);
    }

/*
     * Called when the model is modified (element modification) (non-Javadoc)
     *
     * @see org.modelio.vcore.session.api.model.change.IModelChangeListener#modelChanged(org.modelio.vcore.session.api.model.change.
     * IModelChangeEvent)
     */
    @objid ("1a43b2b7-5396-4ebd-97e4-0d1ffdc4b37d")
    @Override
    public void modelChanged(IModelChangeEvent event) {
        this.panel.getPanel().getDisplay().asyncExec(this.viewUpdater);
    }

    /**
     * E4 destructor.
     * @param projectService the project service.
     */
    @objid ("e3d6e9c3-ff4c-472d-a0a2-7ea4fd199c75")
    @PreDestroy
    public void onDispose(IProjectService projectService) {
        final IModelChangeSupport mcs = projectService.getOpenedProject().getSession().getModelChangeSupport();
        mcs.removeModelChangeListener(this);
        mcs.removeStatusChangeListener(this);
        this.panel.dispose();
    }

    @objid ("8d2c0e8f-04df-423e-8848-015f8dce6fde")
    private class UpdateViewRunnable implements Runnable {
        @objid ("89823f35-9bd2-4689-aaa4-3efabb31b576")
        public UpdateViewRunnable() {
            super();
        }

        @objid ("e032407a-4418-4a50-b8b0-b05999a8cf59")
        @Override
        public void run() {
            final NotesPanelProvider notesViewPanel = NotesView.this.panel;
            if (notesViewPanel != null && !notesViewPanel.getPanel().isDisposed()) {
                notesViewPanel.setInput(notesViewPanel.getInput());
                notesViewPanel.getPanel().layout(true, true);
            }
        }

    }

}
