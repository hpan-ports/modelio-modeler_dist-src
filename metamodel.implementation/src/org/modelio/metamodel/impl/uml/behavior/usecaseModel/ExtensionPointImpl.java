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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0059a6a0-c4bf-1fd8-97fe-001ec947cd2a")
public class ExtensionPointImpl extends ModelElementImpl implements ExtensionPoint {
    @objid ("1c3d3f24-5744-4f65-825b-e2df4efd98c4")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ExtensionPointData.Metadata.VisibilityAtt());
    }

    @objid ("bfee0201-288e-4895-b9e3-0176b597ba21")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ExtensionPointData.Metadata.VisibilityAtt(), value);
    }

    @objid ("904e3f64-6f74-403f-9291-ac2e44c2ed97")
    @Override
    public EList<UseCaseDependency> getExtended() {
        return new SmList<>(this, ExtensionPointData.Metadata.ExtendedDep());
    }

    @objid ("8cfb4b44-5916-44c4-95b9-63224d664f48")
    @Override
    public <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final UseCaseDependency element : getExtended()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7505a020-e7b4-460b-865c-3a876eefcca8")
    @Override
    public UseCase getOwner() {
        return (UseCase) getDepVal(ExtensionPointData.Metadata.OwnerDep());
    }

    @objid ("1a6e8139-9df2-4f81-b8c3-f644e9d19bc5")
    @Override
    public void setOwner(UseCase value) {
        appendDepVal(ExtensionPointData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6152977f-cfe7-435a-9a21-b8d10e9e4516")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("46d939ac-7861-4a72-b98b-9d33fb9dd37e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ExtensionPointData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ee2adf0d-6e78-4bac-94ba-9ac51f197f5e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExtensionPoint(this);
        else
          return null;
    }

}
