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
                                    

package org.modelio.edition.dialogs.dialog;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.ui.panel.IPanelProvider;

/**
 * Panel descriptor.
 */
@objid ("8aac90e3-72e4-4617-a306-2e09864e19a3")
public class PanelDescriptor {
    @mdl.prop
    @objid ("7e08d4ac-67d4-488a-83f8-98dbe0921f58")
    private String panelLabel;

    @mdl.propgetter
    public String getPanelLabel() {
        // Automatically generated method. Please do not modify this code.
        return this.panelLabel;
    }

    @mdl.prop
    @objid ("8f399148-f947-41ed-a570-18b03273fefd")
    private boolean primary;

    @mdl.propgetter
    public boolean isPrimary() {
        // Automatically generated method. Please do not modify this code.
        return this.primary;
    }

    @mdl.prop
    @objid ("32291d82-84e6-4118-8828-23346b3f26a1")
    private IPanelProvider panel;

    @mdl.propgetter
    public IPanelProvider getPanel() {
        // Automatically generated method. Please do not modify this code.
        return this.panel;
    }

    /**
     * @param id the panel id
     * @param label the panel label
     * @param isPrimary whether it is a primary panel: to be displayed first
     * @param panel the panel implementation
     */
    @objid ("1c3f0ae7-9b27-4536-a58b-d95c80d3fe77")
    public PanelDescriptor(String id, String label, boolean isPrimary, IPanelProvider panel) {
        this.panelLabel = label;
        this.primary = isPrimary;
        this.panel = panel;
    }

}
