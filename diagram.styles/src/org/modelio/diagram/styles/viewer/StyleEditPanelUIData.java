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


package org.modelio.diagram.styles.viewer;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.vcore.session.api.ICoreSession;

/**
 * The StyleEditPanelUIData is a data structure suited for the StyleEditPanel.<br>
 * It is built from a Style, the modeling session, a key filter and a editable flag, see C'Tor
 * 
 * Internally the StyleEditPanelUIData manages:
 * <ul>
 * <li>content providing (ITreeContentProvider) as the subset of StyleKeys obtained by filtering the full set of existing keys</li>
 * </ul>
 */
@objid ("695cb22d-b85f-4d15-a08c-ed633752052d")
public class StyleEditPanelUIData {
    @objid ("e3b28ae8-089e-4045-baa8-52a60bf0d07c")
    private boolean isEditable;

    @mdl.prop
    @objid ("8d02287b-b7ad-4ffb-9e95-40b1d023cf60")
    private IStyle styleData;

    @mdl.propgetter
    public IStyle getStyleData() {
        // Automatically generated method. Please do not modify this code.
        return this.styleData;
    }

    @mdl.prop
    @objid ("5cb2834c-01ab-4171-be76-35a813c27145")
    private Collection<StyleKey> keyfilter;

    @mdl.propgetter
    public Collection<StyleKey> getKeyfilter() {
        // Automatically generated method. Please do not modify this code.
        return this.keyfilter;
    }

    @objid ("092f874b-93f6-47f0-9725-2be64860a077")
    private final Map<String, List<StyleKey>> cache = new HashMap<>();

    @objid ("e1c1f711-9acb-497a-b046-c63a7db3b2b8")
    private static final Object[] NO_OBJECTS = new Object[0];

// @objid("f8d38ac6-8152-4186-854c-4a5c252b84b7")
// private ICoreSession coreSession;
    /**
     * C'tor.
     * @param styleData the edited style data
     * @param session the modeling session
     * @param keyfilter the keys subset to edit
     * @param isEditable whether or not this style can be edited
     */
    @objid ("f2c901f6-9f09-4bd6-80d9-f3c2b6ac6721")
    public StyleEditPanelUIData(IStyle styleData, ICoreSession session, Collection<StyleKey> keyfilter, boolean isEditable) {
        this.styleData = styleData;
        // this.coreSession = session;
        this.keyfilter = keyfilter;
        this.isEditable = isEditable;
    }

    /**
     * C'tor.
     * @param editedStyle the edited style data
     * @param session the modeling session
     */
    @objid ("fe83081b-115e-4745-863c-94bff8afc93c")
    public StyleEditPanelUIData(IStyle editedStyle, ICoreSession session) {
        this(editedStyle, session, null, false);
    }

    /**
     * @return <code>true</code> if the style is editable else <code>false</code>.
     */
    @objid ("6203e38d-03fe-434c-bcaf-7499ea3625e8")
    public boolean isEditable() {
        return this.isEditable;
    }


// /**
// * @return the modeling session
// */
// @objid("192eb9d6-762c-4dd5-b0c9-caebd83af455")
// public ICoreSession getSession() {
// return this.coreSession;
// }
}
