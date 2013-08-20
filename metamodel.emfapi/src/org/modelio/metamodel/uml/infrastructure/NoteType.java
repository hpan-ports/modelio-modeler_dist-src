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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;

@objid ("008bb80c-c4be-1fd8-97fe-001ec947cd2a")
public interface NoteType extends ModelElement {
    @objid ("86c9b1d3-36e0-4281-ae56-13648e6465ec")
    ModuleComponent getModule();

    @objid ("2f435fab-7d76-4dab-9ce4-7695d16f5aab")
    boolean isIsHidden();

    @objid ("e7a3a6e7-a087-42d6-b6df-f14e8db7a546")
    void setIsHidden(boolean value);

    @objid ("157c4367-7679-4628-b046-61324bc5dab3")
    String getLabelKey();

    @objid ("bfbf15a2-9f74-46fc-a7f5-f19f2491c432")
    void setLabelKey(String value);

    @objid ("901a52a8-65bd-4baf-8c10-bebef0ba193e")
    EList<Note> getElement();

    @objid ("0a4b4175-2a1c-46c8-926c-dfd6920879e3")
    <T extends Note> List<T> getElement(java.lang.Class<T> filterClass);

    @objid ("9edb2320-d9e2-4331-89e0-e902d83c61bb")
    Stereotype getOwnerStereotype();

    @objid ("a9f0f208-ceb2-4a1c-94fe-7abaed2461bb")
    void setOwnerStereotype(Stereotype value);

    @objid ("7edfa865-09ce-433e-bf08-50133d4f795d")
    MetaclassReference getOwnerReference();

    @objid ("33a95f87-ca1e-456e-8443-b2f1d6abe17e")
    void setOwnerReference(MetaclassReference value);

}
