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
    @objid ("6da5fc95-4465-4c16-94d0-54b27fb3474a")
    @Override
    public EList<GenericAnalystElement> getSubElement() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.SubElementDep());
    }

    @objid ("4cbdc900-450d-454a-9fee-a379041c69f9")
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

    @objid ("d34ce476-ee33-46cd-b31a-0061354a6b1d")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep());
    }

    @objid ("69ad1fb3-50af-4f53-a00d-7b69edacf5f5")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystElementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("ef1898bd-49f0-4b3f-bef1-b654a70d0f91")
    @Override
    public GenericAnalystElement getParentElement() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.ParentElementDep());
    }

    @objid ("74561cb5-fa9e-4dfb-9b5a-5fbb06cad93e")
    @Override
    public void setParentElement(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.ParentElementDep(), (SmObjectImpl)value);
    }

    @objid ("24ce985d-ef89-4d25-8066-19c139111328")
    @Override
    public GenericAnalystElement getLastElementVersion() {
        return (GenericAnalystElement) getDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep());
    }

    @objid ("d7c264f3-08de-4de0-9e99-72b7a1d7daf6")
    @Override
    public void setLastElementVersion(GenericAnalystElement value) {
        appendDepVal(GenericAnalystElementData.Metadata.LastElementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("88d0832e-e32c-4fdb-9afc-c794de978277")
    @Override
    public EList<GenericAnalystElement> getArchivedElementVersion() {
        return new SmList<>(this, GenericAnalystElementData.Metadata.ArchivedElementVersionDep());
    }

    @objid ("53200ad2-843a-4a98-8049-c04ec8272191")
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

    @objid ("e8501c85-a486-4d44-b942-80dd44a38e59")
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

    @objid ("3db27789-c71e-402a-bdab-6af5d4b0c16b")
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

    @objid ("01c719ce-cc8f-43b2-8ea7-4a152f66a634")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystElement(this);
        else
          return null;
    }

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

}
