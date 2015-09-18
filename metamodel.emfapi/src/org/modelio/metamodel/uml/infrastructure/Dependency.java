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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0085d9be-c4be-1fd8-97fe-001ec947cd2a")
public interface Dependency extends ModelElement {
    @objid ("4f13bcf9-433d-4031-95b9-e0e91f70fcb4")
    String getDependsOnId();

    @objid ("5c60653c-d9d8-4bcc-ad34-713d4cbdb62f")
    void setDependsOnId(String value);

    @objid ("17572dfa-698c-454a-b554-7fe536296162")
    String getDependsOnName();

    @objid ("92774629-87ed-4339-927c-6e7db251a2d3")
    void setDependsOnName(String value);

    @objid ("0399b3e8-5623-482c-811c-ace74650a255")
    ModelElement getDependsOn();

    @objid ("88861629-7df8-4ccc-8feb-6eae5b4ec9d7")
    void setDependsOn(ModelElement value);

    @objid ("06550b35-702c-4713-964c-dbee2647ec9a")
    ModelElement getImpacted();

    @objid ("ebf2866a-94df-467b-9f5a-14ee56d1a8bd")
    void setImpacted(ModelElement value);

}
