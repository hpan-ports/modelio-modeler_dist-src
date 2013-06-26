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
    @objid ("7da67930-cb7c-4bb8-af33-3288dca3bc8c")
    @Override
    public Classifier getThrownType() {
        return (Classifier) getDepVal(RaisedExceptionData.Metadata.ThrownTypeDep());
    }

    @objid ("b1813792-9449-4b68-ab9a-e25b747ff4fa")
    @Override
    public void setThrownType(Classifier value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrownTypeDep(), (SmObjectImpl)value);
    }

    @objid ("4361d723-643b-401c-840d-547aa916985a")
    @Override
    public Operation getThrower() {
        return (Operation) getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
    }

    @objid ("00683768-c023-471f-879f-eaf06c8057ac")
    @Override
    public void setThrower(Operation value) {
        appendDepVal(RaisedExceptionData.Metadata.ThrowerDep(), (SmObjectImpl)value);
    }

    @objid ("4f29127c-10e1-4579-8d30-860384899d43")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("928679d8-6cfb-4ae2-a58b-8c06fab21f84")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RaisedExceptionData.Metadata.ThrowerDep());
        if (obj != null)
          return new SmDepVal(RaisedExceptionData.Metadata.ThrowerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3e61ee82-0324-4ab0-8b00-3e8a2de1d7f7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRaisedException(this);
        else
          return null;
    }

}
