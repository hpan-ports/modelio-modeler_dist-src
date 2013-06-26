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
package org.modelio.metamodel.uml.infrastructure.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;

@objid ("00669770-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTableDefinition extends ModelElement {
    @objid ("a20b406e-b889-44a3-a4d7-0a291614245a")
    PropertyContainer getOwner();

    @objid ("196a382d-d6b2-41fa-848c-314031c87570")
    void setOwner(PropertyContainer value);

    @objid ("4d3d35da-27c4-46cb-8e65-f3b26f2eb26d")
    EList<TypedPropertyTable> getTypedTable();

    @objid ("a0cef041-fb25-4f1f-892e-3f595fcbfc96")
    <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass);

    @objid ("acf3c88f-72b8-487c-bc9e-801337629f02")
    MetaclassReference getOwnerReference();

    @objid ("bf9ceecc-00f0-44e2-a254-09f260ca6f3f")
    void setOwnerReference(MetaclassReference value);

    @objid ("6091837e-f1bc-45cc-bdd0-24d17adbb4ec")
    Stereotype getOwnerStereotype();

    @objid ("07a7b326-46c0-49ce-b866-ebd40a8a146c")
    void setOwnerStereotype(Stereotype value);

    @objid ("276456b2-3cb3-440b-b1d7-391d2d5daaef")
    EList<PropertyDefinition> getOwned();

    @objid ("ea1eb736-c47a-426e-96b5-e7d8b8674e82")
    <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass);

}
