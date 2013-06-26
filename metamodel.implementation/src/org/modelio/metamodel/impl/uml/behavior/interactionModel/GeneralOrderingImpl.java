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
    @objid ("461b068c-5476-43f5-a643-588c1de8f91c")
    @Override
    public OccurrenceSpecification getBefore() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.BeforeDep());
    }

    @objid ("5c1e1e37-cd36-48e5-b672-134cdd062b91")
    @Override
    public void setBefore(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.BeforeDep(), (SmObjectImpl)value);
    }

    @objid ("8e350779-f024-4c65-b4c1-5a9e50e0fd6f")
    @Override
    public OccurrenceSpecification getAfter() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.AfterDep());
    }

    @objid ("d5b8c679-ee2f-4763-8fe3-1ebbbf91c40c")
    @Override
    public void setAfter(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.AfterDep(), (SmObjectImpl)value);
    }

    @objid ("9d098a3c-d836-40cf-8b73-57ae6029d13a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7815f913-08b8-4bf4-9aa4-73aa1003c0ed")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return new SmDepVal(GeneralOrderingData.Metadata.BeforeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e7134b44-bcf2-444b-904d-0cde98f791e4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralOrdering(this);
        else
          return null;
    }

}
