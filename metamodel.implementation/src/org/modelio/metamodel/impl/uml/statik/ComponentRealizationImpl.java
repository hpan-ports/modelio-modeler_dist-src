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
import org.modelio.metamodel.impl.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("ea0e67c5-5b02-447c-aae3-d3ef908c1f2a")
public class ComponentRealizationImpl extends ModelElementImpl implements ComponentRealization {
    @objid ("58636411-2cec-4ddc-9381-14ac4859d25e")
    @Override
    public Classifier getRealizingClassifier() {
        Object obj = getDepVal(((ComponentRealizationSmClass)getClassOf()).getRealizingClassifierDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("1928c655-92a4-44ca-9a3b-5d6dc09644a6")
    @Override
    public void setRealizingClassifier(Classifier value) {
        appendDepVal(((ComponentRealizationSmClass)getClassOf()).getRealizingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("189b9a01-2c3a-4ce8-a4c9-f064ed1e6c6a")
    @Override
    public Component getAbstraction() {
        Object obj = getDepVal(((ComponentRealizationSmClass)getClassOf()).getAbstractionDep());
        return (obj instanceof Component)? (Component)obj : null;
    }

    @objid ("14769f58-f1fc-492e-b6b3-1b60dc74e661")
    @Override
    public void setAbstraction(Component value) {
        appendDepVal(((ComponentRealizationSmClass)getClassOf()).getAbstractionDep(), (SmObjectImpl)value);
    }

    @objid ("ab14d54a-e64f-426c-a3ed-25af2e7feb70")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Abstraction
        obj = (SmObjectImpl)this.getDepVal(((ComponentRealizationSmClass)getClassOf()).getAbstractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8897e568-647d-46ed-91cc-82ef40061463")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Abstraction
        dep = ((ComponentRealizationSmClass)getClassOf()).getAbstractionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("1655427d-ffdd-40e2-acd2-59cbed879867")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitComponentRealization(this);
        else
          return null;
    }

}
