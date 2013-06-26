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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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

    @objid ("dfe6de72-24ca-4823-913b-56d0b39dbab6")
    boolean isIsOrdered();

    @objid ("97b93954-f26d-4d35-93f2-b4d2acb2aa5f")
    void setIsOrdered(boolean value);

    @objid ("209dc88b-3073-4998-992e-38f07f94dbfb")
    boolean isIsUnique();

    @objid ("872ed873-0b08-4d05-8bd1-cc7428a359b0")
    void setIsUnique(boolean value);

    @objid ("fcd9db2b-d394-4285-b92f-705136944aab")
    String getMultiplicityMax();

    @objid ("affe00cb-a9ac-46f1-8e7b-67b5323e0966")
    void setMultiplicityMax(String value);

    @objid ("5ef36ef1-d880-4801-af6a-b9009c4066d1")
    String getMultiplicityMin();

    @objid ("21430f56-0221-474f-b774-f383ed05e8ab")
    void setMultiplicityMin(String value);

    @objid ("61294fdc-4e2a-4ed6-910d-d83607b1aa07")
    Link getLink();

    @objid ("7f656af9-706e-4823-a852-f97cfa42557c")
    void setLink(Link value);

    @objid ("971c66d4-1485-4bee-b406-159cee4b9644")
    Instance getTarget();

    @objid ("76e392eb-a06d-4e86-bcd7-ad883aed717e")
    void setTarget(Instance value);

    @objid ("c18300f1-bcd1-43d5-ac94-17900eccc122")
    LinkEnd getOppositeOwner();

    @objid ("b0b1c6d8-bcc4-4892-b733-d5d7f71bb50c")
    void setOppositeOwner(LinkEnd value);

    @objid ("bc3eabd5-3820-4a9d-8214-80e0a62bfbdc")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("4abd40b5-74ff-4ed3-872f-38b1cb76ad42")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("8ec00a59-7286-4046-9d67-396e38eaa48f")
    AssociationEnd getModel();

    @objid ("84c34ab5-cb10-47fb-917c-024d9cc646c3")
    void setModel(AssociationEnd value);

    @objid ("237442f1-f088-4434-966c-127526551d97")
    RequiredInterface getConsumer();

    @objid ("26f67d68-07ce-4b82-a56d-b1888550a9d2")
    void setConsumer(RequiredInterface value);

    @objid ("9c52f1c2-7511-4c60-b8f7-2586fff57d70")
    LinkEnd getOpposite();

    @objid ("aa3501f9-945d-40c4-8973-29adc443346e")
    void setOpposite(LinkEnd value);

    @objid ("1b1f0f0e-7c20-4e7f-9f4b-ed303c7fc6e1")
    Instance getSource();

    @objid ("cebc82b2-e645-43c4-baea-c734eaf65da8")
    void setSource(Instance value);

    @objid ("75299a66-2c74-46fa-a7d8-0d2b7bf840db")
    ProvidedInterface getProvider();

    @objid ("7502417d-2712-40b3-b613-23706bcc146f")
    void setProvider(ProvidedInterface value);

}
