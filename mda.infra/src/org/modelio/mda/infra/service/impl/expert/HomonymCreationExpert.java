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

@objid ("bd58ce36-86de-43d8-ae95-62bbbf03d8ad")
class HomonymCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("cbfc138c-0c3b-46fd-8bc9-03bc6704d02f")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        return (fromElement instanceof Term) && (toElement instanceof Term);
    }

    @objid ("db9cce4c-637d-4f19-bdc0-595a41b294b5")
    @Override
    public boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        return canSource(linkStereotype, linkMetaclass, fromMetaclass) && Term.class.isAssignableFrom(toJmc);
    }

    @objid ("cb90dfc3-f46c-4de6-ad09-1d18ad81997a")
    @Override
    public boolean canSource(Stereotype linkStereotype, MObject linkElement, final MObject fromElement) {
        return (fromElement instanceof Term);
    }

    @objid ("30c567fa-d7a7-4a8b-83b8-c9da25a1e5d8")
    @Override
    public boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        return Term.class.isAssignableFrom(fromJmc);
    }

}
