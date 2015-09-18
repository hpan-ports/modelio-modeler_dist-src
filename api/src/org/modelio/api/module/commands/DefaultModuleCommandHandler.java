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
                                    

package org.modelio.api.module.commands;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Default implementation of the {@link IModuleContextualCommand} interface.
 * <p>
 * <p>
 * This default implementation may be inherited by the module developers in order to simplify the code writing of a contextual
 * command.
 * <p>
 * <p>
 */
@objid ("00d00158-0001-5e0d-0000-000000000000")
public class DefaultModuleCommandHandler implements IModuleCommandHandler {
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
     * Nothing is done, by default when the handler is launched.
     */
    @objid ("00d012e4-0000-58fe-0000-000000000000")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        // Do nothing
    }

    /**
     * The handler accepts elements matching the scopes
     */
    @objid ("00d012e4-0000-5905-0000-000000000000")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        boolean match = false;
        
        for (MObject mObj : selectedElements) {
            for (CommandScope scope : this.getScopes()) {
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
    @Override
    public void initialize(List<CommandScope> scopes, Map<String, String> hParameters) {
        this.scopes = scopes;
        this.parameters = hParameters;
    }

    @objid ("f1009c29-3449-4cc9-8275-518150ecc410")
    public String getParameter(final String key) {
        return this.parameters.get(key);
    }

}
