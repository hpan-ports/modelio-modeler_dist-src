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
/*   Metamodel version: 9022              */
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

    @objid ("d449d7b6-3358-4002-989b-af002a48476a")
    boolean isIsOrdered();

    @objid ("e1e0ad51-824c-4846-8056-d5a43246d60d")
    void setIsOrdered(boolean value);

    @objid ("2c26e34a-e057-46db-ad48-2b28f64abdb2")
    boolean isIsUnique();

    @objid ("1e0093c1-fe95-4e2f-8c16-18f3c27dd613")
    void setIsUnique(boolean value);

    @objid ("e823261e-27b7-4b9e-864b-9e01c4d2dbe6")
    String getMultiplicityMax();

    @objid ("fbf4254c-cb75-4a0a-a959-160d166b8249")
    void setMultiplicityMax(String value);

    @objid ("913f2d85-68b1-425e-ba6b-62392add31f3")
    String getMultiplicityMin();

    @objid ("a5e67b60-27fd-4309-a7d9-f306d29f7ff3")
    void setMultiplicityMin(String value);

    @objid ("f1dd2aef-dc30-4e75-86b1-7a62cf79a32a")
    Link getLink();

    @objid ("24720acc-6779-47b0-a10a-16be7d553a28")
    void setLink(Link value);

    @objid ("886d9790-efbd-4202-b3c4-026335a7486d")
    Instance getTarget();

    @objid ("fdee5838-66b5-4828-8196-a8788883b377")
    void setTarget(Instance value);

    @objid ("eb88637c-4cd3-477f-9e39-09af6ae26d6a")
    LinkEnd getOppositeOwner();

    @objid ("8ba3673d-b027-4920-83d4-8a036241131d")
    void setOppositeOwner(LinkEnd value);

    @objid ("f5a0207c-861f-46bc-a3f9-ca10b7b894df")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("4458e1bf-add9-41aa-b350-b407a7475486")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("7aee61f5-f9f6-4877-a949-711cece058b9")
    AssociationEnd getModel();

    @objid ("a75999e6-b00f-45ff-8334-2eb1eef5cebf")
    void setModel(AssociationEnd value);

    @objid ("8e87e4c1-e855-41d9-b120-2d1e94d6b9aa")
    RequiredInterface getConsumer();

    @objid ("4c6e260c-ab73-46a8-8260-4aceb66738e2")
    void setConsumer(RequiredInterface value);

    @objid ("1ad56c91-5503-4e1b-8478-e0ecb557f61d")
    LinkEnd getOpposite();

    @objid ("44dd5da7-871d-4e94-9452-224027116449")
    void setOpposite(LinkEnd value);

    @objid ("c6b81ff2-5466-4ce2-8384-a6d3c0b30c40")
    Instance getSource();

    @objid ("51e454f2-b197-4ecf-993e-9c22097fd3f9")
    void setSource(Instance value);

    @objid ("f202b566-33f7-488c-96b4-321493527282")
    ProvidedInterface getProvider();

    @objid ("6984ef85-7138-4785-a465-c9f2c54c5c87")
    void setProvider(ProvidedInterface value);

}
