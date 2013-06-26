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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.SubstitutionData;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008e0fa8-c4be-1fd8-97fe-001ec947cd2a")
public class SubstitutionImpl extends ModelElementImpl implements Substitution {
    @objid ("e2025b2f-4313-42ae-9b4a-4cc4ff40d641")
    @Override
    public Classifier getContract() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.ContractDep());
    }

    @objid ("9820d7fb-01fe-4e32-b880-cf6b4933fdef")
    @Override
    public void setContract(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.ContractDep(), (SmObjectImpl)value);
    }

    @objid ("b11ba95a-354e-42cd-be1a-e5d58db3dbff")
    @Override
    public Classifier getSubstitutingClassifier() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
    }

    @objid ("5c9e4c21-b5d5-473e-89c4-7a339e4c5338")
    @Override
    public void setSubstitutingClassifier(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("21fd65e2-b628-4518-807e-51994f8413d3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("99be0cc3-5f2d-43e9-9368-243ffeea149c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return new SmDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4b09fa1f-8d89-4700-890d-2a29106d10d2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSubstitution(this);
        else
          return null;
    }

}
