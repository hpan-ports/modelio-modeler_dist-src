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
                                    

package org.modelio.core.ui.ktable.types.textlist;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dca8c5c-c068-11e1-8c0a-002564c97630")
class StringAdapter {
    @objid ("a4d73e71-c068-11e1-8c0a-002564c97630")
    private String value;

    @objid ("8dca8c5e-c068-11e1-8c0a-002564c97630")
    public StringAdapter(String value) {
        super();
        this.setValue(value);
    }

    @objid ("8dca8c61-c068-11e1-8c0a-002564c97630")
    public String getValue() {
        return this.value;
    }

    @objid ("8dca8c65-c068-11e1-8c0a-002564c97630")
    public void setValue(String value) {
        this.value = value;
    }

}
