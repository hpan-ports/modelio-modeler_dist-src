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
import org.modelio.metamodel.data.uml.statik.EnumerationLiteralData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000a7e90-c4bf-1fd8-97fe-001ec947cd2a")
public class EnumerationLiteralImpl extends ModelElementImpl implements EnumerationLiteral {
    @objid ("bd78da8d-b089-4b2b-afca-4a000c01823c")
    @Override
    public Enumeration getValuated() {
        return (Enumeration) getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
    }

    @objid ("5829cca9-bf1f-40cd-b1ca-ffa7f8e35edf")
    @Override
    public void setValuated(Enumeration value) {
        appendDepVal(EnumerationLiteralData.Metadata.ValuatedDep(), (SmObjectImpl)value);
    }

    @objid ("cacba262-3e89-45b7-a831-76f33c93c904")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0f88d795-e845-4452-9bbb-385ec1f7d5ed")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
        if (obj != null)
          return new SmDepVal(EnumerationLiteralData.Metadata.ValuatedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ae6adedb-866e-44ee-acf3-5543745c0829")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEnumerationLiteral(this);
        else
          return null;
    }

}
