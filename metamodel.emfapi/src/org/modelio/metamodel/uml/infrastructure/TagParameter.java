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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008e8d34-c4be-1fd8-97fe-001ec947cd2a")
public interface TagParameter extends Element {
    @objid ("9e6eada4-d647-45a8-afdc-648303203d6e")
    String getValue();

    @objid ("55a9c4ff-acde-46f1-bc21-a4b17118916a")
    void setValue(String value);

    @objid ("fa158e87-8915-431d-a336-41d2cf1c2814")
    TaggedValue getAnnoted();

    @objid ("c024a40c-d0ed-4170-a1a0-cdab903e455f")
    void setAnnoted(TaggedValue value);

    @objid ("f9b8594e-2c50-4a44-8c5b-497406864099")
    TaggedValue getQualified();

    @objid ("f041e381-5445-44a5-9111-3ae00c013fac")
    void setQualified(TaggedValue value);

}
