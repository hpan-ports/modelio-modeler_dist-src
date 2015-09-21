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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.PartDecompositionData;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("004b1612-c4bf-1fd8-97fe-001ec947cd2a")
public class PartDecompositionImpl extends InteractionUseImpl implements PartDecomposition {
    @objid ("3a170b95-e443-4fc5-9b55-6b305faea260")
    @Override
    public Lifeline getDecomposed() {
        Object obj = getDepVal(((PartDecompositionSmClass)getClassOf()).getDecomposedDep());
        return (obj instanceof Lifeline)? (Lifeline)obj : null;
    }

    @objid ("479e6399-6ede-44f2-a176-8889f4c9dde3")
    @Override
    public void setDecomposed(Lifeline value) {
        appendDepVal(((PartDecompositionSmClass)getClassOf()).getDecomposedDep(), (SmObjectImpl)value);
    }

    @objid ("79d0bc7c-7e39-47b9-b6dc-84459a649f7b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Decomposed
        obj = (SmObjectImpl)this.getDepVal(((PartDecompositionSmClass)getClassOf()).getDecomposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0530796e-ec05-4aec-87b1-c6a66a221f56")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Decomposed
        dep = ((PartDecompositionSmClass)getClassOf()).getDecomposedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("7b120c50-a52b-45b6-92ba-7f4acc75bf6a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPartDecomposition(this);
        else
          return null;
    }

}
