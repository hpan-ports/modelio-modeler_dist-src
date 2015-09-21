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


package org.modelio.api.module;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

/**
 * Default implementation of the {@link IModuleSession} interface.
 * <p>
 * <p>
 * This default implementation may be inherited by the module developers in order to simplify the code writing of the mdac session.
 */
@objid ("01f40414-0000-3257-0000-000000000000")
public class DefaultModuleSession implements IModuleSession {
    @objid ("3ada8e8f-e5f6-4e37-9b4b-f19c2f37e8e9")
    protected IModule module;

    /**
     * Accepts the installation by default.
     * @param modelioPath the path of modelio application
     * @param installPath the path where the module archive contents have been expanded.
     * @return true if the module accepts to be installed false otherwise.
     * @throws org.modelio.api.module.ModuleException when the installation failed.
     */
    @objid ("01f40414-0000-3262-0000-000000000000")
    public static boolean install(String modelioPath, String installPath) throws ModuleException {
        return true;
    }

    @objid ("8ee5b972-907a-4e15-8238-0b2985410233")
    @Override
    public boolean select() throws ModuleException {
        return true;
    }

    @objid ("76600a23-df5b-4ec6-bd23-a7f4f9a4b936")
    @Override
    public boolean start() throws ModuleException {
        return true;
    }

    @objid ("5e01a052-5edd-46dd-b7bd-c643e07463f9")
    @Override
    public void stop() throws ModuleException {
    }

    @objid ("5d9fd4a8-6efc-4cec-b320-929e62f2b8bd")
    @Override
    public void unselect() throws ModuleException {
    }

    @objid ("b517bcee-215a-4a2b-b6a6-1d3b447f0bc7")
    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
    }

    @objid ("ee62f8e4-3cfc-4379-9394-7c40f1117037")
    public DefaultModuleSession(IModule module) {
        this.module = module;
    }

}
