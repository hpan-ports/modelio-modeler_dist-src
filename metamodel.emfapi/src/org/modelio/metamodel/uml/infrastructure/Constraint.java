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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("008538a6-c4be-1fd8-97fe-001ec947cd2a")
public interface Constraint extends ModelElement {
    @objid ("a9b99da5-20c3-4121-b2c1-bc6bd0c7d99e")
    String getBaseClass();

    @objid ("de974b1e-2bf3-467e-aa9c-1d56b1576947")
    void setBaseClass(String value);

    @objid ("8b67a819-eced-431a-a7c4-ef9b027b887f")
    String getBody();

    @objid ("4923f11d-c82a-4855-857f-c244d84af267")
    void setBody(String value);

    @objid ("30d2bb64-6b1e-4a3a-ac5c-021f41e4ae1a")
    String getLanguage();

    @objid ("28195022-67a3-400d-849c-36cd6456a93d")
    void setLanguage(String value);

    @objid ("ff9823ae-8469-4257-9916-b3df49d4999e")
    EList<ModelElement> getConstrainedElement();

    @objid ("97a9b55c-d8b5-4945-9611-816b6fdd8cde")
    <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass);

}
