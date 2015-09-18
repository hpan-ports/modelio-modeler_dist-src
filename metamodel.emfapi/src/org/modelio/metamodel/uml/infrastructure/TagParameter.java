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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008e8d34-c4be-1fd8-97fe-001ec947cd2a")
public interface TagParameter extends Element {
    @objid ("c6163420-6049-412a-b71f-b670ff85fc39")
    String getValue();

    @objid ("c343e143-c58f-4173-8593-c9f048bd4bb9")
    void setValue(String value);

    @objid ("a5b5b835-36b2-46c2-a100-76a6dcb96b2d")
    TaggedValue getAnnoted();

    @objid ("93322be3-23ba-4455-af10-932d4f42c5cc")
    void setAnnoted(TaggedValue value);

    @objid ("e850cd80-85df-40e2-ba64-82ef6d897132")
    TaggedValue getQualified();

    @objid ("7c3a6a27-c52f-45d6-ae7f-fdb047f8e0c3")
    void setQualified(TaggedValue value);

}
