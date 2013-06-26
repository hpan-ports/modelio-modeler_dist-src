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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionRegionData;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0031ed18-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
    @objid ("9b2131b0-eb18-487e-be70-85395ba00a00")
    @Override
    public ExpansionKind getMode() {
        return (ExpansionKind) getAttVal(ExpansionRegionData.Metadata.ModeAtt());
    }

    @objid ("bbe945c4-95d6-436c-a70e-3d57286c30e5")
    @Override
    public void setMode(ExpansionKind value) {
        setAttVal(ExpansionRegionData.Metadata.ModeAtt(), value);
    }

    @objid ("be2ec1a4-4a32-43dc-8a76-79c3a42ad285")
    @Override
    public EList<ExpansionNode> getOutputElement() {
        return new SmList<>(this, ExpansionRegionData.Metadata.OutputElementDep());
    }

    @objid ("c3b3e601-c0ef-42a9-a102-c3473f11f268")
    @Override
    public <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExpansionNode element : getOutputElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1f31a3cc-7690-45e9-bed9-1eed78d5c7c6")
    @Override
    public EList<ExpansionNode> getInputElement() {
        return new SmList<>(this, ExpansionRegionData.Metadata.InputElementDep());
    }

    @objid ("ecb5f6bb-29d2-41f3-8af5-29efcea4fe70")
    @Override
    public <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExpansionNode element : getInputElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("510a9065-1b58-4e5f-ac9e-f079aa86ceb8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5d2dc6d4-14da-4803-a529-16d2595ae8c9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ad00e086-e051-4a8e-a866-d0481c652cab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionRegion(this);
        else
          return null;
    }

}
