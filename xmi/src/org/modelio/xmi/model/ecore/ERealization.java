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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("3ce072f3-5ae0-4f52-95e8-adcdfe7d972c")
public class ERealization extends ENamedElement implements IEElement {
    @objid ("def861d5-69a0-4e39-bd39-209774937b14")
    public List<Element> createObjingElt() {
        return new ArrayList<Element>();
    }

    @objid ("ae9743ae-074d-443e-b840-1c5639699e14")
    public ERealization(org.eclipse.uml2.uml.Realization element) {
        super(element);
    }

    @objid ("5726dd67-2ab8-490c-9c38-5113a65bc508")
    public void attach(Element objingElt) {
    }

    @objid ("473af8f0-eda6-4fc6-a667-7d89c9d9866f")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4b4b7fd3-8a65-4d9c-89a6-ff99e27cc044")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
