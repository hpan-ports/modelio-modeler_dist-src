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
    @objid ("27c467ec-1eb6-45fd-a4f8-ace41c5944bc")
    @Override
    public boolean isIsControl() {
        return (Boolean) getAttVal(PinData.Metadata.IsControlAtt());
    }

    @objid ("863f1d92-3bed-4a8e-b875-06afa4b87ee1")
    @Override
    public void setIsControl(boolean value) {
        setAttVal(PinData.Metadata.IsControlAtt(), value);
    }

    @objid ("8368f6ef-4efe-48f1-bbb0-7d03258b1f4d")
    @Override
    public boolean isIsExpansion() {
        return (Boolean) getAttVal(PinData.Metadata.IsExpansionAtt());
    }

    @objid ("582a69ca-3461-400b-87ab-84b2c94f0c91")
    @Override
    public void setIsExpansion(boolean value) {
        setAttVal(PinData.Metadata.IsExpansionAtt(), value);
    }

    @objid ("d48d8f6f-2599-4fd4-bf04-6a966edec388")
    @Override
    public Parameter getMatched() {
        return (Parameter) getDepVal(PinData.Metadata.MatchedDep());
    }

    @objid ("89b68070-e5a7-4b58-ab10-fc1b0231d417")
    @Override
    public void setMatched(Parameter value) {
        appendDepVal(PinData.Metadata.MatchedDep(), (SmObjectImpl)value);
    }

    @objid ("2d66275c-d09e-4b8d-acb1-caec8208145e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d15d8c22-e3ad-4997-9c04-bdedcde0f4fc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0615f176-5e0e-4ae2-aeaa-474517f4185e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPin(this);
        else
          return null;
    }

}
