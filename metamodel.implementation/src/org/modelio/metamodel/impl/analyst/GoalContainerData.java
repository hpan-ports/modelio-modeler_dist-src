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
package org.modelio.metamodel.impl.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("16f29540-3b49-4c2f-851d-a2d366fbab74")
public class GoalContainerData extends AnalystContainerData {
    @objid ("df9e4504-9555-4f39-9cd2-dfb5b83eaeec")
     List<SmObjectImpl> mOwnedGoal = null;

    @objid ("dff15156-f9c8-405c-a31e-4b72527cdea0")
     SmObjectImpl mOwnerContainer;

    @objid ("218b3bf7-1360-4439-b0c8-64e3f7d73c38")
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("daedfbda-f466-4cc1-b32c-ed0a692702c1")
     SmObjectImpl mOwnerProject;

    @objid ("82e55473-506b-466d-904e-8978bd3fb538")
    public GoalContainerData(GoalContainerSmClass smClass) {
        super(smClass);
    }

}
