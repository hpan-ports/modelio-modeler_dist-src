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
    @objid ("4415489b-fdd8-4e06-afb2-6f438689bf51")
    @Override
    public boolean isIsInstantiable() {
        return (Boolean) getAttVal(PackageData.Metadata.IsInstantiableAtt());
    }

    @objid ("81a2198b-2442-4fdf-b1c5-1ebbe89312b2")
    @Override
    public void setIsInstantiable(boolean value) {
        setAttVal(PackageData.Metadata.IsInstantiableAtt(), value);
    }

    @objid ("db19b5c3-651a-42f8-842f-fd794efa5038")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, PackageData.Metadata.BpmnRepresentsDep());
    }

    @objid ("df38518b-45e8-4357-8332-4121104218a2")
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

    @objid ("76490118-63d0-450a-8c7e-0fbfb535ca2d")
    @Override
    public EList<PackageMerge> getReceivingMerge() {
        return new SmList<>(this, PackageData.Metadata.ReceivingMergeDep());
    }

    @objid ("a92ce987-8314-4dc5-8f2c-861cc1e0a9a0")
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

    @objid ("0f53658d-f6b3-4fe4-a587-c990d9e0a2bd")
    @Override
    public Project getRepresented() {
        return (Project) getDepVal(PackageData.Metadata.RepresentedDep());
    }

    @objid ("31201287-a340-4b99-80dc-098f94745713")
    @Override
    public void setRepresented(Project value) {
        appendDepVal(PackageData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("97803f64-f21d-4c95-b7f4-73ae5d832a52")
    @Override
    public EList<PackageMerge> getMerge() {
        return new SmList<>(this, PackageData.Metadata.MergeDep());
    }

    @objid ("fd6b7429-c7a9-4a03-ac51-01522bf93cc3")
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

    @objid ("6041734d-f682-4a28-bdf5-ef64f8b37ac1")
    @Override
    public EList<PackageImport> getPackageImporting() {
        return new SmList<>(this, PackageData.Metadata.PackageImportingDep());
    }

    @objid ("d222bbe3-11f8-4c2a-8e0c-03b7c2314fa9")
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

    @objid ("e83ffc87-290b-4baa-b1c6-0b6a304ef157")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e9dd2965-ebd8-4aec-8ba1-2290e4f7520d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(PackageData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bc2638df-0ff2-46c1-b8e1-de44f57bb06b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackage(this);
        else
          return null;
    }

}
