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
    @objid ("b7bdbc62-3f28-47db-8a3c-36b70ee4dd01")
    boolean isIsControlType();

    @objid ("21587740-a5c4-4466-aef8-8c8ca263bd0b")
    void setIsControlType(boolean value);

    @objid ("a151ba23-bf54-41f9-8e42-1443749f1e7d")
    ObjectNodeOrderingKind getOrdering();

    @objid ("5007291c-183f-4a4c-8bd6-98991b9431e3")
    void setOrdering(ObjectNodeOrderingKind value);

    @objid ("68bb0265-992a-4268-8338-60eeec8229ef")
    String getSelectionBehavior();

    @objid ("50872de3-6400-49ac-84a7-0fef160c2672")
    void setSelectionBehavior(String value);

    @objid ("9c19e8e9-58fe-4a4c-8a4c-00561db02512")
    String getUpperBound();

    @objid ("b6a8c623-b549-4c44-be8f-7e4de465b578")
    void setUpperBound(String value);

    @objid ("2e40aced-94e3-4ef6-b23e-8a1322daef6a")
    Instance getRepresented();

    @objid ("0bbaff9f-4fdd-4e39-84f5-553eb6db96ba")
    void setRepresented(Instance value);

    @objid ("5a6e3aaa-c9e6-4d1a-9841-e83ba95c064b")
    BehaviorParameter getRepresentedRealParameter();

    @objid ("e29be276-b9a1-4b09-be1b-f542365fcbd4")
    void setRepresentedRealParameter(BehaviorParameter value);

    @objid ("54ecfcec-22bb-4c45-8b4e-5b5fa6647d5c")
    GeneralClass getType();

    @objid ("c439ae06-f63a-4f1a-ac00-206f8ef6be8b")
    void setType(GeneralClass value);

    @objid ("e60d0024-d749-4afa-aa7b-f51c8c9e1138")
    AssociationEnd getRepresentedRole();

    @objid ("2fa1fd53-8b06-47f8-a4d0-37cf70ab5b31")
    void setRepresentedRole(AssociationEnd value);

    @objid ("c99e0bd7-2d5f-4002-a390-c183d14b5d83")
    Attribute getRepresentedAttribute();

    @objid ("ff45a67d-44ff-419a-838a-ff7b8ad5ef23")
    void setRepresentedAttribute(Attribute value);

    @objid ("ab3e37e6-83e3-48de-b398-743c3ba70d77")
    State getInState();

    @objid ("54db8cd1-6779-4f5b-ac85-347ee9bc60e5")
    void setInState(State value);

}
