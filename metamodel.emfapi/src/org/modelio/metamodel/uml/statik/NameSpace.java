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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00115274-c4bf-1fd8-97fe-001ec947cd2a")
public interface NameSpace extends ModelTree {
    @objid ("9b601ef6-6a03-46b8-b2b1-b5ae30844a6f")
    boolean isIsAbstract();

    @objid ("fe8008c6-ff62-4bd6-ae25-793e0015bd63")
    void setIsAbstract(boolean value);

    @objid ("b98dbfc5-be5c-4b62-8d0e-2503cb9da204")
    boolean isIsLeaf();

    @objid ("a5b3dd0c-df85-4d2b-9460-e4f910a6b256")
    void setIsLeaf(boolean value);

    @objid ("eb817ceb-81ed-414d-a396-17e6f92a9d2a")
    boolean isIsRoot();

    @objid ("d49453d1-23fd-44ff-8c6d-0b95060db29c")
    void setIsRoot(boolean value);

    @objid ("37c156fe-b8cc-41dd-acd1-d4fd3a5b2f8d")
    VisibilityMode getVisibility();

    @objid ("fbccf08b-a4ae-406a-af9d-2c6d4bdf8328")
    void setVisibility(VisibilityMode value);

    @objid ("16b303d0-c9fb-4fae-a7b9-2ccf01c0c12c")
    EList<Generalization> getParent();

    @objid ("f16992cf-06c2-4ec3-97ca-d0ae8332baac")
    <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass);

    @objid ("8bcda86f-059a-41b3-9b65-8c1e97e7b6e6")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("5371828c-4f47-48c5-90f9-83aae511df21")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("704e72d6-566c-4f21-ad7c-c7984da224be")
    EList<Instance> getRepresenting();

    @objid ("ae9d7238-afac-4e60-845e-0219febbe198")
    <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass);

    @objid ("ca4b2f59-2178-496c-bb23-74ead710a8b2")
    EList<Behavior> getOwnedBehavior();

    @objid ("78ef39ec-204d-40ec-a943-996e30761a34")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("2aef34bf-997f-43ba-a392-7c3b2e12f787")
    EList<DataFlow> getReceived();

    @objid ("ea23b630-00e2-4a7e-8c23-b6076b53ff6e")
    <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass);

    @objid ("45e99999-8ef6-4b4c-b5c7-92e2ee871537")
    EList<NamespaceUse> getUsedNsu();

    @objid ("c6943186-65b7-46d9-8aba-c5a566d369d1")
    <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass);

    @objid ("8d491660-2a85-43dc-9843-ec22901471fd")
    EList<InformationFlow> getOwnedInformationFlow();

    @objid ("e0f29fb3-34a6-4306-a59c-31cac2c6379f")
    <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("0aac8c07-3f27-4360-87dc-edac04753820")
    EList<ElementImport> getImporting();

    @objid ("c8593d3f-8df5-43d6-a1b3-87af3639f05f")
    <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass);

    @objid ("c2b48b9e-e70a-44be-add7-1063cac09266")
    EList<DataFlow> getSent();

    @objid ("8ddeddaf-a7e6-4fd6-a30d-3478a9ba0de4")
    <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("3ca237df-b49c-4103-bb84-d0b37fb3360a")
    EList<DataFlow> getOwnedDataFlow();

    @objid ("b8d773c0-31d1-46e1-acbd-f1b7b039d7bd")
    <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass);

    @objid ("32bb72c8-75fe-46b8-9faf-db7d58af8364")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("ca499d3b-d258-4015-a156-3ee341e04fca")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("76b1919e-1283-4b14-86e2-68982d4ea11b")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("e58d3417-063b-4b05-a595-6bc932eb70b1")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("f693ba2f-8457-4efd-a594-adb213cd72e4")
    EList<TemplateParameter> getTemplate();

    @objid ("703a853c-2cd2-42d9-9c05-2423b4f35038")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("ecb15d0e-987a-45d9-bcb8-c3ed811b23f9")
    EList<Generalization> getSpecialization();

    @objid ("f810f4fb-a13c-437d-9cb1-56249dc0e720")
    <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass);

    @objid ("efead869-7823-4ba8-acf2-70dc7385a68e")
    EList<InterfaceRealization> getRealized();

    @objid ("51cd551d-fcee-4653-8168-5163563f6b1d")
    <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass);

    @objid ("15296f79-48f3-4db2-a0a7-57929228e733")
    EList<Instance> getDeclared();

    @objid ("f94d2364-1e12-4b14-b84c-361fafd74a80")
    <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass);

    @objid ("f3b7885c-dd0a-4199-93cd-77aacd844958")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("c6f5d69f-04b0-4446-84f1-1efa4845b89a")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("8a6c6b94-9123-4c48-9fd1-4f2e8d3f9719")
    EList<ElementImport> getOwnedImport();

    @objid ("ca96728f-7753-4bc3-8304-48cc1a8050b0")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("b66284d6-c9c0-4159-8f5d-546cde6c7a48")
    EList<NamespaceUse> getUserNsu();

    @objid ("0f713d7a-d969-4b5f-9a0e-40029b53484c")
    <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass);

}
