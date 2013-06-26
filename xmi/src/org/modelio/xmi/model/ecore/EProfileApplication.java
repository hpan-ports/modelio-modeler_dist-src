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

@objid ("cba3ddec-250c-4c34-bb14-94bd12f37b0f")
public class EProfileApplication extends EElement implements IEElement {
    @objid ("3b270d9c-86e6-4f84-be85-7394c69b6d73")
    public Element createObjingElt() {
        return null;
    }

    @objid ("54fcfe92-7932-4155-bfc5-7ef03747463c")
    public EProfileApplication(org.eclipse.uml2.uml.ProfileApplication element) {
        super(element);
    }

    @objid ("8ab23200-5418-4e4e-a285-4618111b366c")
    public void attach(Element objingElt) {
    }

    @objid ("b1051ede-5ab4-4d8c-bd9f-8afb8d46be99")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8ba1d245-3729-4922-aa05-d63dd3515744")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
