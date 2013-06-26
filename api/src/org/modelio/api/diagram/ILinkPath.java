/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.diagram;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;

/**
 * Interface for a connection path.
 */
@objid ("4bae6102-644c-11e0-b650-001ec947cd2a")
public interface ILinkPath {
    /**
     * Get all bend points of the connection.
     * @return the bend points in coordinates relative to the diagram...
     */
    @objid ("6d18692e-69b5-11e0-adf3-002564c97630")
    Collection<Point> getPoints();

    /**
     * Removes the point at the specified position in this point list. Shifts any subsequent elements to the left (subtracts one from their indices).
     * @param index the index of the element to be removed.
     */
    @objid ("6d18de62-69b5-11e0-adf3-002564c97630")
    void removePoint(final int index);

    /**
     * Discards all points from the point list, then add all specified points in it.
     * @param points the new point list for this connection.
     */
    @objid ("6d190573-69b5-11e0-adf3-002564c97630")
    void setPoints(final Collection<Point> points);

    /**
     * Change the coordinates of a specific bend points of the connection.
     * @param index the index of the point to move in the point list.
     * @param point the new coordinates for this point.
     */
    @objid ("a3de5386-0ecc-11e2-96c4-002564c97630")
    void movePoint(final int index, final Point point);

}
