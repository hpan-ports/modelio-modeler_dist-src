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

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.impl.analyst.AnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("8dc426e9-5733-4b29-b7eb-113f29cd5f01")
public abstract class AnalystElementImpl extends AnalystItemImpl implements AnalystElement {
    @objid ("ba3033f7-1d9a-4f46-abda-a47ac5e80cf8")
    @Override
    public AnalystPropertyTable getDefaultProperties() {
        MObject owner = this;
        do {
            owner = owner.getCompositionOwner(); 
        } while (owner != null && !(owner instanceof AnalystContainer));
        
        if (owner != null) {
            return ((AnalystContainer) owner).getAnalystProperties();
        } else {
            return null;
        }
    }

    @objid ("5ee2b3aa-c355-4388-ab75-8eaaac06b861")
    @Override
    public int getVersion() {
        return (Integer) getAttVal(((AnalystElementSmClass)getClassOf()).getVersionAtt());
    }

    @objid ("98f746c8-43b6-48fe-84b7-47f0dee98988")
    @Override
    public void setVersion(int value) {
        setAttVal(((AnalystElementSmClass)getClassOf()).getVersionAtt(), value);
    }

    @objid ("ff47a29d-8688-42a4-9224-f3d29e7a93ee")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("32e15508-4870-4d1e-893f-9f0a8fe21390")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("9f9de758-7724-4374-aaa3-63ae5a794687")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystElement(this);
        else
          return null;
    }

}
