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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000c7bb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Generalization extends ModelElement {
    @objid ("54728c91-2a8e-4a32-8428-acda8990e219")
    String getDiscriminator();

    @objid ("74684811-a2cc-4ca5-8387-fb4ae87c6980")
    void setDiscriminator(String value);

    @objid ("381b7737-0ea4-4223-94ba-03a5b44e92ff")
    NameSpace getSuperType();

    @objid ("6d82c674-7033-4569-aa86-27b0e2b67057")
    void setSuperType(NameSpace value);

    @objid ("7e8cadb2-3dcc-496b-862e-4a3f95964f44")
    NameSpace getSubType();

    @objid ("79fd209c-b529-426d-be3d-c9a3d6b97698")
    void setSubType(NameSpace value);

}
