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
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001d5f2e-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterImpl extends GeneralClassImpl implements TemplateParameter {
    @objid ("8fd6ed64-f86a-4238-a009-f05df57a9c63")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(TemplateParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("ad2c08f8-12e7-4600-98a0-19e7e72286cc")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(TemplateParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("a2821ae2-6860-4eb3-a090-7a8d36ee9142")
    @Override
    public boolean isIsValueParameter() {
        return (Boolean) getAttVal(TemplateParameterData.Metadata.IsValueParameterAtt());
    }

    @objid ("588a67eb-0478-4fb3-94a5-144d51f0b26f")
    @Override
    public void setIsValueParameter(boolean value) {
        setAttVal(TemplateParameterData.Metadata.IsValueParameterAtt(), value);
    }

    @objid ("307b28da-c6a8-465d-b5ff-a854bff6474c")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateParameterData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("82160b1c-7cf5-4033-91e1-42bce4a3ce46")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("14652a3e-853a-4e66-843a-fad12af1bed8")
    @Override
    public ModelElement getType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.TypeDep());
    }

    @objid ("5189ff45-2b73-413f-a202-bc07c6042542")
    @Override
    public void setType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("0cd10a33-5ec9-47d4-a6a7-b8e6ceb50df5")
    @Override
    public NameSpace getParameterized() {
        return (NameSpace) getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
    }

    @objid ("41fca8d4-e342-4507-b1b1-9fdfbf0e2d82")
    @Override
    public void setParameterized(NameSpace value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedDep(), (SmObjectImpl)value);
    }

    @objid ("4e6a726a-06e0-4bc3-bb55-67a15ad210b3")
    @Override
    public ModelElement getOwnedParameterElement() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep());
    }

    @objid ("8cf4ef88-b808-4424-b3f3-2f06bb608792")
    @Override
    public void setOwnedParameterElement(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep(), (SmObjectImpl)value);
    }

    @objid ("b5838410-d7f5-499b-b916-349a323fb2e3")
    @Override
    public ModelElement getDefaultType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.DefaultTypeDep());
    }

    @objid ("f15d8e89-90f3-44c0-89a9-a1cd5e404e24")
    @Override
    public void setDefaultType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.DefaultTypeDep(), (SmObjectImpl)value);
    }

    @objid ("422c1215-be2b-4dcb-9841-51b2f493c316")
    @Override
    public Operation getParameterizedOperation() {
        return (Operation) getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
    }

    @objid ("7c5f5f8f-7507-465d-a2cb-b153019b4c78")
    @Override
    public void setParameterizedOperation(Operation value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), (SmObjectImpl)value);
    }

    @objid ("2c39ee61-b433-4d5b-b020-1bbfabadfd67")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("107c6264-018a-4eed-b5ee-4922d96e987e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("33c957c9-8354-4a7f-851f-54104bf5e454")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameter(this);
        else
          return null;
    }

}
