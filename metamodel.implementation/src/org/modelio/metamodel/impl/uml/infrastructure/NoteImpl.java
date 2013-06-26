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
    @objid ("1dfb4813-0b71-4f75-8fef-e02d3a2acd10")
    @Override
    public String getContent() {
        return (String) getAttVal(NoteData.Metadata.ContentAtt());
    }

    @objid ("1f18f727-c032-4b9d-941d-2f375c2287fe")
    @Override
    public void setContent(String value) {
        setAttVal(NoteData.Metadata.ContentAtt(), value);
    }

    @objid ("1256b77f-e374-4d9b-91e7-e868ec15b8c6")
    @Override
    public NoteType getModel() {
        return (NoteType) getDepVal(NoteData.Metadata.ModelDep());
    }

    @objid ("f468966f-989b-481d-ba83-4f41258385e3")
    @Override
    public void setModel(NoteType value) {
        appendDepVal(NoteData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("c6e8cf48-35d2-4237-ac2f-8d1bdabd96d3")
    @Override
    public ModelElement getSubject() {
        return (ModelElement) getDepVal(NoteData.Metadata.SubjectDep());
    }

    @objid ("e9c80fcb-e179-42a8-b3f7-1edea7893f8f")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(NoteData.Metadata.SubjectDep(), (SmObjectImpl)value);
    }

    @objid ("be8e8cbd-4fb2-4ac4-bdef-41953ea7a5de")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8a47471b-803a-486a-b9aa-82d43055ca72")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteData.Metadata.SubjectDep());
        if (obj != null)
          return new SmDepVal(NoteData.Metadata.SubjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7973c86f-0129-4be1-845b-774367231c42")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNote(this);
        else
          return null;
    }

}
