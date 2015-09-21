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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.LoopNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00376270-c4bf-1fd8-97fe-001ec947cd2a")
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
    @objid ("7c31a9b4-c42b-4bca-8431-88389281f7a2")
    @Override
    public boolean isIsTestedFirst() {
        return (Boolean) getAttVal(((LoopNodeSmClass)getClassOf()).getIsTestedFirstAtt());
    }

    @objid ("043acd95-ed55-4611-a386-44344fb81e92")
    @Override
    public void setIsTestedFirst(boolean value) {
        setAttVal(((LoopNodeSmClass)getClassOf()).getIsTestedFirstAtt(), value);
    }

    @objid ("e06e759e-e410-4e0e-a4f4-237cb3fb125f")
    @Override
    public String getSetup() {
        return (String) getAttVal(((LoopNodeSmClass)getClassOf()).getSetupAtt());
    }

    @objid ("0c034fb4-0f3c-4a2f-b5db-e7bb3d77d6f6")
    @Override
    public void setSetup(String value) {
        setAttVal(((LoopNodeSmClass)getClassOf()).getSetupAtt(), value);
    }

    @objid ("42cefc8c-922b-4f36-97f6-9db3e4ea0116")
    @Override
    public String getTest() {
        return (String) getAttVal(((LoopNodeSmClass)getClassOf()).getTestAtt());
    }

    @objid ("eeccd4c7-d9ec-4094-aebc-d910d7546668")
    @Override
    public void setTest(String value) {
        setAttVal(((LoopNodeSmClass)getClassOf()).getTestAtt(), value);
    }

    @objid ("020169fe-eae9-48df-ac3d-831dc970fac1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c201b1e0-fcc2-47e3-aaac-a8ae9e2d7c11")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("157e1b3d-a1af-45a9-bc63-6793185a92ce")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLoopNode(this);
        else
          return null;
    }

}
