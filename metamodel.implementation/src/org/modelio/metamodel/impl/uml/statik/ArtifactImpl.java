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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.statik.ArtifactData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0096da48-c4be-1fd8-97fe-001ec947cd2a")
public class ArtifactImpl extends ClassifierImpl implements Artifact {
    @objid ("fd6f23c8-b1ed-4b2d-b5ec-59570120a28b")
    @Override
    public String getFileName() {
        return (String) getAttVal(((ArtifactSmClass)getClassOf()).getFileNameAtt());
    }

    @objid ("cf450dbb-254e-41ad-afe2-422713309b00")
    @Override
    public void setFileName(String value) {
        setAttVal(((ArtifactSmClass)getClassOf()).getFileNameAtt(), value);
    }

    @objid ("e8bb636f-a948-4cf6-9b8b-43fc10e941be")
    @Override
    public EList<Manifestation> getUtilized() {
        return new SmList<>(this, ((ArtifactSmClass)getClassOf()).getUtilizedDep());
    }

    @objid ("e9c54439-2ada-420e-8ccb-9fc195dffe9f")
    @Override
    public <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Manifestation element : getUtilized()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e9d54465-a409-4d8f-8519-dd230914a955")
    @Override
    public EList<Node> getDeploymentLocation() {
        return new SmList<>(this, ((ArtifactSmClass)getClassOf()).getDeploymentLocationDep());
    }

    @objid ("2575bf27-b808-4014-a66d-8b87873ae8ec")
    @Override
    public <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Node element : getDeploymentLocation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("24a29679-d818-4a92-860e-b049216137e2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e11fa5e5-4f13-4c46-9f88-95328b121022")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("43e989c6-c030-48c9-9819-489a9365cb2e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitArtifact(this);
        else
          return null;
    }

}
