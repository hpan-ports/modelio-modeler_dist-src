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
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Node;
import org.osgi.framework.Bundle;

/**
 * Creation contributor for "Composite structure" diagrams.
 */
@objid ("9a4f178d-88a9-4e71-acbd-303e15a0f02b")
public class CompositeDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("51aaaa11-a3f0-4349-bea1-fd15d6e8a557")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        StaticDiagram diagram = createCompositeDiagram(modelFactory, diagramName, diagramContext);
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

    @objid ("21628747-3435-4bc5-baeb-ab2a49797a66")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Composite.Details");
    }

    @objid ("a8ad66d6-0a74-41ed-b229-457b648507a2")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(CompositeStructureDiagram.class));
    }

    @objid ("ee34be9c-a973-4ca2-b866-88d8137f5516")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Composite.Information");
    }

    @objid ("1a7722cf-b89b-4c03-b9b8-5b180f0190c2")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Composite.Name");
    }

    @objid ("a8668476-d993-40a4-ad96-ce4803fd9816")
    private StaticDiagram createCompositeDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        // Create the Composite diagram
        StaticDiagram diagram = modelFactory.createCompositeStructureDiagram();
        diagram.setName(diagramName);
        diagram.setOrigin(diagramContext);
        return diagram;
    }

    @objid ("fa5090ab-aaa1-49ac-9901-564f5db44a3c")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Collaboration.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Node.class), null));
        return allowedScopes;
    }

    @objid ("34afd8eb-0f56-4663-947b-a554da24a587")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/compositediagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
