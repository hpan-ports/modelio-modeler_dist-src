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
                                    

package org.modelio.app.project.core.creation;

import java.io.File;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.osgi.framework.Version;

/**
 * Represents a module in the module list.
 */
@objid ("0044af52-cc35-1ff2-a7f4-001ec947cd2a")
public class ModuleAdapter {
    @objid ("00485652-cc35-1ff2-a7f4-001ec947cd2a")
    private boolean deploy = false;

    @objid ("00485742-cc35-1ff2-a7f4-001ec947cd2a")
    private boolean isMandatory = false;

    @objid ("00485832-cc35-1ff2-a7f4-001ec947cd2a")
    private boolean canBeDeployed = true;

    @objid ("0048538c-cc35-1ff2-a7f4-001ec947cd2a")
    private boolean isCommercialModule = false;

    @objid ("00482f88-cc35-1ff2-a7f4-001ec947cd2a")
    private String description = "";

    @objid ("0048308c-cc35-1ff2-a7f4-001ec947cd2a")
    private String label = "";

    @objid ("0048547c-cc35-1ff2-a7f4-001ec947cd2a")
    private MdacArchiveInfo mdac;

    /**
     * Initialize the module adapter.
     * @param mdac the module archive.
     * @param label The module label.
     * @param description The module description.
     */
    @objid ("0049ad36-cc35-1ff2-a7f4-001ec947cd2a")
    public ModuleAdapter(final MdacArchiveInfo mdac, final String label, final String description) {
        this.mdac = mdac;
        
        final String mdacName = mdac.getName();
        
        if (label != null && !label.isEmpty()) {
            this.label = label;
        } else {
            this.label = mdacName;
        }
        
        this.description = description;
        this.isCommercialModule=mdac.licenseRequired;
    }

    /**
     * @return true if this module can be deployed.
     */
    @objid ("0049adcc-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean canBeDeployed() {
        return this.canBeDeployed;
    }

    /**
     * @return the module description.
     */
    @objid ("0049ae6c-cc35-1ff2-a7f4-001ec947cd2a")
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the deployable module archive path.
     * @return the module archive path.
     */
    @objid ("0049b592-cc35-1ff2-a7f4-001ec947cd2a")
    public File getFile() {
        return this.mdac.getArchive().getPath();
    }

    /**
     * Get the module GUI label.
     * @return the module label.
     */
    @objid ("0049b628-cc35-1ff2-a7f4-001ec947cd2a")
    public String getLabel() {
        return this.label;
    }

    /**
     * @return the license informations.
     */
    @objid ("0049b6be-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean isCommercial() {
        return this.isCommercialModule;
    }

    /**
     * Get the module archive informations.
     * @return the module archive informations.
     */
    @objid ("0044f07a-cc35-1ff2-a7f4-001ec947cd2a")
    public MdacArchiveInfo getMdac() {
        // Automatically generated method. Please delete this comment before
        // entering specific code.
        return this.mdac;
    }

    /**
     * @return the module name.
     */
    @objid ("0044f110-cc35-1ff2-a7f4-001ec947cd2a")
    public String getName() {
        return this.mdac.getName();
    }

    /**
     * @return the required modules
     */
    @objid ("0044f1a6-cc35-1ff2-a7f4-001ec947cd2a")
    public List<Object> getRequiredMdacs() {
        // return this.mdac.getRequiredMdacs();
        return null;
    }

    /**
     * @return the module version.
     */
    @objid ("004878d0-cc35-1ff2-a7f4-001ec947cd2a")
    public Version getVersion() {
        return this.mdac.getVersion();
    }

    /**
     * Tells whether the module is selected to be deployed.
     * @return true if the module is selected to be deployed.
     */
    @objid ("00487970-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean isDeploy() {
        return this.deploy;
    }

    /**
     * @return true if the module is mandatory.
     */
    @objid ("00470a90-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean isMandatory() {
        return this.isMandatory;
    }

    /**
     * Set the module deployability.
     * @param canBeDeployed true if the module can be deployed.
     */
    @objid ("00470b30-cc35-1ff2-a7f4-001ec947cd2a")
    public void setCanBeDeployed(final boolean canBeDeployed) {
        this.canBeDeployed = canBeDeployed;
    }

    /**
     * Select or not the module for deployment.
     * @param deploy true to select the module for deployment.
     */
    @objid ("00470bc6-cc35-1ff2-a7f4-001ec947cd2a")
    public void setDeploy(final boolean deploy) {
        this.deploy = deploy;
    }

    /**
     * Set the module as mandatory or not.
     * @param isMandatory true to set the module as mandatory.
     */
    @objid ("0046d35e-cc35-1ff2-a7f4-001ec947cd2a")
    public void setMandatory(final boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    /**
     * Returns the module name and version if available.
     */
    @objid ("0046d3fe-cc35-1ff2-a7f4-001ec947cd2a")
    @Override
    public String toString() {
        File file = this.getFile();
        
        if (file != null) {
            return this.getName() + " (" + this.getVersion().toString() + ")";
        } else {
            return this.getName() + " (not available)";
        }
    }

    /**
     * Initialize the license informations.
     */
    @objid ("0046d494-cc35-1ff2-a7f4-001ec947cd2a")
    public void initLicenceInfos() {
        String mdacName = this.mdac.getName();
        Version version = this.mdac.getVersion();
    }

}
