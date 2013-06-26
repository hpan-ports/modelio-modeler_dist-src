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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000ee2e6-c4bf-1fd8-97fe-001ec947cd2a")
public interface InterfaceRealization extends ModelElement {
    @objid ("c24f6d0d-14c2-4246-a2b1-ff6286f93f27")
    Interface getImplemented();

    @objid ("d52b39a4-d032-4087-bb5f-4fe32a83314b")
    void setImplemented(Interface value);

    @objid ("927b7ff8-73ef-4203-b7cf-cc44e4971d7e")
    NameSpace getImplementer();

    @objid ("5520384a-e1c0-4246-9c2d-ab51111d93ee")
    void setImplementer(NameSpace value);

}
