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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;

@objid ("2323bb5a-2eb8-4f3b-9d89-6f800d5d57aa")
public class OEntryPointPseudoState extends OAbstractPseudoState implements IOElement {
    @objid ("9549daee-fd7a-442e-a558-c395d9126553")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createPseudostate();
    }

    @objid ("b7e15e24-57bc-498d-96af-b2f2aec28ef9")
    public OEntryPointPseudoState(EntryPointPseudoState param) {
        super(param);
    }

    @objid ("1767b123-4eb5-40ef-bed7-c105c4e4951e")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
    }

    @objid ("8ccfed73-2971-4f2e-ae11-903c4f91a4de")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        setKind( (org.eclipse.uml2.uml.Pseudostate)ecoreElt);
    }

    @objid ("ea9d7038-6c6c-4beb-9fa9-d81f0d5044b6")
    private void setKind(org.eclipse.uml2.uml.Pseudostate pseudostate) {
        pseudostate.setKind (org.eclipse.uml2.uml.PseudostateKind.ENTRY_POINT_LITERAL);
    }

}
