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


package org.modelio.diagram.browser.handlers;

import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.modelio.diagram.browser.model.bycontext.ByCtxModel;
import org.modelio.diagram.browser.model.byset.BySetModel;
import org.modelio.diagram.browser.model.bytype.ByTypeModel;
import org.modelio.diagram.browser.model.flat.FlatModel;
import org.modelio.diagram.browser.view.DiagramBrowserView;

@objid ("001beb12-0d4f-10c6-842f-001ec947cd2a")
public class SwitchBrowserType {
    @objid ("001c147a-0d4f-10c6-842f-001ec947cd2a")
    @Execute
    public Object execute(MPart part, @Optional @Named("type") final String type) {
        final DiagramBrowserView browserView = (DiagramBrowserView) part.getObject();
        
        if ("flat".equals(type)) {
            browserView.getComposite().switchBrowserModel(new FlatModel());
        } else if ("byType".equals(type)) {
            browserView.getComposite().switchBrowserModel(new ByTypeModel());
        } else if ("user".equals(type)) {
            browserView.getComposite().switchBrowserModel(new BySetModel());
        } else if ("context".equals(type)) {
            browserView.getComposite().switchBrowserModel(new ByCtxModel());
        }
        return null;
    }

    @objid ("b71312ed-ed8f-4a47-ae6d-34f133c99a2f")
    @CanExecute
    public boolean isEnabled(MPart part) {
        final DiagramBrowserView browserView = (DiagramBrowserView) part.getObject();
        return browserView.getComposite() != null;
    }

}
