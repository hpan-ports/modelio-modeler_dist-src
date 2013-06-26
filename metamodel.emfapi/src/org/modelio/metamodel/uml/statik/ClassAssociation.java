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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NaryAssociation;

@objid ("0002bc78-c4bf-1fd8-97fe-001ec947cd2a")
public interface ClassAssociation extends ModelElement {
    @objid ("f97b27a5-8af7-4748-af2b-4bbf325bb3c5")
    NaryAssociation getNaryAssociationPart();

    @objid ("d7ed626a-5e71-4ddf-b272-d1322353552f")
    void setNaryAssociationPart(NaryAssociation value);

    @objid ("da4d555b-cdfd-478a-9911-585ceca94049")
    Class getClassPart();

    @objid ("e4278619-8014-4450-9427-785cb28302aa")
    void setClassPart(Class value);

    @objid ("99213d4c-5ebb-41ba-94b4-9b448e60e2e6")
    Association getAssociationPart();

    @objid ("a9fbf42e-9790-485a-aea9-1b5fe961106d")
    void setAssociationPart(Association value);

}
