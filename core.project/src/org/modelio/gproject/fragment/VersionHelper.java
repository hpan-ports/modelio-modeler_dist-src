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


package org.modelio.gproject.fragment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.data.project.MetamodelDescriptor;
import org.modelio.metamodel.StandardMetamodel;
import org.modelio.vbasic.version.Version;
import org.modelio.vbasic.version.VersionedItem;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;

/**
 * Metamodel versions conveniences.
 * @author cmarin
 */
@objid ("3b8ea3f2-bc2b-4a6d-8209-ca6e136e4fb5")
public class VersionHelper {
    /**
     * Convert an old metamodel version to the new format
     * @param mmVersion the old metamodel version
     * @return the metamodel version with the new format.
     */
    @objid ("6ba51d3e-e825-4f9c-a60c-eed3c95461cb")
    public static Version convert(int mmVersion) {
        return new Version(0,0,mmVersion);
    }

    /**
     * Convert a potential pre Modelio 3.4 metamodel descriptor.
     * @param input the source descriptor
     * @return another converted one.
     */
    @objid ("d1feb0ff-3fca-4f51-9f38-0d054cf039ae")
    public static MetamodelDescriptor convert(MetamodelDescriptor input) {
        MetamodelDescriptor out = new MetamodelDescriptor();
        
        for (VersionedItem<?> item : input) {
            // Pre Modelio 3.4 compatibility
            if (item.getName().equals("Modelio")) {
                VersionedItem<?> n = new VersionedItem<>(
                        StandardMetamodel.NAME,
                        convert(item.getVersion().getMajorVersion()),
                        item.getObject());
                out.addDescriptor(n);
            } else {
                out.addDescriptor(item);
            }
        }
        return out;
    }

    /**
     * Build a {@link MetamodelDescriptor} from an old metamodel version.
     * @param oldMmVersion an old Modelio metamodel version.
     * @return the matching VersionDescriptors
     */
    @objid ("4a6fc675-fbc4-46e8-a679-a65b9c3e00c6")
    public static MetamodelDescriptor getDescriptors(int oldMmVersion) {
        VersionedItem<Void> it = new VersionedItem<>(StandardMetamodel.NAME, convert(oldMmVersion));
        return new MetamodelDescriptor(it);
    }

    /**
     * Build a {@link MetamodelDescriptor} from a metamodel .
     * @param mm a metamodel
     * @return its descriptor
     */
    @objid ("747b6fce-bc43-4797-918b-46db5b00b4d9")
    public static MetamodelDescriptor getDescriptors(SmMetamodel mm) {
        MetamodelDescriptor desc = new MetamodelDescriptor();
        
        for (ISmMetamodelFragment mmFragment : mm.getFragments()) {
            VersionedItem<Void> v = new VersionedItem<>(mmFragment.getName(), mmFragment.getVersion());
            desc.addDescriptor(v);
        }
        return desc;
    }

    /**
     * Tells whether the needed version is "build" compatible with the current metamodel.
     * <p>
     * A version is "build" compatible if the only difference is that the build number is
     * more recent in the current metamodel.
     * @param neededFragment the needed metamodel fragment with its version
     * @param curMmVersions the available metamodel
     * @return <i>true</i> if the fragment is build compatible else <i>false</i>.
     */
    @objid ("5a77c49b-fb08-4098-ae27-ee8124752e43")
    public static boolean isBuildCompatible(VersionedItem<?> neededFragment, MetamodelDescriptor curMmVersions) {
        Version neededVersion = neededFragment.getVersion();
        Version curVersion = curMmVersions.getVersion(neededFragment.getName());
        if (curVersion == null) {
            return false;
        } else if (curVersion.getMajorVersion() == neededVersion.getMajorVersion() &&
                curVersion.getMinorVersion() == neededVersion.getMinorVersion() &&
                curVersion.getBuildVersion() >= neededVersion.getBuildVersion()) {
            return true;
        } else {
            return false;
        }
    }

}
