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
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;

@objid ("00479758-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionOperand extends InteractionFragment {
    @objid ("1053c746-96b4-45c8-9de7-65712af1a90e")
    String getGuard();

    @objid ("434efdd3-c101-4fcb-a1e1-3c09f3dd6a5f")
    void setGuard(String value);

    @objid ("f45cf838-6d47-47d4-952b-14d3447ede1c")
    int getEndLineNumber();

    @objid ("3f859c04-492e-436d-8238-8aa54e8c9119")
    void setEndLineNumber(int value);

    @objid ("de11a085-c25b-4a27-b0c4-446097a1f34e")
    EList<InteractionFragment> getFragment();

    @objid ("4e2cd22f-1500-4ef5-a875-281aaea665f9")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("95313f47-def4-4ae9-bd0b-0390903ab426")
    CombinedFragment getOwnerFragment();

    @objid ("02e114e3-f05a-4498-9ef7-da22e5618ace")
    void setOwnerFragment(CombinedFragment value);

}
