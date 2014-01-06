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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;

@objid ("001ee9c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuralFeature extends Feature {
    @objid ("7309a643-eab7-4566-9447-7be11cef75a2")
    KindOfAccess getChangeable();

    @objid ("ccad761c-b9f9-4f3f-a749-4f79248b98ee")
    void setChangeable(KindOfAccess value);

    @objid ("79e8c7c8-fd34-484b-880e-d554d18f588d")
    boolean isIsDerived();

    @objid ("c9627ea5-970f-4e8d-b31c-9118fc996a6f")
    void setIsDerived(boolean value);

    @objid ("9a111478-3fa0-4086-b983-ccfacbbbbabc")
    boolean isIsOrdered();

    @objid ("55fda357-3fb2-40a3-af7c-f28a0f90e317")
    void setIsOrdered(boolean value);

    @objid ("4ec155c4-f563-4b08-b68c-edcf45899d6e")
    boolean isIsUnique();

    @objid ("597aa40b-f266-4937-bb38-421ca2e5ecc7")
    void setIsUnique(boolean value);

    @objid ("c509d402-6728-4054-b470-85c7ab83001d")
    String getMultiplicityMin();

    @objid ("308a5608-c931-4ec7-81d7-0816198a07ff")
    void setMultiplicityMin(String value);

    @objid ("832ced2e-7718-46f5-87e7-bd362681aae2")
    String getMultiplicityMax();

    @objid ("c1ed885c-4163-4d69-aba3-0517df3ef5dd")
    void setMultiplicityMax(String value);

    @objid ("0607aa35-91b1-4056-8904-852f8a327936")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("1470cae3-8b54-4d68-af23-5807b76cb587")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
