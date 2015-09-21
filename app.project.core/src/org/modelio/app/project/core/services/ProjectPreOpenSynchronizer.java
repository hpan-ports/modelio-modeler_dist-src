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


package org.modelio.app.project.core.services;

import java.net.URI;
import java.nio.file.AccessDeniedException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.auth.AuthDataDialog;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectConfigurer;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.UserPasswordAuthData;
import org.modelio.vbasic.files.FileUtils;

/**
 * <p>Service class that synchronize a {@link GProject} against its remote configuration
 * before everything is mount.</p>
 * 
 * <p>Postpone modules installs, upgrade or removals to the module service start.</p>
 * 
 * <p>Usage:</p>
 * 
 * <ul>
 * <li>allocate with {@link #ProjectPreOpenSynchronizer(GProject)}</li>
 * <li>run with {@link #synchronize(IProgressMonitor)}</li>
 * <li>if no exception, call {@link #getFailures()} to display potential problems (if any) to the user.</li>
 * </ul>
 */
@objid ("760c0904-48a0-4279-84a4-fe25bb273281")
class ProjectPreOpenSynchronizer extends GProjectConfigurer {
    @objid ("90b56225-55f2-43aa-a81b-8ac7a2053f15")
    public ProjectPreOpenSynchronizer(GProject project) {
        super(project);
    }

    @objid ("5ffa8dce-755a-4a8c-874c-89887ef2e3fd")
    @Override
    protected IAuthData handleAccessDeniedException(String toAuthenticate, URI uri, IAuthData badData, AccessDeniedException e) {
        final IAuthData ret[] = new IAuthData[]{null} ;
        
        Display.getDefault().syncExec( () -> {
            IAuthData initialData = badData!=null ? badData : new UserPasswordAuthData();
            AuthDataDialog dlg = new AuthDataDialog(  Display.getCurrent().getActiveShell(), initialData, toAuthenticate+" @ "+uri.getHost());
            dlg.setWarningMessage(FileUtils.getLocalizedMessage(e));
            if (dlg.open() == 0) {
                ret[0] = dlg.getAuthData();
            }
        } );
        return ret[0];
    }

}
