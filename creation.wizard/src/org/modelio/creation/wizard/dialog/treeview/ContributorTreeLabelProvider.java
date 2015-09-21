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


package org.modelio.creation.wizard.dialog.treeview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.TextStyle;
import org.modelio.api.ui.contributor.IWizardContributor;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.UIColor;

/**
 * StyledCellLabelProvider for the creation contributors tree viewer in the creation wizard dialog.
 */
@objid ("5928579c-426b-40d9-bfa1-2f099087ff1e")
public class ContributorTreeLabelProvider extends StyledCellLabelProvider {
    @objid ("2ce81c51-8584-469e-8642-7c0d6aa294dc")
    public static final Styler VALID = new Styler() {
        @Override
        public void applyStyles(TextStyle textStyle) {
            // Nothing to do
        }
    };

    @objid ("c3ec3538-ad11-41a9-8602-4edd8a3171cd")
    public static final Styler INVALID = new Styler() {
        @Override
        public void applyStyles(TextStyle textStyle) {
            textStyle.foreground = UIColor.NONMODIFIABLE_ELEMENT;
        }
    };

    @objid ("789ef5e5-3061-45f9-b188-273724620f8d")
    private ModelElement context;

    /**
     * @param context
     */
    @objid ("1932b109-fe4c-4b87-b378-909aa84cb76d")
    public ContributorTreeLabelProvider(ModelElement context) {
        this.context = context;
    }

    @objid ("5f3b4588-6a53-42db-a73d-210877929d59")
    @Override
    public void update(ViewerCell cell) {
        Object element = cell.getElement();
        StyledString text = new StyledString();
        
        if (element instanceof Category) {
            Category category = (Category) element;
            text.append(category.getLabel());
            cell.setImage(category.getIcon());
        } else if (element instanceof IWizardContributor) {
            IWizardContributor contributor = (IWizardContributor) element;
            Styler styler;
            if (contributor.accept(this.context)) {
                styler = VALID;
            } else {
                styler = INVALID; // gray
            }
            text.append(contributor.getLabel(), styler);
            cell.setImage(contributor.getIcon());
        }
        cell.setText(text.getString());
        cell.setStyleRanges(text.getStyleRanges());
        super.update(cell);
    }

    @objid ("502f648a-1d17-4602-af18-049e1dc7d80f")
    public void setContext(ModelElement context) {
        this.context = context;
    }

}
