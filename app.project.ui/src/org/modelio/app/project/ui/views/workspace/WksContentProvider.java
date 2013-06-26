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

import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.modelio.app.project.ui.views.workspace.WorkspaceTreeView.ProjectCache;
import org.modelio.gproject.gproject.GProject;

@objid ("0017e5b2-a65c-1fe0-bf4c-001ec947cd2a")
public class WksContentProvider implements IStructuredContentProvider, ITreeContentProvider {
    @objid ("0006abf8-a110-1fbc-82db-001ec947cd2a")
    public void inputChanged(final Viewer v, final Object oldInput, final Object newInput) {
    }

    @objid ("0006ac8e-a110-1fbc-82db-001ec947cd2a")
    public void dispose() {
    }

    @objid ("0006ad24-a110-1fbc-82db-001ec947cd2a")
    public Object[] getElements(final Object parent) {
        assert (parent instanceof ProjectCache);
        return ((ProjectCache) parent).getProjects();
    }

    @objid ("0006adb0-a110-1fbc-82db-001ec947cd2a")
    public Object getParent(final Object child) {
        return null;
    }

    @objid ("0006ae46-a110-1fbc-82db-001ec947cd2a")
    public Object[] getChildren(final Object parent) {
        if (parent instanceof GProject) {
            GProject project = (GProject) parent;
            return project.getFragments().toArray();
        }
        return Collections.EMPTY_LIST.toArray();
    }

    @objid ("0006aed2-a110-1fbc-82db-001ec947cd2a")
    public boolean hasChildren(final Object parent) {
        return false;
    }

}
