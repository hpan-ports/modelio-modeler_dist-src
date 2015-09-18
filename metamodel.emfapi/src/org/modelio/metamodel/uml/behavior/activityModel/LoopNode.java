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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00372b20-c4bf-1fd8-97fe-001ec947cd2a")
public interface LoopNode extends StructuredActivityNode {
    @objid ("dd333a21-1a12-428d-a83d-fd1fa49bf871")
    boolean isIsTestedFirst();

    @objid ("a90fadf5-16aa-4cef-8d25-f44068280d37")
    void setIsTestedFirst(boolean value);

    @objid ("42af3be7-281d-4bb7-9c3c-99ef28608efa")
    String getSetup();

    @objid ("2dbdf74c-6cac-4d82-8931-23053e4a275e")
    void setSetup(String value);

    @objid ("09fb668d-0b63-410c-8b2d-6a25ac4dbbca")
    String getTest();

    @objid ("2696a85e-490b-4176-ac54-16e02747de47")
    void setTest(String value);

}
