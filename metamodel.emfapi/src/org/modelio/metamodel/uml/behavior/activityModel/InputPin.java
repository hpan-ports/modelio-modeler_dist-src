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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;

@objid ("003503ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface InputPin extends Pin {
    @objid ("d98a7ec4-2b52-4829-b2e0-45629679123f")
    boolean isIsSelf();

    @objid ("a14279dc-ddff-4274-a46e-b7511637d43b")
    void setIsSelf(boolean value);

    @objid ("4fa05d9d-3fd9-446f-a218-98daae7003c7")
    EList<ExceptionHandler> getHandler();

    @objid ("63aaafe5-6ed1-4e3a-aeb3-d6757c3b6855")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

    @objid ("f9954900-cec6-41f5-8dd1-f5612582acff")
    ActivityAction getInputing();

    @objid ("8d56d170-cae7-4073-a919-f08a32ca1f6c")
    void setInputing(ActivityAction value);

}
