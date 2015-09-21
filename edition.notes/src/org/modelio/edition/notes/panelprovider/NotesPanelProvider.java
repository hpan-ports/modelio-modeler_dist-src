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


package org.modelio.edition.notes.panelprovider;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.model.MModelServices;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class is a provider for a "Notes and Constraints" panel instance.
 * <p>
 * The "Notes and Constraints" panel manages two GUI panels and a toolbar:
 * <ul>
 * <li>the tree panel that displays the list of the notes, constraints and extern documents that are available on the selected model
 * element</li>
 * <li>the content panel that displays the contents of the 'noteItem' selected in the tree panel.</li>
 * </ul>
 * The "Notes and Constraints" panel instantiates a View and Controller and link them together.<br/>
 * The View aggregates the tree and content panels and controls all their behaviors so that they do not have to know anything about
 * each other.<br/>
 * The controller provides services to the tool bar buttons to handle the associated actions.
 * </p>
 * The model element whose note items are currently listed is called the currentElement. The particular note, constraint or extern
 * document whose contents is currently shown is called the current note item.
 * <p>
 * Usage: there are two ways to instantiate a NotesPanelProvider:
 * <ol>
 * <li>use the default (no parameter) constructor and pass the instance to the injection framework.wbr/></li>
 * <li>use the default (no parameter) constructor and manually set the activation service before calling createPanel()</li>
 * </ol>
 * <p>
 * The provided "Notes and Constraints" panel is NOT model change listener, this remains the responsibility of the caller.
 * <p/>
 */
@objid ("653611d3-5e45-4dd3-888e-954777fde33a")
public class NotesPanelProvider implements IPanelProvider {
    /**
     * Activation service to be fired when double-clicking in the panel. If null nothing is fired.
     */
    @objid ("20d41708-3fec-497e-a8b0-a1b3a2f75a9a")
    private IActivationService activationService;

    /**
     * The GUI controller
     */
    @objid ("9bfa727e-bb60-4a0d-858a-b6eceebc3f4b")
    private NotesPanelController controller;

    @objid ("1da1ad58-1162-44f5-8c57-9e79adc0e3b7")
    private IMModelServices modelServices;

    @objid ("b1d59b4b-ede4-433c-9f36-d8007c9864e4")
    private ICoreSession session;

    /**
     * The GUI view
     */
    @objid ("3225ab83-6032-4d2d-80e8-e4133417ec16")
    private NotesPanelView view;

    /**
     * Constructor to be used if you want to use Eclipse E4 injection service.
     * @see #NotesPanelProvider(EContextService, IActivationService)
     */
    @objid ("0e8d446f-569f-4968-8a2e-87edfb1f527e")
    public NotesPanelProvider() {
    }

    /**
     * Constructor to use if you don't use Eclipse E4 injection.
     * @param contextService the E4 context service, null allowed.
     * @param theActivationService Activate the 'double-click' activation by setting 'activationService' to a not <i>null</i> value.<br/>
     * De-activate the 'double-click' activation by setting 'activationService' to a <i>null</i> value.
     */
    @objid ("afd40f98-1ad0-46c2-be26-db55f91d28c2")
    public NotesPanelProvider(EContextService contextService, @Optional IActivationService theActivationService) {
        postConstruct(contextService, theActivationService);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Create the View and its controller
     * </p>
     */
    @objid ("2ed3e30b-e457-47af-a00d-da00d7484b12")
    @Override
    public Composite createPanel(Composite parent) {
        this.view = this.controller.createView(parent);
        return this.view.getComposite();
    }

    @objid ("861d08ac-ba1a-45f6-9556-f0dd460ae7ef")
    @Override
    public void dispose() {
        this.controller.dispose();
        this.controller = null;
    }

    @objid ("2e4521ff-e581-4d98-845e-9d5402f616d2")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("bb7e1a75-4bd6-441d-8705-da8d5499d63f")
    @Override
    public ModelElement getInput() {
        return this.controller.getInput();
    }

    /**
     * {@inheritDoc}
     */
    @objid ("fca2f79d-eafe-45f4-a5ed-d4a5776d5b2c")
    @Override
    public Composite getPanel() {
        return this.view.getComposite();
    }

    /**
     * @return the selected notes/tags/stereotypes ...
     */
    @objid ("60b95b64-f852-44a9-8233-9af68f8e744c")
    public List<ModelElement> getSelectedNotes() {
        return this.view.getSelectedNotes();
    }

    /**
     * @return the notes panel tree viewer.
     */
    @objid ("5b61359c-a02c-4547-aadc-8b0907cfd0ff")
    public TreeViewer getTreeViewer() {
        return this.view.getTreeViewer();
    }

    @objid ("53fc7f80-b354-440d-9a7c-a507e9fe3de8")
    @Override
    public boolean isRelevantFor(Object obj) {
        return true;
    }

    /**
     * Called by E4 event broker : Navigates to the given note, constrain or rich note.
     * <p>
     * Other elements are ignored.
     * @param target the element to set as input
     */
    @objid ("7806c658-7cea-4bed-b493-f50aabbdb666")
    @Optional
    @Inject
    public void navigateTo(@EventTopic(ModelioEventTopics.NAVIGATE_ELEMENT) final Element target) {
        if (!this.getPanel().isDisposed()) {
            if (target instanceof Note || target instanceof Constraint || target instanceof ExternDocument) {
                setInput(target);
            }
        }
    }

    /**
     * Activate the 'double-click' activation by setting 'activationService' to a not <i>null</i> value.<br/>
     * De-activate the 'double-click' activation by setting 'activationService' to a <i>null</i> value.
     * @param activationService the activation service or null
     */
    @objid ("2f41c272-9cf6-4699-948b-786aadaa030e")
    public void setActivationService(IActivationService activationService) {
        if (this.controller==null)
            throw new IllegalStateException(); // call postConstruct() or use other constructor
        
        this.activationService = activationService;
        this.controller.setActivationService(activationService);
    }

    /**
     * Give the focus to the panel
     */
    @objid ("c480222e-5cb1-4231-a9af-5cd043b0a60e")
    public void setFocus() {
        if (this.view != null) {
            this.view.getComposite().setFocus();
        }
    }

    /**
     * Set the current element displayed by the view.
     * @param input the model element whose note are to be listed in the tree panel. May be null.
     */
    @objid ("0dfed7f3-b405-47ba-abfa-10c693f6b35e")
    @Override
    public void setInput(final Object input) {
        if (this.controller == null && input instanceof ModelElement) {
            // Activate the controller
            activatePanel(GProject.getProject((MObject) input));
            this.controller.setInputs((ModelElement) input, null);
        }
        if (input == null || input instanceof ModelElement) {
            // Just delegate to the controller
            this.controller.setInputs((ModelElement) input, null);
        } else {
            // Reuse the precedent input
            this.controller.setInputs(getInput(), null);
        }
    }

    /**
     * Select the given annotation element.
     * @param select the annotation to select
     */
    @objid ("ec2d1ce6-37fd-4a68-b4ec-afbeacefe999")
    public void setSelected(ModelElement select) {
        this.controller.setInputs(getInput(), select);
    }

    /**
     * Called after injection completed.
     * <p>
     * Initialize the activation service
     * @param theActivationService the activation service (optional)
     */
    @objid ("142683ee-5e90-4a89-bc57-fb3196e519a3")
    @PostConstruct
    void postConstruct(EContextService contextService, @Optional IActivationService theActivationService) {
        this.controller = new NotesPanelController(contextService);
        setActivationService(theActivationService);
    }

    /**
     * @param project the edited project
     */
    @objid ("891e9a63-b807-4914-bf0a-887f7045de2b")
    private void activatePanel(GProject project) {
        // Deactivate for previous project if needed
        if (this.session != null) {
            deactivatePanel();
        }
        
        // Set up for new project
        this.session = project.getSession();
        this.modelServices = new MModelServices(project);
    }

    @objid ("1b4bf2b3-b7dd-483b-a9c2-736b21d5f5bb")
    private void deactivatePanel() {
        if (this.controller != null) {
            this.setInput(null);
        }
        
        this.modelServices = null;
        this.session = null;
    }

}
