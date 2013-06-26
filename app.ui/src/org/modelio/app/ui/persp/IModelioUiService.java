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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

@objid ("b3660045-1abe-4813-9df4-b2b1d0cc5ddc")
public interface IModelioUiService {
    /**
     * Switch to the 'p' perspective. Note that switching to a perspective will
     * force showWelcome(false). If 'p' is null, a 'default' perspective is
     * guessed based on current application status, and set.
     * @param p
     */
    @objid ("52f38234-3817-4d98-ba3a-7e1ff71c4fbb")
    void switchToPerspective(MPerspective p);

    /**
     * Get the <i>workspace</i> perspectives. Workspace perspectives are those
     * perspectives having the tag 'workspace'. Typically there is only one
     * workspace pesrpective. Should there be several ones, the caller is
     * responsible for deciding which one is relevant for him.
     * @return
     */
    @objid ("11175bd6-09a6-4a51-90dc-5c249678b7fe")
    List<MPerspective> getWorkspacePerspectives();

    /**
     * Get the <i>project</i> perspectives. Workspace perspectives are those
     * perspectives having the tag 'project'. Typically there is only one
     * workspace perspective. Should there be several ones, the caller is
     * responsible for deciding which one is relevant for him.
     * @return
     */
    @objid ("247ed446-e064-4020-896a-d91fb6c7bb5f")
    List<MPerspective> getProjectPerspectives();

    /**
     * Show/Hide the welcome view. When the welcome view is shown, the
     * application main perspective stack is hidden otherwise it is made
     * visible.
     * @param onOff
     */
    @objid ("dca3dc06-10b2-4790-b107-155e75ff9ba7")
    void showWelcome(boolean onOff);

    /**
     * @return the PerspectiveStack holding the application perspectives
     */
    @objid ("8e714506-f5e1-47cc-9a33-1229de2aa383")
    MPerspectiveStack getPerspectiveStack();

    /**
     * @return the PartStack holding the welcome view(s)
     */
    @objid ("707e147f-62a4-41c5-a8dd-e6068bb263ea")
    MPartStack getWelcomeStack();

}
