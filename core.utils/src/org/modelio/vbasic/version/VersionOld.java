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


package org.modelio.vbasic.version;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Old version identifier for Modelio < 3.4 and modules.
 * <p>
 * Old version identifiers had four components:
 * <ul>
 * <li>Major version
 * <li>Minor version
 * <li>Build version
 * <li>Metamodel version (optional, zero  = not specified)
 * </ul>
 * <p>
 * Two Versions were considered equal if the only difference between them
 * is one of their metamodel version being zero.
 * @deprecated Use {@link Version} without the metamodel version.
 */
@objid ("680a18e7-b8c6-47cc-91e1-7af08424e7fa")
@Deprecated
public class VersionOld {
    @objid ("1c0e270c-8126-43ac-83f5-6cf5fd27e9bd")
    private int buildVersion;

    @objid ("20e11e58-fe07-4038-82c0-61e9a8846823")
    private int majorVersion;

    @objid ("adeb458d-7a62-43b7-a1ce-6156b1fd493c")
    private int metamodelVersion;

    @objid ("7c91f456-25b1-45fb-93cc-41c97d4a6c85")
    private int minorVersion;

    /**
     * Instantiate a new Version from its component.<br>
     * The standard format is <b>Major.Minor.Build.Metamodel</b>.
     * @param major the first component of the version.
     * @param minor the second component of the version.
     * @param build the third component of the version.
     * @param mmVersion the last component of the version.
     */
    @objid ("edac133c-0467-43ee-92ba-29d223171947")
    public VersionOld(int major, int minor, int build, int mmVersion) {
        this.majorVersion = major;
        this.minorVersion = minor;
        this.buildVersion = build;
        this.metamodelVersion = mmVersion;
    }

    /**
     * Instanciate a new Version from a String. The standard format is
     * <b>Major.Minor.Build.Metamodel</b>.
     * @param versionString The String to parse to create the version.
     * @throws java.lang.NumberFormatException thrown when the parameter doesn't have a valid format.
     */
    @objid ("c6e0b7e0-f2bb-4447-b0af-bc7af271fd50")
    public VersionOld(String versionString) throws NumberFormatException {
        // mmVersion = _getCurrentMetamodelVersion();
        
        String[] versionNumbers = versionString.split("\\.", 4);
        
        if (versionNumbers.length > 0 && versionNumbers[0].length() != 0) {
            this.majorVersion = Integer.parseInt(versionNumbers[0]);
        } else {
            this.majorVersion = 0;
        }
        
        if (versionNumbers.length > 1 && versionNumbers[1].length() != 0) {
            this.minorVersion = Integer.parseInt(versionNumbers[1]);
        } else {
            this.minorVersion = 0;
        }
        
        if (versionNumbers.length > 2 && versionNumbers[2].length() != 0) {
            this.buildVersion = parseRevision(versionNumbers[2]);
        } else {
            this.buildVersion = 0;
        }
        
        if (versionNumbers.length > 3 && versionNumbers[3].length() != 0) {
            this.metamodelVersion = Integer.parseInt(versionNumbers[3]);
        } else {
            this.metamodelVersion = 0;
        }
    }

    /**
     * Compares this Version to the specified object.
     * <p>
     * The result is true if and only if the argument is not null and is a
     * Version object that represents the same version object as this object.
     * <p>
     * Two Versions are considered equal if the only difference is one of their metamodel version being zero.
     * @param anObject The object to compare this Version against.
     * @return true if the given object represents a Version equivalent to this
     * Version, false otherwise.
     */
    @objid ("479874db-042d-4754-b2e9-270999630e25")
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof VersionOld) {
            VersionOld other = (VersionOld) anObject;
            return (this.majorVersion == other.majorVersion
                    && this.minorVersion == other.minorVersion
                    && this.buildVersion == other.buildVersion
                    && (this.metamodelVersion == other.metamodelVersion || this.metamodelVersion==0 || other.metamodelVersion==0));
        }
        return false;
    }

    /**
     * Get the build number of this version
     * @return the build number of this version.
     */
    @objid ("ce95ecd7-0d3e-4699-8428-8462a1ce291d")
    public int getBuildVersion() {
        return this.buildVersion;
    }

    /**
     * Get the major number of this version.
     * @return the major number of this version.
     */
    @objid ("ad23667a-62af-46ce-a9af-840988502f25")
    public int getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * Get the metamodel number of this version.
     * <p>
     * Zero means not specified.
     * <p>
     * Two Versions are considered equal if the only difference is one of their metamodel version being <i>zero</i>.
     * @return the metamodel number of this version or zero.
     */
    @objid ("15fbed73-bf29-48d4-95e2-1021f8844fbb")
    public int getMetamodelVersion() {
        return this.metamodelVersion;
    }

    /**
     * Get the minor number of this version.
     * @return the minor number of this version.
     */
    @objid ("667b1633-ab68-41ba-849a-e60b1fc514cf")
    public int getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * Check if this Version is strictly newer than the given Version.
     * <p>
     * Two Versions are considered equal if the only difference is one of their metamodel version being <i>zero</i>.
     * @param other the Version object that must be compared to this Version.
     * @return <i>true</i> if this is newer than the given version.
     */
    @objid ("6b5859bf-c474-4797-b060-e7db1c6cadf8")
    public boolean isNewerThan(VersionOld other) {
        if (this.majorVersion < other.majorVersion) {
            return false;
        }
        if (this.majorVersion > other.majorVersion) {
            return true;
        }
        
        // Major are the same, test minor number
        if (this.minorVersion < other.minorVersion) {
            return false;
        }
        if (this.minorVersion > other.minorVersion) {
            return true;
        }
        
        // Major and minor are the same, test build number
        if (this.buildVersion < other.buildVersion) {
            return false;
        }
        if (this.buildVersion > other.buildVersion) {
            return true;
        }
        
        // Major, minor and build are the same, test mm version
        if (this.metamodelVersion == 0 || other.metamodelVersion == 0) {
            return false;
        }
        if (this.metamodelVersion < other.metamodelVersion) {
            return false;
        }
        if (this.metamodelVersion > other.metamodelVersion) {
            return true;
        }
        return false;
    }

    /**
     * Check if this Version is strictly older than the given Version.
     * <p>
     * Two Versions are considered equal if the only difference is one of their metamodel version being <i>zero</i>.
     * @param other the Version object that must be compared to this Version.
     * @return <i>true</i> if this is older than the given version.
     */
    @objid ("650ad76e-e42c-480e-91b4-d11ac438cf77")
    public boolean isOlderThan(VersionOld other) {
        if (this.majorVersion > other.majorVersion) {
            return false;
        }
        if (this.majorVersion < other.majorVersion) {
            return true;
        }
        
        // Major are the same, test minor number
        if (this.minorVersion > other.minorVersion) {
            return false;
        }
        if (this.minorVersion < other.minorVersion) {
            return true;
        }
        
        // Major and minor are the same, test build number
        if (this.buildVersion > other.buildVersion) {
            return false;
        }
        if (this.buildVersion < other.buildVersion) {
            return true;
        }
        
        // Major, minor and build are the same, test mm version
        if (this.metamodelVersion == 0 || other.metamodelVersion == 0) {
            return false;
        }
        if (this.metamodelVersion > other.metamodelVersion) {
            return false;
        }
        if (this.metamodelVersion < other.metamodelVersion) {
            return true;
        }
        return false;
    }

    /**
     * Provides a formatted string representation of the version.
     * <P>
     * The format is: V.R.CC.mmmm where:
     * </P>
     * <UL>
     * <LI>V is the major version number (one or more digits)</LI>
     * <LI>R is the minor version number (one or more digits)</LI>
     * <LI>CC is the correction level (0-padded to 2 digits)</LI>
     * <LI>mmmm is the metamodel version (4 digits)</LI>
     * </UL>
     * @return the formatted string representation of the version.
     */
    @objid ("53603c7e-c279-47d7-809d-c6e28a460d2b")
    @Override
    public String toString() {
        StringBuilder stringBuf = new StringBuilder();
        stringBuf.append(this.majorVersion);
        stringBuf.append('.');
        stringBuf.append(this.minorVersion);
        stringBuf.append('.');
        stringBuf.append(String.format("%02d", this.buildVersion));
        stringBuf.append('.');
        stringBuf.append(this.metamodelVersion);
        return stringBuf.toString();
    }

    /**
     * Parse the revision number. It may be a decimal number or for ascendant
     * compatibility a letter. In the second case it is parsed as a base 36
     * number.
     * @param revision revision number
     * @return the parsed revision number
     * @throws java.lang.NumberFormatException if the revision cannot be parsed.
     */
    @objid ("7c2498dc-a953-4755-bdd1-400942c0b6fc")
    private int parseRevision(String revision) throws NumberFormatException {
        try {
            return Integer.parseInt(revision);
        } catch (NumberFormatException e) {
            // May be old revision number with digits
            return Integer.parseInt(revision, 36);
        }
    }

    @objid ("40fe4273-6bf8-4caf-ada6-55e4895b8ba8")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.buildVersion;
        result = prime * result + this.majorVersion;
        result = prime * result + this.minorVersion;
        return result;
    }

    /**
     * Provides a formatted string representation of the version.
     * @param format <P>
     * The format is: VRCM where:
     * </P>
     * <UL>
     * <LI>V means 'prints the major version number' (one or more
     * digits)</LI>
     * <LI>R means 'prints the minor version number (one or more
     * digits)</LI>
     * <LI>C means 'print the correction level (0-padded to 2 digits)
     * </LI>
     * <LI>M means 'print the metamodel version (4 digits)</LI>
     * <LI>other chars are just inserted in the resulting string. There is no way of escaping characters VRC and M
     * </UL>
     * 
     * example: if version is 3.0.01.9013
     * 
     * version.toString("V.R") will produce 3.0
     * version.toString("V.R.C-M") will produce 3.0.01-9013
     * @return the formatted string representation of the version.
     */
    @objid ("fc874f1b-4d25-4456-9e28-fe94f7abc489")
    public String toString(String format) {
        StringBuilder buf = new StringBuilder();
        
        for (char c : format.toUpperCase().toCharArray()) {
            switch (c) {
            case 'V':
                buf.append(this.majorVersion);
                break;
            case 'R':
                buf.append(this.minorVersion);
                break;
            case 'C':
                buf.append(String.format("%02d", this.buildVersion));
                break;
            case 'M':
                buf.append(this.metamodelVersion);
                break;
            default:
                buf.append(c);
                break;
            }
        }
        return buf.toString();
    }

}
