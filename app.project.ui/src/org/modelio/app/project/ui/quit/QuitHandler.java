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
                                    

package org.modelio.app.project.ui.quit;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.gproject.gproject.GProject;

@objid ("a8baea1d-485b-11e2-ae30-002564c97630")
public class QuitHandler {
    @objid ("abd856bd-485b-11e2-ae30-002564c97630")
    @Execute
    public static void execute(final IWorkbench workbench, Shell shell, IProjectService projectService) {
        if(QuitHandler.mustClose(shell, projectService)){
            workbench.close();
        }
    }

    @objid ("22452f5c-486b-11e2-820c-002564c97630")
    public static boolean mustClose(Shell shell, IProjectService projectService) {
        GProject openedProject = projectService.getOpenedProject();
        if (openedProject != null) {
            AppProjectUi.LOG.info("Quit project '%s'", openedProject.getName());
            
            if (projectService.isDirty()) {
                // Ask the user to save before quitting
                final String[] tab = { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL };
                final MessageDialog dialog = new MessageDialog(shell,
                        AppProjectUi.I18N.getMessage("SaveBeforeQuitTitle"), // title
                        null, // title image
                        AppProjectUi.I18N.getMessage("SaveBeforeQuitQuestion", openedProject.getName()), // message
                        MessageDialog.QUESTION, // image type
                        tab, // labels
                        IDialogConstants.YES_ID); // default answer
        
                dialog.setBlockOnOpen(true);
                final int res = dialog.open();
        
                if (res == -1 || tab[res] == IDialogConstants.CANCEL_LABEL) {
                    return false;
                } else if (tab[res] == IDialogConstants.YES_LABEL) {
                    try {
                        projectService.saveProject();
                    } catch (IOException e) {
                        AppProjectUi.LOG.error(e);
                    }
                }
            }
            
        }
        return true;
    }

}
