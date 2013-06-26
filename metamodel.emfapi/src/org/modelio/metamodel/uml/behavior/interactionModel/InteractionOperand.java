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
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;

@objid ("00479758-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionOperand extends InteractionFragment {
    @objid ("364a5593-eeb3-474b-840e-6c4f7e18fbc5")
    String getGuard();

    @objid ("f3e3add8-08a0-401e-b1a1-c70363c2c150")
    void setGuard(String value);

    @objid ("36322c36-f93d-497f-bbdd-50b695e538ea")
    int getEndLineNumber();

    @objid ("e0e0f687-b154-4dfc-ae91-7048250b37e4")
    void setEndLineNumber(int value);

    @objid ("4acc723c-3075-4828-92d0-6ece13b3eeb9")
    EList<InteractionFragment> getFragment();

    @objid ("74b84148-446f-435f-8512-12756a03cc4a")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("46cf94ea-ef0b-48ea-8a7b-b76b88194eea")
    CombinedFragment getOwnerFragment();

    @objid ("dd277e2b-490f-4f4c-b2bc-127c1f1ba229")
    void setOwnerFragment(CombinedFragment value);

}
