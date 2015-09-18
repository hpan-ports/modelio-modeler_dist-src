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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("000ee2e6-c4bf-1fd8-97fe-001ec947cd2a")
public interface InterfaceRealization extends ModelElement {
    @objid ("ac9e1a23-7891-426b-9161-8b4053e26206")
    Interface getImplemented();

    @objid ("9222a115-9a3e-4326-82f7-b0696a7c2d49")
    void setImplemented(Interface value);

    @objid ("3891ec61-6fb3-43eb-aa6f-e548af8b19f3")
    NameSpace getImplementer();

    @objid ("ffa4dd8f-4cb9-4a04-b243-4be87fcef3f6")
    void setImplementer(NameSpace value);

}
