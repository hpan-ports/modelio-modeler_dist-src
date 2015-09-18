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
import org.modelio.metamodel.uml.statik.Package;

@objid ("0016e662-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageMerge extends ModelElement {
    @objid ("171badbe-56cc-4b81-b894-37abbaead0b7")
    Package getMergedPackage();

    @objid ("3955afd7-c0d3-4ccf-a1e0-50c1642849eb")
    void setMergedPackage(Package value);

    @objid ("9d82a940-ece8-4731-a556-76b3978300a9")
    Package getReceivingPackage();

    @objid ("d9fb85c9-89a4-4aed-b17f-3bafddfe39b3")
    void setReceivingPackage(Package value);

}
