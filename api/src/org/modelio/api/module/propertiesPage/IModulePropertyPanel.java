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


package org.modelio.api.module.propertiesPage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;

@objid ("b0ecb3ae-0375-46b9-bc56-757dca2b706d")
public interface IModulePropertyPanel {
    /**
     * Get the name of the property page.
     * @return the name of the property page.
     */
    @objid ("00d00158-0001-5e73-0000-000000000000")
    String getName();

    /**
     * Get the label of this property page.
     * @return the text that will be displayed in the property page's label.
     */
    @objid ("00d00158-0001-5e77-0000-000000000000")
    String getLabel();

    /**
     * Get the module of this property page.
     * @return the module displaying this property page.
     */
    @objid ("00d00158-0001-5e84-0000-000000000000")
    IModule getModule();

    /**
     * Set the name of the property page.
     * @param name the name of the property page.
     */
    @objid ("2c497859-e5f5-11e0-9cef-bc305ba4815c")
    void setName(final String name);

    /**
     * Set the labe of this property page.
     * @param label the text that will be displayed in the property page's label.
     */
    @objid ("2c499f6d-e5f5-11e0-9cef-bc305ba4815c")
    void setLabel(final String label);

    /**
     * Set the mdac of this property page.
     * @param mdac the module owning this property page.
     */
    @objid ("2c49c67b-e5f5-11e0-9cef-bc305ba4815c")
    void setModule(final IModule mdac);

}
