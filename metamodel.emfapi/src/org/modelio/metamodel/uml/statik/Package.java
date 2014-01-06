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
    @objid ("5af040d5-e5cb-4725-808a-634975872729")
    boolean isIsInstantiable();

    @objid ("85d49a23-b72c-4b7d-a725-de0f3d488989")
    void setIsInstantiable(boolean value);

    @objid ("dd56a0ff-b9e3-4ab8-9109-9b0d88b8e434")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("4e1493d5-81ce-485a-9deb-e6560f7f6fad")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("5f29a995-1db4-4b81-aa3f-5faa05041bae")
    EList<PackageMerge> getReceivingMerge();

    @objid ("47366b31-5468-4293-92bb-2658bdee1631")
    <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass);

    @objid ("db892bb1-ea30-4203-a2f2-d55cfce02742")
    Project getRepresented();

    @objid ("93804844-3e73-4d6f-89f6-88d6d09cb3bc")
    void setRepresented(Project value);

    @objid ("f1c70880-9546-4f50-b3ee-83f400fc4d1d")
    EList<PackageMerge> getMerge();

    @objid ("ab26540c-f90e-4fad-9664-7fc82119a6c6")
    <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass);

    @objid ("e76ac21a-1161-4bca-9e00-24a02e60c194")
    EList<PackageImport> getPackageImporting();

    @objid ("160fab26-d92a-4940-99d7-054f16cdc93d")
    <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass);

}
