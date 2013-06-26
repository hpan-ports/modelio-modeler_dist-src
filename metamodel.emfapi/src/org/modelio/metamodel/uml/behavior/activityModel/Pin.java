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
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("003b6582-c4bf-1fd8-97fe-001ec947cd2a")
public interface Pin extends ObjectNode {
    @objid ("898217a5-6d19-4dbe-a6ae-87305b9ae071")
    boolean isIsControl();

    @objid ("8e7cc294-7b41-4d39-b439-595860405f59")
    void setIsControl(boolean value);

    @objid ("44e413a0-f55f-427a-b930-c70a276b9a28")
    boolean isIsExpansion();

    @objid ("054e4a16-d6c1-427a-80f2-0a748cc25c7b")
    void setIsExpansion(boolean value);

    @objid ("c1acd249-4dad-4255-a493-893f0b76020e")
    Parameter getMatched();

    @objid ("86d374f6-86a0-407b-8b5f-988384d862ca")
    void setMatched(Parameter value);

}
