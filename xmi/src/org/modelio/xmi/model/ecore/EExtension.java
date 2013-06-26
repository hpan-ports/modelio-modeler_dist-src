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

@objid ("1044ff22-36b1-4e15-b0a7-f4ae17c63ef2")
public class EExtension extends ENamedElement implements IEElement {
    @objid ("2a6c2f92-ccf2-4215-8a00-9637830b347b")
    @Override
    public Object createObjingElt() {
        return null;
    }

    @objid ("4005cc21-710f-4e40-8bc0-69b4872688a4")
    public EExtension(org.eclipse.uml2.uml.Extension element) {
        super(element);
    }

    @objid ("aaa013fa-c341-46fa-a25d-04c18cb6503a")
    public void attach(Element objingElt) {
    }

    @objid ("80bdba8e-6f6d-49b4-a31a-a4fa54793abe")
    public void attach(List<Object> objingElts) {
    }

    @objid ("fe7f0dfc-6e5b-46b5-89cb-6e25a09aa11b")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
