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
    @objid ("54e04489-607d-4edb-aaab-2bbca14fd528")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, ConnectorEndData.Metadata.RepresentationDep());
    }

    @objid ("5ba11838-7092-476e-9089-0d01183b4e39")
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

    @objid ("c827e591-c638-4d81-877f-ce83250d90f8")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep());
    }

    @objid ("cce45bf4-52d0-41be-96f2-beacf984deb9")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("1035a46b-bc9b-4eb8-8689-1f58cca54063")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("20b65f77-bf02-423f-aedf-87b70dfecf0f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("34acf9ec-5dfe-461c-9bf2-cea4840581af")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectorEnd(this);
        else
          return null;
    }

}
