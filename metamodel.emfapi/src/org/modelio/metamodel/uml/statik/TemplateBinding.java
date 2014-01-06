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
    @objid ("9bfd3493-3ed8-415f-a3f8-e3e1447c0e8f")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("e8e76731-5018-4652-9bc1-d4e9f90276ab")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("c1514761-5fa5-4f49-af42-e60d84f7f9b9")
    Operation getBoundOperation();

    @objid ("bc0e0e62-454f-4aa4-a4b6-f477a7aa2072")
    void setBoundOperation(Operation value);

    @objid ("d2ef941a-f6fa-4e5f-896d-83459d148b1a")
    Operation getInstanciatedTemplateOperation();

    @objid ("45ecdb47-526f-4924-b339-18d0e2ffd0b9")
    void setInstanciatedTemplateOperation(Operation value);

    @objid ("3aa6a630-9948-4603-9f6a-cb47a6e49227")
    NameSpace getInstanciatedTemplate();

    @objid ("a88e92a2-f378-4166-9a73-f6d7ae3348b0")
    void setInstanciatedTemplate(NameSpace value);

    @objid ("8f5e722c-f7a1-4422-8f0f-7b63021b8d79")
    NameSpace getBoundElement();

    @objid ("8d29970d-b7bb-4470-8d3a-21fa6965d94e")
    void setBoundElement(NameSpace value);

}
