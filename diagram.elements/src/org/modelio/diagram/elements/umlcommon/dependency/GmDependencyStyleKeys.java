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
                                    

package org.modelio.diagram.elements.umlcommon.dependency;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.style.ElementsAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style key provider for {@link GmDependency}.
 * 
 * @author cmarin
 */
@objid ("81270132-1dec-11e2-8cad-001ec947c8cc")
public class GmDependencyStyleKeys extends ElementsAbstractStyleKeyProvider {
    /**
     * Routing mode: bendpoint, orthogonal, ...
     */
    @objid ("81270134-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey CONNECTIONROUTER = createStyleKey("DEPENDENCY_ROUTINGMODE",
                                                            MetaKey.CONNECTIONROUTER);

    /**
     * Line color
     */
    @objid ("81270137-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey LINECOLOR = createStyleKey("DEPENDENCY_LINECOLOR", MetaKey.LINECOLOR);

    /**
     * Line width
     */
    @objid ("81296359-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey LINEWIDTH = createStyleKey("DEPENDENCY_LINEWIDTH", MetaKey.LINEWIDTH);

    /**
     * Line pattern
     */
    @objid ("8129635c-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey LINEPATTERN = createStyleKey("DEPENDENCY_LINEPATTERN", MetaKey.LINEPATTERN);

    /**
     * Line corners radius
     */
    @objid ("8129635f-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey LINERADIUS = createStyleKey("DEPENDENCY_LINERADIUS", MetaKey.LINERADIUS);

    /**
     * Text font.
     */
    @objid ("81296362-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey FONT = createStyleKey("DEPENDENCY_FONT", MetaKey.FONT);

    /**
     * Text color.
     */
    @objid ("81296365-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey TEXTCOLOR = createStyleKey("DEPENDENCY_TEXTCOLOR", MetaKey.TEXTCOLOR);

    /**
     * Stereotype display mode.
     */
    @objid ("81296368-1dec-11e2-8cad-001ec947c8cc")
    public static final StyleKey SHOWSTEREOTYPES = createStyleKey("DEPENDENCY_SHOWSTEREOTYPES",
                                                                  MetaKey.SHOWSTEREOTYPES);

    /**
     * Display tagged values
     */
    @objid ("8129636b-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey SHOWTAGS = createStyleKey("DEPENDENCY_SHOWTAGS", MetaKey.SHOWTAGS);

    /**
     * Draw bridge where vertical segments cross horizontal ones.
     */
    @objid ("8129636e-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey DRAWLINEBRIDGES = createStyleKey("DEPENDENCY_DRAWLINEBRIDGES",
                                                           MetaKey.DRAWLINEBRIDGES);

    /**
     * Display name
     */
    @objid ("81296371-1dec-11e2-8cad-001ec947c8cc")
     static final StyleKey SHOWLABEL = createStyleKey("DEPENDENCY_SHOWLABEL", MetaKey.SHOWLABEL);

}
