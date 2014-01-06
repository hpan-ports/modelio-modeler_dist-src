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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00372b20-c4bf-1fd8-97fe-001ec947cd2a")
public interface LoopNode extends StructuredActivityNode {
    @objid ("6b2fdab3-4770-4872-9c46-dde74fd5d414")
    boolean isIsTestedFirst();

    @objid ("88611947-e6bb-4978-8e9d-c1d1321e9c12")
    void setIsTestedFirst(boolean value);

    @objid ("75867f78-e685-4f4a-b0a2-2b3f93de71b1")
    String getSetup();

    @objid ("7daa8b9d-952b-469f-8ab6-f56d586e5515")
    void setSetup(String value);

    @objid ("05d90f07-5239-4246-88a0-e22fcaeb7127")
    String getTest();

    @objid ("5452d282-5f2c-4b7c-ab7a-a6ca8e28d8e7")
    void setTest(String value);

}
