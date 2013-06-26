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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;

@objid ("0031bab4-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionRegion extends StructuredActivityNode {
    @objid ("cf6a83d3-520f-4c82-a1fd-e75e2cc04f57")
    ExpansionKind getMode();

    @objid ("26762340-bde6-4e60-8d70-f047def8f48f")
    void setMode(ExpansionKind value);

    @objid ("43cda049-bfbb-4464-b46d-96b707c17833")
    EList<ExpansionNode> getOutputElement();

    @objid ("9118f97f-da10-4b02-8e41-8ead535d460b")
    <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass);

    @objid ("fe4f2dbd-4f20-47c7-aed2-751ee846cf88")
    EList<ExpansionNode> getInputElement();

    @objid ("ffcf7ead-ef23-4b92-bb22-07651484c426")
    <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass);

}
