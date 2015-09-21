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
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.osgi.framework.Bundle;

@objid ("b79b3869-00ce-42c7-bc93-4bb83f24888c")
public class DeploymentDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("65419b8f-51eb-43cd-a6b8-bc0af296134d")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        StaticDiagram diagram = createDeploymentDiagram(modelFactory, diagramName, diagramContext);
        
        if (diagram != null) {
            if (diagramName.equals(getLabel())) {
                setElementDefaultName(diagram);
            } else {
                diagram.setName(diagramName);
            }
            putNoteContent(diagram, "description", diagramDescription);
        }
        return diagram;
    }

    @objid ("c235a863-3379-4422-bb27-81b026d60357")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Deployment.Details");
    }

    @objid ("fdb94d4c-71d1-4106-ba0c-e13ae56040ea")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(DeploymentDiagram.class));
    }

    @objid ("1aacfaf6-a6d2-421f-b9a7-410f46a84415")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Deployment.Information");
    }

    @objid ("f3176b6c-e024-47f7-b29d-13570704130e")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Deployment.Name");
    }

    @objid ("030942a0-6241-4773-bfe6-7fec875610fb")
    private StaticDiagram createDeploymentDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        // Create the Deployment diagram
        StaticDiagram diagram;
        diagram = modelFactory.createDeploymentDiagram(diagramName, diagramContext, null);
        return diagram;
    }

    @objid ("06c64e02-b66e-4b3a-a837-4514e539d96d")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Artifact.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Package.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Node.class), null));
        return allowedScopes;
    }

    @objid ("1ee3950a-a47f-470e-8c5d-6c80130cbf08")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/deploimentdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
