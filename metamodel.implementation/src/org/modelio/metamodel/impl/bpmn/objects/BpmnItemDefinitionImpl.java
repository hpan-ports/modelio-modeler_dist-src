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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0007d5be-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnItemDefinitionImpl extends BpmnRootElementImpl implements BpmnItemDefinition {
    @objid ("f3a6779f-316b-43ac-b8ae-f46b40af34f0")
    @Override
    public BpmnItemKind getItemKind() {
        return (BpmnItemKind) getAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt());
    }

    @objid ("c985c49c-daf9-473b-8fef-439246219663")
    @Override
    public void setItemKind(BpmnItemKind value) {
        setAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt(), value);
    }

    @objid ("ce2baadc-09d5-4b10-887d-df4dc6b6c177")
    @Override
    public boolean isIsCollection() {
        return (Boolean) getAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt());
    }

    @objid ("66159af0-449c-425c-9b83-d5c62202bb83")
    @Override
    public void setIsCollection(boolean value) {
        setAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt(), value);
    }

    @objid ("ea4d4330-bce6-471b-99a0-c640783de4a4")
    @Override
    public GeneralClass getStructureRef() {
        return (GeneralClass) getDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep());
    }

    @objid ("11c3ebe2-1b84-45d1-b09a-96d2187e2452")
    @Override
    public void setStructureRef(GeneralClass value) {
        appendDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep(), (SmObjectImpl)value);
    }

    @objid ("9e163141-90e9-4895-90b1-8f42bb102211")
    @Override
    public EList<BpmnMessage> getTypedMessage() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedMessageDep());
    }

    @objid ("4dc04916-8eed-4760-9438-f03abfbda217")
    @Override
    public <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getTypedMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("690e4ac0-4dc8-40d9-b795-83de369e5017")
    @Override
    public EList<BpmnItemAwareElement> getTypedItem() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedItemDep());
    }

    @objid ("a1d1523a-7c01-4eff-a0d4-f3ec0f03d5ac")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getTypedItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e2eefaf7-f753-4b88-a0fc-3d3c2e782ec2")
    @Override
    public EList<BpmnResourceParameter> getTypedResourceParameter() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedResourceParameterDep());
    }

    @objid ("fdb02f3e-046b-4dce-91d4-d30fe62ce96b")
    @Override
    public <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameter element : getTypedResourceParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b0199fde-7eaa-4f2f-b840-fb3aaf237052")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a38c151f-595f-4ae2-9dc4-33194d5a6597")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("eb95564a-8e56-4b1c-be46-0473beaff128")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemDefinition(this);
        else
          return null;
    }

}
