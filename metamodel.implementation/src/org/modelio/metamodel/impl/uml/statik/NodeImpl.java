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
import org.modelio.metamodel.data.uml.statik.NodeData;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00133dc8-c4bf-1fd8-97fe-001ec947cd2a")
public class NodeImpl extends ClassifierImpl implements Node {
    @objid ("f2831b76-bc41-453f-9602-ac40310344bc")
    @Override
    public EList<Artifact> getResident() {
        return new SmList<>(this, NodeData.Metadata.ResidentDep());
    }

    @objid ("e9f1c6e0-301f-4fbc-b3f1-d98556b22efe")
    @Override
    public <T extends Artifact> List<T> getResident(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Artifact element : getResident()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2f1e11ed-b0f0-4d30-9c04-d82ee259c42b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("fd26b7e7-85f1-46c8-862a-41284dcadf87")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("650eeebb-19db-4185-bede-a2f47305d389")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNode(this);
        else
          return null;
    }

}
