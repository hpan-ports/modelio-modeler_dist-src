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
import org.modelio.metamodel.data.uml.infrastructure.properties.EnumeratedPropertyTypeData;
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

@objid ("0070f526-ec87-1098-b22e-001ec947cd2a")
public class EnumeratedPropertyTypeImpl extends PropertyTypeImpl implements EnumeratedPropertyType {
    @objid ("31417e25-109f-4f03-9e0b-812215e9b1ff")
    @Override
    public PropertyEnumerationLitteral getLitteral(String s) {
        for (PropertyEnumerationLitteral l : getLitteral() ) {
            if (l.getName().equals(s))
                    return l;
        }
        return null;
    }

    @objid ("a7c9dcbf-dd94-4604-ab93-a7ee27cb649b")
    @Override
    public EList<PropertyEnumerationLitteral> getLitteral() {
        return new SmList<>(this, EnumeratedPropertyTypeData.Metadata.LitteralDep());
    }

    @objid ("84853aff-4ff4-4963-ba8d-1c44fe2a0b54")
    @Override
    public <T extends PropertyEnumerationLitteral> List<T> getLitteral(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyEnumerationLitteral element : getLitteral()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b8fba39c-a91d-456d-9ba5-79792f411e66")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("783e5d92-2969-4643-837a-65e0c53dca53")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ae59b768-b5ad-43e3-899a-7f3d5f374acb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEnumeratedPropertyType(this);
        else
          return null;
    }

}
