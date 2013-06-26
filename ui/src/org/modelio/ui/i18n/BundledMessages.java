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
                                    

package org.modelio.ui.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.log.writers.PluginLogger;

@objid ("006d94da-9c03-1fcc-9f44-001ec947cd2a")
public class BundledMessages {
    @objid ("0006280e-9df5-1fcc-9f44-001ec947cd2a")
    protected ResourceBundle bundle;

    @objid ("a6795756-1dce-11e2-82de-002564c97630")
    protected PluginLogger pluginLogger;

    @objid ("00063984-9df5-1fcc-9f44-001ec947cd2a")
    public BundledMessages(final PluginLogger pluginLogger, final ResourceBundle bundle) {
        this.pluginLogger = pluginLogger;
        this.bundle = bundle;
    }

    @objid ("00066a08-9df5-1fcc-9f44-001ec947cd2a")
    public String getMessage(final String key, final String... strings) {
        String pattern;
        
        try {
            pattern = this.bundle.getString(key);
        } catch (MissingResourceException e) {
            this.pluginLogger.warning("No I18n message for '%s'", key);
            pattern = "!" + key + "!";
        }
        return MessageFormat.format(pattern, (Object[]) strings);
    }

    @objid ("0006aac2-9df5-1fcc-9f44-001ec947cd2a")
    public String getString(final String key) {
        String pattern;
        
        try {
            pattern = this.bundle.getString(key);
        } catch (MissingResourceException e) {
            this.pluginLogger.warning("No I18n message for '%s'", key);
            pattern = "!" + key + "!";
        }
        return pattern;
    }

    /**
     * Return the locale currently being used by this BundledMessages
     * @return
     */
    @objid ("edf4007f-b609-48f6-ad81-dbc55ddc7bbe")
    public Locale getLocale() {
        return this.bundle.getLocale();
    }

}
