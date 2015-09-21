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


package org.modelio.api.module.commands;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of the {@link IModuleCommandHandler} interface.
 * <p>
 * This default implementation may be inherited by the module developers in order
 * to simplify the code writing of a contextual command.
 */
@objid ("00d00158-0001-5e0d-0000-000000000000")
public abstract class DefaultModuleCommandHandler implements IModuleCommandHandler {
    @mdl.prop
    @objid ("60fe6fa0-69e5-4342-9738-28eb9bd0dd76")
    private Map<String, String> parameters;

    @mdl.propgetter
    public Map<String, String> getParameters() {
        // Automatically generated method. Please do not modify this code.
        return this.parameters;
    }

    @mdl.prop
    @objid ("ec38bb25-9b75-4a44-9c0d-7413ff8a4195")
    private List<CommandScope> scopes;

    @mdl.propgetter
    public List<CommandScope> getScopes() {
        // Automatically generated method. Please do not modify this code.
        return this.scopes;
    }

    /**
     * The handler accepts elements matching the scopes
     */
    @objid ("00d012e4-0000-5905-0000-000000000000")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        boolean match = false;
        
        for (MObject mObj : selectedElements) {
            for (CommandScope scope : getScopes()) {
                if (mObj instanceof Element) {
                    if (scope.isMatching((Element) mObj, true)) {
                        match = true;
                        break;
                    }
                }
            }
        }
        return match;
    }

    /**
     * The handler is active by default.
     */
    @objid ("00d012e4-0000-590e-0000-000000000000")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    @objid ("dd26144d-e5c6-440e-8270-1eb569f4345f")
    @SuppressWarnings("hiding")
    @Override
    public void initialize(List<CommandScope> scopes, Map<String, String> hParameters) {
        this.scopes = scopes;
        this.parameters = hParameters;
    }

    /**
     * get a parameter value.
     * @param key a parameter key
     * @return the parameter value
     */
    @objid ("f1009c29-3449-4cc9-8275-518150ecc410")
    public String getParameter(final String key) {
        return this.parameters.get(key);
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
     * @param module the module
     * @param metaclass the metaclass to look from
     * @param stereotypeSpec the stereotype specification
     * @return the found stereotype or <i>null</i>.
     */
    @objid ("3e64be76-bd49-497e-b48d-a575d352fa87")
    public final Stereotype findStereotypeFromSpec(IModule module, MClass metaclass, String stereotypeSpec) {
        return StereotypeSpecReader.findStereotypeFromSpec(module.getModelingSession(), metaclass, stereotypeSpec);
    }

}
