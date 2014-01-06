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

    @objid ("67b7f2c2-58d1-42b9-a7d4-b9b0f0a453b9")
    @Override
    public EList<PropertyEnumerationLitteral> getLitteral() {
        return new SmList<>(this, EnumeratedPropertyTypeData.Metadata.LitteralDep());
    }

    @objid ("675f4dcb-b597-4602-a2d8-2c9229566273")
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

    @objid ("acc15c3c-a623-42fc-aa20-012c47ce25c7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("dae09b89-3e9f-4bf5-875f-1142b805238a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d792ee2a-17bc-46f6-ada5-346d0e0fa3a5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEnumeratedPropertyType(this);
        else
          return null;
    }

}
