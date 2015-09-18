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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

@objid ("001dff92-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameterSubstitution extends ModelElement {
    @objid ("d87928c3-7de5-474f-aa46-7aafd18b9d31")
    String getValue();

    @objid ("f4da5884-2328-484f-8932-6fa598f48212")
    void setValue(String value);

    @objid ("09cef0da-d12c-4a04-bc49-17a16b94923b")
    TemplateBinding getOwner();

    @objid ("c287f585-43dc-4478-895f-32516b8298af")
    void setOwner(TemplateBinding value);

    @objid ("0c0ef0cc-b241-4eef-9534-9c89fb43afcf")
    ModelElement getActual();

    @objid ("1b1a8199-32e0-4311-b39b-5d08f006a088")
    void setActual(ModelElement value);

    @objid ("3959b335-fad8-4fb6-a00d-c1179c81d3db")
    TemplateParameter getFormalParameter();

    @objid ("c4911456-381c-4eb0-9e18-6997fd545be4")
    void setFormalParameter(TemplateParameter value);

}
