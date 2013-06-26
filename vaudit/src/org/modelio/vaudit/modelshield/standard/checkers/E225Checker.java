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
                                    

package org.modelio.vaudit.modelshield.standard.checkers;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E225:
 * <ul>
 * <li>desc = A Note must have a NoteType.</li>
 * <li>what = A note belonging to the ''{2}'' element does not have a note type.</li>
 * </ul>
 */
@objid ("0090621c-e20d-1f69-b3fb-001ec947cd2a")
public class E225Checker extends DepCardinalityChecker {
    @objid ("00507544-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E225";

    @objid ("005bfc0c-9e33-1f6c-bf9a-001ec947cd2a")
    private static final String DEPNAME = "Model";

    @objid ("0090c4be-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=Note, feature=null
        plan.registerChecker(this, Metamodel.getMClass(Note.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=Note, feature=Model
        plan.registerChecker(this, Metamodel.getMClass(Note.class), TriggerType.Update, DEPNAME);
    }

    @objid ("005c059e-9e33-1f6c-bf9a-001ec947cd2a")
    public E225Checker() {
        super(ERRORID, DEPNAME);
    }

}
