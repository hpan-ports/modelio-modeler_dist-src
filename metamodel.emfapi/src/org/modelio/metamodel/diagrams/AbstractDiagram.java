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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("006721c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface AbstractDiagram extends ModelElement {
    @objid ("7ae29c7f-546b-4512-b4ac-989e3e041c0c")
    int getUiDataVersion();

    @objid ("f679ea57-7266-483f-b35b-53d450045a7d")
    void setUiDataVersion(int value);

    @objid ("37c7287f-9615-4f34-bc50-6a9fdbe46fdc")
    String getUiData();

    @objid ("face7fdd-1299-40da-9eaa-8798685a39b6")
    void setUiData(String value);

    @objid ("a6538b1a-2ee8-4ccb-8499-fc2ba560c271")
    String getPdeProperties();

    @objid ("897fd06c-65ca-4041-b0fc-585bdd33cdc0")
    void setPdeProperties(String value);

    @objid ("78d62bc7-71f9-489a-93a5-e4e0a0486cff")
    ModelElement getOrigin();

    @objid ("221bb280-2ecd-4180-a5ad-4c38b297ed75")
    void setOrigin(ModelElement value);

    @objid ("23fe0b35-1549-42f2-8613-af310ba2f332")
    EList<Element> getRepresented();

    @objid ("678487e7-7b3c-43ef-8f74-324d33b0f80b")
    <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass);

    @objid ("ec1ab296-4c59-4705-8b82-5272f421c551")
    EList<DiagramSet> getReferencingSet();

    @objid ("92c9943f-aa84-48ea-9766-1cedc76b5a54")
    <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass);

}
