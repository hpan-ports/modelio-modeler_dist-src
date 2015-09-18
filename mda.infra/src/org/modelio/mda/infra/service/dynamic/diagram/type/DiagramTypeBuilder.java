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
                                    

package org.modelio.mda.infra.service.dynamic.diagram.type;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.DefaultDiagramCustomizer;
import org.modelio.api.diagram.IDiagramCustomizer;
import org.modelio.api.diagram.tools.PaletteEntry;
import org.modelio.api.modelio.Modelio;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler.Jxbv2HParameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams.Jxbv2DiagramType.Jxbv2Palette;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams.Jxbv2DiagramType;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2ToolRef;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("dcb4fee2-359b-4143-9995-7afa4077a462")
public class DiagramTypeBuilder {
    @objid ("e9b6b654-ea63-47c6-be76-983e9d1d4ddc")
    public void registerDiagramType(Jxbv2DiagramType diagramDef, IRTModule module) {
        IDiagramCustomizer customizer = null;
        try {
            customizer = instantiateCustomizer(diagramDef.getHandler(), module);
        
            // Collect palette tool contributions
            List<PaletteEntry> tools = new ArrayList<>();
            boolean keepBasePalette = true;
            Jxbv2Palette palette = diagramDef.getPalette();
            if (palette != null) {
                keepBasePalette = palette.isKeepBasePalette();
                // Jxbv2Commands
                for (Jxbv2ToolRef toolref : palette.getToolRef()) {
                    String group = toolref.getGroup();
                    tools.add(new PaletteEntry(toolref.getRefid(), group));
                }
            }
        
            // Collect hParameters
            Map<String, String> hParameters = new HashMap<>();
            for (Jxbv2HParameter param : diagramDef.getHandler().getHParameter()) {
                hParameters.put(param.getName(), param.getValue());
            }
        
            // Initialize the customizer
            customizer.initialize(module.getIModule(), tools, hParameters, keepBasePalette);
        
            // Register the diagram type
            MClass baseDiagramClass = null;
            if (diagramDef.getBaseDiagram() != null) {
                baseDiagramClass = Metamodel.getMClass(diagramDef.getBaseDiagram());
            } else {
                baseDiagramClass = Metamodel.getMClass(AbstractDiagram.class);
            }
        
            Stereotype stereotypeClass = null;
            if (diagramDef.getStereotype() != null) {
                stereotypeClass = getStereotype(baseDiagramClass, diagramDef.getStereotype());
            }
        
            // stereotypeClass CANNOT be null
            if (stereotypeClass == null) {
                MdaInfra.LOG.error("Invalid or unknown stereotype: %s %s", baseDiagramClass.getName(), diagramDef.getStereotype());
            } else {
                module.registerDiagramCustomization(stereotypeClass, (Class<? extends AbstractDiagram>) Metamodel.getJavaInterface(baseDiagramClass), customizer);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            MdaInfra.LOG.error(e);
            e.printStackTrace();
            return;
        }
    }

    @objid ("cbcaefbe-be5f-471b-b4df-67a7aa53ac36")
    private Stereotype getStereotype(MClass metaclass, String stereotype) {
        return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, metaclass);
    }

    @objid ("c51a66ac-325f-43a6-b749-f3d01a547d3c")
    private IDiagramCustomizer instantiateCustomizer(Jxbv2Handler handler, IRTModule module) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        IDiagramCustomizer customizer;
        
        switch (handler.getClazz()) {
        case "StandardCustomizer":
            customizer = new DefaultDiagramCustomizer();
            break;
        default:
            // Custom handler provided by module
            ClassLoader loader = module.getIModule().getClass().getClassLoader();
            Class<?> handlerClass = loader.loadClass(handler.getClazz());
            customizer = (IDiagramCustomizer) handlerClass.newInstance();
            break;
        }
        return customizer;
    }

}
