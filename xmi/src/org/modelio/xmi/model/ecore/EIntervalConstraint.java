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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("2f8fb650-83c3-4a99-a44a-72ec06b3f927")
public class EIntervalConstraint extends ENamedElement implements IEElement {
    @objid ("81930ad3-a844-476c-bba2-00dc86ea6807")
    public Element createObjingElt() {
        return null;
    }

    @objid ("220cc290-9ce0-40a8-b1d2-bcdc36d98a7c")
    public EIntervalConstraint(org.eclipse.uml2.uml.IntervalConstraint element) {
        super(element);
    }

    @objid ("caa048d1-2b5c-4109-8a69-316d81637a25")
    public void attach(Element objingElt) {
    }

    @objid ("1c6e8576-8dc3-4d4f-a24e-c7e7c4e744b1")
    public void attach(List<Object> objingElts) {
    }

    @objid ("701069cf-fa14-40f4-b292-f71887d0b3fb")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
