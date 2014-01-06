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
    @objid ("05db9cb7-197c-4008-a56e-acd1934b21eb")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(FeatureData.Metadata.VisibilityAtt());
    }

    @objid ("02e1c2bd-19db-4df0-b1a7-594cba13aadc")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(FeatureData.Metadata.VisibilityAtt(), value);
    }

    @objid ("5fac4204-9e78-485f-b1b4-49c53a16763e")
    @Override
    public boolean isIsClass() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsClassAtt());
    }

    @objid ("a30d7f30-3c3e-4d33-b810-801d92d0f1bc")
    @Override
    public void setIsClass(boolean value) {
        setAttVal(FeatureData.Metadata.IsClassAtt(), value);
    }

    @objid ("f0489083-37e5-488f-8b2c-d578d8052055")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsAbstractAtt());
    }

    @objid ("1d95f2b7-e922-4e7e-a642-5681de43854b")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(FeatureData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("60e3fc90-4668-4b10-85d3-7c256523247a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4a0fc0aa-d1cc-4cea-a28e-5dce4754d0da")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("64a7cb7c-d5e0-49f0-ab23-d798bbebb546")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitFeature(this);
        else
          return null;
    }

}
