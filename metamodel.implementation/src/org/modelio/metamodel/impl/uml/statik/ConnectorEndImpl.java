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
    @objid ("75afa3ad-46ae-4c7f-b90b-787d9eca0af5")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, ConnectorEndData.Metadata.RepresentationDep());
    }

    @objid ("4325244d-b364-4679-bda7-52c3b5192df2")
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

    @objid ("d30a3762-d941-410a-9dc5-a7ac6a6aab50")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep());
    }

    @objid ("2ed44fb2-2126-47ce-92b4-5bc686e991c2")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(ConnectorEndData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("8a8e453a-4b8a-4695-b663-b365754077be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("14af8f1f-a9c9-479b-9bc8-a615ab2a7352")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("36e6b04f-9c25-4785-b8bf-9b652a6d344f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectorEnd(this);
        else
          return null;
    }

}
