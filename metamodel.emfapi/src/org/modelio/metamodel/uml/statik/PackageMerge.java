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
import org.modelio.metamodel.uml.statik.Package;

@objid ("0016e662-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageMerge extends ModelElement {
    @objid ("792a596a-257e-49b6-9d24-74736588d54e")
    Package getMergedPackage();

    @objid ("e30e23b5-ac0f-4801-bec8-da84fe1ba7db")
    void setMergedPackage(Package value);

    @objid ("af8bc435-acf3-440d-a93f-68266dcdf56e")
    Package getReceivingPackage();

    @objid ("a4cddf88-c420-479d-aea7-b8e508e0e418")
    void setReceivingPackage(Package value);

}
