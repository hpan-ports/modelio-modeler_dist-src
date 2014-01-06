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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0085d9be-c4be-1fd8-97fe-001ec947cd2a")
public interface Dependency extends ModelElement {
    @objid ("22d81040-79c9-421c-8cc6-582e2e430c96")
    String getDependsOnId();

    @objid ("c351016b-ee0d-43bf-84b7-d4b69a51e8bc")
    void setDependsOnId(String value);

    @objid ("e286b582-b19f-419a-909f-2bf5684bf36c")
    String getDependsOnName();

    @objid ("fd35d69e-2018-4913-92b0-73295f1d5c5e")
    void setDependsOnName(String value);

    @objid ("f339b34c-e4d7-4e2d-9435-7bd6edd0641f")
    ModelElement getDependsOn();

    @objid ("c88c0a5b-b922-4f16-8901-94740a93fe55")
    void setDependsOn(ModelElement value);

    @objid ("7eb8d6aa-e3e5-4ab6-b18d-4b9fb582827c")
    ModelElement getImpacted();

    @objid ("108f0325-395b-4e8e-9a49-c13b39b461a1")
    void setImpacted(ModelElement value);

}
