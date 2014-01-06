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
/*   Metamodel version: 9019              */
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
    @objid ("eb44f455-0bf9-4ee9-831b-2f7166dccf65")
    String getValue();

    @objid ("f9ea534c-5d08-467a-b49b-a4d4051ad7e5")
    void setValue(String value);

    @objid ("2bccfacb-9533-4de8-b04e-483cc256e4a1")
    TemplateBinding getOwner();

    @objid ("80a69087-5aaa-4b9d-b4fa-f467864f0cd1")
    void setOwner(TemplateBinding value);

    @objid ("edba3fb8-d30f-484d-89ee-618f4419e1e8")
    ModelElement getActual();

    @objid ("d618944b-807f-41d4-be8d-f2c3568e09d6")
    void setActual(ModelElement value);

    @objid ("dadd6c50-1bca-4c34-a6c0-a18e16449dc3")
    TemplateParameter getFormalParameter();

    @objid ("d20b3519-e006-48c1-babf-4782649ddf48")
    void setFormalParameter(TemplateParameter value);

}
