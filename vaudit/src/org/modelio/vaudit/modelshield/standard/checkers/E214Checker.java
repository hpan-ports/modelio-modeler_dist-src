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
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E214:
 * <ul>
 * <li>desc = A Generalization must be linked to a NameSpace.</li>
 * <li>what = A generalization belonging to ''{2}'' is not linked to a name space.</li>
 * </ul>
 */
@objid ("00873b7e-e20d-1f69-b3fb-001ec947cd2a")
public class E214Checker extends DepCardinalityChecker {
    @objid ("0049eb8e-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E214";

    @objid ("0051bb7a-8f92-1f6c-bf9a-001ec947cd2a")
    private static final String DEPNAME = "SuperType";

    @objid ("00902270-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=Generalization, feature=null
        plan.registerChecker(this, Metamodel.getMClass(Generalization.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=Generalization, feature=SuperType
        plan.registerChecker(this, Metamodel.getMClass(Generalization.class), TriggerType.Update, DEPNAME);
    }

    @objid ("0051cf02-8f92-1f6c-bf9a-001ec947cd2a")
    public E214Checker() {
        super(ERRORID, DEPNAME);
    }

}
