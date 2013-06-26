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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("001c3784-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateBinding extends ModelElement {
    @objid ("e1558548-1b5a-449b-9030-ccb91a2a15c0")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("3072eaf4-ee0a-464a-9e7f-bc4599390bff")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("9029d296-0ab9-4faa-bf1b-52f3e7ee3d43")
    Operation getBoundOperation();

    @objid ("49cc9951-6be3-430d-91bd-64d4e103f6d4")
    void setBoundOperation(Operation value);

    @objid ("c8302037-2d23-4718-95de-01218a85409d")
    Operation getInstanciatedTemplateOperation();

    @objid ("6185910e-3cda-44b8-865e-576a327e7072")
    void setInstanciatedTemplateOperation(Operation value);

    @objid ("ac35a017-f17f-481b-bbc6-2a211fe590bc")
    NameSpace getInstanciatedTemplate();

    @objid ("a901ec42-70a6-41b1-8072-835545d772b6")
    void setInstanciatedTemplate(NameSpace value);

    @objid ("7a78c622-647a-4f9f-8185-5b02b24ae3b3")
    NameSpace getBoundElement();

    @objid ("9daad9a3-b7a1-430c-8014-6c4eee3769c8")
    void setBoundElement(NameSpace value);

}
