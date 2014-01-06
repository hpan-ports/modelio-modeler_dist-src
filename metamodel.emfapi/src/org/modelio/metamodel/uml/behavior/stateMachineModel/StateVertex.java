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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0054944e-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateVertex extends ModelElement {
    @objid ("41a4c88d-0177-4d04-9a58-8f0e10c86ca2")
    EList<Transition> getOutGoing();

    @objid ("aa114004-9891-492d-9ccb-d0841cb4ebab")
    <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass);

    @objid ("e95e0df5-0297-44e6-97ae-bd79df548da3")
    EList<Transition> getIncoming();

    @objid ("682f2c3a-c718-4d25-a73d-09a03818cbef")
    <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("6172fb67-e59d-4758-bfb1-7de1b5defa75")
    Region getParent();

    @objid ("076f2d3c-c55b-431b-b86e-5f4c49e8ad43")
    void setParent(Region value);

}
