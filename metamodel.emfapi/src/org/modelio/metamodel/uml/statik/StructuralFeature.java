/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.KindOfAccess;

/**
 * StructuralFeature v0.0.9054
 * 
 * 
 * null
 */
@objid ("001ee9c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuralFeature extends Feature {
    @objid ("e983ee75-1f66-4458-a77a-27c129fb7be0")
    public static final String MNAME = "StructuralFeature";

    /**
     * Getter for attribute 'StructuralFeature.Changeable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0b33ced5-e4c2-4fc4-a5e0-9a8dde8ad74a")
    KindOfAccess getChangeable();

    /**
     * Setter for attribute 'StructuralFeature.Changeable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("315053c6-9565-4dc2-967a-91505e785b98")
    void setChangeable(KindOfAccess value);

    /**
     * Getter for attribute 'StructuralFeature.IsDerived'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6bdb3f7c-7440-4495-aa16-e27135a10d8c")
    boolean isIsDerived();

    /**
     * Setter for attribute 'StructuralFeature.IsDerived'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eaffa5f8-b1af-49ed-9842-dd73de052cb0")
    void setIsDerived(boolean value);

    /**
     * Getter for attribute 'StructuralFeature.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a640b888-9cf0-4a10-8920-90222cd2e9be")
    boolean isIsOrdered();

    /**
     * Setter for attribute 'StructuralFeature.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("68520d9e-7ada-4c6d-8c5c-ce3b4976d14f")
    void setIsOrdered(boolean value);

    /**
     * Getter for attribute 'StructuralFeature.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("29431597-4cd9-48f6-a889-77c4f792635d")
    boolean isIsUnique();

    /**
     * Setter for attribute 'StructuralFeature.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2e556bbf-049a-4391-a019-ee21d9968f8d")
    void setIsUnique(boolean value);

    /**
     * Getter for attribute 'StructuralFeature.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("39c97d20-3438-408b-b401-52b1cbb1c06d")
    String getMultiplicityMin();

    /**
     * Setter for attribute 'StructuralFeature.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("63eefac5-ab12-4181-9585-69b0b600a787")
    void setMultiplicityMin(String value);

    /**
     * Getter for attribute 'StructuralFeature.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cc82705d-a7ea-4c61-9146-9db7e700eaf7")
    String getMultiplicityMax();

    /**
     * Setter for attribute 'StructuralFeature.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1417505f-997f-4f04-8c47-bf296cacc705")
    void setMultiplicityMax(String value);

    /**
     * Getter for relation 'StructuralFeature->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f028403a-5944-439c-b980-f004da5c1c91")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'StructuralFeature->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("94e85ef9-2760-4ce2-ab7c-487093e9ae82")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
