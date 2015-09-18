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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;

@objid ("0090006a-c4be-1fd8-97fe-001ec947cd2a")
public interface TaggedValue extends ModelElement {
    @objid ("36e2abed-3651-41de-8c11-6dfc75c7388f")
    ModelElement getAnnoted();

    @objid ("e8363f25-6aac-4a4b-80d1-358e492a23fc")
    void setAnnoted(ModelElement value);

    @objid ("e3712474-87b2-4b9d-bc53-1203689abebc")
    EList<TagParameter> getActual();

    @objid ("a405746a-f6e8-4e7f-bb57-cfb78d8a377b")
    <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("4e0d1bdf-1b03-43d1-b38d-dd85c5caf116")
    TagParameter getQualifier();

    @objid ("8fed5b19-5a39-4f4e-a12a-26d5cae4b983")
    void setQualifier(TagParameter value);

    @objid ("6a315a51-ed77-4613-a41c-1d1d273982ec")
    TagType getDefinition();

    @objid ("2d0c974e-d15b-4685-8a31-ee3c80fa8e9c")
    void setDefinition(TagType value);

}
