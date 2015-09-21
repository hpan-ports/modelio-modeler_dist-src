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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.mda;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.Component;

/**
 * ModuleComponent v0.0.9054
 * 
 * 
 * Module Modelio specific metaclass.
 * 
 * Represents a Modelio module.
 * It inherits from Component, its nearest looking like UML representation.
 */
@objid ("006567e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleComponent extends Component {
    @objid ("3582a187-d839-43d5-af72-6616630ed6d3")
    public static final String MNAME = "ModuleComponent";

    /**
     * Getter for attribute 'ModuleComponent.LicenseKey'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("49d60b79-57f1-4f7e-9990-f2d13d8c5f0d")
    int getLicenseKey();

    /**
     * Setter for attribute 'ModuleComponent.LicenseKey'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bb0e2d68-2b4e-49b4-a76f-920e805155fb")
    void setLicenseKey(int value);

    /**
     * Getter for attribute 'ModuleComponent.MajVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e14eb41-8f1a-4dac-afe9-574d7ca5ea66")
    int getMajVersion();

    /**
     * Setter for attribute 'ModuleComponent.MajVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("603ad250-b66e-4027-af73-db8f7f85af5c")
    void setMajVersion(int value);

    /**
     * Getter for attribute 'ModuleComponent.MinVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("946b6e63-8b6a-41bd-a640-386e201711c8")
    int getMinVersion();

    /**
     * Setter for attribute 'ModuleComponent.MinVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1cd90011-d916-407e-913d-2eed87b214ff")
    void setMinVersion(int value);

    /**
     * Getter for attribute 'ModuleComponent.MinMinVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4fbbf5ad-4cfb-4d81-a657-32b4c9905ee7")
    String getMinMinVersion();

    /**
     * Setter for attribute 'ModuleComponent.MinMinVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4c149960-bb04-4dc2-9d73-84bc8687f019")
    void setMinMinVersion(String value);

    /**
     * Getter for attribute 'ModuleComponent.MinBinVersionCompatibility'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9b7b08ea-6a55-4a7e-95b5-a6e5cfa3b0b2")
    String getMinBinVersionCompatibility();

    /**
     * Setter for attribute 'ModuleComponent.MinBinVersionCompatibility'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("743f4d07-da34-4062-9371-69160088f724")
    void setMinBinVersionCompatibility(String value);

    /**
     * Getter for attribute 'ModuleComponent.JavaClassName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8540b6a6-900c-4850-9c4b-2355486dee71")
    String getJavaClassName();

    /**
     * Setter for attribute 'ModuleComponent.JavaClassName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("33213313-ab3d-4b19-86af-fb3302e6f1dd")
    void setJavaClassName(String value);

    /**
     * Getter for attribute 'ModuleComponent.State'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1910d601-d484-4b3b-b591-2bf73292fe28")
    ModuleState getState();

    /**
     * Setter for attribute 'ModuleComponent.State'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("506f6dd5-0fca-4b2f-8823-27ccc023b98b")
    void setState(ModuleState value);

    /**
     * Getter for relation 'ModuleComponent->DefinedPropertyType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67e744c1-cbd7-4994-90ab-41dfd9f74804")
    EList<PropertyType> getDefinedPropertyType();

    /**
     * Filtered Getter for relation 'ModuleComponent->DefinedPropertyType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("80053ea3-3ca2-44aa-9ed8-23b759c00846")
    <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModuleComponent->OwnedProfile'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7d3a0064-3674-4534-929c-bf18b353dda2")
    EList<Profile> getOwnedProfile();

    /**
     * Filtered Getter for relation 'ModuleComponent->OwnedProfile'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e8f58664-02f8-4016-822a-a4a97ef30a42")
    <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModuleComponent->ModuleParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9fae2874-3fa4-4d37-993d-b2e656c67545")
    EList<ModuleParameter> getModuleParameter();

    /**
     * Filtered Getter for relation 'ModuleComponent->ModuleParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("036b2c08-fe72-4e2c-8785-d6cc103dfec0")
    <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModuleComponent->DependsOn'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7e3c07b3-352d-4201-bab1-22b350dd7712")
    EList<ModuleComponent> getDependsOn();

    /**
     * Filtered Getter for relation 'ModuleComponent->DependsOn'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("65ce3d35-eaf1-4f17-86d4-ec72c6f08777")
    <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModuleComponent->Impacted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("88d94bcc-cd0f-465a-805d-a3887723019d")
    EList<ModuleComponent> getImpacted();

    /**
     * Filtered Getter for relation 'ModuleComponent->Impacted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cd09a106-9594-4f52-bf6a-fdde8fd934d2")
    <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass);

}
