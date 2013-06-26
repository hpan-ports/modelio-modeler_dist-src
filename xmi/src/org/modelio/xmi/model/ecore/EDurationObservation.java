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
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("eaf6e63b-3a71-4b92-92a5-e015c1d0f1a1")
public class EDurationObservation extends ENamedElement implements IEElement {
    @objid ("ec47ccdc-fc5a-445c-b815-c90e94dd1cae")
    public Element createObjingElt() {
        return null;
    }

    @objid ("4d0d0950-cac5-47c1-8a7c-0fe6c89210fc")
    public EDurationObservation(org.eclipse.uml2.uml.DurationObservation element) {
        super(element);
    }

    @objid ("a337b6b9-caa1-4be6-8fe4-4b160dd2120d")
    public void attach(Element objingElt) {
    }

    @objid ("bbef33f0-f7cf-4fd7-8e84-3d5f92f67b82")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e75badd3-0812-4eb0-a3ac-827739375c25")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
