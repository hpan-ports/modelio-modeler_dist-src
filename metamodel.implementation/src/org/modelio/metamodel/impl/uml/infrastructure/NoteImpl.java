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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.NoteData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008a098a-c4be-1fd8-97fe-001ec947cd2a")
public class NoteImpl extends ModelElementImpl implements Note {
    @objid ("a7db2164-f4b4-495c-b408-f88e34fda79f")
    @Override
    public String getContent() {
        return (String) getAttVal(((NoteSmClass)getClassOf()).getContentAtt());
    }

    @objid ("4dc7b6f1-41bf-4825-ba8f-2e699e390fdc")
    @Override
    public void setContent(String value) {
        setAttVal(((NoteSmClass)getClassOf()).getContentAtt(), value);
    }

    @objid ("ea47bc02-4c0b-4750-b60e-75ddd1d1c0ea")
    @Override
    public String getMimeType() {
        return (String) getAttVal(((NoteSmClass)getClassOf()).getMimeTypeAtt());
    }

    @objid ("0e063ce1-aa5f-4450-b067-5141d99af885")
    @Override
    public void setMimeType(String value) {
        setAttVal(((NoteSmClass)getClassOf()).getMimeTypeAtt(), value);
    }

    @objid ("2901ef0e-9c60-4f59-9aae-418641740097")
    @Override
    public NoteType getModel() {
        Object obj = getDepVal(((NoteSmClass)getClassOf()).getModelDep());
        return (obj instanceof NoteType)? (NoteType)obj : null;
    }

    @objid ("070f8e73-de64-4910-ac51-05cd5936ef13")
    @Override
    public void setModel(NoteType value) {
        appendDepVal(((NoteSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("e6f3da1d-66b0-43f2-a7c4-fa6a4279a911")
    @Override
    public ModelElement getSubject() {
        Object obj = getDepVal(((NoteSmClass)getClassOf()).getSubjectDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("1af0813c-e525-4037-b28e-f7881f4865f9")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(((NoteSmClass)getClassOf()).getSubjectDep(), (SmObjectImpl)value);
    }

    @objid ("cb67f934-3ef7-4c04-9d74-a4981ddcd1bf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Subject
        obj = (SmObjectImpl)this.getDepVal(((NoteSmClass)getClassOf()).getSubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3ca16d96-9eff-4e08-8f26-a7742ea86423")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Subject
        dep = ((NoteSmClass)getClassOf()).getSubjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c05332d9-badd-4a15-bb24-ee7e4c52d2b5")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNote(this);
        else
          return null;
    }

}
