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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.ArtifactData;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0096da48-c4be-1fd8-97fe-001ec947cd2a")
public class ArtifactImpl extends ClassifierImpl implements Artifact {
    @objid ("fd347c2f-b047-4b8d-82a0-74670374e428")
    @Override
    public String getFileName() {
        return (String) getAttVal(ArtifactData.Metadata.FileNameAtt());
    }

    @objid ("11af860f-4181-4e06-b6eb-98a51dc6e30c")
    @Override
    public void setFileName(String value) {
        setAttVal(ArtifactData.Metadata.FileNameAtt(), value);
    }

    @objid ("4b0cbe28-cf56-46d5-b9cd-1c358925aa92")
    @Override
    public EList<Manifestation> getUtilized() {
        return new SmList<>(this, ArtifactData.Metadata.UtilizedDep());
    }

    @objid ("623ef5dc-7c4d-4240-8da1-3b2abb25af42")
    @Override
    public <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Manifestation element : getUtilized()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0159737e-8801-4e65-8326-98fbaad2903c")
    @Override
    public EList<Node> getDeploymentLocation() {
        return new SmList<>(this, ArtifactData.Metadata.DeploymentLocationDep());
    }

    @objid ("ce2a251b-6666-44b9-90ff-a96ce49bd5a7")
    @Override
    public <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Node element : getDeploymentLocation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("62f640ae-25f8-48d3-990f-46480bab0e80")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6113e118-1b9e-47fb-9e97-066367413cc5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("85c286f3-813c-4253-be62-821497497fb5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitArtifact(this);
        else
          return null;
    }

}
