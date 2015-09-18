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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;

@objid ("004545ca-c4bf-1fd8-97fe-001ec947cd2a")
public interface Gate extends MessageEnd {
    @objid ("ebb805b9-2763-4d33-9eef-d4782847b5f3")
    InteractionUse getOwnerUse();

    @objid ("1d1fbde2-ef82-48cc-a384-4e317a7fa278")
    void setOwnerUse(InteractionUse value);

    @objid ("fefc0e76-ebac-40de-8ce4-8317889764a8")
    EList<Gate> getActual();

    @objid ("fd45009c-e492-44df-b833-efb2e5b1224d")
    <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("10f030c8-a6fe-4b9a-a694-64104bb50f67")
    Interaction getOwnerInteraction();

    @objid ("bb4b14e4-8c41-44aa-89f5-ccd3c457e95d")
    void setOwnerInteraction(Interaction value);

    @objid ("056d7a79-d5a3-4904-a316-7ce3a12889cf")
    CombinedFragment getOwnerFragment();

    @objid ("90d6e169-b792-4955-8064-844703fb3fc7")
    void setOwnerFragment(CombinedFragment value);

    @objid ("afe92712-0684-47b8-8f33-1b0155299f98")
    Gate getFormal();

    @objid ("8b5f02a5-6f14-45a3-a984-5d9aa2ad875e")
    void setFormal(Gate value);

}
