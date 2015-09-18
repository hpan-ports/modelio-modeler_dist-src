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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00047d6a-c4bf-1fd8-97fe-001ec947cd2a")
public interface CollaborationUse extends ModelElement {
    @objid ("79fec5bd-1887-4a61-8e9c-967fbbd0d973")
    Collaboration getType();

    @objid ("7e087b4d-3a4c-4cdc-94da-7630a343f5e5")
    void setType(Collaboration value);

    @objid ("f10665c8-e8ff-4d16-b522-57d8938fadea")
    NameSpace getNRepresented();

    @objid ("f5d92f5d-f6da-4c49-9388-7c16c78cfa1a")
    void setNRepresented(NameSpace value);

    @objid ("2fe85e6b-3ac4-4c8b-b002-6ad26943a6fa")
    Operation getORepresented();

    @objid ("7fdf945a-add8-4629-9151-27128390234e")
    void setORepresented(Operation value);

    @objid ("10db6e61-953c-4d00-98b0-9003f4de8b9e")
    EList<Binding> getRoleBinding();

    @objid ("f2fe4a3f-eb8b-41b5-91e5-17e4c5217997")
    <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass);

}
