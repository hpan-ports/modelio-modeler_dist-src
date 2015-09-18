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
import org.modelio.metamodel.uml.behavior.activityModel.Clause;

@objid ("002d52f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConditionalNode extends StructuredActivityNode {
    @objid ("8b9c5355-c035-4208-9eb1-04f3f7f44303")
    boolean isIsDeterminate();

    @objid ("847770fc-1685-4c7e-ad51-684540771124")
    void setIsDeterminate(boolean value);

    @objid ("654c7e3e-383d-4f46-8193-87223f37a0ef")
    boolean isIsAssured();

    @objid ("e6bb3bfb-d979-4b3b-95a5-09ac978e7fdb")
    void setIsAssured(boolean value);

    @objid ("4e827e5c-8e80-4d08-aef5-e0c7e374f48a")
    EList<Clause> getOwnedClause();

    @objid ("93e27483-77f2-407a-831e-25fdc33bd90f")
    <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass);

}
