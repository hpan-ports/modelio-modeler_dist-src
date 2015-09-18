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
    @objid ("04c8119a-e45d-4308-a4f7-5a3fa7b4baa0")
    @Override
    public String getDurationMin() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMinAtt());
    }

    @objid ("95cee7aa-6433-4d5e-93bf-b9b461f519a8")
    @Override
    public void setDurationMin(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMinAtt(), value);
    }

    @objid ("dd028a2b-5295-43f0-8825-ea6d81b0d100")
    @Override
    public String getDurationMax() {
        return (String) getAttVal(DurationConstraintData.Metadata.DurationMaxAtt());
    }

    @objid ("a616fb02-5b3d-477c-86f8-3880ea30636b")
    @Override
    public void setDurationMax(String value) {
        setAttVal(DurationConstraintData.Metadata.DurationMaxAtt(), value);
    }

    @objid ("76066658-11b7-4052-9cc9-ae2f4e6e3b2b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("910c5726-ab7e-4f8b-94c0-3eec2af8adc1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4eb8be7f-f3e3-48b2-b2ce-deb650ada734")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDurationConstraint(this);
        else
          return null;
    }

}
