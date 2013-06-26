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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("008538a6-c4be-1fd8-97fe-001ec947cd2a")
public interface Constraint extends ModelElement {
    @objid ("f942950c-398f-4241-b3b9-732154192945")
    String getBaseClass();

    @objid ("8dab179d-cc6f-4113-b341-6097d813d6c5")
    void setBaseClass(String value);

    @objid ("6e89ea0d-92aa-40f3-a9a9-9e66ae8a8715")
    String getBody();

    @objid ("25d1390f-9646-454a-97a5-2f6854a5c912")
    void setBody(String value);

    @objid ("ffe3290a-dd72-438d-93d2-fc46d43ba9c6")
    String getLanguage();

    @objid ("dca120e9-1665-4234-b486-f6d5c110caf2")
    void setLanguage(String value);

    @objid ("7370864a-aebb-4437-ad3a-700dc3f5824e")
    EList<ModelElement> getConstrainedElement();

    @objid ("99b1894d-23c5-4afe-8ae5-65cd9100af3d")
    <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass);

}
