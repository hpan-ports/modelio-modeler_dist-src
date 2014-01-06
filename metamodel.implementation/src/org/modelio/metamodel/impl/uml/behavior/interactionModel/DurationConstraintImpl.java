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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.DurationConstraintData;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0043f6ca-c4bf-1fd8-97fe-001ec947cd2a")
public class DurationConstraintImpl extends ConstraintImpl implements DurationConstraint {
    @objid ("a286261d-9319-424e-a2fe-3bac25476ed1")
    @Override
    public String getDurationMin() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMinAtt());
    }

    @objid ("e9f7f217-79a6-4659-a5c0-ad9c45513ac4")
    @Override
    public void setDurationMin(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMinAtt(), value);
    }

    @objid ("542eaaf4-c8c5-473e-87c3-2771e42315ce")
    @Override
    public String getDurationMax() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMaxAtt());
    }

    @objid ("46d8f9c7-d6f1-416b-9a7d-a1d52d8adc02")
    @Override
    public void setDurationMax(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMaxAtt(), value);
    }

    @objid ("bb52d25d-c858-4090-a967-08979a45a119")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d2bc9f47-445a-40d9-9b07-38dc3673e72d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5c57d615-4741-4912-bb50-2ce9e8c0e536")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDurationConstraint(this);
        else
          return null;
    }

}
