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
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.impl.uml.statik.GeneralClassImpl;
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

@objid ("0058abf6-c4bf-1fd8-97fe-001ec947cd2a")
public class UseCaseImpl extends GeneralClassImpl implements UseCase {
    @objid ("ca60713c-7f2d-41e4-a04b-6675b77b8f4e")
    @Override
    public EList<UseCaseDependency> getUsed() {
        return new SmList<>(this, UseCaseData.Metadata.UsedDep());
    }

    @objid ("afa316e4-1800-4f16-93ec-3c680ce65324")
    @Override
    public <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final UseCaseDependency element : getUsed()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25f21c2c-94d9-4970-a646-bf68d5c0320d")
    @Override
    public EList<ExtensionPoint> getOwnedExtension() {
        return new SmList<>(this, UseCaseData.Metadata.OwnedExtensionDep());
    }

    @objid ("b1f1f456-c56a-4db5-b1fe-2798474996e6")
    @Override
    public <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExtensionPoint element : getOwnedExtension()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e87c95af-3642-4757-88e9-8b2c12d60393")
    @Override
    public EList<UseCaseDependency> getUser() {
        return new SmList<>(this, UseCaseData.Metadata.UserDep());
    }

    @objid ("90c1fff8-c5d9-40e9-adde-3547f5752d1e")
    @Override
    public <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final UseCaseDependency element : getUser()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2fcc482d-b58c-4d52-9f44-d156aed2c195")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2247b3ca-c66f-4bc2-b0b5-7b9398e7c3c3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("961da9f4-f63b-4021-a37d-6aa514dbaf1f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCase(this);
        else
          return null;
    }

}
