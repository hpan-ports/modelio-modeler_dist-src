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
    @objid ("d1370379-d76d-4832-ad14-b9b5716974b9")
    @Override
    public String getContent() {
        return (String) getAttVal(NoteData.Metadata.ContentAtt());
    }

    @objid ("48f847af-886a-4531-9ad9-4b7a2b766db4")
    @Override
    public void setContent(String value) {
        setAttVal(NoteData.Metadata.ContentAtt(), value);
    }

    @objid ("8103656b-4a2f-48cf-a705-be0fc02e72c6")
    @Override
    public String getMimeType() {
        return (String) getAttVal(NoteData.Metadata.MimeTypeAtt());
    }

    @objid ("0196be7c-6287-459b-b2ea-6cd7cc93a2b1")
    @Override
    public void setMimeType(String value) {
        setAttVal(NoteData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("9898b7b8-8f19-4f48-9544-7605df7ff204")
    @Override
    public NoteType getModel() {
        return (NoteType) getDepVal(NoteData.Metadata.ModelDep());
    }

    @objid ("27cca8b6-b1a0-47be-9688-7ec0af3a106e")
    @Override
    public void setModel(NoteType value) {
        appendDepVal(NoteData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("88c7c6db-d94e-4e8f-9a5e-3b42e2342d2c")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(NoteData.Metadata.SubjectDep());
    }

    @objid ("75e34a61-cb7b-422d-990a-6eb6dd669434")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(NoteData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("2b35195c-b8fa-4d87-8d71-ef54be642156")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7b2e3a6e-d62b-4244-8e58-6a51aed909ce")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(NoteData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a464b65b-48e8-4676-bea5-18df17610547")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNote(this);
        else
          return null;
    }

}
