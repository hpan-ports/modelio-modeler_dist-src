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
import org.modelio.metamodel.impl.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001ab350-c4bf-1fd8-97fe-001ec947cd2a")
public class RaisedExceptionImpl extends ModelElementImpl implements RaisedException {
    @objid ("dbe96d89-4691-4dbe-b523-91a8d8a757e9")
    @Override
    public Classifier getThrownType() {
        Object obj = getDepVal(((RaisedExceptionSmClass)getClassOf()).getThrownTypeDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("a7b6c6c1-8401-449c-8e69-5de3a46b1630")
    @Override
    public void setThrownType(Classifier value) {
        appendDepVal(((RaisedExceptionSmClass)getClassOf()).getThrownTypeDep(), (SmObjectImpl)value);
    }

    @objid ("27b5a26c-480e-48b2-a7cf-17fa924c8943")
    @Override
    public Operation getThrower() {
        Object obj = getDepVal(((RaisedExceptionSmClass)getClassOf()).getThrowerDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("f1c18b0e-fd2c-4164-a72b-908809d9cd51")
    @Override
    public void setThrower(Operation value) {
        appendDepVal(((RaisedExceptionSmClass)getClassOf()).getThrowerDep(), (SmObjectImpl)value);
    }

    @objid ("11088e5d-b600-4c7e-acb0-6bdc7f69eea8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Thrower
        obj = (SmObjectImpl)this.getDepVal(((RaisedExceptionSmClass)getClassOf()).getThrowerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("76572efc-34c9-4238-8b29-3c715b852726")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Thrower
        dep = ((RaisedExceptionSmClass)getClassOf()).getThrowerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("327fd71d-5a1d-43fd-8a74-914516e75e4e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRaisedException(this);
        else
          return null;
    }

}
