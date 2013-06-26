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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("005a9290-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationNode extends ModelElement {
    @objid ("9433710b-3ac9-49fb-a953-924194c81d3f")
    String getSelector();

    @objid ("4d06fb14-d6a4-49bb-a4d0-425f282f67dc")
    void setSelector(String value);

    @objid ("ad38bb43-129e-4112-acbe-b7d09ca5cd3d")
    CommunicationInteraction getOwner();

    @objid ("a915c0b8-4ea7-4d97-859a-37e36bf0202c")
    void setOwner(CommunicationInteraction value);

    @objid ("9b992783-b7fe-4c69-9367-3ba1a6269ba5")
    Instance getRepresented();

    @objid ("33d92330-52a2-45c7-b607-83058c509276")
    void setRepresented(Instance value);

    @objid ("db4395a7-61e6-4690-b045-60780ecffd06")
    EList<CommunicationChannel> getStarted();

    @objid ("da005a2b-a0ad-44bd-b47d-69408ed9a2e5")
    <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass);

    @objid ("549fc003-30b7-4c07-82a4-77d02e955ef8")
    EList<CommunicationChannel> getEnded();

    @objid ("55d12f0e-5316-4f14-b45f-74e098a451fc")
    <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass);

}
