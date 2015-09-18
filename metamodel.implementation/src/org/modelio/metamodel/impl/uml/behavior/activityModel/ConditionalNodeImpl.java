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
    @objid ("b3c4678c-b2f6-4252-ba71-f33f6655b712")
    @Override
    public boolean isIsDeterminate() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt());
    }

    @objid ("5b570955-9570-49e6-946b-905672bf2aab")
    @Override
    public void setIsDeterminate(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt(), value);
    }

    @objid ("b5c95e83-02e1-435b-8438-e1f6e074e883")
    @Override
    public boolean isIsAssured() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsAssuredAtt());
    }

    @objid ("2704441c-56fe-4167-882a-b03b03f10a37")
    @Override
    public void setIsAssured(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsAssuredAtt(), value);
    }

    @objid ("6fea3ece-1ea1-4967-8e18-420dadfbdee3")
    @Override
    public EList<Clause> getOwnedClause() {
        return new SmList<>(this, ConditionalNodeData.Metadata.OwnedClauseDep());
    }

    @objid ("71d6a51e-c7cc-44f1-a5ab-0c34509e7927")
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

    @objid ("87729e40-508f-4108-8aaa-cf3115ec9a4d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("965b5111-021e-44fa-8d78-ec90c88d8c75")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("59d5ec9c-0090-40b0-978b-1e71e9fbfa68")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConditionalNode(this);
        else
          return null;
    }

}
