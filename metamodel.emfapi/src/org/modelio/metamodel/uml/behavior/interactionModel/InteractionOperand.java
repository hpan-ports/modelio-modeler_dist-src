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
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;

@objid ("00479758-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionOperand extends InteractionFragment {
    @objid ("b106cffc-1458-4362-9440-bc58e08365d4")
    String getGuard();

    @objid ("7d905725-46ca-42fd-aea9-9da03d6008f0")
    void setGuard(String value);

    @objid ("42d055b9-7e4a-4c29-96f9-a445aa8ff60e")
    int getEndLineNumber();

    @objid ("19734323-9697-4807-8837-41ab7cbbac49")
    void setEndLineNumber(int value);

    @objid ("89316039-b0bd-456e-9c5a-20fba01a2b97")
    EList<InteractionFragment> getFragment();

    @objid ("18021a14-6b4c-4695-9a57-db484efdb210")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("0baf0ded-fae5-4ebb-8eeb-fd83395e259b")
    CombinedFragment getOwnerFragment();

    @objid ("e2ba7c78-0373-4619-b8fe-f3bddbb67b1a")
    void setOwnerFragment(CombinedFragment value);

}
