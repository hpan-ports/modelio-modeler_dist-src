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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;

/**
 * InterfaceRealization v0.0.9054
 * 
 * 
 *  In Modelio, a Realization belongs to its Classifier.
 */
@objid ("000ee2e6-c4bf-1fd8-97fe-001ec947cd2a")
public interface InterfaceRealization extends ModelElement {
    @objid ("c1547192-5080-4da6-b187-e8e0b494524d")
    public static final String MNAME = "InterfaceRealization";

    /**
     * Getter for relation 'InterfaceRealization->Implemented'
     * 
     * Metamodel description:
     * <i>End of the implementation link toward an Interface.</i>
     */
    @objid ("d878cf66-10dd-4259-ae5f-7485ea7cb56b")
    Interface getImplemented();

    /**
     * Setter for relation 'InterfaceRealization->Implemented'
     * 
     * Metamodel description:
     * <i>End of the implementation link toward an Interface.</i>
     */
    @objid ("ea252f17-d0d5-433b-9fea-e45fc1367838")
    void setImplemented(Interface value);

    /**
     * Getter for relation 'InterfaceRealization->Implementer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cc6ecee1-c942-4a71-ae7b-33c499faa2e5")
    NameSpace getImplementer();

    /**
     * Setter for relation 'InterfaceRealization->Implementer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("49f55860-3e38-40e6-a9fd-86f96e0e36a8")
    void setImplementer(NameSpace value);

}
