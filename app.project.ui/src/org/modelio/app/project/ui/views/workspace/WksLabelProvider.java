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
                                    

package org.modelio.app.project.ui.views.workspace;

import java.nio.file.Files;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;

@objid ("005c48a6-a678-1fe0-bf4c-001ec947cd2a")
public class WksLabelProvider extends StyledCellLabelProvider {
    @objid ("408a1dad-22ca-48b2-bb27-73e2ee0efce4")
    private static final String INFO_PROJECT_ICON_NAME = "info.projetIconName";

    @objid ("fce21274-2ebf-40c0-8955-33ef7bf3b245")
    private static final String PROJECT_TYPE_LOCAL = "LOCAL";

    @objid ("00745482-9578-1061-84ef-001ec947cd2a")
    private final IProjectService projectService;

    @objid ("ab976c66-3230-11e2-85c2-001ec947ccaf")
    private static Image defaultOpenLocalProjectIcon = null;

    @objid ("ab976c67-3230-11e2-85c2-001ec947ccaf")
    private static Image defaultClosedLocalProjectIcon = null;

    @objid ("ab976c68-3230-11e2-85c2-001ec947ccaf")
    private Font selectedFont;

    @objid ("ab976c69-3230-11e2-85c2-001ec947ccaf")
    private final Font normalFont;

    @objid ("e02839e7-50e2-4d49-b87b-ab4b6633d6f6")
    private static Image defaultOpenServerProjectIcon = null;

    @objid ("48e6b06e-f4f8-4b9c-aa3b-f1adfd7faf19")
    private static Image defaultClosedServerProjectIcon = null;

    @objid ("00413cc8-83c8-1fe1-bf4c-001ec947cd2a")
    public WksLabelProvider(IProjectService projectService, final Font font) {
        FontData[] selectedFontData = getModifiedFontData(font.getFontData(), SWT.BOLD);
        this.selectedFont = new Font(Display.getCurrent(), selectedFontData);
        this.normalFont = font;
        
        if (defaultOpenLocalProjectIcon == null) {
            defaultOpenLocalProjectIcon = AbstractUIPlugin.imageDescriptorFromPlugin(AppProjectUi.PLUGIN_ID,
                    "icons/openedproject.png").createImage();
        }
        if (defaultClosedLocalProjectIcon == null) {
            defaultClosedLocalProjectIcon = AbstractUIPlugin.imageDescriptorFromPlugin(AppProjectUi.PLUGIN_ID,
                    "icons/closedproject.png").createImage();
        }
        if (defaultOpenServerProjectIcon == null) {
            defaultOpenServerProjectIcon = AbstractUIPlugin.imageDescriptorFromPlugin(AppProjectUi.PLUGIN_ID,
                    "icons/openserverproject.png").createImage();
        }
        if (defaultClosedServerProjectIcon == null) {
            defaultClosedServerProjectIcon = AbstractUIPlugin.imageDescriptorFromPlugin(AppProjectUi.PLUGIN_ID,
                    "icons/closedserverproject.png").createImage();
        }
        
        this.projectService = projectService;
    }

    @objid ("00414b64-83c8-1fe1-bf4c-001ec947cd2a")
    @Override
    public void update(final ViewerCell cell) {
        Object obj = cell.getElement();
        
        if (obj instanceof ProjectDescriptor) {
            ProjectDescriptor project = (ProjectDescriptor) obj;
        
            if (isCurrentlyOpenedProject(project)) {
                updateOpenedProject(cell, project);
            } else {
                updateClosedProject(cell, project);
            }
        
        } else {
            cell.setText(obj.toString());
        }
    }

    @objid ("00919344-8aeb-1fe1-bf4c-001ec947cd2a")
    private static FontData[] getModifiedFontData(final FontData[] originalData, final int additionalStyle) {
        FontData[] styleData = new FontData[originalData.length];
        for (int i = 0; i < styleData.length; i++) {
            FontData base = originalData[i];
            styleData[i] = new FontData(base.getName(), base.getHeight(), base.getStyle() | additionalStyle);
        }
        return styleData;
    }

    @objid ("009219e0-8aeb-1fe1-bf4c-001ec947cd2a")
    private void updateOpenedProject(final ViewerCell cell, final ProjectDescriptor project) {
        cell.setFont(this.selectedFont);
        cell.setText(getProjectLabel(project));
        Image icon = getProjectIcon(project);
        if (icon == null) {
            icon = (project.getType().equals(PROJECT_TYPE_LOCAL)) ? defaultOpenLocalProjectIcon : defaultOpenServerProjectIcon;
        }
        cell.setImage(icon);
    }

    @objid ("00925446-8aeb-1fe1-bf4c-001ec947cd2a")
    private void updateClosedProject(final ViewerCell cell, final ProjectDescriptor project) {
        cell.setFont(this.normalFont);
        cell.setText(getProjectLabel(project));
        Image icon = getProjectIcon(project);
        if (icon == null) {
            icon = (project.getType().equals(PROJECT_TYPE_LOCAL)) ? defaultClosedLocalProjectIcon : defaultClosedServerProjectIcon;
        }
        cell.setImage(icon);
    }

    @objid ("00928f2e-8aeb-1fe1-bf4c-001ec947cd2a")
    @Override
    public void dispose() {
        super.dispose();
        this.selectedFont.dispose();
        this.selectedFont = null;
    }

    @objid ("0010e852-93fc-1061-84ef-001ec947cd2a")
    private boolean isCurrentlyOpenedProject(ProjectDescriptor projectDescriptor) {
        final GProject currentlyOpenedProject = this.projectService.getOpenedProject();
        return (currentlyOpenedProject != null && (currentlyOpenedProject.getProjectPath().equals(projectDescriptor.getPath())));
    }

    @objid ("00ffab51-13c6-4ded-9ddb-4ae07eb82acf")
    private Image getProjectIcon(final ProjectDescriptor project) {
        Image projectIcon = null;
        String iconName = project.getProperties().getValue(INFO_PROJECT_ICON_NAME);
        if (iconName == null)
            return null;
        Path iconPath = project.getPath().resolve("data").resolve(iconName);
        projectIcon = createUserProjectIcon(iconPath);
        return projectIcon;
    }

    @objid ("271420fd-941d-42c2-8023-c015cd0abe19")
    private Image createUserProjectIcon(Path path) {
        Image projectIcon = null;
        if (Files.exists(path)) {
            Image originalImage = new Image(null, path.toString());
            projectIcon = new Image(null, originalImage.getImageData().scaledTo(16, 16));
            originalImage.dispose();
        }
        return projectIcon;
    }

    @objid ("93f3a922-7574-48a0-9fc8-9ca652a42fc5")
    private String getProjectLabel(ProjectDescriptor project) {
        String text;
        Path p = project.getPath();
        if (p.getNameCount() > 0) {
            text = p.getName(p.getNameCount() - 1).toString();
        } else {
            text =  project.getName();
        }
        return text;
    }

}
