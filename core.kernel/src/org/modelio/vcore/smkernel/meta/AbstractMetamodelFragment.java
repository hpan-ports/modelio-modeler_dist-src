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


package org.modelio.vcore.smkernel.meta;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

/**
 * Base implementation of a {@link ISmMetamodelFragment}.
 * <p>
 * Two metamodel fragments are equal if their name and version are equal
 */
@objid ("5ff492d6-6e35-4f7a-bf17-df26bd80eabf")
public abstract class AbstractMetamodelFragment implements ISmMetamodelFragment {
    @objid ("20ab98fa-4641-49ec-ab03-d259ce1e5fd4")
    private final int hash;

    /**
     * The fragment name.
     */
    @mdl.prop
    @objid ("1505240d-0b9e-4a37-be8d-3f9d9eec556f")
    private final String name;

    @mdl.propgetter
    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    /**
     * The fragment provider.
     * This is only an informative value.
     */
    @mdl.prop
    @objid ("4ade6901-a8ea-4631-ae78-2b757504a6c1")
    private final String provider;

    @mdl.propgetter
    public String getProvider() {
        // Automatically generated method. Please do not modify this code.
        return this.provider;
    }

    @objid ("890b1b24-c804-4159-b157-560798ee03dd")
    private final String providerVersion;

    @mdl.prop
    @objid ("e027dcf9-1558-4350-85fe-025f3dd43597")
    private final Version version;

    @mdl.propgetter
    public Version getVersion() {
        // Automatically generated method. Please do not modify this code.
        return this.version;
    }

    /**
     * @param name the fragment name.
     * @param version the fragment version.
     * @param provider the provider name.
     * @deprecated use {@link #AbstractMetamodelFragment(String, Version, String, String)}
     */
    @objid ("4037d573-46e4-4acc-a568-6a5b8e9e3ff2")
    @Deprecated
    public AbstractMetamodelFragment(String name, String version, String provider) {
        this(name,  new Version(version), provider, null);
    }

    /**
     * @param name the fragment name.
     * @param version the fragment version.
     * @param provider the provider name.
     * @param providerVersion the provider metamodel version. see {@link #getProviderVersion()}
     */
    @objid ("b5217eca-22f8-4927-89e8-8d665ffe9ec1")
    public AbstractMetamodelFragment(String name, Version version, String provider, String providerVersion) {
        this.name = name;
        this.version = version;
        this.provider = provider;
        this.providerVersion = providerVersion;
        
        // compute hash code once
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        this.hash = result;
    }

    /**
     * Two metamodel fragments are equal if their name and version are equal.
     */
    @objid ("ec5820d6-0bdf-4d3b-96db-56358e109230")
    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        AbstractMetamodelFragment other = (AbstractMetamodelFragment) obj;
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        
        if (this.version == null) {
            if (other.version != null) {
                return false;
            }
        } else if (!this.version.equals(other.version)) {
            return false;
        }
        return true;
    }

    @objid ("bcd8a23e-cdbb-4a40-9e92-d61b0ffa7a34")
    @Override
    public String getProviderVersion() {
        return this.providerVersion;
    }

    @objid ("9de3d78e-1a0e-448f-846b-de6b46f6d3bd")
    @Override
    public final int hashCode() {
        return this.hash;
    }

    /**
     * Tells whether this metamodel fragment is an extension
     * or a standard Modelio metamodel fragment.
     * <p>
     * By default all metamodel fragments are extension fragments.
     * <p>
     * Standard Modelio metamodel fragments are guaranteed to have no metaclass name collisions.
     * @return <i>true</i> if the fragment is an extension, <i>false</i> if it is a Modelio standard fragment.
     */
    @objid ("b0d2add3-0f63-42e2-9891-fd5b3699c800")
    @Override
    public boolean isExtension() {
        return true;
    }

}
