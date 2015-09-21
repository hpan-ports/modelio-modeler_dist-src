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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
import org.modelio.metamodel.impl.uml.statik.NameSpaceData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0011931a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class NameSpaceImpl extends ModelTreeImpl implements NameSpace {
    @objid ("68a8421d-3d81-4681-8015-8cb121c36c30")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(((NameSpaceSmClass)getClassOf()).getIsAbstractAtt());
    }

    @objid ("ad92b263-32fe-4a76-954b-d1c9fcc1161c")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(((NameSpaceSmClass)getClassOf()).getIsAbstractAtt(), value);
    }

    @objid ("1993d39f-52f5-4f47-82f0-38bb41fa3f93")
    @Override
    public boolean isIsLeaf() {
        return (Boolean) getAttVal(((NameSpaceSmClass)getClassOf()).getIsLeafAtt());
    }

    @objid ("597bb21a-574a-45bf-9313-0d601384f7f6")
    @Override
    public void setIsLeaf(boolean value) {
        setAttVal(((NameSpaceSmClass)getClassOf()).getIsLeafAtt(), value);
    }

    @objid ("beaaf1c9-1eab-41b7-9008-e1676e2d3ec3")
    @Override
    public boolean isIsRoot() {
        return (Boolean) getAttVal(((NameSpaceSmClass)getClassOf()).getIsRootAtt());
    }

    @objid ("55a92792-fcb0-4eb8-bddb-35a3bb798ac2")
    @Override
    public void setIsRoot(boolean value) {
        setAttVal(((NameSpaceSmClass)getClassOf()).getIsRootAtt(), value);
    }

    @objid ("5b19d113-d540-48aa-bbc4-98fde1a4d0a0")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(((NameSpaceSmClass)getClassOf()).getVisibilityAtt());
    }

    @objid ("361ed12e-3d57-4d90-9c33-752ecb2bf5e9")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(((NameSpaceSmClass)getClassOf()).getVisibilityAtt(), value);
    }

    @objid ("ce616c70-80b7-4322-b344-c257f2eab70b")
    @Override
    public EList<Generalization> getParent() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getParentDep());
    }

    @objid ("eb44a97e-a0af-4ffb-a038-87f9b3c9597e")
    @Override
    public <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Generalization element : getParent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb4033cc-3b36-40ee-9de8-2d4f4e3d0b21")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getTemplateInstanciationDep());
    }

    @objid ("8c9b9af3-0824-41e1-a87a-f6fae81167ee")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateBinding element : getTemplateInstanciation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9fe6ec7b-b06e-49f3-92d1-e65629adf996")
    @Override
    public EList<Instance> getRepresenting() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getRepresentingDep());
    }

    @objid ("eae1ea0d-8d98-494f-a28c-20db8e63b35b")
    @Override
    public <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Instance element : getRepresenting()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1a7cb887-a247-44c3-bebb-5542a0c7d886")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedBehaviorDep());
    }

    @objid ("765f92ca-804e-45ab-8445-c104db3194b6")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Behavior element : getOwnedBehavior()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0a403d15-60af-45f3-879d-b028d50ca920")
    @Override
    public EList<DataFlow> getReceived() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getReceivedDep());
    }

    @objid ("c3729f7a-9aab-4159-8ea0-1765f1a7edc9")
    @Override
    public <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final DataFlow element : getReceived()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5a9c38cd-5c24-4368-89f4-293ffdde9fe5")
    @Override
    public EList<NamespaceUse> getUsedNsu() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getUsedNsuDep());
    }

    @objid ("8a6c51d6-1e67-4fe3-9ab6-c1009d215db7")
    @Override
    public <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NamespaceUse element : getUsedNsu()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("91245acc-216c-467d-8a0d-e012e828850f")
    @Override
    public EList<InformationFlow> getOwnedInformationFlow() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedInformationFlowDep());
    }

    @objid ("c350ccea-d93b-4313-82d4-40077d157678")
    @Override
    public <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getOwnedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a47b483f-d346-40fc-9a0f-37205c24c2f8")
    @Override
    public EList<ElementImport> getImporting() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getImportingDep());
    }

    @objid ("3bf0ec49-bd98-4bc9-82c9-133e5a5a9884")
    @Override
    public <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ElementImport element : getImporting()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("764aba97-489a-42da-8bc7-2233aa1481a3")
    @Override
    public EList<DataFlow> getSent() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getSentDep());
    }

    @objid ("2eb07f0c-8ac8-4966-8f65-0b4370034056")
    @Override
    public <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final DataFlow element : getSent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e0168bfe-09ca-4f5b-b069-fa0fa9de060b")
    @Override
    public EList<DataFlow> getOwnedDataFlow() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedDataFlowDep());
    }

    @objid ("31c4ee3c-da71-4377-9aff-8a4261b10e9d")
    @Override
    public <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final DataFlow element : getOwnedDataFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5d0164af-e8f1-407e-997b-c4c97928e42a")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedCollaborationUseDep());
    }

    @objid ("278745ea-a367-4789-a43a-f674d4845356")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("faf06de9-9641-4028-bd1e-7df42b4eff84")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedPackageImportDep());
    }

    @objid ("898767bb-6b2a-4424-8b83-528eb65ae36e")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PackageImport element : getOwnedPackageImport()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53b3b2cd-56be-450d-b4e0-cdc0c2e0643b")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getTemplateDep());
    }

    @objid ("72ef9dd1-1c9e-46a6-9561-ef2bcf3ed073")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameter element : getTemplate()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d0cd650c-a45a-47fb-ac76-40d6b19b85ef")
    @Override
    public EList<Generalization> getSpecialization() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getSpecializationDep());
    }

    @objid ("6dc5b5c5-d161-47f4-8b9e-e865772a1ccd")
    @Override
    public <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Generalization element : getSpecialization()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9da768d6-a8e0-4d82-9514-ee8897562867")
    @Override
    public EList<InterfaceRealization> getRealized() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getRealizedDep());
    }

    @objid ("ec07356b-0df7-491a-9077-183839695852")
    @Override
    public <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InterfaceRealization element : getRealized()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e09c8ec-9b90-48de-bbb5-f6a785d1e14d")
    @Override
    public EList<Instance> getDeclared() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getDeclaredDep());
    }

    @objid ("36fbf313-986c-4163-8387-bdf1ca67542a")
    @Override
    public <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Instance element : getDeclared()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25e7c7a9-7c03-4e18-b72b-7c5cc7ebf37a")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getInstanciatingBindingDep());
    }

    @objid ("ab4bca2f-9e66-4ad2-93f4-d4d1bfbd0006")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateBinding element : getInstanciatingBinding()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a5eef992-9e9b-4044-bf35-e681b17fd0b1")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getOwnedImportDep());
    }

    @objid ("5672ed83-3633-4c31-81bc-23c171507739")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ElementImport element : getOwnedImport()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a36a4deb-1cc8-440d-a0bc-52ffce85b7ad")
    @Override
    public EList<NamespaceUse> getUserNsu() {
        return new SmList<>(this, ((NameSpaceSmClass)getClassOf()).getUserNsuDep());
    }

    @objid ("57fd08f5-aae7-42f1-9701-fddfdd83f84b")
    @Override
    public <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NamespaceUse element : getUserNsu()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3bcce010-bfc9-48c6-bb3e-d004f2260028")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("50d23f4a-8876-4c89-b2f8-d01621bc2a7e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("a3456b8c-50b0-4d60-911a-901e03bc2a5c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNameSpace(this);
        else
          return null;
    }

}
