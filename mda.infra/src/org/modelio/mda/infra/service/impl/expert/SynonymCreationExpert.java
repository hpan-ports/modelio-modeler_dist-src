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

@objid ("aaf075ce-ba35-4a2c-9c0e-ea5c2f7dbbfe")
class SynonymCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("246a13d0-9eb1-42d2-a4a0-3f1ba5b8a848")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("e783aed8-c063-4b51-b056-976b66e38c62")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Term.class.isAssignableFrom(toMetaclass.getJavaInterface());
    }

    @objid ("00cbec27-72ad-4bc4-ab94-57766d21ae1f")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("558914e4-ec2d-4207-8906-18e3db2dcf37")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        return Term.class.isAssignableFrom(fromMetaclass.getJavaInterface());
    }

}
