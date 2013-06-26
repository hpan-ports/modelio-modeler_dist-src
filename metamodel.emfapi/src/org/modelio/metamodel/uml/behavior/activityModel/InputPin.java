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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;

@objid ("003503ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface InputPin extends Pin {
    @objid ("ce56ab35-dc30-4ace-8c12-993f40f17c7e")
    boolean isIsSelf();

    @objid ("ccb4a15f-1da3-4c6f-bf9c-e26489f2141f")
    void setIsSelf(boolean value);

    @objid ("7d53cd69-19bf-4e7a-aba8-a934c55a67e7")
    EList<ExceptionHandler> getHandler();

    @objid ("471e7ac7-1a83-49bd-8b64-74d9f567c2ed")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

    @objid ("2d30b785-5fc5-4e50-926b-2e343d3d6f90")
    ActivityAction getInputing();

    @objid ("6eb37cfa-7cb1-42af-891c-f112e451a18f")
    void setInputing(ActivityAction value);

}
