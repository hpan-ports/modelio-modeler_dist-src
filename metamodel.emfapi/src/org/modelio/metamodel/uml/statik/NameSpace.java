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
    @objid ("67177f66-6389-4cb5-acc1-1d95f7f6106f")
    boolean isIsAbstract();

    @objid ("047ffe4b-898f-4a74-a4b7-e42102abb792")
    void setIsAbstract(boolean value);

    @objid ("b941cf1d-1b43-4f5b-b5c1-e84630666ef1")
    boolean isIsLeaf();

    @objid ("50743492-f520-43f6-b4d5-f3b5086722b8")
    void setIsLeaf(boolean value);

    @objid ("c0e2df9c-14e4-4978-b747-85075b84f715")
    boolean isIsRoot();

    @objid ("5709e61a-e834-459a-a90d-1115aa7f8cb5")
    void setIsRoot(boolean value);

    @objid ("78bf586b-83ca-4b63-b440-7239657bebe3")
    VisibilityMode getVisibility();

    @objid ("b983a9b5-3df8-4ffa-9ed1-c0edae071cb5")
    void setVisibility(VisibilityMode value);

    @objid ("fa77fd62-6319-4be1-99db-d2460f34e4e1")
    EList<Generalization> getParent();

    @objid ("6eb0c1d6-fb35-419f-b893-2d7aa0cc9d77")
    <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass);

    @objid ("ceda7a86-7c0a-44b6-bff4-f129219d8459")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("c10a33bd-4759-425d-8989-58940278bd01")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("93ac1f24-4937-4745-a228-9bc15a43e21b")
    EList<Instance> getRepresenting();

    @objid ("eea09093-588a-4f82-b8d7-eadec82d7ac1")
    <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass);

    @objid ("e659eecb-4b77-4b68-9fa8-ef3519e5f7d6")
    EList<Behavior> getOwnedBehavior();

    @objid ("a5385eea-fc88-4ab4-a09f-f29f3254931a")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("88c0a45c-95cb-4b83-90d5-60a809965383")
    EList<DataFlow> getReceived();

    @objid ("b3a0cca8-ae4a-46ef-94ae-52507e03ff92")
    <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass);

    @objid ("ed3f7624-7792-4e11-aeee-0b1351bb566d")
    EList<NamespaceUse> getUsedNsu();

    @objid ("c5fd1ebd-491b-43d3-807e-8cee90913686")
    <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass);

    @objid ("4ebab6cc-0998-4e6a-96d3-346ec2f67a6a")
    EList<InformationFlow> getOwnedInformationFlow();

    @objid ("677189eb-41a7-4370-bbba-6d02c911b5a3")
    <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("7882db15-35a0-48d9-8824-8637c3dbd15f")
    EList<ElementImport> getImporting();

    @objid ("1c5bd274-f6d9-4cd5-8d64-bafa597c4cad")
    <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass);

    @objid ("32a6b634-5335-4947-acb4-0e1fdbe464b7")
    EList<DataFlow> getSent();

    @objid ("cfb62c95-d34e-4796-be75-b955380416fe")
    <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("58655b33-1d8d-4a99-ada4-651ea38b7f5d")
    EList<DataFlow> getOwnedDataFlow();

    @objid ("c4978da6-32f4-4565-a559-c843a63665d7")
    <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass);

    @objid ("f2e8995a-c38b-4c3f-8dc6-d98548238845")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("52b2fb07-2e87-4964-8204-20e418de27cf")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("c9fd33cc-61da-4578-92a1-fe67f27e8a76")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("50d8d4bd-5957-4e7c-a451-def1dffe1e64")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("4640de7a-2689-4a91-a5a5-f474733f3ce9")
    EList<TemplateParameter> getTemplate();

    @objid ("26433ae3-628c-4360-9639-7982a9bdaa03")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("938abc20-40f8-4570-b476-8a523e31fdb6")
    EList<Generalization> getSpecialization();

    @objid ("53b18ca7-ca81-4880-a9f6-cd47eb8b4e46")
    <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass);

    @objid ("d3d04a46-285f-410a-847e-b3a05ff0135c")
    EList<InterfaceRealization> getRealized();

    @objid ("bdd3e3fe-bb6e-4818-b6e5-0236228e8567")
    <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass);

    @objid ("2293808e-5e89-4b6c-a0f4-0eafdb6e6c1e")
    EList<Instance> getDeclared();

    @objid ("0b06c30e-b266-4d3d-8150-6a3c34785066")
    <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass);

    @objid ("9afd1d8f-52e7-4e82-bbfe-9cb1ce2e5e3e")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("cf12ec5b-a8a5-4662-b52f-fd3d637c0568")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("5f5572fc-1f59-4a5a-b93f-96d6c9f3e2c1")
    EList<ElementImport> getOwnedImport();

    @objid ("87009b1c-70e8-4105-a0ba-d81f46410c47")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("131db884-6ff0-4a7c-a460-2de0c6a74e87")
    EList<NamespaceUse> getUserNsu();

    @objid ("4596e046-8645-4d81-8067-bac57adaed9c")
    <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass);

}
