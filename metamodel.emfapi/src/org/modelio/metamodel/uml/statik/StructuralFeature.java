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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;

@objid ("001ee9c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuralFeature extends Feature {
    @objid ("605e7f1b-07d1-44f5-ac2e-3e1797651338")
    KindOfAccess getChangeable();

    @objid ("ad38c742-db81-42fd-8948-3f5a3cd79829")
    void setChangeable(KindOfAccess value);

    @objid ("c1ff5556-c107-4d4c-9f7f-98fac811e388")
    boolean isIsDerived();

    @objid ("0aeb7d15-5250-471e-84cb-5f0a1feb803c")
    void setIsDerived(boolean value);

    @objid ("070c59eb-cc80-46b3-b03d-95bb759c5d98")
    boolean isIsOrdered();

    @objid ("60019ba9-382d-48c6-a209-ede8ba7d9c5d")
    void setIsOrdered(boolean value);

    @objid ("c64d942b-bfc3-48bf-849a-a83f587b8095")
    boolean isIsUnique();

    @objid ("1d469993-2c2a-4c3e-81fc-2782d2551a62")
    void setIsUnique(boolean value);

    @objid ("97e2a58d-aed1-4f5c-a6b2-a6ad817eb124")
    String getMultiplicityMin();

    @objid ("e00ee22b-3355-480d-86d1-b7841602e7de")
    void setMultiplicityMin(String value);

    @objid ("3bd74e1b-48d2-43b7-8389-bcedcf402fee")
    String getMultiplicityMax();

    @objid ("46e87739-4dec-4066-8b76-081cf07673c8")
    void setMultiplicityMax(String value);

    @objid ("410de163-ad7d-4820-99e6-06e5eafba8cc")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("5241f4ea-50c8-45d6-a630-bc321115e993")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
