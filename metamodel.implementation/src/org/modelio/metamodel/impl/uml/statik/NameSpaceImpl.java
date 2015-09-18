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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
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

@objid ("0011931a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class NameSpaceImpl extends ModelTreeImpl implements NameSpace {
    @objid ("481b3ddf-931a-409c-896c-b3b92a481583")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsAbstractAtt());
    }

    @objid ("ee5bf4f9-fdd2-4b73-b8ca-e5ecad667f83")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("c48f17e3-ed41-4e03-a241-a589c5642e3d")
    @Override
    public boolean isIsLeaf() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsLeafAtt());
    }

    @objid ("9a9e1c7a-967c-4858-96eb-da1e117076b1")
    @Override
    public void setIsLeaf(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsLeafAtt(), value);
    }

    @objid ("a60fc4d2-5e1d-418d-bf62-11ec9f515505")
    @Override
    public boolean isIsRoot() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsRootAtt());
    }

    @objid ("56462e0c-b840-402f-a92c-4863b4f14086")
    @Override
    public void setIsRoot(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsRootAtt(), value);
    }

    @objid ("ce5e1326-2762-4db5-a497-a0f59eee2e9c")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(NameSpaceData.Metadata.VisibilityAtt());
    }

    @objid ("fa882b96-fa87-4b22-889b-7caa2c9a4525")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(NameSpaceData.Metadata.VisibilityAtt(), value);
    }

    @objid ("79ef3e34-94d3-472e-b44a-1fc0dfa82e17")
    @Override
    public EList<Generalization> getParent() {
        return new SmList<>(this, NameSpaceData.Metadata.ParentDep());
    }

    @objid ("4f375fe4-5461-40b7-8f1c-a5ca28b79ee7")
    @Override
    public <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Generalization element : getParent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7834f093-f6e3-44ad-a9d5-60654bb46519")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateInstanciationDep());
    }

    @objid ("ed5ee109-88fe-4c0b-a25d-a1292e8ca5ff")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getTemplateInstanciation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9c9a7f5a-78c2-4f5d-8181-4914ff6b5d67")
    @Override
    public EList<Instance> getRepresenting() {
        return new SmList<>(this, NameSpaceData.Metadata.RepresentingDep());
    }

    @objid ("4599ce44-aafa-4323-8e33-34bc0e9526c3")
    @Override
    public <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Instance element : getRepresenting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("22dfa720-21a7-474e-b067-9903f9925a94")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedBehaviorDep());
    }

    @objid ("f6f2b888-c8ce-427d-b576-24d5d04ba79b")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Behavior element : getOwnedBehavior()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f11cc137-93dc-4695-9afb-39c4a5a68c7a")
    @Override
    public EList<DataFlow> getReceived() {
        return new SmList<>(this, NameSpaceData.Metadata.ReceivedDep());
    }

    @objid ("860b88a1-553e-4b90-90cd-6272a2502a68")
    @Override
    public <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getReceived()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("38dc7778-b066-4383-80f7-5a275f38bec2")
    @Override
    public EList<NamespaceUse> getUsedNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UsedNsuDep());
    }

    @objid ("6cae0969-e2db-42ab-ac2c-cdd6acdc0d7d")
    @Override
    public <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NamespaceUse element : getUsedNsu()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d0a012b1-5fce-46e4-b56c-847882f14972")
    @Override
    public EList<InformationFlow> getOwnedInformationFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedInformationFlowDep());
    }

    @objid ("ac170d04-e44b-4c50-8965-6a5f24eb37c4")
    @Override
    public <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getOwnedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("977b32ee-37e2-4670-9fa1-c958c5eaaa22")
    @Override
    public EList<ElementImport> getImporting() {
        return new SmList<>(this, NameSpaceData.Metadata.ImportingDep());
    }

    @objid ("a5904d3d-655b-4928-b48f-e10cbcdf702b")
    @Override
    public <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getImporting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("43ccab90-076d-4fe2-8ce7-45608281447e")
    @Override
    public EList<DataFlow> getSent() {
        return new SmList<>(this, NameSpaceData.Metadata.SentDep());
    }

    @objid ("9961f962-96c4-463c-bf79-9484682e1612")
    @Override
    public <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getSent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ed7eefb9-b2d0-42f5-89e3-401631b5dc10")
    @Override
    public EList<DataFlow> getOwnedDataFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedDataFlowDep());
    }

    @objid ("e94018de-966b-4a33-83b7-155a616b1df6")
    @Override
    public <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getOwnedDataFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fa6c52ba-68a7-427e-8f1d-d9a7631efa3e")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("411a95f1-bf0e-4de5-883b-9eb437d689e7")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0267d883-0109-4ac8-bccf-8d380f66d8cc")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedPackageImportDep());
    }

    @objid ("475617d9-0e4e-49f5-a8c6-b53afb7dd25f")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getOwnedPackageImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c779371-8af5-471d-8750-56d3dc7b0abf")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateDep());
    }

    @objid ("ca009b68-c3de-4b29-bebb-691e0b31a6f6")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTemplate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1c340a54-9dc8-44a2-aa24-831cca265bf7")
    @Override
    public EList<Generalization> getSpecialization() {
        return new SmList<>(this, NameSpaceData.Metadata.SpecializationDep());
    }

    @objid ("c45a2eab-4f43-4598-8cbf-9653b148428c")
    @Override
    public <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Generalization element : getSpecialization()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b956d711-990c-4ee0-910e-1c453604428f")
    @Override
    public EList<InterfaceRealization> getRealized() {
        return new SmList<>(this, NameSpaceData.Metadata.RealizedDep());
    }

    @objid ("5fd4fc52-f9f3-4242-94c7-8ce7e9cb745e")
    @Override
    public <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InterfaceRealization element : getRealized()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("29bc347b-30cf-4ca2-9ed7-9d2a28c5a248")
    @Override
    public EList<Instance> getDeclared() {
        return new SmList<>(this, NameSpaceData.Metadata.DeclaredDep());
    }

    @objid ("9e3462bf-5506-4267-8d7e-eb470f8c30fd")
    @Override
    public <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Instance element : getDeclared()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f17b528d-0203-4115-af29-007d0f30307c")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, NameSpaceData.Metadata.InstanciatingBindingDep());
    }

    @objid ("3d749c6a-7b69-432b-a3cf-d1473868e573")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getInstanciatingBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("77d69d4e-cc13-4fc1-91a3-9b00f394d594")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedImportDep());
    }

    @objid ("f684942c-5674-4b15-894c-21944fa65b2e")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getOwnedImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d4202652-1c72-4de2-83f0-dbdf0baf3a44")
    @Override
    public EList<NamespaceUse> getUserNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UserNsuDep());
    }

    @objid ("a797ea05-0fae-4660-a321-16f7e7fe71af")
    @Override
    public <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NamespaceUse element : getUserNsu()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fe387552-43cd-46c4-b1ea-7d61dd961f73")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8de57175-f81f-444d-95cc-c19b346e501f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e68c0feb-622c-4cdd-a725-696c4f72ff70")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNameSpace(this);
        else
          return null;
    }

}
