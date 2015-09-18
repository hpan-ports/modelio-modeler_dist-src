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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00097356-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceImpl extends BpmnRootElementImpl implements BpmnResource {
    @objid ("aeceec4f-6af7-45dc-a650-b5d6bfae2b49")
    @Override
    public EList<BpmnResourceRole> getResourceroleRefs() {
        return new SmList<>(this, BpmnResourceData.Metadata.ResourceroleRefsDep());
    }

    @objid ("fdf01fd8-739f-4a45-8a94-c8a738ebe838")
    @Override
    public <T extends BpmnResourceRole> List<T> getResourceroleRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceRole element : getResourceroleRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d62de405-7de6-4bc5-8be6-e74a10521785")
    @Override
    public EList<BpmnResourceParameter> getParameter() {
        return new SmList<>(this, BpmnResourceData.Metadata.ParameterDep());
    }

    @objid ("683f9b82-d4ac-4bde-bf04-6941fa79fb13")
    @Override
    public <T extends BpmnResourceParameter> List<T> getParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameter element : getParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("513f6aed-fea6-4023-8cd3-dcafafd53391")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cff10632-ef10-440c-96e5-dd8412df6c42")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("64a5d663-eb71-4e80-9651-46c4be9c8cad")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResource(this);
        else
          return null;
    }

}
