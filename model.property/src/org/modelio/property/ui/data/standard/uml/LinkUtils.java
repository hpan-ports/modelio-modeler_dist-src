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


package org.modelio.property.ui.data.standard.uml;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.modelelement.ModelElementListType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * Utilities for {@link LinkEnd} related property models.
 * @author cmarin
 */
@objid ("42740637-878f-4ebd-96c0-06ffc0a47864")
class LinkUtils {
    @objid ("036ac02c-a79a-4ef5-909c-0243763d18cc")
    public static IPropertyType getBaseAssociationType(LinkEnd editedEnd) {
        List<ModelElement> availableEnds = new ArrayList<>();
        
        Instance source = editedEnd.getOwner();
        Instance target = editedEnd.getOpposite().getOwner();
        NameSpace sourceBase = source.getBase();
        NameSpace targetBase = target.getBase();
        if (sourceBase != null && sourceBase instanceof Classifier && targetBase != null && targetBase instanceof Classifier) {
            for (AssociationEnd end : getAllOwnedEnd(sourceBase)) {
                if (isSubTypeOf(targetBase, end.getOpposite().getOwner())) {
                    if (!availableEnds.contains(end)) {
                        availableEnds.add(end);
                    }
                }
            }
        
            for (AssociationEnd end : getAllTargetingEnd(sourceBase)) {
                if (isSubTypeOf(targetBase, end.getOwner())) {
                    if (!availableEnds.contains(end.getOpposite())) {
                        availableEnds.add(end.getOpposite());
                    }
                }
            }
        }
        
        ModelElementListType type = new ModelElementListType(true, AssociationEnd.class, availableEnds, CoreSession.getSession(editedEnd));
        return type;
    }

    /**
     * Tells whether child is same or sub type of 'parent'.
     * @param child a namespace
     * @param parent a namespace potentially parent of child
     * @return whether child is same or sub type of 'parent'.
     */
    @objid ("66e460c1-25db-4b0b-aeb0-2fcf01ba4da7")
    private static boolean isSubTypeOf(NameSpace child, NameSpace parent) {
        if (child == null || parent == null) {
            return false;
        }
        if (child.equals(parent)) {
            return true;
        }
        
        for (Generalization g : child.getParent()) {
            if (isSubTypeOf(g.getSuperType(), parent)) {
                return true;
            }
        }
        
        if (parent instanceof Interface) {
            for (InterfaceRealization r : child.getRealized()) {
                if (isSubTypeOf(r.getImplemented(), parent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @objid ("50c08a62-4256-422e-aa7f-20bb520cf69c")
    private static List<AssociationEnd> getAllTargetingEnd(NameSpace sourceBase) {
        List<AssociationEnd> ret = new ArrayList<>();
        ret.addAll(((Classifier)sourceBase).getTargetingEnd());
        
        for (Generalization g : sourceBase.getParent()) {
            ret.addAll(getAllTargetingEnd(g.getSuperType()));
        }
        
        for (InterfaceRealization r : sourceBase.getRealized()) {
            ret.addAll(getAllTargetingEnd(r.getImplemented()));
        }
        return ret;
    }

    @objid ("1242ad8a-2ac2-410c-ac73-97fbb16dde63")
    private static List<AssociationEnd> getAllOwnedEnd(NameSpace sourceBase) {
        List<AssociationEnd> ret = new ArrayList<>();
        ret.addAll(((Classifier)sourceBase).getOwnedEnd());
        
        for (Generalization g : sourceBase.getParent()) {
            ret.addAll(getAllOwnedEnd(g.getSuperType()));
        }
        
        for (InterfaceRealization r : sourceBase.getRealized()) {
            ret.addAll(getAllOwnedEnd(r.getImplemented()));
        }
        return ret;
    }

}
