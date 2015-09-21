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

@objid ("81046773-d715-4d59-8e6a-4e0ccc6e2918")
class PartCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("5a933d77-1048-4e95-997d-edff1c560e8e")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return canLink(linkStereotype, linkMetaclass, fromElement.getMClass(), toElement.getMClass());
    }

    @objid ("cc0bce8f-ec39-4752-b97d-5bf428a2bb19")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        return (Requirement.class.isAssignableFrom(fromJmc) && Requirement.class.isAssignableFrom(toJmc))
                                                                || (Goal.class.isAssignableFrom(fromJmc) && Goal.class.isAssignableFrom(toJmc));
    }

    @objid ("e6a6a16e-52ab-4e67-bac3-3ca0d8426c51")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return ((fromElement instanceof Goal)) || ((fromElement instanceof Requirement));
    }

    @objid ("64bd3dd0-ee41-4d40-9a7b-68a9d3a6d5ce")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return Requirement.class.isAssignableFrom(fromJmc) || Goal.class.isAssignableFrom(fromJmc);
    }

}
