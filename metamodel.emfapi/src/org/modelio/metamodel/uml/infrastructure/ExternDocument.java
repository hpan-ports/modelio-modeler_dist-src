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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00924014-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocument extends ModelElement {
    @objid ("855a988b-b5dc-4733-b5a6-a3d55d81e49a")
    String getMimeType();

    @objid ("be22be40-7110-4223-a70b-b231631546bc")
    void setMimeType(String value);

    @objid ("5b2c34f1-0c00-426b-88aa-326054bee668")
    String getPath();

    @objid ("6c653baa-b2fe-47b7-b37c-cc93c07eafbc")
    void setPath(String value);

    @objid ("66ab25f3-751d-4bfe-817f-8e3a3726c33c")
    String getAbstract();

    @objid ("c6db34e0-0385-4afc-ba34-3f06fadc9295")
    void setAbstract(String value);

    @objid ("d4261a5d-e36a-484e-b050-c67c17831a43")
    ExternDocumentType getType();

    @objid ("66a07f22-af2a-45fd-b71c-ad2190810209")
    void setType(ExternDocumentType value);

    @objid ("83aed9eb-3624-4693-b1c5-02fa241777c8")
    ModelElement getSubject();

    @objid ("5b250321-87ab-434d-be7e-33b692fcd0d8")
    void setSubject(ModelElement value);

}
