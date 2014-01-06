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
import org.modelio.metamodel.data.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004610d6-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralOrderingImpl extends ElementImpl implements GeneralOrdering {
    @objid ("3d500320-e9ff-4e74-94db-3289a88372af")
    @Override
    public OccurrenceSpecification getBefore() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.BeforeDep());
    }

    @objid ("20edf1a7-e850-4475-9ef6-c5335dbc1083")
    @Override
    public void setBefore(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.BeforeDep(), (SmObjectImpl)value);
    }

    @objid ("9af83a1d-10c7-4b71-8366-f5c77c0ba685")
    @Override
    public OccurrenceSpecification getAfter() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.AfterDep());
    }

    @objid ("266c2a64-db85-40f7-8d7f-a0743f557227")
    @Override
    public void setAfter(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.AfterDep(), (SmObjectImpl)value);
    }

    @objid ("9891c412-eb6f-45d1-bc12-d34cfe11b165")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d7e5e5bc-6868-4eac-b50b-8cbc0f90e0d1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return new SmDepVal(GeneralOrderingData.Metadata.BeforeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b72c23fa-6ab7-4a73-9d58-2e3d1fcbfc4e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralOrdering(this);
        else
          return null;
    }

}
