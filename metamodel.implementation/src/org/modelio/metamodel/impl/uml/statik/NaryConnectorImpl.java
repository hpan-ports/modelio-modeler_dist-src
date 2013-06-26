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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00060c52-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryConnectorImpl extends NaryLinkImpl implements NaryConnector {
    @objid ("7aa4e51b-4a9d-4044-9dd2-4bfc5ff3d3cc")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, NaryConnectorData.Metadata.RepresentationDep());
    }

    @objid ("f74f8b5d-758e-46c4-b13f-ccb5084c6c5e")
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

    @objid ("037b9b3d-ca54-40dd-bc31-ebc3e16581b9")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep());
    }

    @objid ("9189eff7-d289-49cc-988a-3b307b1279d5")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("7435d927-402c-4f2f-a740-8f87cca5a674")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d8248a22-6aac-472c-92f0-7a719958a5ae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("21ace596-144c-4b0a-85b8-58689a991db8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryConnector(this);
        else
          return null;
    }

}
