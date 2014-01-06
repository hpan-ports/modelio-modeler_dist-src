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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.GenericAnalystContainer;

@objid ("b3e7a343-fe88-4eec-9078-87bfbbaaa3f0")
public interface GenericAnalystElement extends AnalystElement {
    @objid ("871f6925-3b9d-4a81-9dde-2d4193fc53ee")
    EList<GenericAnalystElement> getSubElement();

    @objid ("1d475a6e-600e-4909-b461-97eafcdda14f")
    <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass);

    @objid ("896de2b7-cb96-453e-9cb0-e4c2f91cbbed")
    GenericAnalystContainer getOwnerContainer();

    @objid ("6eb0f684-d79b-481f-a760-00c1b10bf069")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("d9536230-5fb7-4e61-989a-c935ec2355e5")
    GenericAnalystElement getParentElement();

    @objid ("c92e906a-b066-4569-bcbf-998a9389064d")
    void setParentElement(GenericAnalystElement value);

    @objid ("11e5a339-2f29-4919-9705-631fc9f300c0")
    GenericAnalystElement getLastElementVersion();

    @objid ("7bc570b4-d1f8-4db4-bcea-49fc10405564")
    void setLastElementVersion(GenericAnalystElement value);

    @objid ("df69ef64-d4c2-4ce6-b15c-df52b8fc13ae")
    EList<GenericAnalystElement> getArchivedElementVersion();

    @objid ("e6b7efe2-1cd2-4201-80d5-91920c3f69ab")
    <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass);

}
