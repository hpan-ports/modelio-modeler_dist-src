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
    @objid ("6f184bb2-52c0-4d85-9a9f-df35dcc6ee73")
    int getLicenseKey();

    @objid ("0842fadc-68c4-4875-9f54-fb2d3f513423")
    void setLicenseKey(int value);

    @objid ("7507f38e-b6fd-4270-b325-8af12dacee85")
    int getMajVersion();

    @objid ("80d12449-d1ec-45c7-a5bb-c8cb2d2664c5")
    void setMajVersion(int value);

    @objid ("906dbe87-726a-4be0-bfd3-81f9a85e3921")
    int getMinVersion();

    @objid ("f8a0b610-b256-42a3-9034-7c185985ee4e")
    void setMinVersion(int value);

    @objid ("c1d94df0-d8cc-4d85-9d03-fa3e8a8c9ab9")
    String getMinMinVersion();

    @objid ("def06829-af59-4592-aaff-edaa90f5253f")
    void setMinMinVersion(String value);

    @objid ("a3da46ee-3f8b-4005-9113-f199beddaeb4")
    String getMinBinVersionCompatibility();

    @objid ("72ffdc41-a9de-4c78-981f-da95e66280df")
    void setMinBinVersionCompatibility(String value);

    @objid ("f3c85df6-88df-4d1c-9e91-66eadc073296")
    String getJavaClassName();

    @objid ("a8a9d373-bd98-450c-ae20-28ad9aba6a32")
    void setJavaClassName(String value);

    @objid ("0c7f3087-9fbf-4886-840d-a6e59ba0fdb3")
    ModuleState getState();

    @objid ("539605a3-66f2-44dd-84da-36c152baf134")
    void setState(ModuleState value);

    @objid ("77832fb5-0af0-4048-a424-9edf624d960e")
    EList<PropertyType> getDefinedPropertyType();

    @objid ("f26f94d5-05e2-4932-9b72-9cbd72eebe23")
    <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass);

    @objid ("f867f685-4c29-418b-8e35-b0b960dbfd88")
    EList<Profile> getOwnedProfile();

    @objid ("fe17dfe5-8d16-4928-bdeb-e64a553b7144")
    <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass);

    @objid ("cd8ac5ac-2c3c-481f-9ee3-796689ffc5e7")
    EList<ModuleParameter> getModuleParameter();

    @objid ("79eb9c8d-f356-4eb4-8f87-ac85ed1ad0db")
    <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass);

    @objid ("e9fb2680-19b0-48ef-a0ad-1553f924a18d")
    EList<ModuleComponent> getDependsOn();

    @objid ("ca8cd6d3-f65f-4b83-8b7f-73b90ee13995")
    <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass);

    @objid ("f8bd230b-1836-4b0d-8806-f79663de5b7b")
    EList<ModuleComponent> getImpacted();

    @objid ("00f0262b-a9b6-4f51-9c0c-98452c540d9d")
    <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass);

}
