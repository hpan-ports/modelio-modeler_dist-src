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
    @objid ("073d7216-3f61-4cb4-a2ca-fad42cf308c5")
    @Override
    public BpmnItemKind getItemKind() {
        return (BpmnItemKind) getAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt());
    }

    @objid ("20dd9655-39e7-4a3c-a132-3edc13f2e6ff")
    @Override
    public void setItemKind(BpmnItemKind value) {
        setAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt(), value);
    }

    @objid ("d59ac3f9-cc58-4a51-bfe3-3cb13c3dafe4")
    @Override
    public boolean isIsCollection() {
        return (Boolean) getAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt());
    }

    @objid ("eccf94e6-0f3d-47d2-85b4-6b03fe17c633")
    @Override
    public void setIsCollection(boolean value) {
        setAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt(), value);
    }

    @objid ("723eea98-19a2-40f3-a445-9fcb9273b46d")
    @Override
    public GeneralClass getStructureRef() {
        return (GeneralClass) getDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep());
    }

    @objid ("31c42b5f-eb60-4bcf-b33b-cff3ac155c2c")
    @Override
    public void setStructureRef(GeneralClass value) {
        appendDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep(), (SmObjectImpl)value);
    }

    @objid ("346b9353-467a-40b7-b84a-43dd9472d60d")
    @Override
    public EList<BpmnMessage> getTypedMessage() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedMessageDep());
    }

    @objid ("5bb86839-b796-48b2-818d-9b7c8f212849")
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

    @objid ("104c676a-92cd-42fe-9d3e-6c6835e48b06")
    @Override
    public EList<BpmnItemAwareElement> getTypedItem() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedItemDep());
    }

    @objid ("88a0ff05-ea39-40eb-af3d-e053b0874f5d")
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

    @objid ("099bb953-cde7-4629-b6fe-d42c853a6010")
    @Override
    public EList<BpmnResourceParameter> getTypedResourceParameter() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedResourceParameterDep());
    }

    @objid ("6d61b833-a7e3-4cc0-aa09-edf85d401d2f")
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

    @objid ("446dc91f-cd54-437a-af46-f68f6b73f80e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3f582163-3d08-4757-8107-32a0efe4bf14")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8e2b0e18-724c-4517-ad1f-8e40968c37c1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemDefinition(this);
        else
          return null;
    }

}
