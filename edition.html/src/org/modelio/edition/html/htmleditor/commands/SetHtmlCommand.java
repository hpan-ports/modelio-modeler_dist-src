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
                                    

package org.modelio.edition.html.htmleditor.commands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author Tom Seidel <tom.seidel@remus-software.org>
 */
@objid ("0042476f-f1ac-455d-b219-724a28aa242d")
public class SetHtmlCommand extends Command {
    @objid ("dff5dbc6-5247-43aa-ba81-bf8ec3b313db")
    private final String html;

    @objid ("2e5f9278-4387-412c-b352-93f6b5db3bfb")
    public SetHtmlCommand(String html) {
        super("SetHTML");
        this.html = html.replaceAll("\\'", "\\\\'").replaceAll("\\s", " ");
    }

    @objid ("3c6ddc2d-e687-46b9-8863-d032c47c8f86")
    @Override
    public String getScript() {
        return "integration.editor.setData('" + this.html + "');";
    }

}
