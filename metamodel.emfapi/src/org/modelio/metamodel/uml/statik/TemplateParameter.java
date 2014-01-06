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
    @objid ("397ca0c3-d49d-4940-9211-415dc1ee2827")
    String getDefaultValue();

    @objid ("c6b7d639-3685-4a0c-abf3-e7ea9cf5737f")
    void setDefaultValue(String value);

    @objid ("2d5fb3ed-b903-462b-a2e2-2adb794c2dd6")
    boolean isIsValueParameter();

    @objid ("eb316a29-2436-4659-b07a-653c44e1706a")
    void setIsValueParameter(boolean value);

    @objid ("be8a5ec4-f8d3-4186-8960-3e84d568365c")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("9951616f-0aeb-427c-8633-6403d46ee0af")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("5d912a71-6f81-457b-b261-8e8a3af09fd5")
    ModelElement getType();

    @objid ("63d41ed7-76cf-45c6-8718-2709d431a478")
    void setType(ModelElement value);

    @objid ("4f69d842-0827-4de1-90df-8e6f58eb9bfc")
    NameSpace getParameterized();

    @objid ("353f63aa-55dc-4097-88b3-de794732a846")
    void setParameterized(NameSpace value);

    @objid ("8a37bb97-0a33-4afe-9ded-f12f066fac50")
    ModelElement getOwnedParameterElement();

    @objid ("85434ca8-7483-4c63-a8a1-ec90e8b4472d")
    void setOwnedParameterElement(ModelElement value);

    @objid ("4ae9fd4d-7edd-46ee-b28b-d966ba71e568")
    ModelElement getDefaultType();

    @objid ("a38b1fc1-a637-4bf5-ae96-d3f286c8f2f4")
    void setDefaultType(ModelElement value);

    @objid ("0a44ce9f-e4c9-4976-80fb-982d5ae3129f")
    Operation getParameterizedOperation();

    @objid ("30919b91-de29-4ab1-8668-1c8385bc8156")
    void setParameterizedOperation(Operation value);

}
