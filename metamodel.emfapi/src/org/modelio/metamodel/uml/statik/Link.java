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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("815acdf3-5af8-48c5-894b-85d62dbe2e9b")
public interface Link extends ModelElement {
    @objid ("bb268073-f002-4d71-a94a-fce2f8a3521f")
    Association getModel();

    @objid ("6e6ed556-2889-45be-9a44-26208570a6a0")
    void setModel(Association value);

    @objid ("645cc416-d17e-4d1e-9004-c9aaaff37a91")
    EList<LinkEnd> getLinkEnd();

    @objid ("32f1ebcc-cc0c-46d1-9433-4946d0b82ef8")
    <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass);

    @objid ("0c2e7273-76ab-44e1-a330-8acfe90add71")
    CommunicationChannel getSent();

    @objid ("b523bc28-50cd-478c-92da-8d6955b352b3")
    void setSent(CommunicationChannel value);

}
