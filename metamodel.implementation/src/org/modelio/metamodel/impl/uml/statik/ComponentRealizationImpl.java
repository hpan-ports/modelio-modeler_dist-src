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
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("ea0e67c5-5b02-447c-aae3-d3ef908c1f2a")
public class ComponentRealizationImpl extends ModelElementImpl implements ComponentRealization {
    @objid ("5dc3a559-c0c1-486c-aee3-39517a79fd71")
    @Override
    public Classifier getRealizingClassifier() {
        return (Classifier) getDepVal(ComponentRealizationData.Metadata.RealizingClassifierDep());
    }

    @objid ("d53265ce-5220-47be-bd64-c6d4a5adc754")
    @Override
    public void setRealizingClassifier(Classifier value) {
        appendDepVal(ComponentRealizationData.Metadata.RealizingClassifierDep(), (SmObjectImpl)value);
    }

    @objid ("9ff2bb21-e43f-40ef-ab14-ceffaf2c0d1b")
    @Override
    public Component getAbstraction() {
        return (Component) getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
    }

    @objid ("af245ee2-0b33-4887-a5dd-e7f6e9bae2dd")
    @Override
    public void setAbstraction(Component value) {
        appendDepVal(ComponentRealizationData.Metadata.AbstractionDep(), (SmObjectImpl)value);
    }

    @objid ("0dfeffea-f91d-4d53-ae23-fa1c42a59a84")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3a2ae56f-cd46-4d2c-86b3-078fc132f3e5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ComponentRealizationData.Metadata.AbstractionDep());
        if (obj != null)
          return new SmDepVal(ComponentRealizationData.Metadata.AbstractionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f310a69b-c78c-42da-b81e-2d8c10fc7e06")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitComponentRealization(this);
        else
          return null;
    }

}
