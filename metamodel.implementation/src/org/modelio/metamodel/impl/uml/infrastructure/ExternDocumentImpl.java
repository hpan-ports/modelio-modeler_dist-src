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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00927aac-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentImpl extends ModelElementImpl implements ExternDocument {
    @objid ("bf4d7d20-3204-4799-a23d-7d58e62db969")
    @Override
    public String getMimeType() {
        return (String) getAttVal(ExternDocumentData.Metadata.MimeTypeAtt());
    }

    @objid ("fef7b1fd-f699-4cdf-a753-35e66b6d4f1d")
    @Override
    public void setMimeType(String value) {
        setAttVal(ExternDocumentData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("12569b02-b98b-4cdf-b464-92177e571e85")
    @Override
    public String getPath() {
        return (String) getAttVal(ExternDocumentData.Metadata.PathAtt());
    }

    @objid ("ca8c3640-cd64-4f15-91dd-e67720ff7849")
    @Override
    public void setPath(String value) {
        setAttVal(ExternDocumentData.Metadata.PathAtt(), value);
    }

    @objid ("150af35a-3d08-42fa-9fed-87cb8a2da8ec")
    @Override
    public String getAbstract() {
        return (String) getAttVal(ExternDocumentData.Metadata.AbstractAtt());
    }

    @objid ("d85f2f4e-e787-42a4-8564-ca381fa10176")
    @Override
    public void setAbstract(String value) {
        setAttVal(ExternDocumentData.Metadata.AbstractAtt(), value);
    }

    @objid ("3b4ef07e-f118-48d0-bdb4-b88102eb919d")
    @Override
    public ExternDocumentType getType() {
        return (ExternDocumentType) getDepVal(ExternDocumentData.Metadata.TypeDep());
    }

    @objid ("a1d061c3-0b51-4372-acba-7ad24c8206a9")
    @Override
    public void setType(ExternDocumentType value) {
        appendDepVal(ExternDocumentData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("a5ff391b-2ed3-4812-a9d6-456dd93c223c")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(ExternDocumentData.Metadata.SubjectDep());
    }

    @objid ("7ea255d0-13f9-4c5d-92d8-b362c91fcb4b")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(ExternDocumentData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("26ac8081-6f01-4850-bd7e-dffe6fbda0a1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3696c21f-c091-48d1-8ff4-872382e3539f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0e0d20e8-17c1-4c1a-9dc1-09e60f0986a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocument(this);
        else
          return null;
    }

}
