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
                                    

package org.modelio.vstore.exml.local.loader.sax;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Hook on the data model that can alter the content of a loaded dependency.
 */
@objid ("e26997d5-4065-11e2-87cb-001ec947ccaf")
public interface IDependencyContentHook {
    /**
     * get the content of a given model dependency.
     * <p>
     * Can modify the content of the dependency.
     * @param obj the loading model object
     * @param dep the dependency being loaded.
     * @return the read dependency content.
     */
    @objid ("ddfaf33d-407a-11e2-87cb-001ec947ccaf")
    List<SmObjectImpl> getContent(SmObjectImpl obj, SmDependency dep);

}
