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

@objid ("cc0b5ab9-ca92-4d3a-9499-4feac8afa8a4")
class RelatedCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("52f10069-a1f7-4c97-a591-28ca71eeed19")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return ((fromElement instanceof BusinessRule) && (toElement instanceof BusinessRule))
                                                                || ((fromElement instanceof Term) && (toElement instanceof Term));
    }

    @objid ("0fd8e074-9066-487d-9f8a-76f082e2c308")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return (BusinessRule.class.isAssignableFrom(fromMetaclass.getJavaInterface()) && BusinessRule.class
                                                                .isAssignableFrom(toMetaclass.getJavaInterface()))
                                                                || (Term.class.isAssignableFrom(fromMetaclass.getJavaInterface()) && Term.class.isAssignableFrom(toMetaclass
                                                                        .getJavaInterface()));
    }

    @objid ("7d3703f7-77d2-4a6f-821b-ef32447f2a25")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return ((fromElement instanceof BusinessRule)) || ((fromElement instanceof Term));
    }

    @objid ("bf652b42-4d50-40c9-975f-d0ebab994beb")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        return BusinessRule.class.isAssignableFrom(fromMetaclass.getJavaInterface())
                                                                || Term.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
