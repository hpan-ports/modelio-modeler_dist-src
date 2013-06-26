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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.checkers.generic.DepCardinalityChecker;
import org.modelio.vaudit.modelshield.standard.plan.Plan;

/**
 * E237;
 * <ul>
 * <li>desc = An ExternDocument must have an ExternDocumentType.</li>
 * <li>what = An ExternDocument belonging to the ''{2}'' element does not have an ExternDocumentType.</li>
 * </ul>
 * </p>
 */
@objid ("d9655369-edfe-11e1-9e29-002564c97630")
public class E237Checker extends DepCardinalityChecker {
    @objid ("0982192c-edff-11e1-9e29-002564c97630")
    private static final String ERRORID = "E237";

    @objid ("09821931-edff-11e1-9e29-002564c97630")
    private static final String DEPNAME = "Type";

    @objid ("0937548e-edff-11e1-9e29-002564c97630")
    @Override
    public void register(final Plan plan) {
        // trigger=create, metaclass=Note, feature=null
        plan.registerChecker(this, Metamodel.getMClass(ExternDocument.class), TriggerType.Create, null);
        
        // trigger=create, metaclass=Note, feature=Model
        plan.registerChecker(this, Metamodel.getMClass(ExternDocument.class), TriggerType.Update, DEPNAME);
    }

    @objid ("09375493-edff-11e1-9e29-002564c97630")
    public E237Checker() {
        super(ERRORID, DEPNAME);
    }

}
