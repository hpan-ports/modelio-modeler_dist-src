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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("00749ece-17e8-10a1-88a0-001ec947cd2a")
public interface NaryLinkEnd extends ModelElement {
    @objid ("f0aa6890-dbcf-4ad4-ad4e-1a0c01c94b57")
    boolean isIsOrdered();

    @objid ("1ce986f4-2d6a-43d8-b92f-d6af1601bb7e")
    void setIsOrdered(boolean value);

    @objid ("bc2c5a8d-4044-40ee-a275-6a0c5036c1d4")
    boolean isIsUnique();

    @objid ("5658f7d9-d4b1-43b0-b767-e9392fed59a0")
    void setIsUnique(boolean value);

    @objid ("88f4dcb0-b52f-4729-9b07-f795d7676e21")
    String getMultiplicityMax();

    @objid ("facff63b-650a-48af-84fd-655977de9a12")
    void setMultiplicityMax(String value);

    @objid ("b87990ef-2bd1-49ef-8fb0-a5d60092d94a")
    String getMultiplicityMin();

    @objid ("34c93dc0-f2ff-4ed5-b183-4504c67bb506")
    void setMultiplicityMin(String value);

    @objid ("85c9a30d-4d35-4171-9122-06e0d53d1396")
    Instance getSource();

    @objid ("03eab6f9-154b-4a17-a43b-1b8c3b38bb53")
    void setSource(Instance value);

    @objid ("8d79ed76-8b4b-448d-bdb2-7914887fa2ce")
    NaryLink getNaryLink();

    @objid ("d6986f4f-6537-4fba-a499-a9a2392bec77")
    void setNaryLink(NaryLink value);

    @objid ("a14a86d2-cfc9-40aa-a907-c0787b638b8a")
    RequiredInterface getConsumer();

    @objid ("2c9b34f3-b925-4f0b-9c1f-aed3c4a007a0")
    void setConsumer(RequiredInterface value);

    @objid ("768a9ed6-c677-47eb-958f-1ae0cfcab1be")
    ProvidedInterface getProvider();

    @objid ("f0d7acdc-f429-4bbf-8d71-ff8d08225281")
    void setProvider(ProvidedInterface value);

}
