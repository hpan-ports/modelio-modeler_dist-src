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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0038c502-c4bf-1fd8-97fe-001ec947cd2a")
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
    @objid ("1c3cbeb2-ba98-4a7d-aab2-9c20cacdcba2")
    @Override
    public String getTransformationBehavior() {
        return (String) getAttVal(((ObjectFlowSmClass)getClassOf()).getTransformationBehaviorAtt());
    }

    @objid ("5259b23a-1c09-4615-a812-ebcf616dea98")
    @Override
    public void setTransformationBehavior(String value) {
        setAttVal(((ObjectFlowSmClass)getClassOf()).getTransformationBehaviorAtt(), value);
    }

    @objid ("d905dce0-5200-48d2-847a-b39762f869d9")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(((ObjectFlowSmClass)getClassOf()).getSelectionBehaviorAtt());
    }

    @objid ("2978786b-fa63-4ae7-8591-0112da83f17c")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(((ObjectFlowSmClass)getClassOf()).getSelectionBehaviorAtt(), value);
    }

    @objid ("b1b233de-2c59-4976-9fe9-48f730b05175")
    @Override
    public boolean isIsMultiCast() {
        return (Boolean) getAttVal(((ObjectFlowSmClass)getClassOf()).getIsMultiCastAtt());
    }

    @objid ("f85ff315-250c-4fb7-8bb3-2080eefdf058")
    @Override
    public void setIsMultiCast(boolean value) {
        setAttVal(((ObjectFlowSmClass)getClassOf()).getIsMultiCastAtt(), value);
    }

    @objid ("5de19d70-d793-4798-8a51-37aa94d340a0")
    @Override
    public boolean isIsMultiReceive() {
        return (Boolean) getAttVal(((ObjectFlowSmClass)getClassOf()).getIsMultiReceiveAtt());
    }

    @objid ("237c7324-f615-4487-a734-213a4110a36e")
    @Override
    public void setIsMultiReceive(boolean value) {
        setAttVal(((ObjectFlowSmClass)getClassOf()).getIsMultiReceiveAtt(), value);
    }

    @objid ("51360140-36b0-4220-aebf-2c580839a4db")
    @Override
    public ObjectFlowEffectKind getEffect() {
        return (ObjectFlowEffectKind) getAttVal(((ObjectFlowSmClass)getClassOf()).getEffectAtt());
    }

    @objid ("f27eb2ae-20c5-4e56-b765-e7d2b2e26334")
    @Override
    public void setEffect(ObjectFlowEffectKind value) {
        setAttVal(((ObjectFlowSmClass)getClassOf()).getEffectAtt(), value);
    }

    @objid ("4eae0cb9-6b1c-4d52-a691-d9edd271d68b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("00c4e7c0-831e-426f-bb6f-e4ba56027c32")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("e27647c7-f635-4cf2-89c9-cdf255c34047")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectFlow(this);
        else
          return null;
    }

}
