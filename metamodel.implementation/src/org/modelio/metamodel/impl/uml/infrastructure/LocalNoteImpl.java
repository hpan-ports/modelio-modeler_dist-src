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
import org.modelio.metamodel.data.uml.infrastructure.LocalNoteData;
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00875410-c4be-1fd8-97fe-001ec947cd2a")
public class LocalNoteImpl extends ElementImpl implements LocalNote {
    @objid ("018f8fc2-6d71-4c24-9303-77ebfd94c036")
    @Override
    public String getName() {
        return (String) getAttVal(LocalNoteData.Metadata.NameAtt());
    }

    @objid ("deb66634-b525-4e3a-acfc-0952644427d2")
    @Override
    public void setName(String value) {
        setAttVal(LocalNoteData.Metadata.NameAtt(), value);
    }

    @objid ("c6c9d37d-01f2-4f2c-b070-b82cc1ca98b0")
    @Override
    public String getContent() {
        return (String) getAttVal(LocalNoteData.Metadata.ContentAtt());
    }

    @objid ("e9e5c003-2997-493d-8450-9966de859b12")
    @Override
    public void setContent(String value) {
        setAttVal(LocalNoteData.Metadata.ContentAtt(), value);
    }

    @objid ("6309740c-5b66-4b21-a95b-4b6e7efda0f0")
    @Override
    public boolean isIsVisible() {
        return (Boolean) getAttVal(LocalNoteData.Metadata.IsVisibleAtt());
    }

    @objid ("4f36c160-1abe-48e9-ab60-4afba0097c17")
    @Override
    public void setIsVisible(boolean value) {
        setAttVal(LocalNoteData.Metadata.IsVisibleAtt(), value);
    }

    @objid ("d9f601de-dc8f-4c5e-89af-666ae4e9a6be")
    @Override
    public NoteType getLocalModel() {
        return (NoteType) getDepVal(LocalNoteData.Metadata.LocalModelDep());
    }

    @objid ("80799fc3-5fc7-44f9-9e59-95f85897615e")
    @Override
    public void setLocalModel(NoteType value) {
        appendDepVal(LocalNoteData.Metadata.LocalModelDep(), (SmObjectImpl)value);
    }

    @objid ("c36c5fe8-7c0d-47b8-a0c5-5cc15ef77181")
    @Override
    public ModelElement getLocalSubject() {
        return (ModelElement) getDepVal(LocalNoteData.Metadata.LocalSubjectDep());
    }

    @objid ("86e3a291-2031-401a-ac45-15c3cdb8ebbf")
    @Override
    public void setLocalSubject(ModelElement value) {
        appendDepVal(LocalNoteData.Metadata.LocalSubjectDep(), (SmObjectImpl)value);
    }

    @objid ("148b1a88-a53a-498b-8688-1cef81086cc4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LocalNoteData.Metadata.LocalSubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ec1ae382-ecc8-4602-975d-a56d95ad2fc0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(LocalNoteData.Metadata.LocalSubjectDep());
        if (obj != null)
          return new SmDepVal(LocalNoteData.Metadata.LocalSubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("15f6dcdd-cf55-491e-a2ab-c0da6e0a6ea9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLocalNote(this);
        else
          return null;
    }

}
