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
    @objid ("e85387c0-e770-412f-b12d-6870ae7cfa49")
    String getJCode();

    @objid ("c5abeb85-48a5-47c9-9f4f-d7ac712ac732")
    void setJCode(String value);

    @objid ("908ce04c-2f26-468a-9b52-eec562bc571f")
    EList<Stereotype> getDefinedStereotype();

    @objid ("cc84b3a7-bbc0-41db-bb04-74b1bf0f56ad")
    <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass);

    @objid ("5820735f-8a5c-4ab9-a770-0aeb137c4c6e")
    ModuleComponent getOwnerModule();

    @objid ("62a6de67-097b-4721-811d-d3b360843375")
    void setOwnerModule(ModuleComponent value);

    @objid ("6fe1f547-da42-4d4e-9a46-10d5d6780717")
    EList<MetaclassReference> getOwnedReference();

    @objid ("48310d5e-af99-4e6c-b35d-2eeb817dd49a")
    <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass);

}
