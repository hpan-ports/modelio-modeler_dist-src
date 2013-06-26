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
import org.modelio.metamodel.data.uml.behavior.activityModel.StructuredActivityNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("003e347e-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuredActivityNodeImpl extends ActivityActionImpl implements StructuredActivityNode {
    @objid ("2b62d4fb-757a-4c3f-b607-13d7dc0fcfe7")
    @Override
    public boolean isMustIsolate() {
        return (Boolean) getAttVal(StructuredActivityNodeData.Metadata.MustIsolateAtt());
    }

    @objid ("186b6acd-d296-4a29-8e96-e254a97aa6c5")
    @Override
    public void setMustIsolate(boolean value) {
        setAttVal(StructuredActivityNodeData.Metadata.MustIsolateAtt(), value);
    }

    @objid ("9886ec28-d7b3-4952-88da-a41798e5cc08")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, StructuredActivityNodeData.Metadata.BodyDep());
    }

    @objid ("ac111ccf-d944-4d5b-ad2f-c608b6755ec9")
    @Override
    public <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getBody()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7528d8ec-27ad-4fd6-a4e3-18420afd54de")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9fc66f92-558e-4434-82de-2fafc1c81041")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9888f518-16b6-4f00-833e-5ef81c167dd9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuredActivityNode(this);
        else
          return null;
    }

}
