/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
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
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0007d5be-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnItemDefinitionImpl extends BpmnRootElementImpl implements BpmnItemDefinition {
    @objid ("627484b1-84f7-4168-abbf-094f549f3f3e")
    @Override
    public BpmnItemKind getItemKind() {
        return (BpmnItemKind) getAttVal(((BpmnItemDefinitionSmClass)getClassOf()).getItemKindAtt());
    }

    @objid ("3a5d6e78-7493-46f2-963d-944c5fe6c4d4")
    @Override
    public void setItemKind(BpmnItemKind value) {
        setAttVal(((BpmnItemDefinitionSmClass)getClassOf()).getItemKindAtt(), value);
    }

    @objid ("97dbf668-fc1a-4c6d-a562-4b296858f694")
    @Override
    public boolean isIsCollection() {
        return (Boolean) getAttVal(((BpmnItemDefinitionSmClass)getClassOf()).getIsCollectionAtt());
    }

    @objid ("07c1507a-8893-41e7-b6f8-22fa5f6cbfdc")
    @Override
    public void setIsCollection(boolean value) {
        setAttVal(((BpmnItemDefinitionSmClass)getClassOf()).getIsCollectionAtt(), value);
    }

    @objid ("8dc3fea5-39e3-4342-aa79-3b2634b36a78")
    @Override
    public GeneralClass getStructureRef() {
        Object obj = getDepVal(((BpmnItemDefinitionSmClass)getClassOf()).getStructureRefDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("77d99101-c603-4eba-bdfd-9045f96adb91")
    @Override
    public void setStructureRef(GeneralClass value) {
        appendDepVal(((BpmnItemDefinitionSmClass)getClassOf()).getStructureRefDep(), (SmObjectImpl)value);
    }

    @objid ("25c52b62-e013-4aed-9c87-3c3298e5a6f7")
    @Override
    public EList<BpmnMessage> getTypedMessage() {
        return new SmList<>(this, ((BpmnItemDefinitionSmClass)getClassOf()).getTypedMessageDep());
    }

    @objid ("83361f64-ddcd-4390-b747-152fc469b664")
    @Override
    public <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessage element : getTypedMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("950c8f65-b36d-4266-b637-3a6cfa3e3447")
    @Override
    public EList<BpmnItemAwareElement> getTypedItem() {
        return new SmList<>(this, ((BpmnItemDefinitionSmClass)getClassOf()).getTypedItemDep());
    }

    @objid ("63b171d6-1e57-46f3-a422-d7a9ba421d3f")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemAwareElement element : getTypedItem()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("52853ada-6c75-49d5-b4d0-6e0fcb512097")
    @Override
    public EList<BpmnResourceParameter> getTypedResourceParameter() {
        return new SmList<>(this, ((BpmnItemDefinitionSmClass)getClassOf()).getTypedResourceParameterDep());
    }

    @objid ("57187033-9396-4b4b-8b64-78ab42368dd7")
    @Override
    public <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnResourceParameter element : getTypedResourceParameter()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bb472773-47e4-4294-a46b-6078306ab9e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("97148fbf-05f7-4d48-804a-ebd28a5d54cf")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("21a020a6-fc0a-4fad-b1cc-10bdd1865e9d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemDefinition(this);
        else
          return null;
    }

}
