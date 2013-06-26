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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("001d18e8-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameter extends GeneralClass {
    @objid ("20fa0168-bb2e-43c9-89c3-eb7139a086c5")
    String getDefaultValue();

    @objid ("e92a87a2-f365-4418-affe-18e0be45451b")
    void setDefaultValue(String value);

    @objid ("4627cb38-08cd-4166-bc8e-7dca60cc53cf")
    boolean isIsValueParameter();

    @objid ("94a84c44-66c4-4fcf-af2d-7c3d9241c044")
    void setIsValueParameter(boolean value);

    @objid ("5dc9a968-834b-4deb-b8d8-178adef8b56f")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    @objid ("049bac91-b380-4fef-bdf6-9336318e6931")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    @objid ("3b293d44-309f-4cec-8179-fd859752638f")
    ModelElement getType();

    @objid ("2e8f4815-b672-4fbd-b846-3a3e79468215")
    void setType(ModelElement value);

    @objid ("67690501-fde8-49fc-a976-5a2d880b5485")
    NameSpace getParameterized();

    @objid ("caf22980-f9e0-40d7-a39e-566d53687b4c")
    void setParameterized(NameSpace value);

    @objid ("019b00f5-dfd4-4633-a258-07d9170d34fd")
    ModelElement getOwnedParameterElement();

    @objid ("2b246ed6-900a-45c8-87b1-bb5fec409467")
    void setOwnedParameterElement(ModelElement value);

    @objid ("ff1301e5-2743-450a-a70d-980ae4352924")
    ModelElement getDefaultType();

    @objid ("3b2c6459-71d6-430d-b6c1-a84a08499a5d")
    void setDefaultType(ModelElement value);

    @objid ("e3279b6b-c554-4782-8b73-9fc359877f77")
    Operation getParameterizedOperation();

    @objid ("c82249ea-1d2a-4631-98f0-bbbf63dcdbbb")
    void setParameterizedOperation(Operation value);

}
