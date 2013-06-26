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
                                    

package org.modelio.vstore.exml.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.model.CompositionGetter.IStopFilter;
import org.modelio.vcore.model.CompositionGetter;
import org.modelio.vcore.smkernel.SmLiveId;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * EXML utilities.
 */
@objid ("fd26ba12-5986-11e1-991a-001ec947ccaf")
public final class ExmlUtils {
    /**
     * Get all objects contained in the given CMS node.
     * <p>
     * Child CMS nodes are excluded.
     * @param cmsNode a CMS node object
     * @return all contained objects.
     */
    @objid ("df1fddf5-1c43-11e2-8eb9-001ec947ccaf")
    public static Collection<SmObjectImpl> getCmsNodeContent(SmObjectImpl cmsNode) {
        return CompositionGetter.getAllChildren(Collections.singletonList(cmsNode), IsCmsNodeContentFilter.instance);
    }

    /**
     * Get the CMS node that stores the given object.
     * <p>
     * Returns the object itself if it is a CMS node.
     * @param initialObj an object
     * @return its CMS node.
     */
    @objid ("fd2457f8-5986-11e1-991a-001ec947ccaf")
    public static SmObjectImpl getCmsNode(SmObjectImpl initialObj) {
        SmObjectImpl obj = initialObj;
        while (obj != null && ! obj.getClassOf().isCmsNode())
        {
            obj = obj.getCompositionOwner();
        }
        return obj;
    }

    /**
     * Get all SmDependencies that must be serialized.
     * <p>
     * Are to be serialized:
     * <li> strong composition dependencies
     * <li> shared composition dependencies
     * <li> 'partof' dependencies that are not opposites of strong or shared composition.
     * </ul>
     * @param object a model object
     * @return all SmDependency to serialize.
     */
    @objid ("fd21f732-5986-11e1-991a-001ec947ccaf")
    public static List<SmDependency> getExternalisableDeps(final SmObjectImpl object) {
        SmClass objectClass = object.getClassOf();
        List<SmDependency> allDeps = objectClass.getAllDepDef();
        List<SmDependency> deps = new ArrayList<>(allDeps.size());
        
        for (SmDependency dep : allDeps) {
            // Serialize :
            // - component dependencies 
            // - and 'partof' dependencies that are not composition opposites
            if (ExmlUtils.isDepComponent(dep) || (dep.isPartOf() && ! dep.isCompositionOpposite()))
                deps.add(dep);
        }
        return deps;
    }

    /**
     * Get the parent CMS node of this object.
     * @param object an object
     * @return the parent CMS node.
     */
    @objid ("fd21f730-5986-11e1-991a-001ec947ccaf")
    public static MObject getParentCmsNode(final MObject object) {
        MObject parent = object.getCompositionOwner();
        while (parent != null && !parent.getMClass().isCmsNode()) {
            parent = parent.getCompositionOwner();
        }
        return parent;
    }

    /**
     * Tells whether the dependency is a composition or a shared composition.
     * @param dep a dependency
     * @return <code>true</code> if the dependency is a composition or a shared composition else <code>false</code>.
     */
    @objid ("fd21f72f-5986-11e1-991a-001ec947ccaf")
    public static boolean isDepComponent(final SmDependency dep) {
        return (dep.isComponent() || dep.isSharedComposition());
    }

    /**
     * Tells whether the 2 objects are in the same repository.
     * @param o1 an object
     * @param o2 an object
     * @return <code>true</code> if both objects are in the same repository, else <code>false</code>
     */
    @objid ("f0ddc0ae-92d7-11e1-be7e-001ec947ccaf")
    public static boolean sameRepository(final SmObjectImpl o1, final SmObjectImpl o2) {
        return SmLiveId.getRid(o2.getLiveId()) == SmLiveId.getRid(o1.getLiveId());
    }

    /**
     * @deprecated No instances.
     */
    @objid ("fd2457f6-5986-11e1-991a-001ec947ccaf")
    @Deprecated
    private ExmlUtils() {
    }

    /**
     * Tells whether the source object is the composition owner of dest object by the given dependency.
     * <p>
     * The source and target object must be linked by the relation.
     * <p>
     * If the dependency is a composition, always return true (it's a shortcut).
     * If the dependency is a shared composition, test whether the target composition owner
     * is the source object.
     * @param src a model object
     * @param dep a model dependency
     * @param dest a model object
     * @return <code>true</code> if source is the composition owner of target.
     */
    @objid ("8265a510-b4ac-4983-b6f0-966e4f61982c")
    public static boolean isComposition(SmObjectImpl src, SmDependency dep, SmObjectImpl dest) {
        if (dep.isComponent())
            return true;
        if (!dep.isSharedComposition())
            return false;
        return src.equals(dest.getCompositionOwner());
    }

    /**
     * Filter that stops on CMS nodes.
     */
    @objid ("fd26ba02-5986-11e1-991a-001ec947ccaf")
    private static class IsCmsNodeContentFilter implements IStopFilter {
        @objid ("fd21f62e-5986-11e1-991a-001ec947ccaf")
        public static IsCmsNodeContentFilter instance = new IsCmsNodeContentFilter();

        @objid ("fd21f71b-5986-11e1-991a-001ec947ccaf")
        @Override
        public boolean accept(SmObjectImpl anObject) {
            return ! anObject.getClassOf().isCmsNode();
        }

    }

}
