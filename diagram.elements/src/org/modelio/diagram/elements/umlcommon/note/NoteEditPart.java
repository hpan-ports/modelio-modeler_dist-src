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
                                    

package org.modelio.diagram.elements.umlcommon.note;

import java.beans.PropertyChangeEvent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.modelio.diagram.elements.common.edition.DirectEditManager2;
import org.modelio.diagram.elements.common.edition.HtmlTextCellEditor;
import org.modelio.diagram.elements.common.edition.MultilineTextCellEditor;
import org.modelio.diagram.elements.common.linkednode.LinkedNodeEndReconnectEditPolicy;
import org.modelio.diagram.elements.core.link.DefaultCreateLinkEditPolicy;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.model.IGmObject;
import org.modelio.diagram.elements.core.node.GmNodeEditPart;
import org.modelio.diagram.elements.core.policies.DefaultElementDirectEditPolicy;

/**
 * Edit part for {@link GmNote}.
 * 
 * @author pvlaemyn
 */
@objid ("818b23fe-1dec-11e2-8cad-001ec947c8cc")
public class NoteEditPart extends GmNodeEditPart {
    @objid ("d4c65ef5-6cab-426f-8af6-c68fc8cd99d0")
     static final Dimension HTML_EDITOR_MIN_SIZE = new Dimension(400,300);

    @objid ("818b2400-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void performRequest(Request req) {
        if (RequestConstants.REQ_DIRECT_EDIT.equals(req.getType())) {
        
            GmNote gmNote = (GmNote) getModel();
            
            if (gmNote.getEditableText() == null)
                return;
        
            final CellEditorLocator cellEditorLocator = new CellEditorLocator() {
                @Override
                public void relocate(CellEditor cellEditor) {
                    final Figure label = getNoteFigure().getContentFigure();
                    final Rectangle rect = label.getBounds().getCopy();
        
                    label.translateToAbsolute(rect);
                    rect.setSize(Dimension.max(rect.getSize(), HTML_EDITOR_MIN_SIZE));
        
                    cellEditor.getControl().setBounds(rect.x, rect.y, rect.width, rect.height);
                }
                
            };
        
            if (gmNote.isHtml()) {
                DirectEditManager2 manager = new HtmlTextEditManager(this, cellEditorLocator);
                manager.show();
            } else {
                DirectEditManager2 manager = new PlainTextEditManager(this, cellEditorLocator);
                manager.show();
            }
        
        } else {
            super.performRequest(req);
        }
    }

    @objid ("818d861e-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(IGmObject.PROPERTY_LABEL)) {
            refreshVisuals();
        } else
            super.propertyChange(evt);
    }

    @objid ("818d8622-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new DefaultElementDirectEditPolicy());
        installEditPolicy(EditPolicy.NODE_ROLE, new DefaultCreateLinkEditPolicy());
        installEditPolicy("notelink", new LinkedNodeEndReconnectEditPolicy());
    }

    @objid ("818d8625-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected IFigure createFigure() {
        Composite viewerControl = (Composite) getViewer().getControl();
        
        // create the figure
        NoteFigure figure1 = new NoteFigure(viewerControl);
        
        // set style independent properties
        //figure1.setSize(100, 50); 
        figure1.setOpaque(true);
        
        // set style dependent properties
        refreshFromStyle(figure1, getModelStyle());
        
        // return the figure
        return figure1;
    }

    /**
     * Get the note figure.
     * @return The note figure.
     */
    @objid ("818d862c-1dec-11e2-8cad-001ec947c8cc")
    protected final NoteFigure getNoteFigure() {
        return (NoteFigure) getFigure();
    }

    /**
     * Refresh this EditPart's visuals.
     * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
     */
    @objid ("818d8631-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected void refreshVisuals() {
        final NoteFigure noteFigure = (NoteFigure) getFigure();
        final GmNote noteModel = (GmNote) getModel();
        
        noteFigure.getParent().setConstraint(noteFigure, noteModel.getLayoutData());
        
        String contents = noteModel.getContents();
        
        noteFigure.setContents(contents, noteModel.isHtml());
        noteFigure.setType(noteModel.getType());
    }

    @objid ("497ca003-ac6a-4bca-8f19-db5ae041d8fa")
    private final class PlainTextEditManager extends DirectEditManager2 {
        @objid ("93b08f51-9fbc-4bc4-b50d-d15df704e34c")
        PlainTextEditManager(GraphicalEditPart source, CellEditorLocator locator) {
            super(source, MultilineTextCellEditor.class, locator);
        }

        @objid ("d6ebd908-9078-460c-887d-1a8f4042dbc1")
        @Override
        protected void initCellEditor() {
            final TextCellEditor textEdit = (TextCellEditor) this.getCellEditor();
            textEdit.setValue(((GmModel) getModel()).getEditableText().getText());
                  
            final Text textControl = (Text) textEdit.getControl();
            textControl.selectAll();
            
            textControl.setBackground(ColorConstants.white);
            textControl.setForeground(ColorConstants.blue);
            textControl.setFont(getNoteFigure().getTextFont());
                  
            super.initCellEditor();
        }

    }

    @objid ("4e087a9c-3234-43e5-ac5b-92e071bdb8b1")
    private final class HtmlTextEditManager extends DirectEditManager2 {
        @objid ("04c5a293-ae68-43aa-ac4d-fe9e24c9b12b")
        HtmlTextEditManager(GraphicalEditPart source, CellEditorLocator locator) {
            super(source, HtmlTextCellEditor.class, locator);
        }

        @objid ("06ea1ec0-23fe-41d8-951d-c4da048e1f27")
        @Override
        protected void initCellEditor() {
            final HtmlTextCellEditor textEdit = (HtmlTextCellEditor) this.getCellEditor();
            textEdit.setValue(((GmModel) getModel()).getEditableText().getText());
                  
            final Control textControl = textEdit.getControl();
            textEdit.performSelectAll();
            
            textControl.setBackground(ColorConstants.white);
            textControl.setForeground(ColorConstants.blue);
            textControl.setFont(getNoteFigure().getTextFont());
                  
            super.initCellEditor();
        }

    }

}
