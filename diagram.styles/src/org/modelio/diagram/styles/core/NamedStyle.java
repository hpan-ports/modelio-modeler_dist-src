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


package org.modelio.diagram.styles.core;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;

/**
 * A named style is a special style that is global to the project (or more).
 * <p>
 * This style can be referenced and used in many diagrams. The named style name is used as identifier to find it among shared
 * styles.
 * 
 * @author phv
 */
@objid ("8568fbc5-1926-11e2-92d2-001ec947c8cc")
public class NamedStyle extends Style {
    @objid ("856b5e1b-1926-11e2-92d2-001ec947c8cc")
    private static final int MAJOR_VERSION = 0;

    @objid ("27710c3c-1927-11e2-92d2-001ec947c8cc")
    public static final String STYLENAME_ADMINKEY = "stylename";

    @objid ("27710c41-1927-11e2-92d2-001ec947c8cc")
    public static final String BASESTYLE_ADMINKEY = "basestyle";

    @objid ("ebbb69aa-b991-495e-b1c8-2eceb7ceba9b")
    public static final String PROVIDER_ADMINKEY = "provider";

    @mdl.prop
    @objid ("27710c46-1927-11e2-92d2-001ec947c8cc")
    private String name;

    @mdl.propgetter
    public String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    @mdl.propsetter
    public void setName(String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

    @objid ("bebaf5d6-c89d-4783-9fb8-c544954445a8")
    private String provider;

    /**
     * Creates a named style.
     * @param name The named style name.
     * @param cascadedStyle The parent style.
     */
    @objid ("856b5e1d-1926-11e2-92d2-001ec947c8cc")
    public NamedStyle(String name, IStyle cascadedStyle) {
        super(cascadedStyle);
        this.name = name;
        this.properties = new HashMap<>();
    }

    @objid ("856b5e22-1926-11e2-92d2-001ec947c8cc")
    public NamedStyle(String name, Map<StyleKey, Object> styleProperties, IStyle cascadedStyle) {
        super(cascadedStyle);
        this.properties = styleProperties;
        this.name = name;
    }

    /**
     * A named style is not stored with the diagram.
     */
    @objid ("856b5e2a-1926-11e2-92d2-001ec947c8cc")
    @Override
    public boolean isExternal(IDiagramWriter out) {
        // TODO: return false in the case we want to save the style
        // somewhere else than in a diagram.
        return true;
    }

    @objid ("856b5e31-1926-11e2-92d2-001ec947c8cc")
    @Override
    public void read(IDiagramReader in) {
        super.read(in);
    }

    @objid ("856b5e35-1926-11e2-92d2-001ec947c8cc")
    @Override
    public void write(IDiagramWriter out) {
        if (this.isExternal(out)) {
            // The call to super is not correct here as a named style
            // is indeed an external reference and should not be explicitely serialized.
            //
            // Instead write the name of the style as external reference
            out.writeExtRef(this, "", this.name);
        } else {
            super.write(out);
        }
    }

    @objid ("856b5e39-1926-11e2-92d2-001ec947c8cc")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

    @objid ("550c4734-facf-43fd-bcd9-03679f263a75")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @objid ("4df6e36d-b545-48c7-8505-df1866f702d9")
    public String getProvider() {
        return this.provider;
    }

}
