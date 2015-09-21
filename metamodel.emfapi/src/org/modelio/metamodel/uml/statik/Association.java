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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;

/**
 * Association v0.0.9054
 * 
 * 
 * An Association describes discrete connections among objects or other instances in a system.  An Association is often established between two Classes (binary associations), but can be established between several Classes (n-ary associations). 
 * 
 * An Association can be related to a ClassAssociation that may, for example, provide Attributes and Operations.  The connections to the associated Classes are specified through the AssociationEnd metaclass.  The AssociationEnd metaclass will provide the properties of an Association, such as cardinalities, navigability, and so on. Aggregation is a specific case of an Association. 
 * 
 * In Modelio, an Association physically belongs to no other elements. It has a specific way of behaving during transfer and copy/paste operations, depending on whether the connected Classes are transferred in conjunction or not.
 */
@objid ("28f7c9fd-bee9-46f0-8969-5c46572cec86")
public interface Association extends ModelElement {
    @objid ("2381bb25-02cc-4d3b-8a4b-7f22c6088540")
    public static final String MNAME = "Association";

    /**
     * Getter for relation 'Association->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c041286e-8adb-47a2-acfa-5dc8a38fd107")
    EList<Link> getOccurence();

    /**
     * Filtered Getter for relation 'Association->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d0a9ff9-9f1e-4374-a0c6-c6ad9da4240d")
    <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Association->End'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5edbaf36-2157-4e5a-8ca3-dfe17af60480")
    EList<AssociationEnd> getEnd();

    /**
     * Filtered Getter for relation 'Association->End'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c83b0f5e-e368-4730-810a-6573307f51f3")
    <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Association->LinkToClass'
     * 
     * Metamodel description:
     * <i>Specifies a ClassAssociation that may be related to the Association.</i>
     */
    @objid ("d78cb962-3c84-4658-bb7a-78d7c746ebad")
    ClassAssociation getLinkToClass();

    /**
     * Setter for relation 'Association->LinkToClass'
     * 
     * Metamodel description:
     * <i>Specifies a ClassAssociation that may be related to the Association.</i>
     */
    @objid ("d81eb947-6b61-473f-b3a2-0eba92efc2b1")
    void setLinkToClass(ClassAssociation value);

}
