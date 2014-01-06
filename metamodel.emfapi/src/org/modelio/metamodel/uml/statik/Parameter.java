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
    @objid ("3fb50861-9808-405e-b5d5-cc42f1be21c1")
    PassingMode getParameterPassing();

    @objid ("ff1919a6-a389-46c5-a355-e2a9948bed70")
    void setParameterPassing(PassingMode value);

    @objid ("d873b42d-c13e-4b43-b113-058aa238e165")
    String getMultiplicityMin();

    @objid ("ae9900bd-17a7-4966-9f5c-530cfab8b98b")
    void setMultiplicityMin(String value);

    @objid ("86d0405a-d499-4ba0-b662-a9ad512e8aaf")
    String getMultiplicityMax();

    @objid ("bcf5f26e-225c-4b76-a4fb-3a11dab2e1f5")
    void setMultiplicityMax(String value);

    @objid ("32b5cef0-ee72-4a52-82ba-2aae843281d4")
    String getTypeConstraint();

    @objid ("0ef5e619-4e2e-4fd1-991b-1e7ec134baaa")
    void setTypeConstraint(String value);

    @objid ("10c99303-a00c-4abd-a5ee-8555acdb75c2")
    String getDefaultValue();

    @objid ("97442449-2ca4-4946-8024-f1b8b740ee90")
    void setDefaultValue(String value);

    @objid ("7486fd82-3f08-4f46-8b39-842390417844")
    boolean isIsOrdered();

    @objid ("6551f12e-1945-480c-a722-378763d7c0c7")
    void setIsOrdered(boolean value);

    @objid ("03818753-ae44-45ac-b154-b3a7a7c690b3")
    boolean isIsUnique();

    @objid ("cf291147-0d24-4503-95df-66f38669bf1e")
    void setIsUnique(boolean value);

    @objid ("b01a4d92-f57e-42fc-84a5-058efeca4845")
    boolean isIsException();

    @objid ("ef7e8804-aeaa-41e5-a27d-163422ea6888")
    void setIsException(boolean value);

    @objid ("8425d066-9b05-44ee-b0c5-78daa2b90a8e")
    boolean isIsStream();

    @objid ("52b1797a-e3c7-4392-a762-ff9db7b5be77")
    void setIsStream(boolean value);

    @objid ("4cee0f49-6844-4cd2-87ee-8ee2000a4efb")
    ParameterEffectKind getEffect();

    @objid ("c265767e-bdeb-4d74-b656-68bfb2b0dea1")
    void setEffect(ParameterEffectKind value);

    @objid ("0dc4a4fb-0468-49b7-b48a-2dbd7111580a")
    EList<BpmnDataInput> getBpmnRepresentingDataInput();

    @objid ("89aa0910-ea21-4c3f-8d69-a3f8026a36ff")
    <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass);

    @objid ("67b36655-e013-4f10-9849-f04c9fa157fb")
    GeneralClass getType();

    @objid ("63925dc7-7846-4bec-ae45-f587b394a4b7")
    void setType(GeneralClass value);

    @objid ("28d4732b-1441-4d41-a626-0a5ab035d96b")
    Operation getComposed();

    @objid ("a7b4a448-f840-452c-93e3-6970c5aa60b6")
    void setComposed(Operation value);

    @objid ("31653de7-fbf9-46c6-8aaa-4eeb4ba3c1d8")
    EList<Pin> getMatching();

    @objid ("6fa99e3b-315c-46b4-9a84-b9ac5ba1cce2")
    <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass);

    @objid ("4d58088c-5fd9-4df6-b402-37c40ea7a2ac")
    EList<BpmnDataOutput> getBpmnRepresentingDataOutput();

    @objid ("91385255-5779-4c3c-9d93-831e0a2b5fee")
    <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass);

    @objid ("4e5114f8-7f12-44a5-bb88-4ab43ec0f2a5")
    EList<Signal> getSRepresentation();

    @objid ("1af59e87-cfcc-414b-9103-c6dba22901b7")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("38b843e8-15af-449e-a977-b56f87b7570d")
    Operation getReturned();

    @objid ("ef1ad384-d16e-4153-8d5d-2abc751a5c90")
    void setReturned(Operation value);

    @objid ("3acca5e3-ce12-48dc-a135-d8d61a6bfbd5")
    EList<BehaviorParameter> getBehaviorParam();

    @objid ("47a9482b-0013-4377-9048-49e74ec706eb")
    <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass);

}
