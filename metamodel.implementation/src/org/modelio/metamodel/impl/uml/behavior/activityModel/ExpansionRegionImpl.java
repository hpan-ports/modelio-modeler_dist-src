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
    @objid ("e8a4d0d7-43f1-4ab0-8a11-fd6d65f07869")
    @Override
    public ExpansionKind getMode() {
        return (ExpansionKind) getAttVal(ExpansionRegionData.Metadata.ModeAtt());
    }

    @objid ("38d82a7d-cb0c-43ac-95f3-8da90328c0c0")
    @Override
    public void setMode(ExpansionKind value) {
        setAttVal(ExpansionRegionData.Metadata.ModeAtt(), value);
    }

    @objid ("11a1e7a6-1406-47cd-aaaf-caade243dec8")
    @Override
    public EList<ExpansionNode> getOutputElement() {
        return new SmList<>(this, ExpansionRegionData.Metadata.OutputElementDep());
    }

    @objid ("87614f5b-592a-43ce-8934-0a903fa2ccbe")
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

    @objid ("05bcbb25-f3b2-4cdf-9fed-ce691ecaf801")
    @Override
    public EList<ExpansionNode> getInputElement() {
        return new SmList<>(this, ExpansionRegionData.Metadata.InputElementDep());
    }

    @objid ("ecde4add-54ea-44b2-8e1a-fc2554fb33d4")
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

    @objid ("68c49aff-6797-4cd1-854b-ec2932975378")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b0b8344c-4bd8-419a-9ad5-f27a1f268259")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("72b22a05-63da-47da-a12d-7493fe3952f3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionRegion(this);
        else
          return null;
    }

}
