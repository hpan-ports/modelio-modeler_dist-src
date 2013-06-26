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
import org.modelio.metamodel.uml.behavior.activityModel.Clause;

@objid ("002d52f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConditionalNode extends StructuredActivityNode {
    @objid ("1a027a4a-3d90-4ea0-ba90-ce183399a510")
    boolean isIsDeterminate();

    @objid ("a2290856-1d1b-483f-b01f-15603da3ba03")
    void setIsDeterminate(boolean value);

    @objid ("2af52f71-b139-4ef2-85d1-0c9785595e3b")
    boolean isIsAssured();

    @objid ("9b26b7d6-9d4f-4e18-942a-c6d42d8be22f")
    void setIsAssured(boolean value);

    @objid ("9616e76c-9468-4c8f-90a2-4e2884750e84")
    EList<Clause> getOwnedClause();

    @objid ("84d57c05-3683-4e8c-8d0e-d37e09f9e431")
    <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass);

}
