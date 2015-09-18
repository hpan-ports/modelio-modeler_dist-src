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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;

@objid ("001529ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface Package extends NameSpace {
    @objid ("00a26720-6419-4ff5-bb3b-600d555d0392")
    boolean isIsInstantiable();

    @objid ("eb71d158-6ae3-4c17-8584-1849150b54b5")
    void setIsInstantiable(boolean value);

    @objid ("890e8985-1f46-4d06-9cb5-9cf7e022db00")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("fbd4f2bf-0a2e-43c2-9ecb-5d0ce174fef2")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("3f4af0b9-9f97-405b-8fcb-1f8c4c00ab28")
    EList<PackageMerge> getReceivingMerge();

    @objid ("328c7be4-1411-422b-ad6d-c15d444e8ac4")
    <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass);

    @objid ("cef8ca31-b1b9-4034-ac3b-6fea6650f1f4")
    Project getRepresented();

    @objid ("630071b9-9bb8-4c5b-93f3-9efed56eacdc")
    void setRepresented(Project value);

    @objid ("2c9bb0a0-5666-4980-b6fa-2c171178ed02")
    EList<PackageMerge> getMerge();

    @objid ("fced4aa6-746e-4687-a445-211ee84ec62f")
    <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass);

    @objid ("48b09cc8-aba2-4912-8285-abd26da77845")
    EList<PackageImport> getPackageImporting();

    @objid ("71343f35-2871-4978-8aa4-685ff4151a20")
    <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass);

}
