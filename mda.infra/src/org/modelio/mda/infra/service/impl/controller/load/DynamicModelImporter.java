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


package org.modelio.mda.infra.service.impl.controller.load;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
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
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Parameters;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Tool;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.contributions.IDynamicModelLoader;
import org.modelio.mda.infra.service.impl.IRTModuleAccess;
import org.modelio.mda.infra.service.impl.controller.load.command.CommandReader;
import org.modelio.mda.infra.service.impl.controller.load.diagram.palette.DiagramToolReader;
import org.modelio.mda.infra.service.impl.controller.load.diagram.type.DiagramTypeReader;
import org.modelio.mda.infra.service.impl.controller.load.diagram.wizard.DiagramWizardReader;
import org.modelio.mda.infra.service.impl.controller.load.menu.ContextualMenuReader;
import org.modelio.mda.infra.service.impl.controller.load.parameter.ParameterReader;
import org.modelio.mda.infra.service.impl.controller.load.property.PropertyPageReader;

/**
 * Service class that reads the module.xml file and deserialize its content
 * (basically: commands and diagrams customization).
 * <p>
 * Since Modelio 3.4 can delegate to extension points.
 */
@objid ("1a5e07c3-018d-11e2-9fca-001ec947c8cc")
public class DynamicModelImporter {
    @objid ("6300cb30-0a58-473e-9c3b-1f9d29188135")
    private static final String EXTENSION_POINT_ID = "org.modelio.mda.infra.dynamicmodel";

    @objid ("5a5479cc-c4f0-4e40-baac-c7fcb476890f")
    private final IRTModuleAccess module;

    @objid ("f13a1f3d-59b9-477b-8899-f18559c4c60d")
    private List<IDynamicModelLoader> loaders = new ArrayList<>();

    /**
     * Load the dynamic GUI model of a module from its path.
     * <p>
     * Relies on several 'reader' classes:
     * <ul>
     * <li>{@link CommandReader} for command definitions.</li>
     * <li>{@link ContextualMenuReader} for contextual menu configuration.</li>
     * <li>{@link PropertyPageReader} for module view.</li>
     * <li>{@link DiagramToolReader} for diagram tool registering.</li>
     * <li>{@link DiagramTypeReader} for diagram definitions.</li>
     * <li>{@link DiagramWizardReader} for diagram contributions to the creation wizard.</li>
     * <li>{@link ParameterReader} for parameter edition model.</li>
     * <li>{@link MatrixTypeReader} for matrix definitions.</li>
     * <li>{@link MatrixWizardReader} for matrix contributions to the creation  wizard.</li>
     * </ul>
     * </p>
     * @param dynamicModelPath the xml file to load.
     * @throws java.io.IOException when an error occurs during the parsing.
     */
    @objid ("1a5e07cb-018d-11e2-9fca-001ec947c8cc")
    public void loadDynamicModel(final Path dynamicModelPath) throws IOException {
        // Load xml File into model (JAXB), using the ModuleLoader from core.project plugin
        final Jxbv2Module jaxbModule = JaxbModelPersistence.loadJaxbModel(dynamicModelPath);
        
        class LoadingRunnable implements Runnable {
            IOException error;
        
            @Override
            public void run() {
                this.error = null;
                Map<String, IModuleAction> commandCache = new HashMap<>();
        
                final CommandReader commandReader = new CommandReader();
                final ContextualMenuReader contextualMenuReader = new ContextualMenuReader();
                final PropertyPageReader propertyPageReader = new PropertyPageReader();
                final DiagramWizardReader diagramWizardHelper = new DiagramWizardReader();
                final DiagramToolReader diagramToolReader = new DiagramToolReader();
                final DiagramTypeReader diagramTypeReader = new DiagramTypeReader();
                final ParameterReader parameterReader = new ParameterReader();
        
                try {
                    final Jxbv2Parameters parameters = jaxbModule.getParameters();
                    IRTModuleAccess lmodule = DynamicModelImporter.this.module;
                    if (parameters != null) {
                        parameterReader.registerParameterModel(parameters, lmodule);
                    }
        
                    Jxbv2Gui gui = jaxbModule.getGui();
                    if (gui == null) {
                        return;
                    }
        
                    // Jxbv2Commands: module commands
                    final Jxbv2Commands commands = gui.getCommands();
                    if (commands != null) {
                        for (Jxbv2Command cmdDef : commands.getCommand()) {
                            // standard command, described by a handler class.
                            IModuleAction action = commandReader.createCommand(cmdDef, lmodule);
                            commandCache.put(cmdDef.getId(), action);
                        }
                    }
        
                    // Jxbv2ContextualMenu: Module contextual menu contributions
                    for (Jxbv2ContextualMenu menu : gui.getContextualMenu()) {
                        contextualMenuReader.registerContextualMenu(lmodule, menu, commandCache);
                    }
        
                    // Jxbv2PropertyPage: module property pages
                    final Jxbv2Views views = gui.getViews();
                    if (views != null) {
                        for (Jxbv2PropertyPage pp : views.getPropertyPage()) {
                            propertyPageReader.registerPropertyPanel(pp, lmodule, commandCache);
                        }
                    }
        
                    // Jxbv2Tools: module diagram tools
                    // The 'class" defined for the tool can be either a keyword (one of Box, Link, MultiLink, AttachedBox) or a
                    // qualified Java class name. Keyword values are used as shortcuts for default implementation of tools.
                    final Jxbv2Tools tools = gui.getTools();
                    if (tools != null) {
                        for (Jxbv2Tool toolDef : tools.getTool()) {
                            // Register the tool
                            diagramToolReader.registerTool(toolDef, lmodule);
                        }
                    }
        
                    // Jxbv2Diagrams: module defined diagram types
                    final Jxbv2Diagrams diagrams = gui.getDiagrams();
                    if (diagrams != null) {
                        ContributorCategory wizardCategory = new ContributorCategory(lmodule.getLabel(), lmodule.getLabel(), lmodule.getModuleImage());
                        for (Jxbv2DiagramType diagramDef : diagrams.getDiagramType()) {
                            // Create and Register the diagram type
                            diagramTypeReader.registerDiagramType(diagramDef, lmodule);
        
                            // Jxbv2Wizard contribution
                            final Jxbv2Wizard wizardDef = diagramDef.getWizard();
                            if (wizardDef != null) {
                                diagramWizardHelper.registerWizard(lmodule, wizardDef,wizardCategory);
                            }
                        }
                    }
        
                    // call dynamic loaders
                    for (IDynamicModelLoader loader : DynamicModelImporter.this.loaders) {
                        loader.loadDynamicModel(lmodule, gui);
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

    /**
     * @param module the module to build GUI elements for.
     */
    @objid ("9c6d98a8-9ff5-4876-8745-9b0604586e20")
    public DynamicModelImporter(IRTModuleAccess module) {
        this.module = module;
        
        // Load all dynamic loaders from extension registry.
        IExtensionRegistry reg = Platform.getExtensionRegistry();
        for (IConfigurationElement configEl : reg.getConfigurationElementsFor(EXTENSION_POINT_ID)) {
            if (configEl.getName().equals("loader")){
                try {
                    IDynamicModelLoader loader = (IDynamicModelLoader) configEl.createExecutableExtension("class");
                    this.loaders.add(loader);
                } catch (CoreException e) {
                    MdaInfra.LOG.warning(e);
                }
            }
        }
    }

}
