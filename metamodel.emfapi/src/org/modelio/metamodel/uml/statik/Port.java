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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("0018a768-c4bf-1fd8-97fe-001ec947cd2a")
public interface Port extends BindableInstance {
    @objid ("1fde4365-8238-4cff-ac65-7a95283e5b2c")
    boolean isIsBehavior();

    @objid ("439b3b97-d452-4395-b4a1-4916b467d0dc")
    void setIsBehavior(boolean value);

    @objid ("8781d94a-91d9-4d60-a0bc-555a62822fc1")
    boolean isIsService();

    @objid ("026bb3ca-59f2-4bc9-af25-6998a18a05a5")
    void setIsService(boolean value);

    @objid ("516ccb50-1ce1-4748-9e80-7a2831a523a8")
    boolean isIsConjugated();

    @objid ("9455e280-361a-4e6a-8ce0-8f0988015c06")
    void setIsConjugated(boolean value);

    @objid ("94d835c7-6e63-4661-afca-8802503b1ac0")
    PortOrientation getDirection();

    @objid ("515e985c-79d1-434d-84a0-bcce220635cf")
    void setDirection(PortOrientation value);

    @objid ("bf05f274-b52e-4ace-ad55-c8ed73f2697f")
    EList<ProvidedInterface> getProvided();

    @objid ("f501dd7a-3dfa-4f26-bc46-a75fc8a76a5e")
    <T extends ProvidedInterface> List<T> getProvided(java.lang.Class<T> filterClass);

    @objid ("a30e796d-b5c8-45a9-88dd-48d290841fd1")
    EList<RequiredInterface> getRequired();

    @objid ("7077a308-483d-4a4c-b72a-e0db8a26c55e")
    <T extends RequiredInterface> List<T> getRequired(java.lang.Class<T> filterClass);

}
