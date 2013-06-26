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
    @objid ("08f06a66-b6b4-4201-8be3-886c613f0eb5")
    @Override
    public String getProjectContext() {
        return (String) getAttVal(ProjectData.Metadata.ProjectContextAtt());
    }

    @objid ("48d9bc2a-8d51-424a-ab0b-22bc6a11a641")
    @Override
    public void setProjectContext(String value) {
        setAttVal(ProjectData.Metadata.ProjectContextAtt(), value);
    }

    @objid ("9e95e6b1-49f4-4fd5-8d81-6cb20a2dd0ab")
    @Override
    public String getProjectDescr() {
        return (String) getAttVal(ProjectData.Metadata.ProjectDescrAtt());
    }

    @objid ("960f8781-3b08-49be-9f8f-19cdb5b82226")
    @Override
    public void setProjectDescr(String value) {
        setAttVal(ProjectData.Metadata.ProjectDescrAtt(), value);
    }

    @objid ("e7deca0b-f47f-417e-b00c-5233467c6f7a")
    @Override
    public DiagramSet getDiagramRoot() {
        return (DiagramSet) getDepVal(ProjectData.Metadata.DiagramRootDep());
    }

    @objid ("da7b83cf-ec2a-444b-bd79-b0084d1acc18")
    @Override
    public void setDiagramRoot(DiagramSet value) {
        appendDepVal(ProjectData.Metadata.DiagramRootDep(), (SmObjectImpl)value);
    }

    @objid ("f2257b7d-762c-4d76-8e15-2adefab689b4")
    @Override
    public Package getModel() {
        return (Package) getDepVal(ProjectData.Metadata.ModelDep());
    }

    @objid ("b984b5a8-e76a-4160-89c2-5df367652838")
    @Override
    public void setModel(Package value) {
        appendDepVal(ProjectData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("803ee027-5748-4cc0-a41d-c46ff862a86a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("15668edf-3133-4848-99db-d6a12c5f1628")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("aadf8b11-1e61-46d8-9aa7-91cd0a98e452")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProject(this);
        else
          return null;
    }

}
