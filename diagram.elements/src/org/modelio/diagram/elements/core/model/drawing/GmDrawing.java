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
                                    

package org.modelio.diagram.elements.core.model.drawing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.common.abstractdiagram.GmAbstractDiagram;
import org.modelio.diagram.elements.core.model.GmAbstractObject;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.Style;

/**
 * Graphic model representing a node or a link that does not represent a model element.
 * 
 * @author cmarin
 */
@objid ("807430a0-1dec-11e2-8cad-001ec947c8cc")
public abstract class GmDrawing extends GmAbstractObject {
    /**
     * Current version of this Gm. Defaults to 0.
     */
    @objid ("807430a2-1dec-11e2-8cad-001ec947c8cc")
    private final int minorVersion = 0;

    @objid ("807430a5-1dec-11e2-8cad-001ec947c8cc")
    private static final int MAJOR_VERSION = 0;

    /**
     * Instantiate the graphic model style.
     * <p>
     * Called by the standard {@link GmAbstractObject#GmAbstractObject(GmAbstractDiagram)} constructor.
     * <p>
     * Default implementation makes the style derive from the diagram style if not null, or from the factory style in
     * the other case.
     * <p>
     * Can be redefined to create another style or to return <tt>null<tt/> if
     * {@link #getStyle()} is redefined to return another style.
     * @param aDiagram the diagram where the object will be
     * @return the created style or <tt>null</tt> if the creation is postponed
     */
    @objid ("807430a7-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected IStyle createStyle(GmAbstractDiagram aDiagram) {
        return new Style(aDiagram.getStyle());
    }

    @objid ("807430ae-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void read(IDiagramReader in) {
        // Read version, defaults to 0 if not found
        Object versionProperty = in.readProperty("GmDrawing." + MINOR_VERSION_PROPERTY);
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

    @objid ("807430b2-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0.
        if (this.minorVersion != 0) {
            out.writeProperty("GmDrawing." + MINOR_VERSION_PROPERTY, Integer.valueOf(this.minorVersion));
        }
    }

    @objid ("807430b6-1dec-11e2-8cad-001ec947c8cc")
    private void read_0(IDiagramReader in) {
        super.read(in);
    }

    @objid ("807430b9-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

}
