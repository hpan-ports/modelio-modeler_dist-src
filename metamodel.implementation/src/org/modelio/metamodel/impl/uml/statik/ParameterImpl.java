/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.ParameterData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00180e5c-c4bf-1fd8-97fe-001ec947cd2a")
public class ParameterImpl extends ModelElementImpl implements Parameter {
    @objid ("55ca4946-3e99-4b8b-bbe8-24dc806031a9")
    @Override
    public PassingMode getParameterPassing() {
        return (PassingMode) getAttVal(((ParameterSmClass)getClassOf()).getParameterPassingAtt());
    }

    @objid ("45306ec5-f9a7-4d8c-b17a-87b56f701cb6")
    @Override
    public void setParameterPassing(PassingMode value) {
        setAttVal(((ParameterSmClass)getClassOf()).getParameterPassingAtt(), value);
    }

    @objid ("98595d2e-e967-451f-9145-953c41a5df7c")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(((ParameterSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("d1118c01-7779-47e2-bc7d-591b5ce494cf")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(((ParameterSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("a11a4fae-26b2-4fb4-8e65-5c7c101f9854")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(((ParameterSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("287da818-94f0-4eae-aef9-ab2b2be509cf")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(((ParameterSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("7e7fcda6-c514-4390-943d-b5e1d800896e")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(((ParameterSmClass)getClassOf()).getTypeConstraintAtt());
    }

    @objid ("b70a9cf1-cf2b-43d8-b14d-a2456e006da4")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(((ParameterSmClass)getClassOf()).getTypeConstraintAtt(), value);
    }

    @objid ("7892decc-9d87-4061-b77b-ea8ec6a3dcbf")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(((ParameterSmClass)getClassOf()).getDefaultValueAtt());
    }

    @objid ("30079f64-7237-413d-8f69-43e19accaef9")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(((ParameterSmClass)getClassOf()).getDefaultValueAtt(), value);
    }

    @objid ("32a6673c-3aaf-4496-8870-0651b427e644")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(((ParameterSmClass)getClassOf()).getIsOrderedAtt());
    }

    @objid ("012e1828-eab5-4348-bebe-7c71e9aae50b")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(((ParameterSmClass)getClassOf()).getIsOrderedAtt(), value);
    }

    @objid ("a5743075-05ce-4edf-aeb0-f9201877d3d4")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(((ParameterSmClass)getClassOf()).getIsUniqueAtt());
    }

    @objid ("1de64e76-2452-4221-8303-b379bfec2a23")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(((ParameterSmClass)getClassOf()).getIsUniqueAtt(), value);
    }

    @objid ("82486f37-d54b-4bb2-8dca-d56df4983302")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(((ParameterSmClass)getClassOf()).getIsExceptionAtt());
    }

    @objid ("ee99f4d6-e00b-45f2-9c52-49dd27abfeec")
    @Override
    public void setIsException(boolean value) {
        setAttVal(((ParameterSmClass)getClassOf()).getIsExceptionAtt(), value);
    }

    @objid ("8fd54566-b9ed-4e58-84c8-6c71f45e9aae")
    @Override
    public boolean isIsStream() {
        return (Boolean) getAttVal(((ParameterSmClass)getClassOf()).getIsStreamAtt());
    }

    @objid ("d120984a-758e-423f-a032-2b43d30451b8")
    @Override
    public void setIsStream(boolean value) {
        setAttVal(((ParameterSmClass)getClassOf()).getIsStreamAtt(), value);
    }

    @objid ("ce4ad59a-229f-4fed-b5ea-8767ccb24fec")
    @Override
    public ParameterEffectKind getEffect() {
        return (ParameterEffectKind) getAttVal(((ParameterSmClass)getClassOf()).getEffectAtt());
    }

    @objid ("13fb83ba-046d-4919-a8ae-e0cce94b47a7")
    @Override
    public void setEffect(ParameterEffectKind value) {
        setAttVal(((ParameterSmClass)getClassOf()).getEffectAtt(), value);
    }

    @objid ("447133a4-ead0-4723-bb1f-1a2369e1979f")
    @Override
    public EList<BpmnDataInput> getBpmnRepresentingDataInput() {
        return new SmList<>(this, ((ParameterSmClass)getClassOf()).getBpmnRepresentingDataInputDep());
    }

    @objid ("cabc859a-c624-4f91-8e49-7f8661b35103")
    @Override
    public <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataInput element : getBpmnRepresentingDataInput()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("37adaa53-c2a2-44c7-af70-5cbb3b554b8e")
    @Override
    public GeneralClass getType() {
        Object obj = getDepVal(((ParameterSmClass)getClassOf()).getTypeDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("cde7918a-2db1-4c34-bbb5-8d331001db24")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(((ParameterSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("f7e383e4-9ae8-4e7e-9a5e-00dbaac12f4e")
    @Override
    public Operation getComposed() {
        Object obj = getDepVal(((ParameterSmClass)getClassOf()).getComposedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("027293c9-7612-4b57-b952-bfff2ca815b2")
    @Override
    public void setComposed(Operation value) {
        appendDepVal(((ParameterSmClass)getClassOf()).getComposedDep(), (SmObjectImpl)value);
    }

    @objid ("40d9b73f-898c-4c33-b69d-cf9acad3a2b6")
    @Override
    public EList<Pin> getMatching() {
        return new SmList<>(this, ((ParameterSmClass)getClassOf()).getMatchingDep());
    }

    @objid ("8149dbfe-30e0-4afd-9f18-0de316133650")
    @Override
    public <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Pin element : getMatching()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8f971808-8e25-4e65-a372-3ef4e724d24c")
    @Override
    public EList<BpmnDataOutput> getBpmnRepresentingDataOutput() {
        return new SmList<>(this, ((ParameterSmClass)getClassOf()).getBpmnRepresentingDataOutputDep());
    }

    @objid ("2e1675e0-b86c-4a67-adbe-04f93285ff34")
    @Override
    public <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataOutput element : getBpmnRepresentingDataOutput()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("715aceea-1142-46b1-9292-8426c7f0ceaf")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ((ParameterSmClass)getClassOf()).getSRepresentationDep());
    }

    @objid ("b454b5f8-b3eb-4d0c-b399-a4d288a58370")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Signal element : getSRepresentation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ae1b6d57-c4ac-463f-9bdc-8aca5dd2d513")
    @Override
    public Operation getReturned() {
        Object obj = getDepVal(((ParameterSmClass)getClassOf()).getReturnedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("ac75c468-f495-4ba2-9ad8-f2ec215902b1")
    @Override
    public void setReturned(Operation value) {
        appendDepVal(((ParameterSmClass)getClassOf()).getReturnedDep(), (SmObjectImpl)value);
    }

    @objid ("42a99b05-c0dc-44fa-9850-4aabbc139a86")
    @Override
    public EList<BehaviorParameter> getBehaviorParam() {
        return new SmList<>(this, ((ParameterSmClass)getClassOf()).getBehaviorParamDep());
    }

    @objid ("63119d8a-2007-4e13-bdf2-018c9ccc9d49")
    @Override
    public <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BehaviorParameter element : getBehaviorParam()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("310b27cd-89e3-4c5d-be4b-8c3942b32287")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Composed
        obj = (SmObjectImpl)this.getDepVal(((ParameterSmClass)getClassOf()).getComposedDep());
        if (obj != null)
          return obj;
        // Returned
        obj = (SmObjectImpl)this.getDepVal(((ParameterSmClass)getClassOf()).getReturnedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("39e18f6c-48b8-48a3-aa9d-7a580ea72f65")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Composed
        dep = ((ParameterSmClass)getClassOf()).getComposedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Returned
        dep = ((ParameterSmClass)getClassOf()).getReturnedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6c53dbfc-c973-4a51-a12f-38261bff0465")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitParameter(this);
        else
          return null;
    }

}
