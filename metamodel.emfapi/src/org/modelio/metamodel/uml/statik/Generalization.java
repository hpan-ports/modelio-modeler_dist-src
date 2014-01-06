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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000c7bb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Generalization extends ModelElement {
    @objid ("e6764f60-ac17-45c5-839e-a9e9ffab711a")
    String getDiscriminator();

    @objid ("c9d24952-b594-4e6d-8818-defc1d79ff2d")
    void setDiscriminator(String value);

    @objid ("4a1f9a16-f5d8-4502-b8a5-abc4fb3a711c")
    NameSpace getSuperType();

    @objid ("dc273ac1-8c9b-4066-8d55-589e0b285250")
    void setSuperType(NameSpace value);

    @objid ("0a9df315-fda0-40cc-89ba-37b124249e0e")
    NameSpace getSubType();

    @objid ("da44a0a5-b3a1-4158-8f8c-f257ecf7ffc6")
    void setSubType(NameSpace value);

}
