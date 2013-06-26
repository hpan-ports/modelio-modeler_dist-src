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

@objid ("061b4997-0c94-4e37-af14-3101beadcb55")
public class EExpression extends ENamedElement implements IEElement {
    @objid ("a9a8bc51-24dd-4083-ac36-9e6980e19abe")
    public Element createObjingElt() {
        return null;
    }

    @objid ("ea2d9c71-c0ec-44b2-908e-e2500eae7ac0")
    public EExpression(org.eclipse.uml2.uml.Expression element) {
        super(element);
    }

    @objid ("933ed265-9cd4-485a-b418-87d719c68ffd")
    public void attach(Element objingElt) {
    }

    @objid ("b05c666e-df43-4b4f-b428-575c3bf963c6")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e296c4b3-19ef-4633-ad27-28ebb363373f")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
