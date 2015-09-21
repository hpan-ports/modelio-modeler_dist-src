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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.FeatureData;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000b3ab0-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class FeatureImpl extends ModelElementImpl implements Feature {
    @objid ("e50fd3ae-4767-4e7c-b17d-f41fbcfeb42b")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(((FeatureSmClass)getClassOf()).getVisibilityAtt());
    }

    @objid ("1404847e-c478-45d3-94a6-e7e70962b9ef")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(((FeatureSmClass)getClassOf()).getVisibilityAtt(), value);
    }

    @objid ("12b82f3b-493b-4fba-bbe8-448c9e4edf59")
    @Override
    public boolean isIsClass() {
        return (Boolean) getAttVal(((FeatureSmClass)getClassOf()).getIsClassAtt());
    }

    @objid ("a5100fc6-fa96-45f9-a710-152114dffbbc")
    @Override
    public void setIsClass(boolean value) {
        setAttVal(((FeatureSmClass)getClassOf()).getIsClassAtt(), value);
    }

    @objid ("26898c5b-e1f8-4394-b6b5-ae838c731fad")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(((FeatureSmClass)getClassOf()).getIsAbstractAtt());
    }

    @objid ("debc5fd1-348e-4209-990d-e659dc0bbe5b")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(((FeatureSmClass)getClassOf()).getIsAbstractAtt(), value);
    }

    @objid ("c9cbe48a-f9d4-432e-9e49-d4d1b3b202bc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("83603686-5a74-4059-99ad-51c77e634fed")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("48d96a28-d810-4bda-b553-9d9a235f78a4")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitFeature(this);
        else
          return null;
    }

}
