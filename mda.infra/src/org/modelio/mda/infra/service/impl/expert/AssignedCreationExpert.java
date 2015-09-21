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


package org.modelio.mda.infra.service.impl.expert;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * AssignedCreationExpert
 */
@objid ("85457f85-3880-4921-b385-3580030cd261")
class AssignedCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("157d3be5-3fdf-4fe9-94e7-0d2c14c32086")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        if (canSource(linkStereotype, linkMetaclass, fromElement.getMClass())) {
            return (toElement instanceof Goal);
        }
        return false;
    }

    @objid ("9db7a287-c29c-4e95-b356-c52b0fc1b0b0")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        if (canSource(linkStereotype, linkMetaclass, fromMetaclass)) {
            return Goal.class.isAssignableFrom(toMetaclass.getJavaInterface());
        }
        return false;
    }

    @objid ("f5b78bf7-bfd1-4a07-9980-8fde892bba57")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return canSource(linkStereotype, linkElement.getMClass(), fromElement.getMClass());
    }

    @objid ("e655685e-6a15-474b-843d-e5621ee7b01e")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return (Interface.class.isAssignableFrom(fromJmc) || Actor.class.isAssignableFrom(fromJmc)
                                                                || Package.class.isAssignableFrom(fromJmc) || BpmnProcess.class.isAssignableFrom(fromJmc) || BpmnBehavior.class
                                                                    .isAssignableFrom(fromJmc));
    }

}
