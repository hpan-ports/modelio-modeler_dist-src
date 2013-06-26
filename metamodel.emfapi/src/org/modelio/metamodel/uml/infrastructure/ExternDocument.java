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
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00924014-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocument extends ModelElement {
    @objid ("8ec7cced-a41d-48dd-86ad-5b6e4f314d0d")
    String getMimeType();

    @objid ("4755f053-0a4a-468e-a0db-0f19341ea087")
    void setMimeType(String value);

    @objid ("41797ece-801f-445b-9d80-c50fe32b7d18")
    String getPath();

    @objid ("a81aa379-1bd4-411c-8f21-0509cbc1bd2f")
    void setPath(String value);

    @objid ("5ceb6563-450b-4ad9-9fc0-803f127ce503")
    String getAbstract();

    @objid ("47ac04b8-5b1d-4224-8fd8-e87fccd76c6e")
    void setAbstract(String value);

    @objid ("12855976-6b80-42ae-99f2-5b72f6f6e431")
    ExternDocumentType getType();

    @objid ("b35bc1a3-99a5-40b1-ae52-3ec8eaac03ae")
    void setType(ExternDocumentType value);

    @objid ("dced7f9f-3e4b-4b65-af54-335d82af0d12")
    ModelElement getSubject();

    @objid ("0a6fd6ff-c2cd-4cda-944d-2c7c09142ce8")
    void setSubject(ModelElement value);

}
