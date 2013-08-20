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
                                    

package org.modelio.vaudit.nsuse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystemException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.services.statusreporter.StatusReporter;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.progress.ModelioProgressAdapter;
import org.modelio.gproject.gproject.GProject;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.ui.progress.IModelioProgressService;
import org.modelio.vaudit.plugin.Vaudit;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositorySupport;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Initialize the namespace uses (blue links) on a project.
 * <p>
 * <li> Creates the namespace uses repository if needed
 * <li> connect the repository to the project
 * <li> Rebuild all namespace uses if needed
 * <li> Register the namespace uses  builder
 */
@objid ("af00fa47-7f7d-4fa8-bd77-007df07af7fc")
public class NSUseInitializer {
    @objid ("55b2a594-c2f2-4496-afa8-26c48065acfe")
     IModelioProgressService progressService;

    @objid ("d7bb67a6-3398-4f98-8e1c-e1f29eabf3b0")
    private GProject openedProject;

    @objid ("22ef66f1-62ba-491d-beb9-06b8de8f6b8e")
     StatusReporter statusReporter;

    @objid ("98e94cf4-1be6-48b2-b2fd-9d93bb81881c")
     ICoreSession coreSession;

    /**
     * Initialize the namespace uses (blue links) on a project.
     * @param openedProject the project
     * @param statusReporter to report errors and warnings
     * @param progressService a progress monitor to report initial blue links building if needed.
     */
    @objid ("5de1b7bc-ae01-4d8b-aa33-e2c0b111fd81")
    public NSUseInitializer(final GProject openedProject, StatusReporter statusReporter, IModelioProgressService progressService) {
        this.openedProject = openedProject;
        this.statusReporter = statusReporter;
        this.progressService = progressService;
        this.coreSession = this.openedProject.getSession();
    }

    /**
     * Initialize the namespace uses (blue links) on a project.
     */
    @objid ("9d40d136-f679-4ca7-934e-63ce18502d3b")
    public void init() {
        IRepository nsUseRepo = this.coreSession.getRepositorySupport().getRepository(IRepositorySupport.REPOSITORY_KEY_LOCAL);
        
        if (nsUseRepo != null) {
            //TODO : This may take too much time time, find another way 
            boolean needRebuild = nsUseRepo.findByClass(SmClass.getClass(NamespaceUse.class)).isEmpty();
            
            NSUseUpdater nsUseUpdater = new NSUseUpdater(this.coreSession, nsUseRepo);
            
            // Rebuild blue links if needed
            if (needRebuild) {
                if (!buildNsUses( nsUseUpdater))
                    nsUseUpdater = null;
            }
            
            if (nsUseUpdater != null) {
                // Register the namespace uses (blue links) builder
                this.coreSession.getTransactionSupport().setClosureHandler(nsUseUpdater);
            } 
        }
    }

    @objid ("b8f5434c-40f4-4fd1-88c1-249d0df3fdf2")
    void showStatus(final int severity, final String message, final Throwable exception, final Object... information) {
        Display.getDefault().syncExec(new Runnable() {
            
            @Override
            public void run() {
                NSUseInitializer.this.statusReporter.show(severity, message, exception, information);
            }
        });
    }

    @objid ("ca2fa9db-013a-4c7b-bb05-2f069bdf2554")
    static String getMsg(IOException e) {
        if (e instanceof FileSystemException)
            return FileUtils.getLocalizedMessage((FileSystemException) e);
        else
            return e.getLocalizedMessage();
    }

    @objid ("78220fcf-457b-4d76-ab71-cf0bfbb76c75")
    private boolean buildNsUses(final NSUseUpdater nsUseUpdater) {
        final String title = Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll");
        
        final IRunnableWithProgress runnable = new IRunnableWithProgress() {
            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                try (ITransaction t = NSUseInitializer.this.coreSession.getTransactionSupport().createTransaction(title)){
        
                    nsUseUpdater.rebuildAll(new ModelioProgressAdapter(monitor));
                    t.commit();
                } catch (IOException e) {
                    throw new InvocationTargetException(e, getMsg(e));
                } 
            }
        };
        
        
        final boolean[] ret = new boolean[]{false};
        
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
        
                    NSUseInitializer.this.progressService.run(title , true, true, runnable);
                    ret [0] = true;
                } catch (InterruptedException e) {
                    String msg = Vaudit.I18N.getMessage("ModelShield.NSUseBuildCanceled"); 
                    String msg2 = Vaudit.I18N.getMessage("ModelShield.NSUseBuildCanceled.2");
                    NSUseInitializer.this.statusReporter.show(StatusReporter.WARNING, msg, null, msg2);
                } catch (InvocationTargetException e) {
                    String msg = Vaudit.I18N.getMessage("ModelShield.NSUseBuildFailed"); 
                    String msg2 = Vaudit.I18N.getMessage("ModelShield.NSUseBuildCanceled.2");
                    NSUseInitializer.this.statusReporter.show(StatusReporter.WARNING, msg, e.getCause(), msg2);
                }
            }});
        return ret[0];
    }

}
