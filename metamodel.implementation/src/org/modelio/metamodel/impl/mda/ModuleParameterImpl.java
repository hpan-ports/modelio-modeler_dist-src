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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.mda.ModuleParameterData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00650bb2-c4bf-1fd8-97fe-001ec947cd2a")
public class ModuleParameterImpl extends ModelElementImpl implements ModuleParameter {
    @objid ("38a01379-9661-4b3d-b976-4d03a9ba9167")
    @Override
    public String getGroupName() {
        return (String) getAttVal(((ModuleParameterSmClass)getClassOf()).getGroupNameAtt());
    }

    @objid ("b6a5fc2b-3263-4ae3-9ea5-06456839d7d8")
    @Override
    public void setGroupName(String value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getGroupNameAtt(), value);
    }

    @objid ("bd20e243-eb11-42d6-b14b-011dd5f45a1e")
    @Override
    public ModuleParameterType getType() {
        return (ModuleParameterType) getAttVal(((ModuleParameterSmClass)getClassOf()).getTypeAtt());
    }

    @objid ("783c28a4-3c30-4de9-8963-9b49c5d0085f")
    @Override
    public void setType(ModuleParameterType value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getTypeAtt(), value);
    }

    @objid ("86ddcc7b-8bb6-4267-b644-e03ed8f0ba52")
    @Override
    public boolean isIsUserRead() {
        return (Boolean) getAttVal(((ModuleParameterSmClass)getClassOf()).getIsUserReadAtt());
    }

    @objid ("a0993f37-48ca-4019-80e0-a2fdb9c71f18")
    @Override
    public void setIsUserRead(boolean value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getIsUserReadAtt(), value);
    }

    @objid ("099b9a39-de76-4248-a4fc-0e94c7e88eb0")
    @Override
    public boolean isIsUserWrite() {
        return (Boolean) getAttVal(((ModuleParameterSmClass)getClassOf()).getIsUserWriteAtt());
    }

    @objid ("8f419c44-a4cc-46f9-98dd-6913068520a8")
    @Override
    public void setIsUserWrite(boolean value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getIsUserWriteAtt(), value);
    }

    @objid ("3ad361ae-10f4-4903-b453-e828b4114618")
    @Override
    public boolean isIsApiRead() {
        return (Boolean) getAttVal(((ModuleParameterSmClass)getClassOf()).getIsApiReadAtt());
    }

    @objid ("329a53ce-2bc1-4767-ba24-ce5a6de94466")
    @Override
    public void setIsApiRead(boolean value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getIsApiReadAtt(), value);
    }

    @objid ("244e24ae-03df-48ca-b558-46f1757939e1")
    @Override
    public boolean isIsApiWrite() {
        return (Boolean) getAttVal(((ModuleParameterSmClass)getClassOf()).getIsApiWriteAtt());
    }

    @objid ("d5f7912c-c0b9-45c6-96d6-d5939b4627a2")
    @Override
    public void setIsApiWrite(boolean value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getIsApiWriteAtt(), value);
    }

    @objid ("0d9b98eb-1e2c-4ed8-aa12-e9a276271ff6")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(((ModuleParameterSmClass)getClassOf()).getDefaultValueAtt());
    }

    @objid ("873a202b-5bc0-453c-9c46-f36d5be0f887")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(((ModuleParameterSmClass)getClassOf()).getDefaultValueAtt(), value);
    }

    @objid ("33405ddf-f02f-4bc5-ae81-4c2932b2b812")
    @Override
    public ModuleComponent getOwner() {
        Object obj = getDepVal(((ModuleParameterSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof ModuleComponent)? (ModuleComponent)obj : null;
    }

    @objid ("c78167cf-5ecc-4d05-8d92-36a2e2bccdde")
    @Override
    public void setOwner(ModuleComponent value) {
        appendDepVal(((ModuleParameterSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6452c8bb-8058-423d-ac5b-7588751a99b9")
    @Override
    public Enumeration getEnumType() {
        Object obj = getDepVal(((ModuleParameterSmClass)getClassOf()).getEnumTypeDep());
        return (obj instanceof Enumeration)? (Enumeration)obj : null;
    }

    @objid ("7f98f05a-ee2d-46b1-af0c-4645b7f171f7")
    @Override
    public void setEnumType(Enumeration value) {
        appendDepVal(((ModuleParameterSmClass)getClassOf()).getEnumTypeDep(), (SmObjectImpl)value);
    }

    @objid ("9f8c7661-fe54-4630-851b-1f330abee8e5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((ModuleParameterSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bd891f5e-c65c-4302-9edb-5b52b903683e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((ModuleParameterSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("bbc66f92-bb2f-415d-a2eb-16bf6a4730ae")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleParameter(this);
        else
          return null;
    }

}
