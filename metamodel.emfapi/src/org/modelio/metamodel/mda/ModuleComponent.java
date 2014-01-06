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
package org.modelio.metamodel.mda;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.statik.Component;

@objid ("006567e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleComponent extends Component {
    @objid ("c90e255d-1dce-4431-9cec-9c975f17a893")
    int getLicenseKey();

    @objid ("eadfcf0f-5936-4421-b00e-4be0bc7c35b9")
    void setLicenseKey(int value);

    @objid ("77fcdd63-f0e0-457b-a194-332b885841ff")
    int getMajVersion();

    @objid ("60069e1d-112b-4270-894d-7a091bce5013")
    void setMajVersion(int value);

    @objid ("f1576824-9d54-4133-899d-973d52e1c41b")
    int getMinVersion();

    @objid ("77215840-0b00-49fe-bb0e-9ab77dc99d92")
    void setMinVersion(int value);

    @objid ("bc28573c-1c24-4e64-9f73-fa3f2d7106f2")
    String getMinMinVersion();

    @objid ("84783b37-7c43-4860-9759-18de3f8688bf")
    void setMinMinVersion(String value);

    @objid ("a4ebf86f-5182-4faf-ab4b-b8d8eaf5cb86")
    String getMinBinVersionCompatibility();

    @objid ("449aee0a-bb71-4c81-93a7-9ee1a59906bc")
    void setMinBinVersionCompatibility(String value);

    @objid ("fc1cbfeb-b4c0-4178-8839-e482ac7de6e1")
    String getJavaClassName();

    @objid ("d561e821-c37d-45e5-a199-5e23ba75d0d5")
    void setJavaClassName(String value);

    @objid ("4fabe7ec-65d7-42df-8b62-8afd78dd7833")
    ModuleState getState();

    @objid ("1136a17f-3c06-455d-8b39-5da52a76bdc2")
    void setState(ModuleState value);

    @objid ("aad0cc2d-3222-43b4-8cc7-0e4bf1ae0992")
    EList<PropertyType> getDefinedPropertyType();

    @objid ("6fe4b48c-6631-49d8-a702-8c39ba33e1d9")
    <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass);

    @objid ("93c2b816-b3ea-493a-85f1-4b1ae16375df")
    EList<Profile> getOwnedProfile();

    @objid ("90061ae1-336c-46df-ab8f-79a281a21f11")
    <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass);

    @objid ("72f9143e-e480-45ea-9103-b5cccbe858b6")
    EList<ModuleParameter> getModuleParameter();

    @objid ("9304d761-ee49-4463-ba9e-00240d761e65")
    <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass);

    @objid ("be0caf3d-278c-49d6-abaa-703c6c79a142")
    EList<ModuleComponent> getDependsOn();

    @objid ("8eef6558-2b68-4904-9757-f79b37281a8e")
    <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass);

    @objid ("a8d79c73-5d96-4e46-8165-1af6c75fd150")
    EList<ModuleComponent> getImpacted();

    @objid ("d8f795f2-39e9-45c2-b029-738b2751a413")
    <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass);

}
