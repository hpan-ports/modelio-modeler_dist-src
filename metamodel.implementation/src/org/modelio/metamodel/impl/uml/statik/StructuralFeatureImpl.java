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
    @objid ("6e488ecb-2800-48df-b7c4-c81011b9c25f")
    @Override
    public KindOfAccess getChangeable() {
        return (KindOfAccess) getAttVal(StructuralFeatureData.Metadata.ChangeableAtt());
    }

    @objid ("43f4579c-70d6-4939-8af2-5c08fc8a7863")
    @Override
    public void setChangeable(KindOfAccess value) {
        setAttVal(StructuralFeatureData.Metadata.ChangeableAtt(), value);
    }

    @objid ("cd4604a4-7423-4ff7-8fe4-ab82c4ef8fd6")
    @Override
    public boolean isIsDerived() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsDerivedAtt());
    }

    @objid ("32124133-a44d-47ad-9cdc-52e84c8d77cf")
    @Override
    public void setIsDerived(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsDerivedAtt(), value);
    }

    @objid ("14295402-1af2-4552-9d4f-79b44c525eb2")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsOrderedAtt());
    }

    @objid ("e9e9c08b-fd86-46de-98f3-bb8e02c5c278")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("17cea500-099b-4847-8d6f-57e0aa583d55")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsUniqueAtt());
    }

    @objid ("c87be19f-ec38-4a51-a67f-241fd5fb4ab5")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("d31333b9-ceb5-4fe1-a84d-1b009cbb7eb8")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt());
    }

    @objid ("30b4e561-3c73-4c3f-97f5-850fa4be1818")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("2b416bf0-b9cb-4163-80a1-b7e574475395")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("3e123150-49f3-4e95-9a81-fd9bc4fd891b")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("6a073237-bb65-41e5-a8c1-3616249435c5")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, StructuralFeatureData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("d53b96d9-8b4c-4ca2-9c02-16d0654dfc89")
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

    @objid ("a32c59cb-bb90-48fe-ba8f-4dd468da8de4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bb64b639-31ef-4ebe-8c99-b671501d1101")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1019896b-de27-4401-9533-fa1d6edc5158")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuralFeature(this);
        else
          return null;
    }

}
