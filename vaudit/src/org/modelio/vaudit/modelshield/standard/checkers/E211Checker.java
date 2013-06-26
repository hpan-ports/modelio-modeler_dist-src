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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.vaudit.modelshield.IErrorReport;
import org.modelio.vaudit.modelshield.internal.ModelError;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.plan.Plan;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * E211:
 * <ul>
 * <li>desc = An AssociationEnd must be linked to an Association.</li>
 * <li>what = The ''{0}'' role is not linked to an association.</li>
 * </ul>
 */
@objid ("0082b040-e20d-1f69-b3fb-001ec947cd2a")
public class E211Checker implements IChecker {
    @objid ("0046eb28-6455-1f6c-bf9a-001ec947cd2a")
    private static final String ERRORID = "E211";

    @objid ("00555b68-9e33-1f6c-bf9a-001ec947cd2a")
    private static final String OPPOSITE_DEP = "Opposite";

    @objid ("a5e2c493-19fc-11e2-ad19-002564c97630")
    private static final String TARGET_DEP = "Target";

    @objid ("a5e2c498-19fc-11e2-ad19-002564c97630")
    private static final String SOURCE_DEP = "Source";

    @objid ("ab0ee7d7-19fd-11e2-ad19-002564c97630")
    private static final String NAVIGABILITY_DEP = "Navigability";

    @objid ("008fd27a-e472-1f69-b3fb-001ec947cd2a")
    @Override
    public void register(final Plan plan) {
        plan.registerChecker(this, Metamodel.getMClass(AssociationEnd.class), TriggerType.Create, null);
        
        plan.registerChecker(this, Metamodel.getMClass(AssociationEnd.class), TriggerType.Update, OPPOSITE_DEP);
        plan.registerChecker(this, Metamodel.getMClass(AssociationEnd.class), TriggerType.Update, TARGET_DEP);
        plan.registerChecker(this, Metamodel.getMClass(AssociationEnd.class), TriggerType.Update, SOURCE_DEP);
        plan.registerChecker(this, Metamodel.getMClass(AssociationEnd.class), TriggerType.Update, NAVIGABILITY_DEP);
    }

    @objid ("a5d81623-19fc-11e2-ad19-002564c97630")
    @Override
    public void check(final MObject object, final IErrorReport report) {
        if (object == null) {
            return;
        }
        
        boolean ok = false;
        
        AssociationEnd currentRole = (AssociationEnd) object;
        AssociationEnd oppositeRole = currentRole.getOpposite();
        if (oppositeRole == null) {
            ok = true;
        } else {
            Classifier currentSource = currentRole.getSource();
            Classifier currentTarget = currentRole.getTarget();
            boolean currentNavigability = currentRole.isNavigable();
        
            Classifier oppositeSource = oppositeRole.getSource();
            Classifier oppositeTarget = oppositeRole.getTarget();
            boolean oppositeNavigability = oppositeRole.isNavigable();
        
            if (currentNavigability && !oppositeNavigability) { // THISSIDE
                // only current source and target must be filled
                ok = currentSource != null && currentTarget != null && oppositeSource == null && oppositeTarget == null;
            } else if (!currentNavigability && oppositeNavigability) { //OTHERSIDE:
                // only opposite source and target must be filled
                ok = currentSource == null && currentTarget == null && oppositeSource != null && oppositeTarget != null;
            } else if (currentNavigability && oppositeNavigability) { // BOTHSIDES:
                // current source must be equals to opposite target as well as current target and opposite source
                ok = currentSource != null && currentTarget != null && currentSource.equals(oppositeTarget) && currentTarget.equals(oppositeSource);
            } else if (!currentNavigability && !oppositeNavigability) { 
                // both sources must be filled, but no target
                ok = currentSource != null && currentTarget == null && oppositeSource != null && oppositeTarget == null;
            }
        }
        
        if (!ok) {
            List<Object> objects = new ArrayList<>();
            objects.add(currentRole);
            objects.add(oppositeRole);
            report.addEntry(new ModelError(ERRORID, object, objects));
        }
    }

}
