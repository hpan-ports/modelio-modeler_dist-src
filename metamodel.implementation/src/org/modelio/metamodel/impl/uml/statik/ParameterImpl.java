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
    @objid ("5cbe17c5-8d0a-4866-8576-29dd358de764")
    @Override
    public PassingMode getParameterPassing() {
        return (PassingMode) getAttVal(ParameterData.Metadata.ParameterPassingAtt());
    }

    @objid ("9735f70c-7492-40ea-833b-f49d60300da0")
    @Override
    public void setParameterPassing(PassingMode value) {
        setAttVal(ParameterData.Metadata.ParameterPassingAtt(), value);
    }

    @objid ("65f05ad8-e7fb-4cbc-9523-12fa023a1d34")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMinAtt());
    }

    @objid ("0a13ba53-85d4-4c3e-bc1b-3ce7b3239d9c")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("d3fd8095-3013-452b-916a-a5c5d02ade3f")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("88adb11a-b308-460b-9add-ffdde55f22b0")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("04795218-3373-448b-a652-c9133eb66ebc")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(ParameterData.Metadata.TypeConstraintAtt());
    }

    @objid ("3436e148-1687-4430-905d-f75526499eae")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(ParameterData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("243d6a11-7fb4-4751-880c-f7d28d09f347")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(ParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("db751eac-7e3b-4ee0-8da7-afe1666fcc1b")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(ParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("b52a011a-c55d-49ce-9c96-619e3ad62892")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsOrderedAtt());
    }

    @objid ("a0700f01-48b3-482e-8e60-51d94f9526d3")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(ParameterData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("5f746c8f-1876-4a49-bd31-101cdc56d2fa")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsUniqueAtt());
    }

    @objid ("bbc1bb50-20e4-4762-83b5-5be3c4ccf2de")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(ParameterData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("a022224e-86c2-46a7-a949-9087b6a20362")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsExceptionAtt());
    }

    @objid ("b9d15be1-4228-492e-bae2-727c42127937")
    @Override
    public void setIsException(boolean value) {
        setAttVal(ParameterData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("da3805d7-0140-483c-aebe-55711b033f07")
    @Override
    public boolean isIsStream() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsStreamAtt());
    }

    @objid ("7d150d3e-b163-4dff-bd6e-3f933076c099")
    @Override
    public void setIsStream(boolean value) {
        setAttVal(ParameterData.Metadata.IsStreamAtt(), value);
    }

    @objid ("dc6b858f-c5eb-4d7f-bcd5-6632f8b18a9c")
    @Override
    public ParameterEffectKind getEffect() {
        return (ParameterEffectKind) getAttVal(ParameterData.Metadata.EffectAtt());
    }

    @objid ("a8ac07f1-9539-4b70-85d3-53a051f3bd8b")
    @Override
    public void setEffect(ParameterEffectKind value) {
        setAttVal(ParameterData.Metadata.EffectAtt(), value);
    }

    @objid ("9d1d51a0-c68d-46e6-b7b0-39b9d801e492")
    @Override
    public EList<BpmnDataInput> getBpmnRepresentingDataInput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataInputDep());
    }

    @objid ("dd70d011-8ead-4d5e-8de3-efedf6b6cdca")
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

    @objid ("1bed3900-a865-4b12-82f1-ad2721b306d0")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ParameterData.Metadata.TypeDep());
    }

    @objid ("c0fe6dc8-c2c1-4ca0-a2f2-34c6d07382c3")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("37df4606-b186-4656-a5c2-83aedd64ce48")
    @Override
    public Operation getComposed() {
        return (Operation) getDepVal(ParameterData.Metadata.ComposedDep());
    }

    @objid ("ac6b1e80-2ba7-47f8-a9a7-378e846e0bc1")
    @Override
    public void setComposed(Operation value) {
        appendDepVal(ParameterData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("19bff7b2-ccaf-4d41-a1ac-97a829bea718")
    @Override
    public EList<Pin> getMatching() {
        return new SmList<>(this, ParameterData.Metadata.MatchingDep());
    }

    @objid ("77e13fbe-23c6-4273-b067-47dfb3e1d43f")
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

    @objid ("cea1f3c9-7e0c-4702-a57b-13d54c1b4403")
    @Override
    public EList<BpmnDataOutput> getBpmnRepresentingDataOutput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataOutputDep());
    }

    @objid ("6b2b71df-3199-4285-8c6e-70aaa5b143a5")
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

    @objid ("c181ab6a-a9a8-424a-adae-35dc9cd3a7b5")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ParameterData.Metadata.SRepresentationDep());
    }

    @objid ("08ded0d6-92bc-4edc-aa94-cdd82f24dfe6")
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

    @objid ("bf7bea4e-8a75-487b-8a17-45e6472d83d3")
    @Override
    public Operation getReturned() {
        return (Operation) getDepVal(ParameterData.Metadata.ReturnedDep());
    }

    @objid ("1c6dda45-35a0-4d03-9765-646782c9e231")
    @Override
    public void setReturned(Operation value) {
        appendDepVal(ParameterData.Metadata.ReturnedDep(), (SmObjectImpl)value);
    }

    @objid ("180b4706-8bc0-4ecd-b9d3-6752260e2a3a")
    @Override
    public EList<BehaviorParameter> getBehaviorParam() {
        return new SmList<>(this, ParameterData.Metadata.BehaviorParamDep());
    }

    @objid ("369d4fd1-ba76-4145-80b7-3fb7bd723606")
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

    @objid ("2b12ecf9-e99f-42e3-9220-0ece3eb93ce9")
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

    @objid ("17273b5f-bd41-44c6-ba9a-2af782c65134")
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

    @objid ("7e6d868a-283b-404b-8021-83f2bfd6ba3c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitParameter(this);
        else
          return null;
    }

}
