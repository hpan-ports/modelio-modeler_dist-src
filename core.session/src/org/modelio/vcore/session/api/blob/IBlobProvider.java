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
                                    

package org.modelio.vcore.session.api.blob;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Related blob provider interface.
 * <p>
 * To be registered on the {@link IBlobSupport}.
 */
@objid ("8fd9c441-c111-4ca2-b395-95b51962b08b")
public interface IBlobProvider {
    /**
     * Get all blobs related to a given model object.
     * <p>
     * Asks all registered blob providers.
     * @param obj a model object
     * @return all related blobs
     */
    @objid ("46e9ce60-ae74-4ed2-9cac-32b0eae1ea86")
    Collection<String> getRelatedBlobs(MObject obj);

}
