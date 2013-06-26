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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("0018a768-c4bf-1fd8-97fe-001ec947cd2a")
public interface Port extends BindableInstance {
    @objid ("8102f491-7235-4362-9519-b5fb59b902e6")
    boolean isIsBehavior();

    @objid ("ae8ea28a-04c1-4cfb-9c97-6987f314fec2")
    void setIsBehavior(boolean value);

    @objid ("49340bdf-3b4e-4fce-849d-235a8b31f33b")
    boolean isIsService();

    @objid ("01be65dc-e6a7-4996-af21-ed7742b89223")
    void setIsService(boolean value);

    @objid ("7fb94783-e54a-4c1d-84e1-e19aecbb024c")
    boolean isIsConjugated();

    @objid ("9bcd977d-f566-4f0b-a28b-5cdf61b6361c")
    void setIsConjugated(boolean value);

    @objid ("ddde8cd2-d6df-4a40-830f-b16bc6ce02bc")
    PortOrientation getDirection();

    @objid ("884f5e36-7e3b-491b-a377-a263ce31c323")
    void setDirection(PortOrientation value);

    @objid ("81dd2e83-ce3a-4c73-93c3-1427717e23dc")
    EList<ProvidedInterface> getProvided();

    @objid ("1a7554ba-e1ac-49de-9537-3725fcf9ec44")
    <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass);

    @objid ("1a92ca77-cd43-4272-be0a-0bbca043a664")
    EList<RequiredInterface> getRequired();

    @objid ("20ea558b-496a-4ee1-8e43-ab53dcfe0c4c")
    <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass);

}
