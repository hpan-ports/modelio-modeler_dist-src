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
    @objid ("4a00d90a-78b1-403d-ab26-0264588ce25d")
    @Override
    public Interface getImplemented() {
        return (Interface) getDepVal(InterfaceRealizationData.Metadata.ImplementedDep());
    }

    @objid ("13aa08d2-e1af-4b0c-9e40-9da9b7bc70af")
    @Override
    public void setImplemented(Interface value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementedDep(), (SmObjectImpl)value);
    }

    @objid ("ced57221-d490-4517-a659-aba1de5e7dc2")
    @Override
    public NameSpace getImplementer() {
        return (NameSpace) getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
    }

    @objid ("21164cd7-9d9f-40cf-88cb-798bee571872")
    @Override
    public void setImplementer(NameSpace value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), (SmObjectImpl)value);
    }

    @objid ("85544757-11a9-4387-bedb-bc563e4f707b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("518d6bdc-0d61-401b-be67-5b0eccf5b348")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return new SmDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0a0afdd2-e4a8-46d0-a654-e15669b4f47a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterfaceRealization(this);
        else
          return null;
    }

}
