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
                                    

package org.modelio.vcore.session.impl.load;

import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.IMetaOf;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;

/**
 * {@link IMetaOf} that can be used by a {@link org.modelio.vcore.session.api.repository.IRepository IRepository}
 * to load a MObject by using the standard metamodel API.
 * <p>
 * This metaobject must be used temporarily and then model objects must be reset
 * to their initial metaobject.
 */
@objid ("877f70d2-2d89-11e2-8aaa-001ec947ccaf")
class ModelLoaderMetaObject implements IMetaOf {
    /**
     * Initialize the metaobject.
     */
    @objid ("bd3fe0b2-2d9b-11e2-8aaa-001ec947ccaf")
    public ModelLoaderMetaObject() {
    }

    @objid ("bd3fe0be-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public Object getObjDepVal(SmObjectImpl obj, SmDependency dep) {
        ISmObjectData data = obj.getData();
        if (dep.isMultiple()) {
            return ((SmMultipleDependency) dep).getValueList(data);
        } else {
            return ((SmSingleDependency) dep).getValue(data);
        }
    }

    @objid ("bd3fe0c4-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean appendObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val) {
        return dep.add(obj, dep_val);
    }

    @objid ("bd3fe0cc-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean appendObjDepValIndex(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val, int index) {
        dep.insert(obj, dep_val, index);
        return true;
    }

    @objid ("bd3fe0d5-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean eraseObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val) {
        return dep.remove(obj, dep_val);
    }

    @objid ("bd3fe0dd-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean moveObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl moving_ref, int offset) {
        dep.moveRef(obj, moving_ref, offset);
        return true;
    }

    @objid ("bd3fe0e6-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean setObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl dep_val, int index) {
        // Do the job on the SmObjectImpl
        if (dep.isMultiple()) {
            List<SmObjectImpl> list = ((SmMultipleDependency) dep).getValueList(obj.getData());
            SmObjectImpl old = list.set(index, dep_val);
            return ! Objects.equals(old, dep_val);
        } else {
            throw new IllegalArgumentException(dep + " is a simple dependency.");
        }
    }

    @objid ("bd3fe0ee-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public Object getObjAttVal(SmObjectImpl obj, SmAttribute att) {
        return att.getValue(obj.getData());
    }

    @objid ("bd3fe0f5-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public boolean setObjAttVal(SmObjectImpl obj, SmAttribute att, Object value) {
        att.setValue(obj.getData(), value);
        return true;
    }

    @objid ("bd424308-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public void createObject(SmObjectImpl obj) {
        // do nothing
    }

    @objid ("bd42430c-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public void deleteObject(SmObjectImpl obj) {
        throw new UnsupportedOperationException();
    }

    @objid ("bd424310-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public void objUndeleted(SmObjectImpl obj) {
        throw new UnsupportedOperationException();
    }

    @objid ("bd424314-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public void setActionRecording(boolean val) {
        // nothing to do
    }

    @objid ("bd424318-2d9b-11e2-8aaa-001ec947ccaf")
    @Override
    public void silentActionRemove(SmObjectImpl obj) {
        throw new UnsupportedOperationException();
    }

    @objid ("18948f56-af8d-428d-98fb-e91d0bfbaa0d")
    @Override
    public void objStatusChanged(SmObjectImpl obj, long oldStatus, long newStatus) {
        // ignore
    }

}
