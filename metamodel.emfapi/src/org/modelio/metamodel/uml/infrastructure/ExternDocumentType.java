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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

/**
 * ExternDocumentType v0.0.9054
 * 
 * 
 * Rich note type
 */
@objid ("0092fefa-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocumentType extends ModelElement {
    @objid ("d1c4843e-82ee-452a-8992-b2828f5c0e7b")
    public static final String MNAME = "ExternDocumentType";

    @objid ("1cb032b7-9ac9-46f1-b30f-f2f395b83488")
    ModuleComponent getModule();

    /**
     * Getter for attribute 'ExternDocumentType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ea1eee54-45ad-4f72-b6e1-b8967e77f07c")
    boolean isIsHidden();

    /**
     * Setter for attribute 'ExternDocumentType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("80017fae-88d8-474d-8ccb-bd0811b8c42f")
    void setIsHidden(boolean value);

    /**
     * Getter for attribute 'ExternDocumentType.LabelKey'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1a68936c-59ca-435b-af45-bfc0802163bc")
    String getLabelKey();

    /**
     * Setter for attribute 'ExternDocumentType.LabelKey'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a8302269-ca0c-41ce-a3cc-0bdd996d32ec")
    void setLabelKey(String value);

    /**
     * Getter for attribute 'ExternDocumentType.Icon'
     * 
     * Metamodel description:
     * <i>Optional icon for the browser and diagram</i>
     */
    @objid ("1c381b0c-8e5e-4de0-9da5-0e5373ee4ac7")
    String getIcon();

    /**
     * Setter for attribute 'ExternDocumentType.Icon'
     * 
     * Metamodel description:
     * <i>Optional icon for the browser and diagram</i>
     */
    @objid ("f2268439-0c14-414c-8044-fd0ea037088a")
    void setIcon(String value);

    /**
     * Getter for attribute 'ExternDocumentType.Image'
     * 
     * Metamodel description:
     * <i>Big image for the diagram in image mode.</i>
     */
    @objid ("8ba4a12b-0616-4366-ba32-6a42990d9a61")
    String getImage();

    /**
     * Setter for attribute 'ExternDocumentType.Image'
     * 
     * Metamodel description:
     * <i>Big image for the diagram in image mode.</i>
     */
    @objid ("6cba58cc-558c-4e51-b173-aa4bc0890602")
    void setImage(String value);

    /**
     * Getter for relation 'ExternDocumentType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("53b4ce81-59fd-4813-b375-137db2ef46ba")
    Stereotype getOwnerStereotype();

    /**
     * Setter for relation 'ExternDocumentType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6178b37a-fc65-41a3-8717-2a3ba0193860")
    void setOwnerStereotype(Stereotype value);

    /**
     * Getter for relation 'ExternDocumentType->TypedDoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c765f44e-a027-4e81-9b05-c31fc97217d9")
    EList<ExternDocument> getTypedDoc();

    /**
     * Filtered Getter for relation 'ExternDocumentType->TypedDoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bbc1d815-430b-44a8-aa82-a843573f13f5")
    <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ExternDocumentType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("915676a4-44b4-42c8-bdf5-b9db25fd4ef1")
    MetaclassReference getOwnerReference();

    /**
     * Setter for relation 'ExternDocumentType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f2ec28be-2b67-450f-8337-a403092c1075")
    void setOwnerReference(MetaclassReference value);

}
