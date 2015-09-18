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
                                    

package org.modelio.mda.infra.service.dynamic.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.module.commands.DefaultModuleAction;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.api.module.commands.IModuleCommandHandler;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Command;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler.Jxbv2HParameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Scope;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("1086a98b-242a-48ba-9d79-ed2b587cdc6e")
public class CommandBuilder {
    @objid ("8bb0ee0d-0240-4df8-bc42-ee7cb6f88806")
    public IModuleAction createCommand(Jxbv2Command commandDef, IRTModule module) throws IOException {
        // Create the handler
        IModuleCommandHandler handler = createHandler(commandDef, module);
        
        // Collect applicable scopes
        List<CommandScope> scopes = new ArrayList<>();
        for (Jxbv2Scope scope : commandDef.getScope()) {
            MClass mClass = Metamodel.getMClass(scope.getMetaclass());
            if (mClass != null) {
                Stereotype st = getStereotype(mClass, scope.getStereotype());
                scopes.add(new CommandScope(mClass, st));
            }
        }
        
        // Collect hParameters
        Map<String, String> hParameters = new HashMap<>();
        for (Jxbv2HParameter param : commandDef.getHandler().getHParameter()) {
            hParameters.put(param.getName(), param.getValue());
        }
        
        // Initialize the handler
        handler.initialize(scopes, hParameters);
        
        // Last, create the module action
        // Instantiate a IModuleAction wrapping this handler so it can be used
        // with the platform mechanisms.
        
        String name = module.getLabel(commandDef.getId());
        String label = module.getLabel(commandDef.getLabel());
        String bitmap = module.getLabel(commandDef.getImage());
        String tooltype = module.getLabel(commandDef.getTooltip());
        String group = module.getLabel(commandDef.getGroup());
        String imageGroup = module.getLabel(commandDef.getGroupImage());
        
        boolean editionMode = commandDef.getModifyModel() == null && commandDef.getModifyModel().equals("true");
        
        IModuleAction action = new DefaultModuleAction(module.getIModule(), name, label, tooltype, bitmap, group, imageGroup, editionMode, editionMode, handler);
        return action;
    }

    @objid ("00b526c3-6737-4dcc-9693-ff7fc6fc33c4")
    private IModuleCommandHandler createHandler(Jxbv2Command cmd, IRTModule module) throws IOException {
        assert (cmd != null);
        assert (cmd.getHandler() != null);
        switch (cmd.getHandler().getClazz()) {
        case "GenericElementCreationHandler": // Old modelio < 3.3 value
        case "ElementCreate": // Modelio >= 3.3 value
            return createElementCreationHandler(cmd, module);
        case "GenericDiagramCreationHandler": // Old modelio < 3.3 value
        case "DiagramCreate": // Modelio >= 3.3 value
            return createDiagramCreationHandler(cmd, module);
        default:
            return createCustomHandler(cmd, module);
        }
    }

    @objid ("b5ba048a-4ad4-45dd-bdea-664263b86255")
    private IModuleCommandHandler createDiagramCreationHandler(Jxbv2Command commandDef, IRTModule module) {
        // Generic diagram creation command, collect params
        String metaclass = null;
        String stereotype = null;
        String relation = null;
        String style = null;
        String name = null;
        boolean open = false;
        for (Jxbv2HParameter param : commandDef.getHandler().getHParameter()) {
            switch (param.getName()) {
            case "metaclass":
                metaclass = param.getValue();
                break;
            case "stereotype":
                stereotype = param.getValue();
                break;
            case "relation":
                relation = param.getValue();
                break;
            case "style":
                style = param.getValue();
                break;
            case "open":
                open = "true".equals(param.getValue());
                break;
            case "name":
                name = param.getValue();
                break;
            default:
                continue;
            }
        }
        
        if (name == null) {
            name = module.getLabel(commandDef.getId());
        }
        // Instantiate generic handler
        return new GenericDiagramCreationCommandHandler(name, metaclass, stereotype, relation, style, open);
    }

    @objid ("32918cd1-97b8-4fcf-87f5-c8430ca070a3")
    private IModuleCommandHandler createElementCreationHandler(Jxbv2Command commandDef, IRTModule module) {
        // Generic element creation command, collect params
        String metaclass = null;
        String stereotype = null;
        String relation = null;
        String name = null;
        for (Jxbv2HParameter param : commandDef.getHandler().getHParameter()) {
            switch (param.getName()) {
            case "metaclass":
                metaclass = param.getValue();
                break;
            case "stereotype":
                stereotype = param.getValue();
                break;
            case "relation":
                relation = param.getValue();
                break;
            case "name":
                name = param.getValue();
                break;
            default:
                continue;
            }
        }
        
        if (name == null) {
            name = module.getLabel(commandDef.getId());
        }
        
        // Instantiate generic handler
        return new GenericElementCreationCommandHandler(name, metaclass, stereotype, relation);
    }

    @objid ("1c131cc3-c2c9-4b55-b434-168e34c17f0e")
    private IModuleCommandHandler createCustomHandler(Jxbv2Command commandDef, IRTModule module) throws IOException {
        IModuleCommandHandler handler;
        try {
            // Load and instantiate the handler class in the same class loader
            // as the module.
            ClassLoader loader = module.getIModule().getClass().getClassLoader();
            Class<?> handlerClass = loader.loadClass(commandDef.getHandler().getClazz());
            handler = (IModuleCommandHandler) handlerClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new IOException(MdaInfra.I18N.getMessage("Invalid or unreachable handler class", commandDef.getHandler().getClazz()));
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
        return handler;
    }

    @objid ("abbde73c-11d9-4020-a1af-fdf200469d86")
    private Stereotype getStereotype(MClass metaclass, String stereotype) {
        if (stereotype == null)
            return null;
        if (stereotype.contains("#")) {
            String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, metaclass);
        } else {
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, metaclass);
        }
    }

}
