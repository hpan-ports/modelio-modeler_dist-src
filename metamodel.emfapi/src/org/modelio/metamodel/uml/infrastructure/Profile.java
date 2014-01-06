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
    @objid ("591b969d-0905-4ead-9ca4-e0f7355a02fe")
    String getJCode();

    @objid ("15259f8c-b877-427b-9c0b-db1872e9f943")
    void setJCode(String value);

    @objid ("4a223298-5cc7-418b-bee4-c432113c5cfb")
    EList<Stereotype> getDefinedStereotype();

    @objid ("6515e6b3-dd75-4f2a-b836-b66ece8d4823")
    <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass);

    @objid ("47a35160-0939-4732-a615-7e660327a0f9")
    ModuleComponent getOwnerModule();

    @objid ("95ae7b2b-ae79-4469-b887-c87591d1c47c")
    void setOwnerModule(ModuleComponent value);

    @objid ("3e3f4d29-8ad9-48d3-a0d1-c0a38bf64738")
    EList<MetaclassReference> getOwnedReference();

    @objid ("47ea981f-f959-4c44-b9a6-8ac3319049c3")
    <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass);

}
