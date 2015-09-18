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
    @objid ("b7682e7d-403c-4724-936a-1d268c0f9796")
    @Override
    public Enumeration getValuated() {
        return (Enumeration) getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
    }

    @objid ("0ef01107-8ac7-4693-9b6f-a64cf70f6562")
    @Override
    public void setValuated(Enumeration value) {
        appendDepVal(EnumerationLiteralData.Metadata.ValuatedDep(), (SmObjectImpl)value);
    }

    @objid ("d3d86c87-d47d-400c-8c0c-9d87da461c49")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bad3664d-1de7-4027-aa3f-84ddff36f966")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EnumerationLiteralData.Metadata.ValuatedDep());
        if (obj != null)
          return new SmDepVal(EnumerationLiteralData.Metadata.ValuatedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("35c972b7-5dc2-4b94-a98d-0c5b68cf9b9f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEnumerationLiteral(this);
        else
          return null;
    }

}
