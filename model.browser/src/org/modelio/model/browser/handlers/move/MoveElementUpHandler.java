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
                                    

package org.modelio.model.browser.handlers.move;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.api.MTools;
import org.modelio.metamodel.mda.Project;
import org.modelio.model.browser.plugin.ModelBrowser;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Pastes the elements from the clipboard.
 */
@objid ("25481850-43a4-11e2-b513-002564c97630")
public class MoveElementUpHandler {
    @objid ("25481852-43a4-11e2-b513-002564c97630")
    @Inject
    protected IProjectService projectService;

    /**
     * Available only when the selection contains only one modifiable element.
     * @param selection the current modelio selection.
     * @return true if the handler can be executed.
     */
    @objid ("25481854-43a4-11e2-b513-002564c97630")
    @CanExecute
    public final boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) final Object selection) {
        // Sanity checks
        if (this.projectService.getSession() == null) {
            return false;
        }
        
        // Must have at least an element
        List<SmObjectImpl> toClone = getSelectedElements(selection);
        
        SmObjectImpl dest = getPasteTarget(toClone);
        if (dest == null) {
            return false;
        }
        
        // Check the elements to clone can be added to dest
        for (SmObjectImpl pasted : toClone) {
            if (!MTools.getAuthTool().canAdd(dest, pasted.getMClass().getName())) {
                return false;
            }
        }
        return true;
    }

    @objid ("2548185d-43a4-11e2-b513-002564c97630")
    private static SmObjectImpl getPasteTarget(List<SmObjectImpl> toClone) {
        SmObjectImpl ret = null;
        for (SmObjectImpl obj : toClone) {
            // All elements to clone must have the same parent
            SmObjectImpl compositionOwner = obj.getCompositionOwner();
            if (ret != null && ret != compositionOwner) {
                return null;
            } else if (compositionOwner instanceof Project){
                return null;
            } else {
                ret = compositionOwner;
            }
        }
        return ret;
    }

    @objid ("25481864-43a4-11e2-b513-002564c97630")
    private static List<SmObjectImpl> getSelectedElements(final Object selection) {
        List<SmObjectImpl> selectedElements = new ArrayList<>();
        if (selection instanceof SmObjectImpl) {
            selectedElements.add((SmObjectImpl) selection);
        } else if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() >= 1) {
            Object[] elements = ((IStructuredSelection) selection).toArray();
            for (Object element : elements) {
                if (element instanceof SmObjectImpl) {
                    selectedElements.add((SmObjectImpl) element);
                } else if (element instanceof IAdaptable) {
                    selectedElements.add((SmObjectImpl) ((IAdaptable) element).getAdapter(SmObjectImpl.class));
                }
            }
        }
        return selectedElements;
    }

    /**
     * Cut the currently selected elements.
     * @param selection the current modelio selection.
     * @param currentDisplay the display Modelio runs into.
     */
    @objid ("2548186c-43a4-11e2-b513-002564c97630")
    @Execute
    public final void execute(@Named(IServiceConstants.ACTIVE_SELECTION) final Object selection, Display currentDisplay) {
        ICoreSession session = this.projectService.getSession();
        
        // Sanity checks
        if (session == null) {
            return;
        }
        
        final List<SmObjectImpl> selectedElements = getSelectedElements(selection);
        SmObjectImpl targetElement = getPasteTarget(selectedElements);
        if (targetElement == null) {
            return;
        }
        
        // No elements to move
        if (selectedElements.isEmpty()) {
            return;
        }
        
        try (ITransaction transaction = session.getTransactionSupport().createTransaction("Move element up")) {
            int nbToMove = 0;
        
            for (SmObjectImpl element : selectedElements) {
                List<MObject> listToReorder = targetElement.mGet(element.getCompositionRelation().dep.getSymetric());
        
                int index = getIndexUp(element, listToReorder);
        
                if (index != -1) {
                    nbToMove++;
                    listToReorder.remove(element);
                    listToReorder.add(index, element);
                } else {
                    break;
                }
            }
        
            if (nbToMove > 0) {
                transaction.commit();
            } else {
                transaction.rollback();        
            }
        } catch (Exception e) {
            // Should catch InvalidModelManipulationException to display a popup box, but it
            // is not a RuntimeException.
            reportException(e);
        }
    }

    @objid ("25481874-43a4-11e2-b513-002564c97630")
    private static int getIndexUp(SmObjectImpl element, List<MObject> listToReorder) {
        int index = listToReorder.indexOf(element);
        
        if (index < 1) {
            return -1;
        }
        
        index--;
        
        // Iterate until we find an element of the same metaclass or until we find the begining of the list.
        while (index != -1 && listToReorder.get(index).getClass() != element.getClass()) {
            index--;
        }
        return index;
    }

    @objid ("2548187c-43a4-11e2-b513-002564c97630")
    static void reportException(Exception e) {
        // Show an error box
        String title = ModelBrowser.I18N.getMessage("CannotPasteClipboard");
        
        MessageDialog.openError(null, title, e.getLocalizedMessage());
        
        ModelBrowser.LOG.error(e);
    }

}
