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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00856a60-c4be-1fd8-97fe-001ec947cd2a")
public class ConstraintImpl extends ModelElementImpl implements Constraint {
    @objid ("006b6ba6-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionOwner();
        else
            return list.get(0);
    }

    @objid ("006b90fe-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionRelation();
        else
          return new SmDepVal(ConstraintData.Metadata.ConstrainedElementDep(), list.get(0));
    }

    @objid ("e5d87186-a39f-4095-a0fc-05d25326e563")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(ConstraintData.Metadata.BaseClassAtt());
    }

    @objid ("5d52056b-1773-4f51-98c4-aa109631fbe5")
    @Override
    public void setBaseClass(String value) {
        setAttVal(ConstraintData.Metadata.BaseClassAtt(), value);
    }

    @objid ("2b4c6300-60b8-4c16-a944-e042ecb856d2")
    @Override
    public String getBody() {
        return (String) getAttVal(ConstraintData.Metadata.BodyAtt());
    }

    @objid ("326a198a-6520-4182-8d31-dd7c528972a2")
    @Override
    public void setBody(String value) {
        setAttVal(ConstraintData.Metadata.BodyAtt(), value);
    }

    @objid ("55c01d1b-fffe-4c83-906e-a7e63748f3b1")
    @Override
    public String getLanguage() {
        return (String) getAttVal(ConstraintData.Metadata.LanguageAtt());
    }

    @objid ("900ede56-b2f5-46a2-8625-b9e8129fba0c")
    @Override
    public void setLanguage(String value) {
        setAttVal(ConstraintData.Metadata.LanguageAtt(), value);
    }

    @objid ("1aa22376-1b5a-4a8a-bfe0-b076c005605b")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ConstraintData.Metadata.ConstrainedElementDep());
    }

    @objid ("58152355-2e0f-46e6-a705-00195caf0153")
    @Override
    public <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getConstrainedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cbb677c2-e0c3-4244-b0ae-28fdb12f8589")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
    }

}
