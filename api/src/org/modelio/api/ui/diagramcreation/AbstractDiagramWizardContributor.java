/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.ui.diagramcreation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Convenience class that provides an abstract implementation of IDiagramWizardContributor that only provides useful fields and
 * their getters/setters.
 * 
 * @author phv
 */
@objid ("691786dd-317c-43fb-85c4-67cc56fb5001")
public abstract class AbstractDiagramWizardContributor implements IDiagramWizardContributor {
    @objid ("e3203f8d-5075-4c9e-84c8-4749fe7bc731")
    private String label;

    @objid ("96bb33e9-9a0b-4f25-8dd7-2cf1f78ecc7a")
    private String information;

    @objid ("29b0f5ee-244b-4399-9555-f42b4656ae6b")
    private String helpUrl;

    @objid ("45a797ab-3789-4d1b-bbe8-431f4194af32")
    private String details;

    @objid ("fd0ec4e7-f880-4b32-8496-9d0b750919a4")
    private Map<String, String> parameters;

    @objid ("e042ac16-f027-48f3-9bcb-594c6b858e40")
    private Image icon;

    @objid ("bc05b102-6741-4631-bc08-5b68cb5f3fba")
    private List<CommandScope> scopes;

    @objid ("7ba201bc-773e-4b07-a710-1154baaf8d10")
    private IModule contributingModule;

    @objid ("b6ebd015-9c5f-49ec-841a-ec267ddb7ae0")
    public AbstractDiagramWizardContributor() {
        // Ensure non null containers
        this.parameters = new HashMap<>();
        this.scopes = new ArrayList<>();
    }

    @objid ("bd7b6952-cfce-474f-836b-a79c38d5eeb7")
    @Override
    public String getLabel() {
        return this.label;
    }

    @objid ("8a263d86-95aa-47f9-9233-659dac898302")
    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @objid ("94d1a2fd-babb-4a39-aed7-ec42ecd2415f")
    @Override
    public String getInformation() {
        return this.information;
    }

    @objid ("763a10a6-2c47-4288-8562-1c7220de2041")
    @Override
    public void setInformation(String information) {
        this.information = information;
    }

    @objid ("95011ec1-9362-49d2-8fde-5fb6d110c79e")
    @Override
    public String getHelpUrl() {
        return this.helpUrl;
    }

    @objid ("d89f28b2-e841-4d67-bcc9-6f3580d38abe")
    @Override
    public void setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
    }

    @objid ("b79bb9b9-8efe-4c95-a476-96910fd55693")
    @Override
    public String getDetails() {
        return this.details;
    }

    @objid ("54348e24-d8ea-4665-ba3b-96a2b2a8c6c0")
    @Override
    public void setDetails(String details) {
        this.details = details;
    }

    @objid ("6a8c9ac0-e7f6-4efd-a326-8ed3854099de")
    @Override
    public Image getIcon() {
        return this.icon;
    }

    @objid ("ed45399f-a681-466b-9be6-54ecfb50ac26")
    @Override
    public void setIcon(Image icon) {
        this.icon = icon;
    }

    @objid ("b5c01b2a-ddaf-46cb-bf8c-7f84164b689d")
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @objid ("edc85c46-667c-4214-ba4d-8b1523bbbb58")
    @Override
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @objid ("f5edb88f-7071-4dcc-810a-416aa03f5235")
    @Override
    public List<CommandScope> getScopes() {
        return this.scopes;
    }

    @objid ("21c2744b-2dc5-48e9-aef6-a7f012d45d12")
    @Override
    public void setScopes(List<CommandScope> scopes) {
        this.scopes = scopes;
    }

    @objid ("272fcec7-a36e-4663-9f35-19b723def89f")
    @Override
    public abstract boolean accept(MObject element);

    @objid ("05eef794-622e-4b22-87bc-d484253a878d")
    @Override
    public abstract AbstractDiagram actionPerformed(ModelElement diagramContext, String diagramName, String diagramDescription);

    @objid ("e4e8d85b-7497-4e45-a7b6-154f8c8004a2")
    @Override
    public IModule getModule() {
        return this.contributingModule;
    }

    @objid ("c7d412b4-db65-4b8d-b166-9d211b06b1b0")
    @Override
    public void setModule(IModule module) {
        this.contributingModule = module;
    }

}
