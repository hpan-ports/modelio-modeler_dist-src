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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00768072-17e8-10a1-88a0-001ec947cd2a")
public class NaryLinkEndData extends ModelElementData {
    @objid ("f2fae867-9505-43de-95d6-52dbfe87d979")
     Object mIsOrdered = false;

    @objid ("cd5b174b-6713-4911-9343-cf8e80c31f66")
     Object mIsUnique = false;

    @objid ("48b89c87-b2de-4c70-84e9-f45ec5483d57")
     Object mMultiplicityMax = "1";

    @objid ("68a2a5e6-066b-4a3e-8080-600caf97b657")
     Object mMultiplicityMin = "0";

    @objid ("c9a9524a-cdb0-44cb-96d3-74adff72d6ad")
     SmObjectImpl mSource;

    @objid ("7d1487f9-f4f8-44b5-91d4-85cbe48bd4c0")
     SmObjectImpl mNaryLink;

    @objid ("5d04ef5d-9bf5-4316-a3d2-ad3e645da780")
     SmObjectImpl mConsumer;

    @objid ("8ecef387-2194-408a-819c-55848f500fed")
     SmObjectImpl mProvider;

    @objid ("5d740c4a-4cad-4b25-97e7-24d45c193979")
    public NaryLinkEndData(NaryLinkEndSmClass smClass) {
        super(smClass);
    }

}
