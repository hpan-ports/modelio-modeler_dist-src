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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00924014-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocument extends ModelElement {
    @objid ("92694de5-84c7-48c4-ab0f-d0e7223b6fc4")
    String getMimeType();

    @objid ("3d43a0a1-0fd4-4b9a-8e42-9ff82e23f40c")
    void setMimeType(String value);

    @objid ("eeb0988e-f10c-44f1-8648-75b5796d42d7")
    String getPath();

    @objid ("aa822cf8-454a-4f31-83e9-8d2fb124f222")
    void setPath(String value);

    @objid ("c2433baa-023d-419d-90fa-56b25689c325")
    String getAbstract();

    @objid ("d26b8343-24a5-4c2b-a36a-5ad059eb541e")
    void setAbstract(String value);

    @objid ("4dc7ddfc-c8e1-46b3-848c-6d89cd5ab498")
    ExternDocumentType getType();

    @objid ("3bcf4a71-3a26-45a3-9432-cf91b819831b")
    void setType(ExternDocumentType value);

    @objid ("20508009-4ac2-4b28-81db-f616a7e56bf7")
    ModelElement getSubject();

    @objid ("0ac64cf6-fd4b-4ae1-b331-f2bea7d7f4d8")
    void setSubject(ModelElement value);

}
