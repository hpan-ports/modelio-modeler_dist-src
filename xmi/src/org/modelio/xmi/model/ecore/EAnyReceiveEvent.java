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

@objid ("d8013e7a-ed48-4785-bfce-b19f718a3e1f")
public class EAnyReceiveEvent extends ENamedElement implements IEElement {
    @objid ("a567db37-ae0b-4af2-ae9f-d866f54c8805")
    public Element createObjingElt() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("0655d2ee-9748-41f9-beaf-93ae271538d2")
    public EAnyReceiveEvent(org.eclipse.uml2.uml.AnyReceiveEvent element) {
        super(element);
    }

    @objid ("4215fc82-84e1-407b-9ce3-c03e4391a207")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("1aa48acc-e794-469d-936e-df79550cc53b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("148658e9-098a-4301-8b6f-6376bcb44591")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
