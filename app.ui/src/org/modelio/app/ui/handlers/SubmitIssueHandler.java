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
                                    

package org.modelio.app.ui.handlers;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.program.Program;
import org.modelio.app.ui.plugin.AppUi;

@objid ("7a782685-0770-4fce-83fc-a424f961a17d")
public class SubmitIssueHandler {
    @objid ("42f9e782-0d49-4ae8-93b8-94cb3bfddb8f")
    @Execute
    public void execute() {
        String href = AppUi.I18N.getString("SubmitIssue.site");
        try {
            Program.launch(href);
        } catch (IllegalArgumentException e) {
            AppUi.LOG.error(e);
        }
    }

    @objid ("5c02683c-0178-490d-bbed-072b594aea3f")
    @CanExecute
    boolean canExecute() {
        return true;
    }

}
