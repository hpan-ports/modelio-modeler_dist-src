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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("2d4bcf3c-ba14-47ea-acee-d940b6c6f469")
class ContextCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("73cfe584-0d86-425e-9bc6-09fa4788928a")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("736e0172-13ca-4255-95b8-8d2c5020b44b")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Term.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("31f7f72b-3504-4910-ab67-4b725331a265")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("58844388-9377-4c73-9202-ca2026a967d0")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return Term.class.isAssignableFrom(fromJmc);
    }

}
