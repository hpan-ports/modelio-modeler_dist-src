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
                                    

package org.modelio.mda.infra.service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.gproject.data.module.JaxbModelPersistence;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Command;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Commands;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2ContextualMenu;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams.Jxbv2DiagramType.Jxbv2Wizard;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams.Jxbv2DiagramType;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Tools;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Views.Jxbv2PropertyPage;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Views;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Tool;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.mda.infra.service.dynamic.command.CommandBuilder;
import org.modelio.mda.infra.service.dynamic.diagram.palette.DiagramToolBuilder;
import org.modelio.mda.infra.service.dynamic.diagram.type.DiagramTypeBuilder;
import org.modelio.mda.infra.service.dynamic.diagram.wizard.DiagramWizardBuilder;
import org.modelio.mda.infra.service.dynamic.menu.ContextualMenuBuilder;
import org.modelio.mda.infra.service.dynamic.property.PropertyPageBuilder;

/**
 * Service class that reads the module.xml file and deserialize its content (basically: commands and diagrams customization).
 * 
 * @author aab
 */
@objid ("1a5e07c3-018d-11e2-9fca-001ec947c8cc")
public class ModuleImporter {
    @objid ("1a5e07cb-018d-11e2-9fca-001ec947c8cc")
    public static void loadDynamicModel(final Path dynamicModelPath, final IRTModule module, final IMModelServices mModelServices) throws IOException {
        final CommandBuilder commandBuilder = new CommandBuilder();
        final ContextualMenuBuilder contextualMenuBuilder = new ContextualMenuBuilder();
        
        final PropertyPageBuilder propertyPagebuilder = new PropertyPageBuilder();
        final DiagramWizardBuilder diagramWizardHelper = new DiagramWizardBuilder();
        final DiagramToolBuilder diagramToolBuilder = new DiagramToolBuilder();
        final DiagramTypeBuilder diagramTypeBuilder = new DiagramTypeBuilder();
        
        // Load xml File into model (JAXB), using the ModuleLoader from core.project plugin
        final Jxbv2Module jaxbModule = JaxbModelPersistence.loadJaxbModel(dynamicModelPath);
        
        class LoadingRunnable implements Runnable {
            IOException error;
        
            @Override
            public void run() {
                this.error = null;
                Map<String, IModuleAction> commandCache = new HashMap<>();
        
                try {
                    Jxbv2Gui gui = jaxbModule.getGui();
                    if (gui == null)
                        return;
        
                    // Jxbv2Commands: module commands
                    final Jxbv2Commands commands = gui.getCommands();
                    if (commands != null) {
                        for (Jxbv2Command cmdDef : commands.getCommand()) {
        
                            IModuleAction action = commandBuilder.createCommand(cmdDef, module);
        
                            // // standard command, described by a handler class.
                            // IModuleAction action = mdafactory.createCommand(cmd, module, mModelServices);
                            commandCache.put(cmdDef.getId(), action);
                        }
                    }
        
                    // Jxbv2ContextualMenu: Module contextual menu contributions
                    Jxbv2ContextualMenu menu = gui.getContextualMenu();
                    if (menu != null) {
                        contextualMenuBuilder.registerContextualMenu(module, menu, commandCache);
                    }
        
                    // Jxbv2PropertyPage: module property pages
                    final Jxbv2Views views = gui.getViews();
                    if (views != null) {
                        for (Jxbv2PropertyPage pp : views.getPropertyPage()) {
                            propertyPagebuilder.registerPropertyPanel(pp, module, commandCache);
                        }
                    }
        
                    // Jxbv2Tools: module diagram tools
                    // The 'class" defined for the tool can be either a keyword (one of Box, Link, MultiLink, AttachedBox) or a
                    // qualified Java class name. Keyword values are used as shortcuts for default implementation of tools.
                    final Jxbv2Tools tools = gui.getTools();
                    if (tools != null) {
                        for (Jxbv2Tool toolDef : tools.getTool()) {
                            // Register the tool
                            diagramToolBuilder.registerTool(toolDef, module);
                        }
                    }
        
                    // Jxbv2Diagrams: module defined diagram types
                    final Jxbv2Diagrams diagrams = gui.getDiagrams();
                    if (diagrams != null) {
                        ContributorCategory wizardCategory = new ContributorCategory(module.getLabel(), module.getLabel(), module.getModuleImage());
                        for (Jxbv2DiagramType diagramDef : diagrams.getDiagramType()) {
                            // Create and Register the diagram type
                            diagramTypeBuilder.registerDiagramType(diagramDef, module);
        
                            // Jxbv2Wizard contribution
                            final Jxbv2Wizard wizardDef = diagramDef.getWizard();
                            if (wizardDef != null) {
                                diagramWizardHelper.registerWizard(module, wizardDef,wizardCategory);
                            }
                        }
                    }
                } catch (IOException e) {
                    // Store the error to throw it later.
                    this.error = e;
                }
            }
        
        }
        
        final LoadingRunnable runnable = new LoadingRunnable();
        Display.getDefault().syncExec(runnable);
        if (runnable.error != null) {
            throw runnable.error;
        }
    }

}
