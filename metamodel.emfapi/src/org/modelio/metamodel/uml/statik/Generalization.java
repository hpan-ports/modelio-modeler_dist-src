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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000c7bb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Generalization extends ModelElement {
    @objid ("b1816540-6a94-45b6-8fef-aa48a5116ecd")
    String getDiscriminator();

    @objid ("990d559d-891f-4136-b676-f119292913e7")
    void setDiscriminator(String value);

    @objid ("c76aa46c-4741-4796-ba45-3a14f1c7745c")
    NameSpace getSuperType();

    @objid ("d2075c27-0eb3-4dca-9d47-fa72ea3ebd82")
    void setSuperType(NameSpace value);

    @objid ("8c9ad354-e5a5-4410-b89f-b52ed4fd9b94")
    NameSpace getSubType();

    @objid ("122bec3f-fa3e-4b4b-885c-83020b5c4d35")
    void setSubType(NameSpace value);

}
