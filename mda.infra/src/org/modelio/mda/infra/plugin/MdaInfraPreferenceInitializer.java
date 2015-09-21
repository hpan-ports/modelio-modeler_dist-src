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


package org.modelio.mda.infra.plugin;

import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.modelio.mda.infra.catalog.update.CatalogUpdatePreferencesPage;
import org.modelio.ui.i18n.BundledMessages;

/**
 * 'mda.infra' preferences default values initializer.
 */
@objid ("07e9fa3d-7719-4782-9d03-5402f912a4af")
public class MdaInfraPreferenceInitializer extends AbstractPreferenceInitializer {
    @objid ("a03ebbe4-b098-4658-aa2c-17280eb91cfd")
    @Override
    public void initializeDefaultPreferences() {
        final IPreferenceStore prefs = MdaInfra.PREFERENCES;
        
        final BundledMessages i18n = new BundledMessages(MdaInfra.LOG, ResourceBundle.getBundle("catalogupdate"));
        
        prefs.setDefault(CatalogUpdatePreferencesPage.CATALOG_UPDATE_SITE, i18n.getString("ModuleCatalog.Preference.DefaultUpdateSite"));
        prefs.setDefault(CatalogUpdatePreferencesPage.CATALOG_SHOW_COMPATIBLE, true);
        prefs.setDefault(CatalogUpdatePreferencesPage.CATALOG_SHOW_LATEST, true);
    }

}
