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
                                    

package org.modelio.mda.infra.service.dynamic;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("531fe01c-3df1-4b76-b5eb-98871727c52c")
public class GenericScope {
    @objid ("a7e46b58-f559-4b49-998e-59b8b21aff29")
    protected String metaclass;

    @objid ("93a5fe52-f112-45dd-8252-1b547d847124")
    protected String stereotype;

    @objid ("93e9c3b0-d043-4085-a85d-e24cc4cf382d")
    public GenericScope(String metaclass, String stereotype) {
        this.metaclass = metaclass;
        this.stereotype = stereotype;
    }

    @objid ("08c4d896-a27c-431d-9d00-28b92aa645f5")
    public String getMetaclass() {
        return this.metaclass;
    }

    @objid ("79cc0744-fa76-4361-9509-c9f40769482b")
    public String getStereotype() {
        return this.stereotype;
    }

}
