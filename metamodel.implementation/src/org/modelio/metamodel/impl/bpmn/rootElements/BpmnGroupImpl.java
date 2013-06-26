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
    @objid ("a924775b-5c06-43e4-a18e-c3853125de42")
    @Override
    public String getCategory() {
        return (String) getAttVal(BpmnGroupData.Metadata.CategoryAtt());
    }

    @objid ("32732183-f7fe-4dff-9745-d5f61e86fa48")
    @Override
    public void setCategory(String value) {
        setAttVal(BpmnGroupData.Metadata.CategoryAtt(), value);
    }

    @objid ("8b4c57cb-a4de-420f-b126-74ac9de9714e")
    @Override
    public EList<BpmnFlowElement> getCategorized() {
        return new SmList<>(this, BpmnGroupData.Metadata.CategorizedDep());
    }

    @objid ("2fe67025-1032-43ab-a15b-3559fd52c179")
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

    @objid ("9c024ec5-8327-4de7-8f87-e402ce38a3a6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("69ef8fcc-af58-4f99-929a-4b96fd3019a8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2b17468a-3954-440a-8b45-2f740d923f43")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnGroup(this);
        else
          return null;
    }

}
