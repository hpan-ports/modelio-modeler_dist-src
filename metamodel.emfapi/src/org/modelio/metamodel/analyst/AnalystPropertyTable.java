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
package org.modelio.metamodel.analyst;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;

@objid ("00899cf2-ec8f-1098-b22e-001ec947cd2a")
public interface AnalystPropertyTable extends TypedPropertyTable {
    @objid ("7c2145c1-c3b3-4304-a78e-228c61c240e2")
    AnalystItem getAnalystOwner();

    @objid ("858605e2-f3a6-4fba-a398-e25e0a64c714")
    void setAnalystOwner(AnalystItem value);

}
