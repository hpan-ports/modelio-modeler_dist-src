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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * UseCaseDependency v0.0.9054
 * 
 * 
 * In Modelio, this specific metaclass has been created for the definition of these links. 
 * 
 * Two predefined Stereotypes are defined for this link: <extends>> and <<includes>>. 
 * 
 * UseCaseDependencies belong to their origin UseCase.
 */
@objid ("0058fd18-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCaseDependency extends ModelElement {
    @objid ("a8e36ac5-fc09-45f3-bac1-8d465f05f112")
    public static final String MNAME = "UseCaseDependency";

    /**
     * Getter for relation 'UseCaseDependency->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("af3741b7-f752-4a6f-a525-9ec74e603abb")
    UseCase getOrigin();

    /**
     * Setter for relation 'UseCaseDependency->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("36b14c95-8749-4734-8ad6-212af83fff29")
    void setOrigin(UseCase value);

    /**
     * Getter for relation 'UseCaseDependency->ExtensionLocation'
     * 
     * Metamodel description:
     * <i>An ordered list of extension points belonging to the extended use case, specifying where the respective behavioral fragments of the extending use case are to be inserted. The first fragment in the extending use case is associated with the first extension point in the list, the second fragment with the second point, and so on. (Note that, in most practical cases, the extending use case has just a single behavior fragment, so that the list of extension points is trivial.)</i>
     */
    @objid ("2a6a2f05-be11-43f1-99fc-798b10d3409a")
    EList<ExtensionPoint> getExtensionLocation();

    /**
     * Filtered Getter for relation 'UseCaseDependency->ExtensionLocation'
     * 
     * Metamodel description:
     * <i>An ordered list of extension points belonging to the extended use case, specifying where the respective behavioral fragments of the extending use case are to be inserted. The first fragment in the extending use case is associated with the first extension point in the list, the second fragment with the second point, and so on. (Note that, in most practical cases, the extending use case has just a single behavior fragment, so that the list of extension points is trivial.)</i>
     */
    @objid ("84f1efdc-a034-4c3c-80de-fc94f8c58907")
    <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'UseCaseDependency->Target'
     * 
     * Metamodel description:
     * <i>In a dependency between UseCases, this defines the link to the target UseCase.</i>
     */
    @objid ("d1750fec-449d-4bf2-b2d9-52ece7b6e01e")
    UseCase getTarget();

    /**
     * Setter for relation 'UseCaseDependency->Target'
     * 
     * Metamodel description:
     * <i>In a dependency between UseCases, this defines the link to the target UseCase.</i>
     */
    @objid ("5a643f85-3f90-4f5f-bcfd-d82faf641714")
    void setTarget(UseCase value);

}
