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
    @objid ("718a3bfd-9dc5-4011-a84d-5b6788d5ba08")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("53a09c7f-ad21-43a3-bc09-8cb54994d2da")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("1170406a-4261-481a-aafb-184f402291ea")
    Operation getBoundOperation();

    @objid ("797adeb0-4386-4bb8-ac70-515d466c1824")
    void setBoundOperation(Operation value);

    @objid ("3a93cd58-e611-49e9-8a53-68de1dba0348")
    Operation getInstanciatedTemplateOperation();

    @objid ("9c9eb36f-f5eb-453d-a6cd-04b6fdbaedfd")
    void setInstanciatedTemplateOperation(Operation value);

    @objid ("c69befce-edeb-424e-b45f-56ad2e5d0094")
    NameSpace getInstanciatedTemplate();

    @objid ("e7185fd8-95ea-44b6-a386-4c8dd62cf688")
    void setInstanciatedTemplate(NameSpace value);

    @objid ("28b83b47-89a1-4c81-b815-b82f7a3a29c0")
    NameSpace getBoundElement();

    @objid ("35bfc140-9ca6-4e06-ac26-30bd5d935d87")
    void setBoundElement(NameSpace value);

}
