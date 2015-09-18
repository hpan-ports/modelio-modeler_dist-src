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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001ab350-c4bf-1fd8-97fe-001ec947cd2a")
public class RaisedExceptionImpl extends ModelElementImpl implements RaisedException {
    @objid ("2858f686-4359-4624-80b8-8edf1beec768")
    @Override
    public Classifier getThrownType() {
        return (Classifier) getDepVal(RaisedExceptionData.Metadata.ThrownTypeDep());
    }

    @objid ("927acc19-7f3d-4b03-8d42-11c8f94b011a")
    @Override
    public void setThrownType(Classifier value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrownTypeDep(), (SmObjectImpl)value);
    }

    @objid ("dbf27feb-6d8d-4ec1-87fb-142231a9ff7b")
    @Override
    public Operation getThrower() {
        return (Operation) getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
    }

    @objid ("33cc4554-a19e-4251-92a1-df2a58f8b8f2")
    @Override
    public void setThrower(Operation value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrowerDep(), (SmObjectImpl)value);
    }

    @objid ("47425d95-c8d4-4802-95e6-0ddbd75f1943")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("71ff6976-cecf-4fad-b992-d48afb94b71a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return new SmDepVal(RaisedExceptionData.Metadata.ThrowerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("db521648-cfa7-4abb-9920-9ca43684dfbe")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRaisedException(this);
        else
          return null;
    }

}
