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
                                    

package org.modelio.audit.preferences.ui;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.modelio.audit.plugin.Audit;
import org.modelio.audit.preferences.AuditConfigurator;
import org.modelio.audit.preferences.model.AuditConfigurationModel;
import org.modelio.audit.preferences.ui.editingsupports.AuditActivationEditingSupport;
import org.modelio.audit.preferences.ui.editingsupports.AuditSeverityEditingSupport;
import org.modelio.audit.service.IAuditService;
import org.modelio.ui.UIColor;

@objid ("2b7f61d2-a060-423f-9acf-5acf8d8b4dc9")
public class AuditPreferenceUi implements Listener {
    @objid ("5b697db6-2d8e-452c-bd31-448d4a5940e3")
    private Button exportToFile;

    @objid ("6a8eab62-89f0-4510-840e-fe26f4afaf0b")
    private Button importFromFile;

    @objid ("974124ca-0adc-4508-8e3a-51a7a799015a")
    private Button factory;

    @objid ("231da431-be9a-40c6-a0ed-54120b7595fa")
    private Button save;

    @objid ("7e70e13b-29f7-429e-8712-0d3441dc0659")
    private TreeViewer treeViewer;

    @objid ("c2c1e386-680a-40cf-829c-81072dded501")
    private AuditConfigurationModel preferences;

    @objid ("d5633ba9-d650-478c-94e8-f508c1c352e4")
    private IAuditService auditService;

    @objid ("b20b8808-ba8a-46d9-8367-6fe4544fd982")
    public AuditPreferenceUi(IAuditService auditService) {
        this.auditService = auditService;
    }

    @objid ("0dd74ccb-3555-44b4-8b96-9f0c4b493eb5")
    public Control createContents(Composite parent) {
        Composite root = new Composite(parent, SWT.NONE);
        root.setLayout(new GridLayout(1, true));
        
        this.treeViewer = new TreeViewer(root,  SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER );
        this.treeViewer.getTree().setHeaderVisible(false);
        this.treeViewer.getTree().setLinesVisible(true);
        
        // Layout the viewer
        GridData gridData = new GridData();
        gridData.verticalAlignment = GridData.FILL;
        gridData.horizontalSpan = 1;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.minimumHeight = 400;
        gridData.minimumWidth = 900;
        this.treeViewer.getControl().setLayoutData(gridData);
        
        // Create columns
        String[] columnTitles = { Audit.I18N.getString("Audit.PreferenceUI.Id"), Audit.I18N.getString("Audit.PreferenceUI.Activation"), Audit.I18N.getString("Audit.PreferenceUI.Severity"), Audit.I18N.getString("Audit.PreferenceUI.Summary")  };
        int[] columnInitialWidths = {100, 25, 25, 780};
        EditingSupport[] editingSupport = {null, new AuditSeverityEditingSupport(this.treeViewer), new AuditActivationEditingSupport(this.treeViewer), null};
        
        for(int i = 0 ; i < columnTitles.length;i++){
            TreeViewerColumn column = this.createTreeViewerColumn(columnTitles[i], columnInitialWidths[i]);
            column.setLabelProvider(new AuditPropertyLabelProvider());
            column.setEditingSupport(editingSupport[i]);
        }
        
        AuditPropertyContentProvider content = new AuditPropertyContentProvider();
        this.treeViewer.setContentProvider(content);
        
        AuditConfigurator configurator = new AuditConfigurator(this.auditService.getConfigurationPlan());
        this.preferences = configurator.createPrefModel();
        this.treeViewer.setInput(this.preferences);
        
        // The save/restore/factory settings button bar
        Composite composite = new Composite(root, SWT.NONE);
        GridData dataComposite = new GridData(SWT.FILL, SWT.FILL, true, false);
        composite.setLayoutData(dataComposite);
        composite.setLayout(new RowLayout(SWT.HORIZONTAL));
        
        this.exportToFile = new Button(composite, SWT.NONE);
        this.exportToFile.setText(Audit.I18N.getMessage("Preferences.Audit.Export.Label"));
        this.exportToFile.setToolTipText(Audit.I18N.getMessage("Preferences.Audit.Export.Tooltip"));
        
        this.importFromFile = new Button(composite, SWT.NONE);
        this.importFromFile.setText(Audit.I18N.getMessage("Preferences.Audit.Import.Label"));
        this.importFromFile.setToolTipText(Audit.I18N.getMessage("Preferences.Audit.Import.Tooltip"));
        
        this.factory = new Button(composite, SWT.NONE);
        this.factory.setText(Audit.I18N.getMessage("Preferences.Audit.Factory.Label"));
        this.factory.setToolTipText(Audit.I18N.getMessage("Preferences.Audit.Factory.Tooltip"));
        
        this.save = new Button(composite, SWT.NONE);
        this.save.setText(Audit.I18N.getMessage("Audit.PreferenceUI.Save.Label"));
        this.save.setToolTipText(Audit.I18N.getMessage("Audit.PreferenceUI.Save.Tooltip"));
        
        addListeners();
        return root;
    }

    @objid ("c9d05c97-84cf-4bc6-bf9c-d6f7ce1ba715")
    private TreeViewerColumn createTreeViewerColumn(String title, int bound) {
        final TreeViewerColumn column = new TreeViewerColumn(this.treeViewer,SWT.NONE);
        column.getColumn().setText(title);
        column.getColumn().setWidth(bound);
        column.getColumn().setResizable(true);
        column.getColumn().setMoveable(true);
        return column;
    }

    @objid ("593f9163-b908-4aad-a77b-3f516531319e")
    private Text createDescription(Composite parent) {
        Text descriptionText = new Text(parent, SWT.WRAP | SWT.MULTI);
        descriptionText.setEditable(false);
        descriptionText.setForeground(UIColor.LABEL_TIP_FG);
        descriptionText.setText(Audit.I18N.getString("Preferences.Audit.Description"));
        return descriptionText;
    }

    @objid ("9fdd3a8b-ea1b-4995-8d8f-5fe67d3d33bf")
    private void addListeners() {
        //getControl().addListener(SWT.FOCUSED, this);
        this.exportToFile.addListener(SWT.Selection, this);
        this.importFromFile.addListener(SWT.Selection, this);
        this.factory.addListener(SWT.Selection, this);
        this.save.addListener(SWT.Selection, this);
    }

    @objid ("0a9c0887-1779-41d3-b6a8-53b6339c5092")
    @Override
    public void handleEvent(Event event) {
        if (event.widget.equals(this.importFromFile)) {
            // import audit configuration from file
            Shell parentShell = Display.getDefault().getActiveShell();
            FileDialog dlg = new FileDialog(parentShell, SWT.OPEN);
            dlg.setFilterExtensions(new String[] { "*.xml" });
            dlg.setFilterNames(new String[] { Audit.I18N.getString("Preferences.Audit.Export.FileType") });
            String result = dlg.open();
            if (result != null) {     // Result is null when canceling
                File file = new File(dlg.getFilterPath(), dlg.getFileName());
                
                // use a configurator for 'file' settings
                AuditConfigurator configurator = new AuditConfigurator(file);
                this.preferences = configurator.createPrefModel();
                this.treeViewer.setInput(this.preferences);        
            }
        } else if (event.widget.equals(this.exportToFile)) {
            // export current audit config to file
            Shell parentShell = Display.getDefault().getActiveShell();
            FileDialog dlg = new FileDialog(parentShell, SWT.SAVE);
            dlg.setFilterExtensions(new String[] { "*.xml" });
            dlg.setFilterNames(new String[] { Audit.I18N.getString("Preferences.Audit.Import.FileType") });
            String result = dlg.open();
            if (result != null) {     // Result is null when canceling                
                File file = new File(dlg.getFilterPath(), dlg.getFileName());
                
                if (file.getName().endsWith(".xml") == false) {
                    file = new File(file.getAbsolutePath() + ".xml");
                }
                
                // save current preferences before exporting
                // use a configurator for current config file
                AuditConfigurator configurator = new AuditConfigurator(this.auditService.getConfigurationPlan());
                configurator.apply(this.preferences);
                
                // export
                configurator.saveAs(file);
            }
        
        } else if (event.widget.equals(this.factory)) {
            // use a configurator for factory settings
            AuditConfigurator configurator = new AuditConfigurator(null);
            this.preferences = configurator.createPrefModel();
            this.treeViewer.setInput(this.preferences);         
        } else if (event.widget.equals(this.save)) {       
            AuditConfigurator configurator = new AuditConfigurator(this.auditService.getConfigurationPlan());
            configurator.apply(this.preferences);
            
            // replace the current by the updated plan
            this.auditService.restart();      
        }
    }

}
