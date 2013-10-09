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
                                    

package org.modelio.mda.infra.catalog.update;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.modelio.app.preferences.ScopedPreferenceStore;
import org.modelio.mda.infra.plugin.MdaInfra;

@objid ("e46387a6-a669-48b9-8131-ca484a12b266")
public class CatalogUpdatePreferencesPage extends FieldEditorPreferencePage {
    @objid ("da0dbc1b-1cbe-44bb-9fcc-1da8ed096064")
    public static final String CATALOG_UPDATE_SITE = "ModuleCatalog.UpdateSite";

    @objid ("4f2fbba1-9b34-45c5-baa9-60e144b94cff")
    public static final String CATALOG_SHOW_LATEST = "ModuleCatalog.ShowLatest";

    @objid ("f7972004-9d30-41f0-ace7-5daf81fe3edf")
    public static final String CATALOG_SHOW_COMPATIBLE = "ModuleCatalog.ShowCompatible";

    @objid ("b7f2ccd6-6ce6-4e71-8734-5043a2c9d9be")
    private StringFieldEditor updateSiteField;

    @objid ("bb75c97e-b708-4687-88f2-78844766c165")
    private BooleanFieldEditor showLatestField;

    @objid ("127ccbbb-5685-489c-8056-054996e37c6a")
    private BooleanFieldEditor showCompatibleField;

    @objid ("1be2933f-72b6-4b49-bdba-c23599147a59")
    @Inject
    public CatalogUpdatePreferencesPage() {
        init();
    }

    @objid ("15d552ed-ef13-4b70-976f-38cb7885a75d")
    private void init() {
        IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, MdaInfra.PLUGIN_ID);
        setPreferenceStore(preferenceStore);
        
        preferenceStore.setDefault(CatalogUpdatePreferencesPage.CATALOG_UPDATE_SITE, MdaInfra.I18N.getString("ModuleCatalog.Preference.DefaultUpdateSite"));
        preferenceStore.setDefault(CatalogUpdatePreferencesPage.CATALOG_SHOW_COMPATIBLE, true);
        preferenceStore.setDefault(CatalogUpdatePreferencesPage.CATALOG_SHOW_LATEST, true);
    }

    @objid ("d86fcd83-8195-4b5d-bb51-eaf5a3b1d8c6")
    @Override
    public void createFieldEditors() {
        this.updateSiteField = new StringFieldEditor(CATALOG_UPDATE_SITE, MdaInfra.I18N.getString("ModuleCatalog.Preference.UpdateSite"), getFieldEditorParent());
        addField(this.updateSiteField);
        
        this.showLatestField = new BooleanFieldEditor(CATALOG_SHOW_LATEST, MdaInfra.I18N.getString("ModuleCatalog.Preference.ShowOnlyLatest"), getFieldEditorParent());
        addField(this.showLatestField);
        
        this.showCompatibleField = new BooleanFieldEditor(CATALOG_SHOW_COMPATIBLE, MdaInfra.I18N.getString("ModuleCatalog.Preference.ShowOnlyCompatible"), getFieldEditorParent());
        addField(this.showCompatibleField);
    }

}
