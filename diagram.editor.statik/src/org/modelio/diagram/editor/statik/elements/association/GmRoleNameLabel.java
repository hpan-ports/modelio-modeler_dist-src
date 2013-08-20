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
                                    

package org.modelio.diagram.editor.statik.elements.association;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.common.abstractdiagram.GmAbstractDiagram;
import org.modelio.diagram.elements.common.header.GmDefaultModelElementHeader;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Association role name label.
 * <p>
 * Displays the role name and visibility.
 * 
 * @author cmarin
 */
@objid ("33eefcc4-55b7-11e2-877f-002564c97630")
public class GmRoleNameLabel extends GmDefaultModelElementHeader {
    @objid ("33eefcc8-55b7-11e2-877f-002564c97630")
    private AssociationEnd role;

    /**
     * Current version of this Gm. Defaults to 0.
     */
    @objid ("33eefccb-55b7-11e2-877f-002564c97630")
    private final int minorVersion = 0;

    @objid ("33eefcce-55b7-11e2-877f-002564c97630")
    private static final int MAJOR_VERSION = 0;

    /**
     * Constructor for deserialization only.
     */
    @objid ("33eefcd0-55b7-11e2-877f-002564c97630")
    public GmRoleNameLabel() {
        // Nothing to do.
    }

    /**
     * Creates a role name label.
     * @param diagram the owning diagram.
     * @param role The represented role, may be null.
     * @param ref the represented role reference, must not be null.
     */
    @objid ("33eefcd3-55b7-11e2-877f-002564c97630")
    public GmRoleNameLabel(GmAbstractDiagram diagram, AssociationEnd role, MRef ref) {
        super(diagram, ref);
        this.role = role;
    }

    @objid ("33f08342-55b7-11e2-877f-002564c97630")
    @Override
    public ModelElement getRelatedElement() {
        return getRepresentedElement();
    }

    @objid ("33f08349-55b7-11e2-877f-002564c97630")
    @Override
    public ModelElement getRepresentedElement() {
        return this.role;
    }

    @objid ("33f08350-55b7-11e2-877f-002564c97630")
    @Override
    public boolean isVisible() {
        return isRoleVisible() || isVisibilityVisible();
    }

    @objid ("33f08355-55b7-11e2-877f-002564c97630")
    @Override
    public void read(IDiagramReader in) {
        // Read version, defaults to 0 if not found
        Object versionProperty = in.readProperty("GmRoleNameLabel." + MINOR_VERSION_PROPERTY);
        int readVersion = versionProperty == null ? 0 : ((Integer) versionProperty).intValue();
        switch (readVersion) {
            case 0: {
                read_0(in);
                break;
            }
            default: {
                assert (false) : "version number not covered!";
                // reading as last handled version: 0
                read_0(in);
                break;
            }
        }
    }

    @objid ("33f0835b-55b7-11e2-877f-002564c97630")
    @Override
    protected String computeMainLabel() {
        return computeSignature(this.role);
    }

    @objid ("33f08360-55b7-11e2-877f-002564c97630")
    private String computeSignature(final AssociationEnd att) {
        final String name = att.getName();
        if (name.isEmpty())
            return "";
        
        StringBuffer ret = new StringBuffer();
        if (isRoleVisible()) {
            ret.append(name);
        }
        if (ret.length() > 00 && isVisibilityVisible()) {
            ret.insert(0, " ");
            ret.insert(0, computeVisibility(att));
        }
        return ret.toString();
    }

    /**
     * compute the visibility symbol of the role.
     * @param att a role
     * @return the visibility symbol.
     */
    @objid ("33f08368-55b7-11e2-877f-002564c97630")
    private String computeVisibility(final AssociationEnd att) {
        String svis;
        switch (att.getVisibility()) {
            case PUBLIC:
                svis = "+";
                break;
            case PROTECTED:
                svis = "#";
                break;
            case PRIVATE:
                svis = "-";
                break;
            case PACKAGEVISIBILITY:
                svis = "~";
                break;
            default:
                svis = "";
        }
        return svis;
    }

    @objid ("33f08371-55b7-11e2-877f-002564c97630")
    private boolean isRoleVisible() {
        return this.getStyle().getProperty(GmAssocStructuredStyleKeys.SHOWROLES);
    }

    @objid ("33f08375-55b7-11e2-877f-002564c97630")
    private boolean isVisibilityVisible() {
        return this.getStyle().getProperty(GmAssocStructuredStyleKeys.SHOWVISIBILITY);
    }

    @objid ("33f08379-55b7-11e2-877f-002564c97630")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0.
        if (this.minorVersion != 0) {
            out.writeProperty("GmRoleNameLabel." + MINOR_VERSION_PROPERTY, Integer.valueOf(this.minorVersion));
        }
    }

    @objid ("33f209d9-55b7-11e2-877f-002564c97630")
    private void read_0(IDiagramReader in) {
        super.read(in);
        final MObject resolveRef = resolveRef(this.getRepresentedRef());
        if (resolveRef instanceof AssociationEnd)
            this.role = (AssociationEnd) resolveRef;
    }

    @objid ("33f209de-55b7-11e2-877f-002564c97630")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

}
