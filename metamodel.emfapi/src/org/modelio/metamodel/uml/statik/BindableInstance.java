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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * BindableInstance v0.0.9054
 * 
 * 
 * A BindableInstance represents the UML 2.0 "Part" concept.  It is an Instance that can be bound to an AssociationEnd, a Parameter or an Instance.
 * 
 * The RepresentedFeature is used for every case where Elements need to be represented under a different and more specific configuration. For example, a Port on a Part is bound to the same Port on the Classifier of that Part.  When Attributes are represented as Parts inside a Class and its internal structure, the Part is bound to its representing Attribute.  
 * 
 * In Modelio, a BindableInstance belongs to an instance, a Classifier internal structure or a Collaboration declared instance.
 */
@objid ("0000aa6e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BindableInstance extends Instance {
    @objid ("194591e2-66f6-4d51-957a-ffabe4420e28")
    public static final String MNAME = "BindableInstance";

    /**
     * Getter for relation 'BindableInstance->Cluster'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2d771652-c802-4ea1-99fc-526caca6df40")
    Instance getCluster();

    /**
     * Setter for relation 'BindableInstance->Cluster'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2959be1a-5924-4060-8330-9c92a9042ac9")
    void setCluster(Instance value);

    /**
     * Getter for relation 'BindableInstance->InternalOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("46501cca-8326-4f2c-8c65-4989593aefba")
    Classifier getInternalOwner();

    /**
     * Setter for relation 'BindableInstance->InternalOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d0f7cd40-022e-4aed-b568-90a8fa821ea7")
    void setInternalOwner(Classifier value);

    /**
     * Getter for relation 'BindableInstance->Representation'
     * 
     * Metamodel description:
     * <i>Binding between Parts, from a CollaborationUse.</i>
     */
    @objid ("6088243b-285f-4d40-8bb2-b81b9d625b0e")
    EList<Binding> getRepresentation();

    /**
     * Filtered Getter for relation 'BindableInstance->Representation'
     * 
     * Metamodel description:
     * <i>Binding between Parts, from a CollaborationUse.</i>
     */
    @objid ("14a27224-dcdb-456a-b33e-fda04cd8f785")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BindableInstance->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>Expresses that the Part or Port represents an element from within a more accurate context (such as within an instance or a class internal structure). </i>
     */
    @objid ("218fdccc-1e8a-4177-9c2b-da98e2fc0979")
    ModelElement getRepresentedFeature();

    /**
     * Setter for relation 'BindableInstance->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>Expresses that the Part or Port represents an element from within a more accurate context (such as within an instance or a class internal structure). </i>
     */
    @objid ("eee2b336-cce1-4eaf-82c7-8d72985aedfd")
    void setRepresentedFeature(ModelElement value);

}
