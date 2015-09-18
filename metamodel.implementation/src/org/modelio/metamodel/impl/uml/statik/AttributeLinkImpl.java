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
    @objid ("dc344482-f8ec-46be-9f28-9607d1577858")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeLinkData.Metadata.ValueAtt());
    }

    @objid ("4df8fb95-3a37-4644-9e54-e454f299fb6e")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeLinkData.Metadata.ValueAtt(), value);
    }

    @objid ("6d8e1221-6a5e-4800-8d86-1d2f49daf0a6")
    @Override
    public Instance getAttributed() {
        return (Instance) getDepVal(AttributeLinkData.Metadata.AttributedDep());
    }

    @objid ("1596b433-cab2-4c12-8843-e2030b25a5de")
    @Override
    public void setAttributed(Instance value) {
        appendDepVal(AttributeLinkData.Metadata.AttributedDep(), (SmObjectImpl)value);
    }

    @objid ("50d04ca2-1fc8-43f7-a3ef-30ea7224a48a")
    @Override
    public Attribute getBase() {
        return (Attribute) getDepVal(AttributeLinkData.Metadata.BaseDep());
    }

    @objid ("548c98ab-3967-4c39-8586-9b26e8b64f0e")
    @Override
    public void setBase(Attribute value) {
        appendDepVal(AttributeLinkData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("82968127-3c9c-4208-9403-b8bcdcdd1ab9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8c09a987-a9f4-479e-9b35-79b8874bf9cc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return new SmDepVal(AttributeLinkData.Metadata.AttributedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ba27189a-5eb2-428a-8502-ed8c8703d3e5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttributeLink(this);
        else
          return null;
    }

}
