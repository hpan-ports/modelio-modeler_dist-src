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
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000f221a-c4bf-1fd8-97fe-001ec947cd2a")
public class InterfaceRealizationImpl extends ModelElementImpl implements InterfaceRealization {
    @objid ("f11d2cce-11b9-4c2b-aad7-421259c76418")
    @Override
    public Interface getImplemented() {
        return (Interface) getDepVal(InterfaceRealizationData.Metadata.ImplementedDep());
    }

    @objid ("5f466417-0ef0-477a-ab5a-553809635530")
    @Override
    public void setImplemented(Interface value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementedDep(), (SmObjectImpl)value);
    }

    @objid ("87183973-343c-40d1-b21f-64efde6933e8")
    @Override
    public NameSpace getImplementer() {
        return (NameSpace) getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
    }

    @objid ("f47d039d-236a-4616-88a7-05459ab3fb33")
    @Override
    public void setImplementer(NameSpace value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), (SmObjectImpl)value);
    }

    @objid ("eccfc5c1-211e-418c-af61-9e2baf2f9950")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8a783b9c-5962-4419-9340-17b5e030647e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return new SmDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("edf32eee-65fd-435c-b6c0-2f4fc459f16c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterfaceRealization(this);
        else
          return null;
    }

}
