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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("e33b008c-3ae8-4b3e-9489-ab6445bcdb01")
class SatisfyCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("3077b059-3507-4bd9-9b5e-aef6c503b7a6")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof ModelElement) && (toElement instanceof Requirement);
    }

    @objid ("8ad83918-4cbb-4fff-8c51-e8f739f943fb")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Requirement.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("b03c0e45-27fb-450b-9e49-b221e32d2a92")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof ModelElement);
    }

    @objid ("ce301ba2-d3b7-434b-b68a-956ccbe383df")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        return ModelElement.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
