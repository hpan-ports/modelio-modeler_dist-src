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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("e5bf50a8-5a3e-4c5c-9bf8-83310c530ee3")
public interface ExternProcessor extends ModelElement {
    @objid ("b1333679-d442-44f1-a4f2-adfe75a6da5e")
    String getClassName();

    @objid ("b784cf94-e97e-4ed0-9516-36d242942dfc")
    void setClassName(String value);

    @objid ("e121c55b-4497-435a-b5e1-25da5376937c")
    QueryDefinition getOwnerQuery();

    @objid ("aa17eeaa-1fcb-43b1-8716-9daf41d17ba5")
    void setOwnerQuery(QueryDefinition value);

    @objid ("acb09789-8bf4-447e-a30b-8c84bb79724d")
    MatrixValueDefinition getOwnerValDef();

    @objid ("fc895814-6020-40e9-81bc-958cdb1bf353")
    void setOwnerValDef(MatrixValueDefinition value);

}
