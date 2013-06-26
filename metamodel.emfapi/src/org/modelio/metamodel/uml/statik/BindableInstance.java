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
    @objid ("3be0904d-1f9b-4e2d-afa2-09a90cc5895a")
    Instance getCluster();

    @objid ("9de24492-5a2f-437d-8272-c03939be1549")
    void setCluster(Instance value);

    @objid ("8cd6ecb3-3f9f-462f-8594-4a392751f411")
    Classifier getInternalOwner();

    @objid ("85525ae1-8d3b-43f4-a248-d41fe7c21001")
    void setInternalOwner(Classifier value);

    @objid ("0602c978-94c8-48b4-bdf6-12372eed71e7")
    EList<Binding> getRepresentation();

    @objid ("09169d18-821e-4c0f-91aa-ac82b0845b58")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("add4db39-2a18-45c9-aeb5-0b3251354438")
    ModelElement getRepresentedFeature();

    @objid ("fb2a6846-4bb5-4583-8a33-44116a6ccc91")
    void setRepresentedFeature(ModelElement value);

}
