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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * Collaboration v0.0.9054
 * 
 * 
 * (UML 2.0) A Collaboration is represented as a kind of Classifier, and defines a set of cooperating entities to be played by instances (its roles), as well as a set of Connectors that define Links between the participating instances. The cooperating entities are the properties of the Collaboration. 
 * 
 * A Collaboration is not instanciable. A Collaboration specifies a view (or projection) of a set of cooperating Classifiers. It describes the required Links between instances that play the roles of the Collaboration, as well as the Features required of the Classifiers that specify the participating instances. Several Collaborations may describe different projections of the same set of Classifiers. 
 * 
 * In Modelio, Collaborations have the same meaning. Modelio extends them, by allowing them to directly bind Parts and Connectors to other ModelElements. This means that a bound Collaboration can be directly entered.   
 * 
 * In Modelio, a Collaboration belongs to a UseCase, a Class, a Package, a Collaboration or an Operation.
 */
@objid ("0003f692-c4bf-1fd8-97fe-001ec947cd2a")
public interface Collaboration extends NameSpace {
    @objid ("d7fd9c36-f958-45fe-8ce7-fbcb0df2af04")
    public static final String MNAME = "Collaboration";

    /**
     * Getter for attribute 'Collaboration.IsConcurrent'
     * 
     * Metamodel description:
     * <i>Expresses if the Collaboration between objects is concurrent or sequential.</i>
     */
    @objid ("06ab9f36-56b7-41db-b653-6501adbef3c3")
    boolean isIsConcurrent();

    /**
     * Setter for attribute 'Collaboration.IsConcurrent'
     * 
     * Metamodel description:
     * <i>Expresses if the Collaboration between objects is concurrent or sequential.</i>
     */
    @objid ("b3965ad9-e3df-4caa-abfa-68d1b3a84092")
    void setIsConcurrent(boolean value);

    /**
     * Getter for relation 'Collaboration->ORepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9f258d4-b507-44b4-9a3a-40bfe3e8ae03")
    Operation getORepresented();

    /**
     * Setter for relation 'Collaboration->ORepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("40a0cb47-b408-4e3b-a62f-dcaceb3cf77f")
    void setORepresented(Operation value);

    /**
     * Getter for relation 'Collaboration->BRepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7c3e093e-9ac2-4f08-a287-69b598196722")
    Behavior getBRepresented();

    /**
     * Setter for relation 'Collaboration->BRepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ac7587be-74f0-4906-9791-87bbdff944f7")
    void setBRepresented(Behavior value);

    /**
     * Getter for relation 'Collaboration->Occurrence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dc4a88dd-5e9c-4cee-a02f-43aea319e10c")
    EList<CollaborationUse> getOccurrence();

    /**
     * Filtered Getter for relation 'Collaboration->Occurrence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9c14514f-c907-4e05-8671-b1e015df2177")
    <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass);

}
