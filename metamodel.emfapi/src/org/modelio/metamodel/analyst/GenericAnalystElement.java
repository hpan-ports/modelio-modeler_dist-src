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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.GenericAnalystContainer;

@objid ("b3e7a343-fe88-4eec-9078-87bfbbaaa3f0")
public interface GenericAnalystElement extends AnalystElement {
    @objid ("c362f5bf-c683-46a4-a893-d1400b76a69f")
    EList<GenericAnalystElement> getSubElement();

    @objid ("d1be6032-7926-41da-b9ef-dd61572cd868")
    <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass);

    @objid ("cc0192a3-f2ae-45bb-8d7b-34dcca935614")
    GenericAnalystContainer getOwnerContainer();

    @objid ("3f384776-2ee6-4776-b1fe-682134f6f244")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("5bda4f01-959e-4807-80ed-8c54b3262f0b")
    GenericAnalystElement getParentElement();

    @objid ("ad89d733-38d9-4aeb-b62a-b79de613e9b4")
    void setParentElement(GenericAnalystElement value);

    @objid ("afe7b977-d5fe-49d4-9914-bc98677a507c")
    GenericAnalystElement getLastElementVersion();

    @objid ("b8db8cc8-2239-442f-b029-89519641f123")
    void setLastElementVersion(GenericAnalystElement value);

    @objid ("88422697-5446-421b-a65a-f408e569c5fe")
    EList<GenericAnalystElement> getArchivedElementVersion();

    @objid ("3d05e52a-4ae5-4e2d-b5a9-830678bd2156")
    <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass);

}
