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
    @objid ("42122170-ba74-439b-8cdb-ed171515c757")
    String getSelector();

    @objid ("178162ba-3f6e-463e-8a16-1de0f9602794")
    void setSelector(String value);

    @objid ("c1886632-fcf3-4d2d-923f-dcac6f1eaedd")
    EList<InteractionFragment> getCoveredBy();

    @objid ("b1e83812-8124-4052-a647-52439af11ec0")
    <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass);

    @objid ("2c807595-872e-4ccf-9aca-a06140dbc813")
    PartDecomposition getDecomposedAs();

    @objid ("77474e3e-991b-4754-aa64-4c4f1b7487d3")
    void setDecomposedAs(PartDecomposition value);

    @objid ("3d2b26a0-9f07-4b4e-860d-5ca57df293a4")
    Interaction getOwner();

    @objid ("e32b1112-d57c-417f-a7c8-9c08d367b829")
    void setOwner(Interaction value);

    @objid ("502d494b-cd1b-43e3-b984-536f481714e6")
    Instance getRepresented();

    @objid ("927d39a0-bfa7-48c8-8fda-1cde519b27f9")
    void setRepresented(Instance value);

}
