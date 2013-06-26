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
                                    

package org.modelio.diagram.styles.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.gproject.gproject.GProject;
import org.osgi.framework.Bundle;

@objid ("12c16440-19f0-11e2-92d2-001ec947c8cc")
public class DiagramStylesProcessor {
    @objid ("12c3c691-19f0-11e2-92d2-001ec947c8cc")
    @Execute
    static void execute(IEclipseContext context) {
        // Create instance and put it in the context so it can listen to project open/close events.
        context.set(DiagramStylesProcessor.class, ContextInjectionFactory.make(DiagramStylesProcessor.class, context));
    }

    @objid ("12c628eb-19f0-11e2-92d2-001ec947c8cc")
    @Inject
    @Optional
    void onProjectOpened(@EventTopic(ModelioEventTopics.PROJECT_OPENING) final GProject openedProject) {
        // Ensure that the project style dir is initialized and that a default style exists in it
        checkProjectStyleDirectory(openedProject.getProjectDataPath());
        
        // Load styles
        DiagramStyles.getStyleManager().reloadStylesIn(openedProject.getProjectDataPath().resolve(DiagramStyles.PROJECT_STYLE_SUBDIR));
    }

    @objid ("12c628f1-19f0-11e2-92d2-001ec947c8cc")
    private static void checkProjectStyleDirectory(Path projectPath) {
        // ensure the existence of the project style directory and create it if needed.
        Path projectStyleDir = projectPath.resolve(DiagramStyles.PROJECT_STYLE_SUBDIR);
        if (!Files.exists(projectStyleDir)) {
            try {
                Files.createDirectories(projectStyleDir);
            } catch (IOException e) {
                DiagramStyles.LOG.error(e);
            }
        }
        
        // ensure the existence of the default.style file
        String defaultFileName = DiagramStyles.DEFAULT_STYLE_NAME + DiagramStyles.STYLE_FILE_EXTENSION;
        Path defaultStyleFile = projectStyleDir.resolve(defaultFileName);
        if (!Files.exists(defaultStyleFile)) {
            copyStyleFileTo(defaultFileName, defaultStyleFile);
        }
        
        // ensure the existence of the ramc.style file
        String ramcFileName = DiagramStyles.RAMC_STYLE_NAME + DiagramStyles.STYLE_FILE_EXTENSION;
        Path ramcStyleFile = projectStyleDir.resolve(ramcFileName);
        if (!Files.exists(ramcStyleFile)) {
            copyStyleFileTo(ramcFileName, ramcStyleFile);
        }
        
        // ensure the existence of the usecase.style file
        String usecaseFileName = DiagramStyles.USECASE_STYLE_NAME + DiagramStyles.STYLE_FILE_EXTENSION;
        Path usecaseStyleFile = projectStyleDir.resolve(usecaseFileName);
        if (!Files.exists(usecaseStyleFile)) {
            copyStyleFileTo(usecaseFileName, usecaseStyleFile);
        }
    }

    @objid ("12c628f4-19f0-11e2-92d2-001ec947c8cc")
    private static void copyStyleFileTo(String fileName, final Path targetPath) {
        // Find the default style file in the plugin resources.
        Bundle bundle = DiagramStyles.getContext().getBundle();
        String s = "platform:/plugin/"+bundle.getSymbolicName()+"/"+"res/" + fileName;
        URL sourceFileUrl = null;
        try {
            sourceFileUrl = new URL(s);
            try (InputStream inputStream = sourceFileUrl.openConnection().getInputStream();) {               
                Files.copy(inputStream, targetPath); // copy to project style directory
            } catch (IOException e1) {
                DiagramStyles.LOG.error(e1);
            }
        } catch (Exception e) {
            DiagramStyles.LOG.error(e);
        }
    }

}
