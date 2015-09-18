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
    @objid ("f24338de-ae74-4b2f-90c5-42eaa0bd464a")
    @Override
    public Classifier getContract() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.ContractDep());
    }

    @objid ("c622dd81-cdf7-4392-9478-1026ff1ce82e")
    @Override
    public void setContract(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.ContractDep(), (SmObjectImpl)value);
    }

    @objid ("e7e84e1f-d5ad-4e16-bb54-8e83ef551ad3")
    @Override
    public Classifier getSubstitutingClassifier() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
    }

    @objid ("425a24af-15ec-44e2-b55c-9d21a8d63285")
    @Override
    public void setSubstitutingClassifier(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("98f5fc14-77c7-4a8e-a25b-9d2bb5d5c3c6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3c57232e-1f27-4f71-a512-0662d6fa8fea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return new SmDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("96ad5e84-6e46-424d-82f3-71bfc82cd35c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSubstitution(this);
        else
          return null;
    }

}
