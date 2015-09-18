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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006633d4-c4bf-1fd8-97fe-001ec947cd2a")
public class ProjectImpl extends ModelElementImpl implements Project {
    @objid ("cd2345ce-d2c6-4e81-81c0-544ceff246ef")
    @Override
    public String getProjectContext() {
        return (String) getAttVal(ProjectData.Metadata.ProjectContextAtt());
    }

    @objid ("1c2ff3bd-85db-4cbc-971f-c060722aeb19")
    @Override
    public void setProjectContext(String value) {
        setAttVal(ProjectData.Metadata.ProjectContextAtt(), value);
    }

    @objid ("a1126c13-389b-49ea-8778-7af1aba9553d")
    @Override
    public String getProjectDescr() {
        return (String) getAttVal(ProjectData.Metadata.ProjectDescrAtt());
    }

    @objid ("c6290439-e7a5-412b-850d-0194a88fe6e1")
    @Override
    public void setProjectDescr(String value) {
        setAttVal(ProjectData.Metadata.ProjectDescrAtt(), value);
    }

    @objid ("fc165f7f-c2a3-494c-91b1-105b0c886bf0")
    @Override
    public DiagramSet getDiagramRoot() {
        return (DiagramSet) getDepVal(ProjectData.Metadata.DiagramRootDep());
    }

    @objid ("add76917-211f-4477-bf71-f9b69c3b8e49")
    @Override
    public void setDiagramRoot(DiagramSet value) {
        appendDepVal(ProjectData.Metadata.DiagramRootDep(), (SmObjectImpl)value);
    }

    @objid ("fc736f23-bf47-4cf7-8ca5-ea42f48229df")
    @Override
    public Package getModel() {
        return (Package) getDepVal(ProjectData.Metadata.ModelDep());
    }

    @objid ("c0b88e2b-72aa-450f-b961-282e3c13010c")
    @Override
    public void setModel(Package value) {
        appendDepVal(ProjectData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("703c6412-5459-4540-ac55-cd7d3c888b24")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("220ccf02-b1b6-4031-aab6-7d762d9c4d84")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2bb144e2-2449-4aa7-85b7-e14738f61a0f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProject(this);
        else
          return null;
    }

}
