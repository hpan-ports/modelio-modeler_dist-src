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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.StructuralFeatureData;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001f3344-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
    @objid ("9c2e3aa9-4d83-4300-9253-65a709acdcfb")
    @Override
    public KindOfAccess getChangeable() {
        return (KindOfAccess) getAttVal(StructuralFeatureData.Metadata.ChangeableAtt());
    }

    @objid ("ae085575-2dea-4f13-84c5-72bd5469c8b0")
    @Override
    public void setChangeable(KindOfAccess value) {
        setAttVal(StructuralFeatureData.Metadata.ChangeableAtt(), value);
    }

    @objid ("bc386a3b-a6a5-45ed-87d7-f5c1a31a9d60")
    @Override
    public boolean isIsDerived() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsDerivedAtt());
    }

    @objid ("d0d711e4-57b0-4a46-b55b-d76f6db52615")
    @Override
    public void setIsDerived(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsDerivedAtt(), value);
    }

    @objid ("63755a0a-0de9-43bf-a25b-278c31544b81")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsOrderedAtt());
    }

    @objid ("4611b160-3a10-4591-a6d8-7142a92f208b")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("8d3b5405-8bdc-45e8-9199-8cf33bb1f41a")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsUniqueAtt());
    }

    @objid ("f649771e-2ae8-4b93-adb3-0df3c8be4074")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("5578963e-f3e0-4eee-8161-9d5fc3fc843d")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt());
    }

    @objid ("cc596fb3-447b-479c-a7be-cde9c0062b77")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("603e3c56-37d5-4eca-96fe-9f2bdf817003")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("69e0275f-6367-46b9-b1f3-cd8192fc7ee9")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("a66e9ca2-eb3a-4c08-b7db-74185c262cad")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, StructuralFeatureData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("e8ebd69d-8553-46b2-aee8-52f2ffc3c516")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("23836888-869f-41d4-b38b-99670293914d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6d5105a7-80de-4082-878c-7fce7f60e1df")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0121e9b2-c8c7-400a-a9ee-82b01e440cab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuralFeature(this);
        else
          return null;
    }

}
