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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("846201e1-cf5a-418b-8883-935d03765fa0")
class PositiveInfluenceCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("d8c2b9e1-47c5-4d89-aae5-af90d9b8703b")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return canLink(linkStereotype, linkMetaclass, fromElement.getMClass(), toElement.getMClass());
    }

    @objid ("9db0208d-3e89-4865-9299-1f004c95baa6")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Goal.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("414f1aa0-bfd3-461e-ac12-80fabf093b00")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof Goal);
    }

    @objid ("897090fa-8d0a-4c1d-9db3-8f649c10e15f")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        return Goal.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
