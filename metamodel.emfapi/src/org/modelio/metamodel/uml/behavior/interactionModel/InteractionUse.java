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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;

@objid ("00482c5e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionUse extends InteractionFragment {
    @objid ("f88e3280-678f-4217-b429-ba7a077f2ac1")
    int getEndLineNumber();

    @objid ("6a9513c5-2a36-4f2c-b337-b4333b9b4eb9")
    void setEndLineNumber(int value);

    @objid ("127033ba-eee0-4f4c-9e0c-71bf83271312")
    EList<Gate> getActualGate();

    @objid ("08524c95-4a8c-4080-9547-9d0ad7d10d50")
    <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass);

    @objid ("18a5c863-da24-4b3f-b38b-4f3cd055be03")
    Interaction getRefersTo();

    @objid ("df96d824-df67-42bc-90f1-f630c654e2fd")
    void setRefersTo(Interaction value);

}
