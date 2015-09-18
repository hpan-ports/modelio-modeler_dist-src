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
                                    

package org.modelio.edition.notes.handlers;

import java.util.List;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.modelio.edition.notes.panelprovider.NotesPanelProvider;
import org.modelio.edition.notes.view.NotesView;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;

@objid ("a0fab034-b065-4b5a-8faf-3b02b95559d6")
public class HtmlConvertHandler {
    @objid ("ac96d358-c5c6-4a81-acff-e1545c2f4e83")
    @Execute
    protected void execute(@Named(IServiceConstants.ACTIVE_PART) final MPart part) {
        final NotesPanelProvider notesPanel = ((NotesView) part.getObject()).getNotesPanel();
        final List<ModelElement> noteItems = notesPanel.getSelectedNotes();
        
        if (noteItems.get(0) instanceof Note) {
            final Note note = (Note) noteItems.get(0);
            final ICoreSession session = CoreSession.getSession(note);
            try (ITransaction t = session.getTransactionSupport().createTransaction("Switch Html/Text type")) {
                if (isHtmlNote(note)) {
                    note.setMimeType("text/plain");
                } else {
                    note.setMimeType("text/html");
                }
                t.commit();
            }
        }
    }

    @objid ("20b5ffd4-587a-47de-a205-cc8d1eccd05b")
    @CanExecute
    protected boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) final MPart part, MMenuItem menuItem) {
        final NotesPanelProvider notesPanel = ((NotesView) part.getObject()).getNotesPanel();
        final List<ModelElement> noteItems = notesPanel.getSelectedNotes();
        if (noteItems.size() != 1) {
            return false;
        } else {
            if (noteItems.get(0) instanceof Note) {
                final Note note = (Note) noteItems.get(0);
                menuItem.setSelected(isHtmlNote(note));
                return note.isModifiable() && isHtmlAllowed(note);
            } else {
                return false;
            }
        }
    }

    @objid ("e9b6492d-0e88-4671-893d-3e86e5e2c1ea")
    private boolean isHtmlNote(Note note) {
        final String mimeType = note.getMimeType() != null && !note.getMimeType().isEmpty() ? note.getMimeType() : note.getModel()
                .getMimeType();
        return mimeType.contains("html");
    }

    @objid ("dc6614b1-d827-4c98-88a0-1b1b33c0310d")
    private boolean isHtmlAllowed(Note note) {
        return note.getModel().getMimeType().contains("html");
    }

}
