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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Package;
import org.osgi.framework.Bundle;

@objid ("ccb1a50b-4d4a-4a7f-8522-653bb74f2664")
public class UseCaseDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("6e62d737-ea71-4d66-9752-6cf19e47995d")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        AbstractDiagram diagram = createUseCaseDiagram(modelFactory, diagramName, diagramContext);
        
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

    @objid ("3f99e689-ead0-40e7-a779-89581d9852f8")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.UseCase.Details");
    }

    @objid ("48ce1fa8-a89f-4b9e-ac12-e1dc36558b9e")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(UseCaseDiagram.class));
    }

    @objid ("cf487b66-bfa7-4967-935a-d1122c67e7ad")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.UseCase.Information");
    }

    @objid ("98adab97-5467-468a-9edc-dd6ae75b0aab")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.UseCase.Name");
    }

    @objid ("ccf81529-c52e-4a1c-8ff4-3ab675269992")
    private StaticDiagram createUseCaseDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        // Create the UseCase diagram
        StaticDiagram diagram;
        diagram = modelFactory.createUseCaseDiagram(diagramName, diagramContext, null);
        return diagram;
    }

    @objid ("e7246b22-bc7a-4095-bb50-c568c070c923")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Package.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Interface.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(UseCase.class), null));
        return allowedScopes;
    }

    @objid ("f1cbe018-f313-4154-b11c-8a22b8bcf8bb")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/usecasediagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
