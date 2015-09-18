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
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

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

    @objid ("bc41a5be-3b70-44ec-a24a-60c20c63893c")
    @Override
    public int getVersion() {
        return (Integer) getAttVal(AnalystElementData.Metadata.VersionAtt());
    }

    @objid ("1311d59d-d9c3-4e18-8bf6-4551a5c55c7f")
    @Override
    public void setVersion(int value) {
        setAttVal(AnalystElementData.Metadata.VersionAtt(), value);
    }

    @objid ("5252ac94-73ad-44cb-8682-8ef31f202882")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("98c0b24b-b357-4018-9e22-1bf27a73ff04")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("80e1d867-bda7-4014-ace6-60e3c47975d7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystElement(this);
        else
          return null;
    }

}
