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
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("d5dcc612-916d-41bc-b7a4-8630453a9a2a")
public class EInitialNode extends EActivityNode implements IEElement {
    @objid ("898cc667-1946-4836-8ff9-76f9fb9ec3f5")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createInitialNode();
    }

    @objid ("2f893b1d-1869-4a82-91f9-0d3e3f2a024a")
    public EInitialNode(org.eclipse.uml2.uml.InitialNode element) {
        super(element);
    }

    @objid ("6b82854b-4ffa-4f68-afc2-d2546c864ec0")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("1a1b2553-4106-44cf-81fb-a58f6781ed11")
    public void attach(List<Object> objingElts) {
    }

    @objid ("43c11156-7257-4f18-a246-7ae2335a6e5e")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
