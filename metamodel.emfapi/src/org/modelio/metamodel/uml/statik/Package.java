/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;

/**
 * Package v0.0.9054
 * 
 * 
 * The Package is the main structuring unit in a model. It defines a hierarchy that breaks down a Model. 
 * 
 * Packages can contain Packages, Classifiers, and so on. 
 * 
 * A Package belongs to its parent Package, represented as a NameSpace in the metamodel, except for the rootPackage, which belongs to a Project.
 */
@objid ("001529ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface Package extends NameSpace {
    @objid ("25252c74-e946-4864-8f29-50c7488d9483")
    public static final String MNAME = "Package";

    /**
     * Getter for attribute 'Package.IsInstantiable'
     * 
     * Metamodel description:
     * <i>This attribute should be discarded. It remains for backward compatibility reasons. A package is not instanciable in UML 2.0.</i>
     */
    @objid ("e0bb4410-2c08-49b9-8041-95b78d269b68")
    boolean isIsInstantiable();

    /**
     * Setter for attribute 'Package.IsInstantiable'
     * 
     * Metamodel description:
     * <i>This attribute should be discarded. It remains for backward compatibility reasons. A package is not instanciable in UML 2.0.</i>
     */
    @objid ("2aebfb51-2871-4cce-8ebc-b96e863ccf5e")
    void setIsInstantiable(boolean value);

    /**
     * Getter for relation 'Package->BpmnRepresents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aab933fc-3749-46af-87a1-40d1e3db7b0c")
    EList<BpmnParticipant> getBpmnRepresents();

    /**
     * Filtered Getter for relation 'Package->BpmnRepresents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ac004625-32f2-4b9e-a84d-14c4ba39d171")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Package->ReceivingMerge'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b52c927d-5a2f-448d-9b4a-06ce416d34ca")
    EList<PackageMerge> getReceivingMerge();

    /**
     * Filtered Getter for relation 'Package->ReceivingMerge'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6aa9a42c-7ea4-4be9-9e26-c8d6e835af8c")
    <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Package->Represented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("484d44b3-0a20-4dcf-9511-5055da68a29f")
    Project getRepresented();

    /**
     * Setter for relation 'Package->Represented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("83dc89ef-618a-4c85-92bd-2f128f29b91b")
    void setRepresented(Project value);

    /**
     * Getter for relation 'Package->Merge'
     * 
     * Metamodel description:
     * <i>Merge relation between Packages. Corresponds to UML 2.0 merge semantics.</i>
     */
    @objid ("effd2e25-a3b2-4146-84d5-d053e240b0cc")
    EList<PackageMerge> getMerge();

    /**
     * Filtered Getter for relation 'Package->Merge'
     * 
     * Metamodel description:
     * <i>Merge relation between Packages. Corresponds to UML 2.0 merge semantics.</i>
     */
    @objid ("43ccdaa9-64c1-4eac-8f31-532c2dc1d0c7")
    <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Package->PackageImporting'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("40c8cdc2-7989-4360-91f1-e933a0b6fcdf")
    EList<PackageImport> getPackageImporting();

    /**
     * Filtered Getter for relation 'Package->PackageImporting'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("154f8032-9bdb-48b8-afff-cb2b945e5fb1")
    <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass);

}
