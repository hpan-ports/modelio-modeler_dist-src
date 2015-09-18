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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyEnumerationLitteralData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0072f2fe-ec87-1098-b22e-001ec947cd2a")
public class PropertyEnumerationLitteralImpl extends ModelElementImpl implements PropertyEnumerationLitteral {
    @objid ("50b89a70-0ae4-4e4e-b53e-0de57d0f1e0e")
    @Override
    public int compareTo(PropertyEnumerationLitteral l) {
        List<PropertyEnumerationLitteral> literals = getOwner().getLitteral();
        return Integer.compare(literals.indexOf(l), literals.indexOf(this));
    }

    @objid ("3f719770-9e67-435b-bb41-4881dc7f5783")
    @Override
    public EnumeratedPropertyType getOwner() {
        return (EnumeratedPropertyType) getDepVal(PropertyEnumerationLitteralData.Metadata.OwnerDep());
    }

    @objid ("4fc3b993-3dfc-42b0-9572-04ebeff53792")
    @Override
    public void setOwner(EnumeratedPropertyType value) {
        appendDepVal(PropertyEnumerationLitteralData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("fee71c6a-b48c-4522-bc0c-79f98ac752fa")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyEnumerationLitteralData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c0d8c0ec-a8af-4f2b-81b9-76e479d9f123")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyEnumerationLitteralData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyEnumerationLitteralData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0a80c9ee-27e0-453a-8be6-dec9ea75fe93")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyEnumerationLitteral(this);
        else
          return null;
    }

}
