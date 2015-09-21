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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.DurationConstraintData;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0043f6ca-c4bf-1fd8-97fe-001ec947cd2a")
public class DurationConstraintImpl extends ConstraintImpl implements DurationConstraint {
    @objid ("95daa26c-6d71-4a1d-a5ff-eb9b7448c024")
    @Override
    public String getDurationMin() {
        return (String) getAttVal(((DurationConstraintSmClass)getClassOf()).getDurationMinAtt());
    }

    @objid ("ec7013c2-ae38-4c38-8814-255dc01f064a")
    @Override
    public void setDurationMin(String value) {
        setAttVal(((DurationConstraintSmClass)getClassOf()).getDurationMinAtt(), value);
    }

    @objid ("2c6bd0e0-994f-4238-bc60-e05fceee7559")
    @Override
    public String getDurationMax() {
        return (String) getAttVal(((DurationConstraintSmClass)getClassOf()).getDurationMaxAtt());
    }

    @objid ("4021f7be-ec15-44ab-94b0-ecf79d8dc4fb")
    @Override
    public void setDurationMax(String value) {
        setAttVal(((DurationConstraintSmClass)getClassOf()).getDurationMaxAtt(), value);
    }

    @objid ("a941fddb-e067-4142-b166-ab4d036c5834")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e151ea87-0fbf-4fdd-a621-c7819fbff5cb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("0504ad49-cdc8-43ef-83e3-b65c22ad8cca")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDurationConstraint(this);
        else
          return null;
    }

}
