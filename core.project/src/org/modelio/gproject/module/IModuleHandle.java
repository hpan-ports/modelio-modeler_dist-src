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
                                    

package org.modelio.gproject.module;

import java.nio.file.Path;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

/**
 * Structure representing a module physical contents.
 */
@objid ("b0b56179-f2b7-11e1-90ff-002564c97630")
public interface IModuleHandle {
    /**
     * @return the required Modelio version.
     */
    @objid ("f07195e0-f2bb-11e1-90ff-002564c97630")
    Version getBinaryVersion();

    /**
     * @return the needed modules.
     */
    @objid ("f071bcea-f2bb-11e1-90ff-002564c97630")
    List<ModuleId> getDependencies();

    @objid ("b4804c2b-f2b7-11e1-90ff-002564c97630")
    List<Path> getDocPaths();

    @objid ("b47fd6fc-f2b7-11e1-90ff-002564c97630")
    Path getDynamicModelPath();

    /**
     * @return the module .jar files.
     */
    @objid ("b47fd700-f2b7-11e1-90ff-002564c97630")
    List<Path> getJarPaths();

    /**
     * @return <code>true</code> if a license is required.
     */
    @objid ("f07195de-f2bb-11e1-90ff-002564c97630")
    boolean isLicenseRequired();

    /**
     * @return the module main java class name.
     */
    @objid ("f07195dc-f2bb-11e1-90ff-002564c97630")
    String getMainClassName();

    /**
     * @return the path to the module .ramc file.
     */
    @objid ("b47fd6fa-f2b7-11e1-90ff-002564c97630")
    Path getModelComponentPath();

    @objid ("b47fafec-f2b7-11e1-90ff-002564c97630")
    Path getModuleInfosPath();

    /**
     * @return the module name.
     */
    @objid ("b47f88d9-f2b7-11e1-90ff-002564c97630")
    String getName();

    /**
     * @return the module resources path.
     */
    @objid ("b47fd6fe-f2b7-11e1-90ff-002564c97630")
    Path getResourcePath();

    /**
     * @return the UUID of the module component.
     */
    @objid ("f07195da-f2bb-11e1-90ff-002564c97630")
    String getUid();

    /**
     * @return the module version.
     */
    @objid ("b47fafea-f2b7-11e1-90ff-002564c97630")
    Version getVersion();

    /**
     * @return the module weak dependencies.
     */
    @objid ("f071bcee-f2bb-11e1-90ff-002564c97630")
    List<ModuleId> getWeakDependencies();

    /**
     * @return the module archive path.
     */
    @objid ("d95f3e31-37da-11e2-8ba4-002564c97630")
    Path getArchive();

}
