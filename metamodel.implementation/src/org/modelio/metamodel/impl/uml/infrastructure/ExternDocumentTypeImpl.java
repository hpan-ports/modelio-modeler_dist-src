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

    @objid ("284ce426-62f9-41db-9bd8-1453da8e171f")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("c0bb45e5-e3e1-4e4b-a967-dd839cd86dc9")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(ExternDocumentTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("29557f5e-c86a-4600-bd00-fd71f461df6d")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("89820a4a-cca2-4345-b032-559ad753ad38")
    @Override
    public void setLabelKey(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("b6a4199c-9fdd-4777-8395-a0f32e6be74a")
    @Override
    public String getIcon() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.IconAtt());
    }

    @objid ("cfbaad44-e3dc-4d36-904d-e5651901fa61")
    @Override
    public void setIcon(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.IconAtt(), value);
    }

    @objid ("e622d9cb-a84c-4776-af7f-427a98da015a")
    @Override
    public String getImage() {
        return (String) getAttVal(ExternDocumentTypeData.Metadata.ImageAtt());
    }

    @objid ("5c2123ee-7cdb-41ec-bf91-e8bf8efb3e80")
    @Override
    public void setImage(String value) {
        setAttVal(ExternDocumentTypeData.Metadata.ImageAtt(), value);
    }

    @objid ("a59ba132-f186-4ee2-8b45-c49087926053")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("0437cec0-3c7a-43ed-bb06-a8d7ccc82354")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("3400a39b-d3c7-4530-814c-927deb7f6289")
    @Override
    public EList<ExternDocument> getTypedDoc() {
        return new SmList<>(this, ExternDocumentTypeData.Metadata.TypedDocDep());
    }

    @objid ("b21e3ef1-7326-402b-8cec-6b324f427a4b")
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

    @objid ("e5799628-7de1-43e2-bf42-8ae26cc531ce")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("8b2a5f71-9376-40b6-b6fc-92db49831658")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(ExternDocumentTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("399a412c-4f3b-4ffe-a125-e4cf0d3cf68f")
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

    @objid ("130c35bc-125d-4d3d-aff0-11e6fca5f83a")
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

    @objid ("03bf8089-5bce-4682-971c-fb666b8a2482")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocumentType(this);
        else
          return null;
    }

}
