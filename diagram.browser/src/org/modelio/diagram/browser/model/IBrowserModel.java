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


package org.modelio.diagram.browser.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.modelio.gproject.gproject.GProject;
import org.modelio.vcore.session.api.ICoreSession;

/**
 * An IBrowserModel is used to configure the diagram browser tree aspect and behavior. The IbrowserModel provides the tree's content
 * provider, label provider, editing support and content sorter.
 * 
 * @author phv
 */
@objid ("003083d8-0d4f-10c6-842f-001ec947cd2a")
public interface IBrowserModel {
    @objid ("00309b2a-0d4f-10c6-842f-001ec947cd2a")
    ITreeContentProvider getContentProvider(GProject project);

    @objid ("0030b614-0d4f-10c6-842f-001ec947cd2a")
    IBaseLabelProvider getLabelProvider(TreeViewer browserView);

    @objid ("0030ce88-0d4f-10c6-842f-001ec947cd2a")
    ViewerSorter getSorter();

    @objid ("0030d694-0d4f-10c6-842f-001ec947cd2a")
    ICellModifier getLabelEditor(TreeViewer browserView, ICoreSession iCoreSession);

}
