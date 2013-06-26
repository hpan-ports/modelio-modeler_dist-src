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
    @objid ("200da25d-a58a-4d62-9f59-99edfb4c3ef6")
    @Override
    public PassingMode getParameterPassing() {
        return (PassingMode) getAttVal(ParameterData.Metadata.ParameterPassingAtt());
    }

    @objid ("62e484ec-6de1-473e-b14a-4a9a219f1f5f")
    @Override
    public void setParameterPassing(PassingMode value) {
        setAttVal(ParameterData.Metadata.ParameterPassingAtt(), value);
    }

    @objid ("6df7c04e-5a30-4cae-964b-577a087796cf")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMinAtt());
    }

    @objid ("7bade2db-51b3-46ca-948c-5be66f63cc8f")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("2cd6f85b-3630-4aaa-b53e-8321cf1d2701")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(ParameterData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("bc0d7675-dd03-4bea-9186-a117e96eac65")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(ParameterData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("b89f52e3-b7bb-4e0f-983c-5b7742f83ab9")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(ParameterData.Metadata.TypeConstraintAtt());
    }

    @objid ("654ac2f1-d552-4937-9d9f-939f36710e14")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(ParameterData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("8f158486-a758-414d-9238-c0ba084b9b20")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(ParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("6af0fb82-f5bb-457e-8408-e4a87d5a09a5")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(ParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("42c95327-c412-4328-9187-486618d2e1ab")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsOrderedAtt());
    }

    @objid ("0fac4904-fb4e-49a3-a899-4f6e9d7d255e")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(ParameterData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("143b363f-1063-4cd5-ad94-5ed3ed166524")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsUniqueAtt());
    }

    @objid ("0db3561c-f38e-4e64-9d3c-8321d947cb75")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(ParameterData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("a034f9a7-1c32-4534-90b3-024534f8d94c")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsExceptionAtt());
    }

    @objid ("004cfea9-6392-438b-8a6c-9b07399d9dc2")
    @Override
    public void setIsException(boolean value) {
        setAttVal(ParameterData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("3b8290e7-2081-4dc7-860c-9044ae8d8df4")
    @Override
    public boolean isIsStream() {
        return (Boolean) getAttVal(ParameterData.Metadata.IsStreamAtt());
    }

    @objid ("f4d5dd96-5cc4-4e3b-9c7f-2c87553f3619")
    @Override
    public void setIsStream(boolean value) {
        setAttVal(ParameterData.Metadata.IsStreamAtt(), value);
    }

    @objid ("56de6331-07ee-4ba2-b1c8-8939f7710fe7")
    @Override
    public ParameterEffectKind getEffect() {
        return (ParameterEffectKind) getAttVal(ParameterData.Metadata.EffectAtt());
    }

    @objid ("82fd074f-b93d-47a9-af05-c069273c1349")
    @Override
    public void setEffect(ParameterEffectKind value) {
        setAttVal(ParameterData.Metadata.EffectAtt(), value);
    }

    @objid ("addefa5e-e98f-4250-9db6-cf3b02b09524")
    @Override
    public EList<BpmnDataInput> getBpmnRepresentingDataInput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataInputDep());
    }

    @objid ("5b470203-5a32-4cba-bbec-b0fb3b5d11b9")
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

    @objid ("0f53430a-cf0d-410c-8787-c0ef28df77eb")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ParameterData.Metadata.TypeDep());
    }

    @objid ("5b57198a-9cec-4914-bd81-30f9cb870406")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("8f1ea0ae-e276-4921-89c6-6ca094656b56")
    @Override
    public Operation getComposed() {
        return (Operation) getDepVal(ParameterData.Metadata.ComposedDep());
    }

    @objid ("1b0751b3-1c87-4618-9e64-0dd79a5a151d")
    @Override
    public void setComposed(Operation value) {
        appendDepVal(ParameterData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("ef9e1268-4aaf-4619-bb62-a5c906848749")
    @Override
    public EList<Pin> getMatching() {
        return new SmList<>(this, ParameterData.Metadata.MatchingDep());
    }

    @objid ("698f905c-8f6e-48e4-8965-a10742a7d68a")
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

    @objid ("ad4e623d-d16c-4e74-98c3-2a251b6a53b5")
    @Override
    public EList<BpmnDataOutput> getBpmnRepresentingDataOutput() {
        return new SmList<>(this, ParameterData.Metadata.BpmnRepresentingDataOutputDep());
    }

    @objid ("a3aefa9e-506f-4ae8-bc52-1a671c88cdb4")
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

    @objid ("64e95ff9-ef8b-4724-a89b-87a142582827")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ParameterData.Metadata.SRepresentationDep());
    }

    @objid ("f602f309-52ee-4a1d-ad5b-2f3ffa173cc5")
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

    @objid ("d6478f79-66b9-4d36-b1b3-2d9df927faff")
    @Override
    public Operation getReturned() {
        return (Operation) getDepVal(ParameterData.Metadata.ReturnedDep());
    }

    @objid ("51f6a0b4-d3fe-499d-95bf-feb119ff1fd6")
    @Override
    public void setReturned(Operation value) {
        appendDepVal(ParameterData.Metadata.ReturnedDep(), (SmObjectImpl)value);
    }

    @objid ("99b42875-58be-4d55-9eaa-6e1ee19d95cf")
    @Override
    public EList<BehaviorParameter> getBehaviorParam() {
        return new SmList<>(this, ParameterData.Metadata.BehaviorParamDep());
    }

    @objid ("c923322f-f58d-4c00-9d39-724b6e554afc")
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

    @objid ("59667131-060c-4e52-a1d8-04f0a42cfa8d")
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

    @objid ("31e0ee12-303b-458f-bae6-87b3486ca7e6")
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

    @objid ("c7a6d3c0-deed-4a66-8be4-a26232e41182")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitParameter(this);
        else
          return null;
    }

}
