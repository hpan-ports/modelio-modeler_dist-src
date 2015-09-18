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

@objid ("f3738ff0-a464-4d0c-a717-79a83a586334")
public interface IFormFieldType {
    @objid ("159f46f4-d2ea-4d19-bf44-1211437b6255")
    String getName();

//    @objid ("bdd3c47c-e8bd-4a65-b8f1-80c5492d663a")
//    Object getValue(IFormFieldData data);
//    @objid ("ee5eff26-d7f9-491f-963a-532196c80136")
//    void setValue(IFormFieldData data, Object value);
    @objid ("2e735a5f-5483-437c-b1cc-b37712edd19a")
    Object[] getEnumeratedValues();

    @objid ("de96d74d-559a-4665-af4c-becc827bd3da")
    boolean isValidValue(String value);

}
