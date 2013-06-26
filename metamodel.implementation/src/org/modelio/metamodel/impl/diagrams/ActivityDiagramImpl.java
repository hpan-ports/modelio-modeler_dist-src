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
    @objid ("ab4e7643-5230-4336-ac18-2477602b08d0")
    @Override
    public boolean isIsVertical() {
        return (Boolean) getAttVal(ActivityDiagramData.Metadata.IsVerticalAtt());
    }

    @objid ("a2e19228-eb26-41bc-ac12-7fe71d0202ff")
    @Override
    public void setIsVertical(boolean value) {
        setAttVal(ActivityDiagramData.Metadata.IsVerticalAtt(), value);
    }

    @objid ("f28d3aad-ed3c-495a-9f46-a502b05c08d6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c9446a2b-1ace-459c-88cc-6e1eb323fa43")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1db7d5d9-57e7-4240-9cce-fc6da76ba02f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityDiagram(this);
        else
          return null;
    }

}
