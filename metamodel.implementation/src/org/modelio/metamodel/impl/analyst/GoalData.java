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

@objid ("e8d12951-1ab0-47fa-a43b-bfbe216ceb44")
public class GoalData extends AnalystElementData {
    @objid ("4789a66a-5fe8-4be9-9ff4-9c70d7b42af2")
     List<SmObjectImpl> mSubGoal = null;

    @objid ("a82e5021-0188-4f35-b035-bd8fdf770771")
     SmObjectImpl mOwnerContainer;

    @objid ("ccc6a247-b593-45d4-9dd8-c2508cc34305")
     SmObjectImpl mParentGoal;

    @objid ("891f410c-295c-4991-b40e-3ecebc8be981")
     SmObjectImpl mLastGoalVersion;

    @objid ("18e31f69-f78b-4ff1-a2e6-7aaf569a2dbd")
     List<SmObjectImpl> mArchivedGoalVersion = null;

    @objid ("3b6d30ab-65f7-4e74-bc90-f83324154d58")
    public GoalData(GoalSmClass smClass) {
        super(smClass);
    }

}
