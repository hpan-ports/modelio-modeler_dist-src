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
                                    

package org.modelio.diagram.editor.handlers;

import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Execute;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.metamodel.diagrams.AbstractDiagram;

@objid ("65b21878-33f7-11e2-95fe-001ec947c8cc")
public class OpenRelatedDiagramHandler {
    @objid ("65b21879-33f7-11e2-95fe-001ec947c8cc")
    protected AbstractDiagram related_diagram = null;

    @objid ("65b47a78-33f7-11e2-95fe-001ec947c8cc")
    @Execute
    public Object execute(@Named("org.modelio.diagram.editor.command.parameter.related_diagram") AbstractDiagram o, IActivationService activationService) {
        if (o != null) {
            this.related_diagram = o;
            activationService.activateMObject(this.related_diagram);
        }
        return null;
    }

}
