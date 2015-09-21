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

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.model.browser.views.treeview.BrowserContentProvider;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Semantic content provider for the model browser.
 * <p>
 * This implementation is basically a standard BrowserModelContentProvider where redefined methods return semantic features as SmNode instances.
 * Semantic features of a MObject represents the SmAttribute and SmDependendy of the object metaclass.
 * </p>
 * <p>
 * The {@link #getElements(Object)} method returns the tree roots, from the "local roots" if defined, or from the GProject itself.
 * </p>
 */
@objid ("4a6f62f0-3bf3-455c-b6b1-9434b9587aa1")
public class SmBrowserContentProvider extends BrowserContentProvider {
    @objid ("b3ff5932-272d-4cb2-8f13-8f533c6648d5")
    @Override
    public Object getParent(final Object child) {
        if (child instanceof SmNode) {
            return ((SmNode) child).getObj();
        } else {
            return super.getParent(child);
        }
    }

    @objid ("035c2c19-efe8-419b-84ab-b723e0b702d1")
    @Override
    public Object[] getChildren(final Object parent) {
        // For a SmNode
        if (parent instanceof SmNode) {
            final SmNode node = (SmNode) parent;
            return node.getContent().toArray();
        }
        
        // For a MObject, return its Features unless it is a RAMC element
        if (parent instanceof MObject) {
            final MObject mObj = (MObject) parent;
            if (!mObj.getStatus().isRamc()) {
                final ArrayList<Object> smChildren = new ArrayList<>();
                for (final MAttribute mAtt : mObj.getMClass().getAttributes(true)) {
                    smChildren.add(new SmNode(mObj, mAtt));
                }
                for (final MDependency mDep : mObj.getMClass().getDependencies(true)) {
                    SmNode smNode = new SmNode(mObj, mDep);
                    if (!smNode.getContent().isEmpty()) {
                        smChildren.add(smNode);
                    }
                }
                return smChildren.toArray();
            }
        
        }
        return super.getChildren(parent);
    }

    @objid ("5127d904-88f3-4487-92a5-6f7373c37ae5")
    @Override
    public boolean hasChildren(final Object parent) {
        if (parent instanceof SmNode) {
            return ((SmNode) parent).getFeature() instanceof MDependency;
        }
        if (parent instanceof MObject) {
            return true;
        }
        return super.hasChildren(parent);
    }

}
