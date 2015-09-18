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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("0008034a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementImport extends ModelElement {
    @objid ("86e0ad32-449c-420e-9414-f96df3e9fee5")
    VisibilityMode getVisibility();

    @objid ("70bcf431-e0ac-4ef0-9732-5172d7fe0662")
    void setVisibility(VisibilityMode value);

    @objid ("36318220-f843-4d10-962b-a13c01321d97")
    NameSpace getImportingNameSpace();

    @objid ("06a396d2-6c9b-4a4c-88ae-084372b875b0")
    void setImportingNameSpace(NameSpace value);

    @objid ("d50ed98d-0be2-4273-83bd-a9eeed1961ca")
    NameSpace getImportedElement();

    @objid ("045a45bc-0163-4801-9059-5644cc45ba27")
    void setImportedElement(NameSpace value);

    @objid ("e31e8cb9-80b6-413f-98d5-90d326834940")
    Operation getImportingOperation();

    @objid ("cb70e30f-46dc-4572-8d42-6cac1dd87a50")
    void setImportingOperation(Operation value);

}
