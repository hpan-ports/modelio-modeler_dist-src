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
    @objid ("6f09c2aa-ef79-42f9-9253-33e27668e599")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsAbstractAtt());
    }

    @objid ("0b899ba2-0506-455e-bc32-c18d87befd69")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("5185fc72-4bbd-4460-bd3c-391b816a4ec0")
    @Override
    public boolean isIsLeaf() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsLeafAtt());
    }

    @objid ("dbb12773-a6f3-4b40-8a47-54014202e53c")
    @Override
    public void setIsLeaf(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsLeafAtt(), value);
    }

    @objid ("21f91eca-95ec-42b3-8f52-ed171b771fa4")
    @Override
    public boolean isIsRoot() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsRootAtt());
    }

    @objid ("1bae77b5-ab02-4b1e-abaf-896ab1b5f092")
    @Override
    public void setIsRoot(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsRootAtt(), value);
    }

    @objid ("9423f1f0-d6a5-4f8d-b44c-c7539b069d73")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(NameSpaceData.Metadata.VisibilityAtt());
    }

    @objid ("57dbd06a-8364-4ee7-969f-20724f86ab07")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(NameSpaceData.Metadata.VisibilityAtt(), value);
    }

    @objid ("d916db17-1f86-4fea-bb35-9a0c9e7183fc")
    @Override
    public EList<Generalization> getParent() {
        return new SmList<>(this, NameSpaceData.Metadata.ParentDep());
    }

    @objid ("781e9261-d1e0-4738-bba5-b51829735f95")
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

    @objid ("7f927364-d033-433d-8cb5-9babe6e174ed")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateInstanciationDep());
    }

    @objid ("913198e8-030c-4c93-acab-a4e75997850b")
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

    @objid ("3f9f8aaa-8207-4627-a2f0-3d187bd250b0")
    @Override
    public EList<Instance> getRepresenting() {
        return new SmList<>(this, NameSpaceData.Metadata.RepresentingDep());
    }

    @objid ("b8801ca6-fbae-4909-8b09-8fe1795abf8b")
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

    @objid ("94dc62a5-749f-4c08-bda5-903202ae4962")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedBehaviorDep());
    }

    @objid ("955a2169-7d13-4bf2-9645-e0ea0408c8ba")
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

    @objid ("6c8b74b5-9cf9-4703-8393-5b31ae62f741")
    @Override
    public EList<DataFlow> getReceived() {
        return new SmList<>(this, NameSpaceData.Metadata.ReceivedDep());
    }

    @objid ("a9ff7a78-a9b4-4539-a00d-ffb62bdae53c")
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

    @objid ("6b163a84-6162-4337-afb4-6ccbb409692e")
    @Override
    public EList<NamespaceUse> getUsedNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UsedNsuDep());
    }

    @objid ("26ccee4e-a5e8-4c33-a36e-280395611b47")
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

    @objid ("753522b6-2c96-4a38-a1f0-e0595f2417b4")
    @Override
    public EList<InformationFlow> getOwnedInformationFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedInformationFlowDep());
    }

    @objid ("1059cec5-094c-4d52-998a-1f121aca9c6e")
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

    @objid ("58476e5c-dcb0-4fd5-b053-fc0222aeb2a5")
    @Override
    public EList<ElementImport> getImporting() {
        return new SmList<>(this, NameSpaceData.Metadata.ImportingDep());
    }

    @objid ("557f12a2-a161-4932-8245-4fa6207aec38")
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

    @objid ("be6575cb-d889-4482-967b-f7286e7439e3")
    @Override
    public EList<DataFlow> getSent() {
        return new SmList<>(this, NameSpaceData.Metadata.SentDep());
    }

    @objid ("ba675cfb-978e-4828-a4cb-78d257b8777c")
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

    @objid ("f1316862-6ad2-4e8c-bb21-e5b33b02bde0")
    @Override
    public EList<DataFlow> getOwnedDataFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedDataFlowDep());
    }

    @objid ("9ca9dfc0-ffdb-4474-951a-d98f5e80c0f8")
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

    @objid ("162f7012-8071-4d60-a4c3-fc7141b1b6cf")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("78a2cb9e-dc06-4b4b-bf29-9ab5318cd5ea")
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

    @objid ("6ecc9322-9f03-4730-b9a2-dcea6297ccff")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedPackageImportDep());
    }

    @objid ("fcc1fd9b-87d3-4301-82a8-5690008210e8")
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

    @objid ("2e644372-df28-4056-aba7-ef42dbbe2294")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateDep());
    }

    @objid ("702599d1-de6a-4869-b907-227fbe297b94")
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

    @objid ("33dd818b-60ee-4b3f-8d57-8a957dd8b716")
    @Override
    public EList<Generalization> getSpecialization() {
        return new SmList<>(this, NameSpaceData.Metadata.SpecializationDep());
    }

    @objid ("0a062633-8e49-42fd-9122-2c29381bc1d2")
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

    @objid ("40b9244d-8fe8-47dc-aac4-3fd801eb86c8")
    @Override
    public EList<InterfaceRealization> getRealized() {
        return new SmList<>(this, NameSpaceData.Metadata.RealizedDep());
    }

    @objid ("946c5a6f-3284-45ac-a228-1241d3eb8693")
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

    @objid ("dae846d4-402a-474b-8fc0-409b7e871860")
    @Override
    public EList<Instance> getDeclared() {
        return new SmList<>(this, NameSpaceData.Metadata.DeclaredDep());
    }

    @objid ("bab06d39-b851-4cb2-89a5-62b809992b4e")
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

    @objid ("173feec7-faeb-4d75-9ba9-2bd56cb9368d")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, NameSpaceData.Metadata.InstanciatingBindingDep());
    }

    @objid ("33284303-85f3-4a5c-bbde-8b1d3fc742df")
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

    @objid ("42092a4a-2922-414d-a060-992d9c5c1815")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedImportDep());
    }

    @objid ("83e1acae-15bf-4c03-9d7d-6ea67dd31434")
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

    @objid ("cad0f1a8-35fe-4634-b0d9-ac3cc40b1f93")
    @Override
    public EList<NamespaceUse> getUserNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UserNsuDep());
    }

    @objid ("c962a952-41a2-4cac-a900-3fdcdbc3c462")
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

    @objid ("79434cb8-3713-4960-8016-27dcbe760228")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2585abf9-3196-4fcd-982f-a1a0a274e78c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bb61aa7d-087e-4815-aced-7cfefac258d4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNameSpace(this);
        else
          return null;
    }

}
