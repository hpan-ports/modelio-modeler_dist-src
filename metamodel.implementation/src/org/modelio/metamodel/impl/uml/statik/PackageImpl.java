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
    @objid ("33f4ba62-5562-430c-813a-e39015803b4e")
    @Override
    public boolean isIsInstantiable() {
        return (Boolean) getAttVal(PackageData.Metadata.IsInstantiableAtt());
    }

    @objid ("496c9c90-2916-4098-bac2-eef2704e282f")
    @Override
    public void setIsInstantiable(boolean value) {
        setAttVal(PackageData.Metadata.IsInstantiableAtt(), value);
    }

    @objid ("fe27bf35-231f-4a79-b968-05aed9c8f66a")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, PackageData.Metadata.BpmnRepresentsDep());
    }

    @objid ("6af717ab-c2c3-434c-b180-f27fff7ee395")
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

    @objid ("f0e0e6e0-7bb8-4233-90a7-2be7f1601f5c")
    @Override
    public EList<PackageMerge> getReceivingMerge() {
        return new SmList<>(this, PackageData.Metadata.ReceivingMergeDep());
    }

    @objid ("29908973-3e96-4ad3-bc18-faf02edf489c")
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

    @objid ("369a659f-998b-4c2c-b8aa-0e9d8d429107")
    @Override
    public Project getRepresented() {
        return (Project) getDepVal(PackageData.Metadata.RepresentedDep());
    }

    @objid ("2c7d1d3d-f966-4307-b413-f2ba101325a5")
    @Override
    public void setRepresented(Project value) {
        appendDepVal(PackageData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("5f528ae5-ab21-4bea-a6ba-4d4062644e63")
    @Override
    public EList<PackageMerge> getMerge() {
        return new SmList<>(this, PackageData.Metadata.MergeDep());
    }

    @objid ("b70f622b-b0cd-4396-83dc-03dd42b0e6ed")
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

    @objid ("a96d34fb-4b7e-4f66-92bd-7a71f6eb97d6")
    @Override
    public EList<PackageImport> getPackageImporting() {
        return new SmList<>(this, PackageData.Metadata.PackageImportingDep());
    }

    @objid ("97f357d6-a9af-4bf6-9041-bbca0a2ee478")
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

    @objid ("cc3b758f-2748-4219-b7a7-20993af85cb9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("244359a6-bf8a-4570-9ef8-87a5a6b7b5f1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(PackageData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d19b4fe8-b2fc-415e-8ebd-033287a1a92b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackage(this);
        else
          return null;
    }

}
