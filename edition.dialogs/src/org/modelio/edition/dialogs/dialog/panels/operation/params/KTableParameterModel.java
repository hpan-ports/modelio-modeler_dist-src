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
                                    

package org.modelio.edition.dialogs.dialog.panels.operation.params;

import java.util.MissingResourceException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.KTableCellEditor;
import de.kupzog.ktable.KTableCellRenderer;
import de.kupzog.ktable.KTableDefaultModel;
import de.kupzog.ktable.renderers.DefaultCellRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.MetamodelLabels;
import org.modelio.core.ui.ktable.IPropertyModel;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.ghost.GhostType;
import org.modelio.core.ui.ktable.types.header.HeaderType;
import org.modelio.core.ui.ktable.types.hybrid.HybridCellEditor;
import org.modelio.core.ui.ktable.types.label.LabelType;
import org.modelio.ui.UIColor;

/**
 * KTable model.
 * <p>
 * This KTable model does not instanciate the data model itself. It must be passed to the constructor. The transaction are not
 * managed in this class. The transaction must be done by the data model provided to the constructor.
 */
@objid ("31826843-1e0e-4caa-ac74-ad903c9d9b65")
public class KTableParameterModel extends KTableDefaultModel {
    @objid ("faade6a7-b937-47db-9e22-e8b33723f21a")
    private IPropertyModel data = null;

    @objid ("f03a24a9-3858-4b29-a8d5-9f510888b077")
    private KTable table = null;

    @objid ("afdab3ca-64c6-4caf-b8e6-0bd33c0c5edc")
    private KTableCellEditor currentEditor = null;

    @objid ("b940fb79-2647-4e92-9c59-abdbfc5ce2a0")
    public KTableParameterModel(KTable table, IPropertyModel data) {
        this.table = table;
        
        // Setup the data model
        this.data = data;
    }

    @objid ("7db9b55f-0bc0-454c-852f-532654ff4cf7")
    @Override
    public KTableCellEditor doGetCellEditor(int col, int row) {
        KTableCellEditor editor = null;
        
        if (!this.data.isEditable(row, col)) {
            return null;
        }
        
        final Object type = this.data.getTypeAt(row, col);
        
        // Other columns editor depends on data type
        editor = ((IPropertyType) type).getEditor(null);
        
        if (this.currentEditor != null) {
            if (this.currentEditor instanceof HybridCellEditor) {
                final HybridCellEditor hybridCellEditor = (HybridCellEditor) this.currentEditor;
                hybridCellEditor.forceClose();
            }
        }
        
        this.currentEditor = editor;
        return editor;
    }

    @objid ("9e2d1d16-861e-4054-96a3-6bf9683e5824")
    @Override
    public KTableCellRenderer doGetCellRenderer(int col, int row) {
        DefaultCellRenderer renderer = null;
        final Object type = this.data.getTypeAt(row, col);
        renderer = ((IPropertyType) type).getRenderer();
        
        // renderer.setBackground((row % 2 == 0) ? oddColor : evenColor);
        if (row > 0 && !(type instanceof GhostType)) {
            renderer.setBackground(UIColor.TABLE_ODDROW_BG);
        } else if (row == this.data.getRowsNumber() - 2) {
            renderer.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        } else if (row == this.data.getRowsNumber() - 1) {
            if (col > 3) {
                renderer.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
            } else {
                renderer.setBackground(UIColor.TABLE_ODDROW_BG);
            }
        }
        return renderer;
    }

    @objid ("974f37ac-5b39-465e-999b-5f86e072af57")
    @Override
    public int doGetColumnCount() {
        return this.data.getColumnNumber();
    }

    @objid ("6a39e0d4-a0bc-4164-8605-87ebdb282ba9")
    @Override
    public Object doGetContentAt(int col, int row) {
        boolean i18n = false;
        final Object value = this.data.getValueAt(row, col);
        String key = null;
        Object label = value;
        
        final IPropertyType type = this.data.getTypeAt(row, col);
        
        if (type instanceof HeaderType || type instanceof GhostType) {
            key = (String) value;
            if (key.startsWith("=")) {
                label = key.substring(1);
                i18n = false;
            } else {
                i18n = true;
            }
        } else if (type instanceof LabelType) {
            key = (String) value;
            i18n = true;
        } else if (row == 1 && col == 1) {
            key = (String) value;
            i18n = true;
        }
        
        if (i18n) {
            try {
                label = MetamodelLabels.getString(key);
            } catch (final MissingResourceException e) {
                label = value;
            }
        }
        return label;
    }

    @objid ("04f27692-e353-4a2b-bccf-d9a3e2d34ea2")
    @Override
    public int doGetRowCount() {
        return this.data.getRowsNumber();
    }

    @objid ("753c7f9c-8452-462d-9f21-dd01caa9ad15")
    @Override
    public void doSetContentAt(int col, int row, Object value) {
        this.data.setValueAt(row, col, value);
        
        this.table.redraw();
    }

    @objid ("5b7a2535-02b1-43f6-88da-5eb8f98b3d28")
    @Override
    public int getInitialColumnWidth(int column) {
        switch (column) {
        case 0:
            return 18;
        case 1:
            return getOptimalColumnWidth(column);
        case 2:
            return getOptimalColumnWidth(column);
        case 3:
            return getOptimalColumnWidth(column);
        case 4:
            return getOptimalColumnWidth(column);
        case 5:
            return getOptimalColumnWidth(column);
        default:
            return 0;
        }
    }

    @objid ("45157c5e-6824-405f-9ed0-5a36ae6c1d52")
    @Override
    public int getInitialRowHeight(int row) {
        if (row == 0) {
            return 22;
        } else {
            return 18;
        }
    }

    @objid ("3b6eb077-e2d7-4515-84ba-99e74c072b9e")
    @Override
    public int getFixedHeaderColumnCount() {
        return 0;
    }

    @objid ("e455f6b0-70a3-4341-b99b-6abbd3840997")
    @Override
    public int getFixedHeaderRowCount() {
        return 1;
    }

    @objid ("8e54a8c6-f633-4a56-9702-79d25b0b6f56")
    @Override
    public int getFixedSelectableColumnCount() {
        return 1;
    }

    @objid ("d4555df1-96c9-4e15-9ebb-f75dff785663")
    @Override
    public int getFixedSelectableRowCount() {
        return 0;
    }

    @objid ("04a22e8e-7a14-4e40-8580-afc9aac8ad23")
    @Override
    public int getRowHeightMinimum() {
        return 10;
    }

    @objid ("e4a878d9-088e-424b-80da-65a21cc962be")
    @Override
    public boolean isColumnResizable(int col) {
        if (col > 0) {
            return true;
        } else {
            return false;
        }
    }

    @objid ("e6be7087-6e01-4611-90c3-b40639ee8cdf")
    @Override
    public void setColumnWidth(int col, int value) {
        super.setColumnWidth(col, value);
    }

    @objid ("1494b66c-9688-43fe-a72d-010a7feea1fd")
    @Override
    public boolean isRowResizable(int row) {
        return false;
    }

    @objid ("169028bc-7493-4d5f-821d-977e425b1510")
    @Override
    public int getColumnWidth(int col) {
        return super.getColumnWidth(col);
    }

    @objid ("1549f69d-3292-4415-8217-7716da4839f3")
    public IPropertyType doGetTypeAt(int col, int row) {
        // TODO: remove cast when all model return IPropertyType
        final Object type = this.data.getTypeAt(row, col);
        if (type instanceof IPropertyType) {
            return (IPropertyType) type;
        } else {
            return null;
        }
    }

    @objid ("06697934-580b-4a2f-826f-235abd8020ef")
    private int getOptimalColumnWidth(int column) {
        if (column >= 0 && column < getColumnCount()) {
            int optWidth = 5;
            final GC gc = new GC(this.table);
            for (int i = 0; i < getFixedHeaderRowCount(); i++) {
                final int width = getCellRenderer(column, i).getOptimalWidth(gc, column, i, getContentAt(column, i), true, this);
                if (width > optWidth) {
                    optWidth = width;
                }
            }
            for (int i = 1; i < 1 + getRowCount() - 1; i++) {
                final int width = getCellRenderer(column, i).getOptimalWidth(gc, column, i, getContentAt(column, i), true, this);
                if (width > optWidth) {
                    optWidth = width;
                }
            }
            gc.dispose();
            return optWidth;
        }
        return -1;
    }

}
