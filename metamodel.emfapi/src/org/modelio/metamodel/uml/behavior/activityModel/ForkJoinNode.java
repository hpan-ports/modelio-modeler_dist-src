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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0033b2ec-c4bf-1fd8-97fe-001ec947cd2a")
public interface ForkJoinNode extends ControlNode {
    @objid ("3dcbb51e-a26f-4a0a-8b33-1ede220299a0")
    boolean isIsCombineDuplicate();

    @objid ("d5caf608-80cb-4804-9655-ab98080b3b39")
    void setIsCombineDuplicate(boolean value);

    @objid ("62503d32-9fdb-487a-be85-ff9ba1c6b58c")
    String getJoinSpec();

    @objid ("3abe2321-8d92-4715-8c18-52dc6364dcf4")
    void setJoinSpec(String value);

}
