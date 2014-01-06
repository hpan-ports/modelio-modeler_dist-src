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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00592d06-c4bf-1fd8-97fe-001ec947cd2a")
public class UseCaseDependencyImpl extends ModelElementImpl implements UseCaseDependency {
    @objid ("7f86c184-b3ef-4d7e-9728-d5bb87ea2bc3")
    @Override
    public UseCase getOrigin() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.OriginDep());
    }

    @objid ("1526b6b3-1b3b-4e1c-a57a-d11370e7fa44")
    @Override
    public void setOrigin(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("65090ae3-0d5d-42a0-b2a7-8a1073812bcf")
    @Override
    public EList<ExtensionPoint> getExtensionLocation() {
        return new SmList<>(this, UseCaseDependencyData.Metadata.ExtensionLocationDep());
    }

    @objid ("d6d213cc-ee4e-4be1-8df2-4b730914b0a5")
    @Override
    public <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExtensionPoint element : getExtensionLocation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f0766ed3-449c-4a04-849f-ed75e545fa5c")
    @Override
    public UseCase getTarget() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.TargetDep());
    }

    @objid ("dec32550-7871-420b-b349-ffc2d2152865")
    @Override
    public void setTarget(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("67534857-8c40-4b41-8621-381c9faf851a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("52ab6822-689f-4396-a5ce-ac1eb35a6cb3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(UseCaseDependencyData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("82f9e096-10bc-4945-8e3a-ab527cf287e5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCaseDependency(this);
        else
          return null;
    }

}
