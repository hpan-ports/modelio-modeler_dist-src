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
import org.modelio.metamodel.data.diagrams.CompositeStructureDiagramData;
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007319aa-c4bf-1fd8-97fe-001ec947cd2a")
public class CompositeStructureDiagramImpl extends StaticDiagramImpl implements CompositeStructureDiagram {
    @objid ("5bc481a5-76e7-49d2-81f4-94f9b8bdd128")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8af3dc68-9b49-480f-8fae-d735a66c0bbe")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b3fe1aa6-d722-45f6-b884-2c100f28b4d3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCompositeStructureDiagram(this);
        else
          return null;
    }

}
