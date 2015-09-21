/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.mda.ProjectData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("006633d4-c4bf-1fd8-97fe-001ec947cd2a")
public class ProjectImpl extends ModelElementImpl implements Project {
    @objid ("41d6a884-cfb7-423c-96c1-f52ac2b42ede")
    @Override
    public String getProjectContext() {
        return (String) getAttVal(((ProjectSmClass)getClassOf()).getProjectContextAtt());
    }

    @objid ("b39cc380-6c68-4e2c-819f-b3a1c66f2899")
    @Override
    public void setProjectContext(String value) {
        setAttVal(((ProjectSmClass)getClassOf()).getProjectContextAtt(), value);
    }

    @objid ("4e67f685-96de-44c3-8bbf-05a9463aca52")
    @Override
    public String getProjectDescr() {
        return (String) getAttVal(((ProjectSmClass)getClassOf()).getProjectDescrAtt());
    }

    @objid ("810cb0e4-0d66-4847-ba85-061446bb9001")
    @Override
    public void setProjectDescr(String value) {
        setAttVal(((ProjectSmClass)getClassOf()).getProjectDescrAtt(), value);
    }

    @objid ("084dffe3-5c47-40bc-88fa-6f7a54df06fb")
    @Override
    public DiagramSet getDiagramRoot() {
        Object obj = getDepVal(((ProjectSmClass)getClassOf()).getDiagramRootDep());
        return (obj instanceof DiagramSet)? (DiagramSet)obj : null;
    }

    @objid ("cf3aa325-db80-4821-8c1b-f142f7bfd995")
    @Override
    public void setDiagramRoot(DiagramSet value) {
        appendDepVal(((ProjectSmClass)getClassOf()).getDiagramRootDep(), (SmObjectImpl)value);
    }

    @objid ("40890852-584f-49e7-91d1-004e157df791")
    @Override
    public Package getModel() {
        Object obj = getDepVal(((ProjectSmClass)getClassOf()).getModelDep());
        return (obj instanceof Package)? (Package)obj : null;
    }

    @objid ("59742e66-d974-444d-9d49-1227dc54aa46")
    @Override
    public void setModel(Package value) {
        appendDepVal(((ProjectSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("0c5fa783-7712-446e-8da8-d1f3591a0cc0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("19fa812e-4278-4228-8c39-d47d709ff7db")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("7afd52e4-f8d4-4fce-ba76-b7fed2bead15")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProject(this);
        else
          return null;
    }

}
