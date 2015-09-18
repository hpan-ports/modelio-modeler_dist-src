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
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("008bb80c-c4be-1fd8-97fe-001ec947cd2a")
public interface NoteType extends ModelElement {
    @objid ("86c9b1d3-36e0-4281-ae56-13648e6465ec")
    ModuleComponent getModule();

    @objid ("faba7d52-0b06-4003-b8d5-e0a14a110205")
    boolean isIsHidden();

    @objid ("67577f98-0838-4a37-bce5-a56248109c90")
    void setIsHidden(boolean value);

    @objid ("8fdc3c9b-fd7e-467e-ad57-6021e6ea0999")
    String getLabelKey();

    @objid ("290b9341-c636-412e-8acb-677d32c5ac6e")
    void setLabelKey(String value);

    @objid ("17b60a59-00d0-4034-be62-678e295a05aa")
    String getMimeType();

    @objid ("338f20cf-b7cd-4dcc-b9b8-5956ad1cbcd4")
    void setMimeType(String value);

    @objid ("4dd835ad-a110-4c4d-963e-58b958df5026")
    EList<Note> getElement();

    @objid ("bacaa7ba-6684-4cfc-9362-b3908f03791d")
    <T extends Note> List<T> getElement(java.lang.Class<T> filterClass);

    @objid ("6a2093d5-5fd7-4923-a290-1cc4ad8128d6")
    Stereotype getOwnerStereotype();

    @objid ("a782cb3b-8cf5-42d6-8f80-e5d849a5c80f")
    void setOwnerStereotype(Stereotype value);

    @objid ("9495aaa6-bb44-4207-970e-36f2860b9491")
    MetaclassReference getOwnerReference();

    @objid ("753d98ef-d84d-4b32-8c7c-543fc38f74a6")
    void setOwnerReference(MetaclassReference value);

}
