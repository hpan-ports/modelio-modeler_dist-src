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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

/**
 * NaryLinkEnd v0.0.9054
 * 
 * 
 * Nouvelle Class :
 * Extrémité de lien en contact avec une instance. Participe à la définition d'une occurence d'association.\CR\
 * Appartient à une Instance, est associé à un Link et représente une AssociationEnd.\CR\
 *    
 */
@objid ("00749ece-17e8-10a1-88a0-001ec947cd2a")
public interface NaryLinkEnd extends ModelElement {
    @objid ("1441b81e-2b71-492f-8ae5-645e0a1b99c9")
    public static final String MNAME = "NaryLinkEnd";

    /**
     * Getter for attribute 'NaryLinkEnd.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a5d9b549-a11a-49e0-9752-f12b0534504e")
    boolean isIsOrdered();

    /**
     * Setter for attribute 'NaryLinkEnd.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f35459f5-6f51-470d-8677-73366d2a0aad")
    void setIsOrdered(boolean value);

    /**
     * Getter for attribute 'NaryLinkEnd.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("18dc02e9-9d21-4212-aa4d-9c77e2e59354")
    boolean isIsUnique();

    /**
     * Setter for attribute 'NaryLinkEnd.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("13ad476c-9e2a-4ae4-9e0b-780fb9b9aab1")
    void setIsUnique(boolean value);

    /**
     * Getter for attribute 'NaryLinkEnd.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("37a06946-f29a-4a65-9265-e04fb643c859")
    String getMultiplicityMax();

    /**
     * Setter for attribute 'NaryLinkEnd.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d19e4553-2f89-4dd3-a120-f2ca1ef3988c")
    void setMultiplicityMax(String value);

    /**
     * Getter for attribute 'NaryLinkEnd.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c931868b-0a86-41bb-a3b0-8837a90acca8")
    String getMultiplicityMin();

    /**
     * Setter for attribute 'NaryLinkEnd.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("099d85d6-7a4e-496b-9059-55f10dfddacd")
    void setMultiplicityMin(String value);

    /**
     * Getter for relation 'NaryLinkEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eb05dad8-cb4e-4e64-9f32-4246e9f285c8")
    Instance getSource();

    /**
     * Setter for relation 'NaryLinkEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4b2628c4-55cb-455a-802f-ae2b4293eb19")
    void setSource(Instance value);

    /**
     * Getter for relation 'NaryLinkEnd->NaryLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e1a34f74-854f-450b-9947-05b7fd9ff2ec")
    NaryLink getNaryLink();

    /**
     * Setter for relation 'NaryLinkEnd->NaryLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c0ce7871-d992-46a4-bb37-dd59ffb18342")
    void setNaryLink(NaryLink value);

    /**
     * Getter for relation 'NaryLinkEnd->Consumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fdfb7805-281e-4be7-9927-0116c98c0d9c")
    RequiredInterface getConsumer();

    /**
     * Setter for relation 'NaryLinkEnd->Consumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("119a3ea0-d518-497c-b075-8d9260846c89")
    void setConsumer(RequiredInterface value);

    /**
     * Getter for relation 'NaryLinkEnd->Provider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("63a1277c-7628-4cfc-a791-88032befcfc3")
    ProvidedInterface getProvider();

    /**
     * Setter for relation 'NaryLinkEnd->Provider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("52e5efd5-b213-42fe-a689-a35db37e1647")
    void setProvider(ProvidedInterface value);

}
