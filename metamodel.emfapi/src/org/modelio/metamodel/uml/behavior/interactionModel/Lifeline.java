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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0048b5b6-c4bf-1fd8-97fe-001ec947cd2a")
public interface Lifeline extends ModelElement {
    @objid ("62d895af-bbf2-47d2-a348-704b59e142dd")
    String getSelector();

    @objid ("d0cdb3ef-edbb-49d7-9b3c-ac0620659fb3")
    void setSelector(String value);

    @objid ("c3754865-68c1-4d44-a083-6e510f109147")
    EList<InteractionFragment> getCoveredBy();

    @objid ("a1d4f2c8-2492-48f2-abf3-28cd72d59041")
    <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass);

    @objid ("6c664742-c0b2-413e-8f87-8fd9c45ad0b9")
    PartDecomposition getDecomposedAs();

    @objid ("60d0c7a1-4873-4bcb-945d-ae8d0a264f34")
    void setDecomposedAs(PartDecomposition value);

    @objid ("989b6a55-0f0a-426a-a774-87bf55654516")
    Interaction getOwner();

    @objid ("d5a779f4-500f-4437-93de-1e301c2e1637")
    void setOwner(Interaction value);

    @objid ("e0af9383-56e8-43dd-a61e-b8636146017d")
    Instance getRepresented();

    @objid ("e34c53c2-00fa-403a-85c7-1f8b5940d2f3")
    void setRepresented(Instance value);

}
