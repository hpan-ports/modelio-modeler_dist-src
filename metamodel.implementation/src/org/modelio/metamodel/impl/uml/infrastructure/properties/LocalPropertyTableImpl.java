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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.LocalPropertyTableData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006cfe26-ec87-1098-b22e-001ec947cd2a")
public class LocalPropertyTableImpl extends PropertyTableImpl implements LocalPropertyTable {
    @objid ("ec321756-f7d2-48b1-83fa-a18c0ca78b8a")
    @Override
    public ModelElement getLocalAnnoted() {
        return (ModelElement) getDepVal(LocalPropertyTableData.Metadata.LocalAnnotedDep());
    }

    @objid ("48698e4f-b761-4278-9919-b854f5910dd6")
    @Override
    public void setLocalAnnoted(ModelElement value) {
        appendDepVal(LocalPropertyTableData.Metadata.LocalAnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("bd6febb9-0120-4bbc-bc37-46479b25abf4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bd78b394-b37d-4e36-b2f1-08d4178930eb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f8954322-23ea-49c2-b9e9-31b20baf5e28")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLocalPropertyTable(this);
        else
          return null;
    }

}
