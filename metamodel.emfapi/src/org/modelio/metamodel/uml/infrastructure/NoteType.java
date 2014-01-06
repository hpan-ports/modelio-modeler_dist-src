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
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("008bb80c-c4be-1fd8-97fe-001ec947cd2a")
public interface NoteType extends ModelElement {
    @objid ("86c9b1d3-36e0-4281-ae56-13648e6465ec")
    ModuleComponent getModule();

    @objid ("1f2cb91b-d56b-4fcf-8ec2-8bac3727556c")
    boolean isIsHidden();

    @objid ("ad8b5f26-2949-49f7-be0c-e420cc667cfe")
    void setIsHidden(boolean value);

    @objid ("15be2f3f-7e3e-4ab5-a288-9106d4caf8b3")
    String getLabelKey();

    @objid ("172ed30c-ea9f-4d9e-9bd8-bd33cbaadd3c")
    void setLabelKey(String value);

    @objid ("47131feb-3cc4-4ca3-981c-ef579c1cc1c6")
    EList<Note> getElement();

    @objid ("5ee9d6c2-6543-4599-baa6-da3a94454fb4")
    <T extends Note> List<T> getElement(java.lang.Class<T> filterClass);

    @objid ("614a68b3-dac5-48b5-b13b-c292ba08995c")
    Stereotype getOwnerStereotype();

    @objid ("03758635-e9f8-4f35-886f-5c2cd8ab7efc")
    void setOwnerStereotype(Stereotype value);

    @objid ("8cda1033-973a-480a-946a-68cd4da2bb44")
    MetaclassReference getOwnerReference();

    @objid ("6b4367d6-4ff8-4d5d-828e-bb77fcc368d0")
    void setOwnerReference(MetaclassReference value);

}
