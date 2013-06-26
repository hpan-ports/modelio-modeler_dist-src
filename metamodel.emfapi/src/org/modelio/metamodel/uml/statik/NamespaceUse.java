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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("0012264a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NamespaceUse extends Element {
    @objid ("fa510ce0-795e-4020-a70a-17a2a2009e22")
    NameSpace getUser();

    @objid ("853a714a-3637-4e6e-95f8-2dc383fec698")
    void setUser(NameSpace value);

    @objid ("d90aefdf-4544-4238-9e22-49c18c13d234")
    NameSpace getUsed();

    @objid ("a67454f0-5ecc-46ec-9d04-b2f2d6cde2b9")
    void setUsed(NameSpace value);

    @objid ("893a5cc5-604a-478a-b0d3-e29e97167676")
    EList<Element> getCause();

    @objid ("ca4792dd-3db5-4bfb-b523-a4bf4a4d4e3a")
    <T extends Element> List<T> getCause(java.lang.Class<T> filterClass);

}
