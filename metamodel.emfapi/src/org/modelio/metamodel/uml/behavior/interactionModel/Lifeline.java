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
    @objid ("f41dcc40-fc7e-4b45-a6ee-9dafd2df56e5")
    String getSelector();

    @objid ("f0321c04-704e-4709-b71b-189e7382ec9e")
    void setSelector(String value);

    @objid ("14299b56-3301-4653-b722-495c1956b6ac")
    EList<InteractionFragment> getCoveredBy();

    @objid ("a9f1c8d3-70d3-49bb-86d4-7239820a8ad7")
    <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass);

    @objid ("f7989a64-393d-4fb0-94a4-b4dfc353917a")
    PartDecomposition getDecomposedAs();

    @objid ("0f214c5e-c842-47fa-ad04-122d25b37471")
    void setDecomposedAs(PartDecomposition value);

    @objid ("6e8fd9ed-b541-4787-9c3f-0a86dbce3028")
    Interaction getOwner();

    @objid ("3d6cfb89-df2f-4d65-a726-2bedefb9e87c")
    void setOwner(Interaction value);

    @objid ("5659aeba-7d25-49d7-926b-0153b373bce7")
    Instance getRepresented();

    @objid ("06082c38-d45f-4a82-aeba-1feabd4b43a4")
    void setRepresented(Instance value);

}
