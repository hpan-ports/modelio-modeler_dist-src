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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
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

@objid ("0048dfe6-c4bf-1fd8-97fe-001ec947cd2a")
public class LifelineImpl extends ModelElementImpl implements Lifeline {
    @objid ("d611ac58-addc-4f74-9c37-26beca5b7408")
    @Override
    public String getSelector() {
        return (String) getAttVal(((LifelineSmClass)getClassOf()).getSelectorAtt());
    }

    @objid ("f8637fde-849c-4f64-859a-29804f4b2a9a")
    @Override
    public void setSelector(String value) {
        setAttVal(((LifelineSmClass)getClassOf()).getSelectorAtt(), value);
    }

    @objid ("cd885bf9-5e7b-4e2b-9f27-91d2411809a4")
    @Override
    public EList<InteractionFragment> getCoveredBy() {
        return new SmList<>(this, ((LifelineSmClass)getClassOf()).getCoveredByDep());
    }

    @objid ("28152baf-6546-4ebc-a18f-f948169d5a8f")
    @Override
    public <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InteractionFragment element : getCoveredBy()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9b7ad571-5230-462b-b279-a91e622c5056")
    @Override
    public PartDecomposition getDecomposedAs() {
        Object obj = getDepVal(((LifelineSmClass)getClassOf()).getDecomposedAsDep());
        return (obj instanceof PartDecomposition)? (PartDecomposition)obj : null;
    }

    @objid ("6bd32fed-22b5-433a-ae21-26d6cd1045ce")
    @Override
    public void setDecomposedAs(PartDecomposition value) {
        appendDepVal(((LifelineSmClass)getClassOf()).getDecomposedAsDep(), (SmObjectImpl)value);
    }

    @objid ("c68477e6-8031-4b3a-8c7e-062ec3f11761")
    @Override
    public Interaction getOwner() {
        Object obj = getDepVal(((LifelineSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Interaction)? (Interaction)obj : null;
    }

    @objid ("d1126a33-2929-497c-83ff-b02e18a577d4")
    @Override
    public void setOwner(Interaction value) {
        appendDepVal(((LifelineSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("dbe85b7f-4d02-4196-8945-a9362c0aef78")
    @Override
    public Instance getRepresented() {
        Object obj = getDepVal(((LifelineSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("d75dae48-b8b5-45c6-af99-246b796e770a")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(((LifelineSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("50bc083b-9888-4273-a573-70d6d62f7ecc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((LifelineSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c40d8c75-e28e-4ff9-a945-2ec5e78e8754")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((LifelineSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b5a33c4f-5f79-479a-ba4d-7266f8e71d46")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLifeline(this);
        else
          return null;
    }

}
