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
    @objid ("036e8899-face-4018-bb95-bd08d2832cf4")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsAbstractAtt());
    }

    @objid ("2116fd4f-b370-43e6-8169-7a86986774ed")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("bfd8a223-6c71-4d35-b2fc-f016b7c70fab")
    @Override
    public boolean isIsLeaf() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsLeafAtt());
    }

    @objid ("12609951-b024-4633-9a2f-4b2df6699297")
    @Override
    public void setIsLeaf(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsLeafAtt(), value);
    }

    @objid ("a9961549-26c6-424e-b608-69e341201be5")
    @Override
    public boolean isIsRoot() {
        return (Boolean) getAttVal(NameSpaceData.Metadata.IsRootAtt());
    }

    @objid ("8667057c-7815-4fd1-9a63-d44c99ce0da4")
    @Override
    public void setIsRoot(boolean value) {
        setAttVal(NameSpaceData.Metadata.IsRootAtt(), value);
    }

    @objid ("aa709bde-c3b7-43dc-b49f-a65e1172b498")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(NameSpaceData.Metadata.VisibilityAtt());
    }

    @objid ("8bb4a3fb-62ba-4241-a87b-20de7e1ddde0")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(NameSpaceData.Metadata.VisibilityAtt(), value);
    }

    @objid ("0e36bbc9-0344-4adc-9aab-3dc1a22e08a5")
    @Override
    public EList<Generalization> getParent() {
        return new SmList<>(this, NameSpaceData.Metadata.ParentDep());
    }

    @objid ("48b83ee6-680f-4a3b-af89-8840204e4055")
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

    @objid ("a37070c1-00e3-4a14-b843-2f52fe26196d")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateInstanciationDep());
    }

    @objid ("1cbba6f3-4dc1-42c0-99b0-b6d2ebf1be37")
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

    @objid ("cbd43974-318c-4fbe-abaf-42bd21564000")
    @Override
    public EList<Instance> getRepresenting() {
        return new SmList<>(this, NameSpaceData.Metadata.RepresentingDep());
    }

    @objid ("f7c91da9-4480-438e-abfe-b5fe5431ae85")
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

    @objid ("d292d46d-0d0c-4111-a3ec-f3cf74c1479c")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedBehaviorDep());
    }

    @objid ("79202c67-a114-470a-bae5-f01f12f39a96")
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

    @objid ("f7e98523-7ca1-44ac-b5a0-b5a55031d8a4")
    @Override
    public EList<DataFlow> getReceived() {
        return new SmList<>(this, NameSpaceData.Metadata.ReceivedDep());
    }

    @objid ("ec19993a-c419-4376-9be8-4f806bfc8a93")
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

    @objid ("9408b521-1f06-4e36-8fd4-e24044735e0c")
    @Override
    public EList<NamespaceUse> getUsedNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UsedNsuDep());
    }

    @objid ("30c14192-22fe-453d-b029-e37bbfcf6653")
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

    @objid ("0f81dddf-53f0-4d6e-b1d3-f3e229e8a919")
    @Override
    public EList<InformationFlow> getOwnedInformationFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedInformationFlowDep());
    }

    @objid ("54053c6b-b080-441e-89c7-c02755f771ee")
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

    @objid ("94cffc12-d19e-4989-a86d-0d625f6046c6")
    @Override
    public EList<ElementImport> getImporting() {
        return new SmList<>(this, NameSpaceData.Metadata.ImportingDep());
    }

    @objid ("6f083217-f60f-4b80-977a-1c193f35ffa1")
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

    @objid ("8349fb2a-4f43-4ccb-9f76-5b0cca1a5467")
    @Override
    public EList<DataFlow> getSent() {
        return new SmList<>(this, NameSpaceData.Metadata.SentDep());
    }

    @objid ("090ee6ff-ff5e-4aab-bb7e-c01e02dfde05")
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

    @objid ("65d5c20c-b071-469e-b606-7678688c0104")
    @Override
    public EList<DataFlow> getOwnedDataFlow() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedDataFlowDep());
    }

    @objid ("94345437-5022-40cf-93cc-75b01005d478")
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

    @objid ("b2645cfa-fbc4-4401-9550-799f8eac0604")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("2fe96310-c1ed-4a07-a51d-6d96a07c649e")
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

    @objid ("9bf0bdad-4d70-4822-bc52-5e6e59ca41e1")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedPackageImportDep());
    }

    @objid ("27e96978-feb3-42e4-a5b0-85898b176ea2")
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

    @objid ("cf70c735-4c7d-40f1-a48a-65cac102451c")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, NameSpaceData.Metadata.TemplateDep());
    }

    @objid ("1aee3117-60f9-489f-bffc-b754c85fda1b")
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

    @objid ("71340c1b-230e-416f-b0e4-fbe715e007cd")
    @Override
    public EList<Generalization> getSpecialization() {
        return new SmList<>(this, NameSpaceData.Metadata.SpecializationDep());
    }

    @objid ("d925b6d5-6c58-4a12-acd4-7d8873fe32cd")
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

    @objid ("e06f680b-3ae0-47f6-a238-b639fced556c")
    @Override
    public EList<InterfaceRealization> getRealized() {
        return new SmList<>(this, NameSpaceData.Metadata.RealizedDep());
    }

    @objid ("1f5477e2-9607-4346-8331-333b5915e8ea")
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

    @objid ("1edba25b-2ca1-4f62-b0dc-0f4de07838e6")
    @Override
    public EList<Instance> getDeclared() {
        return new SmList<>(this, NameSpaceData.Metadata.DeclaredDep());
    }

    @objid ("b4392606-5b83-4c4a-9256-94aad1002119")
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

    @objid ("963f2684-7e4d-481b-9403-425c3c8bd200")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, NameSpaceData.Metadata.InstanciatingBindingDep());
    }

    @objid ("6fc9d901-f445-4191-9cec-796bb12506c0")
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

    @objid ("e5a92632-2a53-4b40-ab05-827b9ee9de6e")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, NameSpaceData.Metadata.OwnedImportDep());
    }

    @objid ("92adc9ce-9d5f-4589-9bfd-498655ddf91f")
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

    @objid ("9e150c83-531f-487f-85b4-aeb789f476cc")
    @Override
    public EList<NamespaceUse> getUserNsu() {
        return new SmList<>(this, NameSpaceData.Metadata.UserNsuDep());
    }

    @objid ("08567ace-02e5-410c-af0d-4808b8c91aec")
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

    @objid ("4548918e-c99b-4b4a-8e03-76ff64864b5c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("20f1ae57-f038-4f88-af9d-b71304a29c5a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b4f103cd-fee6-4d19-9cba-946b51f8fe07")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNameSpace(this);
        else
          return null;
    }

}
