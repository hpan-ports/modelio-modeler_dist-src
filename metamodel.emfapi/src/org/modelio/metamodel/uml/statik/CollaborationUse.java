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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00047d6a-c4bf-1fd8-97fe-001ec947cd2a")
public interface CollaborationUse extends ModelElement {
    @objid ("94b661ee-9558-4613-8af5-c32809465725")
    Collaboration getType();

    @objid ("5734e018-f55c-4c30-b0d5-57cb2d423e9e")
    void setType(Collaboration value);

    @objid ("d6044779-9f71-4e5f-9d65-a47b18ee12e7")
    NameSpace getNRepresented();

    @objid ("48ab8553-ff48-42a5-9f98-2dc0c772415a")
    void setNRepresented(NameSpace value);

    @objid ("650fba77-87df-4d9f-83ac-6d836981f63f")
    Operation getORepresented();

    @objid ("d4dcd02b-9879-4a4a-86cc-5ada173ffe99")
    void setORepresented(Operation value);

    @objid ("20a642e3-194d-4083-a3f6-aa979b33ffcf")
    EList<Binding> getRoleBinding();

    @objid ("c7765459-0793-4201-abb4-c698e4834e29")
    <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass);

}
