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
    @objid ("c5b16e6a-2dc7-43fb-8466-2e06ca7e6614")
    @Override
    public EList<UseCaseDependency> getUsed() {
        return new SmList<>(this, UseCaseData.Metadata.UsedDep());
    }

    @objid ("1c8c2e0e-5d4b-441c-9e63-84773c5e2d18")
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

    @objid ("1fae20dc-ed33-47ab-b9da-5fe444903169")
    @Override
    public EList<ExtensionPoint> getOwnedExtension() {
        return new SmList<>(this, UseCaseData.Metadata.OwnedExtensionDep());
    }

    @objid ("5e000109-d309-4361-9218-ebd57c615c07")
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

    @objid ("91a7f2a8-b9d1-455f-9e6a-9ecdf523ce87")
    @Override
    public EList<UseCaseDependency> getUser() {
        return new SmList<>(this, UseCaseData.Metadata.UserDep());
    }

    @objid ("480ed40f-f680-4fcc-bfd2-cfaa5a0f9316")
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

    @objid ("e4552f7f-a623-42df-8639-a7473fbccb72")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e2f226ef-fd6f-4a55-a959-ccd91473051e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("84a547c3-1a4c-46a2-9f96-6e118217ca06")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCase(this);
        else
          return null;
    }

}
