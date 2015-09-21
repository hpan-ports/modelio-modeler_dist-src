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


package org.modelio.patterns.exporter;

import java.util.List;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.patterns.api.IPatternService;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.model.RuntimePattern;
import org.modelio.patterns.plugin.Patterns;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * Handler for the ExportPattern command. <br/>
 * See e4 model in <b>e4model/patterns.e4xmi</b> file.
 */
@objid ("5083b4b3-6126-4439-bb59-450e14c97a13")
public class ExportPatternHandler {
    /**
     * Export a jar from an existing pattern.
     * @param selection the current modelio selection.
     * @param patternService the pattern service.
     */
    @objid ("5c18d6f7-c1d4-478d-9e31-98b398d93f54")
    @Execute
    public final void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, IPatternService patternService) {
        final Package modelPattern = SelectionHelper.getFirst(selection, Package.class);
        
        CoreSession session = CoreSession.getSession(modelPattern);
        try (ITransaction transaction = session.getTransactionSupport().createTransaction("ExportPattern")) {
            // Export existing pattern
            RuntimePattern pattern = new RuntimePattern(modelPattern);
            patternService.exportPattern(pattern);
        
            // Refresh pattern into the catalog
            patternService.getCatalog().addPattern(pattern.getPatternPath());
        
            MessageDialog.openInformation(activeShell, Patterns.I18N.getString("ExportPattern.WindowName"),
                    Patterns.I18N.getString("ExportPattern.PackagingOk") + pattern.getPatternPath());
        
            transaction.commit();
        } catch (Exception e) {
            Patterns.LOG.debug(e);
            MessageDialog.openError(activeShell, Patterns.I18N.getString("ExportPattern.PackagingError"), e.toString());
        }
    }

    /**
     * Available only when the selection is a <<Pattern>> Package.
     * @param selection the current modelio selection.
     * @return true if the handler can be executed.
     */
    @objid ("e450dc88-ad82-4c87-9d8a-c29e9e949586")
    @CanExecute
    public final boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        final List<Package> selectedElements = SelectionHelper.toList(selection, Package.class);
        if (selectedElements.size() == 1) {
            return selectedElements.get(0).isStereotyped(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERN);
        }
        return false;
    }

}
