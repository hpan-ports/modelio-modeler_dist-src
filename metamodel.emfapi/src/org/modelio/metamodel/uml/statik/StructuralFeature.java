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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;

@objid ("001ee9c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuralFeature extends Feature {
    @objid ("5c007b44-2632-4868-840b-d491586cbda1")
    KindOfAccess getChangeable();

    @objid ("1850534b-597b-49c6-ae32-77e0abd59a00")
    void setChangeable(KindOfAccess value);

    @objid ("3883030f-481f-4b20-b8f9-1ea6062d7627")
    boolean isIsDerived();

    @objid ("c5121bb7-edc4-4cc2-9256-c879239417eb")
    void setIsDerived(boolean value);

    @objid ("d003601a-14c7-4c8f-b320-a80e699b56fa")
    boolean isIsOrdered();

    @objid ("b2875ff3-cf0a-4bc0-adaf-f2ad7c83f911")
    void setIsOrdered(boolean value);

    @objid ("7752694c-104c-45b0-8b3f-389ae08c3376")
    boolean isIsUnique();

    @objid ("f9c8c422-5048-4165-b45e-de020606f94b")
    void setIsUnique(boolean value);

    @objid ("9858277e-9b8a-4651-860f-74dcbcb6ea25")
    String getMultiplicityMin();

    @objid ("716c7f44-fed0-4ddd-92e0-33e2a5d0083e")
    void setMultiplicityMin(String value);

    @objid ("1c68101a-1822-45dc-a125-1008ddca4b63")
    String getMultiplicityMax();

    @objid ("e7a000d6-b84a-4824-a50c-1228bc253f0e")
    void setMultiplicityMax(String value);

    @objid ("530eb615-34fd-4c19-b338-6ded862cf9cd")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("519c8b26-5b39-4635-8cc4-2ab376b44470")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
