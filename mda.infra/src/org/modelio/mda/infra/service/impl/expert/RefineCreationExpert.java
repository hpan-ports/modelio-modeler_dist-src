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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("35ef882d-5211-4a45-9dd3-ff2f2fb25560")
class RefineCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("b991117d-8095-4eaa-8500-7f5795340ddd")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        if ((fromElement instanceof Activity) || (fromElement instanceof Operation) || (fromElement instanceof BusinessRule)) {
            if (toElement instanceof BusinessRule) {
                return true;
            }
        }
        if ((fromElement instanceof ModelElement) || (fromElement instanceof Requirement)) {
            return (toElement instanceof Requirement);
        }
        return false;
    }

    @objid ("d08758ec-4cdd-4fcf-8d04-2e7b9820f10b")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        if (canSource(linkStereotype, linkMetaclass, fromMetaclass)) {
            return Requirement.class.isAssignableFrom(toMetaclass.getJavaInterface())
                    || BusinessRule.class.isAssignableFrom(toMetaclass.getJavaInterface());
        }
        return false;
    }

    @objid ("1571ec1c-0277-4666-8bb9-a2cac1ea8a55")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return canSource(linkStereotype, linkElement.getMClass(), fromElement.getMClass());
    }

    @objid ("97ecd4db-3084-4b23-9249-a21fe7a3272e")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = linkMetaclass.getJavaInterface();
        return ModelElement.class.isAssignableFrom(fromJmc);
    }

}
