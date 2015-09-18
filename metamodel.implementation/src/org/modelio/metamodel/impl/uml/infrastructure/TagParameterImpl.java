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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008ec7d6-c4be-1fd8-97fe-001ec947cd2a")
public class TagParameterImpl extends ElementImpl implements TagParameter {
    @objid ("1745b318-d899-44b9-81a3-20cb76fe00b8")
    @Override
    public String getValue() {
        return (String) getAttVal(TagParameterData.Metadata.ValueAtt());
    }

    @objid ("b3a9eb7b-9d6f-4054-bb9a-6af6a7834ce0")
    @Override
    public void setValue(String value) {
        setAttVal(TagParameterData.Metadata.ValueAtt(), value);
    }

    @objid ("6caa7c9a-d2c1-4f34-ba5a-cbc8c09e4d04")
    @Override
    public TaggedValue getAnnoted() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.AnnotedDep());
    }

    @objid ("b587aa1c-68b5-40cf-899a-2640a099945b")
    @Override
    public void setAnnoted(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("a79014bc-a78c-4891-970b-2b524837043e")
    @Override
    public TaggedValue getQualified() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.QualifiedDep());
    }

    @objid ("d6ade9bb-0e90-4513-9e6e-711bfc5d34dd")
    @Override
    public void setQualified(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("36300b52-f42a-4a19-9a5f-5362fd10c5f4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.QualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("87230820-64b6-464b-becf-94dcdc05d114")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TagParameterData.Metadata.AnnotedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TagParameterData.Metadata.QualifiedDep());
        if (obj != null)
          return new SmDepVal(TagParameterData.Metadata.QualifiedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("45f971b8-4404-47ee-9b33-f7cccd6ad5e4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagParameter(this);
        else
          return null;
    }

}
