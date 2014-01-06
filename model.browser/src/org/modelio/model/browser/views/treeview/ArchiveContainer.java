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
                                    

package org.modelio.model.browser.views.treeview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Browser node that contain archived element versions.
 */
@objid ("befbc2f1-f796-4bf2-861f-e9421c654427")
public class ArchiveContainer {
    @objid ("f4185657-f12a-4542-bae6-166c67656266")
    private MObject element;

    @objid ("da7fe16c-d8cf-48ff-8abd-2edfed301ab7")
    private int nbVersions;

    /**
     * C'tor
     * @param element the related model object
     * @param nbLinks count of archived version
     */
    @objid ("4e96dbf4-66d0-4b61-8127-336bd227a687")
    public ArchiveContainer(MObject element, int nbLinks) {
        this.element = element;
        this.nbVersions = nbLinks;
    }

    /**
     * @return the related model object
     */
    @objid ("d8ef3cf6-fd22-4d1c-9719-3f516a94fb91")
    public MObject getElement() {
        return this.element;
    }

    /**
     * @return the archived versions count
     */
    @objid ("ffd14169-98d1-4d65-9d39-9d6e4ddc4c55")
    public int getNbVersions() {
        return this.nbVersions;
    }

}
