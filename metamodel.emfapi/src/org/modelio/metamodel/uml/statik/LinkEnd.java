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
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

/**
 * LinkEnd v0.0.9054
 * 
 * 
 * A LinkEnd is the part of a Link that connects to an Instance. It corresponds to an AssociationEnd of an Association. 
 * 
 * In UML 2.0, LinkEnds are implemented as slots. 
 * 
 * A LinkEnd belongs to a Link.
 */
@objid ("000fb1bc-c4bf-1fd8-97fe-001ec947cd2a")
public interface LinkEnd extends ModelElement {
    @objid ("247597e3-22f7-493e-a505-262a2c3f7a84")
    public static final String MNAME = "LinkEnd";

    /**
     * Get the 'graphical owner' related to this end.
     * The owner is the current source or the opposite end's target according to the navigability.
     */
    @objid ("8b942215-f0a1-454e-9f8a-596315ee40d5")
    Instance getOwner();

    @objid ("006058b0-2963-1080-943a-001ec947cd2a")
    void setTarget(final Instance value, final boolean fixModel);

    @objid ("006059f0-2963-1080-943a-001ec947cd2a")
    void setSource(final Instance value, final boolean fixModel);

    /**
     * Sets both ends sources and targets according to the given navigability.
     * <ul>
     * <li>THISSIDE: only current source and target must be filled.</li>
     * <li>OHERSIDE: only opposite source and target must be filled.</li>
     * <li>BOTHSIDES: current source must be equals to opposite target as well as current target and opposite source.</li>
     * <li>NONE: both sources must be filled, but no target</li>
     * </ul>
     * @param value whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("50d3075c-1fcb-4a03-a648-16729171986f")
    void setNavigable(boolean value);

    @objid ("6d12e031-ad22-449a-9171-6a88d4158b48")
    boolean isNavigable();

    /**
     * Getter for attribute 'LinkEnd.IsOrdered'
     * 
     * Metamodel description:
     * <i>Determines if this LinkEnd is ordered.</i>
     */
    @objid ("2e82b3a2-33f7-482a-87ae-7be9f41f9494")
    boolean isIsOrdered();

    /**
     * Setter for attribute 'LinkEnd.IsOrdered'
     * 
     * Metamodel description:
     * <i>Determines if this LinkEnd is ordered.</i>
     */
    @objid ("7bd8c21e-84d8-44dd-8922-4b6c83975895")
    void setIsOrdered(boolean value);

    /**
     * Getter for attribute 'LinkEnd.IsUnique'
     * 
     * Metamodel description:
     * <i>Determines if this LinkEnd is unique.</i>
     */
    @objid ("019b2662-3766-4922-8a47-02e34bf38886")
    boolean isIsUnique();

    /**
     * Setter for attribute 'LinkEnd.IsUnique'
     * 
     * Metamodel description:
     * <i>Determines if this LinkEnd is unique.</i>
     */
    @objid ("2991d806-fcad-43bf-b4b7-39c503f59f52")
    void setIsUnique(boolean value);

    /**
     * Getter for attribute 'LinkEnd.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum value of the Link's multiplicity.</i>
     */
    @objid ("e378b34c-5485-48d2-aeca-a8baca6c28b0")
    String getMultiplicityMax();

    /**
     * Setter for attribute 'LinkEnd.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum value of the Link's multiplicity.</i>
     */
    @objid ("a2e2d457-2bac-4451-b16c-b5613b73ed86")
    void setMultiplicityMax(String value);

    /**
     * Getter for attribute 'LinkEnd.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum value of the Link's multiplicity. When placed on a target end, the multiplicity specifies the number of target instances that may be associated with a single source instance across the given Link.</i>
     */
    @objid ("4519670a-2a8d-4b04-a1f4-018b0f78ac70")
    String getMultiplicityMin();

    /**
     * Setter for attribute 'LinkEnd.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum value of the Link's multiplicity. When placed on a target end, the multiplicity specifies the number of target instances that may be associated with a single source instance across the given Link.</i>
     */
    @objid ("0c7d9489-d5ac-4e80-925e-41d84d87deb4")
    void setMultiplicityMin(String value);

    /**
     * Getter for relation 'LinkEnd->Link'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fb880f26-5293-4642-8932-ca134062d620")
    Link getLink();

    /**
     * Setter for relation 'LinkEnd->Link'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ecf91e49-de5b-431e-ac25-7a4ca63439c6")
    void setLink(Link value);

    /**
     * Getter for relation 'LinkEnd->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d2a84113-3717-4fc5-a6c1-583a9cf6999f")
    Instance getTarget();

    /**
     * Setter for relation 'LinkEnd->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a202b91f-7747-45ce-a327-9555fe32bc81")
    void setTarget(Instance value);

    /**
     * Getter for relation 'LinkEnd->OppositeOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a9e4928e-d445-4275-aeee-6fa71230d7d9")
    LinkEnd getOppositeOwner();

    /**
     * Setter for relation 'LinkEnd->OppositeOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d3198f49-a565-4e13-a12b-7b386e192c12")
    void setOppositeOwner(LinkEnd value);

    /**
     * Getter for relation 'LinkEnd->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("132b380b-82dc-4ccc-9695-69f8b2e8f70f")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'LinkEnd->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("39954b09-1a15-47e5-8163-2ed27482c1b5")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'LinkEnd->Model'
     * 
     * Metamodel description:
     * <i>The LinkEnd is an occurrence of this AssociationEnd.</i>
     */
    @objid ("f5b8c2c4-8432-4564-8c4a-e23be1435fbc")
    AssociationEnd getModel();

    /**
     * Setter for relation 'LinkEnd->Model'
     * 
     * Metamodel description:
     * <i>The LinkEnd is an occurrence of this AssociationEnd.</i>
     */
    @objid ("a4f89771-2158-447f-a503-965e34f7ac21")
    void setModel(AssociationEnd value);

    /**
     * Getter for relation 'LinkEnd->Consumer'
     * 
     * Metamodel description:
     * <i>Used for Connectors between Ports to designate the RequiredInterface(s) set the LinkEnd is connected to.</i>
     */
    @objid ("f449dfc3-4fc4-4f9c-9f72-e2dfbade164c")
    RequiredInterface getConsumer();

    /**
     * Setter for relation 'LinkEnd->Consumer'
     * 
     * Metamodel description:
     * <i>Used for Connectors between Ports to designate the RequiredInterface(s) set the LinkEnd is connected to.</i>
     */
    @objid ("97a9867b-6d7b-4dab-a11d-8ef1da92ef7a")
    void setConsumer(RequiredInterface value);

    /**
     * Getter for relation 'LinkEnd->Opposite'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("01f2a959-16ee-48d8-b9cb-981c4c946291")
    LinkEnd getOpposite();

    /**
     * Setter for relation 'LinkEnd->Opposite'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fcefc307-01a5-47e5-a98b-f6532cd8840e")
    void setOpposite(LinkEnd value);

    /**
     * Getter for relation 'LinkEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("777f4745-40be-4ef0-bb04-f1900d1860ef")
    Instance getSource();

    /**
     * Setter for relation 'LinkEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("312a9fbe-9c34-4279-91c2-0a801122150a")
    void setSource(Instance value);

    /**
     * Getter for relation 'LinkEnd->Provider'
     * 
     * Metamodel description:
     * <i>Used for Connectors between Ports to designate the ProvidedInterface(s) set the LinkEnd is connected to.</i>
     */
    @objid ("30129d7c-3355-4e8b-b31e-b509f3eb694d")
    ProvidedInterface getProvider();

    /**
     * Setter for relation 'LinkEnd->Provider'
     * 
     * Metamodel description:
     * <i>Used for Connectors between Ports to designate the ProvidedInterface(s) set the LinkEnd is connected to.</i>
     */
    @objid ("e2f6ff53-f713-4ded-8eec-5d5180a33c12")
    void setProvider(ProvidedInterface value);

}
