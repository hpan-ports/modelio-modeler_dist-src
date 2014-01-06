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
    @objid ("e6d9ea97-134f-4192-853f-5c4fc9cb13f7")
    int getUiDataVersion();

    @objid ("1e316eaa-6932-4b10-ab7c-3d92f65937ea")
    void setUiDataVersion(int value);

    @objid ("4d02d4c3-68f1-4cfb-bdbd-47b3517de831")
    String getUiData();

    @objid ("8f90695b-828c-493f-9c8f-15f534a5312e")
    void setUiData(String value);

    @objid ("109f49e3-503f-4b7e-8523-01d2035e8013")
    String getPdeProperties();

    @objid ("9031c4d6-854c-4e5d-bff4-ef85ce3a41b3")
    void setPdeProperties(String value);

    @objid ("c0241400-1e8d-44ba-b816-717bd0ecbe87")
    ModelElement getOrigin();

    @objid ("9d132915-24ac-484c-8317-6948f7183d39")
    void setOrigin(ModelElement value);

    @objid ("354a9c10-45af-4d48-8355-e82256bf071f")
    EList<Element> getRepresented();

    @objid ("56bb61ab-d7c0-4d03-96cd-c0c53ef51144")
    <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass);

    @objid ("3bf9c4cf-d778-4431-937a-f6380a6fda59")
    EList<DiagramSet> getReferencingSet();

    @objid ("eeec8574-9ff0-4419-ae22-42de2efeab09")
    <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass);

}
