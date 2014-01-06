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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.module.JaxbModelPersistence;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.Command;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.ElementCreationCommand;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui.PropertyPage;
import org.modelio.gproject.module.jaxbmodel.JxbModule.Gui;
import org.modelio.gproject.module.jaxbmodel.JxbModule;
import org.modelio.mda.infra.service.dynamic.DynamicGuiCreationHelper;

/**
 * Service class that reads the module.xml file and deserialise its content (basically: commands and diagrams
 * customization).
 * 
 * @author aab
 */
@objid ("1a5e07c3-018d-11e2-9fca-001ec947c8cc")
public class ModuleImporter {
    @objid ("1a5e07cb-018d-11e2-9fca-001ec947c8cc")
    public static void loadDynamicModel(final Path dynamicModelPath, final IModule module, final IMModelServices mModelServices) throws IOException {
        final DynamicGuiCreationHelper mdafactory = new DynamicGuiCreationHelper(module.getConfiguration().getModuleResourcesPath().toFile());
        
        // Load xml File into model (JAXB), using the ModuleLoader from core.project plugin
        final JxbModule jaxbModule = JaxbModelPersistence.loadJaxbModel(dynamicModelPath);
        
        class LoadingRunnable implements Runnable {
            IOException error;
        
            @Override
            public void run() {
                this.error = null;
                try {
                    for (Object child : jaxbModule.getParameterOrProfileOrGui()) {
                        if (child instanceof Gui) {
                            JxbModule.Gui gui = (Gui) child;
                            for (Object guiChild : gui.getPropertyPageOrCommandOrElementCreationCommand()) {
                                if (guiChild instanceof Gui.Command) {
                                    // standard command, described by a handler class.
                                    mdafactory.registerStandardCommand((Command) guiChild, module, mModelServices);
                                } else if (guiChild instanceof ElementCreationCommand) {
                                    // Basic element creation command, only described by the metaclass and stereotype of the element to create.
                                    // This will register a default generic implementation of .
                                    mdafactory.registerDefaultElementCreationCommand((ElementCreationCommand) guiChild, module, mModelServices);
                                }
                                // handle customized diagrams
                                else if (guiChild instanceof JxbModule.Gui.CustomizedDiagram) {
                                    mdafactory.registerPalette((JxbModule.Gui.CustomizedDiagram) guiChild, module);
                                }
                                //handle property page
                                else if (guiChild instanceof PropertyPage) {
                                    mdafactory.registerPropertyPage((PropertyPage) guiChild, module);
                                }
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
