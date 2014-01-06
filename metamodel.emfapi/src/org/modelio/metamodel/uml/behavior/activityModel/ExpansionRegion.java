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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;

@objid ("0031bab4-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionRegion extends StructuredActivityNode {
    @objid ("12c800a2-a4c4-4762-9636-1ac0763d9c97")
    ExpansionKind getMode();

    @objid ("aa59c20f-60ac-4b8e-8818-e006ea8b84bc")
    void setMode(ExpansionKind value);

    @objid ("f6065e5f-e2a0-4d20-b8da-9a55f6c1b312")
    EList<ExpansionNode> getOutputElement();

    @objid ("1c34460b-6688-4f27-9de8-7abb9f127c2e")
    <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass);

    @objid ("6e865868-d039-47a0-adf9-27c22e650720")
    EList<ExpansionNode> getInputElement();

    @objid ("21b0cf99-0b17-4e9d-8496-8d52aa01e809")
    <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass);

}
