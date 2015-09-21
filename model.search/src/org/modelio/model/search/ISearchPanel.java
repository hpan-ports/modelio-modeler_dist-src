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


package org.modelio.model.search;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.modelio.model.search.engine.ISearchCriteria;
import org.modelio.vcore.session.api.ICoreSession;

@objid ("16bc12ac-743a-45b9-807c-45cb8f11b451")
public interface ISearchPanel {
    @objid ("05f2d7ad-ad74-4769-9e48-d86ab0748f2d")
    Control getControl();

    @objid ("ba2d417d-52d5-4d0f-bb98-f66af88f8346")
    ISearchCriteria getCriteria();

    @objid ("059b4f8b-a568-4dcb-8728-ca53d371d696")
    void setCriteria(ISearchCriteria criteria);

    @objid ("2d506cad-7266-42e6-befa-7dcbc18f5d1d")
    void initialize(Composite parent, ICoreSession session, ISearchController controller);

}
