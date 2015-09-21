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


package org.modelio.gproject.model.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.api.auth.AuthTool;
import org.modelio.gproject.model.api.auth.IAuthTool;
import org.modelio.gproject.model.api.model.IModelTool;
import org.modelio.gproject.model.api.model.ModelTool;

// isShell = false isRamc = false
@objid ("00193be2-d357-1097-bcec-001ec947cd2a")
public class MTools {
    @objid ("0059844a-d3c9-1097-bcec-001ec947cd2a")
    public static IModelTool getModelTool() {
        return new ModelTool();
    }

    @objid ("00599f98-d3c9-1097-bcec-001ec947cd2a")
    public static IAuthTool getAuthTool() {
        return new AuthTool();
    }

}
