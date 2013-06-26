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
                                    

package org.modelio.xmi.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * This interface represents the service provided by XMI plugin.
 * @author ebrosse
 */
@objid ("5a485c70-0178-46bb-96ac-5610679f6938")
public interface IXMI {
    /**
     * This service exports the given Package in the File xmiFile
     * @param configuration : the configuration of export process.
     * @throws java.lang.Exception : the first Exception occurring during the export
     */
    @objid ("a860282c-27f9-4e18-9ee2-1523c48e28b1")
    void exportXMIFile(final ExportConfiguration configuration) throws Exception;

    /**
     * This service imports the Model saved in the given XMI file.
     * The import result will be owned by the given Package.
     * @param configuration : the configuration of import process.
     * @throws java.lang.Exception : the first Exception occurring during the export
     */
    @objid ("c8569b37-093c-463e-ba30-437940d5e590")
    void importXMIModel(final ImportConfiguration configuration) throws Exception;

    /**
     * This service imports the Profile saved in the given XMI file.
     * The import result will be owned by the given IModule.
     * @param configuration : the configuration of import process.
     * @throws java.lang.Exception : the first Exception occurring during the export
     */
    @objid ("c923913e-43c1-4b87-b6c5-f58ecc588437")
    void importXMIProfile(final ImportConfiguration configuration) throws Exception;

    /**
     * This service export the Profile saved in the given XMI file.
     * The export result will be owned by the given IModule.
     * @param configuration : the configuration of import process.
     * @throws java.lang.Exception : the first Exception occurring during the export
     */
    @objid ("f72aed51-805e-4179-8a3a-cd3a612f6ead")
    void exportXMIProfile(final ExportConfiguration configuration) throws Exception;

}
