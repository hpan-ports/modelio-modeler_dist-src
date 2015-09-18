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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.FeatureData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("000b3ab0-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class FeatureImpl extends ModelElementImpl implements Feature {
    @objid ("b0ed264c-2e62-4279-8770-16d7e5c802c1")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(FeatureData.Metadata.VisibilityAtt());
    }

    @objid ("49c55517-5937-4ff0-8d5d-90be2d23c1e7")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(FeatureData.Metadata.VisibilityAtt(), value);
    }

    @objid ("d43fdbee-f696-419f-8829-4331fae99bad")
    @Override
    public boolean isIsClass() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsClassAtt());
    }

    @objid ("344713d7-df34-40ff-9076-516604c20f8c")
    @Override
    public void setIsClass(boolean value) {
        setAttVal(FeatureData.Metadata.IsClassAtt(), value);
    }

    @objid ("3fe48dd2-6a9f-44bd-bd68-b5105cde40b3")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsAbstractAtt());
    }

    @objid ("1372464e-ce14-4396-b4c5-151bb6256064")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(FeatureData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("e8b3fb2a-ffa6-4910-846d-a2b1135d4847")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("310ab0c3-f6e3-4d77-9e9c-4e9db4b2809a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ba419680-bf3b-48f4-9fba-7ff320317faf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitFeature(this);
        else
          return null;
    }

}
