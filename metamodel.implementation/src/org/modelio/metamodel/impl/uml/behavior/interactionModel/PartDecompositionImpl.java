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
import org.modelio.metamodel.data.uml.behavior.interactionModel.PartDecompositionData;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004b1612-c4bf-1fd8-97fe-001ec947cd2a")
public class PartDecompositionImpl extends InteractionUseImpl implements PartDecomposition {
    @objid ("c775d7e6-bd3b-4144-8509-a49d3c93c4fb")
    @Override
    public Lifeline getDecomposed() {
        return (Lifeline) getDepVal(PartDecompositionData.Metadata.DecomposedDep());
    }

    @objid ("84007813-1e7f-4200-a5af-b82ef9010284")
    @Override
    public void setDecomposed(Lifeline value) {
        appendDepVal(PartDecompositionData.Metadata.DecomposedDep(), (SmObjectImpl)value);
    }

    @objid ("d60615a7-56be-4cff-a9f1-433e67717f2c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PartDecompositionData.Metadata.DecomposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("69407454-a384-41a6-ab3b-8a45725f1ccc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PartDecompositionData.Metadata.DecomposedDep());
        if (obj != null)
          return new SmDepVal(PartDecompositionData.Metadata.DecomposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e6ade664-0204-4cfb-9c59-1a18b32ebb60")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPartDecomposition(this);
        else
          return null;
    }

}
