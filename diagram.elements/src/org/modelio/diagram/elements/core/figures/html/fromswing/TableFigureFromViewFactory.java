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
                                    

package org.modelio.diagram.elements.core.figures.html.fromswing;

import javax.swing.text.AttributeSet;
import javax.swing.text.TableView;
import javax.swing.text.View;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTML;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Figure;

/**
 * Factory that handles {@link TableView} children
 * 
 * @see javax.swing.text.html.TableView
 * @see javax.swing.text.html.TableView.RowView
 * @see javax.swing.text.html.TableView.CellView
 */
@objid ("e6114263-aea3-4883-94c4-c074b6d898ec")
@SuppressWarnings("javadoc")
class TableFigureFromViewFactory extends DefaultFigureFromViewFactory {
    /**
     * @see javax.swing.text.html.TableView
     */
    @objid ("6bc8a6c7-3cf4-440c-9dc8-21ab5e646fa0")
    private View tableView;

    @objid ("559b4dce-28eb-4d07-b167-5ed47cc15841")
    private DefaultFigureFromViewFactory parentFact;

    @objid ("d8c3df5a-fdab-4ab3-8983-26b438de8752")
    public TableFigureFromViewFactory(DefaultFigureFromViewFactory parentFact, View tableView) {
        super(parentFact.defaultFont);
        this.parentFact = parentFact;
        this.tableView = tableView;
        
        tableView.getView(0);
        init();
    }

    @objid ("d026301e-2fee-4334-b30d-3f557f88e0a2")
    private void init() {
        // TODO Auto-generated method stub
    }

    @objid ("6b584c5a-c471-436f-9cb2-5688040c15ed")
    @Override
    public Figure createFigure(View child, Figure parentFigure) {
        /*if (child instanceof javax.swing.text.html.TableView)
        GridData gd = new GridData();
        gd.grabExcessHorizontalSpace = true;
        gd.grabExcessVerticalSpace = true;
        //gd.heightHint;
        gd.horizontalSpan;
        gd.verticalSpan;*/
        
        Tag kind = getTag(child);
        if (kind == HTML.Tag.TR) {
            return createTableRow(child, parentFigure);
        } else if ((kind == HTML.Tag.TD) || (kind == HTML.Tag.TH)) {
            return createCellView(child, parentFigure);
        } else if (kind == HTML.Tag.CAPTION) {
            return createBlockFlow(child);
        } else {
            return this.parentFact.createFigure(child, parentFigure);
        }
    }

    @objid ("41951b32-981b-45d6-ada7-b7854408b659")
    @Override
    public IFigureFromViewFactory getFactory(View child, Figure parentFigure) {
        Tag kind = getTag(child);
        if (kind == HTML.Tag.TR) {
            return this;
        } else if ((kind == HTML.Tag.TD) || (kind == HTML.Tag.TH)) {
            return this;
        } else if (kind == HTML.Tag.CAPTION) {
            return this;
        } else {
            return this.parentFact.getFactory(child, parentFigure);
        }
    }

    /**
     * Create a figure for a {@link javax.swing.text.html.TableView.CellView CellView}.
     * @see javax.swing.text.html.TableView.CellView
     * @param child the CellView
     * @param parentFigure the parent figure
     * @return the created figure (may be null)
     */
    @objid ("4fa26db3-8fba-4234-a98b-e28efe07c99d")
    private Figure createCellView(View child, Figure parentFigure) {
        // TODO to be implemented
        return createBlockFlow(child);
    }

    /**
     * @see javax.swing.text.html.TableView.RowView
     * @param child the RowView
     * @param parentFigure the parent figure
     * @return the table row figure
     */
    @objid ("c55ecd64-5f9c-4c95-8394-8a0bcfdde2a9")
    private Figure createTableRow(View child, Figure parentFigure) {
        /*javax.swing.text.html.TableView.RowView rv = (javax.swing.text.html.TableView.RowView) child;
        
        rv.getColumnCount();
        rv.getRowCount();
        rv.getRowSpan(row);*/
        
        // TODO to be implemented
        return createBlockFlow(child);
    }

    /**
     * Determines the number of columns occupied by
     * the table cell represented by given element.
     */
    @objid ("e7930ae5-f203-4488-8e47-843b7e1d297f")
    protected int getColumnsOccupied(View v) {
        AttributeSet a = v.getElement().getAttributes();
        
        if (a.isDefined(HTML.Attribute.COLSPAN)) {
            String s = (String) a.getAttribute(HTML.Attribute.COLSPAN);
            if (s != null) {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException nfe) {
                    // fall through to one column
                }
            }
        }
        return 1;
    }

    /**
     * Determines the number of rows occupied by
     * the table cell represented by given element.
     */
    @objid ("41b4a1d8-017e-4bbf-b919-1cefcf00253f")
    protected int getRowsOccupied(View v) {
        AttributeSet a = v.getElement().getAttributes();
        
        if (a.isDefined(HTML.Attribute.ROWSPAN)) {
            String s = (String) a.getAttribute(HTML.Attribute.ROWSPAN);
            if (s != null) {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException nfe) {
                    // fall through to one row
                }
            }
        }
        return 1;
    }

}
