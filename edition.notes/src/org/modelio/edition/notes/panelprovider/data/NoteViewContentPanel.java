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


package org.modelio.edition.notes.panelprovider.data;

import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.edition.notes.panelprovider.data.constraints.ConstraintContentComposite;
import org.modelio.edition.notes.panelprovider.data.externs.ExternNoteContentComposite;
import org.modelio.edition.notes.panelprovider.data.htmlnotes.HtmlNoteContentComposite;
import org.modelio.edition.notes.panelprovider.data.notes.NoteContentComposite;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.session.api.ICoreSession;

/**
 * This class provide the panel that display the note content, constraint content or extern document.
 */
@objid ("4c5f1638-62d4-4ce4-b424-1e9ece38c5e0")
public class NoteViewContentPanel implements IPanelProvider {
    @objid ("114224e6-7978-4896-816e-1c4112f54fe8")
    private INoteContent currentContent = null;

    @objid ("cd8ddccd-1a3e-470b-9229-6f437ab1b659")
    private ModelElement element = null;

    @objid ("da0cd2c0-9be1-4405-8a8e-7bcc0b36f3b9")
    private final ICoreSession modelingSession = null;

    @objid ("2cb38a53-7306-4c18-8024-89187d18a679")
    private StackLayout stackLayout = null;

    @objid ("46bbc600-a11b-4182-9d2c-2e5bdd382d9b")
    private NoteContentComposite noteContentComposite = null;

    @objid ("2de5fef0-95fe-4d03-abb0-74d9f04c6830")
    private Composite contentArea = null;

    @objid ("4c046fc2-978a-453d-82bb-c2b850fe38ec")
    private ConstraintContentComposite constraintContentComposite = null;

    @objid ("3f0bb734-746c-48d2-8afc-95ab2258c984")
    private ExternNoteContentComposite externNoteContentComposite;

    @objid ("f2fa06f0-770e-481e-9968-4bc672246e6a")
    private static Pattern REGEX_IS_HTML = Pattern.compile(".*\\<[^>]+>.*", Pattern.DOTALL);

    @objid ("d075ba50-d71a-484a-8c89-3028a7dede89")
    private final IActivationService activationService;

    @objid ("1368b567-b719-4b0f-8059-64b3f57573fb")
    private HtmlNoteContentComposite htmlNoteContentComposite = null;

    @objid ("9a39f62e-adb4-491f-88c8-b9a650670b7a")
    private final EContextService contextService;

    @objid ("05eee4bd-c151-406a-8728-6cdcc4a178c4")
    public NoteViewContentPanel(IActivationService activationService, EContextService contextService) {
        this.activationService = activationService;
        this.contextService = contextService;
    }

    @objid ("cd190d68-a0d3-465d-ac76-3cf301d7c491")
    @Override
    public void setInput(Object input) {
        // cleanContent();
        
        if (input == null) {
            this.currentContent = null;
            this.stackLayout.topControl = null;
            this.contentArea.layout();
            return;
        }
        
        if (!(input instanceof ModelElement)) {
            return;
        }
        
        final ModelElement elt = (ModelElement) input;
        
        if (elt.isDeleted()) {
            this.currentContent = null;
            this.contentArea.layout();
            return;
        }
        
        if (elt instanceof Note) {
            this.element = elt;
            if (isHtmlNote((Note) elt)) {
                this.currentContent = this.htmlNoteContentComposite;
            } else {
                this.currentContent = this.noteContentComposite;
            }
        } else if (elt instanceof Constraint) {
            this.element = elt;
            this.currentContent = this.constraintContentComposite;
        } else if (elt instanceof ExternDocument) {
            this.element = elt;
            this.currentContent = this.externNoteContentComposite;
        }
        
        this.stackLayout.topControl = this.currentContent.getControl();
        this.currentContent.getControl().redraw();
        this.contentArea.layout(true);
        
        if (this.currentContent != null && !this.element.isDeleted()) {
            this.currentContent.setInput(this.element);
        }
    }

    /**
     * Clean up existing note content
     */
    @objid ("e0ed1a96-ea17-4e83-840e-f14f0616e3cf")
    public void cleanContent() {
        if (this.currentContent != null) {
            this.currentContent.setInput(null);
            this.currentContent = null;
            this.stackLayout.topControl = null;
        }
    }

    @objid ("d14c9fd8-b792-4fe5-a913-81632e59ee98")
    protected boolean isHtmlNote(Note note) {
        final String mimeType = note.getMimeType() != null && !note.getMimeType().isEmpty() ? note.getMimeType() : note.getModel()
                .getMimeType();
        return mimeType.contains("html");
        // final String content = note.getContent();
        //
        // if (content.trim().startsWith("<html"))
        // return true;
        //
        // final NoteType noteType = note.getModel();
        // if (noteType == null)
        // return false;
        //
        // if (noteType.getMimeType().toLowerCase().contains("html"))
        // return true;
        //
        // if (noteType.getName().equals("description")) {
        // // return true unless the content is plain text.
        // return REGEX_IS_HTML.matcher(content).matches();
        // }
        // return false;
    }

    @objid ("4c95da10-12da-48f2-9e4d-0f9e9a5c1736")
    @Override
    public boolean isRelevantFor(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("afe19b39-f51d-4823-ad8d-2901c119f282")
    @Override
    public Object createPanel(Composite parent) {
        this.contentArea = new Composite(parent, SWT.NONE);
        this.stackLayout = new StackLayout();
        this.contentArea.setLayout(this.stackLayout);
        this.noteContentComposite = new NoteContentComposite(this.contentArea, SWT.NONE, this.contextService);
        this.htmlNoteContentComposite = new HtmlNoteContentComposite(this.contentArea, SWT.NONE, this.contextService);
        this.constraintContentComposite = new ConstraintContentComposite(this.contentArea, SWT.NONE, this.contextService);
        this.externNoteContentComposite = new ExternNoteContentComposite(this.contentArea, SWT.NONE, this.activationService);
        return this.contentArea;
    }

    @objid ("a1817f34-1537-454b-b171-3161b05fdce0")
    @Override
    public Object getPanel() {
        return this.contentArea;
    }

    @objid ("d1a324ea-151f-4809-9442-f2dea26d5b5e")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("0f815972-bb6b-4747-84a1-63e7eb11f5ba")
    @Override
    public Object getInput() {
        if (this.currentContent != null) {
            return this.currentContent.getNoteElement();
        } else {
            return null;
        }
    }

    @objid ("40e14112-6e79-43fc-bc9c-380a6c48ce51")
    @Override
    public void dispose() {
        this.constraintContentComposite.dispose();
        this.noteContentComposite.dispose();
    }

    @objid ("463f9c45-f040-4929-b369-1358869911d8")
    private boolean isHTMLNote(Note note) {
        return note.getMimeType() != null && note.getMimeType().contains("html") || note.getModel().getMimeType() != null
                                        && note.getModel().getMimeType().contains("html");
    }

}
