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
    @objid ("7cc9ce62-7dbb-4c41-8ca8-8886afefb796")
    @Override
    public boolean isIsDeterminate() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt());
    }

    @objid ("89d82904-1193-45d8-9687-d082ca1a2fe3")
    @Override
    public void setIsDeterminate(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsDeterminateAtt(), value);
    }

    @objid ("5d749174-59dc-4c94-9995-11904d8f2e6e")
    @Override
    public boolean isIsAssured() {
        return (Boolean) getAttVal(ConditionalNodeData.Metadata.IsAssuredAtt());
    }

    @objid ("a3abc210-20a7-4fd3-a6dc-7c63ff040832")
    @Override
    public void setIsAssured(boolean value) {
        setAttVal(ConditionalNodeData.Metadata.IsAssuredAtt(), value);
    }

    @objid ("a2dec71a-8705-4155-8dbe-a0f4dc4127de")
    @Override
    public EList<Clause> getOwnedClause() {
        return new SmList<>(this, ConditionalNodeData.Metadata.OwnedClauseDep());
    }

    @objid ("4daa62ab-7f8f-45b9-9605-d08a7c7e03e4")
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

    @objid ("3bff3fc8-2291-436a-ab91-da93d20d789d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6f57f96f-63bf-4401-919f-6d87c6b6eaa6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9ab75abe-172d-41a3-b4d3-66a318027ee2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConditionalNode(this);
        else
          return null;
    }

}
