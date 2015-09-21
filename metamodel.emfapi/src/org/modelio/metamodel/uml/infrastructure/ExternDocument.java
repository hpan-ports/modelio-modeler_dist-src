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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * ExternDocument v0.0.9054
 * 
 * 
 * Represents a rich note stored outside the database.
 * <p>
 * The rich note has a specified MIME type that allows choosing an adequate editor to modify it. It may have or not a path telling where it is stored. It may also have an abstract containing a resume, statistics or other informations telling what the document contains without having to open it.
 */
@objid ("00924014-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocument extends ModelElement {
    @objid ("acca581d-b03e-4636-9743-71d576790c1f")
    public static final String MNAME = "ExternDocument";

    /**
     * Getter for attribute 'ExternDocument.MimeType'
     * 
     * Metamodel description:
     * <i>MIME type of the rich note.</i>
     */
    @objid ("cbe906c9-1909-4197-98bd-b53c5a4bd4a7")
    String getMimeType();

    /**
     * Setter for attribute 'ExternDocument.MimeType'
     * 
     * Metamodel description:
     * <i>MIME type of the rich note.</i>
     */
    @objid ("610d35e7-4a8c-45c9-b793-89f8b4f434bc")
    void setMimeType(String value);

    /**
     * Getter for attribute 'ExternDocument.Path'
     * 
     * Metamodel description:
     * <i>Path of the rich note if stored elsewhere than the default location. Can be relative to the model fragment location.</i>
     */
    @objid ("30d51e80-50f5-41b1-a3b2-dd308ba412bd")
    String getPath();

    /**
     * Setter for attribute 'ExternDocument.Path'
     * 
     * Metamodel description:
     * <i>Path of the rich note if stored elsewhere than the default location. Can be relative to the model fragment location.</i>
     */
    @objid ("1e92a9dd-4430-4ecf-bbfb-07387e351656")
    void setPath(String value);

    /**
     * Getter for attribute 'ExternDocument.Abstract'
     * 
     * Metamodel description:
     * <i>An Abstract/Resume of the rich note.
     * Tells what the rich note contains without having to open it.</i>
     */
    @objid ("c6b213b2-3d13-4a76-a686-279e6c96b1ff")
    String getAbstract();

    /**
     * Setter for attribute 'ExternDocument.Abstract'
     * 
     * Metamodel description:
     * <i>An Abstract/Resume of the rich note.
     * Tells what the rich note contains without having to open it.</i>
     */
    @objid ("d3ec1489-84d5-411c-9e03-f052fa5fd88e")
    void setAbstract(String value);

    /**
     * Getter for relation 'ExternDocument->Type'
     * 
     * Metamodel description:
     * <i>Semantic function of the rich note.</i>
     */
    @objid ("d07d3a12-fe5d-4d26-9ff8-3a587f27e782")
    ExternDocumentType getType();

    /**
     * Setter for relation 'ExternDocument->Type'
     * 
     * Metamodel description:
     * <i>Semantic function of the rich note.</i>
     */
    @objid ("27c2d341-8325-4949-a59e-22a662fe0a23")
    void setType(ExternDocumentType value);

    /**
     * Getter for relation 'ExternDocument->Subject'
     * 
     * Metamodel description:
     * <i>Model element owning the rich note.</i>
     */
    @objid ("a1272d34-62c9-4138-81db-7a14570f22e1")
    ModelElement getSubject();

    /**
     * Setter for relation 'ExternDocument->Subject'
     * 
     * Metamodel description:
     * <i>Model element owning the rich note.</i>
     */
    @objid ("f2675fe5-b91b-4c0e-a988-0b8d7b951dd4")
    void setSubject(ModelElement value);

}
