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


package org.modelio.vaudit.modelshield.standard.checkers;

import java.util.Arrays;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vaudit.modelshield.IErrorReport;
import org.modelio.vaudit.modelshield.internal.ModelError;
import org.modelio.vaudit.modelshield.standard.TriggerType;
import org.modelio.vaudit.modelshield.standard.plan.Plan;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmMetamodel;

/**
 * E294;
 * <ul>
 * <li>desc = A stereotype must be applied on compatible elements only.</li>
 * <li>what = The ''{0}'' stereotype applied on the ''{1}'' element is not compatible.</li>
 * </ul>
 * </p>
 */
@objid ("d6365725-1220-480f-92df-53191553e075")
public class E294Checker implements IChecker {
    @objid ("d6380e51-1892-4bc7-be42-75a3658023c8")
    private static final String ERRORID = "E294";

    @objid ("543873ca-3f9c-43c1-a09f-941192365740")
    private static final String DEPNAME = "BaseClassName";

    @objid ("4b27024a-caae-44bd-9a81-3db8b9ebd350")
    private SmMetamodel smMetamodel;

    @objid ("fc206e52-da34-446f-8a9d-1c6cf230f862")
    @Override
    public void register(final Plan plan, SmMetamodel smMetamodel) {
        this.smMetamodel = smMetamodel;
        plan.registerChecker(this, smMetamodel.getMClass(Stereotype.class), TriggerType.Update, DEPNAME);
    }

    @objid ("e00fe1d0-3cd0-41af-a2d3-3e068dde4d86")
    @Override
    public void check(final MObject object, final IErrorReport report) {
        Stereotype stereo = (Stereotype) object;
        
        MClass stereoBase = this.smMetamodel.getMClass(stereo.getBaseClassName());
        
        for (ModelElement el : stereo.getExtendedElement()) {
            MClass cls = el.getMClass();
        
            if (!cls.hasBase(stereoBase)) {
                report.addEntry(new ModelError(ERRORID, object, Arrays.asList(el)));
            }
        }
    }

}
