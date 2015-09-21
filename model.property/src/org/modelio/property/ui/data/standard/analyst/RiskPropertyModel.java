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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Risk;

/**
 * <i>Risk</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Risk</i>
 * metaclass.
 */
@objid ("cbaf99ea-ad2a-4669-9dc5-d8affd17d07a")
public class RiskPropertyModel extends AbstractAnalystElementPropertyModel<Risk> {
    /**
     * Create a new <i>Risk</i> data model from an <i>Risk</i>.
     * @param modelService
     * @param activationService
     */
    @objid ("4923d747-07ab-4338-921b-a54ba560237b")
    public RiskPropertyModel(Risk theEditedElement, IMModelServices modelService, IProjectService projectService, IActivationService activationService) {
        super(theEditedElement, modelService, projectService, activationService);
    }

    @objid ("d903049a-4885-4a15-8a37-b2940356727b")
    @Override
    protected String getRichTextType() {
        return "risk";
    }

    @objid ("017e5f78-8ddb-43e3-871c-9d2a1e76c47a")
    @Override
    protected List<? extends AnalystElement> getOwnedAnalystElements() {
        return this.theEditedElement.getSubRisk();
    }

}
