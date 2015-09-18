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
                                    

package org.modelio.core.ui.form.models;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * IFormFieldData
 * 
 * 
 * @author phv
 */
@objid ("63ac89f3-b4b8-4bce-b494-00058e1f5e69")
public interface IFormFieldData {
    @objid ("f7f6c675-e4ca-443a-8109-16678f77fdbe")
    void setValue(Object value);

    @objid ("b45ca581-70d4-499f-bb40-626396c13dcc")
    Object getValue();

    @objid ("631387ee-eb55-4acf-8566-e504921739c5")
    String getName();

    @objid ("cb3ae858-aeb2-43eb-9440-30edcaac06e1")
    IFormFieldType getType();

    @objid ("463e69d8-0a43-4337-b290-54bafeaba41b")
    void setValue(String value);

    @objid ("23eefed1-ef2c-43f3-a2ea-d214dbf25cb3")
    String getValueAsString();

}
