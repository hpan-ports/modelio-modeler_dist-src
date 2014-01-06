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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00157246-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImpl extends NameSpaceImpl implements Package {
    @objid ("90731a08-ec78-4454-881b-a36f04887e56")
    @Override
    public boolean isIsInstantiable() {
        return (Boolean) getAttVal(PackageData.Metadata.IsInstantiableAtt());
    }

    @objid ("e43b52a8-20bb-4b09-9ba1-2fa97e9b098f")
    @Override
    public void setIsInstantiable(boolean value) {
        setAttVal(PackageData.Metadata.IsInstantiableAtt(), value);
    }

    @objid ("9840d514-7653-4e9c-ba82-08073bb8d41c")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, PackageData.Metadata.BpmnRepresentsDep());
    }

    @objid ("414ebefa-1bac-42df-9232-b17b11b32931")
    @Override
    public <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getBpmnRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("723e3080-5986-4a84-8a29-adb8b17e0b08")
    @Override
    public EList<PackageMerge> getReceivingMerge() {
        return new SmList<>(this, PackageData.Metadata.ReceivingMergeDep());
    }

    @objid ("454a66c4-0686-46d0-8183-e6cec33dd92e")
    @Override
    public <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageMerge element : getReceivingMerge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9df451f6-db8b-4388-88c2-156b6b275c36")
    @Override
    public Project getRepresented() {
        return (Project) getDepVal(PackageData.Metadata.RepresentedDep());
    }

    @objid ("77388c60-411a-402b-b42c-84f4f20300ed")
    @Override
    public void setRepresented(Project value) {
        appendDepVal(PackageData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("a2efa4e1-bc8e-4a2c-9fb2-829de14d7238")
    @Override
    public EList<PackageMerge> getMerge() {
        return new SmList<>(this, PackageData.Metadata.MergeDep());
    }

    @objid ("f4229f67-87fb-4f4c-afab-e0e1c4e3a5ab")
    @Override
    public <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageMerge element : getMerge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("611401b5-0f5a-40fc-a057-8c6dd3d97151")
    @Override
    public EList<PackageImport> getPackageImporting() {
        return new SmList<>(this, PackageData.Metadata.PackageImportingDep());
    }

    @objid ("2e40261a-9460-45ca-a354-397c2ed044c9")
    @Override
    public <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getPackageImporting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("655f62aa-46bd-43d3-9d56-fab32146ef4d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4fc68f9b-299f-4d3e-bb9a-ca2b402adff3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(PackageData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5da527c2-06d2-4ed9-918d-561f717c2d1b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackage(this);
        else
          return null;
    }

}
