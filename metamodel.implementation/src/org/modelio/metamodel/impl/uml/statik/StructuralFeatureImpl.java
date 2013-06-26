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
    @objid ("c980183b-b0c1-4474-bbd3-c152198dee6a")
    @Override
    public KindOfAccess getChangeable() {
        return (KindOfAccess) getAttVal(StructuralFeatureData.Metadata.ChangeableAtt());
    }

    @objid ("897e7a26-8a00-4d5d-9884-561624c1312b")
    @Override
    public void setChangeable(KindOfAccess value) {
        setAttVal(StructuralFeatureData.Metadata.ChangeableAtt(), value);
    }

    @objid ("30c88895-17d0-4ca4-a71f-0d114c9e78f7")
    @Override
    public boolean isIsDerived() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsDerivedAtt());
    }

    @objid ("dbfcfa94-7a1f-4f8b-a33d-fc02c615da10")
    @Override
    public void setIsDerived(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsDerivedAtt(), value);
    }

    @objid ("879710f4-0a1d-4423-a396-6fb0bcf782d3")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsOrderedAtt());
    }

    @objid ("49a58e1b-c3e9-419e-92d6-6158d889c7d9")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("68ebc255-36cc-4f71-b876-3b2c43b4b2d3")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(StructuralFeatureData.Metadata.IsUniqueAtt());
    }

    @objid ("e4b93cb0-c59f-4f2c-9ebc-c6c56d906418")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(StructuralFeatureData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("8567e809-874c-405d-a06f-fe2f3b8a51d3")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt());
    }

    @objid ("3ed0b102-d984-48ab-a534-ee261b731474")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("1249cea0-9c38-4e5a-a448-d613cabce3dc")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("38b7f089-42db-43bb-aeba-4bb6ac5c5aff")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(StructuralFeatureData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("ed13cc96-4017-4173-9dbd-de503764e04e")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, StructuralFeatureData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("05e2fe31-a90b-4a99-8477-e74d12dd0157")
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

    @objid ("9fe38127-8597-4069-93b1-299a9ff1de18")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ece9b45e-7425-4075-8127-db6487897062")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a56608ae-51ac-4913-a81b-b241c52ac817")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuralFeature(this);
        else
          return null;
    }

}
