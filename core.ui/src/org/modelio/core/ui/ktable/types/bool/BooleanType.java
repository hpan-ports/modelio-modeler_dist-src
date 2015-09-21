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


package org.modelio.core.ui.ktable.types.bool;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTableCellEditor;
import de.kupzog.ktable.SWTX;
import de.kupzog.ktable.renderers.CheckableCellRenderer;
import de.kupzog.ktable.renderers.DefaultCellRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.core.ui.ktable.types.PropertyType;

@objid ("8de78a44-c068-11e1-8c0a-002564c97630")
public class BooleanType extends PropertyType {
    @objid ("8de78a45-c068-11e1-8c0a-002564c97630")
    public BooleanType() {
        super(false);
    }

    /**
     * Renderer used to display editable boolean fields
     */
    @objid ("0a622fa5-cb5b-11e1-9165-002564c97630")
    @Override
    public DefaultCellRenderer getRenderer() {
        CheckableCellRenderer boolRenderer = new ModifiedCheckableCellRenderer(DefaultCellRenderer.INDICATION_FOCUS);
        boolRenderer.setAlignment(SWTX.ALIGN_HORIZONTAL_LEFT | SWTX.ALIGN_VERTICAL_CENTER);
        boolRenderer.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_BLUE));
        return boolRenderer;
    }

    @objid ("0a6256b6-cb5b-11e1-9165-002564c97630")
    @Override
    public KTableCellEditor getEditor(IModelioPickingService pickingService) {
        return new CheckboxCellEditor();
    }

    /**
     * Modified variant of the Kupzog CheckableCellRenderer class that fixes a bug in horizontal and vertical aligments
     * 
     * @author phv
     */
    @objid ("83f8ce6e-c120-4aa3-8ec7-b0a0b3fc2b80")
    private static class ModifiedCheckableCellRenderer extends CheckableCellRenderer {
        @objid ("6ab21c4f-da66-4726-8f12-611c544bf7f5")
        public ModifiedCheckableCellRenderer(int style) {
            super(style);
        }

        @objid ("1ec99c63-4d9b-4ec2-be00-8af3a68048c7")
        @Override
        protected Rectangle getAlignedLocation(Rectangle rect, Image img) {
            Rectangle bounds = img.getBounds();
            bounds.x -= 2;
            bounds.y -= 2;
            bounds.height -= 4;
            bounds.width -= 4;
            
            if ((getAlignment() & SWTX.ALIGN_HORIZONTAL_MASK) == SWTX.ALIGN_HORIZONTAL_CENTER) {
                bounds.x = rect.x + (rect.width - bounds.width) / 2;
            } else if ((getAlignment() & SWTX.ALIGN_HORIZONTAL_MASK) == SWTX.ALIGN_HORIZONTAL_RIGHT) {
                bounds.x = rect.x + rect.width - bounds.width - 2;
            } else {
                bounds.x = rect.x + 2;
            }
            
            if ((getAlignment() & SWTX.ALIGN_VERTICAL_MASK) == SWTX.ALIGN_VERTICAL_CENTER) {
                bounds.y = rect.y + (rect.height - bounds.height) / 2;
            } else if ((getAlignment() & SWTX.ALIGN_VERTICAL_MASK) == SWTX.ALIGN_VERTICAL_BOTTOM) {
                bounds.y = rect.y + rect.height - bounds.height - 2;
            } else {
                bounds.y = rect.y + 2;
            }
            return bounds;
        }

    }

}
