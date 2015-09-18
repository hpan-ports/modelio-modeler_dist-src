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
                                    

//------------------------------------------------------------------------------
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// IBM Corporation - initial implementation
//------------------------------------------------------------------------------
package org.modelio.edition.html.view.actions;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * The abstract base class for all rich text action.
 * 
 * @author Kelvin Low
 * @since 1.0
 */
@objid ("2e3ae3af-b2cd-4736-9d04-a8b72e601107")
public abstract class BaseRichTextAction implements IBaseRichTextAction {
    @objid ("44049c51-4070-4806-9909-6426ba265d96")
    protected String toolTipText;

    @objid ("b8c3ce5f-93f1-4134-b1f8-117dbdbc9a53")
    protected boolean enabled = true;

    /**
     * Creates a new instance.
     * @param richText
     * a rich text control
     */
    @objid ("39a0886e-4c04-4f50-98bc-700962436eda")
    public BaseRichTextAction() {
    }

    /**
     * Returns the tool tip for the action.
     * @return the tool tip text
     */
    @objid ("d9d8926d-a8d7-428f-8237-735cd2a904c0")
    @Override
    public String getToolTipText() {
        return this.toolTipText;
    }

    /**
     * Sets the tool tip for the action.
     * @param toolTipText the tool tip text
     */
    @objid ("b83d7ee5-82e4-4156-b96c-235be3b98a8c")
    @Override
    public void setToolTipText(String toolTipText) {
        this.toolTipText = toolTipText;
    }

    /**
     * Returns the enabled status of the action.
     * @return <code>true</code> if enabled, <code>false</code> if not
     */
    @objid ("4df62386-feb8-4693-a36c-a17be65b8178")
    @Override
    public boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Enables or disables the action.
     * @param enabled if <code>true</code>, enable the action. if
     * <code>false</code>, disable it.
     */
    @objid ("3e3b7717-3527-44c3-b784-89b7c17322ac")
    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
