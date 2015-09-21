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


package org.modelio.mda.infra.service.impl.controller.load.parameter;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IModuleUserConfiguration;
import org.modelio.api.module.paramEdition.BoolParameterModel;
import org.modelio.api.module.paramEdition.ColorParameterModel;
import org.modelio.api.module.paramEdition.DirectoryParameterModel;
import org.modelio.api.module.paramEdition.EnumParameterModel;
import org.modelio.api.module.paramEdition.FileParameterModel;
import org.modelio.api.module.paramEdition.IntParameterModel;
import org.modelio.api.module.paramEdition.ParameterGroupModel;
import org.modelio.api.module.paramEdition.ParameterModel;
import org.modelio.api.module.paramEdition.ParametersEditionModel;
import org.modelio.api.module.paramEdition.PasswordParameterModel;
import org.modelio.api.module.paramEdition.StringParameterModel;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Enumeration.Jxbv2Literal;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Parameters.Jxbv2Parameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Parameters;
import org.modelio.mda.infra.service.IRTModule;

@objid ("c1d7ad4d-e946-4b77-aff8-78fecaadb07b")
public class ParameterReader {
    @objid ("37316bd6-97f8-43c4-a5c9-5b766c3ca3d4")
    public void registerParameterModel(Jxbv2Parameters parameters, final IRTModule module) {
        final IModule iModule = module.getIModule();
        final IModuleUserConfiguration conf = iModule.getConfiguration();
        
        ParametersEditionModel pem = new ParametersEditionModel(iModule);
        
        Map<String, ParameterGroupModel> groups = new HashMap<>();
        
        for (Jxbv2Parameter jaxbelement : parameters.getParameter()) {
            String groupName = iModule.getLabel(jaxbelement.getGroup());
            if (groupName.isEmpty()) {
                // Skip parameters having no group
                continue;
            }
        
            String name = jaxbelement.getId();
            String description = iModule.getLabel(jaxbelement.getDescription());
            String label = iModule.getLabel(jaxbelement.getLabel());
            String value = conf.getParameterValue(name);
        
            ParameterModel parameterModel;
            final String type = jaxbelement.getType();
            switch (type != null ? type : "String") {
            case "Boolean":
                parameterModel = new BoolParameterModel(conf, name, label, description, value);
                break;
            case "Color":
                parameterModel = new ColorParameterModel(conf, name, label, description, value);
                break;
            case "Directory":
                parameterModel = new DirectoryParameterModel(conf, name, label, description, value);
                break;
            case "Enum":
                parameterModel = new EnumParameterModel(conf, name, label, description, value);
                if (jaxbelement.getEnumeration() != null) {
                    // Add literals
                    for (Jxbv2Literal literal : jaxbelement.getEnumeration().getLiteral()) {
                        ((EnumParameterModel) parameterModel).addItem(literal.getValue(), iModule.getLabel(literal.getLabel()));
                    }
                }
                break;
            case "File":
                parameterModel = new FileParameterModel(conf, name, label, description, value);
                break;
            case "Integer":
                parameterModel = new IntParameterModel(conf, name, label, description, value);
                break;
            case "Password":
                parameterModel = new PasswordParameterModel(conf, name, label, description, value);
                break;
            case "String":
            default:
                parameterModel = new StringParameterModel(conf, name, label, description, value);
                break;
            }
        
            // Add parameter to its group
            ParameterGroupModel groupModel = groups.get(groupName);
            if (groupModel == null) {
                groupModel = new ParameterGroupModel(groupName, groupName);
                groups.put(groupName, groupModel);
                pem.addGroup(groupModel);
            }
            groupModel.addParameter(parameterModel);
        }
        
        // Init param edition model on module
        iModule.initParametersEditionModel(pem);
    }

}
