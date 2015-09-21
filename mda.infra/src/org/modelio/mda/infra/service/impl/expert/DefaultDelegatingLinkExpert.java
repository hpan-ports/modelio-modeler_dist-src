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
import org.modelio.api.module.IMdaExpert;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9bdf9456-a077-4822-82e4-f21f5dd3c3b9")
class DefaultDelegatingLinkExpert implements IMdaExpert {
    @objid ("cc384fa1-ed7f-4f33-9d89-37ac049bb2cd")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, MClass from) {
        return linkMetaclass.getMetamodel().getMExpert().canSource(linkMetaclass, from);
    }

    @objid ("b38382bd-3545-4ce6-915d-9aeff5feaa31")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return canSource(linkStereotype, linkElement.getMClass(), fromElement.getMClass());
    }

    @objid ("77a44699-c1c3-403c-bf46-11eb099947e1")
    @Override
    public boolean canTarget(Stereotype linkStereotype, MClass linkMetaclass, MClass to) {
        return linkMetaclass.getMetamodel().getMExpert().canTarget(linkMetaclass, to);
    }

    @objid ("37925216-2b09-4bb0-9811-1cee1cfcaae3")
    @Override
    public boolean canTarget(Stereotype linkStereotype, MObject linkElement, final MObject toElement) {
        return canTarget(linkStereotype, linkElement.getMClass(), toElement.getMClass());
    }

    @objid ("3b589f4d-2adc-4bb5-8646-9521efe196f9")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, MClass fromMetaclass, MClass toMetaclass) {
        return linkMetaclass.getMetamodel().getMExpert().canLink(linkMetaclass, fromMetaclass, toMetaclass);
    }

    @objid ("38ceb9f1-50f3-407a-a741-e11abf9c8829")
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, MObject from, MObject to) {
        return canLink(linkStereotype, linkMetaclass, from.getMClass(), to.getMClass());
    }

}
