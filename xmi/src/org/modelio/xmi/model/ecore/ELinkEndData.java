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

@objid ("b188c8fd-240e-48d7-974f-637463310d28")
public class ELinkEndData extends EElement implements IEElement {
    @objid ("9023f46d-3382-4c70-afaa-5b2ad7600a82")
    public Element createObjingElt() {
        return null;
    }

    @objid ("ba6547d1-a35a-468c-b9f0-9ae9bcb04e14")
    public ELinkEndData(org.eclipse.uml2.uml.LinkEndData element) {
        super(element);
    }

    @objid ("856dbec9-bd14-426f-b990-0946789e005e")
    public void attach(Element objingElt) {
    }

    @objid ("0b5918b1-9cab-402d-8740-88c70aa05526")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8fafa68c-f215-4d46-ba7a-0e72f7dbb7c3")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
