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


package org.modelio.vcore.smkernel.meta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MExpert;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This MExpert implementation smartly (very smartly :) ) delegates its behavior to the fragment experts.
 */
@objid ("722d73d7-f7e9-4bc6-a51d-0ce2671e7983")
class SmExpert implements MExpert {
    @objid ("3fb7de86-d45f-4677-906b-5d0e9850b756")
    @Override
    public boolean canCompose(MClass owner, MClass composed, String dep) {
        if (owner.getOrigin().getMExpert().canCompose(owner, composed, dep)) {
            return true;
        } else if (owner.getOrigin() != composed.getOrigin()) {
            return composed.getOrigin().getMExpert().canCompose(owner, composed, dep);
        } else {
            return false;
        }
    }

    @objid ("71d3d093-8ebd-4e6b-a986-104524715870")
    @Override
    public boolean canCompose(MObject owner, MClass composed, String dep) {
        if (owner.getMClass().getOrigin().getMExpert().canCompose(owner, composed, dep)) {
            return true;
        } else if (owner.getMClass().getOrigin() != composed.getOrigin()) {
            return composed.getOrigin().getMExpert().canCompose(owner, composed, dep);
        } else {
            return false;
        }
    }

    @objid ("76adc186-98d8-4285-a19f-0d5b47e3802d")
    @Override
    public boolean canCompose(MObject owner, MObject composed, String dep) {
        if (owner.getMClass().getOrigin().getMExpert().canCompose(owner, composed, dep)) {
            return true;
        } else if (owner.getMClass().getOrigin() != composed.getMClass().getOrigin()) {
            return composed.getMClass().getOrigin().getMExpert().canCompose(owner, composed, dep);
        } else {
            return false;
        }
    }

    @objid ("006b7862-8679-4dfd-9c58-ff2d513183d7")
    @Override
    public boolean canDep(MObject source, MClass target, String dep) {
        if (source.getMClass().getOrigin().getMExpert().canDep(source, target, dep)) {
            return true;
        } else if (source.getMClass().getOrigin() != target.getOrigin()) {
            return target.getOrigin().getMExpert().canDep(source, target, dep);
        } else {
            return false;
        }
    }

    @objid ("4e773f2d-34a7-4e70-967a-ea1a49bc48c3")
    @Override
    public boolean canDep(MClass source, MClass target, String dep) {
        if (source.getOrigin().getMExpert().canDep(source, target, dep)) {
            return true;
        } else if (source.getOrigin() != target.getOrigin()) {
            return target.getOrigin().getMExpert().canDep(source, target, dep);
        } else {
            return false;
        }
    }

    @objid ("1a2cd280-aa51-4771-9507-42356b08d2b1")
    @Override
    public boolean canDep(MObject source, MObject target, String dep) {
        if (source.getMClass().getOrigin().getMExpert().canDep(source, target, dep)) {
            return true;
        } else if (source.getMClass().getOrigin() != target.getMClass().getOrigin()) {
            return target.getMClass().getOrigin().getMExpert().canDep(source, target, dep);
        } else {
            return false;
        }
    }

    @objid ("f428d598-766c-41b3-960d-54080d16ec61")
    @Override
    public boolean isLink(MClass metaclass) {
        return metaclass.getOrigin().getMExpert().isLink(metaclass);
    }

    @objid ("6d0e5777-588b-455d-b41d-d7baa7fd73ef")
    @Override
    public boolean canLink(MClass link, MClass from, MClass to) {
        if (link.getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else if (from.getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else if (to.getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else {
            return false;
        }
    }

    @objid ("0899e6d0-0900-4bb7-adce-f02ccb0fab25")
    @Override
    public boolean canLink(MClass link, MObject from, MObject to) {
        if (link.getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else if (from.getMClass().getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else if (to.getMClass().getOrigin().getMExpert().canLink(link, from, to)) {
            return true;
        } else {
            return false;
        }
    }

    @objid ("8e3d0035-e5a7-42af-92c7-2869e4f13cd6")
    @Override
    public boolean canSource(MClass link, MClass from) {
        if (link.getOrigin().getMExpert().canSource(link, from)) {
            return true;
        } else if (link.getOrigin() != from.getOrigin()) {
            return from.getOrigin().getMExpert().canSource(link, from);
        } else {
            return false;
        }
    }

    @objid ("2e7d09a7-308c-4e4b-8553-9715b62994be")
    @Override
    public boolean canSource(MObject link, MObject from) {
        if (link.getMClass().getOrigin().getMExpert().canSource(link, from)) {
            return true;
        } else if (link.getMClass().getOrigin() != from.getMClass().getOrigin()) {
            return from.getMClass().getOrigin().getMExpert().canSource(link, from);
        } else {
            return false;
        }
    }

    @objid ("2fbecb8f-bd57-4181-8f69-aef545f61d9c")
    @Override
    public boolean canTarget(MClass link, MClass to) {
        if (link.getOrigin().getMExpert().canTarget(link, to)) {
            return true;
        } else if (link.getOrigin() != to.getOrigin()) {
            return to.getOrigin().getMExpert().canTarget(link, to);
        } else {
            return false;
        }
    }

    @objid ("3ee41a27-69fd-46f4-a9e2-8227e7324b80")
    @Override
    public boolean canTarget(MObject link, MObject to) {
        if (link.getMClass().getOrigin().getMExpert().canTarget(link, to)) {
            return true;
        } else if (link.getMClass().getOrigin() != to.getMClass().getOrigin()) {
            return to.getMClass().getOrigin().getMExpert().canTarget(link, to);
        } else {
            return false;
        }
    }

    @objid ("36983199-210b-464b-ab8c-ce0c7ca2bf0c")
    @Override
    public MObject getSource(MObject aLink) {
        return aLink.getMClass().getOrigin().getMExpert().getSource(aLink);
    }

    @objid ("961448d5-2a06-46d1-ac5b-e6a1fa6d1458")
    @Override
    public MObject getTarget(MObject aLink) {
        return aLink.getMClass().getOrigin().getMExpert().getTarget(aLink);
    }

    @objid ("a3c77178-4a23-4adb-847b-0d6c49a22734")
    @Override
    public List<MDependency> getDeps(MObject source, MObject target) {
        Set<MDependency> results = new HashSet<>();
        results.addAll(source.getMClass().getOrigin().getMExpert().getDeps(source, target));
        if (source.getMClass().getOrigin() != target.getMClass().getOrigin()) {
            results.addAll(target.getMClass().getOrigin().getMExpert().getDeps(source, target));
        }
        return new ArrayList<>(results);
    }

    @objid ("0950c857-a93e-4379-812d-1b5033177fa0")
    @Override
    public MDependency getDefaultCompositionDep(MObject owner, MObject composed) {
        MDependency dep = owner.getMClass().getOrigin().getMExpert().getDefaultCompositionDep(owner, composed);
        if (dep != null) {
            return dep;
        } else if (owner.getMClass().getOrigin() != composed.getMClass().getOrigin()) {
            return composed.getMClass().getOrigin().getMExpert().getDefaultCompositionDep(owner, composed);
        } else {
            return null;
        }
    }

    @objid ("8be62254-905d-4a78-b781-0d3949b222bd")
    @Override
    public void setSource(MObject link, MObject oldSource, MObject newSource) throws IllegalArgumentException {
        link.getMClass().getOrigin().getMExpert().setSource(link, oldSource, newSource);
    }

    @objid ("fb6e099b-eff7-4b2c-b558-b2c11b3193f4")
    @Override
    public void setTarget(MObject link, MObject oldTarget, MObject newTarget) throws IllegalArgumentException {
        link.getMClass().getOrigin().getMExpert().setTarget(link, oldTarget, newTarget);
    }

}
