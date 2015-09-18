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
                                    

package org.modelio.edition.notes.panelprovider;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.core.ui.elementChooser.ElementChooserDlg;
import org.modelio.edition.notes.constraintChooser.ConstraintChooserDriver;
import org.modelio.edition.notes.panelprovider.helpers.AddConstraintHelper;
import org.modelio.edition.notes.panelprovider.helpers.AddNoteHelper;
import org.modelio.edition.notes.panelprovider.helpers.AddRichNoteHelper;
import org.modelio.edition.notes.panelprovider.helpers.CleanNoteContentHelper;
import org.modelio.edition.notes.panelprovider.helpers.MoveDownHelper;
import org.modelio.edition.notes.panelprovider.helpers.MoveUpHelper;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.model.MModelServices;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IModelChangeListener;
import org.modelio.vcore.session.api.model.change.IStatusChangeEvent;
import org.modelio.vcore.session.api.model.change.IStatusChangeListener;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Controller of the annotations panel.
 */
@objid ("c6ce5778-e360-44b7-8ae6-e9538ea4c99f")
public class NotesPanelController {
    @objid ("2a9f8b05-d228-4fa3-b40c-72cfbe95a47b")
    private NotesPanelView view;

    /**
     * The element whose notes are being displayed/edited
     */
    @objid ("d6bdad35-c718-4be3-a05a-6b3eb7e8add9")
    private ModelElement currentInput;

    @objid ("0b0cafb2-7cda-4be2-a248-5cb7800f2e17")
    private ModelElement currentSelection;

    @objid ("d18af8cb-7225-4954-9aa2-139d7d0ebb5d")
    private IActivationService activationService;

    @objid ("92bd4f31-1163-4fbe-a7e6-10f13d1b2340")
    private IMModelServices modelServices;

    @objid ("5e9d40c8-a46c-4700-8893-09e068daf384")
    private ICoreSession session;

    @objid ("0abf1ed2-50c7-4a42-b3a2-62551e50f54e")
    private final EContextService contextService;

    /**
     * Creates the views in the given composite
     * @param parent a SWT Composite
     * @return the created panel view
     */
    @objid ("1382bc96-7947-4780-b1e5-18333c90ea89")
    public NotesPanelView createView(Composite parent) {
        this.view = new NotesPanelView(this);
        this.view.createContents(parent);
        return this.view;
    }

    /**
     * The NotesPanelComposite has to be driven for two inputs: <li>the edited element which is the element whose notes and
     * constraints are currently being edited, <li>and the current selection which is the note or constraint currently being
     * displayed.
     * @param elt the note item whose contents is to be displayed in the content panel. May be null Refresh the whole notes view.
     * Clean up the content of the currently selected note Set the note item object (Note, Constraint or ExternDocument)
     * currently displayed in the content panel.
     * @param select the currently selected notes/constraints in the view
     */
    @objid ("7785731d-8ccd-4279-b9f9-cd782d218628")
    public void setInputs(ModelElement elt, ModelElement select) {
        // Check for deleted elements
        if (this.currentInput != null && !this.currentInput.isValid()) {
            this.currentInput = null;
            this.currentSelection = null;
        } else {
            if (this.currentSelection != null && !this.currentSelection.isValid()) {
                this.currentSelection = null;
            }
        }
        
        // If the current element is not null and the passed elt is the same as the current element
        // we are only refreshing the view (mostly because of a model or status change event
        // We'd better try to preserve the selected item for end-user's comfort
        if (this.currentInput != null && this.currentInput.isValid() && this.currentInput.equals(elt)) {
            refreshInputs();
            return;
        }
        
        // If we were passed a null or invalid element we cannot go further
        if (elt == null || !elt.isValid()) {
            this.currentInput = null;
            this.view.setInput(null);
            this.currentSelection = null;
            this.view.setSelected(null);
            this.session = null;
            this.modelServices = null;
            return;
        } else {
        
            final GProject newProject = GProject.getProject(elt);
            if (newProject.getSession() != this.session) {
                this.session = newProject.getSession();
                this.modelServices = new MModelServices(newProject);
            }
        
            this.currentInput = elt;
            this.view.setInput(elt);
        
            // Drive the current selection
            if (this.currentSelection != null && this.currentSelection.equals(select)) {
                // Do nothing to avoid selecting already selected item
            } else {
                this.currentSelection = select;
                this.view.setSelected(select);
            }
        }
    }

    /**
     * Constructor.
     */
    @objid ("bf0c5ca6-f12e-4cf8-98ef-ef3d1dcf86e7")
    public NotesPanelController(EContextService contextService) {
        this.contextService = contextService;
    }

    /**
     * Called when the end-user double-clicks a Note or a Constraint in the tree
     * @param selection the double clicked selection
     */
    @objid ("6366391a-5686-4c22-a3fa-75e965dc0393")
    public void onItemDoubleClick(ISelection selection) {
        // System.out.println("NotesPanelController.onDoubleClick()");
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            final Object object = structuredSelection.getFirstElement();
            if (object != null && object instanceof MObject) {
                if (this.activationService != null) {
                    this.activationService.activateMObject((MObject) object);
                }
            }
        }
    }

    /**
     * Called when the end-user selects a Note or a Constraint in the tree
     * @param selection the new selection
     */
    @objid ("32b038c3-5263-42ae-b6df-d71135247543")
    public void onItemSelectionChange(ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            final Object object = structuredSelection.getFirstElement();
            if (object != null && object instanceof ModelElement) {
        
                if (object.equals(this.currentSelection)) {
                    // do nothing
                } else {
                    this.currentSelection = (ModelElement) object;
                    setInputs(this.currentInput, (ModelElement) object);
                }
        
            } else {
                setInputs(this.currentInput, null);
            }
        }
    }

    /**
     * Called when the end-user clicks on the 'add constraint' button.
     */
    @objid ("9008cd49-44b1-499b-9033-df19df8e2dab")
    public void onAddConstraint() {
        final Shell parentShell = this.view.getComposite().getShell();
        final ConstraintChooserDriver driver = new ConstraintChooserDriver(this.session, this.modelServices, null);
        final ElementChooserDlg dialog = new ElementChooserDlg(parentShell, driver, this.currentInput);
        // Don't return from open() until window closes
        dialog.setBlockOnOpen(true);
        // Open the main window
        dialog.open();
        
        final Constraint constraint = driver.getCreatedConstraint();
        setInputs(this.currentInput, constraint);
    }

    /**
     * Calls the create note dialog.
     */
    @objid ("c5d70a26-135f-4b97-95cd-16f7f8b5c457")
    public void onAddNote() {
        final AddNoteHelper handler = new AddNoteHelper(this.session, this.modelServices);
        final Shell parentShell = this.view.getComposite().getShell();
        
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("Move annotation up")) {
            final Note note = handler.execute(parentShell, this.currentInput, null, null);
            if (note != null) {
                transaction.commit();
            } else {
                transaction.rollback();
            }
            setInputs(this.currentInput, note);
        } catch (final Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    /**
     * Creates a description note.
     */
    @objid ("0102e1de-4864-45ce-ba5d-f61a1053aa6f")
    public void onAddDescription() {
        final AddNoteHelper handler = new AddNoteHelper(this.session, this.modelServices);
        final Shell parentShell = this.view.getComposite().getShell();
        
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("Move annotation up")) {
            final Note note = handler.execute(parentShell, this.currentInput, "ModelerModule", "description");
            if (note != null) {
                transaction.commit();
            } else {
                transaction.rollback();
            }
            setInputs(this.currentInput, note);
        } catch (final Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    /**
     * Creates a rich note
     */
    @objid ("68866547-efab-439f-9121-b0cc49fa6d66")
    public void onAddRichNote() {
        final Shell parentShell = this.view.getComposite().getShell();
        final AddRichNoteHelper handler = new AddRichNoteHelper(this.session, this.modelServices);
        
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("AddDocument")) {
            final ExternDocument doc = handler.execute(parentShell, this.currentInput);
        
            if (doc != null) {
                transaction.commit();
            } else {
                transaction.rollback();
            }
            setInputs(this.currentInput, doc);
        } catch (final Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    /**
     * Delete an annotation
     */
    @objid ("efab7576-34fd-47c5-bbed-8040689cf738")
    public void onRemoveAnnotation() {
        final List<ModelElement> noteItems = this.view.getSelectedNotes();
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("NoteDeletion")) {
            for (final ModelElement noteItem : noteItems) {
                noteItem.delete();
            }
            transaction.commit();
        } catch (final Exception e) {
            EditionNotes.LOG.error(EditionNotes.PLUGIN_ID, e);
        }
        setInputs(this.currentInput, null);
    }

    /**
     * Clear the note content
     */
    @objid ("9ac30f2a-813c-470a-9f90-64928f96c167")
    public void onCleanContent() {
        final CleanNoteContentHelper handler = new CleanNoteContentHelper();
        final List<ModelElement> selectedNotes = this.view.getSelectedNotes();
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("Clear note content")) {
            if (handler.execute(this.currentInput, selectedNotes)) {
                transaction.commit();
                setInputs(this.currentInput, selectedNotes.get(0));
            } else {
                transaction.rollback();
            }
        
        } catch (final Exception e) {
            EditionNotes.LOG.error(EditionNotes.PLUGIN_ID, e);
        }
    }

    /**
     * Move up
     */
    @objid ("d6b21abc-5bba-4cb8-b592-144587627406")
    public void onMoveUp() {
        final MoveUpHelper handler = new MoveUpHelper();
        final List<ModelElement> selectedNotes = this.view.getSelectedNotes();
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("Move annotation up")) {
            if (handler.execute(this.currentInput, selectedNotes)) {
                transaction.commit();
                setInputs(this.currentInput, selectedNotes.get(0));
            } else {
                transaction.rollback();
            }
        } catch (final Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    /**
     * Move down
     */
    @objid ("ce1e55d4-9f70-4fa7-ab88-c9a16bc417de")
    public void onMoveDown() {
        final MoveDownHelper handler = new MoveDownHelper();
        final List<ModelElement> selectedNotes = this.view.getSelectedNotes();
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction("Move annotation up")) {
            if (handler.execute(this.currentInput, selectedNotes)) {
                transaction.commit();
                setInputs(this.currentInput, selectedNotes.get(0));
            } else {
                transaction.rollback();
            }
        } catch (final Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    @objid ("0cd4271f-ce9b-46dc-bb1c-7c26d91806f0")
    static void reportException(Exception e) {
        // Show an error box
        final String title = EditionNotes.I18N.getMessage("CannotPasteClipboard");
        MessageDialog.openError(null, title, e.getLocalizedMessage());
        EditionNotes.LOG.error(e);
    }

    /**
     * @return the activation service
     */
    @objid ("f7d4c954-c3aa-4cb8-ad93-58b3baea5949")
    public IActivationService getActivationService() {
        return this.activationService;
    }

    @objid ("2dc8ac0f-8a13-491a-91c6-3e30f5a586a6")
    public void onHorizontalLayout() {
        this.view.setHorizontalLayout();
        this.view.disableAutoLayout();
    }

    @objid ("7992016b-84ab-4482-92d1-d08fabbe70a7")
    public void onVerticalLayout() {
        this.view.setVerticalLayout();
        this.view.disableAutoLayout();
    }

    @objid ("b1b16c90-a49a-4a19-9ae2-7bbac4e55419")
    public void onAutomaticLayout() {
        this.view.enableAutoLayout();
    }

    @objid ("5cecdcce-b65a-49e9-8bcc-a89f43c4dc68")
    public ModelElement getInput() {
        return this.currentInput;
    }

    @objid ("02687762-4ee3-45dc-aaa9-69459bd66e27")
    public boolean canAddConstraint() {
        return AddConstraintHelper.canExecute(this.currentInput, this.view.getSelectedNotes());
    }

    @objid ("7c37cdf0-08be-4000-bf65-215e7cd52be5")
    public boolean canAddNote() {
        return AddNoteHelper.canExecute(this.currentInput, this.view.getSelectedNotes());
    }

    @objid ("f7715626-2cfc-46a0-a787-56f2f8592bb0")
    public boolean canAddRichNote() {
        return AddRichNoteHelper.canExecute(this.currentInput, this.view.getSelectedNotes());
    }

    @objid ("c7df9aa7-c04d-49e8-86c4-2e3065bd6f36")
    public boolean canRemoveAnnotation() {
        if (this.currentInput == null || !this.currentInput.isModifiable()) {
            return false;
        }
        final List<ModelElement> selectedItems = this.view.getSelectedNotes();
        for (final ModelElement e : selectedItems) {
            if (!e.isModifiable()) {
                return false;
            }
        }
        return selectedItems.size() > 0;
    }

    @objid ("48b2e663-2b10-4b60-a5f4-d9b03f40d051")
    public boolean canCleanContent() {
        if (this.currentInput == null || !this.currentInput.isModifiable()) {
            return false;
        }
        
        final List<ModelElement> selectedItems = this.view.getSelectedNotes();
        return selectedItems.size() == 1 && selectedItems.get(0).isModifiable();
    }

    @objid ("03b46f3c-e5e4-4527-9c0b-38fd27f4851a")
    public boolean canMoveUp() {
        return MoveUpHelper.canExecute(this.currentInput, this.view.getSelectedNotes());
    }

    @objid ("582b3276-c5b0-4f98-89db-093afe12d0b1")
    public boolean canMoveDown() {
        return MoveDownHelper.canExecute(this.currentInput, this.view.getSelectedNotes());
    }

    @objid ("5e158c5f-e99d-4893-8a06-1cb8414322b3")
    private void refreshInputs() {
        this.view.setInput(this.currentInput);
        this.view.setSelected(this.currentSelection);
    }

    /**
     * Disposes the panel controler and SWT widgets.
     */
    @objid ("90e169aa-6dcf-4fe2-be55-636248064d35")
    public void dispose() {
        this.view.dispose();
        this.currentInput = null;
        this.currentSelection = null;
        this.view = null;
    }

    /**
     * Set the activation service.
     * @param activationService the activation service.
     */
    @objid ("0a377ddb-5843-4e2c-bcd4-62fcc9b153a2")
    public void setActivationService(IActivationService activationService) {
        this.activationService = activationService;
    }

    @objid ("d43361df-877d-4b62-af58-dcdec22244d0")
    public EContextService getContextService() {
        return this.contextService;
    }

    /**
     * This listener is called when the model is modified.<br>
     * Its responsibility is to refresh the NotesView for the current element.
     */
    @objid ("a30e4809-ca22-4945-9133-8f01d0f1f46d")
    private static class ModelChangeListener implements IModelChangeListener, IStatusChangeListener {
        @objid ("eb5de178-29ce-4a92-bb78-1ca68443b822")
        protected NotesPanelProvider notesView;

        @objid ("c551ab51-d847-46e3-8071-ca88f28a4a92")
        public ModelChangeListener(final NotesPanelProvider notesView) {
            this.notesView = notesView;
        }

        @objid ("a334d75f-c39b-4af7-b43a-63fc683022e4")
        @Override
        public void modelChanged(final IModelChangeEvent event) {
            // Re enter the UI thread
            final Display display = Display.getDefault();
            if (display != null) {
                display.asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        // ModelChangeListener.this.notesView.refreshView();
                    }
                });
            }
        }

        @objid ("eae571b9-3141-4573-8283-7cfce9349ec9")
        @Override
        public void statusChanged(final IStatusChangeEvent event) {
            // Re enter the UI thread
            final Display display = Display.getDefault();
            if (display != null) {
                display.asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        // ModelChangeListener.this.notesView.refreshView();
                    }
                });
            }
        }

    }

}
