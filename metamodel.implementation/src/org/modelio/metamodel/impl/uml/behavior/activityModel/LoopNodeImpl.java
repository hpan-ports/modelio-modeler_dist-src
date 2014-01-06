/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.LoopNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00376270-c4bf-1fd8-97fe-001ec947cd2a")
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
    @objid ("71847cb4-0397-4129-8e2f-097250f16118")
    @Override
    public boolean isIsTestedFirst() {
        return (Boolean) getAttVal(LoopNodeData.Metadata.IsTestedFirstAtt());
    }

    @objid ("2b1a297b-f24d-403f-9a13-3ef9eee3f0d4")
    @Override
    public void setIsTestedFirst(boolean value) {
        setAttVal(LoopNodeData.Metadata.IsTestedFirstAtt(), value);
    }

    @objid ("a6af1815-9a67-4ab0-b17e-f3aa73436f76")
    @Override
    public String getSetup() {
        return (String) getAttVal(LoopNodeData.Metadata.SetupAtt());
    }

    @objid ("b2436611-ef1d-4049-90a6-ef0271563b13")
    @Override
    public void setSetup(String value) {
        setAttVal(LoopNodeData.Metadata.SetupAtt(), value);
    }

    @objid ("52d9f6e4-5358-4caa-9a0a-ccf5fbe9bf24")
    @Override
    public String getTest() {
        return (String) getAttVal(LoopNodeData.Metadata.TestAtt());
    }

    @objid ("b94f6bf5-a9aa-4bbf-85ac-100dc4524e86")
    @Override
    public void setTest(String value) {
        setAttVal(LoopNodeData.Metadata.TestAtt(), value);
    }

    @objid ("e7cd537c-565b-4306-a8d0-e8a00f0cf2bd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("aa3b0e40-8c2f-49f9-9aa0-b5e12f1876a1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d58f0d73-48fc-4c6f-ac31-1a4bb969e6a4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLoopNode(this);
        else
          return null;
    }

}
