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


package org.modelio.core.ui.ktable.types.label;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTableModel;
import de.kupzog.ktable.SWTX;
import de.kupzog.ktable.renderers.DefaultCellRenderer;
import de.kupzog.ktable.renderers.TextCellRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.ktable.types.PropertyType;

@objid ("8deda4ab-c068-11e1-8c0a-002564c97630")
public class LabelType extends PropertyType {
    @objid ("8deda4ac-c068-11e1-8c0a-002564c97630")
    public LabelType() {
        super(false);
    }

    /**
     * Renderer used to display non editable text fields (ie property names)
     */
    @objid ("0a8cea42-cb5b-11e1-9165-002564c97630")
    @Override
    public DefaultCellRenderer getRenderer() {
        LabelCellRenderer labelRenderer = new LabelCellRenderer(DefaultCellRenderer.INDICATION_FOCUS);
        labelRenderer.setAlignment(SWTX.ALIGN_HORIZONTAL_LEFT | SWTX.ALIGN_VERTICAL_CENTER);
        labelRenderer.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
        return labelRenderer;
    }

    @objid ("8dde628a-c068-11e1-8c0a-002564c97630")
    public class LabelCellRenderer extends TextCellRenderer {
        @objid ("8dde628b-c068-11e1-8c0a-002564c97630")
        public LabelCellRenderer(int style) {
            super(style);
        }

        @objid ("8dde628e-c068-11e1-8c0a-002564c97630")
        @Override
        public int getOptimalWidth(GC gc, int col, int row, Object content, boolean fixed, KTableModel model) {
            return super.getOptimalWidth(gc, col, row, content, fixed, model) + 10;
        }

    }

}
