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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Package;
import org.osgi.framework.Bundle;

@objid ("39851f12-62b1-432e-ba8a-9047d482fbbd")
public class ClassDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("feff20f2-74f8-4bf1-85c3-afc12bbf0e71")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        ClassDiagram diagram = modelFactory.createClassDiagram(diagramName, diagramContext, null);
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

    @objid ("460a1706-3d68-431e-b5f3-412931c6d926")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Class.Details");
    }

    @objid ("4f423b2f-a1dd-4703-b042-c56c9fbfec73")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(ClassDiagram.class));
    }

    @objid ("fc9be969-5317-4368-8d6d-fdcd9540afe4")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Class.Information");
    }

    @objid ("416af298-7e52-4174-9db1-73fb872270a4")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Class.Name");
    }

    @objid ("f12e049b-2f59-4e62-b776-d5afda32ffdb")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/classdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

    @objid ("23d5af8c-dda0-4f9b-b0b6-bd8b58265b0f")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Package.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Interface.class), null));
        return allowedScopes;
    }

}
