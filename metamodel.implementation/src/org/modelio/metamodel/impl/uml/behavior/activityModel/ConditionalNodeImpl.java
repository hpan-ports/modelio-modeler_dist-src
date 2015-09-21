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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ConditionalNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("002d81b0-c4bf-1fd8-97fe-001ec947cd2a")
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
    @objid ("9087fd79-992a-4677-ac23-e4310386e9d9")
    @Override
    public boolean isIsDeterminate() {
        return (Boolean) getAttVal(((ConditionalNodeSmClass)getClassOf()).getIsDeterminateAtt());
    }

    @objid ("93808ac4-cb7d-455a-a637-897e6e7af17d")
    @Override
    public void setIsDeterminate(boolean value) {
        setAttVal(((ConditionalNodeSmClass)getClassOf()).getIsDeterminateAtt(), value);
    }

    @objid ("c5ea0092-3115-4298-ba77-6224db39105c")
    @Override
    public boolean isIsAssured() {
        return (Boolean) getAttVal(((ConditionalNodeSmClass)getClassOf()).getIsAssuredAtt());
    }

    @objid ("291a8c95-a781-4f51-b1d5-87e3ef382d84")
    @Override
    public void setIsAssured(boolean value) {
        setAttVal(((ConditionalNodeSmClass)getClassOf()).getIsAssuredAtt(), value);
    }

    @objid ("599b20e7-08ab-4f19-9aa8-5aead08b66e3")
    @Override
    public EList<Clause> getOwnedClause() {
        return new SmList<>(this, ((ConditionalNodeSmClass)getClassOf()).getOwnedClauseDep());
    }

    @objid ("8cdd357e-4e66-4d2e-9b9e-83c99a0fef87")
    @Override
    public <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Clause element : getOwnedClause()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e96cc1e8-ae9f-443c-bc50-09d3b6ea1815")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4aff199d-c4e7-495d-b46c-7bf9599cae78")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("c0c13fc6-642a-4af8-89a6-e8ab8893c5f8")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConditionalNode(this);
        else
          return null;
    }

}
