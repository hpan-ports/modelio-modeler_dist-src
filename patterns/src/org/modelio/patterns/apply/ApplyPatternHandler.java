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


package org.modelio.patterns.apply;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.patterns.api.IPatternRepository;
import org.modelio.patterns.api.IPatternService;
import org.modelio.patterns.apply.gui.ApplyPatternData;
import org.modelio.patterns.apply.gui.ApplyPatternDialog;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.model.RuntimePattern;
import org.modelio.patterns.plugin.Patterns;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Handler for the ApplyPattern command. <br/>
 * See e4 model in <b>e4model/patterns.e4xmi</b> file.
 */
@objid ("350fde9b-319a-433b-941e-f74b2366dae9")
public class ApplyPatternHandler {
    @objid ("a26736f8-cd97-4433-b146-67429e1500dd")
    public static final String APPLY_PATTERN_NAME = "org.modelio.patterns.command.applypattern.name";

    @objid ("da4592de-c339-4da2-b381-cbe06507a5a7")
    public static final String APPLY_PATTERN = "org.modelio.patterns.command.applypattern";

    @objid ("ee9b3955-1a63-42dd-98cd-5659c3a2dfc9")
    @Inject
    private IProjectService projectService;

    /**
     * Apply a pattern on the selection.
     * @param pickingService
     * @param selection the current modelio selection.
     * @param patternService the pattern service.
     * @param patternName name of a pattern to apply.
     */
    @objid ("88d47a57-7d35-4c87-a538-12c9dd23ce70")
    @Execute
    public final void execute(@Named(IServiceConstants.ACTIVE_SHELL) final Shell activeShell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, IPatternService patternService, @Named(APPLY_PATTERN_NAME) final String patternName, IModelioPickingService pickingService) {
        IPatternRepository repository = patternService.getCatalog();
        
        final ModelElement selectedElement = (ModelElement) SelectionHelper.getFirst(selection, MObject.class);
        
        CoreSession session = CoreSession.getSession(selectedElement);
        try (ITransaction transaction = session.getTransactionSupport().createTransaction("Apply Pattern")) {
            // Run apply from an existing pattern
            final RuntimePattern pattern = repository.getPattern(patternName);
            if (pattern != null) {
                ApplyPatternData data = new ApplyPatternData(pattern, selectedElement, session, pickingService);
                ApplyPatternDialog view = new ApplyPatternDialog(activeShell, data);
                if (view.open() == IDialogConstants.OK_ID) {
                    pattern.applyPattern(data.getParameterValues(), this.projectService.getSession(), selectedElement);
                    transaction.commit();
                } else {
                    transaction.rollback();
                }
            } else {
                transaction.rollback();
                throw new IOException("Missing pattern \"" + patternName + "\"");
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
            MessageDialog.openError(activeShell, Patterns.I18N.getString("Gui.ErrorTitle"), e.getMessage());
        }
    }

    /**
     * Available only when the selection contains only a ModelElement that is neither a project, nor a <<Pattern>> Package.
     * Pattern name must be neither empty nor null.
     * @param selection the current modelio selection.
     * @return true if the handler can be executed.
     */
    @objid ("291d6899-6294-4ea2-92d3-031f4c7fd8fa")
    @CanExecute
    public final boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, @Named(APPLY_PATTERN_NAME) final String patternName) {
        final List<MObject> selectedElements = SelectionHelper.toList(selection, MObject.class);
        
        if (selectedElements.size() == 1) {
            final MObject selectedElement = selectedElements.get(0);
            return selectedElement instanceof ModelElement
                    && !(selectedElement instanceof Project)
                    && !((ModelElement) selectedElement).isStereotyped(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERN)
                    && patternName != null
                    && !patternName.isEmpty();
        }
        return false;
    }

}
