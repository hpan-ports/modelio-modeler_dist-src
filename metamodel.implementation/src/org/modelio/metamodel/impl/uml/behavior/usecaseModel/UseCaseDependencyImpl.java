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
    @objid ("7fc36cb7-d878-42e0-ad56-26dc228ae0b9")
    @Override
    public UseCase getOrigin() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.OriginDep());
    }

    @objid ("daac0e03-e532-481e-adc3-4fa1cabce925")
    @Override
    public void setOrigin(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("8eceaa89-1e6d-4690-a812-349189d900b2")
    @Override
    public EList<ExtensionPoint> getExtensionLocation() {
        return new SmList<>(this, UseCaseDependencyData.Metadata.ExtensionLocationDep());
    }

    @objid ("020e54a6-5f8d-4dcf-a536-d437019db8b6")
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

    @objid ("6bbd7ddf-1a72-4fd5-9f72-5853c127cc2d")
    @Override
    public UseCase getTarget() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.TargetDep());
    }

    @objid ("98c9bdba-32bb-42d3-89b7-ff386d031d0a")
    @Override
    public void setTarget(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("d4997cec-50ea-46f1-ae07-f36dd9e6118c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("29ae0970-bf34-4f24-b79e-9f8787fd7c5c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(UseCaseDependencyData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2609d4c9-b9d1-4c51-99bb-06e0d598d855")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCaseDependency(this);
        else
          return null;
    }

}
