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


package org.modelio.gproject.data.project.todo;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Root class for to-do action descriptors.
 * @since Modelio 3.4
 */
@objid ("af899138-572b-4676-9446-3d7974b80e1a")
public abstract class TodoActionDescriptor {
    /**
     * Get a user friendly label for this action.
     * @return a label string.
     */
    @objid ("bd8f6af5-d15e-4b72-a8e7-ac2dadabd484")
    public abstract String getLocalizedLabel();

}
