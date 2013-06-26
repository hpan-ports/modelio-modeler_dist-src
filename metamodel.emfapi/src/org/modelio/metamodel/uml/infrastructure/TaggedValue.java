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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;

@objid ("0090006a-c4be-1fd8-97fe-001ec947cd2a")
public interface TaggedValue extends ModelElement {
    @objid ("f73cd93e-cb24-4434-9b28-e747ead498eb")
    ModelElement getAnnoted();

    @objid ("661918e0-1ae2-42ec-8d28-86f1ebc9687f")
    void setAnnoted(ModelElement value);

    @objid ("c339f328-017b-4ed6-80c1-ff2fd0071e6f")
    EList<TagParameter> getActual();

    @objid ("632bae14-fd71-407d-8072-bf685b025585")
    <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("2156a976-1f85-4362-9470-c004989a9a28")
    TagParameter getQualifier();

    @objid ("fbae435d-0a2d-40c6-b0a6-8e92ba32999c")
    void setQualifier(TagParameter value);

    @objid ("6ee3096f-70d1-47fc-9ea1-76e2b6ba644a")
    TagType getDefinition();

    @objid ("06803779-5494-4eb6-bbf9-1367d3a0fba2")
    void setDefinition(TagType value);

}
