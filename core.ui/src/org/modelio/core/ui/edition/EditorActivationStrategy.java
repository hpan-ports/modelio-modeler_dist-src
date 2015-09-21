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


package org.modelio.core.ui.edition;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * This class is responsible to determine if a cell selection event triggers an editor activation.
 * <p/>
 * In this implementation, edition can be triggered:
 * <ul>
 * <li>programmatically</li>
 * <li>by pressing F2</li>
 * <li>with two clicks on the same object in a duration comprised between 0.3 and 1 second</li>
 * </ul>
 */
@objid ("0e4e1c34-1de3-11e2-bcbe-002564c97630")
public class EditorActivationStrategy extends ColumnViewerEditorActivationStrategy implements MouseListener {
    @objid ("1fc23824-1de3-11e2-bcbe-002564c97630")
    private int time = 0;

    @objid ("1fc23825-1de3-11e2-bcbe-002564c97630")
    private Object selectedObject = null;

    @objid ("1fc23826-1de3-11e2-bcbe-002564c97630")
    private ColumnViewer viewer;

    @objid ("1fc23827-1de3-11e2-bcbe-002564c97630")
    public EditorActivationStrategy(ColumnViewer viewer) {
        super(viewer);
        this.viewer = viewer;
        viewer.getControl().addMouseListener(this);
    }

    @objid ("1fc2382a-1de3-11e2-bcbe-002564c97630")
    @Override
    protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
        if (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.F2) {
            return true;
        } else if (event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC) {
            return true;
        }
        return false;
    }

    /**
     * (non-Javadoc)
     * @see org.eclipse.swt.events.MouseListener#mouseDoubleClick(org.eclipse.swt.events.MouseEvent)
     */
    @objid ("1fc23830-1de3-11e2-bcbe-002564c97630")
    @Override
    public void mouseDoubleClick(MouseEvent e) {
        // Nothing to do
    }

    /**
     * (non-Javadoc)
     * @see org.eclipse.swt.events.MouseListener#mouseDown(org.eclipse.swt.events.MouseEvent)
     */
    @objid ("1fc23835-1de3-11e2-bcbe-002564c97630")
    @Override
    public void mouseDown(MouseEvent e) {
        // Nothing to do
    }

    /**
     * (non-Javadoc)
     * @see org.eclipse.swt.events.MouseListener#mouseUp(org.eclipse.swt.events.MouseEvent)
     */
    @objid ("1fc2383a-1de3-11e2-bcbe-002564c97630")
    @Override
    public void mouseUp(MouseEvent e) {
        // Retrieve selected object
        Object sourceObject = null;
        
        Object eventSource = e.getSource();
        
        if (eventSource instanceof Tree) {
            Tree tree = (Tree) eventSource;
        
            TreeItem clickedItem = tree.getItem(new Point(e.x, e.y));
        
            TreeItem[] items = tree.getSelection();
            if (items.length == 1) {
                if (clickedItem != null) {
                    sourceObject = items[0].getData();
                }
            }
        }
        
        if (sourceObject == null) {
            return;
        }
        
        boolean leftButtonClicked = false;
        
        // Report from Eclipse doc:
            // Note: The button field is an integer that represents the mouse button number. This is not the same as the SWT mask constants BUTTONx.
        // the button that was pressed or released; 1 for the first button, 2 for the second button, and 3 for the third button, etc.
        if (e.button == 1) {
            leftButtonClicked = true;
        }
        
        // We enter edition only when left button is pressed
        if (this.time == 0 && leftButtonClicked) {
            this.time = e.time;
            this.selectedObject = sourceObject;
            return;
        } else if (leftButtonClicked) {
            int delta = e.time - this.time;
        
            if (delta > 300 && delta < 1000 && this.selectedObject == sourceObject) {
                this.time = 0;
                this.selectedObject = sourceObject;
                this.viewer.editElement(sourceObject, 0);
                return;
            } else {
                this.time = e.time;
                this.selectedObject = sourceObject;
                return;
            }
        }
    }

}
