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
    @objid ("b6b74843-dae8-462b-b048-68f0490831a3")
    @Override
    public String getMimeType() {
        return (String) getAttVal(ExternDocumentData.Metadata.MimeTypeAtt());
    }

    @objid ("10c0aa3e-f20c-48f5-92e9-c1fa7f58aba8")
    @Override
    public void setMimeType(String value) {
        setAttVal(ExternDocumentData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("8c537874-6bf0-4bbd-a8d8-201fbcebfdd3")
    @Override
    public String getPath() {
        return (String) getAttVal(ExternDocumentData.Metadata.PathAtt());
    }

    @objid ("bc31654b-9365-426f-8b37-0368097ed4da")
    @Override
    public void setPath(String value) {
        setAttVal(ExternDocumentData.Metadata.PathAtt(), value);
    }

    @objid ("3c37db60-1c7a-4135-aa48-9efeebf8294a")
    @Override
    public String getAbstract() {
        return (String) getAttVal(ExternDocumentData.Metadata.AbstractAtt());
    }

    @objid ("bf6c3fea-9093-4470-b72d-c0cd1dbea15a")
    @Override
    public void setAbstract(String value) {
        setAttVal(ExternDocumentData.Metadata.AbstractAtt(), value);
    }

    @objid ("08aa1548-8326-4b88-88ea-161b4a6d367c")
    @Override
    public ExternDocumentType getType() {
        return (ExternDocumentType) getDepVal(ExternDocumentData.Metadata.TypeDep());
    }

    @objid ("35da36ec-d5f8-48e9-8805-96107e4cc25b")
    @Override
    public void setType(ExternDocumentType value) {
        appendDepVal(ExternDocumentData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("50b0145e-0456-453c-bf22-8d72a567fbc2")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(ExternDocumentData.Metadata.SubjectDep());
    }

    @objid ("a5a3cf8a-d57d-4e83-b23f-f3f8c6f41b7f")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(ExternDocumentData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("d1172a87-cf6d-4003-9dea-a1de6c5182bd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8a24f6b3-c41b-49e2-af27-a2514c86c248")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e2078b07-dfa9-4735-8fbb-6509f3640043")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocument(this);
        else
          return null;
    }

}
