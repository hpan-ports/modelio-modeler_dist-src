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
                                    

package org.modelio.property.ui.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.session.api.ICoreSession;

@objid ("8fa56700-c068-11e1-8c0a-002564c97630")
public interface IPropertyPanel {
    @objid ("8fa56701-c068-11e1-8c0a-002564c97630")
    void setInput(ICoreSession session, IMModelServices modelService, IModelioPickingService pickingService, Element element);

    @objid ("8fa56705-c068-11e1-8c0a-002564c97630")
    void stop();

    @objid ("8fa56706-c068-11e1-8c0a-002564c97630")
    void start();

    @objid ("8fa56707-c068-11e1-8c0a-002564c97630")
    void disableGUI();

    @objid ("8fa56708-c068-11e1-8c0a-002564c97630")
    void enableGUI();

    @objid ("8fa56709-c068-11e1-8c0a-002564c97630")
    Composite getComposite();

    /**
     * Refresh the panel from its current input.
     */
    @objid ("8fa5670b-c068-11e1-8c0a-002564c97630")
    void refresh();

}
