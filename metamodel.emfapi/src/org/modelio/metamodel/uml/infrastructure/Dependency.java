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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0085d9be-c4be-1fd8-97fe-001ec947cd2a")
public interface Dependency extends ModelElement {
    @objid ("90782e54-fd9b-4e55-b158-471bc40d8334")
    String getDependsOnId();

    @objid ("3c79557a-0a42-472d-ae49-2e9fca07fb92")
    void setDependsOnId(String value);

    @objid ("8e172740-f891-447f-bb7a-626912bf0c65")
    String getDependsOnName();

    @objid ("6859bffc-7429-4229-80f3-9b2311129ffa")
    void setDependsOnName(String value);

    @objid ("4fb4cb8f-dfff-4aba-9301-c4917a836a8b")
    ModelElement getDependsOn();

    @objid ("b81cccc1-0078-4c4b-b130-eefb0c7a3597")
    void setDependsOn(ModelElement value);

    @objid ("a5a9c6d0-6abf-4dd4-acd3-e288fd4e149e")
    ModelElement getImpacted();

    @objid ("e21d9823-460b-4813-8330-604af578f3c0")
    void setImpacted(ModelElement value);

}
