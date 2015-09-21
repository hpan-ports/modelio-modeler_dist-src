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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionRegionData;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0031ed18-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
    @objid ("55909020-ae05-4723-a75d-4452eaad802f")
    @Override
    public ExpansionKind getMode() {
        return (ExpansionKind) getAttVal(((ExpansionRegionSmClass)getClassOf()).getModeAtt());
    }

    @objid ("7bac4156-68a7-4d69-b974-4139c5c4ddec")
    @Override
    public void setMode(ExpansionKind value) {
        setAttVal(((ExpansionRegionSmClass)getClassOf()).getModeAtt(), value);
    }

    @objid ("cb8d0f45-5e2b-457e-87da-37258ccb80c7")
    @Override
    public EList<ExpansionNode> getOutputElement() {
        return new SmList<>(this, ((ExpansionRegionSmClass)getClassOf()).getOutputElementDep());
    }

    @objid ("e3c98c42-ba6b-4168-8ff2-8364b56c07f5")
    @Override
    public <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExpansionNode element : getOutputElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("562ec2fd-5d17-4f86-8a9c-2fdbd8a9afff")
    @Override
    public EList<ExpansionNode> getInputElement() {
        return new SmList<>(this, ((ExpansionRegionSmClass)getClassOf()).getInputElementDep());
    }

    @objid ("1dc56673-37d4-4226-82d8-67d0bb83d773")
    @Override
    public <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExpansionNode element : getInputElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5924f5c0-5393-4f4d-9beb-d37c10dc6d4a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9e1eda4e-7af1-47b8-91ff-91b58c0fca7f")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("24adf3d3-00f8-4bc4-92aa-2c2bf7c14e68")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionRegion(this);
        else
          return null;
    }

}
