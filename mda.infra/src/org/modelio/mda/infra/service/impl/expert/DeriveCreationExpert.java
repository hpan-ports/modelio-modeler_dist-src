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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5b7e4209-28d3-41cc-bb6c-3c91d37c9565")
class DeriveCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("5b207894-e7b3-49c3-be93-e45a574a85db")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return canLink(linkStereotype, linkMetaclass, fromElement.getMClass(), toElement.getMClass());
    }

    @objid ("04bfc1d5-361e-4fee-a2a7-9ca281cd7b1a")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Requirement.class.isAssignableFrom(toJmc);
    }

    @objid ("895775ca-806a-405b-860c-aac299920ce7")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof UseCase) || (fromElement instanceof Requirement);
    }

    @objid ("a5f7ad2f-fdb0-4661-a185-5f2d2c4bf89c")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return ((UseCase.class.isAssignableFrom(fromJmc)) || (Requirement.class.isAssignableFrom(fromJmc)));
    }

}
