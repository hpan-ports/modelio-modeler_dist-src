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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystItemData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("901bf652-8771-4ad2-9eff-9f03ee6e7461")
public abstract class AnalystItemImpl extends ModelElementImpl implements AnalystItem {
    @objid ("3df27c51-5d87-4537-abf6-b0dbb0092ddc")
    @Override
    public String getDefinition() {
        return (String) getAttVal(AnalystItemData.Metadata.DefinitionAtt());
    }

    @objid ("ff6cd1c0-262a-4b7d-b2b8-1e0d41818cd5")
    @Override
    public void setDefinition(String value) {
        setAttVal(AnalystItemData.Metadata.DefinitionAtt(), value);
    }

    @objid ("faa234a0-7af6-4d1f-90a9-20fc8fc4388c")
    @Override
    public AnalystPropertyTable getAnalystProperties() {
        return (AnalystPropertyTable) getDepVal(AnalystItemData.Metadata.AnalystPropertiesDep());
    }

    @objid ("62270c32-4683-4a32-8add-9c9f8b8e87b0")
    @Override
    public void setAnalystProperties(AnalystPropertyTable value) {
        appendDepVal(AnalystItemData.Metadata.AnalystPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("2e967552-8817-4cca-9afa-fb3f7b7e0063")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d7e8debd-e4ff-4359-bb50-c49732145706")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b8f8f3c6-f5e4-466e-890f-2c66fe063b4c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystItem(this);
        else
          return null;
    }

}
