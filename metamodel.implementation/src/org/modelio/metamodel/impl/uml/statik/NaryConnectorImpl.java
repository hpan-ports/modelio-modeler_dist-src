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
    @objid ("f3caeb96-5649-4b4d-a0fe-bb8e0e9000f9")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, NaryConnectorData.Metadata.RepresentationDep());
    }

    @objid ("532427ef-9a98-47fa-b045-461563c5d74e")
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

    @objid ("80cc2fb9-c897-412f-9a80-807fa9b5855e")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep());
    }

    @objid ("3fc5420e-597a-4684-81b6-372ff2d899f2")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("ac89db1a-d39c-4954-9db6-d0d159683f86")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1fe400e3-ac80-463c-914a-5667640ffcd5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fbfc1fa6-ab33-4e8d-9084-84d09134b8df")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryConnector(this);
        else
          return null;
    }

}
