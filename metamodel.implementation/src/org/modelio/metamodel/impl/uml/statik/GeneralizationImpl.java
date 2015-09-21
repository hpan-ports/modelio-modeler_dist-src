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
import org.modelio.metamodel.impl.uml.statik.GeneralizationData;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000cb930-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralizationImpl extends ModelElementImpl implements Generalization {
    @objid ("127e49b2-01d2-4d13-9f15-ede25b0c13d3")
    @Override
    public String getDiscriminator() {
        return (String) getAttVal(((GeneralizationSmClass)getClassOf()).getDiscriminatorAtt());
    }

    @objid ("2906e7b9-75b8-40ce-90c3-ec27e8da0235")
    @Override
    public void setDiscriminator(String value) {
        setAttVal(((GeneralizationSmClass)getClassOf()).getDiscriminatorAtt(), value);
    }

    @objid ("e7612bcb-d615-454e-9880-120b074d38d8")
    @Override
    public NameSpace getSuperType() {
        Object obj = getDepVal(((GeneralizationSmClass)getClassOf()).getSuperTypeDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("067b01f2-2452-4924-95f1-60c4dc9b923f")
    @Override
    public void setSuperType(NameSpace value) {
        appendDepVal(((GeneralizationSmClass)getClassOf()).getSuperTypeDep(), (SmObjectImpl)value);
    }

    @objid ("5bf66341-a3cf-45d1-b002-0d6451daa0d6")
    @Override
    public NameSpace getSubType() {
        Object obj = getDepVal(((GeneralizationSmClass)getClassOf()).getSubTypeDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("22e9c73e-bc22-42cb-a964-1bbb27ea5d13")
    @Override
    public void setSubType(NameSpace value) {
        appendDepVal(((GeneralizationSmClass)getClassOf()).getSubTypeDep(), (SmObjectImpl)value);
    }

    @objid ("8d10b64f-a263-4cba-9f8a-c44728cdc0ef")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SubType
        obj = (SmObjectImpl)this.getDepVal(((GeneralizationSmClass)getClassOf()).getSubTypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("21538e2f-c1f5-462a-8678-cf586ce3dcbc")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SubType
        dep = ((GeneralizationSmClass)getClassOf()).getSubTypeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c2479462-5a69-4634-8e31-36abb9e0a81d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralization(this);
        else
          return null;
    }

}
