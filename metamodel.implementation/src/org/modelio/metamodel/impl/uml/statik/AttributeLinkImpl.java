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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00003354-c4bf-1fd8-97fe-001ec947cd2a")
public class AttributeLinkImpl extends ModelElementImpl implements AttributeLink {
    @objid ("eb1afafc-2915-4182-99eb-7690dd920e0d")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeLinkData.Metadata.ValueAtt());
    }

    @objid ("c6db4353-713b-45c3-a6e0-026f17e551ad")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeLinkData.Metadata.ValueAtt(), value);
    }

    @objid ("605cbce4-595b-4d7f-a3c1-1b2aa5977bb8")
    @Override
    public Instance getAttributed() {
        return (Instance) getDepVal(AttributeLinkData.Metadata.AttributedDep());
    }

    @objid ("52470eaf-e43c-429c-93da-617088568a5f")
    @Override
    public void setAttributed(Instance value) {
        appendDepVal(AttributeLinkData.Metadata.AttributedDep(), (SmObjectImpl)value);
    }

    @objid ("ee61f43c-77c2-469f-8663-0493cea95cc6")
    @Override
    public Attribute getBase() {
        return (Attribute) getDepVal(AttributeLinkData.Metadata.BaseDep());
    }

    @objid ("fad2207b-72cd-469a-9281-4ed5218ffbe1")
    @Override
    public void setBase(Attribute value) {
        appendDepVal(AttributeLinkData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("38e91533-41cd-4ad5-b1b9-34d2bdce4377")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1667d79c-9448-4e34-b77b-8181ba408b50")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return new SmDepVal(AttributeLinkData.Metadata.AttributedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("521a3e0f-7c7d-4961-8662-c7529ea1ae7a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttributeLink(this);
        else
          return null;
    }

}
