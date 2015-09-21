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
package org.modelio.metamodel.uml.informationFlow;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.statik.Classifier;

/**
 * InformationItem v0.0.9054
 * 
 * 
 * An information item is an abstraction of all kinds of information that can be exchanged between objects. It is a kind of classifier intended for representing information in a very abstract way, one which cannot be instantiated.
 * 
 * One purpose of information items is to be able to define preliminary models, before having made detailed modeling decisions on types or structures. Another purpose of information items and information flows is to abstract complex models by a less precise but more general representation of the information exchanged between entities of a system.
 * 
 * The Classifiers that can realize an information item can only be of the following kind: Class, Interface, InformationItem, Signal, Component.
 */
@objid ("0063e890-c4bf-1fd8-97fe-001ec947cd2a")
public interface InformationItem extends Classifier {
    @objid ("94f4ef95-032d-4fb2-a83e-a25c177594fb")
    public static final String MNAME = "InformationItem";

    /**
     * Getter for relation 'InformationItem->Represented'
     * 
     * Metamodel description:
     * <i>Determines the classifiers that will specify the structure and nature of the information. 
     * An information item represents all its represented classifiers.</i>
     */
    @objid ("a7e5fedf-efb4-4cba-9091-54a4744d0b8e")
    EList<Classifier> getRepresented();

    /**
     * Filtered Getter for relation 'InformationItem->Represented'
     * 
     * Metamodel description:
     * <i>Determines the classifiers that will specify the structure and nature of the information. 
     * An information item represents all its represented classifiers.</i>
     */
    @objid ("bbd137f7-9c4f-4cc2-a8f4-85179c2ccfae")
    <T extends Classifier> List<T> getRepresented(java.lang.Class<T> filterClass);

}
