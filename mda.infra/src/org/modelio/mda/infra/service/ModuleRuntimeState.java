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
                                    

package org.modelio.mda.infra.service;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Enumeration of the states a module can have at runtime.
 */
@objid ("4d148035-99dd-11e1-b1e0-001ec947c8cc")
public enum ModuleRuntimeState {
    /**
     * This state indicates the module is loaded but not started.
     */
    Loaded,
    /**
     * This states indicates the module is loaded and started.
     */
    Started,
    /**
     * This state indicates the module could not be loaded at all.
     */
    Incompatible;
}
