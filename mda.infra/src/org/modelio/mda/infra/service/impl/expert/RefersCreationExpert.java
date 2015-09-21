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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("29a4f835-a3dc-4a8e-9024-0ce627264c99")
class RefersCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("68dab44f-dc08-431e-a0db-d0dd473614e0")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return canLink(linkStereotype, linkMetaclass, fromElement.getMClass(), toElement.getMClass());
    }

    @objid ("272055d0-127d-492a-8c70-3bef43fa5415")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        //Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        //return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Term.class.isAssignableFrom(toJmc);
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Term.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("baa84c45-3afa-42bf-b0a7-87ab2bce74db")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return canSource(linkStereotype, linkElement.getMClass(), fromElement.getMClass());
    }

    @objid ("74db3178-7ad4-4b59-802a-fdc27f3bb98d")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        //Class<? extends MObject> fromJmc = linkMetaclass.getJavaInterface();
        //return BusinessRule.class.isAssignableFrom(fromJmc);
        return BusinessRule.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
