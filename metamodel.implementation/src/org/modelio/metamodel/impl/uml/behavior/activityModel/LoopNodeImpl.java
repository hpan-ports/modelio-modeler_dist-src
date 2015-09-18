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
/*   Metamodel version: 9022              */
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
    @objid ("26d5f405-9646-468b-b6f4-967550b92d47")
    @Override
    public boolean isIsTestedFirst() {
        return (Boolean) getAttVal(LoopNodeData.Metadata.IsTestedFirstAtt());
    }

    @objid ("2cc98624-78b1-436f-8d80-d7bfe11d2648")
    @Override
    public void setIsTestedFirst(boolean value) {
        setAttVal(LoopNodeData.Metadata.IsTestedFirstAtt(), value);
    }

    @objid ("cc476195-638e-4b60-aca1-f9e2ab64d317")
    @Override
    public String getSetup() {
        return (String) getAttVal(LoopNodeData.Metadata.SetupAtt());
    }

    @objid ("16958910-8255-42f5-b140-93e10a8c1b54")
    @Override
    public void setSetup(String value) {
        setAttVal(LoopNodeData.Metadata.SetupAtt(), value);
    }

    @objid ("ce5716fa-742b-4f9b-8268-3da5dc0215f8")
    @Override
    public String getTest() {
        return (String) getAttVal(LoopNodeData.Metadata.TestAtt());
    }

    @objid ("9350a31d-8607-4d0a-abe2-0d44b0edcf09")
    @Override
    public void setTest(String value) {
        setAttVal(LoopNodeData.Metadata.TestAtt(), value);
    }

    @objid ("a7acdb9e-864c-4bf7-a216-b1d648360f7e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ee81b85e-204a-45e3-ace8-69809fd80f3d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fd7aff4e-3faa-4a6c-9094-3e6243c32db5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLoopNode(this);
        else
          return null;
    }

}
