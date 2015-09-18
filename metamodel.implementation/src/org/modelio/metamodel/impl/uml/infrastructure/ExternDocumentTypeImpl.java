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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("009339f6-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentTypeImpl extends ModelElementImpl implements ExternDocumentType {
    @objid ("f9337a44-b3be-45b9-9f22-cc4ed1552af0")
    @Override
    public ModuleComponent getModule() {
        MetaclassReference ref = getOwnerReference();
        Stereotype st = getOwnerStereotype();
        
        if (ref != null && ref.getOwnerProfile() != null) {
            return ref.getOwnerProfile().getOwnerModule();
        } else if (st != null && st.getOwner() != null) {
            return st.getOwner().getOwnerModule();
        } else
            return null;
    }

    @objid ("df227b8f-5913-4713-91c0-260cf93c538c")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("ba3dee64-152f-4539-be5e-928a000644cd")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("e767099d-3018-43f4-9116-f1a17c39001a")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("407b1795-b191-4274-87f1-07eb35d2773c")
    @Override
    public void setLabelKey(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("023d0761-d855-4e99-bac1-ad3d9d833ace")
    @Override
    public String getIcon() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.IconAtt());
    }

    @objid ("d7e961fa-5d5d-455d-b631-96b1604e0c25")
    @Override
    public void setIcon(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.IconAtt(), value);
    }

    @objid ("b749fe37-5dfa-40a8-a76e-8a13302e9628")
    @Override
    public String getImage() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.ImageAtt());
    }

    @objid ("611ec389-115e-4c0f-b5be-ce3a07de4e86")
    @Override
    public void setImage(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.ImageAtt(), value);
    }

    @objid ("845d467b-55a9-435c-bd03-45d2fdd52c79")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("75e275cc-129a-474c-86f8-752677b00c06")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("0d6ad41f-06d9-4f65-ad5b-af03a2ddb04b")
    @Override
    public EList<ExternDocument> getTypedDoc() {
        return new SmList<>(this, ExternDocumentTypeData.Metadata.TypedDocDep());
    }

    @objid ("96ae0458-c5fb-4eb0-89f8-818f50c6270c")
    @Override
    public <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocument element : getTypedDoc()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("55b19a98-525c-4a5c-b206-8cf95d87fd8d")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("32332298-9c19-4ce5-9162-e222a48d78e8")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("aa12e505-041e-42f1-9798-554f2151fd32")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9ef2e8b6-0b40-4d57-b79e-e1dd56cef601")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d2073d45-fbe9-4fdb-822b-a557aa715965")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocumentType(this);
        else
          return null;
    }

}
