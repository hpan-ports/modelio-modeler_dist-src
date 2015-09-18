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
/*   Metamodel version: 9022              */
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
    @objid ("a8e56246-13bc-483d-bd6b-9bbbab3cc2b8")
    @Override
    public String getDefinition() {
        return (String) getAttVal(AnalystItemData.Metadata.DefinitionAtt());
    }

    @objid ("81fcb9b9-d11f-4092-870d-3ce1b2d63580")
    @Override
    public void setDefinition(String value) {
        setAttVal(AnalystItemData.Metadata.DefinitionAtt(), value);
    }

    @objid ("c57d492c-2752-4b4a-b21c-b1b9090c0dfc")
    @Override
    public AnalystPropertyTable getAnalystProperties() {
        return (AnalystPropertyTable) getDepVal(AnalystItemData.Metadata.AnalystPropertiesDep());
    }

    @objid ("98ef17f8-644a-4232-99af-813d34c24f7d")
    @Override
    public void setAnalystProperties(AnalystPropertyTable value) {
        appendDepVal(AnalystItemData.Metadata.AnalystPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("75dd45c8-c238-4d23-ab75-d00e54012080")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("984be850-dc7b-4bc8-9df6-c8b4362c2b7c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("141c955b-9630-420b-9ed5-52f8d7ce6d13")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystItem(this);
        else
          return null;
    }

}
