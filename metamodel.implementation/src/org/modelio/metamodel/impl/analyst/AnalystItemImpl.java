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
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.impl.analyst.AnalystItemData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("901bf652-8771-4ad2-9eff-9f03ee6e7461")
public abstract class AnalystItemImpl extends ModelElementImpl implements AnalystItem {
    @objid ("f780c34c-3b0b-4cca-9fdd-83ec5aa267d2")
    @Override
    public String getDefinition() {
        return (String) getAttVal(((AnalystItemSmClass)getClassOf()).getDefinitionAtt());
    }

    @objid ("21c5d705-2616-4604-8eaf-47de29e98881")
    @Override
    public void setDefinition(String value) {
        setAttVal(((AnalystItemSmClass)getClassOf()).getDefinitionAtt(), value);
    }

    @objid ("01825252-2a70-4f23-9492-abbb126c538f")
    @Override
    public AnalystPropertyTable getAnalystProperties() {
        Object obj = getDepVal(((AnalystItemSmClass)getClassOf()).getAnalystPropertiesDep());
        return (obj instanceof AnalystPropertyTable)? (AnalystPropertyTable)obj : null;
    }

    @objid ("66fb6614-6736-42df-857b-d9ed8531f770")
    @Override
    public void setAnalystProperties(AnalystPropertyTable value) {
        appendDepVal(((AnalystItemSmClass)getClassOf()).getAnalystPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("2e25ce54-a6d9-475f-ba99-6045ce5e2fb5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("26656e88-1f4c-45e8-8a6d-46ba8887150a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("d209c709-736c-42d4-8316-93b68a0140c1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystItem(this);
        else
          return null;
    }

}
