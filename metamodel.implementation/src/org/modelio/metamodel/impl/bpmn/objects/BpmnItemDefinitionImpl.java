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
    @objid ("e2525503-7ae1-40e6-94d1-e6dbb4b7c296")
    @Override
    public BpmnItemKind getItemKind() {
        return (BpmnItemKind) getAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt());
    }

    @objid ("aa421932-a436-4770-8c33-94e3d118f220")
    @Override
    public void setItemKind(BpmnItemKind value) {
        setAttVal(BpmnItemDefinitionData.Metadata.ItemKindAtt(), value);
    }

    @objid ("4e9bc216-ac85-44ad-8468-5f0b7679e25c")
    @Override
    public boolean isIsCollection() {
        return (Boolean) getAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt());
    }

    @objid ("c0739464-f40b-4f13-bb97-da318e564b22")
    @Override
    public void setIsCollection(boolean value) {
        setAttVal(BpmnItemDefinitionData.Metadata.IsCollectionAtt(), value);
    }

    @objid ("e7d045f3-8646-47d6-b3e4-274451475527")
    @Override
    public GeneralClass getStructureRef() {
        return (GeneralClass) getDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep());
    }

    @objid ("3d6eabcd-5214-4e6d-a5fe-6717c322a3ed")
    @Override
    public void setStructureRef(GeneralClass value) {
        appendDepVal(BpmnItemDefinitionData.Metadata.StructureRefDep(), (SmObjectImpl)value);
    }

    @objid ("19a64141-bc7f-4ae7-afda-1916e0a22fa3")
    @Override
    public EList<BpmnMessage> getTypedMessage() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedMessageDep());
    }

    @objid ("c39783da-e5ac-4ac4-821c-2dbec58bcb85")
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

    @objid ("5e3dc9a4-0485-4417-a2ed-b011a110aa99")
    @Override
    public EList<BpmnItemAwareElement> getTypedItem() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedItemDep());
    }

    @objid ("77b23f96-05b3-4f73-8525-c1e46d08d1b8")
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

    @objid ("09723e63-d396-4f1b-84e6-e8454da378c1")
    @Override
    public EList<BpmnResourceParameter> getTypedResourceParameter() {
        return new SmList<>(this, BpmnItemDefinitionData.Metadata.TypedResourceParameterDep());
    }

    @objid ("795f7442-6388-4872-a910-d717ef6046b7")
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

    @objid ("f7a7e9e6-1fd8-4dfc-bb6f-039fe4c1a76c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("366a275b-c904-4d8d-9fc9-d8f9223da00f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a5ca06f6-dfe5-44b4-8c1f-9ea60cf1ece3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemDefinition(this);
        else
          return null;
    }

}
