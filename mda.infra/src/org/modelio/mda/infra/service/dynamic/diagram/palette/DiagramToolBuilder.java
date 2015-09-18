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
                                    

package org.modelio.mda.infra.service.dynamic.diagram.palette;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.diagram.tools.IDiagramTool;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler.Jxbv2HParameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Scope;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Tool;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("086d1801-6e1a-4f12-b509-4a37501cd671")
public class DiagramToolBuilder {
    @objid ("9dd9ff5c-65cc-4f0f-9dcc-d66009c848e0")
    public void registerTool(Jxbv2Tool toolDef, IRTModule module) {
        // Load and instantiate the handler class in the same class loader as
        // the module.
        try {
            Object instance = null;
        
            // Interpret special shortcuts for standard tools
            switch (toolDef.getHandler().getClazz()) {
            case "Box":
                instance = new GenericBoxTool();
                break;
            case "Link":
                instance = new GenericLinkTool();
                break;
            case "MultiLink":
                instance = new GenericMultiLinkTool();
                break;
            case "AttachedBox":
                instance = new GenericAttachedBoxTool();
                break;
            default:
                // Custom handler provided by module
                ClassLoader loader = module.getIModule().getClass().getClassLoader();
                Class<?> handlerClass = loader.loadClass(toolDef.getHandler().getClazz());
                instance = handlerClass.newInstance();
                break;
            }
        
            // Check what we finally got for handler
            if (!(instance instanceof IDiagramTool)) {
                throw new IOException(MdaInfra.I18N.getMessage("L43_class_is_not_IDiagramTool", toolDef.getHandler().getClazz()));
            }
        
            // Process command addition
            IDiagramTool diagramTool = (IDiagramTool) instance;
        
            // Decorate: label, icon, tooltip
            String label = module.getLabel(toolDef.getLabel());
            String tooltip = module.getLabel(toolDef.getTooltip());
            ImageDescriptor image = null;
            if (toolDef.getImage() != null && !toolDef.getImage().equals("")) {
                String bitmap = module.getConfiguration().getModuleResourcesPath() + "/" + module.getLabel(toolDef.getImage());
                image = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(), bitmap));
            }
        
            diagramTool.decorate(label, tooltip, image);
        
            // Collect hParameters
            Map<String, String> hParameters = new HashMap<>();
            for (Jxbv2HParameter param : toolDef.getHandler().getHParameter()) {
                hParameters.put(param.getName(), param.getValue());
            }
            // diagramTool.setParameters(hParameters);
        
            // Collect applicable scopes
            List<CommandScope> sourceScopes = new ArrayList<>();
            for (Jxbv2Scope scope : toolDef.getScopeSource()) {
        
                MClass mClass = Metamodel.getMClass(scope.getMetaclass());
                if (mClass != null) {
                    Stereotype st = getStereotype(mClass, scope.getStereotype());
                    sourceScopes.add(new CommandScope(mClass, st));
                }
        
            }
        
            List<CommandScope> targetScopes = new ArrayList<>();
            for (Jxbv2Scope scope : toolDef.getScopeTarget()) {
        
                MClass mClass = Metamodel.getMClass(scope.getMetaclass());
                if (mClass != null) {
                    Stereotype st = getStereotype(mClass, scope.getStereotype());
                    targetScopes.add(new CommandScope(mClass, st));
                }
        
            }
        
            diagramTool.initialize(sourceScopes, targetScopes, hParameters,module.getIModule());
        
            // Register command
            module.registerCustomizedTool(toolDef.getId(), diagramTool);
        
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e) {
            MdaInfra.LOG.error(e);
            e.printStackTrace();
        }
    }

    @objid ("d9fc6df4-1ede-4f9e-9a04-d25fb63d1f12")
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
