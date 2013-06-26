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
import org.modelio.metamodel.data.uml.behavior.activityModel.ConditionalNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002d81b0-c4bf-1fd8-97fe-001ec947cd2a")
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
    @objid ("e1f91c0f-403d-454d-9bf0-d60f0af129ba")
    @Override
    public boolean isIsDeterminate() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt());
    }

    @objid ("918393cf-1e3f-4f56-aa0c-3d324e48b0c7")
    @Override
    public void setIsDeterminate(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt(), value);
    }

    @objid ("e2101e90-3665-40bd-b143-261f7cf3eb68")
    @Override
    public boolean isIsAssured() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsAssuredAtt());
    }

    @objid ("9d4df648-9fac-4c5c-b4f8-5257827b9daa")
    @Override
    public void setIsAssured(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsAssuredAtt(), value);
    }

    @objid ("32d44de6-9135-4b1d-90fa-9c4434294178")
    @Override
    public EList<Clause> getOwnedClause() {
        return new SmList<>(this, ConditionalNodeData.Metadata.OwnedClauseDep());
    }

    @objid ("1052626f-d82b-4bc3-9914-004ba2af2a99")
    @Override
    public <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Clause element : getOwnedClause()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7cb312d4-3e63-46fe-be88-92680a37b1e6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("737d906a-cd13-455c-b5cf-df1b3c279438")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ef72128d-9a4a-42d5-94a7-ee08b2d55c9a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConditionalNode(this);
        else
          return null;
    }

}
