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


package org.modelio.patterns.edit;

import java.util.List;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.patterns.edit.gui.PatternEditDialog;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.model.RuntimePattern;
import org.modelio.patterns.plugin.Patterns;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * Handler for the EditPattern command. <br/>
 * See e4 model in <b>e4model/patterns.e4xmi</b> file.
 */
@objid ("3dadfcb7-3fa5-4e11-8595-68aa074f5c6e")
public class EditPatternHandler {
    /**
     * Edit an existing pattern model.
     * @param selection the current modelio selection.
     */
    @objid ("c7fb719b-87f3-43a9-b952-7bc8a0af0a8b")
    @Execute
    public final void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        final Package modelPattern = SelectionHelper.getFirst(selection, Package.class);
        
        CoreSession session = CoreSession.getSession(modelPattern);
        RuntimePattern rtPattern = new RuntimePattern(modelPattern);
        PatternEditDialog mavDep = new PatternEditDialog(activeShell, rtPattern);
        if (mavDep.open() == IDialogConstants.OK_ID) {
            try (ITransaction transaction = session.getTransactionSupport().createTransaction("Edit Pattern")) {
        
                // FIXME ProfileUtils might require a re-factoring...
                ProfileUtils.updatePatternModel(modelPattern, rtPattern);
        
                transaction.commit();
        
            } catch (Exception e) {
                Patterns.LOG.debug(e);
            }
        }
    }

    /**
     * Available only when the selection contains only a pattern.
     * @param selection the current modelio selection.
     * @return true if the handler can be executed.
     */
    @objid ("fb154851-8741-4ef2-b3ca-ac9766e6f59f")
    @CanExecute
    public final boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        final List<Package> selectedElements = SelectionHelper.toList(selection, Package.class);
        
        if (selectedElements.size() == 1) {
            Package selectedElement = selectedElements.get(0);
            if (selectedElement.isStereotyped(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERN)) {
                return true;
            }
        }
        return false;
    }

}
