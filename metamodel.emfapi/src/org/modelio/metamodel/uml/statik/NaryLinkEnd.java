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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("00749ece-17e8-10a1-88a0-001ec947cd2a")
public interface NaryLinkEnd extends ModelElement {
    @objid ("ccff4be1-8d8e-4376-abcf-85608f221d52")
    boolean isIsOrdered();

    @objid ("334c86bd-40fb-4c3f-9b26-eb2b1dbeb24d")
    void setIsOrdered(boolean value);

    @objid ("e8495e81-c6ca-46d5-8319-293e0bf7c1aa")
    boolean isIsUnique();

    @objid ("0bb8ad03-dc68-4d5e-a95e-8178ed249b12")
    void setIsUnique(boolean value);

    @objid ("0aea5caa-e9b6-4d0b-af3e-7b42d9311e54")
    String getMultiplicityMax();

    @objid ("51905af0-3830-47e6-9d6e-1a7af76e55da")
    void setMultiplicityMax(String value);

    @objid ("494a95ae-3f50-4ba3-adec-b4a1a9567ef6")
    String getMultiplicityMin();

    @objid ("133834d6-e1b1-4d54-a794-1e6fb16a765b")
    void setMultiplicityMin(String value);

    @objid ("de4bbfe8-9a77-4b77-9b02-6c024a873bd1")
    Instance getSource();

    @objid ("d458e58b-cae0-4f20-a6d5-73160e3a355a")
    void setSource(Instance value);

    @objid ("9bd6f2f3-e925-49c4-aa61-6f0c0836b615")
    NaryLink getNaryLink();

    @objid ("2103295d-73ee-4a35-9cc3-2a77fd39500d")
    void setNaryLink(NaryLink value);

    @objid ("eb9e4e8c-6a80-486d-94bb-7510802775b9")
    RequiredInterface getConsumer();

    @objid ("e61a5bfc-20cc-476e-b8aa-7f8c7ac6297c")
    void setConsumer(RequiredInterface value);

    @objid ("2f43f883-6796-4ede-88db-ac9e853016d3")
    ProvidedInterface getProvider();

    @objid ("54f05770-6c73-40ca-a6a3-ac0a0b96d33f")
    void setProvider(ProvidedInterface value);

}
