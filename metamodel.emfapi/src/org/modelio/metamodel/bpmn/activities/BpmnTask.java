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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;

@objid ("0084bb4c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTask extends BpmnActivity {
    @objid ("4447fa37-1cc0-4d77-b542-782bd4805ba9")
    boolean isIsGlobal();

    @objid ("73271135-bbfc-4a25-9b85-18e3d3edc55c")
    void setIsGlobal(boolean value);

    @objid ("3c21b0c4-fbf4-4d6b-be68-b5481e7a4bd6")
    EList<BpmnCallActivity> getCaller();

    @objid ("ac711bd6-9c61-415d-b6a9-7e44614fdfdd")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

}
