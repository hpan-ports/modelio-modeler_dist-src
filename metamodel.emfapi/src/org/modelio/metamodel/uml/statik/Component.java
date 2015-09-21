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
import org.modelio.metamodel.uml.statik.ComponentRealization;

/**
 * Component v0.0.9054
 * 
 * 
 * A Component defines its behavior in terms of ProvidedInterfaces and RequiredInterfaces. As such, a Component serves as a type, whose conformity is defined by these ProvidedInterfaces and RequiredInterfaces (encompassing both their static as well as dynamic semantics). One Component may therefore be substituted by another only if the two are type-conformant. 
 * 
 * Larger pieces of a system's functionality may be assembled by reusing Components as parts in an encompassing Component or assembly of Components, and wiring together their ProvidedInterfaces and RequiredInterfaces. 
 * 
 * A Component is modeled throughout the development life cycle and successively refined into deployment and run-time. 
 * 
 * A Component may be manifested by one or more Artifacts, and in turn, that Artifact may be deployed to its execution environment.    
 * 
 * A Component is a subtype of Class, and can have Attributes and Operations, and is able to participate in Associations and Generalizations. A Component may form the Abstraction for a set of realizing Classifiers that realize its behavior. 
 * 
 * A Component may optionally have an internal structure and own a set of Ports that formalize its interaction points.  
 * 
 * A Component has a number of ProvidedInterfaces and RequiredInterfaces, that form the basis for wiring components together, either using Dependencies or Connectors. A ProvidedInterface is one that is either implemented directly by the Component or one of its realizing Classifiers, or it is the type of a provided Port of the Component. A RequiredInterface is designated by a Usage Dependency from the Component or one of its realizing Classifiers, or it is the type of a required Port. 
 * 
 * A Component is extended to define the grouping aspects of packaging Components. This defines the NameSpace aspects of a Component through its inherited ownedMember and elementImport associations. In a Component's NameSpace, all ModelElements that are involved in or related to its definition are either owned or imported explicitly. This may include, for example, UseCases and Dependencies (for example, mappings), Packages, Components and Artifacts.
 */
@objid ("000509f6-c4bf-1fd8-97fe-001ec947cd2a")
public interface Component extends Class {
    @objid ("93ed6c37-7128-4818-a500-9aa145cea5a1")
    public static final String MNAME = "Component";

    /**
     * Getter for relation 'Component->Realization'
     * 
     * Metamodel description:
     * <i>Specifies the Classifier to which it can be substituted.</i>
     */
    @objid ("a45af589-2b89-4ae8-bbae-c46213060cab")
    EList<ComponentRealization> getRealization();

    /**
     * Filtered Getter for relation 'Component->Realization'
     * 
     * Metamodel description:
     * <i>Specifies the Classifier to which it can be substituted.</i>
     */
    @objid ("63fa6f44-7ffe-4a08-a8b1-391cc706e6ce")
    <T extends ComponentRealization> List<T> getRealization(java.lang.Class<T> filterClass);

}
