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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008e8d34-c4be-1fd8-97fe-001ec947cd2a")
public interface TagParameter extends Element {
    @objid ("30a8d58b-b783-474e-9bec-317aee48c7f6")
    String getValue();

    @objid ("227e4615-84f9-42b4-a998-31dd1367175a")
    void setValue(String value);

    @objid ("41de1300-549c-41e0-9535-0831254cbf49")
    TaggedValue getAnnoted();

    @objid ("14723298-a685-4e2f-85c5-ffc13b32c0c5")
    void setAnnoted(TaggedValue value);

    @objid ("4d2f129f-b893-4c49-acbc-66e97977deda")
    TaggedValue getQualified();

    @objid ("d2fbd611-3b51-45ae-a960-110c377aab50")
    void setQualified(TaggedValue value);

    @objid ("41d67a4c-f561-41c4-bb67-62d8e035204f")
    LocalTaggedValue getLocalAnnoted();

    @objid ("c430b61d-388c-4f06-9bd8-9d85cb22d84e")
    void setLocalAnnoted(LocalTaggedValue value);

    @objid ("bbdb8d11-867c-40e4-b523-19be4b43feb8")
    LocalTaggedValue getLocalQualified();

    @objid ("a52ea758-7e1f-4cdc-89ba-3ebb6c4f5071")
    void setLocalQualified(LocalTaggedValue value);

}
