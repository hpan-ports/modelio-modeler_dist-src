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

@objid ("acdf7900-5519-4b57-88d4-0720c3d2aa12")
public class EParameterSet extends ENamedElement implements IEElement {
    @objid ("81a6ebff-bd2f-485f-9f99-735963fc8e33")
    public Element createObjingElt() {
        return null;
    }

    @objid ("e69bb904-86ba-477f-b80a-0a2b04e639b6")
    public EParameterSet(org.eclipse.uml2.uml.ParameterSet element) {
        super(element);
    }

    @objid ("ff9ad87d-7a03-4604-8e47-cc4ca45e0166")
    public void attach(Element objingElt) {
    }

    @objid ("0bcf7b88-c7b8-4442-a98c-c5c4f3c10904")
    public void attach(List<Object> objingElts) {
    }

    @objid ("9ea404c7-b441-4cb7-a338-8a648327c53a")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
