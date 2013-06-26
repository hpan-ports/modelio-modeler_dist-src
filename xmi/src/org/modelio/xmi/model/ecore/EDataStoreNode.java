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

@objid ("1c6f510b-538c-434f-9900-55c6718a61ed")
public class EDataStoreNode extends ECentralBufferNode implements IEElement {
    @objid ("57e7e288-ee00-4f08-8d21-592cc8b205bb")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createDataStoreNode();
    }

    @objid ("cd3039e1-b696-4f3a-8a55-8a3bdcda7261")
    public EDataStoreNode(org.eclipse.uml2.uml.DataStoreNode element) {
        super(element);
    }

    @objid ("a11036f4-86f5-40c4-b53e-1d6fa11e8f14")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("10aadcf7-2a77-459a-a4c6-96f5863d81d4")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8e847f25-313f-48db-b6d6-52ccf98bc6bc")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
