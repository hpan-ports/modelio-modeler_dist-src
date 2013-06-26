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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00428d1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Event extends ModelElement {
    @objid ("216d90aa-dcde-4aa8-8f6f-5d134495a86e")
    String getExpression();

    @objid ("f015c58e-214a-4b14-bfd5-a58fde6d5015")
    void setExpression(String value);

    @objid ("12178a25-cbdc-4919-b294-ac10e0a292b1")
    EventType getKind();

    @objid ("1cc58b54-0861-4592-8eff-5f05b3429f45")
    void setKind(EventType value);

    @objid ("896adb60-2632-47ab-a937-aa2657dc9038")
    EList<Transition> getTriggered();

    @objid ("b5878d2e-4a3b-4810-894a-ce2b5b523844")
    <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass);

    @objid ("e976386e-08c9-4441-8ac3-79f1de18a3ac")
    Signal getModel();

    @objid ("6381d182-91ff-449b-a505-1741eab64fef")
    void setModel(Signal value);

    @objid ("b06e5230-8f47-470e-a772-9ae9920e1eb8")
    EList<State> getOrigin();

    @objid ("66ea6025-5205-4048-b275-ed0dfda645e0")
    <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass);

    @objid ("5c394b44-ec74-4fa5-ad77-adbb6a230a92")
    Operation getCalled();

    @objid ("b3ddf497-303c-481e-b386-6b75364a9370")
    void setCalled(Operation value);

    @objid ("b0e7374c-1739-408a-a9d0-80f4aaf8f2ef")
    Behavior getComposed();

    @objid ("ee24e079-7618-4b6f-8a36-3283012a0826")
    void setComposed(Behavior value);

}
