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
                                    

package org.modelio.edition.notes.panelprovider.data.externs;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TypedEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.edition.notes.panelprovider.data.INoteContent;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.UIColor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * Right panel for rich notes.
 */
@objid ("6c9e3dd4-fbcd-4367-b8cd-131274cbef9e")
public class ExternNoteContentComposite extends Composite implements INoteContent {
    @objid ("54c3b617-eb8e-4b2b-8602-4f92e36b486f")
    protected ExternDocument xdoc = null;

    @objid ("303378e6-a99c-4c2f-9c29-bc3d926e962e")
    protected ICoreSession modelingSession = null;

    @objid ("adc00d90-b668-4cdb-a319-b3df63c332bf")
    private ExternNoteContentModifier noteModifier = null;

    @objid ("f2ec10e7-fde9-406a-b5e4-df0127b39d42")
    private Text text = null;

    @objid ("2ef176f2-ff2d-4ba7-9971-a8a31f0f6a6d")
    private final Button editButton;

    @objid ("f39740a3-05d5-4f19-bac0-f5e9e4443fa2")
    private IActivationService activationService;

    /**
     * Constructor
     * @param parentComposite the parent composite
     * @param style style bits
     * @param activationService Modelio activation service
     */
    @objid ("e462316d-035f-4e7f-9445-80c56ca92e1f")
    public ExternNoteContentComposite(Composite parentComposite, int style, IActivationService activationService) {
        super(parentComposite, style);
        
        this.activationService = activationService;
        
        GridLayout layout = new GridLayout(1, true);
        setLayout(layout);
        
        this.text = new Text(this, SWT.BORDER | SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
        this.noteModifier = new ExternNoteContentModifier();
        GridData gdText = new GridData();
        gdText.grabExcessHorizontalSpace = true;
        gdText.horizontalAlignment = SWT.FILL;
        gdText.grabExcessVerticalSpace = true;
        gdText.verticalAlignment = SWT.FILL;
        this.text.setLayoutData(gdText);
        // this.text.setToolTipText(EditionNotes.I18N.getString("DocumentAbstract.tooltip"));
        
        this.editButton = new Button(this, SWT.PUSH);
        
        GridData gdButton = new GridData();
        gdButton.grabExcessHorizontalSpace = true;
        gdButton.horizontalAlignment = SWT.FILL;
        this.editButton.setLayoutData(gdButton);
        this.editButton.setText(EditionNotes.I18N.getString("EditDocumentButton.label"));
        this.editButton.setToolTipText(EditionNotes.I18N.getString("EditDocumentButton.tooltip"));
        
        this.editButton.addSelectionListener(new SelectionListener() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (getActivationService() != null)
                    getActivationService().activateMObject(ExternNoteContentComposite.this.xdoc);
            }
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // nothing to do
            }
        });
    }

    @objid ("1f4b325b-99f5-467f-84a5-d41adf9084f9")
    @Override
    public void setInput(final ModelElement aNote) {
        if (aNote != null) {
            this.xdoc = ((ExternDocument) aNote);
            this.text.setText(this.xdoc.getAbstract());
            this.text.setData(this.xdoc);
            if (aNote.isModifiable()) {
                this.text.setBackground(UIColor.POST_IT_BG);
            } else {
                this.text.setBackground(UIColor.TEXT_READONLY_BG);
            }
            start(CoreSession.getSession(aNote));
        } else {
            this.xdoc = null;
            this.text.setText("");
            this.text.setData(null);
            this.text.setBackground(UIColor.TEXT_READONLY_BG);
            stop();
        }
    }

    @objid ("a35fca49-75b6-4c15-b6c0-0e6385fb0fe9")
    private void start(ICoreSession session) {
        this.modelingSession = session;
        this.text.addFocusListener(this.noteModifier);
        this.text.addKeyListener(this.noteModifier);
    }

    @objid ("1e472e22-a59f-42e0-842f-931b15697067")
    private void stop() {
        this.text.removeFocusListener(this.noteModifier);
        this.text.removeKeyListener(this.noteModifier);
        this.modelingSession = null;
    }

    @objid ("812ca644-67e1-4dc1-9014-9590138af34c")
    @Override
    public Control getControl() {
        return this;
    }

    @objid ("c6758394-afb7-46d4-b8ca-fa736de85b7f")
    @Override
    public ModelElement getNoteElement() {
        return this.xdoc;
    }

    @objid ("c37b3248-9954-4e18-91b2-9c9ea3f5f1d5")
    IActivationService getActivationService() {
        return this.activationService;
    }

    @objid ("6ea8986a-246f-4043-8af6-1b02a7acf79e")
    private class ExternNoteContentModifier implements FocusListener, KeyListener {
        @objid ("d03deca2-ed91-4d51-b6f4-304700553765")
        public ExternNoteContentModifier() {
        }

        @objid ("a430b9a0-19d4-463d-aaeb-c26154a46be9")
        @Override
        public void focusGained(final FocusEvent event) {
            Text externDocText = (Text) event.getSource();
            ExternDocument externNote = (ExternDocument) externDocText.getData();
            
            if (externNote != null) {
                if (externNote.getStatus().isModifiable()) {
                    externDocText.setBackground(UIColor.TEXT_WRITABLE_BG);
                } else {
                    externDocText.getShell().setFocus();
                }
            }
        }

        @objid ("b274d908-cf3b-4721-96fa-21fba4118eb8")
        @Override
        public void focusLost(final FocusEvent event) {
            validate(event);
        }

        @objid ("3f46daaa-f3be-4f5f-99bd-987bad7b5778")
        @Override
        public void keyPressed(final KeyEvent event) {
            if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == SWT.CR) {
                event.doit = false;
            }
        }

        @objid ("d97cd98f-1d5e-4698-9c27-a981c70adb11")
        @Override
        public void keyReleased(final KeyEvent event) {
            Text externDocText = (Text) event.getSource();
            ExternDocument note = (ExternDocument) externDocText.getData();
            
            if (event.keyCode == SWT.ESC) {
                // restore content from note
                externDocText.setText(note.getAbstract());
                // this.notesList.getControl().setFocus();
            } else if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == SWT.CR) {
                validate(event);
                externDocText.getShell().setFocus();
            } else if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == 'a') {
                externDocText.selectAll();
            }
        }

        @objid ("bec4e7ec-22a9-411f-a91b-e47a7513d95a")
        private void validate(final TypedEvent event) {
            Text externDocText = (Text) event.getSource();
            ExternDocument note = (ExternDocument) externDocText.getData();
            
            if (note != null && note.getStatus().isModifiable()) {
                String s = externDocText.getText();
            
                if (!s.equals(note.getAbstract())) {
                    try (ITransaction transaction = ExternNoteContentComposite.this.modelingSession.getTransactionSupport()
                            .createTransaction(EditionNotes.I18N.getString("UpdateDescriptionNote"))) {
                        s = s.replaceAll("\r\n", "\n");
                        note.setAbstract(s);
                        transaction.commit();
                    }
                }
            
                if (note.isModifiable()) {
                    externDocText.setBackground(UIColor.POST_IT_BG);
                } else {
                    externDocText.setBackground(UIColor.TEXT_READONLY_BG);
                }
            }
        }

    }

}
