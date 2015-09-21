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


package org.modelio.diagram.elements.common.freezone;

import java.util.Iterator;
import java.util.ListIterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Specialisation of the XYLayout to add the fact that children position should be fixed to fit as much as possible
 * within the client area of the parent figure.
 * 
 * @author fpoyer
 */
@objid ("7e37fc80-1dec-11e2-8cad-001ec947c8cc")
public class FreeZoneLayout extends XYLayout {
    /**
     * Fix the child position so that it is inside the client area rectangle as much as possible
     * @param clientArea the area in which the child rectangle must fit.
     * @param childRectangle The rectangle to fix.
     */
    @objid ("7e37fc84-1dec-11e2-8cad-001ec947c8cc")
    protected void fitChildRectangleInClientArea(Rectangle clientArea, Rectangle childRectangle) {
        // Fix bottom right
        childRectangle.x = Math.min(childRectangle.right(), clientArea.right()) - childRectangle.width;
        childRectangle.y = Math.min(childRectangle.bottom(), clientArea.bottom()) - childRectangle.height;
        
        // Fix top left
        childRectangle.x = Math.max(childRectangle.x, clientArea.x);
        childRectangle.y = Math.max(childRectangle.y, clientArea.y);
    }

    @objid ("7e37fc8d-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void layout(IFigure parent) {
        Point offset = getOrigin(parent);
        Rectangle clientArea = parent.getClientArea();
        
        Iterator<?> children = parent.getChildren().iterator();
        while (children.hasNext()) {
            IFigure f = (IFigure) children.next();
            Rectangle bounds = (Rectangle) getConstraint(f);
            if (bounds == null) {
                continue;
            }
        
            // Modifies the constraint if not complete.
            // The constraint must be modified so that the layout is reproducible
            // with auto resize edit policies when the preferred size changes.
            if (bounds.width == -1 || bounds.height == -1) {
                Dimension childPreferredSize = f.getPreferredSize(bounds.width, bounds.height);
                if (bounds.width == -1) {
                    bounds.width = childPreferredSize.width;
                }
                if (bounds.height == -1) {
                    bounds.height = childPreferredSize.height;
                }
            }
        
            bounds = bounds.getCopy();
            bounds.translate(offset);
        
            fitChildRectangleInClientArea(clientArea, bounds);
        
            f.setBounds(bounds);
        }
    }

    @objid ("7e37fc93-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Dimension getMinimumSize(IFigure container, int wHint, int hHint) {
        // Implementation is the same as calculatePreferredSize, except that all
        // children are "moved" at origin point of the client area (worst case
        // of compression).
        Rectangle rect = null; //new Rectangle(); // TODO this does not work as specified, should be null here and set at first child.
        ListIterator<?> children = container.getChildren().listIterator();
        while (children.hasNext()) {
            IFigure child = (IFigure) children.next();
            Rectangle r = (Rectangle) this.constraints.get(child);
            if (r == null) {
                continue;
            }
        
            if (r.width == -1 || r.height == -1) {
                r = r.getCopy();
                Dimension childPreferredSize = child.getPreferredSize(r.width, r.height);
                if (r.width == -1) {
                    r.width = childPreferredSize.width;
                }
                if (r.height == -1) {
                    r.height = childPreferredSize.height;
                }
            }
        
            if (rect == null) {
                rect = r.getCopy();
            } else {
                rect.union(r);
            }
        }
        
        if (rect == null) {
            rect = new Rectangle();
        }
        
        Dimension d = rect.getSize();
        Insets insets = container.getInsets();
        return new Dimension(d.width + insets.getWidth(), d.height + insets.getHeight()).union(getBorderPreferredSize(container));
    }

}
