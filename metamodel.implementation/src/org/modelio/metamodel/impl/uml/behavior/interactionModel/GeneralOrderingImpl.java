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
    @objid ("0a03d0d0-7b30-4986-b254-b651e56cc868")
    @Override
    public OccurrenceSpecification getBefore() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.BeforeDep());
    }

    @objid ("860ba67d-0deb-4e4a-b20e-0e7d112209a4")
    @Override
    public void setBefore(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.BeforeDep(), (SmObjectImpl)value);
    }

    @objid ("3681a83b-7500-4aa3-96a1-7932f17078c0")
    @Override
    public OccurrenceSpecification getAfter() {
        return (OccurrenceSpecification) getDepVal(GeneralOrderingData.Metadata.AfterDep());
    }

    @objid ("cfcf6d87-048c-47ce-9544-6d7af3fdf19c")
    @Override
    public void setAfter(OccurrenceSpecification value) {
        appendDepVal(GeneralOrderingData.Metadata.AfterDep(), (SmObjectImpl)value);
    }

    @objid ("f545804f-8fae-4a77-9e4c-30582c632d26")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("40fe1e91-5401-4ff8-9838-c012c5446e13")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GeneralOrderingData.Metadata.BeforeDep());
        if (obj != null)
          return new SmDepVal(GeneralOrderingData.Metadata.BeforeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8216f29e-359c-4e0a-b7af-82c059633432")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralOrdering(this);
        else
          return null;
    }

}
