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
    @objid ("ec2e4efa-19eb-4031-94f5-74c5dfc15e7e")
    @Override
    public Classifier getContract() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.ContractDep());
    }

    @objid ("c266c8ec-31d6-4632-abec-b1ad15bd2eda")
    @Override
    public void setContract(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.ContractDep(), (SmObjectImpl)value);
    }

    @objid ("729e3244-2488-47f0-b707-31f19d96b2df")
    @Override
    public Classifier getSubstitutingClassifier() {
        return (Classifier) getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
    }

    @objid ("3da7c672-a7d2-4402-baf5-b99548a31911")
    @Override
    public void setSubstitutingClassifier(Classifier value) {
        appendDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("a14131f1-2d77-4a05-8a34-bf7da766f7e5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b7c13ec8-6b51-4804-8457-59b77bf76765")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep());
        if (obj != null)
          return new SmDepVal(SubstitutionData.Metadata.SubstitutingClassifierDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bcdf2c9c-a25b-475d-bbd3-e11634034dfe")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSubstitution(this);
        else
          return null;
    }

}
