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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("e624429d-1b0a-4607-9553-9b0ecce9a921")
    @Override
    public boolean isIsTestedFirst() {
        return (Boolean) getAttVal(LoopNodeData.Metadata.IsTestedFirstAtt());
    }

    @objid ("c859d8d4-2c00-4383-bd21-48e371293264")
    @Override
    public void setIsTestedFirst(boolean value) {
        setAttVal(LoopNodeData.Metadata.IsTestedFirstAtt(), value);
    }

    @objid ("d654aeae-f1ce-4c68-b2b1-2bcf9d8c910c")
    @Override
    public String getSetup() {
        return (String) getAttVal(LoopNodeData.Metadata.SetupAtt());
    }

    @objid ("2b77716c-121d-4523-a3bb-e52495ac3d17")
    @Override
    public void setSetup(String value) {
        setAttVal(LoopNodeData.Metadata.SetupAtt(), value);
    }

    @objid ("f75ec5bf-50d2-4098-9ebc-77aee303ab01")
    @Override
    public String getTest() {
        return (String) getAttVal(LoopNodeData.Metadata.TestAtt());
    }

    @objid ("340d9edc-c7d4-4495-9cd5-1402fc4a61e2")
    @Override
    public void setTest(String value) {
        setAttVal(LoopNodeData.Metadata.TestAtt(), value);
    }

    @objid ("3400235e-014f-460f-b986-0c2a9be11337")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8b3b64b2-1469-4a4e-83bd-b55e03f6ec25")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f8b8c1f5-1826-4e1e-bab5-91ca0d548dfb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLoopNode(this);
        else
          return null;
    }

}
