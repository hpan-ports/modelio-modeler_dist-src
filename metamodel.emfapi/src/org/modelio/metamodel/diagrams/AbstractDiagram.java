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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * AbstractDiagram v0.0.9054
 */
@objid ("006721c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface AbstractDiagram extends ModelElement {
    @objid ("98bd2d18-f652-449d-9c01-4d445a8a3bec")
    public static final String MNAME = "AbstractDiagram";

    /**
     * Getter for attribute 'AbstractDiagram.UiDataVersion'
     * 
     * Metamodel description:
     * <i>Serialized contents version.</i>
     */
    @objid ("96d03871-d45d-489f-ac27-f38a5b0a1ab7")
    int getUiDataVersion();

    /**
     * Setter for attribute 'AbstractDiagram.UiDataVersion'
     * 
     * Metamodel description:
     * <i>Serialized contents version.</i>
     */
    @objid ("1527f84c-e6b4-4f99-86ae-4d01539f74c0")
    void setUiDataVersion(int value);

    /**
     * Getter for attribute 'AbstractDiagram.UiData'
     * 
     * Metamodel description:
     * <i>Serialized diagram content.</i>
     */
    @objid ("1c2f28be-6f98-4e97-a2a4-5602a386ab7d")
    String getUiData();

    /**
     * Setter for attribute 'AbstractDiagram.UiData'
     * 
     * Metamodel description:
     * <i>Serialized diagram content.</i>
     */
    @objid ("8d1e8835-3aca-400b-8bb7-1ea511795776")
    void setUiData(String value);

    /**
     * Getter for attribute 'AbstractDiagram.PdeProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("93b163e9-7d8a-4a9a-acbb-77879f31a970")
    String getPdeProperties();

    /**
     * Setter for attribute 'AbstractDiagram.PdeProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7e92c802-941f-4cb2-8cc5-c423204337d2")
    void setPdeProperties(String value);

    /**
     * Getter for relation 'AbstractDiagram->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e3f33d25-8c75-4601-a2b9-162c4c109bb5")
    ModelElement getOrigin();

    /**
     * Setter for relation 'AbstractDiagram->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("70babdac-c922-4944-92eb-38a8119d42eb")
    void setOrigin(ModelElement value);

    /**
     * Getter for relation 'AbstractDiagram->Represented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8cf7bb1a-a18f-49c4-8657-04eb41084c5f")
    EList<Element> getRepresented();

    /**
     * Filtered Getter for relation 'AbstractDiagram->Represented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("38c3cb80-9b26-4431-becb-128300d60ab9")
    <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AbstractDiagram->ReferencingSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ed584b14-f6f2-4fd8-95cb-1c9b1b4a9b68")
    EList<DiagramSet> getReferencingSet();

    /**
     * Filtered Getter for relation 'AbstractDiagram->ReferencingSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b41e12ae-14f0-4106-9652-81fbc9b5609b")
    <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass);

}
