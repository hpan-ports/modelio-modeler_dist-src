/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.api.diagram.tools;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.module.commands.StereotypeSpecReader;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * Base implementation of {@link IDiagramTool}.
 */
@objid ("1fba9239-5971-4de1-8f03-780e11a9c892")
public abstract class DefaultDiagramTool implements IDiagramTool {
    @mdl.prop
    @objid ("01e402b4-0000-6b83-0000-000000000000")
    private String label;

    @mdl.propgetter
    public String getLabel() {
        // Automatically generated method. Please do not modify this code.
        return this.label;
    }

    @mdl.prop
    @objid ("01e402b4-0000-6b89-0000-000000000000")
    private String tooltip;

    @mdl.propgetter
    public String getTooltip() {
        // Automatically generated method. Please do not modify this code.
        return this.tooltip;
    }

    @mdl.prop
    @objid ("72aac051-ad0d-4b9a-91c7-d2ca3ab1fd99")
    private Map<String, String> parameters;

    @mdl.propgetter
    public Map<String, String> getParameters() {
        // Automatically generated method. Please do not modify this code.
        return this.parameters;
    }

    @mdl.prop
    @objid ("bb92c1f1-d828-43e0-bf5c-53968825dfcc")
    private List<CommandScope> sourceScopes;

    @mdl.propgetter
    public List<CommandScope> getSourceScopes() {
        // Automatically generated method. Please do not modify this code.
        return this.sourceScopes;
    }

    @mdl.prop
    @objid ("bea9a4c7-7d96-4118-8305-4cece703edcc")
    private List<CommandScope> targetScopes;

    @mdl.propgetter
    public List<CommandScope> getTargetScopes() {
        // Automatically generated method. Please do not modify this code.
        return this.targetScopes;
    }

    @objid ("5fbf54e7-b547-4fbf-950d-5c2dec5385a4")
    private IModule module;

    @mdl.prop
    @objid ("004f12bf-a508-4ba8-9cb2-9b5a06f93410")
    private ImageDescriptor bitmap;

    @mdl.propgetter
    public ImageDescriptor getBitmap() {
        // Automatically generated method. Please do not modify this code.
        return this.bitmap;
    }

    /**
     * Convenience to get a parameter value.
     * @param key the parameter
     * @return the value or null.
     */
    @objid ("557bd8ae-62c9-4931-b966-ceefc23cf15e")
    public String getParameter(String key) {
        return this.parameters.get(key);
    }

    @objid ("07a7325b-a0d6-4d65-8b24-b6e1d0e76ce1")
    @SuppressWarnings("hiding")
    @Override
    public void decorate(String label, String tooltip, ImageDescriptor image) {
        this.label = label;
        this.tooltip = tooltip;
        this.bitmap = image;
    }

    @objid ("5620d586-91b1-4e86-a049-b652f438f843")
    @SuppressWarnings("hiding")
    @Override
    public void initialize(List<CommandScope> sourceScopes, List<CommandScope> targetScopes, Map<String, String> parameters, IModule module) {
        this.sourceScopes = sourceScopes;
        this.targetScopes = targetScopes;
        this.parameters = parameters;
        this.module = module;
    }

    @objid ("21f3f61a-ce9a-4f77-b2f3-ef9db1b325bc")
    @Override
    public IModule getModule() {
        return this.module;
    }

    /**
     * Find the stereotype from a stereotype specification.
     * <p>
     * The stereotype specification may have one of the following formats:<ul>
     * <li> <i>stereotype name</i>
     * <li> <i>module name<b>#</b>stereotype name</i>
     * <li> <i>module regex<b>#</b>stereotype name</i>
     * <li> <i>module regex<b>#</b>stereotype regex</i>
     * </ul>
     * Returns <i>null</i> if the specification is <i>null</i> or the stereotype is not found.
     * @param metaclass the metaclass to look from
     * @param stereotypeSpec the stereotype specification
     * @return the found stereotype or <i>null</i>.
     */
    @objid ("a01f3f16-61c7-49d1-a082-706a1c0d52fc")
    protected final Stereotype findStereotypeFromSpec(MClass metaclass, String stereotypeSpec) {
        return StereotypeSpecReader.findStereotypeFromSpec(getModule().getModelingSession(), metaclass, stereotypeSpec);
    }

}
