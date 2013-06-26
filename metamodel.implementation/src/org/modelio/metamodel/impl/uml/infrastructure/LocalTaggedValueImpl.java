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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.LocalTaggedValueData;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0087fb04-c4be-1fd8-97fe-001ec947cd2a")
public class LocalTaggedValueImpl extends ModelElementImpl implements LocalTaggedValue {
    @objid ("bd509216-2718-400c-9eaa-4c49e6ada5ec")
    @Override
    public boolean isIsVisible() {
        return (Boolean) getAttVal(LocalTaggedValueData.Metadata.IsVisibleAtt());
    }

    @objid ("60a28bf1-f3c7-467e-95d8-337905660024")
    @Override
    public void setIsVisible(boolean value) {
        setAttVal(LocalTaggedValueData.Metadata.IsVisibleAtt(), value);
    }

    @objid ("8773f081-0cdc-4739-becd-75b1efd2b8ba")
    @Override
    public ModelElement getLocalAnnoted() {
        return (ModelElement) getDepVal(LocalTaggedValueData.Metadata.LocalAnnotedDep());
    }

    @objid ("ea9dbc7e-59b2-4d9a-bf06-f0a78375b52b")
    @Override
    public void setLocalAnnoted(ModelElement value) {
        appendDepVal(LocalTaggedValueData.Metadata.LocalAnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("426132ee-9c1d-4c51-951d-3c87d0a8b00d")
    @Override
    public TagType getLocalDefinition() {
        return (TagType) getDepVal(LocalTaggedValueData.Metadata.LocalDefinitionDep());
    }

    @objid ("27a66d5e-7434-426b-a545-bbe13a341734")
    @Override
    public void setLocalDefinition(TagType value) {
        appendDepVal(LocalTaggedValueData.Metadata.LocalDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("589af22e-46ec-40b1-a821-32761b69a142")
    @Override
    public EList<TagParameter> getLocalActual() {
        return new SmList<>(this, LocalTaggedValueData.Metadata.LocalActualDep());
    }

    @objid ("c75bc0a5-b45f-46f8-be56-4ad2b56b28e5")
    @Override
    public <T extends TagParameter> List<T> getLocalActual(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TagParameter element : getLocalActual()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1905c331-6276-4e47-a9f3-045b5ae85461")
    @Override
    public TagParameter getLocalQualifier() {
        return (TagParameter) getDepVal(LocalTaggedValueData.Metadata.LocalQualifierDep());
    }

    @objid ("5a8b38dc-7fd3-4f3e-a52d-d5a6d0ea1cea")
    @Override
    public void setLocalQualifier(TagParameter value) {
        appendDepVal(LocalTaggedValueData.Metadata.LocalQualifierDep(), (SmObjectImpl)value);
    }

    @objid ("641c38eb-1fd3-4cd5-a836-030d1292aeea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LocalTaggedValueData.Metadata.LocalAnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ab87cb29-1d07-4a76-8fd7-b4c066a9b506")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LocalTaggedValueData.Metadata.LocalAnnotedDep());
        if (obj != null)
          return new SmDepVal(LocalTaggedValueData.Metadata.LocalAnnotedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eb170a53-c618-44b1-a9dd-5522b536a80c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLocalTaggedValue(this);
        else
          return null;
    }

}
