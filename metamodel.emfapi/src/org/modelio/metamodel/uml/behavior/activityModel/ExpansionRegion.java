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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;

@objid ("0031bab4-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionRegion extends StructuredActivityNode {
    @objid ("6f7bfa43-6a95-4128-a351-46d11764d25f")
    ExpansionKind getMode();

    @objid ("2c8814c0-b6bd-449c-ae28-bec052f0f7fb")
    void setMode(ExpansionKind value);

    @objid ("37ed4734-d682-4cd8-9218-4dfcb891fc90")
    EList<ExpansionNode> getOutputElement();

    @objid ("927b714a-89f6-4752-a9be-31b4ec091713")
    <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass);

    @objid ("b5a25f52-838c-40c5-865a-f59708fabcf9")
    EList<ExpansionNode> getInputElement();

    @objid ("2a32ebf7-f7cb-4650-822c-bfdfa9c81691")
    <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass);

}
