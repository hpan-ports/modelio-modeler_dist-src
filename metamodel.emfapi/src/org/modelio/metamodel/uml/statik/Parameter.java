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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PassingMode;

@objid ("0017c640-c4bf-1fd8-97fe-001ec947cd2a")
public interface Parameter extends ModelElement {
    @objid ("c2ef84a4-54e6-4301-a950-610315c2f806")
    PassingMode getParameterPassing();

    @objid ("a035fe03-e361-4fce-a012-468f313f6bc8")
    void setParameterPassing(PassingMode value);

    @objid ("4fccc31e-9147-4214-b2d9-837d6275295e")
    String getMultiplicityMin();

    @objid ("e70e5c02-c1dd-499f-bd56-7a096e38dd87")
    void setMultiplicityMin(String value);

    @objid ("f7dc5c0a-0c45-43df-9e55-61e0a59d0435")
    String getMultiplicityMax();

    @objid ("7a135150-6cfb-46f6-b13b-a584c65cd937")
    void setMultiplicityMax(String value);

    @objid ("e872924d-0ebc-4e79-a38c-e772399fdba3")
    String getTypeConstraint();

    @objid ("f03e6336-5411-4825-a57c-feb8dafce7c0")
    void setTypeConstraint(String value);

    @objid ("fa138b54-2bc4-4e7c-aacd-0ecb53a471b3")
    String getDefaultValue();

    @objid ("9e389d9b-a595-4418-9b33-49e0bbe2092a")
    void setDefaultValue(String value);

    @objid ("590fb1cd-955b-46df-9123-c15dfdb92eda")
    boolean isIsOrdered();

    @objid ("baed3a85-5090-4600-af15-559c6e249726")
    void setIsOrdered(boolean value);

    @objid ("21080623-32dd-42ea-9937-d2c8ca081edd")
    boolean isIsUnique();

    @objid ("10a41725-0f7a-4c1b-bc88-00769773d0ca")
    void setIsUnique(boolean value);

    @objid ("c93e3600-c123-47a1-99f4-0505f8391a09")
    boolean isIsException();

    @objid ("3af1f2d4-a2a3-4e0d-b218-7bb1d897f850")
    void setIsException(boolean value);

    @objid ("75680572-109a-47de-96e9-a7c4107a6b03")
    boolean isIsStream();

    @objid ("7da9de07-26a6-4501-95fa-73142ec48890")
    void setIsStream(boolean value);

    @objid ("cbdd27f2-128e-4685-aed2-ceb60c5797e9")
    ParameterEffectKind getEffect();

    @objid ("90e8db99-77cc-450a-833d-8d1e14a1561e")
    void setEffect(ParameterEffectKind value);

    @objid ("1d50baf9-dcb8-442e-9248-6517766a5790")
    EList<BpmnDataInput> getBpmnRepresentingDataInput();

    @objid ("0054e564-4e1f-41ca-a65e-9658bbd81cf7")
    <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass);

    @objid ("b8187e83-4e07-44ee-941f-fa84927d2dbc")
    GeneralClass getType();

    @objid ("399f2168-1564-40a6-8207-b834efe1183b")
    void setType(GeneralClass value);

    @objid ("840ce745-2b74-459d-b8a3-5e0a82067c69")
    Operation getComposed();

    @objid ("a8ac7f0a-8235-48df-9d03-863ce39a3d60")
    void setComposed(Operation value);

    @objid ("7abb23c6-1753-4208-803f-824303bd2959")
    EList<Pin> getMatching();

    @objid ("10ffc51b-aa55-4835-ac31-c2a2dfe86383")
    <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass);

    @objid ("8409b26b-232d-4f67-a23e-1e4e85082163")
    EList<BpmnDataOutput> getBpmnRepresentingDataOutput();

    @objid ("e2dc4628-7a1f-4ebb-be61-873a216fc4c7")
    <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass);

    @objid ("81583bb3-e322-4012-b8dd-7a1bd2429dfe")
    EList<Signal> getSRepresentation();

    @objid ("b4d28077-f3c2-4ceb-ac30-1aeb193a115a")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("ea3d3f91-bead-45f2-9cac-7de4000aad7a")
    Operation getReturned();

    @objid ("7502ad87-8471-44c6-b48f-e4a9e7849adf")
    void setReturned(Operation value);

    @objid ("e2df2e3b-9db5-4d30-a10f-d327139a5874")
    EList<BehaviorParameter> getBehaviorParam();

    @objid ("e3eee19f-f234-43a3-addc-3c719e3ff3a8")
    <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass);

}
