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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.AttributeLinkData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00003354-c4bf-1fd8-97fe-001ec947cd2a")
public class AttributeLinkImpl extends ModelElementImpl implements AttributeLink {
    @objid ("bf6a4583-af09-4948-bd38-66626c6111ca")
    @Override
    public String getValue() {
        return (String) getAttVal(((AttributeLinkSmClass)getClassOf()).getValueAtt());
    }

    @objid ("1c9d0b4a-86a8-45d7-9af9-a7a6e97cb3a5")
    @Override
    public void setValue(String value) {
        setAttVal(((AttributeLinkSmClass)getClassOf()).getValueAtt(), value);
    }

    @objid ("6952c0ec-a62f-4e56-89c7-bd4836fd2011")
    @Override
    public Instance getAttributed() {
        Object obj = getDepVal(((AttributeLinkSmClass)getClassOf()).getAttributedDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("f25b91b2-099a-4901-96fc-3ee04f570c30")
    @Override
    public void setAttributed(Instance value) {
        appendDepVal(((AttributeLinkSmClass)getClassOf()).getAttributedDep(), (SmObjectImpl)value);
    }

    @objid ("904268a4-68a8-49f6-a68a-6e2343e650c7")
    @Override
    public Attribute getBase() {
        Object obj = getDepVal(((AttributeLinkSmClass)getClassOf()).getBaseDep());
        return (obj instanceof Attribute)? (Attribute)obj : null;
    }

    @objid ("f86ff634-423f-4ae2-b33d-374f5b2872c8")
    @Override
    public void setBase(Attribute value) {
        appendDepVal(((AttributeLinkSmClass)getClassOf()).getBaseDep(), (SmObjectImpl)value);
    }

    @objid ("80106975-c7ce-42c4-a458-2d2352ebbcc2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Attributed
        obj = (SmObjectImpl)this.getDepVal(((AttributeLinkSmClass)getClassOf()).getAttributedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("70df56b2-4d30-4c06-9a62-2c0e7585b5ac")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Attributed
        dep = ((AttributeLinkSmClass)getClassOf()).getAttributedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6e8cf1fb-4f04-40a3-af83-b986f72fa19a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttributeLink(this);
        else
          return null;
    }

}
