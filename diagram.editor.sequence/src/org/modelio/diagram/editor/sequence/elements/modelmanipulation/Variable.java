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
                                    

package org.modelio.diagram.editor.sequence.elements.modelmanipulation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * A simple object used to provide a reference on an integer variable to a Predicate.
 */
@objid ("d96fdf7c-55b6-11e2-877f-002564c97630")
public class Variable {
    @objid ("d96fdf7e-55b6-11e2-877f-002564c97630")
    private int value;

    /**
     * Returns the current integer value of this Variable object.
     * @return the current integer value.
     */
    @objid ("d96fdf7f-55b6-11e2-877f-002564c97630")
    public int getValue() {
        return this.value;
    }

    /**
     * Sets the new value of this Variable object.
     * @param value the new integer value.
     */
    @objid ("d96fdf84-55b6-11e2-877f-002564c97630")
    public void setValue(final int value) {
        this.value = value;
    }

}
