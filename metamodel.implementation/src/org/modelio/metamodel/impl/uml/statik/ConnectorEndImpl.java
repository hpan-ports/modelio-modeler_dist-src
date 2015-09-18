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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0006c57a-c4bf-1fd8-97fe-001ec947cd2a")
public class ConnectorEndImpl extends LinkEndImpl implements ConnectorEnd {
    @objid ("7bd618a4-799d-4415-8915-08889d1af99d")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, ConnectorEndData.Metadata.RepresentationDep());
    }

    @objid ("e58a1c50-1cbc-4590-9e8e-291c05000e9b")
    @Override
    public <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b9d23e50-4040-4b1d-af8e-6b132c13bb4b")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep());
    }

    @objid ("18b96ed8-cef8-4092-b72f-6169bb80e1c8")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("9653947b-05ef-4e5f-8fa6-1f9e1ff224fd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("33d60844-f589-473f-b689-576da194d2c8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8a48d769-1078-4bae-9acc-5fb8e0c2f05b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectorEnd(this);
        else
          return null;
    }

}
