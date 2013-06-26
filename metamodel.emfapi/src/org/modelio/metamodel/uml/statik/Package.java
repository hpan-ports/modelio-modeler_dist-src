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
    @objid ("c360f292-e498-4993-8a70-ef088f1654a3")
    boolean isIsInstantiable();

    @objid ("cee8b9f5-1d02-4ca4-90d2-3e2fba6742ae")
    void setIsInstantiable(boolean value);

    @objid ("28ff5dd2-cd93-435d-9926-d06a099d352a")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("4ff51316-3e78-4a23-8d91-7b5751384a2b")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("d0aaf878-0c68-4865-8aa4-cfa828ea4461")
    EList<PackageMerge> getReceivingMerge();

    @objid ("0c358097-9517-4bfe-bd64-e7b79fcad8e7")
    <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass);

    @objid ("da2fa0e1-c211-4d25-95ae-accfcc0f02a7")
    Project getRepresented();

    @objid ("d39dc2d5-cc6c-4448-a8af-7c5a5a35f634")
    void setRepresented(Project value);

    @objid ("3580b512-092f-4b4b-bba3-99462d554702")
    EList<PackageMerge> getMerge();

    @objid ("fc1f4b39-1820-4878-976a-d8bd093a35bc")
    <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass);

    @objid ("345e74b4-f271-4e60-8c8b-09fe44ecca12")
    EList<PackageImport> getPackageImporting();

    @objid ("90e9b4cf-29f2-48db-ac23-0e58cfad2f36")
    <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass);

}
