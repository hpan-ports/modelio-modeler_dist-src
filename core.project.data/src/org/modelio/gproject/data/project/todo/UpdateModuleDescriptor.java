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


package org.modelio.gproject.data.project.todo;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.plugin.GProjectData;
import org.modelio.gproject.data.project.ModuleDescriptor;

/**
 * Update module action descriptor.
 * @since Modelio 3.4
 */
@objid ("214917d8-42fd-4de9-8e0c-4c5fa9b2f955")
public class UpdateModuleDescriptor extends TodoActionDescriptor {
    @objid ("7bb78d6a-db00-4325-914c-23095d2f5fe1")
    private String oldModuleName;

    @objid ("901b05c8-a3e7-43ca-84ef-3f4990b9c4bc")
    private ModuleDescriptor newDescriptor;

    @objid ("d1184e9d-3e10-4e12-8405-38fddeb3a843")
    @Override
    public String getLocalizedLabel() {
        return GProjectData.getMessage("TodoDescriptor.update",
                        this.oldModuleName,
                        this.newDescriptor.getName(),
                        this.newDescriptor.getVersion(),
                        this.newDescriptor.getArchiveLocation());
    }

    @objid ("00e3dda7-3dfa-4454-b22b-f7e7689e3b91")
    public ModuleDescriptor getNewModuleDescriptor() {
        return this.newDescriptor;
    }

    @objid ("54fd7622-be89-4687-a6c2-ba597d7ba3fb")
    public String getOldModuleName() {
        return this.oldModuleName;
    }

    @objid ("897c3a41-b8eb-499d-aa86-5e7845ae99d6")
    public void setNewModuleDescriptor(ModuleDescriptor descriptor) {
        this.newDescriptor = descriptor;
    }

    @objid ("e56cfb08-a0ab-473e-8708-290c5b2da848")
    public void setOldModuleName(String moduleName) {
        this.oldModuleName = moduleName;
    }

}
