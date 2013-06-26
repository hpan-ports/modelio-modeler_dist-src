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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("0092fefa-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocumentType extends ModelElement {
    @objid ("1cb032b7-9ac9-46f1-b30f-f2f395b83488")
    ModuleComponent getModule();

    @objid ("5bfe90c1-6b8d-4e5f-9587-d6a661017e0a")
    boolean isIsHidden();

    @objid ("c5cc8e97-cb6e-49ad-81a8-678488137233")
    void setIsHidden(boolean value);

    @objid ("5b10e0d4-9a44-4f0b-8943-fb0577ec15db")
    String getLabelKey();

    @objid ("31b2e354-4b2d-44b7-807a-27cc961c0c4f")
    void setLabelKey(String value);

    @objid ("16cf9813-3a77-47a7-b781-3c84010cdfab")
    String getIcon();

    @objid ("43823302-6458-473b-bf51-835ee9372c93")
    void setIcon(String value);

    @objid ("8c9600d3-61c8-42a5-9bd2-a90e57dce173")
    String getImage();

    @objid ("26691272-7508-448b-aef0-fe5cc51dc609")
    void setImage(String value);

    @objid ("1bd3bd9f-3de8-4b19-b514-203a79fa8138")
    Stereotype getOwnerStereotype();

    @objid ("be953f84-657a-492e-bca2-248aec7861a7")
    void setOwnerStereotype(Stereotype value);

    @objid ("6b88b45e-1742-43ee-acb1-d22897727cab")
    EList<ExternDocument> getTypedDoc();

    @objid ("0d552c3c-5916-4074-9cfd-2fc7db77f140")
    <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass);

    @objid ("1af87e42-845f-415f-bdcc-d0b4cd8134f7")
    MetaclassReference getOwnerReference();

    @objid ("4c1dc078-262d-439c-acda-7c2e5c5a842c")
    void setOwnerReference(MetaclassReference value);

}
