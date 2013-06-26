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
import org.eclipse.uml2.uml.StringExpression;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("e5b3bb34-aa0a-4566-9a7b-f788d362fe92")
public class EStringExpression extends ENamedElement implements IEElement {
    @objid ("7f4a5ced-4173-434c-a900-f77f01acdcda")
    public Element createObjingElt() {
        return null;
    }

    @objid ("2bbdfa44-564c-4d78-863b-9a71db897008")
    public EStringExpression(StringExpression element) {
        super(element);
    }

    @objid ("a23b9e04-b7a7-4906-84b7-aae2a1e65dc4")
    public void attach(Element objingElt) {
    }

    @objid ("996f339a-aeb9-4931-acca-608fa7b747bd")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e035be2f-8bd7-4760-a685-bb408e542d9f")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
