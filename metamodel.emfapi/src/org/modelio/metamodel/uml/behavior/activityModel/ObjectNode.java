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
    @objid ("fe600dc3-b3a0-4ce9-89d2-8dbbde15d5c8")
    boolean isIsControlType();

    @objid ("eebd4aa7-47cb-4a16-bb47-b370c20e4c77")
    void setIsControlType(boolean value);

    @objid ("3c4e3fb6-bfbc-4bbf-918a-f39cd24ed336")
    ObjectNodeOrderingKind getOrdering();

    @objid ("3d3e7ad1-6404-4c30-9e99-6ca82ab287ca")
    void setOrdering(ObjectNodeOrderingKind value);

    @objid ("5d671bc4-c7ba-4bf6-a169-2db71d6c7986")
    String getSelectionBehavior();

    @objid ("5c8ad498-1a87-4835-94bf-51497e5120ff")
    void setSelectionBehavior(String value);

    @objid ("67eeac39-6cfa-4b9f-9bc6-645bb51697ca")
    String getUpperBound();

    @objid ("4ff10a60-f1e9-44ae-b6ec-43cfb964c1b9")
    void setUpperBound(String value);

    @objid ("9b05670b-92f7-4cb9-a923-0c0b58ea1d41")
    Instance getRepresented();

    @objid ("c47de5e1-b88d-4974-8666-06cfdc918337")
    void setRepresented(Instance value);

    @objid ("335b5efc-e3a2-4572-b460-7f1d1fa787a5")
    BehaviorParameter getRepresentedRealParameter();

    @objid ("cf8d4b7a-7239-4c68-919e-35019581bb31")
    void setRepresentedRealParameter(BehaviorParameter value);

    @objid ("8dd87b73-7996-4952-b368-4aa24e54d003")
    GeneralClass getType();

    @objid ("f486f798-dc3b-4108-88f6-91c74d09d771")
    void setType(GeneralClass value);

    @objid ("96840af8-7441-4dc6-a826-1081143c4470")
    AssociationEnd getRepresentedRole();

    @objid ("bbd95172-be41-4982-a23a-ff0de4912e9b")
    void setRepresentedRole(AssociationEnd value);

    @objid ("c7fdd097-d6cc-4e4d-8f7e-d5ff2b3f8936")
    Attribute getRepresentedAttribute();

    @objid ("aab78a61-5699-4d09-a4bf-579007aaa6ec")
    void setRepresentedAttribute(Attribute value);

    @objid ("40a27762-7147-42ed-9e27-2fa42ff29735")
    State getInState();

    @objid ("54274edb-a5f2-4c4b-8584-911f809d15f6")
    void setInState(State value);

}
