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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Package;

@objid ("008c74a4-c4be-1fd8-97fe-001ec947cd2a")
public interface Profile extends Package {
    @objid ("dffffbcf-e938-4c05-b030-5e28c9985d22")
    String getJCode();

    @objid ("efb31e94-a899-4b4f-8a45-8d7f9f714e61")
    void setJCode(String value);

    @objid ("badf9702-9bf3-41ef-8d39-ed48ad464f5a")
    EList<Stereotype> getDefinedStereotype();

    @objid ("46ce5200-f36e-4b7e-bc00-ca69ef6d6ae5")
    <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass);

    @objid ("e5ff1cef-05dd-4cb6-a45b-682ea70494b9")
    ModuleComponent getOwnerModule();

    @objid ("a6550429-db93-4323-a213-daffd44d9a78")
    void setOwnerModule(ModuleComponent value);

    @objid ("a6443a20-4b66-4c01-b039-cfb9ada4a2d5")
    EList<MetaclassReference> getOwnedReference();

    @objid ("74cc800a-2612-4aa7-8324-b1ffd373fd89")
    <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass);

}
