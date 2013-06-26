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
                                    

package org.modelio.xmi.gui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.ReverseProperties;
import org.modelio.xmi.util.XMILogs;

/**
 * XMI thread.
 * This abstract class define the common structure of four XMI threads
 * @author ebrosse
 */
@objid ("1a197b75-5fd0-4679-a777-7537a7cb57cd")
public abstract class XMIThread extends Thread {
    @objid ("5b773992-0ee7-4aa6-90e8-315176ab2c24")
    private String description = "";

    @objid ("8342e20e-bb82-4759-b213-f7ab6438ad82")
    private String title = "";

    @objid ("a010ffa6-d32e-4f6e-a1b7-226453b4de45")
    protected boolean error = false;

    @objid ("65eaad00-d4a0-47b2-89d8-68446938dd44")
    protected ProgressBarComposite progressBar = null;

    @objid ("fdc18fea-a470-47db-9f3a-6299487f4452")
    protected Shell shell = null;

    @objid ("824fa4f6-c609-4be4-8398-4b30fc9c7875")
    protected void cancelation() {
        SwtWizardWindow.setCancellation(false);
    }

    @objid ("5b3a999a-1416-443c-9ff0-4dc971e6fbcb")
    @Override
    public void interrupt() {
        super.interrupt();
        ReverseProperties.getInstance().setRollback(true);
    }

}
