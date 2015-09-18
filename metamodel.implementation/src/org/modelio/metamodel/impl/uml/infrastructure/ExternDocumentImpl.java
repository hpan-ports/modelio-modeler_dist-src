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
    @objid ("46708779-de3c-4d77-8168-0d21c5dd3a93")
    @Override
    public String getMimeType() {
        return (String) getAttVal(ExternDocumentData.Metadata.MimeTypeAtt());
    }

    @objid ("ce0b202f-7003-4218-bbe3-1bdafbab9a80")
    @Override
    public void setMimeType(String value) {
        setAttVal(ExternDocumentData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("dbac70c9-273a-465f-ba85-cea303d0e64d")
    @Override
    public String getPath() {
        return (String) getAttVal(ExternDocumentData.Metadata.PathAtt());
    }

    @objid ("0c940293-605f-413a-851f-ee9d81944d16")
    @Override
    public void setPath(String value) {
        setAttVal(ExternDocumentData.Metadata.PathAtt(), value);
    }

    @objid ("08db4542-c1e9-44e8-875b-9330d8aff7f4")
    @Override
    public String getAbstract() {
        return (String) getAttVal(ExternDocumentData.Metadata.AbstractAtt());
    }

    @objid ("6b8d1dd1-7618-4bc8-8c34-368f75ae230b")
    @Override
    public void setAbstract(String value) {
        setAttVal(ExternDocumentData.Metadata.AbstractAtt(), value);
    }

    @objid ("91c53a9c-57d0-41b7-b3d4-f7d73469e4e7")
    @Override
    public ExternDocumentType getType() {
        return (ExternDocumentType) getDepVal(ExternDocumentData.Metadata.TypeDep());
    }

    @objid ("b8bb73bb-ff96-45a8-bcef-a38921908c9a")
    @Override
    public void setType(ExternDocumentType value) {
        appendDepVal(ExternDocumentData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("1296de3c-eaf6-4fef-a9d6-f7d4700fcb8e")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(ExternDocumentData.Metadata.SubjectDep());
    }

    @objid ("a8ba554d-e3ca-46bb-8c86-8f20c7a9ffc1")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(ExternDocumentData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("fc8931f4-f65e-414b-a079-758fb8fccc20")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("985dd27d-07ef-4436-96fa-fccaf1e7fe43")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("30a2467d-05fa-4c98-8d3f-ad5310bf855e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocument(this);
        else
          return null;
    }

}
