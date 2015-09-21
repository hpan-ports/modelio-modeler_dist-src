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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.analyst;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;

/**
 * AnalystElement v0.0.9054
 * 
 * 
 * Analyst element that is not a container.
 */
@objid ("aa1f77bc-363d-4465-9e29-86a8376046e2")
public interface AnalystElement extends AnalystItem {
    @objid ("40502ac5-9277-491d-b251-5c31621fcf27")
    public static final String MNAME = "AnalystElement";

    @objid ("88f405d2-6b32-425e-988e-9786eaa889c0")
    AnalystPropertyTable getDefaultProperties();

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

    /**
     * Getter for attribute 'AnalystElement.Version'
     * 
     * Metamodel description:
     * <i>Version of the analyst element.
     * 
     * An analyst element may contain previous versions</i>
     */
    @objid ("8e086abb-3cb4-4776-815d-f3da258805de")
    int getVersion();

    /**
     * Setter for attribute 'AnalystElement.Version'
     * 
     * Metamodel description:
     * <i>Version of the analyst element.
     * 
     * An analyst element may contain previous versions</i>
     */
    @objid ("015fbdc1-5f28-4ee6-a66c-074d16d2927b")
    void setVersion(int value);

}
