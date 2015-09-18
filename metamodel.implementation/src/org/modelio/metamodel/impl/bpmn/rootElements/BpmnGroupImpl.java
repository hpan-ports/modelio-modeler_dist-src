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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnGroupData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007a5ba2-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnGroupImpl extends BpmnArtifactImpl implements BpmnGroup {
    @objid ("a4aa95b1-03da-4437-b81b-49c370aa93be")
    @Override
    public String getCategory() {
        return (String) getAttVal(BpmnGroupData.Metadata.CategoryAtt());
    }

    @objid ("70a9db5a-53c8-478d-937f-6ba4619ad9e1")
    @Override
    public void setCategory(String value) {
        setAttVal(BpmnGroupData.Metadata.CategoryAtt(), value);
    }

    @objid ("7283e5a0-7a47-4970-b8d9-04f474ab4d7a")
    @Override
    public EList<BpmnFlowElement> getCategorized() {
        return new SmList<>(this, BpmnGroupData.Metadata.CategorizedDep());
    }

    @objid ("d1cdaa78-bebf-4ada-862a-40abb94572c1")
    @Override
    public <T extends BpmnFlowElement> List<T> getCategorized(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnFlowElement element : getCategorized()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b35cb8e6-5320-4fa5-912c-e18239aec0e9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8b3fee87-ef27-4f6f-85fd-b27603dfe99e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3a996938-0c7e-4e0d-bdea-2a87bf4e8f46")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnGroup(this);
        else
          return null;
    }

}
