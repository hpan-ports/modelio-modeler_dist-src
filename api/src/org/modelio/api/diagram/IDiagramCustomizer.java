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
                                    

package org.modelio.api.diagram;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.gef.palette.PaletteRoot;
import org.modelio.api.diagram.tools.PaletteEntry;
import org.modelio.api.module.IModule;

/**
 * This interface is used to define a diagram palette for a module.
 */
@objid ("4117ad6b-7010-11e0-b520-001ec947cd2a")
public interface IDiagramCustomizer {
    /**
     * Indicates whether the 'standard' content of the diagram palette must be kept or flushed when opening this stereotyped
     * diagram.
     * @return <code>true</code> when the 'standard' content of the diagram palette must be kept.
     */
    @objid ("52c272ec-7010-11e0-b520-001ec947cd2a")
    boolean keepBasePalette();

    /**
     * Define the palette content by adding groups and tools in it.<br>
     * Tools can be custom (i.e. added by modules) or standard tools, usually named after their metaclass (like 'CREATE_NOTE').
     * @param root
     * The root PaletteEntry for the palette model.
     */
    @objid ("a3c0dfb5-0ecc-11e2-96c4-002564c97630")
    void fillPalette(PaletteRoot paletteRoot);

    /**
     * Initialize the customizer. Called right after the constructor. Passed values are collected from the module.xml definition of
     * the customizer.
     * @param module
     * @param tools
     * @param hParameters
     * @param keepBasePalette
     */
    @objid ("818c8e90-2346-4720-9037-273bcfebb23a")
    void initialize(IModule module, List<PaletteEntry> tools, Map<String, String> hParameters, boolean keepBasePalette);

    /**
     * Return the handler parameters as defined in the module.xml file
     * @return
     */
    @objid ("1f36ed7d-2b15-417e-bfa9-6aefc018b60f")
    Map<String, String> getParameters();

}
