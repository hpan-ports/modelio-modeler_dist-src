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
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E224:
 * <ul>
 * <li>desc = A LocalTaggedValue must have a TagType.</li>
 * <li>what = A local tagged value belonging to the ''{2}'' element does not have a tagged value type.</li>
 * </ul>
 */
@objid ("008eb066-e20d-1f69-b3fb-001ec947cd2a")
public class E224Checker extends DepCardinalityChecker {
    @objid ("004f4d4a-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E224";

    @objid ("005b59c8-9e33-1f6c-bf9a-001ec947cd2a")
    private static final String DEPNAME = "LocalDefinition";

    @objid ("0090aa10-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=LocalTaggedValue, feature=null
        plan.registerChecker(this, Metamodel.getMClass(LocalTaggedValue.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=LocalTaggedValue, feature=LocalDefinition
        plan.registerChecker(this, Metamodel.getMClass(LocalTaggedValue.class), TriggerType.Update, DEPNAME);
    }

    @objid ("005b6616-9e33-1f6c-bf9a-001ec947cd2a")
    public E224Checker() {
        super(ERRORID, DEPNAME);
    }

}
