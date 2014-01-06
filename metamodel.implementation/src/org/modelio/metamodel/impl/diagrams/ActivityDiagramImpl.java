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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.diagrams.ActivityDiagramData;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0067fa70-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityDiagramImpl extends BehaviorDiagramImpl implements ActivityDiagram {
    @objid ("36b934b0-9b2d-4abe-a8d7-48d61a81b564")
    @Override
    public boolean isIsVertical() {
        return (Boolean) getAttVal(ActivityDiagramData.Metadata.IsVerticalAtt());
    }

    @objid ("91d0c6e9-85be-4b6b-88d6-45d5bb2a1981")
    @Override
    public void setIsVertical(boolean value) {
        setAttVal(ActivityDiagramData.Metadata.IsVerticalAtt(), value);
    }

    @objid ("e9995179-cf40-45b2-b796-ac2b5f53836e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1bb152f8-f49a-4209-8a18-816a73c137b5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f8e6a2d8-09f8-4198-bd34-119de6de231b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityDiagram(this);
        else
          return null;
    }

}
