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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.analyst;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("aa1f77bc-363d-4465-9e29-86a8376046e2")
public interface AnalystElement extends AnalystItem {
    @objid ("88f405d2-6b32-425e-988e-9786eaa889c0")
    AnalystPropertyTable getDefaultProperties();

    @objid ("733b981a-c1b0-4ddf-8156-59a46d1863da")
    int getVersion();

    @objid ("f1935c38-298a-4f9a-b490-c4e0054216d1")
    void setVersion(int value);

    /**
     * Get archived versions of this element.
     * @return archived versions of this element.
     */
    @objid ("7b4850f1-d695-4f94-b18e-beb988fcec5a")
    EList<? extends AnalystElement> getArchivedVersions();

    /**
     * Get the version this element archive is originated from.
     * <p>
     * Returns <i>null</i> if this element is the most recent version.
     * @return the last version of this element archive.
     */
    @objid ("e76eb14a-27aa-4e63-86a3-87bf310a359c")
    AnalystElement getLastVersion();

}
