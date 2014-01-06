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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("0018a768-c4bf-1fd8-97fe-001ec947cd2a")
public interface Port extends BindableInstance {
    @objid ("1be9f4a1-05bc-46a8-8616-71c6edfb5dc7")
    boolean isIsBehavior();

    @objid ("fb97ca9b-2cfc-40f5-9b17-5b835e6eb5b8")
    void setIsBehavior(boolean value);

    @objid ("f776ff36-a281-41e6-847b-5eedda4889ee")
    boolean isIsService();

    @objid ("5dfe034d-195a-478c-a44c-8448996a8bda")
    void setIsService(boolean value);

    @objid ("5b342019-e14c-4e35-98e9-ebacb8a92ee3")
    boolean isIsConjugated();

    @objid ("1be276b4-0097-41bb-bcce-e27b160011fe")
    void setIsConjugated(boolean value);

    @objid ("b3192652-6710-449e-9a04-ebdc7d731d31")
    PortOrientation getDirection();

    @objid ("608f1d8c-3f31-4051-adf4-f4e3bed1a71b")
    void setDirection(PortOrientation value);

    @objid ("c3581196-a900-4376-9a51-f263d5529b80")
    EList<ProvidedInterface> getProvided();

    @objid ("56c55f6f-299c-41c8-a07c-c5e51df649b0")
    <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass);

    @objid ("bca8c7df-ef06-487e-b9b3-4bad8c936920")
    EList<RequiredInterface> getRequired();

    @objid ("1d53c3d6-f5c9-4662-b852-2a3ad786b725")
    <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass);

}
