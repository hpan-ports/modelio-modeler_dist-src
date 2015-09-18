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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("72a02698-fa7a-4f9d-af4c-5e7338f0ba44")
public class GenericAnalystElementImpl extends AnalystElementImpl implements GenericAnalystElement {
    @objid ("d233d1f6-7195-4412-ad3e-d9943a5acefb")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedElementVersion();
    }

    @objid ("5b2c6227-f20f-4231-9d1e-d63fa8394ee4")
    @Override
    public AnalystElement getLastVersion() {
        return getLastElementVersion();
    }

    @objid ("6b7ff2be-75ee-47bb-b35c-b39496480c4b")
    @Override
    public EList<GenericAnalystElement> getSubElement() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.SubElementDep());
    }

    @objid ("8398edc8-9788-4dc4-b4a7-06fc948bc075")
    @Override
    public <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getSubElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("827b1468-565c-4950-9c69-64307c963ce2")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
    }

    @objid ("c5dc5620-bdf0-4fc7-9f91-3a76808e8712")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("6454bfca-d041-4c49-9a3b-ecb05a2cf790")
    @Override
    public GenericAnalystElement getParentElement() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
    }

    @objid ("c60dd6f8-513f-4b23-99d3-0303a3796be1")
    @Override
    public void setParentElement(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.ParentElementDep(), (SmObjectImpl)value);
    }

    @objid ("f1ef2db0-ad1f-4bb2-97fc-97c18b1a1a5d")
    @Override
    public GenericAnalystElement getLastElementVersion() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
    }

    @objid ("6319d787-6048-497c-ad9e-c4949c19c621")
    @Override
    public void setLastElementVersion(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("a72e9043-6037-4d34-9e9b-1476e9c4ae82")
    @Override
    public EList<GenericAnalystElement> getArchivedElementVersion() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.ArchivedElementVersionDep());
    }

    @objid ("8730327f-5dda-498e-8295-1addb5ac024f")
    @Override
    public <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getArchivedElementVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3dc94df4-9015-468f-afc4-f45547e9b32a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0d30b4be-0804-488a-88ad-10bd7d36cbd7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.ParentElementDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1b73035b-f481-47ea-8f03-c8233a6ffebe")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystElement(this);
        else
          return null;
    }

}
