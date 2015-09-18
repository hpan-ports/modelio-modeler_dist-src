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
    @objid ("e03421dd-27ed-4c10-87a1-cd43ca2181ac")
    PassingMode getParameterPassing();

    @objid ("fc322e39-6379-457a-a862-c86dbc5bcb6e")
    void setParameterPassing(PassingMode value);

    @objid ("8e6586bb-3268-4367-8aaa-0ccdce90bd72")
    String getMultiplicityMin();

    @objid ("4c6e2d3e-c8ac-4388-b731-7261deb65ec7")
    void setMultiplicityMin(String value);

    @objid ("02e7ebc5-726e-4c19-9690-f476d56d808f")
    String getMultiplicityMax();

    @objid ("bc36744e-6dc3-42ac-a51f-2641dbfe0cda")
    void setMultiplicityMax(String value);

    @objid ("9af7dc05-5c8c-4c36-a2ec-9df9e231c351")
    String getTypeConstraint();

    @objid ("50d1bf1e-0a68-4df6-b7aa-ecc406b4f695")
    void setTypeConstraint(String value);

    @objid ("8a1f7967-9e82-4428-b25d-abc4acb7fefc")
    String getDefaultValue();

    @objid ("97bff7e0-0cc0-4cac-b4a3-617b0fc89ae8")
    void setDefaultValue(String value);

    @objid ("bdb64230-0427-4547-968a-ee9c3b506782")
    boolean isIsOrdered();

    @objid ("d930cfa5-2b3e-4559-a818-feaf02c826fd")
    void setIsOrdered(boolean value);

    @objid ("1e04bad3-181b-46e8-8a6c-0acce9b8f80a")
    boolean isIsUnique();

    @objid ("c9c60ac0-e705-4c77-9d97-456deea2bc28")
    void setIsUnique(boolean value);

    @objid ("374f38ec-2502-4c42-aed6-3820a882ee5b")
    boolean isIsException();

    @objid ("16b7a490-3482-469b-b5aa-720dad7beb4b")
    void setIsException(boolean value);

    @objid ("8668e258-6037-4b1c-855f-29e47253d1ce")
    boolean isIsStream();

    @objid ("decbc358-2a21-480f-8e12-1a0a363dd1ec")
    void setIsStream(boolean value);

    @objid ("c0e8a497-93d5-4e87-ac68-767386058e87")
    ParameterEffectKind getEffect();

    @objid ("d068a721-b605-42a4-804b-55a2813573fe")
    void setEffect(ParameterEffectKind value);

    @objid ("ed8d55bc-ce7e-4e13-8de1-95c6bc482657")
    EList<BpmnDataInput> getBpmnRepresentingDataInput();

    @objid ("23b2687f-5c7f-4612-854c-428a5faf4c53")
    <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass);

    @objid ("4a7f6694-4c1e-4ed5-9a65-cad915cadf0f")
    GeneralClass getType();

    @objid ("957ec5ef-b58f-4843-8424-c9e281e11433")
    void setType(GeneralClass value);

    @objid ("6823a141-0c12-4526-9b1a-741952b8bbd8")
    Operation getComposed();

    @objid ("d9f1e387-a1be-458c-bbcb-5344f3fe9397")
    void setComposed(Operation value);

    @objid ("0beb9024-6faa-42c2-ab40-eea3b1819a9e")
    EList<Pin> getMatching();

    @objid ("436952ab-2678-439a-8756-66f2a48ee049")
    <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass);

    @objid ("401b195c-3379-47f5-82dd-723a4ff1100b")
    EList<BpmnDataOutput> getBpmnRepresentingDataOutput();

    @objid ("79907e64-e691-4806-ab34-948054920ef0")
    <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass);

    @objid ("be100936-7268-4010-bf67-f7afd07242d9")
    EList<Signal> getSRepresentation();

    @objid ("8b34b351-7cc7-437b-9cac-ab0ea64fbb4d")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("3bda932d-a745-444b-8ffc-079fa7098abb")
    Operation getReturned();

    @objid ("f179329d-058b-4dbf-9d11-e0ae2262d98b")
    void setReturned(Operation value);

    @objid ("2d7fe310-8538-4f15-88b4-70bfb480c9b7")
    EList<BehaviorParameter> getBehaviorParam();

    @objid ("7d75c401-4c76-49bd-97b3-32ac9d7cff10")
    <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass);

}
