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

import java.io.IOException;
import java.net.URI;
import java.nio.file.AccessDeniedException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.auth.AuthDataDialog;
import org.modelio.core.ui.progress.ModelioProgressAdapter;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectAuthenticationException;
import org.modelio.gproject.gproject.GProjectConfigurer;
import org.modelio.gproject.gproject.TodoActionsRunner;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.UserPasswordAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.SubProgress;

/**
 * <p>Service class that synchronize a {@link GProject} against its remote configuration.</p>
 * 
 * <p>Installs, upgrade or remove modules and fragments when needed.</p>
 * 
 * <p>Usage:</p>
 * 
 * <ul>
 * <li>allocate with {@link #ProjectSynchronizer(GProject, IModuleManagementService)}</li>
 * <li>run with {@link #synchronize(IProgressMonitor)}</li>
 * <li>if no exception, call {@link #getFailures()} to display potential problems (if any) to the user.</li>
 * </ul>
 */
@objid ("7b94b9c5-be61-4e61-90e9-16be4c6e853d")
public class ProjectSynchronizer extends GProjectConfigurer {
    @objid ("ef392239-de66-4338-9a57-a8669c2bf71c")
    private TodoRunner todoRunner;

    /**
     * Initialize the project configurer.
     * @param project the project to synchronize
     * @param moduleService the module service used to install and remove modules.
     */
    @objid ("7bb1e59a-4a10-4959-b242-8c1566bf63e5")
    public ProjectSynchronizer(GProject project, IModuleManagementService moduleService) {
        super(project);
        this.todoRunner = new TodoRunner(project, moduleService);
    }

    /**
     * Synchronize the project against its configuration.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return <code>true</code> if the configuration was changed, <code>false</code> if no change was made.
     * @throws java.io.IOException if the project descriptor couldn't be read.
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException in case of authentication failure
     */
    @objid ("ebef6208-8ac1-4509-ae96-78b8755d4e6f")
    public boolean synchronize(IProgressMonitor monitor) throws GProjectAuthenticationException, IOException {
        SubProgress mon = ModelioProgressAdapter.convert(monitor, 20);
        boolean ret = synchronize(mon.newChild(10));
        
        if (ret) {
            this.todoRunner.execute(mon.newChild(10));
        
            for (TodoActionsRunner.Failure todoFail : this.todoRunner.getFailures()) {
                Failure f = new Failure(todoFail.getAction().getLocalizedLabel(), todoFail.getError());
                getFailures().add(f);
            }
        }
        return ret;
    }

    @objid ("052717f3-d042-4c0f-a3a8-2556514a84e2")
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
