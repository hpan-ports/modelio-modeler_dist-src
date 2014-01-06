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
    @objid ("2fb0e10b-0156-430c-9185-27f8b7346ee1")
    Instance getCluster();

    @objid ("20a0d1c7-2c6f-4deb-ac2d-9c8225578c94")
    void setCluster(Instance value);

    @objid ("56137fce-47e7-4c05-8a4d-73e4b628158e")
    Classifier getInternalOwner();

    @objid ("7cbbc2ac-13ab-4c23-b581-e9fb6da51f19")
    void setInternalOwner(Classifier value);

    @objid ("77b31a91-7299-4679-a643-28e6b4ca1951")
    EList<Binding> getRepresentation();

    @objid ("5434396e-7f2a-4adf-b963-7fa2a038b3cc")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("533ac962-c365-4cc5-b034-ce32a0cb3268")
    ModelElement getRepresentedFeature();

    @objid ("673feb5a-b34e-4c4b-9fe2-9f229a8ab671")
    void setRepresentedFeature(ModelElement value);

}
