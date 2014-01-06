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
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008a098a-c4be-1fd8-97fe-001ec947cd2a")
public class NoteImpl extends ModelElementImpl implements Note {
    @objid ("d0b70888-a783-445d-b947-fe3ad5a98bf4")
    @Override
    public String getContent() {
        return (String) getAttVal(NoteData.Metadata.ContentAtt());
    }

    @objid ("8daf88ff-ab5b-47d9-8891-f81bc0dc2983")
    @Override
    public void setContent(String value) {
        setAttVal(NoteData.Metadata.ContentAtt(), value);
    }

    @objid ("fa79c2a8-d708-4647-97fd-82ca1db56280")
    @Override
    public NoteType getModel() {
        return (NoteType) getDepVal(NoteData.Metadata.ModelDep());
    }

    @objid ("bf349599-7215-44f3-a419-b1ba16710213")
    @Override
    public void setModel(NoteType value) {
        appendDepVal(NoteData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("51706bf4-9ec1-4a4d-aef6-e8901514b02e")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(NoteData.Metadata.SubjectDep());
    }

    @objid ("da09e1da-16e6-4af2-b483-faf9cebb186e")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(NoteData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("65dc32fa-d0c4-4325-8c35-ce84e64af2df")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("667ca6ac-8588-41f0-926c-762b29476e77")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(NoteData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8fa11686-6804-49dc-8b0d-c2f613c02c42")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNote(this);
        else
          return null;
    }

}
