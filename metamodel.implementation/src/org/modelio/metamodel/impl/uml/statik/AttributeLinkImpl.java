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
    @objid ("8845d189-d931-45ce-8c50-ba9bbd0d2746")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeLinkData.Metadata.ValueAtt());
    }

    @objid ("5957d66f-44c5-4c1c-b4d0-782ac572a17d")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeLinkData.Metadata.ValueAtt(), value);
    }

    @objid ("87f10e0a-928b-4973-a54e-21649bd760b6")
    @Override
    public Instance getAttributed() {
        return (Instance) getDepVal(AttributeLinkData.Metadata.AttributedDep());
    }

    @objid ("5c0f6c6b-e10a-4545-9b78-13c24adfb8f0")
    @Override
    public void setAttributed(Instance value) {
        appendDepVal(AttributeLinkData.Metadata.AttributedDep(), (SmObjectImpl)value);
    }

    @objid ("357bfdc7-b250-46a8-9845-f36bdf720456")
    @Override
    public Attribute getBase() {
        return (Attribute) getDepVal(AttributeLinkData.Metadata.BaseDep());
    }

    @objid ("12c9a3c2-72a2-400a-83cb-16fcf9c90bb6")
    @Override
    public void setBase(Attribute value) {
        appendDepVal(AttributeLinkData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("af5c80f3-689b-44e2-8c01-379da5d5d22e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4e2cd201-afa5-485f-b89f-1fada7124ce4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeLinkData.Metadata.AttributedDep());
        if (obj != null)
          return new SmDepVal(AttributeLinkData.Metadata.AttributedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a152fd69-5e47-4459-98b3-cf8e78331153")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttributeLink(this);
        else
          return null;
    }

}
