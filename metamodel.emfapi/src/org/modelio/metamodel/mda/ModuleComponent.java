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
    @objid ("958df359-23fc-44b3-8029-542c31478270")
    int getLicenseKey();

    @objid ("abaca3fb-1b70-4d92-af08-2f0240bd022f")
    void setLicenseKey(int value);

    @objid ("5fc54222-cf4c-4afa-b07a-963175f88d80")
    int getMajVersion();

    @objid ("d40c275f-fbb2-4ed7-9264-64ba8e7c62f4")
    void setMajVersion(int value);

    @objid ("087e28c2-40ea-4074-8dc0-28048ca39e29")
    int getMinVersion();

    @objid ("26988a92-4d47-4e09-9dcd-6e390f5e8c67")
    void setMinVersion(int value);

    @objid ("0c64cb2d-4cc1-4e9f-9371-1d0c88894b91")
    String getMinMinVersion();

    @objid ("96eb2767-bf93-432a-aa69-65a1fe288ef0")
    void setMinMinVersion(String value);

    @objid ("44c477fd-2655-466b-a3f8-ee813cd79028")
    String getMinBinVersionCompatibility();

    @objid ("e62b9b94-2e0b-48b3-bfe7-945a001f3b0f")
    void setMinBinVersionCompatibility(String value);

    @objid ("8325e142-5fa9-4cfa-97ac-8a64753925bc")
    String getJavaClassName();

    @objid ("708b8e79-b615-4944-a246-28f494eb4968")
    void setJavaClassName(String value);

    @objid ("489ffaee-73e4-4c6b-825d-d8aaeb5932ef")
    ModuleState getState();

    @objid ("301cd720-497e-4e2e-a906-fc024a78b793")
    void setState(ModuleState value);

    @objid ("864f4347-ca46-4118-9e58-7ab225fbefd6")
    EList<PropertyType> getDefinedPropertyType();

    @objid ("ce73e353-8f4f-4eee-a087-8eaa03cdc3f6")
    <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass);

    @objid ("d90385c7-677b-4e8f-9dfe-854a5878e327")
    EList<Profile> getOwnedProfile();

    @objid ("e2b3b996-0b9d-4b8b-be0b-28d8a2295c83")
    <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass);

    @objid ("947ab089-b9cf-4fa0-b0f0-833ed6bccf38")
    EList<ModuleParameter> getModuleParameter();

    @objid ("a7ebb509-b4ea-44b0-b68d-0847cd3e692d")
    <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass);

    @objid ("9d3ac775-2ffc-4fa6-9c0a-43429e78653f")
    EList<ModuleComponent> getDependsOn();

    @objid ("f46d81f2-a541-4ce7-ba24-d09d4f861837")
    <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass);

    @objid ("ef55e5af-6d51-478b-a4b4-abc6f8c19753")
    EList<ModuleComponent> getImpacted();

    @objid ("b4aff6e4-f807-442f-aa0c-62dfd023cfb6")
    <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass);

}
