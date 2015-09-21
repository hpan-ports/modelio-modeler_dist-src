/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

/**
 * TemplateBinding v0.0.9054
 * 
 * 
 * A TemplateBinding specifies the Substitution of actual Parameters by the formal Parameters of the template. 
 * 
 * A TemplateBinding is a directed relationship from a bound templateable element to the template signature of the target template. 
 * 
 * A TemplateBinding owns a set of TemplateParameterSubstitutions.
 */
@objid ("001c3784-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateBinding extends ModelElement {
    @objid ("b7023974-f00d-47a5-bd83-4c9d31a2d0cd")
    public static final String MNAME = "TemplateBinding";

    /**
     * Getter for relation 'TemplateBinding->ParameterSubstitution'
     * 
     * Metamodel description:
     * <i>The ParameterSubstitutions owned by this TemplateBinding.</i>
     */
    @objid ("5842b11d-2e4b-4b1f-b434-4721b40f1d41")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    /**
     * Filtered Getter for relation 'TemplateBinding->ParameterSubstitution'
     * 
     * Metamodel description:
     * <i>The ParameterSubstitutions owned by this TemplateBinding.</i>
     */
    @objid ("ccce9771-7340-4fd6-bcdf-95df463d87ad")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'TemplateBinding->BoundOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4970093f-bb11-46d4-a753-12d88e0cca4b")
    Operation getBoundOperation();

    /**
     * Setter for relation 'TemplateBinding->BoundOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8da5ccb8-fb1b-49f0-8485-d51f09f71119")
    void setBoundOperation(Operation value);

    /**
     * Getter for relation 'TemplateBinding->InstanciatedTemplateOperation'
     * 
     * Metamodel description:
     * <i>The element that is bound by this Binding.</i>
     */
    @objid ("15e6c5a0-f62d-4eea-a4c8-ff08127748c8")
    Operation getInstanciatedTemplateOperation();

    /**
     * Setter for relation 'TemplateBinding->InstanciatedTemplateOperation'
     * 
     * Metamodel description:
     * <i>The element that is bound by this Binding.</i>
     */
    @objid ("e2ee195b-ab80-47f2-83dc-2236c288f667")
    void setInstanciatedTemplateOperation(Operation value);

    /**
     * Getter for relation 'TemplateBinding->InstanciatedTemplate'
     * 
     * Metamodel description:
     * <i>The template element that is the target of the Binding.</i>
     */
    @objid ("ecb6ff6a-3e21-41d4-bf56-46a3ccb23d28")
    NameSpace getInstanciatedTemplate();

    /**
     * Setter for relation 'TemplateBinding->InstanciatedTemplate'
     * 
     * Metamodel description:
     * <i>The template element that is the target of the Binding.</i>
     */
    @objid ("0b7f1d6f-af12-459e-bf71-91038a2676eb")
    void setInstanciatedTemplate(NameSpace value);

    /**
     * Getter for relation 'TemplateBinding->BoundElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d32d9998-cb90-48d5-9396-f2093ed6b9d8")
    NameSpace getBoundElement();

    /**
     * Setter for relation 'TemplateBinding->BoundElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b63e5906-f991-4e97-acb6-15e431c1b0ea")
    void setBoundElement(NameSpace value);

}
