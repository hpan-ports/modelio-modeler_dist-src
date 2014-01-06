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
                                    

package org.modelio.edition.notes.view.data.notes;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.edition.notes.view.NotesView;
import org.modelio.edition.notes.view.data.INoteContent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.ui.UIColor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;

@objid ("26ef6c47-186f-11e2-bc4e-002564c97630")
public class NoteContentComposite extends Composite implements INoteContent {
    @objid ("26ef6c48-186f-11e2-bc4e-002564c97630")
    private Note note = null;

    @objid ("26ef6c49-186f-11e2-bc4e-002564c97630")
    private ModelElement annotedElement = null;

    @objid ("26ef6c4a-186f-11e2-bc4e-002564c97630")
    private Text noteText = null;

    @objid ("26ef6c4c-186f-11e2-bc4e-002564c97630")
    private NoteContentModifier noteModifier = null;

    @objid ("26ef6c4d-186f-11e2-bc4e-002564c97630")
    public NoteContentComposite(Composite parentComposite, int style) {
        super(parentComposite, style);
        setLayout(new FillLayout());
        
        this.noteText = new Text(this, SWT.BORDER | SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
    }

    @objid ("26ef6c51-186f-11e2-bc4e-002564c97630")
    @Override
    public void setInput(final ModelElement aNote, final ModelElement annotedElement) {
        this.note = ((Note) aNote);
        this.annotedElement = annotedElement;
        
        if (this.note != null) {
            this.noteText.setText(this.note.getContent());
            this.noteText.setData(this.note);
            
            if (this.note.isModifiable()) {
                this.noteText.setBackground(UIColor.POST_IT_BG);
            } else {
                this.noteText.setBackground(UIColor.TEXT_READONLY_BG);
            }
        } else {
            this.noteText.setText("");
            this.noteText.setData(null);
            this.noteText.setBackground(UIColor.TEXT_READONLY_BG);
        }
    }

    @objid ("26ef6c58-186f-11e2-bc4e-002564c97630")
    @Override
    public void start(ICoreSession newSession) {
        if (newSession != null) {
            this.noteModifier = new NoteContentModifier(newSession);
        
            this.noteText.addFocusListener(this.noteModifier);
            this.noteText.addKeyListener(this.noteModifier);
        }
    }

    @objid ("26ef6c5c-186f-11e2-bc4e-002564c97630")
    @Override
    public void stop() {
        if (this.noteModifier != null) {
            this.noteText.removeFocusListener(this.noteModifier);
            this.noteText.removeKeyListener(this.noteModifier);
        }
    }

    @objid ("26ef6c5f-186f-11e2-bc4e-002564c97630")
    @Override
    public Control getControl() {
        return this;
    }

    @objid ("26f1cd82-186f-11e2-bc4e-002564c97630")
    @Override
    public ModelElement getNoteElement() {
        return this.note;
    }

    @objid ("26f1cd87-186f-11e2-bc4e-002564c97630")
    @Override
    public ModelElement getAnnotedElement() {
        return this.annotedElement;
    }

    @objid ("26f1cd8c-186f-11e2-bc4e-002564c97630")
    private static class NoteContentModifier implements FocusListener, KeyListener {
        @objid ("0158f9f6-0bfa-43fd-b299-c28c4deb4bc0")
        private ArrayList<String> activeContexts;

        @objid ("26ef6c4b-186f-11e2-bc4e-002564c97630")
        private ICoreSession modelingSession = null;

        @objid ("26f1cd8d-186f-11e2-bc4e-002564c97630")
        @Override
        public void focusGained(final FocusEvent event) {
            // We must deactivate the active contexts during the edition, to avoid the editor's shortcuts to be triggered when entering an element's name... 
            
            // Store those contexts for further reactivation
            this.activeContexts = new ArrayList<>(NotesView.contextService.getActiveContextIds());
            for (String contextId : this.activeContexts) {
                NotesView.contextService.deactivateContext(contextId);
            }
            
            Text text = (Text) event.getSource();
            Note note = (Note) text.getData();
            
            if (note != null) {
                if (note.getStatus().isModifiable()) {
                    text.setBackground(UIColor.TEXT_WRITABLE_BG);
                } else {
                    text.getShell().setFocus();
                }
            }
        }

        @objid ("26f1cd92-186f-11e2-bc4e-002564c97630")
        @Override
        public void focusLost(final FocusEvent event) {
            validate(event);
            
            // Restore previously deactivated contexts
            for (String contextId : this.activeContexts) {
                NotesView.contextService.activateContext(contextId);
            }
            this.activeContexts = null;
        }

        @objid ("26f1cd97-186f-11e2-bc4e-002564c97630")
        @Override
        public void keyPressed(final KeyEvent event) {
            if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == SWT.CR) {
                event.doit = false;
            }
        }

        @objid ("26f1cd9c-186f-11e2-bc4e-002564c97630")
        @Override
        public void keyReleased(final KeyEvent event) {
            Text text = (Text) event.getSource();
            Note note = (Note) text.getData();
            
            if (event.keyCode == SWT.ESC) {
                // restore content from note
                text.setText(note.getContent());
                // this.notesList.getControl().setFocus();
            } else if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == SWT.CR) {
                validate(event);
                text.getShell().setFocus();
            } else if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == 'a') {
                text.selectAll();
            }
        }

        @objid ("26f1cda1-186f-11e2-bc4e-002564c97630")
        private void validate(final TypedEvent event) {
            Text text = (Text) event.getSource();
            Note note = (Note) text.getData();
            
            if (note != null && note.getStatus().isModifiable()) {
                String s = text.getText();
            
                if (!s.equals(note.getContent())) {
                    try (ITransaction transaction = this.modelingSession.getTransactionSupport().createTransaction(
                            EditionNotes.I18N.getString("UpdateDescriptionNote"))) {
                        s = s.replaceAll("\r\n", "\n");
                        note.setContent(s);
                        transaction.commit();
                    }
                }
                
                if (note.isModifiable()) {
                    text.setBackground(UIColor.POST_IT_BG);
                } else {
                    text.setBackground(UIColor.TEXT_READONLY_BG);
                }
            }
        }

        @objid ("fb9d07dc-19e5-11e2-ad19-002564c97630")
        public NoteContentModifier(ICoreSession modelingSession) {
            this.modelingSession = modelingSession;
        }

    }

}
