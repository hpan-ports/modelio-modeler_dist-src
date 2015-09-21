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


package org.modelio.diagram.elements.core.figures.labelum;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * {@link #ZERO_WIDTH_SPACE Zero Width Space} lines Breaking with indentation text layouter.
 * <p>
 * This text layouter displays the label on one line if it fits entirely. In the other case :<ul>
 * <li> Break text lines at <b>each</b> {@link #ZERO_WIDTH_SPACE} characters in the original text.
 * <li> Indent the broken lines
 * <li> Truncates the lines if they are still too long.
 * </ul>
 * <p>
 * This Text layouter was made initially to format operation signatures.
 * <p>
 * <b>Usage:</b>
 * <p>
 * Put {@link #ZERO_WIDTH_SPACE} characters in the label where the label can be wrapped.
 */
@objid ("fd6d21bd-2a8c-473d-ab01-3a6039098fc3")
public class ZwspBreakWithIndentTextLayouter extends CharSeqBreakTextLayouter {
    /**
     * This character is intended for invisible word separation and for line break control;
     * it has no width, but its presence between two characters does not prevent increased letter spacing in justification.
     * 
     * @see http://www.fileformat.info/info/unicode/char/200B/index.htm
     */
    @objid ("889434be-98e8-49f3-ae99-d3a98227ee92")
    public static final String ZERO_WIDTH_SPACE = "\u200B";

    /**
     * A shared instance with default indentation and truncation string.
     */
    @objid ("6508ec7d-fee8-4fd6-8c66-96d18afe2973")
    public static final ZwspBreakWithIndentTextLayouter INSTANCE = new ZwspBreakWithIndentTextLayouter();

    @objid ("dce481f3-5221-438e-9e50-b35daa8d53d8")
    public ZwspBreakWithIndentTextLayouter() {
        super();
        setBreakAfter(ZERO_WIDTH_SPACE);
        setIndent("    ");
        setBreakAll(true);
    }

}
