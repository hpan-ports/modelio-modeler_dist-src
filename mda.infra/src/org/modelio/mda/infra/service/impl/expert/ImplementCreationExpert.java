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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("10103622-caf9-4766-8b15-7292463f3d84")
class ImplementCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("875cf132-cc34-4bb1-ac39-eabdc354064f")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof Class) || (fromElement instanceof BpmnProcess)) {
            return (toElement instanceof BusinessRule);
        }
        return false;
    }

    @objid ("8ab7b85c-664e-4941-9a76-7e8fcfc832c1")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        java.lang.Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        if (canSource(linkStereotype, linkMetaclass, fromMetaclass)) {
            return BusinessRule.class.isAssignableFrom(toJmc);
        }
        return false;
    }

    @objid ("04ed673e-1b68-4f34-b513-c2d6f4e7c777")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return ((fromElement instanceof Class) || (fromElement instanceof BpmnProcess));
    }

    @objid ("92d737a7-3d50-4442-a614-592f21eb319f")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        java.lang.Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return ((Class.class.isAssignableFrom(fromJmc)) || (BpmnProcess.class.isAssignableFrom(fromJmc)));
    }

}
