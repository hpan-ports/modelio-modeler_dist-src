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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
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
    @objid ("0ff466f8-16de-4541-9a6d-45904781a250")
    @Override
    public String getDefinition() {
        return (String) getAttVal(AnalystItemData.Metadata.DefinitionAtt());
    }

    @objid ("2bbade37-dc41-4580-94e1-88324e6b5106")
    @Override
    public void setDefinition(String value) {
        setAttVal(AnalystItemData.Metadata.DefinitionAtt(), value);
    }

    @objid ("2ad86769-55fa-4b43-be00-b19ac73777af")
    @Override
    public AnalystPropertyTable getAnalystProperties() {
        return (AnalystPropertyTable) getDepVal(AnalystItemData.Metadata.AnalystPropertiesDep());
    }

    @objid ("4642a184-0bd6-4a39-b92c-9baba94d0d46")
    @Override
    public void setAnalystProperties(AnalystPropertyTable value) {
        appendDepVal(AnalystItemData.Metadata.AnalystPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("435d4ada-5899-45d3-8b2f-903653907236")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("afe348d0-f588-4197-abde-67b9ae1b08e2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("73d8ece9-deb2-4a8a-907b-446a87eb9682")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystItem(this);
        else
          return null;
    }

}
