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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("d7d9e743-f6ec-441a-a288-f3cb80f4e356")
public class EActionInputPin extends EInputPin implements IEElement {
    @objid ("80ee03aa-efc3-411f-93e9-52506c52dd8b")
    public Element createObjingElt() {
        InputPin result = Modelio.getInstance().getModelingSession().getModel()
        .createInputPin();
            result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                    .getStereotype( IModelerModuleStereotypes.UML2ACTIONINPUTPIN, result.getMClass()));
        return  result;
    }

    @objid ("4bc54fdc-e73f-49f0-b5a2-595df4252480")
    public EActionInputPin(org.eclipse.uml2.uml.ActionInputPin element) {
        super(element);
    }

    @objid ("c009e668-18e6-4ff6-a0af-97e4a167a2a2")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("12ca91d6-d754-4a56-9921-c30ef5cd672e")
    public void attach(List<Object> objingElts) {
    }

    @objid ("63da96f9-ecbc-453f-8619-5d4dd2bbe0a8")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
