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


package org.modelio.app.ui.logconfig;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.modelio.app.ui.plugin.AppUi;
import org.osgi.service.log.LogService;

/**
 * Log and administration mode preference page.
 */
@objid ("f335cc77-eb91-4f14-b4bd-98aece15c8c3")
public class LogPreferencesPage extends FieldEditorPreferencePage {
    /**
     * Public constructor
     */
    @objid ("23b480f8-981e-4cb1-98a2-b12e344fec78")
    public LogPreferencesPage() {
        super(GRID);
        init();
    }

    @objid ("57ea152f-935d-4329-a0d8-2b3f2334a696")
    @Override
    public void createFieldEditors() {
        //
        final String[][] logLevels = new String[][] {
                { AppUi.I18N.getString("LogLevel.ERROR"), Integer.toString(LogService.LOG_ERROR) },
                { AppUi.I18N.getString("LogLevel.WARNING"), Integer.toString(LogService.LOG_WARNING) },
                { AppUi.I18N.getString("LogLevel.INFO"), Integer.toString(LogService.LOG_INFO) },
                { AppUi.I18N.getString("LogLevel.DEBUG"), Integer.toString(LogService.LOG_DEBUG) }, };
        
        RadioGroupFieldEditor logLevelFields = new RadioGroupFieldEditor(LogPreferencesKeys.LOGLEVEL_PREFKEY,
                AppUi.I18N.getString("LogLevel.label"), 1, // nb columns
                logLevels, getFieldEditorParent(), true);
        addField(logLevelFields);
        
        BooleanFieldEditor showAdmTools = new BooleanFieldEditor(LogPreferencesKeys.SHOWADMTOOLS_PREFKEY, AppUi.I18N.getString("AdmTools.Show"), getFieldEditorParent());
        addField(showAdmTools);
    }

    @objid ("1ad16d2e-36d6-498d-bb67-e28e7d36fdbd")
    private void init() {
        setPreferenceStore(AppUi.PREFERENCES);
    }

}
