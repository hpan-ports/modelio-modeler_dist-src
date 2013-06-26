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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("607c7f93-9571-4aff-a9f0-b9fda0a55541")
    EList<Transition> getOutGoing();

    @objid ("17abfcc2-d742-430f-b4a0-c943f4f204e6")
    <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass);

    @objid ("66cdf0f9-469f-4f92-868b-8d5b97e9900e")
    EList<Transition> getIncoming();

    @objid ("5ddedb0c-4a34-4951-873a-669116877ad2")
    <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("7991c8df-6048-47e6-af5a-8ce2a8855695")
    Region getParent();

    @objid ("a8050500-00c2-4574-8f73-a926907a9f99")
    void setParent(Region value);

}
