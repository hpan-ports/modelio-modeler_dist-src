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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;

@objid ("62efa8ac-4b66-4ce6-bc08-86fd413905ce")
public interface ComponentRealization extends ModelElement {
    @objid ("dab12abc-6a40-4c05-9d53-619e9a49ab49")
    Classifier getRealizingClassifier();

    @objid ("033711b6-b3b2-4028-a100-6479978762f7")
    void setRealizingClassifier(Classifier value);

    @objid ("fdef42e6-a412-4aec-951a-66dddcf1ec6b")
    Component getAbstraction();

    @objid ("c2e85380-846d-4d57-bb25-8e2760dde38b")
    void setAbstraction(Component value);

}
