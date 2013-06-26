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
package org.modelio.metamodel.uml.informationFlow;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("00645dc0-c4bf-1fd8-97fe-001ec947cd2a")
public interface DataFlow extends ModelElement {
    @objid ("6d2c1758-af31-40c3-8177-57b42d7477e6")
    NameSpace getDestination();

    @objid ("871a670b-35a8-4482-95b4-efcf2618b879")
    void setDestination(NameSpace value);

    @objid ("827016eb-9f6a-4db8-a0bb-2a89d5ebdab7")
    NameSpace getOrigin();

    @objid ("8a6fe40e-f059-4810-a0fc-c3a040c39545")
    void setOrigin(NameSpace value);

    @objid ("286b0bf0-796a-4adb-9329-52d3fe838832")
    NameSpace getOwner();

    @objid ("e2c70dfe-10be-47f4-938c-1a723e01e500")
    void setOwner(NameSpace value);

    @objid ("ed888703-8bba-4c6c-a1f7-d60f10e516b5")
    Signal getSModel();

    @objid ("c6d55dda-db4b-44cc-9c15-dd6365cfb1b5")
    void setSModel(Signal value);

}
