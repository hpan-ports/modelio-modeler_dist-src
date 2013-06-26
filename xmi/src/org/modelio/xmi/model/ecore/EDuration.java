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

@objid ("af519c81-7e16-442d-9cad-816b8a1300a7")
public class EDuration extends ENamedElement implements IEElement {
    @objid ("7489b615-41f9-44c4-acbb-d33edc98435b")
    public Element createObjingElt() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("49332c11-5468-43f1-a72c-cd1c2f0bb987")
    public EDuration(org.eclipse.uml2.uml.Duration element) {
        super(element);
    }

    @objid ("7cdf2733-1086-4db8-baf7-335f9f4f82cd")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("4eec2938-a63a-401f-a241-b4a9fbebabc1")
    public void attach(List<Object> objingElts) {
    }

    @objid ("c1ed8c8d-de4d-41c9-a2ec-6ff35ccc80a3")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
