/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001f3344-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
    @objid ("327b55e7-1761-4d89-859a-d388692a9f9f")
    @Override
    public KindOfAccess getChangeable() {
        return (KindOfAccess) getAttVal(((StructuralFeatureSmClass)getClassOf()).getChangeableAtt());
    }

    @objid ("0090006e-270a-4f5d-97c6-4a858db96f97")
    @Override
    public void setChangeable(KindOfAccess value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getChangeableAtt(), value);
    }

    @objid ("f6cf783c-c591-4234-aa7d-bfe33b693b5e")
    @Override
    public boolean isIsDerived() {
        return (Boolean) getAttVal(((StructuralFeatureSmClass)getClassOf()).getIsDerivedAtt());
    }

    @objid ("60d2b204-489d-4041-9e9d-0e2882ca115e")
    @Override
    public void setIsDerived(boolean value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getIsDerivedAtt(), value);
    }

    @objid ("08a59de0-4260-4cd1-be64-9b7b51e4a4a3")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(((StructuralFeatureSmClass)getClassOf()).getIsOrderedAtt());
    }

    @objid ("27d2ad69-08b6-47c5-9c4b-e0be9a4f5ce1")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getIsOrderedAtt(), value);
    }

    @objid ("6646424e-330f-40bd-8b01-5bef4df81c3e")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(((StructuralFeatureSmClass)getClassOf()).getIsUniqueAtt());
    }

    @objid ("2113dd24-52e8-4522-af02-2f8f30a2b928")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getIsUniqueAtt(), value);
    }

    @objid ("91cb2611-b78d-421c-b7c1-927a9987e8f1")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(((StructuralFeatureSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("c8d948d5-0c50-4c9f-843d-bdb5c08f945f")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("0bd1d8c3-c8c4-4db0-90ac-105b2e5d9c56")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(((StructuralFeatureSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("7dd9a8a2-7fd5-4235-ac8c-fb8e6e8e8aed")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(((StructuralFeatureSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("0d8513ac-111d-4e29-b8f2-25395190b5c7")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((StructuralFeatureSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("7e72478c-e2ec-4c6a-ac5b-4dd93133ae6f")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f73c9c74-637b-4d79-a9a0-ee035b4f0757")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1fa860d9-b5f2-4096-a243-fa2534aa88f3")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("fcbe7b44-8a19-4fe8-a6b8-74b6131b6182")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuralFeature(this);
        else
          return null;
    }

}
