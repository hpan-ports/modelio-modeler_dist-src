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
    @objid ("cd2e4efe-87b8-4589-b232-89ff5e375790")
    PropertyContainer getOwner();

    @objid ("e4d9ea45-4421-4a30-aba0-3b4f2294c50b")
    void setOwner(PropertyContainer value);

    @objid ("9f119a85-73d1-4ded-a1ac-ebd59d789202")
    EList<TypedPropertyTable> getTypedTable();

    @objid ("67cb13b9-3c0c-41de-a9d3-31328dc3de29")
    <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass);

    @objid ("e49e399c-a395-47c1-8598-4483e91bd76c")
    MetaclassReference getOwnerReference();

    @objid ("add542ff-66c8-441c-8e05-9faab9bf3c20")
    void setOwnerReference(MetaclassReference value);

    @objid ("2b48a436-e0b1-4404-a726-8cd4a7a01eea")
    Stereotype getOwnerStereotype();

    @objid ("218e44c7-075d-4c63-a279-df635f24487a")
    void setOwnerStereotype(Stereotype value);

    @objid ("453e327d-d482-4c88-960d-ee5d6a6fbb56")
    EList<PropertyDefinition> getOwned();

    @objid ("700c1390-657e-48d5-86e2-9d92e823f044")
    <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass);

}
