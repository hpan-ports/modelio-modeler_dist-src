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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * ExceptionHandler v0.0.9054
 * 
 * 
 * null
 */
@objid ("00307956-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExceptionHandler extends ModelElement {
    @objid ("e0627106-bdbb-4c03-bc6b-98e68c8cba50")
    public static final String MNAME = "ExceptionHandler";

    /**
     * Getter for attribute 'ExceptionHandler.Guard'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("438ba037-d2b8-4f06-9951-fed39b5a30a1")
    String getGuard();

    /**
     * Setter for attribute 'ExceptionHandler.Guard'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e5dd6a13-7cd0-44f6-ba85-f391ae44d25c")
    void setGuard(String value);

    /**
     * Getter for attribute 'ExceptionHandler.Weight'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7ccaad48-4154-4362-a83c-710d6dc6764a")
    String getWeight();

    /**
     * Setter for attribute 'ExceptionHandler.Weight'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0da77693-eba2-453f-ad34-9f42083d21b9")
    void setWeight(String value);

    /**
     * Getter for relation 'ExceptionHandler->ProtectedNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5c077832-0d98-4704-be3b-bf76c7878438")
    ActivityAction getProtectedNode();

    /**
     * Setter for relation 'ExceptionHandler->ProtectedNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e5a851cc-d613-4183-a7b1-39334300d876")
    void setProtectedNode(ActivityAction value);

    /**
     * Getter for relation 'ExceptionHandler->ExceptionInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1ee6a0c5-3842-4ba0-9572-9954015a2536")
    InputPin getExceptionInput();

    /**
     * Setter for relation 'ExceptionHandler->ExceptionInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d6949ff6-2b02-47bb-8974-10bc12ef7025")
    void setExceptionInput(InputPin value);

    /**
     * Getter for relation 'ExceptionHandler->ExceptionType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dc2bb7f7-03b9-4a0e-bd60-ac1c5421fe83")
    EList<GeneralClass> getExceptionType();

    /**
     * Filtered Getter for relation 'ExceptionHandler->ExceptionType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3bc32de8-a45e-47e2-96d0-b701a434f54d")
    <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass);

}
