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
    @objid ("68aed3f2-960d-4ace-9b91-1abb313f369e")
    @Override
    public String getFileName() {
        return (String) getAttVal(ArtifactData.Metadata.FileNameAtt());
    }

    @objid ("4891385c-db22-4d1c-90eb-bdbd879e8488")
    @Override
    public void setFileName(String value) {
        setAttVal(ArtifactData.Metadata.FileNameAtt(), value);
    }

    @objid ("a2d39eb7-bdd2-4ca6-a70e-3f6d4707bd74")
    @Override
    public EList<Manifestation> getUtilized() {
        return new SmList<>(this, ArtifactData.Metadata.UtilizedDep());
    }

    @objid ("e8d792cd-d28d-4cfa-b185-7e50fdbaf2fb")
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

    @objid ("f7bbeb8f-5682-4a48-b709-096a953d335b")
    @Override
    public EList<Node> getDeploymentLocation() {
        return new SmList<>(this, ArtifactData.Metadata.DeploymentLocationDep());
    }

    @objid ("eb37c4d1-b6c8-4c65-9681-99d38f922124")
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

    @objid ("2b043275-df2b-44a3-adcf-1981ab40e3e0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0d0c1153-e4ae-4434-8fcc-9150cb6f986d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("560c1c7b-03e8-46e8-877b-799e60b5e6a9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitArtifact(this);
        else
          return null;
    }

}
