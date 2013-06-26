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
                                    

package org.modelio.gproject.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("00888498-030f-1035-9f91-001ec947cd2a")
public interface IElementNamer {
    @objid ("00888cc2-030f-1035-9f91-001ec947cd2a")
    String getBaseName(MClass metaclass);

    @objid ("0088a2f2-030f-1035-9f91-001ec947cd2a")
    String getUniqueName(MObject object);

    @objid ("0088bce2-030f-1035-9f91-001ec947cd2a")
    String getUniqueName(String basename, MObject object);

}
