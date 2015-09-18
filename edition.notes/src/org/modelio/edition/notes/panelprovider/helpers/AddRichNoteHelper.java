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

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;
import org.modelio.editors.richnote.api.RichNoteCreator;
import org.modelio.editors.richnote.gui.typechooser.PromptRichNoteDescriptorDlg;
import org.modelio.editors.richnote.gui.typechooser.RichNoteDescriptor;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f2c61928-94e8-4e9f-9b81-89cd5bf2bae0")
public class AddRichNoteHelper extends AbstractHelper {
    @objid ("fbb4b086-994e-40c9-9602-1ed2fcb97287")
    private ICoreSession session;

    @objid ("43343fef-6a79-49ee-a7ff-de5b4acb2914")
    private IMModelServices modelServices;

    @objid ("ed4b0b91-c501-41cb-a59a-5b774a638529")
    public AddRichNoteHelper(ICoreSession session, IMModelServices modelServices) {
        this.session = session;
        this.modelServices = modelServices;
    }

    @objid ("ca1f0495-5499-472a-ba3f-8c0f3b6ce506")
    public static boolean canExecute(ModelElement element, List<ModelElement> selectedItems) {
        return (element != null && element.getStatus().isModifiable());
    }

    @objid ("c5f960bd-57f1-40a2-a23b-a0164ced64ae")
    public ExternDocument execute(Shell parentShell, ModelElement element) throws UnknownServiceException, IOException {
        PromptRichNoteDescriptorDlg dialog = new PromptRichNoteDescriptorDlg(parentShell, new RichNoteDescriptor(element),
                this.modelServices);
        
        // Don't return from open() until window closes
        dialog.setBlockOnOpen(true);
        
        // Open the dialog window
        int ret = dialog.open();
        
        if (ret == IDialogConstants.OK_ID) {
            RichNoteDescriptor richNoteDescriptor = dialog.getRichNoteDescriptor();
            ExternDocument richNote = createRichNote(element, richNoteDescriptor, this.modelServices.getModelFactory(), parentShell);
            return richNote;
        } else {
            return null;
        }
    }

    @objid ("7fcca095-b041-4f7c-adbe-15eb4cc1a2ae")
    private ExternDocument createRichNote(final ModelElement modelElement, final RichNoteDescriptor model, final IModelFactory factory, final Shell parentShell) throws UnknownServiceException, IOException {
        ExternDocument doc = factory.createExternDocument();
        doc.setSubject(modelElement);
        doc.setName(model.getName());
        doc.setType(model.getDocumentType());
        doc.setMimeType(model.getChosenMimeType());
        doc.setAbstract(model.getAbstract());
        // doc.setPath(model.getPath());
        RichNoteCreator.createRichNote(doc);
        return doc;
    }

}
