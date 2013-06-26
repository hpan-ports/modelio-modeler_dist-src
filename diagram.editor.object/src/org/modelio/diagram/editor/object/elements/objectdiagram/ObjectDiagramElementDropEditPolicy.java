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
                                    

package org.modelio.diagram.editor.object.elements.objectdiagram;

import java.util.Deque;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.common.abstractdiagram.DiagramElementDropEditPolicy;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Drop policy stopping the unmask on BindableInstances, instead of unmasking more hierarchy.
 */
@objid ("9d64c796-55b6-11e2-877f-002564c97630")
public class ObjectDiagramElementDropEditPolicy extends DiagramElementDropEditPolicy {
    @objid ("9d64c79a-55b6-11e2-877f-002564c97630")
    @Override
    protected boolean shouldUnmask(final MObject element, final Deque<MObject> hierarchy) {
        final MObject lastInHierarchy = hierarchy.peek();
        boolean isCurrentBindableInstance = false;
        if (lastInHierarchy != null) {
            isCurrentBindableInstance = lastInHierarchy instanceof BindableInstance;
        }
        return !isCurrentBindableInstance && super.shouldUnmask(element, hierarchy);
    }

}
