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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ea6ce9ce-bc10-4aab-ab22-c985ed9ea691")
class GuaranteeCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("4afb8e39-dc2a-4418-9dd5-24e2ea72b23d")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Requirement) && (toElement instanceof Goal);
    }

    @objid ("5c7eeca5-ef75-4041-807c-f77c9eaf4e8c")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Goal.class.isAssignableFrom(toJmc);
    }

    @objid ("b7b46a07-879c-460b-ab90-953fd99da5d8")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof Requirement);
    }

    @objid ("969894d3-1dab-4559-b954-4dd95b2dda28")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return Requirement.class.isAssignableFrom(fromJmc);
    }

}
