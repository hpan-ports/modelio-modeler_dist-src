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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.SubstitutionData;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008e0fa8-c4be-1fd8-97fe-001ec947cd2a")
public class SubstitutionImpl extends ModelElementImpl implements Substitution {
    @objid ("a69c5512-70b3-4f3f-8fad-9755efcc3cfb")
    @Override
    public Classifier getContract() {
        Object obj = getDepVal(((SubstitutionSmClass)getClassOf()).getContractDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("7a7427db-22b0-430c-99d0-d7bd1ac44ef7")
    @Override
    public void setContract(Classifier value) {
        appendDepVal(((SubstitutionSmClass)getClassOf()).getContractDep(), (SmObjectImpl)value);
    }

    @objid ("f0f29b0e-4ea5-4f8f-89ae-2375b62f4620")
    @Override
    public Classifier getSubstitutingClassifier() {
        Object obj = getDepVal(((SubstitutionSmClass)getClassOf()).getSubstitutingClassifierDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("c664340f-48ef-47d5-9cea-2820c55958b7")
    @Override
    public void setSubstitutingClassifier(Classifier value) {
        appendDepVal(((SubstitutionSmClass)getClassOf()).getSubstitutingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("f7858c05-1981-4813-bd7d-581244efe694")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SubstitutingClassifier
        obj = (SmObjectImpl)this.getDepVal(((SubstitutionSmClass)getClassOf()).getSubstitutingClassifierDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("01d4f321-dd82-4e81-a550-79b8039ab15b")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SubstitutingClassifier
        dep = ((SubstitutionSmClass)getClassOf()).getSubstitutingClassifierDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("57d4ffeb-d8dc-448d-9bb3-e5b22695f0a3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSubstitution(this);
        else
          return null;
    }

}
