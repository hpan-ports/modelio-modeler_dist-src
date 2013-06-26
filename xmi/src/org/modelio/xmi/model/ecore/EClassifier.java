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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("86424d20-11ca-487f-9b3d-5b769336a4a7")
public class EClassifier extends EElement implements IEElement {
    @objid ("46855757-eaae-46f4-94b1-042fe9435553")
    public Element createObjingElt() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("8bda2bc2-1034-492a-a97f-4bc2b425b00c")
    public EClassifier(org.eclipse.uml2.uml.Behavior element) {
        super(element);
    }

    @objid ("d3553656-2c4d-4fb5-94f1-e690b8e18757")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("ba429617-4da5-49fd-8bed-3a74e2b3154a")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
