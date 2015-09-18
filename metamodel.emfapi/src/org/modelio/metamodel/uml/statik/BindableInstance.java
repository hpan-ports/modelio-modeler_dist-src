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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0000aa6e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BindableInstance extends Instance {
    @objid ("7d67817c-69eb-48d1-b697-4131844a6dfe")
    Instance getCluster();

    @objid ("ba9172db-13b1-4bb2-a04a-ce671e210e9c")
    void setCluster(Instance value);

    @objid ("20779332-0166-4486-9615-555f148bb144")
    Classifier getInternalOwner();

    @objid ("5515de77-c6ac-48c7-be53-8e3d0452a3a7")
    void setInternalOwner(Classifier value);

    @objid ("fb5e42e6-0f2e-4f9e-bb98-70a522f3dfab")
    EList<Binding> getRepresentation();

    @objid ("385cda56-d81a-40f9-8429-49a6ea1105ac")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("90ef28e7-73eb-4845-b443-e8d35df4c13f")
    ModelElement getRepresentedFeature();

    @objid ("fc3f223f-37a0-4932-a9cb-a91e3b939567")
    void setRepresentedFeature(ModelElement value);

}
