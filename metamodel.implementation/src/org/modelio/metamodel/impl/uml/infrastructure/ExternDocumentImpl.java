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
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00927aac-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentImpl extends ModelElementImpl implements ExternDocument {
    @objid ("fba22e3c-f551-429b-aa97-88fed3fe7bbb")
    @Override
    public String getMimeType() {
        return (String) getAttVal(((ExternDocumentSmClass)getClassOf()).getMimeTypeAtt());
    }

    @objid ("e4c2e35f-4a21-4016-aca1-97d511d6c115")
    @Override
    public void setMimeType(String value) {
        setAttVal(((ExternDocumentSmClass)getClassOf()).getMimeTypeAtt(), value);
    }

    @objid ("ba3c6aad-21cf-4769-a82d-f6048c14881e")
    @Override
    public String getPath() {
        return (String) getAttVal(((ExternDocumentSmClass)getClassOf()).getPathAtt());
    }

    @objid ("1761fa18-04e3-4a6a-8811-7c625a1fbc6a")
    @Override
    public void setPath(String value) {
        setAttVal(((ExternDocumentSmClass)getClassOf()).getPathAtt(), value);
    }

    @objid ("b4093d95-dc32-4ad6-899c-0eb6c920aeb2")
    @Override
    public String getAbstract() {
        return (String) getAttVal(((ExternDocumentSmClass)getClassOf()).getAbstractAtt());
    }

    @objid ("69501d11-9824-48f7-991d-cff58c6f052d")
    @Override
    public void setAbstract(String value) {
        setAttVal(((ExternDocumentSmClass)getClassOf()).getAbstractAtt(), value);
    }

    @objid ("cfbeee3c-0902-42c4-b86f-552e93beafad")
    @Override
    public ExternDocumentType getType() {
        Object obj = getDepVal(((ExternDocumentSmClass)getClassOf()).getTypeDep());
        return (obj instanceof ExternDocumentType)? (ExternDocumentType)obj : null;
    }

    @objid ("22677063-4d53-4ce7-9003-350cb8cfbfb4")
    @Override
    public void setType(ExternDocumentType value) {
        appendDepVal(((ExternDocumentSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("83bacceb-9449-46e9-9609-51062936157d")
    @Override
    public ModelElement getSubject() {
        Object obj = getDepVal(((ExternDocumentSmClass)getClassOf()).getSubjectDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("e0f59ff7-cb87-4a14-8b71-d52ddf0f9c7f")
    @Override
    public void setSubject(ModelElement value) {
        appendDepVal(((ExternDocumentSmClass)getClassOf()).getSubjectDep(), (SmObjectImpl)value);
    }

    @objid ("88196930-d784-4386-a98f-66d34f1464f3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Subject
        obj = (SmObjectImpl)this.getDepVal(((ExternDocumentSmClass)getClassOf()).getSubjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b06abcd3-5559-4b9b-bfe7-4fb4d4fa9f45")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Subject
        dep = ((ExternDocumentSmClass)getClassOf()).getSubjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("0d1ea1a2-e25c-41ca-8aa5-75085113a417")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocument(this);
        else
          return null;
    }

}
