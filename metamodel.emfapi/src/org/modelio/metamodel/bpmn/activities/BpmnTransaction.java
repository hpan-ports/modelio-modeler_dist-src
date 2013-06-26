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
import org.modelio.metamodel.bpmn.activities.TransactionMethod;

@objid ("00855ebc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTransaction extends BpmnSubProcess {
    @objid ("183e6880-0c69-4d01-afd9-0f4065077b61")
    String getProtocol();

    @objid ("3dfc259f-8350-487a-bdb7-f06b27314165")
    void setProtocol(String value);

    @objid ("cef8cdd1-3494-4b0f-ad44-4c38438215f1")
    TransactionMethod getMethod();

    @objid ("e2fe0ce9-fe85-4f5c-8cbd-c82119a16363")
    void setMethod(TransactionMethod value);

}
