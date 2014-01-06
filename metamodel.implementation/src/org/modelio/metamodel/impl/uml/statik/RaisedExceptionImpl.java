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
    @objid ("424e7750-b135-449d-8f78-06e811d79d86")
    @Override
    public Classifier getThrownType() {
        return (Classifier) getDepVal(RaisedExceptionData.Metadata.ThrownTypeDep());
    }

    @objid ("ec04fb6d-a1c6-4f1b-ae30-198078116ab6")
    @Override
    public void setThrownType(Classifier value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrownTypeDep(), (SmObjectImpl)value);
    }

    @objid ("3dfb7807-6634-480c-8665-e5d9ce69af74")
    @Override
    public Operation getThrower() {
        return (Operation) getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
    }

    @objid ("5930b3c6-1048-4260-b037-a7de48efcdb2")
    @Override
    public void setThrower(Operation value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrowerDep(), (SmObjectImpl)value);
    }

    @objid ("0bbb29be-dff6-4aad-bc07-7388758d3855")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f4637cac-30f3-4159-90ad-df958e07ea79")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return new SmDepVal(RaisedExceptionData.Metadata.ThrowerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f92b62cc-ab46-407e-80a4-8b524825761b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRaisedException(this);
        else
          return null;
    }

}
