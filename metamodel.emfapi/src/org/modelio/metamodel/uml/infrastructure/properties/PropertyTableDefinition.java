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
    @objid ("895ec834-7462-49a6-9719-2ee5cb6ba6bc")
    PropertyContainer getOwner();

    @objid ("cdabaad0-808a-4202-97dd-c325103a9360")
    void setOwner(PropertyContainer value);

    @objid ("7137d4cc-102b-4979-b1f2-afd47cdaa723")
    EList<TypedPropertyTable> getTypedTable();

    @objid ("127e071c-5192-4a85-ac91-8023d92c618b")
    <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass);

    @objid ("4c8ef568-cc2f-4359-9e29-6cc9f3477275")
    MetaclassReference getOwnerReference();

    @objid ("1477287f-1e41-48d7-aeef-3676521cb114")
    void setOwnerReference(MetaclassReference value);

    @objid ("2c5d21c7-6fbc-423e-bab9-0c8c418c534e")
    Stereotype getOwnerStereotype();

    @objid ("55c56429-3dfc-4b4c-a904-a04c41711c25")
    void setOwnerStereotype(Stereotype value);

    @objid ("ee3d1397-a7eb-4bc7-a540-0c9856623ac7")
    EList<PropertyDefinition> getOwned();

    @objid ("00dcab40-60bc-4ac8-a7eb-f11aed7dc5b7")
    <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass);

}
