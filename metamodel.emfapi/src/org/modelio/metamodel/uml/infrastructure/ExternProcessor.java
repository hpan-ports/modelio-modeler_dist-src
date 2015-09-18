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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("e5bf50a8-5a3e-4c5c-9bf8-83310c530ee3")
public interface ExternProcessor extends ModelElement {
    @objid ("9ca798fa-c8c3-420e-89dd-3ad7235f0dc5")
    String getClassName();

    @objid ("f6dd96e7-11a0-4f9b-b571-2329032b1bd8")
    void setClassName(String value);

    @objid ("10156453-69c0-4dfe-a507-ff289bd45f68")
    QueryDefinition getOwnerQuery();

    @objid ("4572621c-8c57-4719-84c4-2f225e2bf5b5")
    void setOwnerQuery(QueryDefinition value);

    @objid ("f7369df6-1c22-4bb3-b5a8-9303cb35d0c5")
    MatrixValueDefinition getOwnerValDef();

    @objid ("12c7c0cc-33c9-4215-94cf-d26ea1109b5c")
    void setOwnerValDef(MatrixValueDefinition value);

}
