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
    @objid ("fe4785fc-dc25-4b1b-ad47-dd976fae2da6")
    @Override
    public Interface getImplemented() {
        return (Interface) getDepVal(InterfaceRealizationData.Metadata.ImplementedDep());
    }

    @objid ("dea39d44-9c79-45ec-a4a0-31e775e2a7fc")
    @Override
    public void setImplemented(Interface value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementedDep(), (SmObjectImpl)value);
    }

    @objid ("ffee9039-01a1-4642-bc02-86bbae7ba857")
    @Override
    public NameSpace getImplementer() {
        return (NameSpace) getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
    }

    @objid ("4819dee5-ce4e-4d5b-9e17-a45e8e94cd22")
    @Override
    public void setImplementer(NameSpace value) {
        appendDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), (SmObjectImpl)value);
    }

    @objid ("82ab5df7-8713-4548-a692-828994a8c270")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e2c25434-3b7f-407e-8158-e556a4c7f424")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InterfaceRealizationData.Metadata.ImplementerDep());
        if (obj != null)
          return new SmDepVal(InterfaceRealizationData.Metadata.ImplementerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3550577f-edeb-4e90-887f-1454fb014e61")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterfaceRealization(this);
        else
          return null;
    }

}
