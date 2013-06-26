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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("00867d60-c4be-1fd8-97fe-001ec947cd2a")
public interface Element extends EObject, MObject {
    @objid ("59707b6d-f118-450a-a56e-38349f8d1531")
    EList<AbstractDiagram> getDiagramElement();

    @objid ("54e15cc7-a37a-4fe3-9cf2-650bdcfeffa8")
    <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass);

    @objid ("73a24d8f-b990-4147-96e1-fb1cc89d41ff")
    EList<NamespaceUse> getCausing();

    @objid ("a4bff643-cc92-47e7-beb5-a5c346eb7285")
    <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass);

}
