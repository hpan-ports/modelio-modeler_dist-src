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

    @objid ("5aac5529-5001-4327-8044-4bbd2fe84abe")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("c7b28db3-aa06-439f-b871-ae0fa4d5020f")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("9fc589fc-817e-4ef2-9177-ef7ba6aba5a4")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("6fdb9dc0-00b7-4a65-9354-b4c96cc65ac8")
    @Override
    public void setLabelKey(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("d671708f-8434-4bec-8852-a2cfe044e391")
    @Override
    public String getIcon() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.IconAtt());
    }

    @objid ("d0d4aa0a-a536-43d4-88ff-77ade4145119")
    @Override
    public void setIcon(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.IconAtt(), value);
    }

    @objid ("2416c591-98f0-4e6d-9d40-1a9a54f83897")
    @Override
    public String getImage() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.ImageAtt());
    }

    @objid ("fc8b1149-537b-46aa-8486-fbc3d6e4a637")
    @Override
    public void setImage(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.ImageAtt(), value);
    }

    @objid ("653107f5-46a0-4375-8e35-74a9b9f38510")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("87257770-c7d3-412c-8f17-760e1a36ff38")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("ee1835ab-b5e1-4d45-9926-02feeca76a75")
    @Override
    public EList<ExternDocument> getTypedDoc() {
        return new SmList<>(this, ExternDocumentTypeData.Metadata.TypedDocDep());
    }

    @objid ("01e23d4c-958a-4bbc-ba3d-25950cdd15ca")
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

    @objid ("68e57348-bb58-4e72-95a5-3403f68585cd")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("5b0a7850-5bd5-4cb8-aa3d-8c0d17f4c1be")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("3c70692a-a3c6-4ff0-bb65-697d8c597bee")
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

    @objid ("354da8b5-7364-49db-a099-14da7bf00cff")
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

    @objid ("9739f6c7-f8fe-409e-98c3-ef7ce32187f8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocumentType(this);
        else
          return null;
    }

}
