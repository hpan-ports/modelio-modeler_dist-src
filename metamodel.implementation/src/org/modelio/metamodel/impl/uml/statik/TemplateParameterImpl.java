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
    @objid ("99f440fb-e065-41f5-9bf7-ad5a85905d3e")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(TemplateParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("1fde7ccb-34b6-4b20-8692-1d2540d4ea98")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(TemplateParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("649fe047-5b7b-47ee-af23-a9fc25751ab6")
    @Override
    public boolean isIsValueParameter() {
        return (Boolean) getAttVal(TemplateParameterData.Metadata.IsValueParameterAtt());
    }

    @objid ("f2e2bb93-3e3d-4147-ae51-18d740c18069")
    @Override
    public void setIsValueParameter(boolean value) {
        setAttVal(TemplateParameterData.Metadata.IsValueParameterAtt(), value);
    }

    @objid ("638968c9-39ee-412f-b3e4-4cdf5ebc9756")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateParameterData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("935a75c7-965e-4521-b4f6-29730f0ed27c")
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

    @objid ("cd2fc0b7-b04d-40c6-845d-3bb4baa2237b")
    @Override
    public ModelElement getType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.TypeDep());
    }

    @objid ("c7149547-7e26-44db-bd14-91035286a336")
    @Override
    public void setType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("d5584d4d-ed0e-4bc0-af9a-b769bc14b39e")
    @Override
    public NameSpace getParameterized() {
        return (NameSpace) getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
    }

    @objid ("2b45dd34-2635-4d10-9bc2-aedc1e094288")
    @Override
    public void setParameterized(NameSpace value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedDep(), (SmObjectImpl)value);
    }

    @objid ("5258172b-216b-459c-b18e-2a31c68c7814")
    @Override
    public ModelElement getOwnedParameterElement() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep());
    }

    @objid ("b45f6625-ef7e-4a8a-ada8-39c4b43b65a0")
    @Override
    public void setOwnedParameterElement(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep(), (SmObjectImpl)value);
    }

    @objid ("a16dc74f-c952-4efe-919e-ce5740b37424")
    @Override
    public ModelElement getDefaultType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.DefaultTypeDep());
    }

    @objid ("eaf54a88-11d6-4e6e-a962-9b2fe12d4fca")
    @Override
    public void setDefaultType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.DefaultTypeDep(), (SmObjectImpl)value);
    }

    @objid ("2435b778-5fde-4cc2-973b-0103ac6ee508")
    @Override
    public Operation getParameterizedOperation() {
        return (Operation) getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
    }

    @objid ("77502ed2-bce5-4862-8371-c4c9332736e2")
    @Override
    public void setParameterizedOperation(Operation value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), (SmObjectImpl)value);
    }

    @objid ("84bce008-e065-4ef5-96fe-d4bbd848a81c")
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

    @objid ("2bcf3e36-738a-40a9-9d09-c94fb8b5933f")
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

    @objid ("df31c225-1d10-4410-8d73-230140bc7a46")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameter(this);
        else
          return null;
    }

}
