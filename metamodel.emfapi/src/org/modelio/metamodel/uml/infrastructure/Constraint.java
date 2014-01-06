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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("008538a6-c4be-1fd8-97fe-001ec947cd2a")
public interface Constraint extends ModelElement {
    @objid ("874df682-6209-4bd5-8338-a20070764d2c")
    String getBaseClass();

    @objid ("bec7006c-0253-4844-ac56-5232eb490681")
    void setBaseClass(String value);

    @objid ("0fdc01f3-c4de-4092-a190-1aa2c981fb3f")
    String getBody();

    @objid ("bc4f6b90-04ba-440d-b626-1fb09d8833ad")
    void setBody(String value);

    @objid ("76dd9d20-dd56-4990-a75b-4c04e001800f")
    String getLanguage();

    @objid ("34e455ba-ebee-415c-befa-11c48bd4d6bd")
    void setLanguage(String value);

    @objid ("c2bb6fac-bec5-40dd-aa3a-4b6a878773e6")
    EList<ModelElement> getConstrainedElement();

    @objid ("ed862ecc-1025-4a1d-8ac2-c53d7afd7141")
    <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass);

}
