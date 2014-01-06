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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

@objid ("00889ec4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCatchEvent extends BpmnEvent {
    @objid ("77a680e8-3949-4e06-9c70-3e633f9a9221")
    boolean isParallelMultiple();

    @objid ("8fe9ca47-b4aa-4a38-b961-f17f43ced304")
    void setParallelMultiple(boolean value);

    @objid ("b3f2f606-2113-41cd-9d69-91605eed3b97")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("5104d380-11b1-4071-ac12-1f4cbab4e714")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("060b8e67-de95-4fae-869a-c4ed5a52edb1")
    BpmnDataOutput getDataOutput();

    @objid ("96464f72-52ac-436d-9cd1-b084eb8ab138")
    void setDataOutput(BpmnDataOutput value);

}
