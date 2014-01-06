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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;

@objid ("004545ca-c4bf-1fd8-97fe-001ec947cd2a")
public interface Gate extends MessageEnd {
    @objid ("801fbb43-7b95-418f-afc2-eec768e586f9")
    InteractionUse getOwnerUse();

    @objid ("f0871c86-fb4c-49fc-8061-b911a5200dd5")
    void setOwnerUse(InteractionUse value);

    @objid ("981ce475-86ff-4155-9278-86d34d882920")
    EList<Gate> getActual();

    @objid ("8381845a-c2e4-4a1a-82f8-05911caa538c")
    <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("d1341ace-a5f4-43a0-91aa-03c3b0d024d4")
    Interaction getOwnerInteraction();

    @objid ("4a4380dc-5390-439e-84fb-b937dd1afe97")
    void setOwnerInteraction(Interaction value);

    @objid ("376d23f3-0e52-49da-86ba-6754fbcaa6b6")
    CombinedFragment getOwnerFragment();

    @objid ("d77c87ea-ccb1-4948-bb30-957e77fef68b")
    void setOwnerFragment(CombinedFragment value);

    @objid ("65f41b44-b48a-4dc6-bdb5-f0129f751048")
    Gate getFormal();

    @objid ("4e72ad98-4b1f-4e42-959b-c52ff5431f22")
    void setFormal(Gate value);

}
