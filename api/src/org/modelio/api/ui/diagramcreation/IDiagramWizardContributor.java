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

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.ui.text.IElementFilter;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("5bfbaf98-911c-11e0-9de7-002564c97630")
public interface IDiagramWizardContributor extends IElementFilter {
    @objid ("5bfbaf99-911c-11e0-9de7-002564c97630")
    String getLabel();

    @objid ("5bfbd6a9-911c-11e0-9de7-002564c97630")
    String getInformation();

    @objid ("5bfc24cb-911c-11e0-9de7-002564c97630")
    String getHelpUrl();

    @objid ("3ad878c8-c8ec-11e0-9f93-002564c97630")
    String getDetails();

    @objid ("d94e0d28-5b07-11e2-9c97-002564c97630")
    Image getIcon();

    @objid ("d94e0d2a-5b07-11e2-9c97-002564c97630")
    AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription);

    @objid ("da6306cc-38d7-41f5-88ec-9599021b6497")
    void setLabel(String label);

    @objid ("4aeb29b3-4f9a-4028-aed3-705ace4c8e51")
    void setInformation(String information);

    @objid ("c4277a81-2a5d-4a8d-a54f-8a86e33f0ab6")
    void setHelpUrl(String helpUrl);

    @objid ("ef19f3c3-a351-403b-ad82-c104aacb4530")
    void setDetails(String details);

    @objid ("81a697c6-d601-4fa4-af43-fd48eac361a0")
    void setIcon(Image image);

    @objid ("d1ce840f-3d3c-44b4-b9d8-cac44b3ac404")
    void setParameters(Map<String, String> value);

    @objid ("257013c1-c85c-491e-99ea-7b6ec36cd667")
    void setScopes(List<CommandScope> scopes);

    @objid ("7bd7cbd5-143e-4de9-951f-316745ba3316")
    List<CommandScope> getScopes();

    @objid ("95dde3cd-8087-4447-987b-de191e07ba67")
    IModule getModule();

    @objid ("85f330fc-41fd-4a70-8a0d-81bb680f7f1c")
    void setModule(IModule module);

}
