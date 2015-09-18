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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("001d18e8-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameter extends GeneralClass {
    @objid ("cc111467-5441-435b-964b-f8b1335975d2")
    String getDefaultValue();

    @objid ("e55e9c3e-c98e-4d42-b402-02eb14ae77a4")
    void setDefaultValue(String value);

    @objid ("6fb076f9-4789-4b2e-994a-d78d47d67468")
    boolean isIsValueParameter();

    @objid ("42f7aa56-d952-40e4-8c7e-fb7201258924")
    void setIsValueParameter(boolean value);

    @objid ("aa18c7c0-4b1f-4cbd-990c-6a03ab9601d2")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("4d33abdd-2679-4732-86b6-4cbb22a40e9d")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("95304d75-8318-4bb2-b74e-2a15be7b665b")
    ModelElement getType();

    @objid ("179cd842-11e4-4d85-b9f5-9387ff89f369")
    void setType(ModelElement value);

    @objid ("36e47a88-a021-4fa6-ad58-3ae5e05abb59")
    NameSpace getParameterized();

    @objid ("e4c70bb7-4e3b-4d4f-a7dd-48f605d40fc9")
    void setParameterized(NameSpace value);

    @objid ("1c8bd550-3b39-41c3-a5c9-41de0c2d8d7a")
    ModelElement getOwnedParameterElement();

    @objid ("a8e48ee5-fff9-4329-b69a-45b6ff6c7cc4")
    void setOwnedParameterElement(ModelElement value);

    @objid ("f5786495-38e5-4a11-a102-147888461a02")
    ModelElement getDefaultType();

    @objid ("da3d2d9f-4351-49b3-8683-29b3b48cf162")
    void setDefaultType(ModelElement value);

    @objid ("86fcd05e-7fe1-4a76-a2d1-0ef477b92902")
    Operation getParameterizedOperation();

    @objid ("49b8f8e0-af7c-4be9-a35b-298f2bdab226")
    void setParameterizedOperation(Operation value);

}
