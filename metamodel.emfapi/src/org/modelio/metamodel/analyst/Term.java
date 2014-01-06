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
import org.modelio.metamodel.analyst.Dictionary;

@objid ("006241a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Term extends AnalystElement {
    @objid ("ffae1be2-0f69-4586-a920-0ff68609cf57")
    Dictionary getOwnerDictionary();

    @objid ("b15c78c1-e5f7-49c4-a3f7-76c43011ddb1")
    void setOwnerDictionary(Dictionary value);

    @objid ("403eb2a4-80a4-48fe-b325-71fe9ab0dd82")
    EList<Term> getArchivedTermVersion();

    @objid ("e87c5cf6-58d4-4cee-b5a0-5df23f8db39b")
    <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass);

    @objid ("4d2a5c45-422b-41b8-96f7-fae659f88968")
    Term getLastTermVersion();

    @objid ("b9dc6719-5511-4c5f-aff2-1a987edd5375")
    void setLastTermVersion(Term value);

}
