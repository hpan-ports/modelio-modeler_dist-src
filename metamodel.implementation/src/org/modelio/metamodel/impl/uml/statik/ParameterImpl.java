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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00180e5c-c4bf-1fd8-97fe-001ec947cd2a")
public class ParameterImpl extends ModelElementImpl implements Parameter {
    @objid ("3f750bf0-ff16-4c42-a6b6-2b8b8efeb9f3")
    @Override
    public PassingMode getParameterPassing() {
        return (PassingMode) getAttVal(ParameterData.Metadata.ParameterPassingAtt());
    }

    @objid ("a81a1452-c5f9-4f2d-a879-9dc7e058c663")
    @Override
    public void setParameterPassing(PassingMode value) {
        setAttVal(ParameterData.Metadata.ParameterPassingAtt(), value);
    }

    @objid ("8986d169-bc77-487b-bf2d-b052d6371057")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMinAtt());
    }

    @objid ("7400b0a6-e774-4f34-8067-d791cdf0f864")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("026ce79f-a17f-4c01-b6c2-80fa5fa8abe2")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("5269fa03-7926-4729-b03c-f7a1aa0726c5")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("45f39e56-5dfd-4eee-be03-5c21b3c384ef")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(ParameterData.Metadata.TypeConstraintAtt());
    }

    @objid ("842195b5-a7ba-42be-9cd7-27a262b92b79")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(ParameterData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("a0c831a1-19aa-4654-a32e-371ffa6ae01a")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(ParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("141284d8-8d2b-4c0c-aff0-df834bc04e73")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(ParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("ec2c7ad2-04fa-46e1-afe9-5bcb6101ae07")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsOrderedAtt());
    }

    @objid ("9da7b361-60ec-4e17-af87-43b2ba8ae72d")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(ParameterData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("be66f4db-f2df-47d1-b89f-3de82b3c4a4f")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsUniqueAtt());
    }

    @objid ("72733003-35c0-4259-b976-d6c148cf0d73")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(ParameterData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("2871e85e-d913-458f-a088-fb089df97fed")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsExceptionAtt());
    }

    @objid ("d4ce5aca-9f0e-4065-8af4-90a3b35a8f8d")
    @Override
    public void setIsException(boolean value) {
        setAttVal(ParameterData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("44856212-dfaf-480d-b552-f34b357256d1")
    @Override
    public boolean isIsStream() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsStreamAtt());
    }

    @objid ("9aed095e-1dde-4791-ab8e-4cabb3d8daf5")
    @Override
    public void setIsStream(boolean value) {
        setAttVal(ParameterData.Metadata.IsStreamAtt(), value);
    }

    @objid ("d77e8829-4969-42b0-ab38-72d8cc6bb18e")
    @Override
    public ParameterEffectKind getEffect() {
        return (ParameterEffectKind) getAttVal(ParameterData.Metadata.EffectAtt());
    }

    @objid ("b2f214ce-e1d7-4a3f-aa5d-c0b9fea049be")
    @Override
    public void setEffect(ParameterEffectKind value) {
        setAttVal(ParameterData.Metadata.EffectAtt(), value);
    }

    @objid ("c111661f-7c0c-432f-9c26-4edddbaa7185")
    @Override
    public EList<BpmnDataInput> getBpmnRepresentingDataInput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataInputDep());
    }

    @objid ("c570baa2-bc34-4536-a203-b9ff7aed6a1f")
    @Override
    public <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataInput element : getBpmnRepresentingDataInput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("357e4874-38ef-4389-9b61-b7032940a267")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ParameterData.Metadata.TypeDep());
    }

    @objid ("469059f1-2962-410a-9ed2-394bc43cd980")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("729a46cd-511d-4fb2-8868-098bc8deb06d")
    @Override
    public Operation getComposed() {
        return (Operation) getDepVal(ParameterData.Metadata.ComposedDep());
    }

    @objid ("5de313e4-4560-4882-aae8-c343637cd772")
    @Override
    public void setComposed(Operation value) {
        appendDepVal(ParameterData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("43361e93-b54b-4105-a7a1-b22d293d8b99")
    @Override
    public EList<Pin> getMatching() {
        return new SmList<>(this, ParameterData.Metadata.MatchingDep());
    }

    @objid ("b5d49563-15b3-4a71-a13a-888d474a1059")
    @Override
    public <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Pin element : getMatching()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7683d32a-4833-4512-b263-c46fa0bd9135")
    @Override
    public EList<BpmnDataOutput> getBpmnRepresentingDataOutput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataOutputDep());
    }

    @objid ("3eb56876-4e91-4fe9-9f26-3b89f9f19481")
    @Override
    public <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataOutput element : getBpmnRepresentingDataOutput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4eeecdd8-90ef-43a1-8edf-00ed6f19148f")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ParameterData.Metadata.SRepresentationDep());
    }

    @objid ("9f21b10a-b53b-441e-b764-0c0b49a1ae4a")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Signal element : getSRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b498f535-bb78-4cf0-8c80-2b2e91d3c751")
    @Override
    public Operation getReturned() {
        return (Operation) getDepVal(ParameterData.Metadata.ReturnedDep());
    }

    @objid ("a75c12cc-ac16-4e92-9186-e979118ea86e")
    @Override
    public void setReturned(Operation value) {
        appendDepVal(ParameterData.Metadata.ReturnedDep(), (SmObjectImpl)value);
    }

    @objid ("deaa8d35-c062-4b75-be6d-576aefa8dfdc")
    @Override
    public EList<BehaviorParameter> getBehaviorParam() {
        return new SmList<>(this, ParameterData.Metadata.BehaviorParamDep());
    }

    @objid ("c4dd3b0e-e580-4d13-9eb3-da1f3cff9212")
    @Override
    public <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BehaviorParameter element : getBehaviorParam()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6a6439bf-4a28-4041-a41b-372a7461c31e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ReturnedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d45bf49c-7c73-4634-877e-ac1433b0dc38")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(ParameterData.Metadata.ComposedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ParameterData.Metadata.ReturnedDep());
        if (obj != null)
          return new SmDepVal(ParameterData.Metadata.ReturnedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("77d05863-7871-488a-a01f-a5c2587d97e1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitParameter(this);
        else
          return null;
    }

}
