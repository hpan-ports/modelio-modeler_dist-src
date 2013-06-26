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
    @objid ("289d8bc0-5676-4be6-8a4c-3079f1b5aeab")
    @Override
    public String getDurationMin() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMinAtt());
    }

    @objid ("40b0356a-cf31-4b5c-ba43-69031c5ab439")
    @Override
    public void setDurationMin(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMinAtt(), value);
    }

    @objid ("d33fa760-19dc-4ba2-870a-64ab3cdd5258")
    @Override
    public String getDurationMax() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMaxAtt());
    }

    @objid ("2c9896c3-85c4-418f-8a5e-d4c53dfdecdd")
    @Override
    public void setDurationMax(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMaxAtt(), value);
    }

    @objid ("590472e1-dc1a-4a76-83cd-9f6f777e32f2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("36d2f85b-b5b3-486e-b5b1-711e6c2434b5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bf0a7d02-1d2d-437c-a178-9712a0a341b3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDurationConstraint(this);
        else
          return null;
    }

}
