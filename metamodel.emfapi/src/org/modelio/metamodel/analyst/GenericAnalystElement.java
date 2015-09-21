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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.GenericAnalystContainer;

/**
 * GenericAnalystElement v0.0.9054
 * 
 * 
 * Analyst item that must be stereotyped.
 */
@objid ("b3e7a343-fe88-4eec-9078-87bfbbaaa3f0")
public interface GenericAnalystElement extends AnalystElement {
    @objid ("f4f25b97-4109-4eb2-adc2-1687d1113105")
    public static final String MNAME = "GenericAnalystElement";

    /**
     * Getter for relation 'GenericAnalystElement->SubElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eef66bb0-b8b4-4ea6-8a36-931112d75029")
    EList<GenericAnalystElement> getSubElement();

    /**
     * Filtered Getter for relation 'GenericAnalystElement->SubElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6dfa8d5f-6c0a-4d37-a252-e818c6ed2995")
    <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GenericAnalystElement->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ac96f71-f4d9-4545-9880-7bba6595d199")
    GenericAnalystContainer getOwnerContainer();

    /**
     * Setter for relation 'GenericAnalystElement->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9f779c79-f440-404f-9c05-693d6b701aa6")
    void setOwnerContainer(GenericAnalystContainer value);

    /**
     * Getter for relation 'GenericAnalystElement->ParentElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("72713acf-c170-4ef8-b18b-c0028e3c7dd0")
    GenericAnalystElement getParentElement();

    /**
     * Setter for relation 'GenericAnalystElement->ParentElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5024a25d-e08b-41fc-9bf8-19cf643d36dd")
    void setParentElement(GenericAnalystElement value);

    /**
     * Getter for relation 'GenericAnalystElement->LastElementVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9394d8d-f6fe-45df-99fa-ba2aefc34d56")
    GenericAnalystElement getLastElementVersion();

    /**
     * Setter for relation 'GenericAnalystElement->LastElementVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("205d3ea9-44f0-438e-82f1-f57ac111ef8b")
    void setLastElementVersion(GenericAnalystElement value);

    /**
     * Getter for relation 'GenericAnalystElement->ArchivedElementVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("843d23c1-da96-4a00-a421-b7e647e780bd")
    EList<GenericAnalystElement> getArchivedElementVersion();

    /**
     * Filtered Getter for relation 'GenericAnalystElement->ArchivedElementVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7727b700-08d3-4d33-a4ce-f9584165bd63")
    <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass);

}
