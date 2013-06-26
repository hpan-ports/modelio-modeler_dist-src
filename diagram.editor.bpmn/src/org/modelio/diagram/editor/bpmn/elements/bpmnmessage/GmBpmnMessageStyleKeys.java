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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmnmessage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.bpmn.elements.style.BpmnAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Style key provider for {@link GmBpmnMessage}.
 */
@objid ("61685577-55b6-11e2-877f-002564c97630")
public class GmBpmnMessageStyleKeys extends BpmnAbstractStyleKeyProvider {
    @objid ("71f0a8ef-55c1-11e2-9337-002564c97630")
    public static final StyleKey CONNECTIONROUTER = createStyleKey("BPMNMESSAGE_CONNECTIONROUTER",
                                                                   MetaKey.CONNECTIONROUTER);

    @objid ("71f0a8f1-55c1-11e2-9337-002564c97630")
    public static final StyleKey FILLCOLOR = createStyleKey("BPMNMESSAGE_FILLCOLOR", MetaKey.FILLCOLOR);

    @objid ("71f0a8f3-55c1-11e2-9337-002564c97630")
    public static final StyleKey LINECOLOR = createStyleKey("BPMNMESSAGE_LINECOLOR", MetaKey.LINECOLOR);

    @objid ("71f22f89-55c1-11e2-9337-002564c97630")
    public static final StyleKey LINEWIDTH = createStyleKey("BPMNMESSAGE_LINEWIDTH", MetaKey.LINEWIDTH);

    @objid ("71f22f8b-55c1-11e2-9337-002564c97630")
    public static final StyleKey LINERADIUS = createStyleKey("BPMNMESSAGE_LINERADIUS", MetaKey.LINERADIUS);

    @objid ("71f22f8d-55c1-11e2-9337-002564c97630")
    public static final StyleKey DRAWLINEBRIDGES = createStyleKey("BPMNMESSAGE_DRAWLINEBRIDGES",
                                                                  MetaKey.DRAWLINEBRIDGES);

    @objid ("71f22f8f-55c1-11e2-9337-002564c97630")
    public static final StyleKey FONT = createStyleKey("BPMNMESSAGE_FONT", MetaKey.FONT);

    @objid ("71f22f91-55c1-11e2-9337-002564c97630")
    public static final StyleKey TEXTCOLOR = createStyleKey("BPMNMESSAGE_TEXTCOLOR", MetaKey.TEXTCOLOR);

    @objid ("71f22f93-55c1-11e2-9337-002564c97630")
    public static final StyleKey SHOWSTEREOTYPES = createStyleKey("BPMNMESSAGE_SHOWSTEREOTYPES",
                                                                  MetaKey.SHOWSTEREOTYPES);

    @objid ("71f22f95-55c1-11e2-9337-002564c97630")
    public static final StyleKey SHOWTAGS = createStyleKey("BPMNMESSAGE_SHOWTAGS", MetaKey.SHOWTAGS);

    @objid ("71f22f97-55c1-11e2-9337-002564c97630")
    public static final StyleKey SHOWLABEL = createStyleKey("BPMNMESSAGE_SHOWLABEL", MetaKey.SHOWLABEL);

    @objid ("71f22f99-55c1-11e2-9337-002564c97630")
    public static final StyleKey LINEPATTERN = createStyleKey("BPMNMESSAGE_LINEPATTERN", MetaKey.LINEPATTERN);

}
