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
                                    

package org.modelio.property.ui.data.extensions;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.SWTX;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.property.ui.data.IPropertyPanel;
import org.modelio.property.ui.data.ModelioKTable;

/**
 * Implementation of the "Extensions" part of the property panel, available when
 * a module is selected in it. Uses a KTable to display all non hidden tag types
 * provided by this module for the 'typedElement' (i.e. the selected element
 * given by the platform).
 */
@objid ("8e060ea6-c068-11e1-8c0a-002564c97630")
public class ExtensionsPropertyPanel implements IPropertyPanel {
    @objid ("8e060ea9-c068-11e1-8c0a-002564c97630")
    private ModelElement typedElement;

    @objid ("8e060ea8-c068-11e1-8c0a-002564c97630")
    private Composite comp;

    @objid ("f90b2bf3-c5d4-11e1-8f21-002564c97630")
    private KTable table;

    @objid ("8e060eac-c068-11e1-8c0a-002564c97630")
    public ExtensionsPropertyPanel(final Composite parent, final ModelElement typedElement) {
        this.typedElement = typedElement;
        createGUI(parent);
    }

    @objid ("8e060eb4-c068-11e1-8c0a-002564c97630")
    @Override
    public void setInput(IProjectService projectService, IMModelServices modelService, IModelioPickingService pickingService, IActivationService activationService, Element element) {
        ExtensionsKModel model = new ExtensionsKModel(projectService, modelService, pickingService, this.table, this.typedElement, (ModelElement) element);
        this.table.setModel(model);
    }

    @objid ("8e060ebb-c068-11e1-8c0a-002564c97630")
    @Override
    public void stop() {
        setInput(null, null, null, null, null);
        disableGUI();
    }

    @objid ("8e060ebe-c068-11e1-8c0a-002564c97630")
    @Override
    public void start() {
        // Nothing to do
    }

    @objid ("8e060ec1-c068-11e1-8c0a-002564c97630")
    @Override
    public void disableGUI() {
        // Nothing to do
    }

    @objid ("8e060ec4-c068-11e1-8c0a-002564c97630")
    @Override
    public void enableGUI() {
        // Nothing to do
    }

    @objid ("8e060ec7-c068-11e1-8c0a-002564c97630")
    @Override
    public Composite getComposite() {
        return this.comp;
    }

    @objid ("8e079548-c068-11e1-8c0a-002564c97630")
    @Override
    public void refresh() {
        if (!this.table.isDisposed()) {
            this.table.redraw();
        }
    }

    @objid ("8e07954b-c068-11e1-8c0a-002564c97630")
    private void createGUI(final Composite parent) {
        // Create the composite to hold the controls
        this.comp = new Composite(parent, SWT.BORDER | SWT.NO_BACKGROUND);
        final GridLayout layout = new GridLayout(1, false);
        layout.horizontalSpacing = 0;
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        
        this.comp.setLayout(layout);
        
        final int tableStyle = SWTX.AUTO_SCROLL | SWTX.FILL_WITH_LASTCOL;
        this.table = new ModelioKTable(this.comp, tableStyle);
        
        final GridData gridData = new GridData(GridData.FILL_BOTH | GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        gridData.minimumHeight = 20;
        this.table.setLayoutData(gridData);
        this.table.setBackground(this.table.getDisplay().getSystemColor(SWT.COLOR_WHITE));
    }

}
