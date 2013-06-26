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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("008180d0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnReceiveTask extends BpmnTask {
    @objid ("8d77fd65-0bf9-4c3b-96ca-e01c62fb717e")
    String getImplementation();

    @objid ("478d719f-b3ea-4cb9-902f-e595a151bcb7")
    void setImplementation(String value);

    @objid ("20e6518a-f3a3-486f-a403-28eca8a72317")
    boolean isInstanciate();

    @objid ("30c55bcd-ee2f-42fd-8a8f-d5ad7cb7fa66")
    void setInstanciate(boolean value);

    @objid ("e42492ac-7acf-4191-a22f-51a9f35c9f35")
    BpmnMessage getMessageRef();

    @objid ("6dd9db94-ee60-4533-955e-264409238841")
    void setMessageRef(BpmnMessage value);

    @objid ("f5beeee0-014e-4f45-a38c-d5b4eddc1605")
    BpmnOperation getOperationRef();

    @objid ("f245b8d4-b569-4c67-aaeb-80ff101730a4")
    void setOperationRef(BpmnOperation value);

    @objid ("e07a8a3c-4bc2-47cb-a402-d36847c74af5")
    Operation getCalledOperation();

    @objid ("7247c3af-d157-4ebc-aedb-f3789be29ded")
    void setCalledOperation(Operation value);

}
