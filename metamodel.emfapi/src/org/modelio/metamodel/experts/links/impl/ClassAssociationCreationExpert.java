/*
 * Copyright 2013 Modeliosoft
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
                                    

package org.modelio.metamodel.experts.links.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link ClassAssociation}.
 * <p>
 * ClassAssociation must go from an Association to a Classifier. The Class must not be one of the Association ends.
 */
@objid ("7e99a2e8-1eb2-11e2-8009-002564c97630")
public class ClassAssociationCreationExpert extends DefaultLinkExpert {
    @objid ("7e99a2ed-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MClass link, final MClass fromMetaclass) {
        return AssociationEnd.class.isAssignableFrom(Metamodel.getJavaInterface(fromMetaclass)) ||  NaryAssociation.class.isAssignableFrom(Metamodel.getJavaInterface(fromMetaclass));
    }

    @objid ("7e9c03f8-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MObject from, final MObject owner) {
        return (from instanceof AssociationEnd) || (from instanceof NaryAssociation);
    }

    @objid ("7e9c0401-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MObject link, final MObject from, final MObject to, final MObject owner) {
        // ClassAssociation must go from an Association to a Classifier.
        if (!(from instanceof AssociationEnd) && !(from instanceof NaryAssociation)) {
            return false;
        }
        if (!(to instanceof Class)) {
            return false;
        }
        return true;
    }

}
