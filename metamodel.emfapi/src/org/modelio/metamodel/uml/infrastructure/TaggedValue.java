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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;

@objid ("0090006a-c4be-1fd8-97fe-001ec947cd2a")
public interface TaggedValue extends ModelElement {
    @objid ("63899e5c-8fa2-45de-a3d2-6ebfee779f37")
    ModelElement getAnnoted();

    @objid ("3f9fb736-241b-43a9-ba6d-ab92ce7c02bb")
    void setAnnoted(ModelElement value);

    @objid ("1657f2d0-0de4-49aa-93f5-dd5743876333")
    EList<TagParameter> getActual();

    @objid ("4dccc81e-c16e-4911-bc89-8263ca14fc68")
    <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("ec369ba8-bf2f-43ec-8f39-32cb8a6442b3")
    TagParameter getQualifier();

    @objid ("89b42395-2edd-4d22-ac6e-eb5f7485f326")
    void setQualifier(TagParameter value);

    @objid ("21c5c5f7-dc3f-4ab6-a3f6-9815f66bc51f")
    TagType getDefinition();

    @objid ("7bb211aa-f088-4f96-ba66-78e534065afd")
    void setDefinition(TagType value);

}
