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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("f8f56e9e-9f2f-4273-ab35-2bb13871cb48")
    int getUiDataVersion();

    @objid ("d50a2a2a-9ef6-4ba1-bd62-600b4c26a132")
    void setUiDataVersion(int value);

    @objid ("038916ef-bb46-4340-be28-5e625a4589f4")
    String getUiData();

    @objid ("3d429585-625f-4914-aa0a-fba6afb88ae0")
    void setUiData(String value);

    @objid ("0c489f45-c324-4dbc-a703-528cdeea0792")
    String getPdeProperties();

    @objid ("611b5215-7cb9-4c8c-a06f-b82d1e093c36")
    void setPdeProperties(String value);

    @objid ("c248fd61-1ea7-4a7d-9524-8753f829f796")
    ModelElement getOrigin();

    @objid ("35117ff2-84da-4cc1-99bf-9d6d0ab4383f")
    void setOrigin(ModelElement value);

    @objid ("5f7297a3-0868-4025-a3d8-bf582cc4d400")
    EList<Element> getRepresented();

    @objid ("be3f62cb-6b19-43f0-a854-ac3b3c065358")
    <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass);

    @objid ("81eccf7a-c892-479e-939f-12f508ce465c")
    EList<DiagramSet> getReferencingSet();

    @objid ("19759254-7d2c-4add-a9c2-37e1423aead8")
    <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass);

}
