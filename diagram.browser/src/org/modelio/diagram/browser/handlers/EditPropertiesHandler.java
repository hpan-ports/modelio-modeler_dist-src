package org.modelio.diagram.browser.handlers;

import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.metamodel.uml.infrastructure.Element;

/**
 * Handler for the "select in explorer" menu item.
 */
@objid ("5d7f6f7e-8ee7-4904-833b-23c3ea5f7c88")
public class EditPropertiesHandler {
    @objid ("2cfe5f36-6fe9-49c3-b800-e4e117b0a258")
    @Execute
    public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, IActivationService activationService) {
        final Element e = SelectionHelper.getFirst(selection, Element.class);
        
        if (e != null) {
            activationService.editProperties(e);
        }
    }

    @objid ("ede875a0-10d3-4c31-9a0e-358ca017cbb0")
    @CanExecute
    public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection) {
        return SelectionHelper.size(selection) == 1;
    }

}
