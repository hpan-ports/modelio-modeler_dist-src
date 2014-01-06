/*
 * Copyright 2013 Modeliosoft
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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("000fb1bc-c4bf-1fd8-97fe-001ec947cd2a")
public interface LinkEnd extends ModelElement {
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

    @objid ("1ec0e0de-02db-4ea1-b7e6-9eaf14ca3aec")
    boolean isIsOrdered();

    @objid ("0e503067-aa13-48a6-9023-3180ffabf906")
    void setIsOrdered(boolean value);

    @objid ("20eb60da-84a8-4ad8-9e63-7405d73f9ddd")
    boolean isIsUnique();

    @objid ("d6a23202-5d13-48be-9dbe-12019bce40c7")
    void setIsUnique(boolean value);

    @objid ("a12785da-8728-4f64-b61a-14a447f753b7")
    String getMultiplicityMax();

    @objid ("ba1748d2-eeca-4ad7-b4ec-b950a1394824")
    void setMultiplicityMax(String value);

    @objid ("4d094cf4-79b3-403b-855e-58d73bab21ad")
    String getMultiplicityMin();

    @objid ("29f47fc2-b022-4315-9796-8ba3a9059dc8")
    void setMultiplicityMin(String value);

    @objid ("f6e53ada-bee6-42c6-9933-775335ba5e50")
    Link getLink();

    @objid ("82287534-f6bd-47ac-8d90-fe8f63847972")
    void setLink(Link value);

    @objid ("21e88872-8143-4335-9ce4-8756b0cff643")
    Instance getTarget();

    @objid ("e918ce41-9dd4-4763-b0b7-efdbeadc213f")
    void setTarget(Instance value);

    @objid ("d9c71a50-4e39-421f-bca2-bdb321a2339e")
    LinkEnd getOppositeOwner();

    @objid ("c567160e-6aa6-4dda-98f2-4c6ab8146b23")
    void setOppositeOwner(LinkEnd value);

    @objid ("ab93c561-6511-4bfb-9a94-94a1e64bc8c5")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("ef1af1b0-7470-4333-8157-d22f80c06a69")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("6cc7f068-01dd-4fce-9822-b4ae52f7356c")
    AssociationEnd getModel();

    @objid ("bdd5076d-bd03-4c7d-8d1a-24a36f73c42c")
    void setModel(AssociationEnd value);

    @objid ("426520bf-18ed-4b2d-a045-b7c22d035b6e")
    RequiredInterface getConsumer();

    @objid ("9b68c11e-548b-4932-92a2-5cf4a284cf4f")
    void setConsumer(RequiredInterface value);

    @objid ("bedaa778-79ce-45c5-b724-304565876658")
    LinkEnd getOpposite();

    @objid ("ffd3d50b-5aea-4706-948d-6ef639c9adb8")
    void setOpposite(LinkEnd value);

    @objid ("19092ce7-9286-44c5-b66d-56cea7d510d0")
    Instance getSource();

    @objid ("044d0afa-6e6c-46a4-aba9-cd7e19c44826")
    void setSource(Instance value);

    @objid ("44e99843-c7d0-42f3-86b6-8df64c67c1d5")
    ProvidedInterface getProvider();

    @objid ("0a193cc8-640b-4bc2-ab23-dbed29ade071")
    void setProvider(ProvidedInterface value);

}
