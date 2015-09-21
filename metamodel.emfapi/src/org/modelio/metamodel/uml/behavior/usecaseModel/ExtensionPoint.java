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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * ExtensionPoint v0.0.9054
 * 
 * 
 * An extension point identifies a point in the behavior of a use case where that behavior can be extended by the behavior of some other (extending) use case, as specified by an extend relationship.
 * 
 * An ExtensionPoint is a feature of a use case that identifies a point where the behavior of a use case can be augmented with elements of another (extending) use case. 
 */
@objid ("00598058-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExtensionPoint extends ModelElement {
    @objid ("4f313d2f-3e6d-486f-b9ed-8453f1773b1c")
    public static final String MNAME = "ExtensionPoint";

    /**
     * Getter for attribute 'ExtensionPoint.Visibility'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("a18ed059-6d0e-490b-afab-fbf5678d5c21")
    VisibilityMode getVisibility();

    /**
     * Setter for attribute 'ExtensionPoint.Visibility'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("ff4bee9d-6e0b-4d82-8a8b-49495bd69afc")
    void setVisibility(VisibilityMode value);

    /**
     * Getter for relation 'ExtensionPoint->Extended'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67f45b9a-dc33-43df-8a40-50b4e0919a42")
    EList<UseCaseDependency> getExtended();

    /**
     * Filtered Getter for relation 'ExtensionPoint->Extended'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("505766e7-8ba7-41ba-b35f-2024c7dc224c")
    <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ExtensionPoint->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d8eda092-719b-4346-8df2-7db887f5d282")
    UseCase getOwner();

    /**
     * Setter for relation 'ExtensionPoint->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("590bf829-315d-458b-933b-45f8872572de")
    void setOwner(UseCase value);

}
