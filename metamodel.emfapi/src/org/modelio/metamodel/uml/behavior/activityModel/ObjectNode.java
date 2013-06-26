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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("003940c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectNode extends ActivityNode {
    @objid ("35fd848c-b440-45c3-a7ef-2cce25cdd87a")
    boolean isIsControlType();

    @objid ("9eecba65-94c3-4add-8a50-fda3a69666d1")
    void setIsControlType(boolean value);

    @objid ("651cecb0-d5a7-418b-84b3-b31eeb9f6f0f")
    ObjectNodeOrderingKind getOrdering();

    @objid ("1c5c9f6f-973e-499e-8661-28e40a98febc")
    void setOrdering(ObjectNodeOrderingKind value);

    @objid ("d83dd393-a205-4dec-ab96-383e572eb410")
    String getSelectionBehavior();

    @objid ("13da86e9-9d5b-416e-ab77-cce96e505d7b")
    void setSelectionBehavior(String value);

    @objid ("755c902c-39a3-4411-8e1a-bc427cb006e2")
    String getUpperBound();

    @objid ("19b24058-6f1c-44d8-8749-53e45d598ed7")
    void setUpperBound(String value);

    @objid ("70277221-5ff3-4dda-bc14-0d79fa8abace")
    Instance getRepresented();

    @objid ("97764cfa-58ce-4139-8049-2e8f275d4928")
    void setRepresented(Instance value);

    @objid ("7f3294e4-3f7c-4522-a049-77c7c9a6281a")
    BehaviorParameter getRepresentedRealParameter();

    @objid ("4c08c7f2-d8a8-47bb-a29e-ac7367dc8ec4")
    void setRepresentedRealParameter(BehaviorParameter value);

    @objid ("3f523680-5f6c-445c-bd8e-05608686a22c")
    GeneralClass getType();

    @objid ("3031ac51-8734-4549-a2c8-37e6cc61c014")
    void setType(GeneralClass value);

    @objid ("b3251160-8e00-4bc3-a306-8393b8656141")
    AssociationEnd getRepresentedRole();

    @objid ("fb3e3823-7f18-4b5e-9684-2c8c696a2afd")
    void setRepresentedRole(AssociationEnd value);

    @objid ("2dfcfc40-bb9e-4433-b19d-4323c0cf6ae4")
    Attribute getRepresentedAttribute();

    @objid ("ff891283-398b-47f7-bd09-1d2bef6f1dee")
    void setRepresentedAttribute(Attribute value);

    @objid ("ebaf6004-d88a-49c0-8a44-51a615b286f3")
    State getInState();

    @objid ("c60def45-bfc2-49e5-8553-47331a221f33")
    void setInState(State value);

}
