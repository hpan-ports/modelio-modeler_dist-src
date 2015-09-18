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
                                    

package org.modelio.mda.infra.service.dynamic.diagram.wizard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.diagram.ContributorCategory;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.ui.diagramcreation.IDiagramWizardContributor;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler.Jxbv2HParameter;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Handler;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Diagrams.Jxbv2DiagramType.Jxbv2Wizard;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Scope;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("9d453241-f387-4dfd-83c2-08d928f52fab")
public class DiagramWizardBuilder {
    @objid ("64a1fb92-86a1-4553-9bd4-18bc711156ab")
    public void registerWizard(IRTModule module, Jxbv2Wizard wizardDef, ContributorCategory wizardCategory) throws IOException {
        // Create contributor
        IDiagramWizardContributor contributor = createWizardContributor(wizardDef.getHandler(), module);
        
        // Initialize the contributor appearance
        contributor.setLabel(module.getLabel(wizardDef.getLabel()));
        contributor.setHelpUrl(wizardDef.getHelpUrl());
        contributor.setInformation(module.getLabel(wizardDef.getInformation()));
        contributor.setDetails(module.getLabel(wizardDef.getDetails()));
        contributor.setModule(module.getIModule());
        ImageDescriptor iconDescriptor;
        if (wizardDef.getIcon() != null && !wizardDef.getIcon().equals("")) {
            String bitmap = module.getConfiguration().getModuleResourcesPath() + "/" + module.getLabel(wizardDef.getIcon());
            iconDescriptor = ImageDescriptor.createFromImage(new Image(new Shell().getDisplay(), bitmap));
            contributor.setIcon(iconDescriptor.createImage());
        }
        
        // Initialize the applicable scopes
        List<CommandScope> scopes = new ArrayList<>();
        for (Jxbv2Scope scope : wizardDef.getScope()) {
            MClass mClass = Metamodel.getMClass(scope.getMetaclass());
            if (mClass != null) {
                Stereotype st = getStereotype(mClass, scope.getStereotype());
                scopes.add(new CommandScope(mClass, st));
            }
        }
        contributor.setScopes(scopes);
        
        // Initialize the contributor hParameters
        Map<String, String> hParameters = new HashMap<>();
        for (Jxbv2HParameter param : wizardDef.getHandler().getHParameter()) {
            hParameters.put(param.getName(), param.getValue());
        }
        contributor.setParameters(hParameters);
        
        // Register the contributor
        module.registerDiagramWizardContribution(wizardCategory, contributor);
    }

    @objid ("18e691b8-912b-44e7-b582-6559656cdaa3")
    private IDiagramWizardContributor instantiateCustomWizardContributor(Jxbv2Handler handlerDef, IRTModule module) throws IOException {
        try {
            // Load and instantiate the handler class in the same class loader
            // as the module.
            ClassLoader loader = module.getIModule().getClass().getClassLoader();
            Class<?> handlerClass = loader.loadClass(handlerDef.getClazz());
            return (IDiagramWizardContributor) handlerClass.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", handlerDef.getClazz()));
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
    }

    @objid ("abd33073-756f-40ee-a7f6-c7cc8d9a2d98")
    private Stereotype getStereotype(MClass metaclass, String stereotype) {
        if (stereotype == null)
            return null;
        if (stereotype.contains("#")) {
            String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, metaclass);
        } else {
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, metaclass);
        }
    }

    @objid ("f23f38b8-7576-4f7b-ab3c-6c9c88e169d0")
    private IDiagramWizardContributor createWizardContributor(Jxbv2Handler handlerDef, IRTModule module) throws IOException {
        switch (handlerDef.getClazz()) {
        case "GenericWizardContributor":
            return new GenericWizardContributor();
        default:
            return instantiateCustomWizardContributor(handlerDef, module);
        
        }
    }

}
