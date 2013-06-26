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
                                    

package org.modelio.audit.service;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.audit.engine.AuditEngine;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1e542651-7add-4b30-b9c4-ae3ead393965")
public interface IAuditService {
    @objid ("b84226bc-922b-4028-8f97-eeb0ee014bd6")
    void changeConfigurationPlan(File confFile);

    @objid ("f5d71c3b-f36d-4ccb-b677-b35c9306702a")
    File getConfigurationPlan();

    @objid ("43b57340-a04d-444f-a456-908d85a77193")
    void restart();

    @objid ("9a8f5fc1-ee1d-4670-b9b3-4df83b06f132")
    void checkElement(MObject e, String jobId);

    @objid ("dd8c293a-2b08-47e8-8776-3c9c51562802")
    AuditEngine getAuditEngine();

}
