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
                                    

package org.modelio.diagram.editor.statik.elements.namespacinglink.redraw;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.modelio.diagram.editor.statik.elements.namespacinglink.CompositionLinkEditPart;

/**
 * Handler for the "Redraw link" contextual command. Simply sets the current tool to a custom tool with a cutsom made
 * creation factory.
 * 
 * @author fpoyer
 */
@objid ("35bbcd70-55b7-11e2-877f-002564c97630")
public class RedrawLinkHandler extends AbstractHandler {
    @objid ("bc3b5c82-51ee-402a-b715-8690dd93ab18")
    @Inject
    protected ISelection selection;

    @objid ("35bbcd72-55b7-11e2-877f-002564c97630")
    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        // First get the current selection
        CompositionLinkEditPart primarySelection = null;
        for (CompositionLinkEditPart editPart : getLinksToProcess()) {
            if (editPart.getSelected() == EditPart.SELECTED_PRIMARY) {
                primarySelection = editPart;
                break;
            }
        }
        
        if (primarySelection != null) {
            // Now instantiate the tool.
            EditDomain editDomain = primarySelection.getViewer().getEditDomain();
            RedrawConnectionTool redrawTool = new RedrawConnectionTool(primarySelection);
            // Set the tool as the active one.
            editDomain.setActiveTool(redrawTool);
        }
        return null;
    }

    @objid ("35bbcd79-55b7-11e2-877f-002564c97630")
    protected List<CompositionLinkEditPart> getLinksToProcess() {
        final List<CompositionLinkEditPart> selectedLinks = new ArrayList<>();
        if (this.selection instanceof IStructuredSelection) {
            final List<?> selectedObjects = ((IStructuredSelection) this.selection).toList();
            for (final Object selectedObject : selectedObjects) {
                if (selectedObject instanceof CompositionLinkEditPart) {
                    selectedLinks.add((CompositionLinkEditPart) selectedObject);
                }
            }
        }
        return selectedLinks;
    }

}
