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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Enumeration;

/**
 * ModuleParameter v0.0.9054
 * 
 * 
 * Definition of a module parameter.
 */
@objid ("0064e9a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleParameter extends ModelElement {
    @objid ("e43cca28-1d04-4171-b345-11f054f3f50c")
    public static final String MNAME = "ModuleParameter";

    /**
     * Getter for attribute 'ModuleParameter.GroupName'
     * 
     * Metamodel description:
     * <i>Name of the parameter group.
     * 
     * Allow module parameters to be sorted by groups.</i>
     */
    @objid ("7b038edc-08b5-4a7f-b560-62e5f57f6fdf")
    String getGroupName();

    /**
     * Setter for attribute 'ModuleParameter.GroupName'
     * 
     * Metamodel description:
     * <i>Name of the parameter group.
     * 
     * Allow module parameters to be sorted by groups.</i>
     */
    @objid ("b8bd6abf-6eb0-4d41-bfcc-50c74bad0116")
    void setGroupName(String value);

    /**
     * Getter for attribute 'ModuleParameter.Type'
     * 
     * Metamodel description:
     * <i>Type of the parameter. If the type is TYPE_PARAM_ENUM, the 'EnumType' association must refer to an Enumeration.</i>
     */
    @objid ("9a8a6133-a20f-4455-84b6-decfa4f28b94")
    ModuleParameterType getType();

    /**
     * Setter for attribute 'ModuleParameter.Type'
     * 
     * Metamodel description:
     * <i>Type of the parameter. If the type is TYPE_PARAM_ENUM, the 'EnumType' association must refer to an Enumeration.</i>
     */
    @objid ("5a25072f-05dc-4e3c-8350-871fab9b4a6c")
    void setType(ModuleParameterType value);

    /**
     * Getter for attribute 'ModuleParameter.IsUserRead'
     * 
     * Metamodel description:
     * <i>If true, the parameter is visible in the module configuration dialog.</i>
     */
    @objid ("545a2ecd-6890-4dae-95c4-9ed9541842e0")
    boolean isIsUserRead();

    /**
     * Setter for attribute 'ModuleParameter.IsUserRead'
     * 
     * Metamodel description:
     * <i>If true, the parameter is visible in the module configuration dialog.</i>
     */
    @objid ("6115d639-21c7-4a0b-9e8c-0d994df59281")
    void setIsUserRead(boolean value);

    /**
     * Getter for attribute 'ModuleParameter.IsUserWrite'
     * 
     * Metamodel description:
     * <i>If true and IsUserRead is true, the parameter is modifiable in the module configuration dialog.</i>
     */
    @objid ("20b53ad8-6a8b-4415-a893-36ca2030c4d3")
    boolean isIsUserWrite();

    /**
     * Setter for attribute 'ModuleParameter.IsUserWrite'
     * 
     * Metamodel description:
     * <i>If true and IsUserRead is true, the parameter is modifiable in the module configuration dialog.</i>
     */
    @objid ("aa39ae6a-2141-459c-86be-bf2b51d3e26d")
    void setIsUserWrite(boolean value);

    /**
     * Getter for attribute 'ModuleParameter.IsApiRead'
     * 
     * Metamodel description:
     * <i>if true, the parameter can be read with the modules API.</i>
     */
    @objid ("c483b1ee-8255-4192-aec2-0cda4b0e68e8")
    boolean isIsApiRead();

    /**
     * Setter for attribute 'ModuleParameter.IsApiRead'
     * 
     * Metamodel description:
     * <i>if true, the parameter can be read with the modules API.</i>
     */
    @objid ("0d2e0b56-345a-4acd-bbe8-c2686ae7896d")
    void setIsApiRead(boolean value);

    /**
     * Getter for attribute 'ModuleParameter.IsApiWrite'
     * 
     * Metamodel description:
     * <i>if true, the parameter can be set with the modules API.</i>
     */
    @objid ("319f120d-b5f9-4bf1-87ef-8dd08e1c5273")
    boolean isIsApiWrite();

    /**
     * Setter for attribute 'ModuleParameter.IsApiWrite'
     * 
     * Metamodel description:
     * <i>if true, the parameter can be set with the modules API.</i>
     */
    @objid ("26c89f6b-70c7-4aab-a51c-2df88e17ef54")
    void setIsApiWrite(boolean value);

    /**
     * Getter for attribute 'ModuleParameter.DefaultValue'
     * 
     * Metamodel description:
     * <i><p>Default value for the module parameter, written as a string.</p>
     * </i>
     */
    @objid ("e196665a-6f4d-4c9a-a5a7-c122b5e9968a")
    String getDefaultValue();

    /**
     * Setter for attribute 'ModuleParameter.DefaultValue'
     * 
     * Metamodel description:
     * <i><p>Default value for the module parameter, written as a string.</p>
     * </i>
     */
    @objid ("834c81c9-a01c-4375-9dc7-f95622e312f7")
    void setDefaultValue(String value);

    /**
     * Getter for relation 'ModuleParameter->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0132af55-8bf8-4989-9c0c-6e6c5b7ece23")
    ModuleComponent getOwner();

    /**
     * Setter for relation 'ModuleParameter->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3611cd95-e71c-44c9-997e-9ebd2c81cbce")
    void setOwner(ModuleComponent value);

    /**
     * Getter for relation 'ModuleParameter->EnumType'
     * 
     * Metamodel description:
     * <i>Enumeration used by the parameter. when the attribute "Type" is TYPE_PARAM_ENUM.</i>
     */
    @objid ("48826041-93ca-4ecb-89b0-502c6793372d")
    Enumeration getEnumType();

    /**
     * Setter for relation 'ModuleParameter->EnumType'
     * 
     * Metamodel description:
     * <i>Enumeration used by the parameter. when the attribute "Type" is TYPE_PARAM_ENUM.</i>
     */
    @objid ("053cc2da-e62b-4c4b-893e-9bcfba40d599")
    void setEnumType(Enumeration value);

}
