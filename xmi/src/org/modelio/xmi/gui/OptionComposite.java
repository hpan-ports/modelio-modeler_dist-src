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
                                    

package org.modelio.xmi.gui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.modelio.api.exchange.XmiExportConfiguration.VersionExport;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.xmi.api.FormatExport;
import org.modelio.xmi.api.XMIExtension;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.preferences.XmiPreferencesKeys;

/**
 * This class creates central composite of the XMI export dialogs (model and profile exports).
 * It is composed of several SWT composites, each of them is dedicated to a specific export option
 * i.e. the file path, the extention of the file, the UML version, etc.
 * 
 * This is a SWT composite
 * @author ebrosse
 */
@objid ("ab8ce695-54ca-4a64-a74f-1dde0fb28dc3")
public class OptionComposite extends Composite {
    @objid ("8da63023-21b0-4598-aa9a-cd1544a78f92")
    private FormatExport[] versions = FormatExport.values();

    @objid ("eaff84d0-e392-47c7-8271-80087b73db7c")
    private Button compatibility = null;

    @objid ("1c7654ba-2b7e-444c-9479-c6850500799a")
    private Combo combo = null;

    @objid ("a3b19794-b3b3-4adf-8de8-bff74ba1cd2b")
    private Label label = null;

    @objid ("92416989-29c8-4d01-a2e0-aec426cf53a7")
    private Group groupOwner = null;

    @objid ("12ae03f0-284c-4243-9ec7-d21cdab43454")
    private Group groupExtension = null;

    @objid ("c694429f-e2c1-4b47-9ce5-a5329afaa7c5")
    private Button xmi = null;

    @objid ("d8f24ae9-6bbe-4dee-9b24-faaa83a34b05")
    private Button uml = null;

    @objid ("de20c3fa-bd8a-4ef3-a079-f592acdd3ed3")
    private Group groupCompatibility = null;

    /**
     * The constructor of the OptionComposite
     * @param parent : the parent composite
     * @param style : the SWT style of the returned composite
     */
    @objid ("ff77c766-2014-4379-8435-d87cfa32294e")
    public OptionComposite(final Composite parent, final int style, IProjectService projectService) {
        super(parent, style);
        setLayout(new FormLayout());
        
        this.groupOwner = new Group(this, SWT.NONE);
        final FormData fd_group = new FormData();
        fd_group.bottom = new FormAttachment(100, 0);
        fd_group.top = new FormAttachment(0, 0);
        fd_group.right = new FormAttachment(100, 0);
        fd_group.left = new FormAttachment(0, 0);
        
        this.groupOwner.setLayoutData(fd_group);
        
        this.groupOwner.setText(Xmi.I18N.getString("fileChooser.options.export.group.option.name"));
        
        this.groupCompatibility = new Group(this.groupOwner, SWT.NONE);
        this.groupCompatibility.setBounds(35, 20, 350, 80);
        this.groupCompatibility.setText(Xmi.I18N.getString("fileChooser.options.export.group.compatibility.name"));
        
        this.compatibility = new Button(this.groupCompatibility, SWT.CHECK);
        this.compatibility.setBounds(30, 20, 220, 16);
        
        this.compatibility.setText(Xmi.I18N.getString("fileChooser.options.export.enableRoundtrip.name"));
        
        
        IPreferenceStore prefs = projectService.getProjectPreferences(Xmi.PLUGIN_ID);
        
        String compatibilityMdacParameterValueString = prefs.getString(XmiPreferencesKeys.XMIANNOTATION_PREFKEY);
        if (compatibilityMdacParameterValueString.equals(""))
            compatibilityMdacParameterValueString = "true";
        
        boolean compatibilityMdacParameterValue = Boolean.valueOf(compatibilityMdacParameterValueString);               
        
        this.compatibility.setSelection(compatibilityMdacParameterValue);
        
        this.combo = new Combo(this.groupCompatibility, SWT.READ_ONLY);
        
        String currentExport = prefs.getString(XmiPreferencesKeys.XMIFORMAT_PREFKEY);
        
        if( currentExport.equals(""))
            currentExport = VersionExport.EMF300.toString();
        
        for (int i = 0; i < this.versions.length; i++) {
            this.combo.add(Xmi.I18N.getString("Ui.Parameter.VersionExport." + this.versions[i].name()));
            if (this.versions[i].name().equals(currentExport))
                this.combo.select(i);
        
        }
        
        this.combo.setBounds(130, 50, 150, 13);
        
        this.label = new Label(this.groupCompatibility, SWT.WRAP);
        this.label.setText(Xmi.I18N.getString("fileChooser.options.export.version.name") + " : ");
        this.label.setBounds(40, 50, 90, 13);
               
        this.groupExtension = new Group(this.groupOwner, SWT.NONE);
               
        this.groupExtension.setText(Xmi.I18N.getString("fileChooser.options.export.group.extension.name"));
        
        this.groupExtension.setBounds(410, 20, 140, 80);
        this.xmi = new Button(this.groupExtension, SWT.RADIO);
        this.xmi.setBounds(40, 20, 100, 20);
        this.xmi.setText(".xmi");
        
        this.uml = new Button(this.groupExtension, SWT.RADIO);
        this.uml.setBounds(40, 50, 100, 20);
        this.uml.setText(".uml");
        
        String extension = prefs.getString(XmiPreferencesKeys.XMIEXTENSION_PREFKEY);
               
        if (extension.equals(XMIExtension.UML.toString())) {
            this.uml.setSelection(true);
        } else {
            this.xmi.setSelection(true);
        }
        
        this.groupOwner.pack();
    }

    /**
     * This method returns the UML version specified
     * @return a UML version of the export
     */
    @objid ("9f592acb-00f8-494d-be4f-f76b9bc7634d")
    public FormatExport getVersion() {
        return this.versions[this.combo.getSelectionIndex()];
    }

    /**
     * This method returns the UML radio button
     * @return SWT Button
     */
    @objid ("a2ca9326-6b1e-49c4-9183-51452e8bb1a4")
    public Button getUMLButton() {
        return this.uml;
    }

    /**
     * This method returns the XMI radio button
     * @return SWT Button
     */
    @objid ("382784ac-738f-4456-a08d-453fa58ff4d0")
    public Button getXMIButton() {
        return this.xmi;
    }

    /**
     * This method returns the specified file extension
     * @return the file extension .xmi or .uml
     */
    @objid ("010bcdad-d248-42eb-a9b0-5b4bbd1f9d4a")
    public XMIExtension getExtension() {
        if (this.uml.getSelection())
            return XMIExtension.UML;
        else
            return XMIExtension.XMI;
    }

    /**
     * This method returns the compatibility checkbox
     * @return SWT CheckBox
     */
    @objid ("2e28c92d-1bbe-45b5-9779-64a430585274")
    public Button getCompatibilityButton() {
        return this.compatibility;
    }

    /**
     * this method returns the label of the composite
     * @return SWT Label
     */
    @objid ("ad2a3221-54a3-4890-91b2-d3f0f4d0fca5")
    public Label getLabelButton() {
        return this.label;
    }

    /**
     * This method returns the UML format ComboButton
     * @return the SWT Combo
     */
    @objid ("23310c6f-ac88-4b08-9595-18d0a45d8c21")
    public Combo getComboButton() {
        return this.combo;
    }

    /**
     * This methods updates the selection of .uml file extension
     */
    @objid ("14003bcc-0fad-45a9-9c1c-2781d5f03159")
    public void setUMLSelected() {
        this.uml.setSelection(true);
        this.xmi.setSelection(false);
    }

    /**
     * This methods updates the selection of .xmi file extension
     */
    @objid ("7c8c9a4d-d140-44e1-81ec-dbbb4466a20e")
    public void setXMISelected() {
        this.xmi.setSelection(true);
        this.uml.setSelection(false);
    }

    /**
     * This method returns the availability of the annotation export
     * @return true if the annotation must be exported
     */
    @objid ("f6b952fe-1cfc-464b-8655-7d0b7462c2a6")
    public boolean isAnnoted() {
        return this.compatibility.getSelection();
    }

}
