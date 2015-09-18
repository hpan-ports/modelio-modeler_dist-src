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
                                    

//------------------------------------------------------------------------------
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// IBM Corporation - initial implementation
//------------------------------------------------------------------------------
package org.modelio.edition.html.view.actions;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.modelio.edition.html.epfcommon.ui.actions.CComboContributionItem;
import org.modelio.edition.html.view.IRichText;

/**
 * The interface for a rich text combo action.
 * 
 * @author Kelvin Low
 * @author Jeff Hardy
 * @since 1.0
 * 
 * @deprecated unused
 */
@objid ("9ecc4344-e543-4661-9e38-779c0ab0e470")
@Deprecated
public interface IRichTextComboAction extends IBaseRichTextAction {
//    /**
//     * Adds an item.
//     *
//     * @param item
//     *            the item to be added
//     */
//    public void addItem(String item);
//
//    /**
//     * Returns all items.
//     *
//     * @return an array of items
//     */
//    public String[] getItems();
    /**
     * Executes the action.
     * @param richText a rich text control
     * @param index the index of the selected item
     */
    @objid ("1e557be7-475d-4345-ae94-4d7dc4e8e69a")
    void execute(IRichText richText, int index);

    @objid ("e330f190-ae98-4efe-a207-bf13259d6e2d")
    IStructuredContentProvider getContentProvider();

    @objid ("d7a8cdd6-34b5-4a52-a29d-a74259578135")
    ILabelProvider getLabelProvider();

    @objid ("b099b3cc-8feb-40ee-b854-3c17281b52ad")
    Object getInput();

    /**
     * Sets the action's ContributionItem
     */
    @objid ("c9166842-dd50-4ce4-8c95-a31ae4069106")
    void setContributionItem(CComboContributionItem item);

}
