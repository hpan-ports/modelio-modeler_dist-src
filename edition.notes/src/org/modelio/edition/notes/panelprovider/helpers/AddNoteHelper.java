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
                                    

package org.modelio.edition.notes.panelprovider.helpers;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Shell;
import org.modelio.core.ui.elementChooser.ElementChooserDlg;
import org.modelio.edition.notes.noteChooser.NoteChooserDriver;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;

@objid ("5642646f-9400-4836-a7f0-9aefa13b727f")
public class AddNoteHelper extends AbstractHelper {
    @objid ("688106b2-79cc-4b6d-9e28-59a64f842581")
    private ICoreSession session;

    @objid ("d6d3af77-4aae-4f2a-a702-c5912dceed90")
    private IMModelServices modelServices;

    @objid ("c1bebdb1-aa25-4fea-a178-188bce23f211")
    public AddNoteHelper(ICoreSession session, IMModelServices modelServices) {
        this.session = session;
        this.modelServices = modelServices;
    }

    @objid ("4f71f6b8-9659-4643-80cb-671da420d540")
    public static boolean canExecute(ModelElement element, List<ModelElement> selectedItems) {
        return (element != null) && (element.isModifiable());
    }

    @objid ("ffc9a9dc-00e0-4c48-83ee-89ac080caffc")
    private Note createNoteFromUserChoice(final Shell parentShell, final ModelElement element) {
        NoteChooserDriver driver = new NoteChooserDriver(this.session, this.modelServices);
        ElementChooserDlg dialog = new ElementChooserDlg(parentShell, driver, element);
        // Don't return from open() until window closes
        dialog.setBlockOnOpen(true);
        // Open the main window
        dialog.open();
        return driver.getCreatedNote();
    }

    @objid ("e86feefd-07b0-4b06-aafa-532279d3e2fe")
    private Note createNoteFromType(final ModelElement element, final String moduleName, final String noteTypeName) {
        try (ITransaction transaction = this.session.getTransactionSupport().createTransaction(
                EditionNotes.I18N.getString("AddNote"))) {
            try {
                element.putNoteContent(moduleName, noteTypeName, EditionNotes.I18N.getString("EnterNoteBody"));
            } catch (ExtensionNotFoundException e) {
                EditionNotes.I18N.equals(e);
            }
            transaction.commit();
        }
        return element.getNote(moduleName, noteTypeName);
    }

    @objid ("4ee48b5a-c60f-4c43-976a-026a4820f783")
    public Note execute(Shell parentShell, ModelElement element, String noteModule, String noteType) {
        if (noteModule == null || noteType == null) {
            return createNoteFromUserChoice(parentShell, element);
        } else {
            return createNoteFromType(element, noteModule, noteType);
        }
    }

}
