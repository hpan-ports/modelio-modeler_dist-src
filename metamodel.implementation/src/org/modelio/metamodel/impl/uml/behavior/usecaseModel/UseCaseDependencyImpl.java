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
    @objid ("776c6b02-7418-4d73-b180-4a1f777b1f7e")
    @Override
    public UseCase getOrigin() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.OriginDep());
    }

    @objid ("f0ebd80e-1223-4496-94ac-85263bc59f84")
    @Override
    public void setOrigin(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("87419914-02ff-4324-b03e-31199f4f8796")
    @Override
    public EList<ExtensionPoint> getExtensionLocation() {
        return new SmList<>(this, UseCaseDependencyData.Metadata.ExtensionLocationDep());
    }

    @objid ("27035126-1e72-4a8d-8b56-49f94e7419c6")
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

    @objid ("20c684f5-4c69-4456-afee-e31dbc4a0393")
    @Override
    public UseCase getTarget() {
        return (UseCase) getDepVal(UseCaseDependencyData.Metadata.TargetDep());
    }

    @objid ("820c7729-eee9-4150-8f2c-7c078df6de74")
    @Override
    public void setTarget(UseCase value) {
        appendDepVal(UseCaseDependencyData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("70d3ec44-5239-441c-95e6-ed42fb040c15")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("157543fd-219b-455f-95bb-7ad13bda085d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(UseCaseDependencyData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(UseCaseDependencyData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2f4bb435-dfda-49b9-b761-dacdadf11be0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCaseDependency(this);
        else
          return null;
    }

}
