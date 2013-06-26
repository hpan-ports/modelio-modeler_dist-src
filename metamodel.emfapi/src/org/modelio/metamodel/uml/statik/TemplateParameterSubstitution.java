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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

@objid ("001dff92-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameterSubstitution extends ModelElement {
    @objid ("65957b52-c0cf-4704-910b-e4ee198818e5")
    String getValue();

    @objid ("f9ee811a-992c-4978-9da5-dc456d239a82")
    void setValue(String value);

    @objid ("2e450036-a0a9-4bfe-b360-fb20383dea5e")
    TemplateBinding getOwner();

    @objid ("399ecc78-5ee2-4b2b-99e7-31397cfcc59c")
    void setOwner(TemplateBinding value);

    @objid ("bedd3204-c759-4f66-baf2-ad587afc90a0")
    ModelElement getActual();

    @objid ("17d492c2-5dfb-4a62-b4f6-7b74b982ae1b")
    void setActual(ModelElement value);

    @objid ("f09d13bf-946c-46cc-ae56-1bc35471d9a6")
    TemplateParameter getFormalParameter();

    @objid ("ca85c32c-02f0-418a-be4e-dd12899a38f8")
    void setFormalParameter(TemplateParameter value);

}
