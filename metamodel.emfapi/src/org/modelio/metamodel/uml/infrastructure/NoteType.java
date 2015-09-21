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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

/**
 * NoteType v0.0.9054
 * 
 * 
 * NoteTypes are conditioned by Modelio plug-ins (editors and modules). For example, the definitions of document templates are made before those of the associated text definitions. These are determined by textual headings, which must be entered in order to be used by generated documents. The same applies to generated code, which determines the textual zones to be entered. 
 * 
 * NoteTypes cannot be created using the J language in Modelio. They belong at meta-level, and should only be referred to. Services are provided in order to find the available Notes for the current Project.
 */
@objid ("008bb80c-c4be-1fd8-97fe-001ec947cd2a")
public interface NoteType extends ModelElement {
    @objid ("9aa5a3fc-8731-4d83-8f37-62170cddfd0a")
    public static final String MNAME = "NoteType";

    @objid ("86c9b1d3-36e0-4281-ae56-13648e6465ec")
    ModuleComponent getModule();

    /**
     * Getter for attribute 'NoteType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cee7a9b2-eeb3-418f-b645-869c7aad23e2")
    boolean isIsHidden();

    /**
     * Setter for attribute 'NoteType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9b8e1cd0-45f8-4fcd-8103-5a1d37824fd2")
    void setIsHidden(boolean value);

    /**
     * Getter for attribute 'NoteType.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("08daf326-f09e-4ec6-b49d-6fa92fdfbd6e")
    String getLabelKey();

    /**
     * Setter for attribute 'NoteType.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("a12c4bc3-3cfa-42af-bd62-1cd6b2b6c602")
    void setLabelKey(String value);

    /**
     * Getter for attribute 'NoteType.MimeType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("bf2a19f9-e97e-4bf9-a91f-600d62c33fa4")
    String getMimeType();

    /**
     * Setter for attribute 'NoteType.MimeType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("baaf5a48-483f-4d78-822f-b5fed66023c4")
    void setMimeType(String value);

    /**
     * Getter for relation 'NoteType->Element'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("95a32fa1-449a-434c-8a73-7242fc052110")
    EList<Note> getElement();

    /**
     * Filtered Getter for relation 'NoteType->Element'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f5e96cb0-6be6-42bc-81a6-938be138b907")
    <T extends Note> List<T> getElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NoteType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4a4eeb47-282d-47f1-bcb0-783cf76e0c87")
    Stereotype getOwnerStereotype();

    /**
     * Setter for relation 'NoteType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8f56ca3-9f47-4a7a-951a-d42e3e0aa638")
    void setOwnerStereotype(Stereotype value);

    /**
     * Getter for relation 'NoteType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("213d8e9b-b8eb-47ac-b368-f7dbcc8fffba")
    MetaclassReference getOwnerReference();

    /**
     * Setter for relation 'NoteType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("523c1f12-be78-4638-9584-58beadf8f038")
    void setOwnerReference(MetaclassReference value);

}
