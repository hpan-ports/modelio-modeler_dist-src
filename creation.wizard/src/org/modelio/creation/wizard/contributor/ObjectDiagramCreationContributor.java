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
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Package;
import org.osgi.framework.Bundle;

@objid ("fd71ebee-f6e3-4978-909a-87d31a90a620")
public class ObjectDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("388c4d0e-63a6-4786-9784-d841a8c27d3e")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        StaticDiagram diagram = createObjectDiagram(modelFactory, diagramName, diagramContext);
        
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

    @objid ("a8afe739-67fc-4c6b-9205-27c4b9badfad")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Object.Details");
    }

    @objid ("fecb5132-f07c-49ab-9cbd-8a2517782d50")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(ObjectDiagram.class));
    }

    @objid ("1173cf77-8c40-4ace-974e-5e554438a357")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Object.Information");
    }

    @objid ("6928ea38-4883-4c8f-8158-f639b6bc00c8")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Object.Name");
    }

    @objid ("3ec7ed9e-7366-4dd8-8aab-582d8f40d1db")
    private StaticDiagram createObjectDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        // Create the Object diagram
        StaticDiagram diagram;
        // TODO fix creation
        diagram = modelFactory.createObjectDiagram(diagramName, diagramContext, null);
        return diagram;
    }

    @objid ("bd3d54ac-5c8b-47a9-841c-828622fbd38a")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Artifact.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(BindableInstance.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Collaboration.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Instance.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Node.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Package.class), null));
        return allowedScopes;
    }

    @objid ("0473ffb0-2354-4ea2-bd2a-31421f10dd0b")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/objectdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
