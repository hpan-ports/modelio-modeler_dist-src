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
    @objid ("d4936be8-7578-420d-9bb0-f46ca7862fbe")
    @Override
    public String getProjectContext() {
        return (String) getAttVal(ProjectData.Metadata.ProjectContextAtt());
    }

    @objid ("54cbdd4e-06b2-499f-a95b-9b7187b83f75")
    @Override
    public void setProjectContext(String value) {
        setAttVal(ProjectData.Metadata.ProjectContextAtt(), value);
    }

    @objid ("e2a98298-05a7-4d5b-ac17-835abce6dfe1")
    @Override
    public String getProjectDescr() {
        return (String) getAttVal(ProjectData.Metadata.ProjectDescrAtt());
    }

    @objid ("f8788880-791f-414f-a711-06fb95ce9a7a")
    @Override
    public void setProjectDescr(String value) {
        setAttVal(ProjectData.Metadata.ProjectDescrAtt(), value);
    }

    @objid ("8bb92c84-22f0-4619-bca7-aaca198d3832")
    @Override
    public DiagramSet getDiagramRoot() {
        return (DiagramSet) getDepVal(ProjectData.Metadata.DiagramRootDep());
    }

    @objid ("4fe5d796-22fb-458d-9b2a-26a720b7ca49")
    @Override
    public void setDiagramRoot(DiagramSet value) {
        appendDepVal(ProjectData.Metadata.DiagramRootDep(), (SmObjectImpl)value);
    }

    @objid ("f9bac689-8582-4504-9b7e-318e54fa2b70")
    @Override
    public Package getModel() {
        return (Package) getDepVal(ProjectData.Metadata.ModelDep());
    }

    @objid ("a7005f6d-3525-4c08-997f-fb3708b6ea6a")
    @Override
    public void setModel(Package value) {
        appendDepVal(ProjectData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("4dbe2d79-e9f8-4d6d-8d22-d4209f18b5ed")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2c3c931c-bf28-4e4d-9f2a-c000330cb69b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ea70ef78-bc58-4f17-aa9a-b893b1a5639a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProject(this);
        else
          return null;
    }

}
