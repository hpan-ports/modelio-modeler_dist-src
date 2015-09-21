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


package org.modelio.model.search.handlers;

import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.gproject.GProject;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.model.search.dialog.SearchDialog;
import org.modelio.model.search.engine.searchers.model.ModelSearchCriteria;
import org.modelio.model.search.plugin.ModelSearch;
import org.modelio.model.search.searchers.model.ModelSearchPanel;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.meta.SmMetamodel;

/**
 * Handler to open the search dialog.
 */
@objid ("000f3f70-c59e-10ab-8258-001ec947cd2a")
public class OpenSearchDialogHandler {
    @objid ("000f47fe-c59e-10ab-8258-001ec947cd2a")
    @SuppressWarnings("javadoc")
    @Execute
    public void execute(final IProjectService projectService, final IModelioNavigationService navigationService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
        final GProject project = projectService.getOpenedProject();
        if (project == null) {
            return;
        }
        
        ModelSearch.LOG.info("Opening advanced search dialog in project '%s' ", project.getName());
        
        final ICoreSession session = project.getSession();
        
        
        final SearchDialog searchDialog = SearchDialog.getInstance(shell, session, navigationService);
        searchDialog.setBlockOnOpen(false);
        searchDialog.open();
        
        final SmMetamodel metamodel = session.getMetamodel();
        final ModelSearchCriteria searchCriteria = new ModelSearchCriteria();
        searchCriteria.setExpression(".*");
        searchCriteria.addMetaclass(metamodel.getMClass(NameSpace.class));
        searchCriteria.setIncludeRamc(false);
        searchCriteria.setStereotype("");
        searchDialog.setDisplayedContent(ModelSearchPanel.class, searchCriteria, null);
    }

    @objid ("000f9812-c59e-10ab-8258-001ec947cd2a")
    @SuppressWarnings("javadoc")
    @CanExecute
    public boolean canExecute(final IProjectService projectService) {
        return (projectService.getOpenedProject() != null);
    }

}
