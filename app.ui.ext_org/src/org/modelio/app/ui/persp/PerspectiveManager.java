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
                                    

package org.modelio.app.ui.persp;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.modelio.app.ui.persp.AbstractModelioUiService;
import org.osgi.service.event.EventHandler;

@objid ("8c71273a-9f27-4da1-9262-50cc3dccfc54")
@Creatable
public class PerspectiveManager extends AbstractModelioUiService implements EventHandler {
    @objid ("b86f07dd-4578-4bc3-b516-f5affdb5a47b")
    @Override
    protected boolean beforePerspectiveSwitch(MPerspective current, MPerspective next) {
        // nothing to do yet
        return true;
    }

    @objid ("296f39df-3000-47b6-a532-b2f62adb8fcc")
    @Override
    protected void afterPerspectiveSwitch(MPerspective old, MPerspective current) {
        // nothing to do yet
    }

}
