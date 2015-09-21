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
package org.modelio.metamodel.impl.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("006e66a8-c4bf-1fd8-97fe-001ec947cd2a")
public class DiagramSetData extends ModelElementData {
    @objid ("02973ec1-1363-4a6f-9294-aeac72542cc3")
     List<SmObjectImpl> mSub = null;

    @objid ("efde2702-5187-41e2-91c2-dcdf70683ad2")
     SmObjectImpl mParent;

    @objid ("f3e173aa-0e2d-4171-9e66-e73fc05fe1f6")
     List<SmObjectImpl> mReferencedDiagram = null;

    @objid ("8f5c9b3a-08eb-4465-97f1-bafa5f191d8d")
     SmObjectImpl mOwner;

    @objid ("b9742203-80e2-4f50-a230-367da1b6d744")
    public DiagramSetData(DiagramSetSmClass smClass) {
        super(smClass);
    }

}
