/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.Dictionary;

/**
 * Term v0.0.9054
 * 
 * 
 * Dictionary term definition. The Definition attribute is used to store the term definition. A term belongs to a Dictionary.
 */
@objid ("006241a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Term extends AnalystElement {
    @objid ("0128d64a-684b-43dc-b9fc-681ad3ba6655")
    public static final String MNAME = "Term";

    /**
     * Getter for relation 'Term->OwnerDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8b168bb9-6445-4c53-98d8-26b60c6468b8")
    Dictionary getOwnerDictionary();

    /**
     * Setter for relation 'Term->OwnerDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cef22133-7faf-452d-9ea1-14fa509df2c6")
    void setOwnerDictionary(Dictionary value);

    /**
     * Getter for relation 'Term->ArchivedTermVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("da3cff3e-3ab8-48ff-9df9-e0605fa1493b")
    EList<Term> getArchivedTermVersion();

    /**
     * Filtered Getter for relation 'Term->ArchivedTermVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cddf5360-4ff0-4d37-8af8-00d0e717d125")
    <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Term->LastTermVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("afddc596-37b1-4368-aff1-80e15c516fa6")
    Term getLastTermVersion();

    /**
     * Setter for relation 'Term->LastTermVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d8ba9052-d136-4d7b-9edd-9815f8c10244")
    void setLastTermVersion(Term value);

}
