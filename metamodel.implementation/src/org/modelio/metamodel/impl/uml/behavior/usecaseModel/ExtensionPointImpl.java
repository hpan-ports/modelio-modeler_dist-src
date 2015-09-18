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
    @objid ("75ddb28f-8506-481e-8bf2-ae3ce37dc3e3")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ExtensionPointData.Metadata.VisibilityAtt());
    }

    @objid ("aff26095-56ea-4861-936f-cf5a919d7e42")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ExtensionPointData.Metadata.VisibilityAtt(), value);
    }

    @objid ("417db627-fd54-4a60-ae26-35bdd205b773")
    @Override
    public EList<UseCaseDependency> getExtended() {
        return new SmList<>(this, ExtensionPointData.Metadata.ExtendedDep());
    }

    @objid ("993e0275-3161-4c3e-a5d5-18149848a725")
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

    @objid ("87b404f8-078d-4686-9cd7-23ff85d5dff2")
    @Override
    public UseCase getOwner() {
        return (UseCase) getDepVal(ExtensionPointData.Metadata.OwnerDep());
    }

    @objid ("62d622d5-9077-4b0e-a10a-5af9932e8e0e")
    @Override
    public void setOwner(UseCase value) {
        appendDepVal(ExtensionPointData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6177566b-34c2-44db-b326-d66db51d0643")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("99cee618-74e6-4ddf-b4dd-7b9c53744037")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ExtensionPointData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("cdcc26b0-6189-4c47-af06-06b46d17fd4b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExtensionPoint(this);
        else
          return null;
    }

}
