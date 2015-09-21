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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f544f3b6-5c3d-41c0-aa13-f0ddc0df1ad3")
class MeasureCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("818c1d5b-e7bf-4f2f-b953-ed0965fafb9c")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return canLink(linkStereotype, linkMetaclass, fromElement.getMClass(), toElement.getMClass());
    }

    @objid ("7ab90ba2-4801-4d75-9329-9b19cf4020f8")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Goal.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("460976b7-b016-4d3c-b794-0d8a2700d463")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return canSource(linkStereotype, linkElement.getMClass(), fromElement.getMClass());
    }

    @objid ("7bd8add7-f3b5-44c1-9775-782e476cf009")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        return ModelElement.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
