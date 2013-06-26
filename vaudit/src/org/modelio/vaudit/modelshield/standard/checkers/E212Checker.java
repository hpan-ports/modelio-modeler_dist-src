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
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E212:
 * <ul>
 * <li>desc = A ClassAssociation must be linked to a Class.</li>
 * <li>what = An association class located on the ''{2}'' association is not linked to a class.</li>
 * </ul>
 */
@objid ("008410fc-e20d-1f69-b3fb-001ec947cd2a")
public class E212Checker extends DepCardinalityChecker {
    @objid ("0047f11c-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E212";

    @objid ("005628f4-9e33-1f6c-bf9a-001ec947cd2a")
    private static final String DEPNAME = "ClassPart";

    @objid ("008fed1e-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=ClassAssociation, feature=null
        plan.registerChecker(this, Metamodel.getMClass(ClassAssociation.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=ClassAssociation, feature=ClassPart
        plan.registerChecker(this, Metamodel.getMClass(ClassAssociation.class), TriggerType.Update, DEPNAME);
    }

    @objid ("005636dc-9e33-1f6c-bf9a-001ec947cd2a")
    public E212Checker() {
        super(ERRORID, DEPNAME);
    }

}
