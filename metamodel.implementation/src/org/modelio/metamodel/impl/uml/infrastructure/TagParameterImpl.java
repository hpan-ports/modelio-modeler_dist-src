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
    @objid ("721a74a1-7842-4aa3-8ff4-1fbd2b9ee9b8")
    @Override
    public String getValue() {
        return (String) getAttVal(TagParameterData.Metadata.ValueAtt());
    }

    @objid ("52d4b059-4219-40f3-a647-a596b82f2e37")
    @Override
    public void setValue(String value) {
        setAttVal(TagParameterData.Metadata.ValueAtt(), value);
    }

    @objid ("b1e90265-b957-4369-8cc9-57ed19888a3d")
    @Override
    public TaggedValue getAnnoted() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.AnnotedDep());
    }

    @objid ("44e02261-b078-411e-9022-81d6d933094a")
    @Override
    public void setAnnoted(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("5d2a14a9-bb17-470a-b988-f0a946d4cfbc")
    @Override
    public TaggedValue getQualified() {
        return (TaggedValue) getDepVal(TagParameterData.Metadata.QualifiedDep());
    }

    @objid ("360b8aae-84f5-4441-874b-2d0792787cc9")
    @Override
    public void setQualified(TaggedValue value) {
        appendDepVal(TagParameterData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("7733e985-ac91-4cea-b521-7fa6e91ac30c")
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

    @objid ("41063339-980c-4809-af2a-8332bdff6b5e")
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

    @objid ("4942e189-0b4b-4bd6-ad52-658139933bea")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagParameter(this);
        else
          return null;
    }

}
