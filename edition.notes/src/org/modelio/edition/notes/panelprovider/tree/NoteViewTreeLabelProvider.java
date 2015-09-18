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
                                    

package org.modelio.edition.notes.panelprovider.tree;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.core.ui.images.ElementImageService;
import org.modelio.core.ui.images.ElementStyler;
import org.modelio.core.ui.images.ModuleI18NService;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.editors.richnote.helper.RichNoteLabelProvider;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

/**
 * Label provider of the annotation tree.
 */
@objid ("e203c493-ddb7-41a7-9e01-2b4bf61691e8")
public class NoteViewTreeLabelProvider extends LabelProvider implements IStyledLabelProvider {
    @objid ("5e3a2841-7c77-4dd3-bba0-5958944993a2")
     static final Font normalFont = CoreFontRegistry.getFont(Display.getCurrent().getSystemFont().getFontData());

    @objid ("cd5c051c-d436-4083-bf33-b1072ee1c3bb")
     static final Font italicFont = CoreFontRegistry.getModifiedFont(normalFont, SWT.ITALIC);

    @objid ("11414203-df81-4e9b-9ee6-8105651daec5")
    @Override
    public Image getImage(Object element) {
        if (element instanceof ExternDocument) {
            return RichNoteLabelProvider.getIcon((ExternDocument) element);
        } else if (element instanceof Element) {
            return ElementImageService.getIcon((Element) element);
        }
        return null;
    }

    @objid ("cf0a37b1-e783-4472-9e77-4d66c48aaea0")
    @Override
    public String getText(Object element) {
        if (element instanceof Note) {
            Note note = (Note) element;
            NoteType type = note.getModel();
        
            String mime = isHtmlNote(note) ? " [html]" : "";
        
            if (type != null) {
                return ModuleI18NService.getLabel(type) + mime;
            } else {
                return EditionNotes.I18N.getString("Note") + mime;
            }
        } else if (element instanceof ExternDocument) {
            final ExternDocument document = (ExternDocument) element;
            final ExternDocumentType type = document.getType();
            if (type != null) {
                String name = document.getName();
                if (!name.isEmpty()) {
                    name += " ";
                }
        
                final String label = ModuleI18NService.getLabel(type);
                return label.isEmpty() ? name + "[" + type.getName() + "]" : name + "[" + label + "]";
        
            } else {
                return EditionNotes.I18N.getString("ExternDocument");
            }
        } else if (element instanceof Constraint) {
            final Constraint constraint = (Constraint) element;
        
            // If the name is filled we use it for the constraint label
            final String name = constraint.getName();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        
            // If the name is not filled and if there is at least on stereotype on the constraint
            // we use the first stereotype name as a label.
            final List<Stereotype> stereotypes = constraint.getExtension();
            if (stereotypes.size() > 0) {
                final Stereotype stereotype = getFirstSelected(stereotypes);
        
                if (stereotype != null) {
                    return ModuleI18NService.getLabel(stereotype);
                }
            }
        
            // If there is no name and no stereotype we set "Constraint" as a label
            return EditionNotes.I18N.getString("Constraint");
        }
        return element.toString();
    }

    @objid ("6fd1fd28-ef88-48ff-8b92-77475605a66b")
    private static Stereotype getFirstSelected(List<Stereotype> stereotypes) {
        for (Stereotype stereotype : stereotypes) {
            ModuleComponent module = stereotype.getOwner().getOwnerModule();
            if (module != null) {
                return stereotype;
            }
        }
        return null;
    }

    @objid ("5ab80118-b628-4040-b7c2-6d601846c298")
    private boolean isHtmlNote(Note note) {
        String mimeType = (note.getMimeType() != null && !note.getMimeType().isEmpty()) ? note.getMimeType() : note.getModel()
                .getMimeType();
        return mimeType.contains("html");
    }

    @objid ("447e3e09-1be0-4cda-b5da-b063fe02a942")
    @Override
    public StyledString getStyledText(Object element) {
        if (element instanceof Element) {
            return new StyledString(getText(element), ElementStyler.getStyler((Element)element));
        } else {
            return new StyledString(getText(element));
        }
    }

}
