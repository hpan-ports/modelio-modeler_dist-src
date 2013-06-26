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
                                    

package org.modelio.vaudit.modelshield.standard.checkers.generic;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vaudit.modelshield.IErrorReport;
import org.modelio.vaudit.modelshield.internal.ModelError;
import org.modelio.vaudit.modelshield.standard.checkers.IChecker;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001c12b8-7ea0-1f6c-bf9a-001ec947cd2a")
public abstract class DepCardinalityChecker implements IChecker {
    @objid ("006eb8c4-7f46-1f6c-bf9a-001ec947cd2a")
    private final String errorId;

    @objid ("006ed55c-7f46-1f6c-bf9a-001ec947cd2a")
    private final String depName;

    @objid ("74b0d66c-28e7-11e2-a571-001ec947ccaf")
    private MDependency dep;

    @objid ("006f05ea-7f46-1f6c-bf9a-001ec947cd2a")
    @Override
    public void check(final MObject object, final IErrorReport report) {
        if (object == null)
            return;
        
        if (this.dep==null)
            this.dep = object.getMClass().getDependency(this.depName);
        
        if (this.dep == null || ((SmDependency)this.dep).isDynamic())
            return;
        
        int currentCard = object.mGet(this.dep).size();
        
        if (currentCard < this.dep.getMinCardinality() 
                || ((this.dep.getMaxCardinality() > 0) && (currentCard > this.dep.getMaxCardinality()))) {
            List<Object> objects = new ArrayList<>();
            objects.add(this.dep.getName());
            objects.add(this.dep.getMinCardinality());
            objects.add(this.dep.getMaxCardinality());
            objects.add(currentCard);
        
            report.addEntry(new ModelError(this.errorId, object, objects));
        }
    }

    @objid ("0071f48a-80c8-1f6c-bf9a-001ec947cd2a")
    public DepCardinalityChecker(final String errorId, final String depName) {
        this.errorId = errorId;
        this.depName = depName;
    }

}
