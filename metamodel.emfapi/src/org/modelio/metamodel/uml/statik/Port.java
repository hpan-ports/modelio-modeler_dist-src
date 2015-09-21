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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

/**
 * Port v0.0.9054
 * 
 * 
 * (UML 2.0) Ports are connected to other Parts through Connectors through which requests can be made to invoke the behavioral Features of a Classifier. 
 * 
 * A Port may specify the services a Classifier offers to its environment, as well as the services that a Classifier expects of its environment.  
 * 
 * In Modelio, Ports are declared on Classes (UML 2.0 structured Classifiers) by creating them in the Class's internal structure. These Ports can then be shown on Instances of the Class, by creating Port instances in the Class instances, and by binding these Port instances to the Ports defined at Class level.  
 * 
 * In Modelio, a Port always belongs to a Class, a Component or a Signal.
 */
@objid ("0018a768-c4bf-1fd8-97fe-001ec947cd2a")
public interface Port extends BindableInstance {
    @objid ("9bf77176-d381-45ab-bcd5-b07b46fa71dc")
    public static final String MNAME = "Port";

    /**
     * Getter for attribute 'Port.IsBehavior'
     * 
     * Metamodel description:
     * <i>Specifies whether requests arriving at this Port are sent to the Classifier behavior of this Classifier. Such Ports are referred to as behavior Port. 
     * 
     * Any invocation of a behavioral feature targeted at a behavior Port will be handled by the instance of the owning Classifier itself, rather than by any instances that this Classifier may contain. 
     * 
     * The default value is false.</i>
     */
    @objid ("0066f2aa-b561-43d7-a37e-e77ac68de91e")
    boolean isIsBehavior();

    /**
     * Setter for attribute 'Port.IsBehavior'
     * 
     * Metamodel description:
     * <i>Specifies whether requests arriving at this Port are sent to the Classifier behavior of this Classifier. Such Ports are referred to as behavior Port. 
     * 
     * Any invocation of a behavioral feature targeted at a behavior Port will be handled by the instance of the owning Classifier itself, rather than by any instances that this Classifier may contain. 
     * 
     * The default value is false.</i>
     */
    @objid ("91c82c6f-8840-475d-aaf1-863352a8fa47")
    void setIsBehavior(boolean value);

    /**
     * Getter for attribute 'Port.IsService'
     * 
     * Metamodel description:
     * <i>If true, indicates that this Port is used to provide the published functionality of a Classifier. If false, this Port is used to implement the Classifier but is not part of the essential externally-visible functionality of the Classifier and can, therefore, be altered or deleted along with the internal implementation of the Classifier and other properties that are considered part of its implementation. 
     * 
     * The default value for this attribute is true.</i>
     */
    @objid ("20ddaf4a-3392-4848-8538-e7cd9d7ccb8b")
    boolean isIsService();

    /**
     * Setter for attribute 'Port.IsService'
     * 
     * Metamodel description:
     * <i>If true, indicates that this Port is used to provide the published functionality of a Classifier. If false, this Port is used to implement the Classifier but is not part of the essential externally-visible functionality of the Classifier and can, therefore, be altered or deleted along with the internal implementation of the Classifier and other properties that are considered part of its implementation. 
     * 
     * The default value for this attribute is true.</i>
     */
    @objid ("556cbee3-9133-4c98-b4e4-4c2642182f2b")
    void setIsService(boolean value);

    /**
     * Getter for attribute 'Port.IsConjugated'
     * 
     * Metamodel description:
     * <i>Specifies the way that the provided and required interfaces are derived from the Port's Type.  The default value is false.</i>
     */
    @objid ("30717880-1aad-420c-a148-48bf1e002551")
    boolean isIsConjugated();

    /**
     * Setter for attribute 'Port.IsConjugated'
     * 
     * Metamodel description:
     * <i>Specifies the way that the provided and required interfaces are derived from the Port's Type.  The default value is false.</i>
     */
    @objid ("76f89fb6-2711-47eb-a070-568928df895f")
    void setIsConjugated(boolean value);

    /**
     * Getter for attribute 'Port.Direction'
     * 
     * Metamodel description:
     * <i>Specifies the way that the provided and required interfaces are derived from the Port's Type.  The default value is false.</i>
     */
    @objid ("61e7ea0d-c8ec-4280-95f6-9b9dc8676e86")
    PortOrientation getDirection();

    /**
     * Setter for attribute 'Port.Direction'
     * 
     * Metamodel description:
     * <i>Specifies the way that the provided and required interfaces are derived from the Port's Type.  The default value is false.</i>
     */
    @objid ("cdc3dd11-209a-40d9-8548-ad1dac4d5659")
    void setDirection(PortOrientation value);

    /**
     * Getter for relation 'Port->Provided'
     * 
     * Metamodel description:
     * <i>References the Interfaces specifying the set of operations and receptions which the Classifier provides to its environment, and which it will handle either directly or by forwarding it to a part of its internal structure.</i>
     */
    @objid ("90e504cf-93d0-4edd-98e8-e76e3acf6ffc")
    EList<ProvidedInterface> getProvided();

    /**
     * Filtered Getter for relation 'Port->Provided'
     * 
     * Metamodel description:
     * <i>References the Interfaces specifying the set of operations and receptions which the Classifier provides to its environment, and which it will handle either directly or by forwarding it to a part of its internal structure.</i>
     */
    @objid ("1852deb8-6f51-4bcb-b4e7-e478da93e0b2")
    <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Port->Required'
     * 
     * Metamodel description:
     * <i>References the Interfaces specifying the set of operations and receptions which the Classifier expects its environment to handle.</i>
     */
    @objid ("3876c140-4cb4-4bca-af44-c3ca198af770")
    EList<RequiredInterface> getRequired();

    /**
     * Filtered Getter for relation 'Port->Required'
     * 
     * Metamodel description:
     * <i>References the Interfaces specifying the set of operations and receptions which the Classifier expects its environment to handle.</i>
     */
    @objid ("8d47f8aa-4de1-4d82-9206-ac2e5133bf38")
    <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass);

}
