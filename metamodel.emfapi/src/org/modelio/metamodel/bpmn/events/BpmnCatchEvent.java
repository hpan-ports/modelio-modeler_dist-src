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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

@objid ("00889ec4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCatchEvent extends BpmnEvent {
    @objid ("502e9f74-0dee-4b8f-8679-c756fd866c8b")
    boolean isParallelMultiple();

    @objid ("4e6ab18d-6464-4b11-9143-3d2ae2cde1dc")
    void setParallelMultiple(boolean value);

    @objid ("8095a911-d845-42c1-808e-a91239c1cbbe")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("e3093bbb-5738-4d2c-912a-b84c69a956a3")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("4f01f37f-1707-4aa8-89cf-681defee6f86")
    BpmnDataOutput getDataOutput();

    @objid ("af8f28b0-d4c9-4092-8087-5316a8f35aed")
    void setDataOutput(BpmnDataOutput value);

}
