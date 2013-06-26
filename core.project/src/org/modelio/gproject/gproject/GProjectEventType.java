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
                                    

package org.modelio.gproject.gproject;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Project event type.
 */
@objid ("954b3423-08b2-11e2-b193-001ec947ccaf")
public enum GProjectEventType {
    /**
     * A fragment has gone down.
     * The event message and/or exception will be filled.
     */
    FRAGMENT_DOWN,
    /**
     * A warning event.
     * The event message and/or exception will be filled.
     * The fragment may be filled.
     */
    WARNING;
}
