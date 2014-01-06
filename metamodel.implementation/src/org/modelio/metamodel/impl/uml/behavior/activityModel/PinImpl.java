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
import org.modelio.metamodel.data.uml.behavior.activityModel.PinData;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("003cae42-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class PinImpl extends ObjectNodeImpl implements Pin {
    @objid ("b0f6f5bf-ee98-4295-8772-bcdd65b1869e")
    @Override
    public boolean isIsControl() {
        return (Boolean) getAttVal(PinData.Metadata.IsControlAtt());
    }

    @objid ("0e3c356a-4122-4491-8b13-ec0b039c2693")
    @Override
    public void setIsControl(boolean value) {
        setAttVal(PinData.Metadata.IsControlAtt(), value);
    }

    @objid ("c94563cf-c355-4efb-a78d-5abe8170d3e0")
    @Override
    public boolean isIsExpansion() {
        return (Boolean) getAttVal(PinData.Metadata.IsExpansionAtt());
    }

    @objid ("a8d37858-11ab-4305-8a13-29cd916d6f10")
    @Override
    public void setIsExpansion(boolean value) {
        setAttVal(PinData.Metadata.IsExpansionAtt(), value);
    }

    @objid ("889806e3-65d2-4525-b9b0-75b184e00116")
    @Override
    public Parameter getMatched() {
        return (Parameter) getDepVal(PinData.Metadata.MatchedDep());
    }

    @objid ("7de2ecee-96eb-4b3d-bbe6-222f70ea0d2c")
    @Override
    public void setMatched(Parameter value) {
        appendDepVal(PinData.Metadata.MatchedDep(), (SmObjectImpl)value);
    }

    @objid ("152e2eaf-adb0-4776-abe8-593f1142f84a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c06d2183-0a52-4e6c-8d22-a3ee9ae50d37")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7d85956d-709d-4d12-8a7c-408a4f909ba2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPin(this);
        else
          return null;
    }

}
