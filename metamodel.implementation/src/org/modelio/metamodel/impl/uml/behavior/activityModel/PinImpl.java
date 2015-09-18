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
    @objid ("198e0a42-6db5-464f-9892-1e02397d9cb3")
    @Override
    public boolean isIsControl() {
        return (Boolean) getAttVal(PinData.Metadata.IsControlAtt());
    }

    @objid ("ef5e0bbe-1a1f-4b06-94b9-e8f9233a019f")
    @Override
    public void setIsControl(boolean value) {
        setAttVal(PinData.Metadata.IsControlAtt(), value);
    }

    @objid ("dd47a3fc-adfb-4a23-bd80-c18861f00c24")
    @Override
    public boolean isIsExpansion() {
        return (Boolean) getAttVal(PinData.Metadata.IsExpansionAtt());
    }

    @objid ("1872b630-47de-458c-b1b3-dcd17bf26399")
    @Override
    public void setIsExpansion(boolean value) {
        setAttVal(PinData.Metadata.IsExpansionAtt(), value);
    }

    @objid ("470889db-c6cb-4970-ab7d-bb7ff17b0dd9")
    @Override
    public Parameter getMatched() {
        return (Parameter) getDepVal(PinData.Metadata.MatchedDep());
    }

    @objid ("d94fa948-5da7-4611-9544-845644813749")
    @Override
    public void setMatched(Parameter value) {
        appendDepVal(PinData.Metadata.MatchedDep(), (SmObjectImpl)value);
    }

    @objid ("266ef559-5d03-4018-8278-5d8b933ec106")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c5114b72-1e1f-46f7-8a67-68ea30cb5260")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("df4b576a-3b4e-4533-8fa1-669be019033e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPin(this);
        else
          return null;
    }

}
