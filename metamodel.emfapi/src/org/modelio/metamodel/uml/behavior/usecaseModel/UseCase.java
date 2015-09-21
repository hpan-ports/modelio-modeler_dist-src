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
package org.modelio.metamodel.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * UseCase v0.0.9054
 * 
 * 
 * A UseCase is expressed by sequences of Messages exchanged by system units and one or more Actors of the system. 
 * 
 * The definition of a UseCase includes all of the Behavior that it entails. This Behavior can be expressed by sequence diagrams, activity diagrams, Object diagrams, and so on. 
 * 
 * UseCases are structured by Packages, and have cooperation links with Actors. 
 * 
 * UseCases belong to a NameSpace.
 */
@objid ("00588716-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCase extends GeneralClass {
    @objid ("c3102be6-e4c7-4aaf-ab59-7213a8a31e87")
    public static final String MNAME = "UseCase";

    /**
     * Getter for relation 'UseCase->Used'
     * 
     * Metamodel description:
     * <i>In dependencies between UseCases, this defines the link to the UseCaseDependency association.</i>
     */
    @objid ("e8f01d44-6a7a-4a8b-aca4-edcafd214d34")
    EList<UseCaseDependency> getUsed();

    /**
     * Filtered Getter for relation 'UseCase->Used'
     * 
     * Metamodel description:
     * <i>In dependencies between UseCases, this defines the link to the UseCaseDependency association.</i>
     */
    @objid ("01f2d3d7-65d3-47a8-be2f-1dc2c37595d8")
    <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'UseCase->OwnedExtension'
     * 
     * Metamodel description:
     * <i>References the ExtensionPoints owned by the use case.</i>
     */
    @objid ("2542aba2-5f8c-4a03-bc88-33bdccd1cd9b")
    EList<ExtensionPoint> getOwnedExtension();

    /**
     * Filtered Getter for relation 'UseCase->OwnedExtension'
     * 
     * Metamodel description:
     * <i>References the ExtensionPoints owned by the use case.</i>
     */
    @objid ("7a32ecee-602a-4b6c-9409-8ef526f407c7")
    <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'UseCase->User'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a0a22764-a275-4cc1-8087-3e44b175dc82")
    EList<UseCaseDependency> getUser();

    /**
     * Filtered Getter for relation 'UseCase->User'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("38bdd44e-e11a-4b55-b419-5a8ac63a434f")
    <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass);

}
