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


package org.modelio.ui;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

@objid ("2f28a6ed-186d-11e2-92d2-001ec947c8cc")
public class CoreFontRegistry {
    @objid ("3bc99bac-186d-11e2-92d2-001ec947c8cc")
     static Map<String, Font> fonts = new HashMap<>();

    /**
     * Get a font given a device and font data which describes the desired font's appearance.
     * <p>
     * {@link #getFont(FontData[])} should better be used to be fully compatible on Unix.
     * @param fontdata describes the desired font (must not be null)
     * @return the matching font
     */
    @objid ("3bc99bad-186d-11e2-92d2-001ec947c8cc")
    public static Font getFont(FontData fontdata) {
        String key = fontdata.toString();
        if (fonts.get(key) == null) {
            fonts.put(key, new Font(Display.getDefault(), fontdata));
        }
        return fonts.get(key);
    }

    /**
     * Get a font given an array of font data which describes the desired font's appearance.
     * @param fontdatas the array of FontData that describes the desired font (must not be null)
     * @return the matching font
     */
    @objid ("3bc99bae-186d-11e2-92d2-001ec947c8cc")
    public static Font getFont(final FontData[] fontdatas) {
        StringBuilder keyBuilder = new StringBuilder(50);
        for (FontData f : fontdatas) {
            keyBuilder.append(f.toString());
        }
        
        final String key = keyBuilder.toString();
        if (fonts.get(key) == null) {
            fonts.put(key, new Font(Display.getDefault(), fontdatas));
        }
        return fonts.get(key);
    }

    /**
     * Get a font with the same appearance (font face) as the given one modified by
     * <ul>
     * <li>the given style flags added (use SWT.NONE for no flags change)</li>
     * <li>the font height scaled by 'scaleFactor' (use {@link UIFont} constants and {@link UIFont#NORMAL_SIZE} for no size change)</li>
     * </ul>
     */
    @objid ("a2a65da6-9dd0-4d14-a74e-e4f7f4b4c310")
    public static Font getModifiedFont(final Font font, final int styleToAdd, float scaleFactor) {
        FontData[] fontdatas = font.getFontData();
        for (FontData d : fontdatas) {
            d.setStyle(d.getStyle() | styleToAdd);
            d.setHeight((int) (d.getHeight() * scaleFactor));
        }
        return getFont(fontdatas);
    }

    /**
     * Get a font with the same appearance as the given one but with a scaled size.
     * @param font the base font
     * @param scaleFactor the scale factor to apply.
     * 
     * @Deprecated use getModifiedFont(font, SWT.NONE, scaleFactor) instead
     * @return the matching font.
     */
    @objid ("3bc99bb0-186d-11e2-92d2-001ec947c8cc")
    @Deprecated
    public static Font getScaledFont(final Font font, final float scaleFactor) {
        return getModifiedFont(font, SWT.NONE, scaleFactor);
    }

    /**
     * Get a font with the same appearance as the given one but with the given style flags to add.
     * @param font the base font
     * @param styleToAdd the style flags to add
     * 
     * @Deprecated use getModifiedFont(font, styletoAdd, 1.0f) instead
     * @return the matching font.
     */
    @objid ("009c5baa-7ca9-4ba1-8dce-3fd263a401b7")
    @Deprecated
    public static Font getModifiedFont(final Font font, final int styleToAdd) {
        return getModifiedFont(font, styleToAdd, 1.0f);
    }

}
