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
    @objid ("0a97909f-2c7f-4c9c-a3e8-7f01dd7adecc")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ExtensionPointData.Metadata.VisibilityAtt());
    }

    @objid ("08679646-8f2e-434c-9c98-5fbc2d11d4e5")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ExtensionPointData.Metadata.VisibilityAtt(), value);
    }

    @objid ("3854149c-72f7-4acf-8334-b7fee5faf53a")
    @Override
    public EList<UseCaseDependency> getExtended() {
        return new SmList<>(this, ExtensionPointData.Metadata.ExtendedDep());
    }

    @objid ("8a19b6a9-cdab-4911-9798-e9f78c83c3dc")
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

    @objid ("4e59a403-5662-4d07-83d6-e01276644f86")
    @Override
    public UseCase getOwner() {
        return (UseCase) getDepVal(ExtensionPointData.Metadata.OwnerDep());
    }

    @objid ("c8a7bfff-d435-4ac9-a9d1-e5075f13fe0e")
    @Override
    public void setOwner(UseCase value) {
        appendDepVal(ExtensionPointData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("3e18933b-ded7-4b6a-a100-d942dd554476")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b969cf6b-2e39-4fef-8ed1-fb78bc9cbfd1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExtensionPointData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ExtensionPointData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0bad7cb4-fab7-4ede-9b24-9188061aa381")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExtensionPoint(this);
        else
          return null;
    }

}
