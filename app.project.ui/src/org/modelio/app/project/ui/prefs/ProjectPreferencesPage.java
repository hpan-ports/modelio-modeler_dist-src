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
                                    

package org.modelio.app.project.ui.prefs;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.modelio.app.project.core.prefs.ProjectPreferencesKeys;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.gproject.gproject.GProject;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("d4b36ec0-b27b-49d5-8874-a85f79a8c02a")
class ProjectPreferencesPage extends PreferencePage {
    @objid ("82c53c80-64fb-4ad4-8001-685649f8b32c")
    private String[][] predefinedTypesValues;

    @objid ("a96c621e-99b0-4892-879b-b2bcb0e17b42")
    private String[][] visibilityValues;

    @objid ("c3bbf9f1-9d56-472a-9acd-a089e2e47ec5")
    private static final String INDENT = "    ";

    @objid ("0e3256bc-29c1-4903-86c2-824301fc8e6f")
    private RadioGroupFieldEditor logLevelFields;

    @objid ("d7078fa9-5e4b-4016-bc25-4e6782790f20")
    private ComboFieldEditor attDefaultType;

    @objid ("5c427fb6-9ad5-4496-9cca-245cc7f51d85")
    private ComboFieldEditor attdefaultVisibility;

    @objid ("7e267a1c-205b-4497-b45d-f771b7ee1060")
    private ComboFieldEditor parameterDefaultType;

    @objid ("ee5de90d-e10e-4779-8f0d-3b2cd7c6dcd2")
    private ComboFieldEditor returnDefaultType;

    @objid ("4732c860-11df-4aff-812b-e8574636748c")
    @Inject
    public ProjectPreferencesPage(IProjectService projectService) {
        super();
        init(projectService);
    }

    @objid ("fb72b346-e347-43de-af9c-62eb55711807")
    @Override
    public Control createContents(Composite parent) {
        Composite top = new Composite(parent, SWT.NONE);
        top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        top.setLayout(layout);
        
        Label spacer = new Label(top, SWT.NONE);
        GridDataFactory.defaultsFor(spacer).span(2, 1).applyTo(spacer);
        
        Label title = new Label(top, SWT.NONE);
        title.setText(AppProjectUi.I18N.getString("ProjectPrefs.Attributes"));
        GridDataFactory.defaultsFor(title).span(2, 1).applyTo(title);
        
        Label sep = new Label(top, SWT.SEPARATOR | SWT.HORIZONTAL);
        GridDataFactory.defaultsFor(sep).span(2, 1).applyTo(sep);
        
        // Note: The INDENT prefix is a trick to indent the field editor because
        // FieldEditors do not allow fine tuning of their grid data :(
        // Should better get rid of them and either implement a plain layout of
        // standard SWT control or use a table
        
        // attribute default type
        this.attDefaultType = new ComboFieldEditor(ProjectPreferencesKeys.ATT_DEFAULT_TYPE_PREFKEY, INDENT
                + AppProjectUi.I18N.getString(ProjectPreferencesKeys.ATT_DEFAULT_TYPE_PREFKEY + ".label"), predefinedTypesValues,
                top);
        this.attDefaultType.setPage(this);
        this.attDefaultType.setPreferenceStore(getPreferenceStore());
        this.attDefaultType.load();
        
        // this.attDefaultType.getLabelControl(getFieldEditorParent()).setToolTipText(AppProjectUi.I18N.getString(ProjectPreferencesKeys.ATT_DEFAULT_TYPE_PREFKEY+".tooltip"));
        
        // attribute default visibility
        this.attdefaultVisibility = new ComboFieldEditor(ProjectPreferencesKeys.ATT_DEFAULT_VIS_PREFKEY, INDENT
                + AppProjectUi.I18N.getString(ProjectPreferencesKeys.ATT_DEFAULT_VIS_PREFKEY + ".label"), visibilityValues, top);
        this.attdefaultVisibility.setPage(this);
        this.attdefaultVisibility.setPreferenceStore(getPreferenceStore());
        this.attdefaultVisibility.load();
        
        spacer = new Label(top, SWT.NONE);
        GridDataFactory.defaultsFor(spacer).span(2, 1).applyTo(spacer);
        
        title = new Label(top, SWT.NONE);
        title.setText(AppProjectUi.I18N.getString("ProjectPrefs.Operations"));
        GridDataFactory.defaultsFor(title).span(2, 1).applyTo(title);
        
        sep = new Label(top, SWT.SEPARATOR | SWT.HORIZONTAL);
        GridDataFactory.defaultsFor(sep).span(2, 1).applyTo(sep);
        
        // parameter default type
        
        this.parameterDefaultType = new ComboFieldEditor(ProjectPreferencesKeys.PARAM_DEFAULT_TYPE_PREFKEY, INDENT
                + AppProjectUi.I18N.getString(ProjectPreferencesKeys.PARAM_DEFAULT_TYPE_PREFKEY + ".label"), predefinedTypesValues,
                top);
        
        this.parameterDefaultType.setPage(this);
        this.parameterDefaultType.setPreferenceStore(getPreferenceStore());
        this.parameterDefaultType.load();
        
        // return parameter default type
        this.returnDefaultType = new ComboFieldEditor(ProjectPreferencesKeys.RETURN_DEFAULT_TYPE_PREFKEY, INDENT
                + AppProjectUi.I18N.getString(ProjectPreferencesKeys.RETURN_DEFAULT_TYPE_PREFKEY + ".label"),
                predefinedTypesValues, top);
        
        this.returnDefaultType.setPage(this);
        this.returnDefaultType.setPreferenceStore(getPreferenceStore());
        this.returnDefaultType.load();
        return top;
    }

    @objid ("1e1fcc4d-d6a8-4915-b0d8-add063bf705d")
    private void init(IProjectService projectService) {
        this.setDescription(AppProjectUi.I18N.getString("ProjectPrefs.description"));
        
        // use project store if a project is currently opened
        GProject openedProject = projectService.getOpenedProject();
        if (openedProject == null) {
            // no currently opened project => no store, page not visible
            setPreferenceStore(null);
            this.setVisible(false);
            return;
        }
        
        // branch the preference store
        IPreferenceStore preferenceStore = projectService.getProjectPreferences(ProjectPreferencesKeys.NODE_ID);
        setPreferenceStore(preferenceStore);
        
        // compute future combo values
        List<DataType> predefinedTypes = getPredefinedTypes(openedProject);
        this.predefinedTypesValues = new String[predefinedTypes.size()][2];
        int i = 0;
        for (DataType d : predefinedTypes) {
            predefinedTypesValues[i][0] = d.getName();
            predefinedTypesValues[i][1] = new MRef(d).toString();
            i++;
        }
        
        this.visibilityValues = new String[][] { 
                { AppProjectUi.I18N.getString(VisibilityMode.PUBLIC.getName()), VisibilityMode.PUBLIC.getName() },
                { AppProjectUi.I18N.getString(VisibilityMode.PACKAGEVISIBILITY.getName()), VisibilityMode.PACKAGEVISIBILITY.getName() },
                { AppProjectUi.I18N.getString(VisibilityMode.PROTECTED.getName()), VisibilityMode.PROTECTED.getName() },
                { AppProjectUi.I18N.getString(VisibilityMode.PRIVATE.getName()), VisibilityMode.PRIVATE.getName() }, };
    }

    @objid ("d98d8707-e819-43ce-8348-ef450f72250c")
    private List<DataType> getPredefinedTypes(GProject openedProject) {
        IModel model = openedProject.getSession().getModel();
        DataType booleanDataType = model.findById(DataType.class, UUID.fromString("00000004-0000-0005-0000-000000000000"));
        if (booleanDataType != null) {
            return booleanDataType.getOwner().getOwnedElement(DataType.class);
        } else {
            AppProjectUi.LOG.warning("no predefined types found");
            return new ArrayList<DataType>();
        }
    }

    @objid ("41a2013b-7f82-43b2-90e4-3f8031be5b85")
    @Override
    public boolean isValid() {
        return super.isValid();
    }

    @objid ("ebe368fc-2f03-41c0-9863-4ffc3f94f815")
    @Override
    protected void performDefaults() {
        super.performDefaults();
    }

    @objid ("4fa6dc25-455e-484b-bdba-64adf851d816")
    @Override
    public boolean performOk() {
        final boolean ret = super.performOk();
        this.attDefaultType.store();
        this.attdefaultVisibility.store();
        this.parameterDefaultType.store();
        this.returnDefaultType.store();
        return ret;
    }

}
