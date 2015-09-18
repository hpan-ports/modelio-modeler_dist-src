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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystPropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008a372a-ec8f-1098-b22e-001ec947cd2a")
public class AnalystPropertyTableImpl extends TypedPropertyTableImpl implements AnalystPropertyTable {
    @objid ("fab5e8a4-9d4f-453c-a648-28917b842c08")
    @Override
    public AnalystItem getAnalystOwner() {
        return (AnalystItem) getDepVal(AnalystPropertyTableData.Metadata.AnalystOwnerDep());
    }

    @objid ("06bec1ce-d19f-4ccf-a7d9-f66c3272a52b")
    @Override
    public void setAnalystOwner(AnalystItem value) {
        appendDepVal(AnalystPropertyTableData.Metadata.AnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("76d41b5c-9543-49e9-a74d-816d90cfcc1e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AnalystPropertyTableData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("dca14d90-a5c0-4705-a0d1-29d656adf2e9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AnalystPropertyTableData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return new SmDepVal(AnalystPropertyTableData.Metadata.AnalystOwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c98e9a57-de59-463b-ba89-e29954af6e25")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystPropertyTable(this);
        else
          return null;
    }

}
