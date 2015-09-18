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
    @objid ("ff01d1a7-73b5-4851-9fb5-ef390d8d9b6b")
    @Override
    public boolean isIsVertical() {
        return (Boolean) getAttVal(ActivityDiagramData.Metadata.IsVerticalAtt());
    }

    @objid ("b0865b00-7ec5-4cc0-acd0-836623264c5b")
    @Override
    public void setIsVertical(boolean value) {
        setAttVal(ActivityDiagramData.Metadata.IsVerticalAtt(), value);
    }

    @objid ("8c8bfd87-0ea3-423c-8557-fbfe97b4393f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2ed2a56d-a2a5-4f03-9cd1-988d53dc9f83")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("734c7ab3-8964-49c3-a2b3-9e1f7164cc8a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityDiagram(this);
        else
          return null;
    }

}
