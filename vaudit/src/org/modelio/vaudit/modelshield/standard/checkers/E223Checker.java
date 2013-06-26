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
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E223:
 * <ul>
 * <li>desc = A LocalNote must have a NoteType.</li>
 * <li>what = A local note belonging to the ''{2}'' element does not have a note type.</li>
 * </ul>
 */
@objid ("008d4e6a-e20d-1f69-b3fb-001ec947cd2a")
public class E223Checker extends DepCardinalityChecker {
    @objid ("004e4ef4-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E223";

    @objid ("005a8c1e-9e33-1f6c-bf9a-001ec947cd2a")
    private static final String DEPNAME = "LocalModel";

    @objid ("00908fa8-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=LocalNote, feature=null
        plan.registerChecker(this, Metamodel.getMClass(LocalNote.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=LocalNote, feature=LocalModel
        plan.registerChecker(this, Metamodel.getMClass(LocalNote.class), TriggerType.Update, DEPNAME);
    }

    @objid ("005a9aba-9e33-1f6c-bf9a-001ec947cd2a")
    public E223Checker() {
        super(ERRORID, DEPNAME);
    }

}
