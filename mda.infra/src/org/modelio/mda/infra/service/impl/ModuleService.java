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


package org.modelio.mda.infra.service.impl;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.modelio.api.module.IMdaExpert;
import org.modelio.app.core.events.ModelioEventTopics;
import org.modelio.gproject.gproject.GProject;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.mda.infra.service.IModuleService;
import org.modelio.mda.infra.service.impl.expert.MdaExpert;

@objid ("20d79b14-097b-4284-814c-874804546ce4")
@Creatable
public class ModuleService implements IModuleService {
    @objid ("2b95d93e-5ea6-4fdf-99eb-46eedcc3634a")
    private MdaExpert mdaExpert;

    @objid ("541d1556-aa19-4af9-afe6-2a9add9dcac5")
    @Override
    public IMdaExpert getMdaExpert() {
        return this.mdaExpert;
    }

    @objid ("b2f92f93-110a-4f9e-8a8f-b00050d6aa8a")
    @Inject
    @Optional
    @SuppressWarnings({ "unused", "javadoc" })
    public void onProjectClosed(@EventTopic(ModelioEventTopics.PROJECT_CLOSED) GProject gProject, IEclipseContext context) {
        // The current project has been closed, remove this instance from the context until another project is opened.
        context.set(IModuleService.class, null);
        this.mdaExpert = null;
    }

    @objid ("078968b2-3821-47c0-ba8d-6a01505866c3")
    @SuppressWarnings("javadoc")
    @Inject
    @Optional
    public void onProjectOpening(@EventTopic(ModelioEventTopics.PROJECT_OPENING) GProject gProject, IEclipseContext context) {
        // A project is being opened, put this instance in the context
        context.set(IModuleService.class, this);
    }

    /**
     * Called by E4 context when the IModuleManagementService is set.
     * @param moduleManagementService the module management service.
     */
    @objid ("30c782a2-9759-42d2-a74a-e5c8d9ab55c1")
    @Inject
    @Optional
    public void onManagerChanged(@Optional IModuleManagementService moduleManagementService) {
        if (moduleManagementService != null) {
            this.mdaExpert = new MdaExpert(moduleManagementService.getModuleRegistry());
        } else {
            this.mdaExpert = null;
        }
    }

}
