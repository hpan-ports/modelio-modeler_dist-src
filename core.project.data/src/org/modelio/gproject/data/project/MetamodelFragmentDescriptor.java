/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.gproject.data.project;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;
import org.modelio.vbasic.version.VersionedItem;

/**
 * Descriptor for a metamodel fragment.
 * 
 * @see "org.modelio.vcore.smkernel.mapi.MMetamodelFragment"
 */
@objid ("473e1e98-e20b-48be-bcef-49833090ec18")
public class MetamodelFragmentDescriptor extends VersionedItem<Void> {
    @objid ("202f9610-e5b4-43b5-af5b-1888fb3a1508")
    private String vendor;

    @objid ("e77c8b87-e4ef-4759-92b5-3e06f3273f14")
    private String vendorVersion;

    /**
     * @param name the metamodel fragment name
     * @param version the metamodel fragment version for Modelio
     */
    @objid ("e7519b93-8534-46fc-aaf3-aebdc7ef6eaa")
    public MetamodelFragmentDescriptor(String name, Version version) {
        super(name, version);
    }

    /**
     * @param name the metamodel fragment name
     * @param version the metamodel fragment version for Modelio
     * @param vendor the vendor name this metamodel come from
     * @param vendorVersion the metamodel version from the vendor
     */
    @objid ("c41814e6-09f8-4ded-9bac-1f47b8cd1c77")
    public MetamodelFragmentDescriptor(String name, Version version, String vendor, String vendorVersion) {
        super(name, version);
        this.vendor = vendor;
        this.vendorVersion = vendorVersion;
    }

    /**
     * @return The metamodel version for the Vendor.
     */
    @objid ("6a8788db-ccd6-4148-b7eb-79816db669a6")
    public String getVendorVersion() {
        return this.vendorVersion;
    }

    /**
     * @param vendorVersion The vendor metamodel version.
     */
    @objid ("e7d3f8d9-aad8-4401-89b2-50ffb7d5eb05")
    public void setVendorVersion(String vendorVersion) {
        this.vendorVersion = vendorVersion;
    }

    /**
     * @return the fragment provider.
     */
    @objid ("e9359a36-cee2-498a-8f4b-e47c24a3d0ad")
    public String getVendor() {
        return this.vendor;
    }

    /**
     * @param vendor the fragment provider.
     */
    @objid ("9fccc486-47f9-4ff4-a09e-40f2ccbe248a")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
