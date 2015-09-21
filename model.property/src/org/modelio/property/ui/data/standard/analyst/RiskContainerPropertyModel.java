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


package org.modelio.property.ui.data.standard.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.modelelement.ModelElementListType;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * <i>RiskContainer</i> data model.
 * <p>
 * This class provides the list of properties for the
 * <i>RiskContainer</i> metaclass.
 * <p>
 */
@objid ("02400ffd-259a-4e63-a3cc-4ea56e731308")
public class RiskContainerPropertyModel extends AbstractAnalystContainerPropertyModel<RiskContainer> {
    /**
     * Create a new <i>RiskContainer</i> data model from an <i>analyst
     * container</i>.
     * @param modelService
     * @param model
     * @param activationService
     * @param theEditedElement the analyst container
     */
    @objid ("a6b8411d-95c3-4270-8d7a-50e04a5d8edb")
    public RiskContainerPropertyModel(RiskContainer theEditedElement, IMModelServices modelService, IModel model, IProjectService projectService, IActivationService activationService) {
        super(theEditedElement, modelService, projectService, activationService, model);
    }

    @objid ("3bf032b0-d8a3-422e-8c6f-8327d3cddde4")
    @Override
    protected IPropertyType getAvailableSets() {
        List<ModelElement> availableSets = new ArrayList<>();
        
        String stereotypeFilter = "risk_propertyset";
        for (MObject elt : this.model.findByClass(this.theEditedElement.getMClass().getMetamodel().getMClass(PropertyTableDefinition.class), IModel.ISVALID)) {
            PropertyTableDefinition propertySet = (PropertyTableDefinition) elt;
        
            // Keep only property sets without stereotypes, or enforcing the
            if (propertySet.getExtension().isEmpty() || propertySet.isStereotyped("ModelerModule", stereotypeFilter)) {
                availableSets.add(propertySet);
            }
        }
        
        ModelElementListType type = new ModelElementListType(false, PropertyTableDefinition.class, availableSets, CoreSession.getSession(this.theEditedElement));
        return type;
    }

    @objid ("7f77e0c8-c62d-4378-a303-f27f2f7fd7b1")
    @Override
    protected List<? extends AnalystElement> getOwnedAnalystElements() {
        return this.theEditedElement.getOwnedRisk();
    }

}
