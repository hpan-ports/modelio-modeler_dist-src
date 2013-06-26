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
                                    

package org.modelio.xmi.preferences;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.XMIExtension;
import org.modelio.xmi.plugin.Xmi;

@objid ("e5cb73bb-449f-4642-a161-3e2fd421b118")
public class XmiPreferencesPage extends FieldEditorPreferencePage implements IPreferencePage {
    @objid ("8be08937-7372-4932-9d70-198ba440f1d7")
    private ComboFieldEditor formatField;

    @objid ("0d6718db-a41a-4eca-b15c-cdbccc6945c0")
    private ComboFieldEditor extensionField;

    @objid ("6c036ed5-3e1d-40f0-96bd-501aaddd35c9")
    private BooleanFieldEditor compatibilityField;

    @objid ("50d88f00-a8e7-4e21-a996-f6e9fd2e13cd")
    @Inject
    public XmiPreferencesPage(IProjectService projectService) {
        super(GRID);
        init(projectService);
    }

    @objid ("70dfb2cf-ce89-4745-8624-9b2e196b960f")
    @Override
    public void createFieldEditors() {
        String[][] formatValues = new String[][]{{FormatExport.EMF300.toString(), FormatExport.EMF300.toString()},
                {FormatExport.UML211.toString(), FormatExport.UML211.toString()},
                {FormatExport.UML22.toString(), FormatExport.UML22.toString()},
                {FormatExport.UML23.toString(), FormatExport.UML23.toString()},
                {FormatExport.UML241.toString(), FormatExport.UML241.toString()}};
        
        this.formatField = new ComboFieldEditor(XmiPreferencesKeys.XMIFORMAT_PREFKEY,
                Xmi.I18N.getString("xmiprefpage.format.label"), formatValues
                ,  getFieldEditorParent());
        addField(this.formatField);
        
        
        String[][] extensionValues = new String[][]{{XMIExtension.UML.toString(), XMIExtension.UML.toString()},
                {XMIExtension.XMI.toString(),XMIExtension.XMI.toString()}};
                
        this.extensionField = new ComboFieldEditor(XmiPreferencesKeys.XMIEXTENSION_PREFKEY,
                Xmi.I18N.getString("xmiprefpage.extension.label"), extensionValues, getFieldEditorParent());
        
        addField(this.extensionField);
           
        this.compatibilityField = new BooleanFieldEditor(XmiPreferencesKeys.XMIANNOTATION_PREFKEY,
                Xmi.I18N.getString("xmiprefpage.compatibility.label"), getFieldEditorParent());
               
        addField(this.compatibilityField);
    }

    @objid ("36bfd509-9405-43d4-948b-23efed3a68be")
    private void init(IProjectService projectService) {
        if (projectService == null || projectService.getOpenedProject() == null) {
            IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, Xmi.PLUGIN_ID);
            setPreferenceStore(preferenceStore);
        } else {
            // use project store
            IPreferenceStore preferenceStore = projectService.getProjectPreferences(Xmi.PLUGIN_ID);
            setPreferenceStore(preferenceStore);
        }
    }

    @objid ("5019574f-eeb4-4a25-945b-d0fef942811c")
    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        super.propertyChange(event);
    }

    @objid ("cbf21f74-71bc-4e90-b247-5dd5aedf9e09")
    @Override
    public boolean isValid() {
        return super.isValid();
    }

}
