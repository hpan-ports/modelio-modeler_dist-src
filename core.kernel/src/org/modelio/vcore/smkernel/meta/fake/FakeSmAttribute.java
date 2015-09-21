/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.vcore.smkernel.meta.fake;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Fake SmAttribute implementation.
 */
@objid ("08cda3da-dfc8-428b-bcac-d1d93ef50c84")
public class FakeSmAttribute extends SmAttribute {
    /**
     * Create a String fake attribute.
     * @param owner the metaclass
     * @param name the name
     */
    @objid ("447be8b6-cec9-4e67-8b2d-d645af0e39da")
    public FakeSmAttribute(SmClass owner, String name) {
        init(name, owner, String.class);
    }

    @objid ("4c2529a0-b512-4566-bd19-cb1369bc572a")
    @Override
    public Object getValue(ISmObjectData data) {
        return cast(data).content.get(this);
    }

    @objid ("8ae9e4f2-bae5-4df7-87f3-d2b752f6a749")
    @Override
    public void setValue(ISmObjectData object, Object value) {
        cast(object).content.put(this, value);
    }

    @objid ("b5dc7e96-6d7f-4dd6-a7b5-ee3f516229a0")
    private static FakeSmObjectData cast(ISmObjectData data) {
        return (FakeSmObjectData) data;
    }

}
