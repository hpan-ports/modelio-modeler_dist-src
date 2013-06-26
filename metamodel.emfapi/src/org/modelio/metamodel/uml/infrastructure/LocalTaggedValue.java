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

@objid ("0087c760-c4be-1fd8-97fe-001ec947cd2a")
public interface LocalTaggedValue extends ModelElement {
    @objid ("dbb498b1-1523-42da-8df6-bbfe40af070f")
    boolean isIsVisible();

    @objid ("cbe38a2b-1690-46fe-b77b-7bb1b7cc6067")
    void setIsVisible(boolean value);

    @objid ("fb49c83c-aab3-4551-9403-8352a828c9ef")
    ModelElement getLocalAnnoted();

    @objid ("20f9a380-de24-4029-81c6-f54a92d1b6ba")
    void setLocalAnnoted(ModelElement value);

    @objid ("51a32190-0c73-4950-b70d-0fdefb01bd55")
    TagType getLocalDefinition();

    @objid ("13ea8f5d-0a04-422b-8ef2-b0c000047a14")
    void setLocalDefinition(TagType value);

    @objid ("924f907c-d31c-4645-90da-a417746b514c")
    EList<TagParameter> getLocalActual();

    @objid ("8c05b32b-a928-4c1c-9b85-3b4f6ef65558")
    <T extends TagParameter> List<T> getLocalActual(java.lang.Class<T> filterClass);

    @objid ("5840b1ed-4798-4074-9ebc-b9e19ddc04cd")
    TagParameter getLocalQualifier();

    @objid ("a408a1ac-3c08-4886-ad54-8595d9cde56a")
    void setLocalQualifier(TagParameter value);

}
