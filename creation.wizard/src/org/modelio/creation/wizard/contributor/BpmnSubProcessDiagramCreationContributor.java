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


package org.modelio.creation.wizard.contributor;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.core.ui.images.MetamodelImageService;
import org.modelio.creation.wizard.plugin.CreationWizard;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.osgi.framework.Bundle;

@objid ("3e4b1657-cb8f-4925-a14b-6c02e8877ffd")
public class BpmnSubProcessDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("8e3fe408-1c52-443e-a4e2-4efdda11f7f9")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        BpmnSubProcessDiagram diagram = createBpmnSubProcessDiagram(modelFactory, diagramContext, diagramName);
        if (diagram != null) {
            putNoteContent(diagram, "description", diagramDescription);
        }
        return diagram;
    }

    @objid ("cae9e31e-b8c0-424b-b917-4380b119e75e")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(BpmnSubProcess.class), null));
        return allowedScopes;
    }

    @objid ("d90b0a09-66a2-4ec4-b681-26758fe74122")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnSubProcess.Details");
    }

    @objid ("d4454991-3606-4c96-9613-8ffb4b949cc3")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(BpmnSubProcessDiagram.class));
    }

    @objid ("da2ad714-7390-4933-bd66-1bb012b6e148")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnSubProcess.Information");
    }

    @objid ("1305e5bd-bdac-45dd-8295-07c6a5489674")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnSubProcess.Name");
    }

    @objid ("6478ea12-7a14-4e5d-bd31-06f2e6ab92ae")
    private BpmnSubProcessDiagram createBpmnSubProcessDiagram(final IModelFactory modelFactory, final ModelElement diagramContext, final String diagramName) {
        BpmnSubProcessDiagram diagram = modelFactory.createBpmnSubProcessDiagram();
        diagram.setOrigin(diagramContext);
        if (diagramName.equals(getLabel())) {
            setElementDefaultName(diagram);
        } else {
            diagram.setName(diagramName);
        }
        return diagram;
    }

    @objid ("e889d883-97a6-4ed1-980e-49004d11e4db")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/bpmnsubprocessdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
