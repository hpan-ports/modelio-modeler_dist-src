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


package org.modelio.model.browser.views.treeview.sm;

import java.util.Collection;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmFeature;

/**
 * Utility class for the Semantic Model Browser.</br>
 * A SmNode holds a pair composed of<ul>
 * <li>a model object of type MObject</li>
 * <li>a semantic feature of type SmFeature</li>
 * </ul>
 * 
 * 
 * @author phv
 */
@objid ("541f1c08-be73-4878-b306-f7d18141131a")
public class SmNode {
    @mdl.prop
    @objid ("41708854-d131-49fc-bbae-bdcc6b3a36d0")
    private final MObject obj;

    @mdl.propgetter
    public MObject getObj() {
        // Automatically generated method. Please do not modify this code.
        return this.obj;
    }

    @mdl.prop
    @objid ("8ef574f8-d882-4ec3-aec2-084712b41ce8")
    private final SmFeature feature;

    @mdl.propgetter
    public SmFeature getFeature() {
        // Automatically generated method. Please do not modify this code.
        return this.feature;
    }

    @objid ("ee296e1b-7418-4316-9ea1-7fb451cde4b2")
    public SmNode(MObject mObj, MDependency mDep) {
        this.obj = mObj;
        this.feature = (SmFeature) mDep;
    }

    @objid ("a0afed02-9508-4ca8-9739-dd4dd100fb55")
    public SmNode(MObject mObj, MAttribute mAtt) {
        this.obj = mObj;
        this.feature = (SmFeature)mAtt;
    }

    @objid ("ea6a2133-e861-457c-866c-e34bd2713b90")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.feature == null ? 0 : this.feature.hashCode());
        result = prime * result + (this.obj == null ? 0 : this.obj.hashCode());
        return result;
    }

    @objid ("9a8b98ad-47d6-4d31-8461-b3a54704dc21")
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final SmNode other = (SmNode) o;
        if (this.feature == null) {
            if (other.feature != null) {
                return false;
            }
        } else if (!this.feature.equals(other.feature)) {
            return false;
        }
        if (this.obj == null) {
            if (other.obj != null) {
                return false;
            }
        } else if (!this.obj.equals(other.obj)) {
            return false;
        }
        return true;
    }

    /**
     * For a SmDependency, return its contents.
     * For a SmAttribute return nothing.
     * @return the tree node children
     */
    @objid ("565ed862-16aa-4052-b2af-e9352cff2054")
    public Collection<?> getContent() {
        if (getFeature() instanceof SmDependency) {
            return ((SmObjectImpl) getObj()).getDepValList((SmDependency) getFeature());
        }
        
        // For a SmAttribute return nothing
        return Collections.emptyList();
    }

}
