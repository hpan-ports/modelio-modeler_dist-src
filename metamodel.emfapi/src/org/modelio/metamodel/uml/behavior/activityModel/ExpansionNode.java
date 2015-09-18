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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;

@objid ("00311a8c-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionNode extends ObjectNode {
    @objid ("68ace89f-670a-4911-b106-2a6c063dc553")
    ExpansionRegion getRegionAsOutput();

    @objid ("6cf5c8fc-3757-4465-b5ec-43f321dbd925")
    void setRegionAsOutput(ExpansionRegion value);

    @objid ("2d007806-d531-4f19-b7c8-f1a53790dbe2")
    ExpansionRegion getRegionAsInput();

    @objid ("c8d1e9a0-36c6-4333-ac53-5a651383a9c6")
    void setRegionAsInput(ExpansionRegion value);

}
