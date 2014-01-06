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
    @objid ("50f1ba14-72ab-4dfc-a92b-5fa968df8407")
    @Override
    public String getValue() {
        return (String) getAttVal(TagParameterData.Metadata.ValueAtt());
    }

    @objid ("0796413c-6d40-42bb-a970-fb1bcc30d648")
    @Override
    public void setValue(String value) {
        setAttVal(TagParameterData.Metadata.ValueAtt(), value);
    }

    @objid ("d0df3780-624a-45cc-a4f1-b17e4af844ec")
    @Override
    public TaggedValue getAnnoted() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.AnnotedDep());
    }

    @objid ("34e979cd-f18f-40ba-a39f-57a0eedec946")
    @Override
    public void setAnnoted(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("78e0f607-57cd-4247-be95-5ef1f3a1c924")
    @Override
    public TaggedValue getQualified() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.QualifiedDep());
    }

    @objid ("16e24dc8-8fff-4d34-994a-20bcbc495342")
    @Override
    public void setQualified(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("b530d5f9-d3af-4374-9ef3-ab6ce11e30f3")
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

    @objid ("ec4dd443-aca6-4fd9-957c-ebaa9b3b42ad")
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

    @objid ("1c83b337-e6b9-42d7-aa74-bd6040b22b63")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagParameter(this);
        else
          return null;
    }

}
