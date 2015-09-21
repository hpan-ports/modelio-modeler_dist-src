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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("001cc6ae-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateBindingData extends ModelElementData {
    @objid ("4ec7ef7c-48fd-4421-958b-a87ca139a5b8")
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("e7d4aa54-2498-4571-9b32-56c85bf53c25")
     SmObjectImpl mBoundOperation;

    @objid ("726cbaa6-a52d-44f6-a174-979c045a61e6")
     SmObjectImpl mInstanciatedTemplateOperation;

    @objid ("c0aa12c0-1921-4f00-9c4b-e6648f75d891")
     SmObjectImpl mInstanciatedTemplate;

    @objid ("94411429-47ab-49f6-bba0-b16c0daa2d39")
     SmObjectImpl mBoundElement;

    @objid ("bd49463c-5122-488e-8b0e-fa8841cb9847")
    public TemplateBindingData(TemplateBindingSmClass smClass) {
        super(smClass);
    }

}
