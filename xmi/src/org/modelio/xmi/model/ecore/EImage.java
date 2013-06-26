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

@objid ("00ec6b3d-33b6-4a99-ad7b-38c8731f1637")
public class EImage extends EElement implements IEElement {
    @objid ("75429dd2-1853-4a3d-8f9d-bf4d432e6866")
    public Element createObjingElt() {
        return null;
    }

    @objid ("441589e7-69f3-4876-b783-dc3a0cfeebb2")
    public EImage(org.eclipse.uml2.uml.Image element) {
        super(element);
    }

    @objid ("183e808f-e32c-4bfd-b6db-9a5bf0843669")
    public void attach(Element objingElt) {
    }

    @objid ("16804d35-9146-4db6-8cb0-4722f8da5baa")
    public void attach(List<Object> objingElts) {
    }

    @objid ("16f7f5f3-06c9-4731-ac01-9eeb80c741a1")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
