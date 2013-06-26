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
    @objid ("fd6d9f5b-38ec-4cc7-913e-66ede3d4283f")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(FeatureData.Metadata.VisibilityAtt());
    }

    @objid ("258020b8-8fa4-4fd4-a085-444d3dd48b23")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(FeatureData.Metadata.VisibilityAtt(), value);
    }

    @objid ("084b84fa-1ace-43b7-8698-b9a2b95f2034")
    @Override
    public boolean isIsClass() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsClassAtt());
    }

    @objid ("fead2cf4-b68d-483d-a44d-d53688b50447")
    @Override
    public void setIsClass(boolean value) {
        setAttVal(FeatureData.Metadata.IsClassAtt(), value);
    }

    @objid ("25cf08a2-22fa-4d20-9ce4-8a2ae860f3ba")
    @Override
    public boolean isIsAbstract() {
        return (Boolean) getAttVal(FeatureData.Metadata.IsAbstractAtt());
    }

    @objid ("72124631-3924-4716-8fd5-de06574504de")
    @Override
    public void setIsAbstract(boolean value) {
        setAttVal(FeatureData.Metadata.IsAbstractAtt(), value);
    }

    @objid ("f43c69c6-7ace-4bc6-aeab-8f5f55b7094d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("90519410-7559-476e-826b-29ed5d89171b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d3467ae3-be43-434f-bd39-f12bad5885e2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitFeature(this);
        else
          return null;
    }

}
