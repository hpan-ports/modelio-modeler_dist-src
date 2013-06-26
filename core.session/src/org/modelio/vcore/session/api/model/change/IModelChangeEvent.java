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
                                    

package org.modelio.vcore.session.api.model.change;

import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("007fe630-bd79-1f3b-aafd-001ec947cd2a")
public interface IModelChangeEvent {
    @objid ("002a1b1a-d402-1f3b-aafd-001ec947cd2a")
    Set<MObject> getCreationEvents();

    @objid ("002a31e0-d402-1f3b-aafd-001ec947cd2a")
    Set<MObject> getUpdateEvents();

    @objid ("002a457c-d402-1f3b-aafd-001ec947cd2a")
    List<IElementMovedEvent> getMoveEvents();

    @objid ("002a590e-d402-1f3b-aafd-001ec947cd2a")
    List<IElementDeletedEvent> getDeleteEvents();

    /**
     * Test whether the model change event is empty.
     * <p>
     * An empty model change events does not need to be fired.
     * @return <code>true</code> if the model change event is empty.
     */
    @objid ("f2ba2ad3-dfb5-4e07-a719-3c3f9c83c695")
    boolean isEmpty();

}
