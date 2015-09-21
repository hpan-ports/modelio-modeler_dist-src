/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.catalog;

import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.metamodel.mda.Project;
import org.modelio.patterns.api.IPatternService;
import org.modelio.patterns.apply.gui.ApplyPatternData;
import org.modelio.patterns.apply.gui.ApplyPatternDialog;
import org.modelio.patterns.catalog.gui.PatternCatalogData;
import org.modelio.patterns.catalog.gui.PatternCatalogDialog;
import org.modelio.patterns.model.RuntimePattern;
import org.modelio.patterns.plugin.Patterns;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;

/**
 * Handler for the OpenCatalog command. <br/>
 * See e4 model in <b>e4model/patterns.e4xmi</b> file.
 */
@objid ("74c196fd-6909-4a89-9b67-bf072e6695c7")
public class OpenCatalogHandler {
    @objid ("115f0719-8e40-42b4-89f0-8c6ccba190cd")
    @Inject
    private IProjectService projectService;

    /**
     * Apply a pattern chosen in the pattern catalog.
     * @param selection the current modelio selection.
     * @param patternService the pattern service.
     */
    @objid ("72af4657-4926-4360-a894-e510954c3765")
    @Execute
    public final void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell, IPatternService patternService, IModelioPickingService pickingService, IProjectService projectService) {
        PatternCatalogData catalogData = new PatternCatalogData(patternService.getCatalog());
        
        // Select a pattern in the catalog and run it
        PatternCatalogDialog view = new PatternCatalogDialog(activeShell, catalogData);
        if (view.open() == IDialogConstants.OK_ID) {
            RuntimePattern selectedPattern = catalogData.getSelectedPattern();
            if (selectedPattern != null) {
                applyPattern(selectedPattern, activeShell, pickingService, projectService);
            }
        }
    }

    @objid ("1269db7c-59b8-4500-bad8-936bd6f92d48")
    private void applyPattern(final RuntimePattern pattern, final Shell activeShell, final IModelioPickingService pickingService, final IProjectService projectService) {
        ICoreSession session = projectService.getSession();
        try (ITransaction transaction = session.getTransactionSupport().createTransaction("Apply pattern from catalog")) {
            ApplyPatternData data = new ApplyPatternData(pattern, null, session, pickingService);
            ApplyPatternDialog applyView = new ApplyPatternDialog(activeShell, data);
            if (applyView.open() == IDialogConstants.OK_ID) {
                pattern.applyPattern(data.getParameterValues(), this.projectService.getSession(), session.getModel().findByClass(Project.class).iterator().next());
                transaction.commit();
            } else {
                transaction.rollback();
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
            MessageDialog.openError(activeShell, Patterns.I18N.getString("Gui.ErrorTitle"), e.getMessage());
        }
    }

    @objid ("b28e7ccd-4760-465e-9adc-9882debbae5e")
    @CanExecute
    public final boolean canExecute(IProjectService projectService) {
        return projectService.getOpenedProject() != null;
    }

}
