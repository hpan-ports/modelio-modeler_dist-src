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
    @objid ("6b1061b9-57f9-469b-9970-e6b4c73cda29")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, NaryConnectorData.Metadata.RepresentationDep());
    }

    @objid ("44bd38f9-af58-4d6d-9b0e-ee7e75582b5a")
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

    @objid ("1337307a-48eb-44c9-90df-ed161a47ba7a")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep());
    }

    @objid ("fc463968-8cc9-4d33-99c2-e30ca34829a4")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(NaryConnectorData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("712b46da-d338-45b4-a89c-c09e1c2632ec")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f86bfe89-5c2e-4d41-9691-a296f1166687")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0612c3dc-979b-4709-b12a-821e7da1f46d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryConnector(this);
        else
          return null;
    }

}
