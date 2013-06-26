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
                                    

package org.modelio.diagram.diagramauto.diagram.creator;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("c587d478-08a3-46a9-869e-eba3a4988269")
public interface IDiagramCreator {
    @objid ("7e20d2ab-2c49-4738-93b8-5bdfe766fc89")
    AbstractDiagram createDiagram(final ModelElement main);

    @objid ("61cc711a-b2ab-477a-a7c1-d18d50bf281b")
    AbstractDiagram getExistingAutoDiagram(final ModelElement main);

    @objid ("8a100a0a-adf3-4a8c-853e-b44d58a3e479")
    ModelElement getAutoDiagramContext(final ModelElement main);

    @objid ("42d7de2e-6724-4f80-8c2d-0164f4e4e0a3")
    String getAutoDiagramName();

    @objid ("02a177dc-8a29-4f6e-9f7e-ee2c545a5616")
    String getAutoDiagramGroup();

}
