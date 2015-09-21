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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;
import org.modelio.vbasic.version.VersionedItem;

/**
 * Metamodel descriptors.
 * <p>
 * Encapsulates a list of {@link VersionedItem} with convenience methods
 * and persistence methods.
 */
@objid ("9067a353-a3af-4e8c-b55e-e8fe32659e24")
public class MetamodelDescriptor implements Iterable<VersionedItem<?>> {
    @objid ("89596db1-ffe5-4db8-8f09-81ad0fef401e")
    private final Collection<VersionedItem<?>> content = new ArrayList<>();

    /**
     * Initialize an empty descriptor.
     */
    @objid ("97118bf2-9f48-450f-b0fa-3413553b5da1")
    public MetamodelDescriptor() {
        // nothing
    }

    /**
     * Builds a set from a version.
     * @param v a version.
     */
    @objid ("e612a835-21cc-4e4c-9d63-5d7b9ec81fa1")
    public MetamodelDescriptor(VersionedItem<?> v) {
        this.content.add(v);
    }

    /**
     * Read a collection of version descriptors written by write()
     * @param is the input reader
     * @throws java.io.IOException in case of I/O error.
     */
    @objid ("3bb32d7a-04c1-4abf-81b6-13473c7985e8")
    public MetamodelDescriptor(Reader is) throws IOException {
        BufferedReader r = new BufferedReader(is);
        
        String s = r.readLine();
        while (s != null) {
            String mmName = s;
            String mmVersion = r.readLine();
        
            VersionedItem<Void> v = new VersionedItem<>(mmName, new Version(mmVersion));
            this.content.add(v);
        
            s = r.readLine();
        }
    }

    /**
     * Add a descriptor.
     * @param d a descriptor.
     */
    @objid ("12496777-c70b-44b3-afaf-4190b2c226bf")
    public void addDescriptor(VersionedItem<?> d) {
        this.content.add(d);
    }

    /**
     * Get the version for the given metamodel.
     * @param mmname a metamodel name
     * @return its version or -1 if there is no such metamodel.
     */
    @objid ("69b4c4ea-39f2-4434-b6ae-e0ea2403e3a6")
    public Version getVersion(String mmname) {
        for (VersionedItem<?> v : this.content) {
            if (v.getName().equals(mmname)) {
                return v.getVersion();
            }
        }
        return null;
    }

    /**
     * Test whether the descriptor does not contain anything.
     * @return <i>true</i> if the descriptor is empty.
     */
    @objid ("f0fa6ce4-a4b4-445c-820a-b8f73e4e0fe2")
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    /**
     * Tells whether this set is the same as the given one.
     * @param other another version set.
     * @return <i>true</i> only if they contain the same versions.
     */
    @objid ("8dfe6a9e-6f5b-4ed9-abb2-e8b3bd057b75")
    public boolean isSame(MetamodelDescriptor other) {
        return this.content.containsAll(other.content)
                                        && other.content.containsAll(this.content);
    }

    @objid ("d884fded-1b62-493d-8d88-43dea5ae9c38")
    @Override
    public Iterator<VersionedItem<?>> iterator() {
        return this.content.iterator();
    }

    @objid ("d43886fa-2013-4ac9-b2e9-625761235678")
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        boolean first = true;
        
        for (VersionedItem<?> v : this.content) {
            if (first) {
                first = false;
            } else {
                s.append(", ");
            }
        
            s.append(v.toString());
        }
        return s.toString();
    }

    /**
     * Write the versions to a java {@link Writer}.
     * @param out the target writer
     * @throws java.io.IOException in case of I/O error
     */
    @objid ("228b03cf-634a-4ec8-8905-342a245bb296")
    public void write(Writer out) throws IOException {
        for (VersionedItem<?> v : this.content) {
            out.append(v.getName());
            out.append("\n");
            out.append(String.valueOf(v.getVersion()));
            out.append("\n");
        }
    }

}
