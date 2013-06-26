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
                                    

package org.modelio.core.ui.ktable.types.bool;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.editors.KTableCellEditorCheckbox;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Our check box cell editor.
 */
@objid ("8d581b70-c068-11e1-8c0a-002564c97630")
public class CheckboxCellEditor extends KTableCellEditorCheckbox {
    @objid ("8d59a205-c068-11e1-8c0a-002564c97630")
    @Override
    public void close(boolean save) {
        super.close(save);
        selectNextField();
    }

    @objid ("8d59a209-c068-11e1-8c0a-002564c97630")
    @Override
    public void open(KTable table, int col, int row, Rectangle rect) {
        super.open(table, col, row, rect);
    }

    @objid ("8d59a210-c068-11e1-8c0a-002564c97630")
    private void selectNextField() {
        int nextCol = this.m_Col + 1;
        int nextRow = this.m_Row;
        
        if (nextCol > this.m_Model.getColumnCount() - 1) {
            nextCol = 1;
            nextRow ++;
        }
        
        if (nextRow > this.m_Model.getRowCount() - 1) {
            nextRow = 1;
        }
        
        this.m_Table.setSelection(nextCol, nextRow, true);
    }

}
