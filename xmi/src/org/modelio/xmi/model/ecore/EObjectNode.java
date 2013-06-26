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
import org.eclipse.uml2.uml.ObjectNode;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("0769d8f2-f5a3-4a07-a709-ae3847873857")
public class EObjectNode extends ENamedElement implements IEElement {
    @objid ("047f8fea-a9e1-4a13-8b00-67d361fa41d2")
    public Element createObjingElt() {
        return null;
    }

    @objid ("814dfba5-ac34-413c-b4a0-9ba515708056")
    public EObjectNode(ObjectNode element) {
        super(element);
    }

    @objid ("437e1139-9c70-4561-a5e5-88fa4d56fea8")
    public void attach(Element objingElt) {
    }

    @objid ("33acebc7-8d27-41d1-8d06-7915b46ad777")
    public void attach(List<Object> objingElts) {
    }

    @objid ("59122f51-4504-4b1e-b360-6855df613b32")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
