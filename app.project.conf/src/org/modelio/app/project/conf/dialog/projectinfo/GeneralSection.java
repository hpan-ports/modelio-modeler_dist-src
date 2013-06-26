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
                                    

package org.modelio.app.project.conf.dialog.projectinfo;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.modelio.app.project.conf.dialog.ProjectModel;
import org.modelio.app.project.conf.plugin.AppProjectConf;
import org.modelio.gproject.descriptor.DefinitionScope;
import org.modelio.ui.UIColor;
import org.modelio.ui.UIImages;
import org.osgi.framework.Bundle;

/**
 * Manage the general project summary section.
 */
@objid ("a7459d55-33f6-11e2-a514-002564c97630")
class GeneralSection {
    @objid ("8ba4c535-3ec5-11e2-8121-002564c97630")
    private static final String INFO_CONTACT = "info.contact";

    @objid ("8ba4ec49-3ec5-11e2-8121-002564c97630")
    private static final String INFO_DESCRIPTION = "info.description";

    @objid ("7539c8a8-8cc3-4823-9bbe-012817c98141")
    private static final String INFO_PROJECT_ICON_NAME = "info.projetIconName";

    @objid ("ee2e427a-9e63-4de2-8654-3402498d1caa")
    private static final String INFO_PROJECT_LOGO_NAME = "info.projetLogoName";

    @objid ("208b95db-67d1-41e2-9d49-0e0fadbd86d8")
    private static final int SMALL_BUTTON_HEIGHT = 28;

    @objid ("eb4f3a0a-47d4-416a-8576-db1565b15546")
    private static final int SMALL_BUTTON_WIDTH = 28;

    /**
     * The project that is currently being displayed by the section.
     */
    @objid ("a7459d56-33f6-11e2-a514-002564c97630")
    protected ProjectModel displayedProject;

    @objid ("a7459d58-33f6-11e2-a514-002564c97630")
    protected Text projectName;

    @objid ("a7459d59-33f6-11e2-a514-002564c97630")
    protected Text projectDescription;

    @objid ("a7459d5c-33f6-11e2-a514-002564c97630")
    protected Text projectContact;

    @objid ("e6a940ec-7a54-47e7-8a55-3e3a20bd279c")
    protected Image projectIcon;

    @objid ("fd80bf9d-6bf7-4ac3-9db1-c9a62dfe36d5")
    private Label projectIconPreviewLabel;

    @objid ("a43e5376-907e-417d-8118-84cbee863c16")
    protected Image projectIconPlaceholderIcon = null;

    @objid ("48e5598f-e08b-4cc2-8dbc-a897d450949b")
    protected Image projectLogoPlaceholderIcon = null;

    @objid ("08e6798f-fd19-4003-b841-a39f1f439603")
    private Button deleteProjectIconBtn = null;

    @objid ("28fb8cd7-133c-4a66-824b-e14185850f7e")
    private Button deleteProjectLogoBtn = null;

    @objid ("acdbbe8f-0eab-417d-bdf9-ce743a803cbd")
    protected Image projectLogo;

    @objid ("3308a360-5929-415b-b186-e4dd5c25bc27")
    private Label projectLogoPreviewLabel;

    /**
     * C'tor
     */
    @objid ("a7459d5d-33f6-11e2-a514-002564c97630")
    public GeneralSection() {
        // nothing
    }

    @objid ("a7459d60-33f6-11e2-a514-002564c97630")
    public Section createControls(final FormToolkit toolkit, final Composite parent) {
        Section section = toolkit.createSection(parent, ExpandableComposite.TITLE_BAR | ExpandableComposite.TWISTIE);
        section.setText(AppProjectConf.I18N.getString("GeneralSection.SectionText")); //$NON-NLS-1$
        section.setExpanded(true);
        
        section.addDisposeListener(new DisposeListener() {
            
            @Override
            public void widgetDisposed(DisposeEvent e) {
                dispose();
            }
        });
        
        Composite composite = toolkit.createComposite(section, SWT.WRAP);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.makeColumnsEqualWidth = false;
        composite.setLayout(layout);
        
        // Project name
        Label nameLabel = toolkit.createLabel(composite, AppProjectConf.I18N.getString("GeneralSection.Name"), SWT.NONE); //$NON-NLS-1$ 
        nameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, true));
        
        this.projectName = toolkit.createText(composite, "", SWT.NONE); //$NON-NLS-1$ 
        this.projectName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        this.projectName.setEditable(false);
        this.projectName.addModifyListener(new GeneralModificationListener());
        this.projectName.setForeground(UIColor.LABEL_TIP_FG);
        
        initImages();
        
        // Project image (logo and icon)
        Label leftLogoLabel = toolkit.createLabel(composite, AppProjectConf.I18N.getString("GeneralSection.ProjectImages"), SWT.NONE); //$NON-NLS-1$ 
        leftLogoLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false));
        
        Composite imageComposite = toolkit.createComposite(composite, SWT.WRAP);
        GridData imageCompositeGd = new GridData(SWT.FILL, SWT.FILL, true, true);
        imageComposite.setLayoutData(imageCompositeGd);
        GridLayout imageCompositeLayout = new GridLayout();
        imageCompositeLayout.numColumns = 2;
        imageCompositeLayout.makeColumnsEqualWidth = true;
        imageComposite.setLayout(imageCompositeLayout);
        // Project logo(64*64) with its add and delete buttons
        this.projectLogoPreviewLabel = createSelectImageField(toolkit, imageComposite, 64, 64, INFO_PROJECT_LOGO_NAME, "GeneralSection.SelectProjectLogo", "64 * 64");
        // Project icon(16*16) with its add and delete buttons
        this.projectIconPreviewLabel = createSelectImageField(toolkit, imageComposite, 64, 64, INFO_PROJECT_ICON_NAME, "GeneralSection.SelectProjectIcon", "16 * 16");
        
        // Project contact
        Label contactLabel = toolkit.createLabel(composite, AppProjectConf.I18N.getString("GeneralSection.Contact"), SWT.NULL); //$NON-NLS-1$ 
        contactLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, true));
        
        this.projectContact = toolkit.createText(composite, "", SWT.NONE); //$NON-NLS-1$ 
        this.projectContact.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        this.projectContact.setEditable(true);
        this.projectContact.addModifyListener(new GeneralModificationListener());
        
        // Project description
        Label descriptionLabel = toolkit.createLabel(composite, AppProjectConf.I18N.getString("GeneralSection.Description"), SWT.NULL); //$NON-NLS-1$ 
        descriptionLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, true));
        
        this.projectDescription = toolkit.createText(composite, "", SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL); //$NON-NLS-1$
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.heightHint = 100;    // fix the height of project description text area, or the height will depend on the text
        this.projectDescription.setLayoutData(gd);
        this.projectDescription.setEditable(true);
        this.projectDescription.addModifyListener(new GeneralModificationListener());
        
        toolkit.paintBordersFor(composite);
        section.setClient(composite);
        return section;
    }

    @objid ("a7459d68-33f6-11e2-a514-002564c97630")
    public void setInput(ProjectModel projectAdapter) {
        this.displayedProject = projectAdapter;
        
        if (projectAdapter == null) {
            clearFields();
        } else {
            fillFields(projectAdapter);
        }
    }

    @objid ("a745c449-33f6-11e2-a514-002564c97630")
    private void fillFields(ProjectModel projectAdapter) {
        this.projectName.setText(projectAdapter.getName());
        this.projectName.setEnabled(true);
        this.projectDescription.setText(projectAdapter.getProperties().getValue("info.description", "")); //$NON-NLS-1$ //$NON-NLS-2$
        this.projectDescription.setEnabled(true);
        this.projectContact.setText(projectAdapter.getProperties().getValue(INFO_CONTACT, "")); //$NON-NLS-1$ //$NON-NLS-2$
        this.projectContact.setEnabled(true);
        createAndDisplayImage(INFO_PROJECT_LOGO_NAME);
        createAndDisplayImage(INFO_PROJECT_ICON_NAME);
    }

    @objid ("a745c44c-33f6-11e2-a514-002564c97630")
    private void clearFields() {
        this.projectName.setText(""); //$NON-NLS-1$
        this.projectName.setEnabled(false);
        this.projectDescription.setText(""); //$NON-NLS-1$
        this.projectDescription.setEnabled(false);
        this.projectContact.setText(""); //$NON-NLS-1$
        this.projectContact.setEnabled(false);
    }

    /**
     * @param propertyName
     */
    @objid ("5643f123-2be4-4873-a626-5c96339be5b4")
    protected void deleteExistImage(String propertyName) {
        try {
            if (getProjectImagePath(propertyName) != null) {                
                Files.deleteIfExists(getProjectImagePath(propertyName));
            }
        } catch (IOException e) {
            AppProjectConf.LOG.error("Error when delete the exist project logo or icon.");
            AppProjectConf.LOG.debug(e);
        }
    }

    /**
     * @param propertyName
     */
    @objid ("fdfe9f7b-571a-4ef2-9d8f-faeb39461f3f")
    protected void createAndDisplayImage(String propertyName) {
        Image image = null;
        Label label = null;
        if (propertyName.equals(INFO_PROJECT_ICON_NAME)) {
            image = createProjectIcon();
            label = this.projectIconPreviewLabel;
            if (this.deleteProjectIconBtn!=null && this.projectIcon!=null) this.deleteProjectIconBtn.setEnabled(true);
        } else if (propertyName.equals(INFO_PROJECT_LOGO_NAME)) {            
            image = createProjectLogo();
            label = this.projectLogoPreviewLabel;
            if (this.deleteProjectLogoBtn!=null && this.projectLogo!=null) this.deleteProjectLogoBtn.setEnabled(true);
        }
        
        setImageToLabel(label, image);
    }

    /**
     * @return
     */
    @objid ("119828bc-3dfc-4a3c-aa72-00cf9fc26ea4")
    private Image createProjectIcon() {
        if (this.projectIcon!=null && !this.projectIcon.isDisposed()) {
            this.projectIcon.dispose();
        }
        if (getProjectImagePath(INFO_PROJECT_ICON_NAME) != null) {            
            Image originalImage = new Image(null,getProjectImagePath(INFO_PROJECT_ICON_NAME).toString());
            this.projectIcon = new Image(null, originalImage.getImageData().scaledTo(16,16));
            originalImage.dispose();
            return this.projectIcon;
        }
        return this.projectIconPlaceholderIcon;
    }

    @objid ("9466229c-a676-46af-b15f-e8f891c7f043")
    private void setImageToLabel(Label iconLabel, Image aIcon) {
        if (iconLabel != null && !iconLabel.isDisposed()) {
            
            iconLabel.setImage(aIcon);
            iconLabel.setVisible(aIcon != null);
        }
    }

    @objid ("7f5308ca-d826-400c-9ebc-e6f91b48316d")
    private Path getProjectImagePath(String propertyName) {
        String imageName = this.displayedProject.getProperties().getValue(propertyName);
        if (imageName == null) return null;
        Path imagePath = null;
        imagePath = this.displayedProject.getPath().resolve("data").resolve(imageName);
        if (imagePath!=null && Files.exists(imagePath)) {            
            return imagePath;
        }
        return null;
    }

    /**
     * @param toolkit
     * @param composite
     * @param height
     * @param width
     * @param propertyName
     * @param dialogTitleKey
     * @param sizeString @return
     */
    @objid ("c035c84f-0d1e-42f7-baa1-dbde79056322")
    private Label createSelectImageField(final FormToolkit toolkit, Composite composite, int height, int width, String propertyName, String dialogTitleKey, String sizeString) {
        Composite panel = toolkit.createComposite(composite, SWT.NONE );
        GridData panelGd = new GridData(SWT.FILL, SWT.FILL, true, true);
        panel.setLayoutData(panelGd);
        GridLayout panelGl = new GridLayout();
        panelGl.numColumns = 1;
        panel.setLayout(panelGl);
        
        // create image with buttons panel (image on the left and the two add/delete button on the right)
        Composite imageButtonPanel = toolkit.createComposite(panel, SWT.NONE);
        GridLayout imageButtonPanelGl = new GridLayout();
        imageButtonPanelGl.numColumns = 2;
        imageButtonPanel.setLayout(imageButtonPanelGl);
        GridData imageButtonPanelGd = new GridData(SWT.CENTER, SWT.CENTER, true, true);      
        imageButtonPanel.setLayoutData(imageButtonPanelGd);
        // image on the left
        Label imageLabel = toolkit.createLabel(imageButtonPanel, "", SWT.CENTER);
        GridData imageLabelGd = new GridData(SWT.CENTER, SWT.CENTER, false, false);
        imageLabelGd.heightHint = height;
        imageLabelGd.widthHint = width+10;   //add 10 as space between the btnPanel
        imageLabel.setLayoutData(imageLabelGd);        
        
        // The buttons composite on the right
        Composite btnPanel = toolkit.createComposite(imageButtonPanel, SWT.NONE);
        GridData btnPanelGd = new GridData(SWT.FILL, SWT.FILL, false, false);
        btnPanel.setLayoutData(btnPanelGd);
        GridLayout btnPanelGl = new GridLayout();
        btnPanelGl.numColumns = 1;
        imageButtonPanel.setLayout(imageButtonPanelGl);
        btnPanel.setLayout(btnPanelGl);
        // two buttons with vertical layout
        createSelectImageButton(toolkit, btnPanel, propertyName, AppProjectConf.I18N.getString(dialogTitleKey));
        createDeleteImageButton(toolkit, btnPanel, propertyName);
        
        // label at the bottom
        Label sizeLabel = toolkit.createLabel(panel, sizeString, SWT.NONE);
        GridData sizeLabelGd = new GridData(SWT.CENTER, SWT.CENTER, false, false);
        sizeLabel.setEnabled(false);    //display in grey
        sizeLabel.setLayoutData(sizeLabelGd);
        return imageLabel;
    }

    /**
     * @param toolkit
     * @param composite
     * @param propertyName
     */
    @objid ("34f520b0-af96-4729-8a8d-b3a396da63e3")
    private void createDeleteImageButton(final FormToolkit toolkit, Composite composite, final String propertyName) {
        Button deleteImageBtn = toolkit.createButton(composite, "" , SWT.PUSH);
        deleteImageBtn.setImage(UIImages.DELETE);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd.widthHint = SMALL_BUTTON_WIDTH;
        gd.heightHint = SMALL_BUTTON_HEIGHT;
        deleteImageBtn.setLayoutData(gd);
        setDeleteButtonEnable(deleteImageBtn, propertyName);      
        deleteImageBtn.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                // delete image
                deleteImage(propertyName);
            }
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // nothing to do
            }
        
        });
    }

    /**
     * @param deleteImageBtn
     * @param propertyName
     */
    @objid ("802cd524-0d04-44e3-93b4-8731a0414cab")
    private void setDeleteButtonEnable(Button deleteImageBtn, String propertyName) {
        if (propertyName.equals(INFO_PROJECT_LOGO_NAME)) {
            this.deleteProjectLogoBtn = deleteImageBtn;
            this.deleteProjectLogoBtn.setEnabled(this.projectLogo!=null);
        } else {
            this.deleteProjectIconBtn = deleteImageBtn;
            this.deleteProjectIconBtn.setEnabled(this.projectIcon!=null);
        }
    }

    /**
     * @param propertyName
     */
    @objid ("27a79551-3e45-4ccf-9ea8-365dd4fb4fe0")
    protected void deleteImage(String propertyName) {
        Path imagePath = getProjectImagePath(propertyName);
        if (imagePath != null) {
            try {
                Files.deleteIfExists(getProjectImagePath(propertyName));
                if (propertyName.equals(INFO_PROJECT_ICON_NAME)) {
                    setImageToLabel(this.projectIconPreviewLabel, this.projectIconPlaceholderIcon);
                    if (this.deleteProjectIconBtn!=null) this.deleteProjectIconBtn.setEnabled(false);
                } else if (propertyName.equals(INFO_PROJECT_LOGO_NAME)) {
                    setImageToLabel(this.projectLogoPreviewLabel, this.projectLogoPlaceholderIcon);
                    if (this.deleteProjectLogoBtn!=null) this.deleteProjectLogoBtn.setEnabled(false);
                }
            } catch (IOException e) {
                AppProjectConf.LOG.error("Error when delete exist project logo or icon");
                AppProjectConf.LOG.debug(e);
            }
        }
            
        GeneralSection.this.displayedProject.getProperties().remove(propertyName);
    }

    /**
     * @param toolkit
     * @param composite
     * @param propertyName
     * @param dialogTitle
     */
    @objid ("19efde6b-b55e-4ede-8782-90540bb904ec")
    private void createSelectImageButton(final FormToolkit toolkit, Composite composite, final String propertyName, final String dialogTitle) {
        Button selectImageBtn = toolkit.createButton(composite, "" , SWT.PUSH);
        selectImageBtn.setImage(UIImages.FILECHOOSE);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd.widthHint = SMALL_BUTTON_WIDTH;
        gd.heightHint = SMALL_BUTTON_HEIGHT;
        selectImageBtn.setLayoutData(gd);
        selectImageBtn.addSelectionListener(new SelectionListener() {
            
            @Override
            public void widgetSelected(SelectionEvent e) {
                FileDialog fd = new FileDialog(Display.getDefault().getActiveShell(), SWT.SELECTED);
                fd.setText(dialogTitle); //$NON-NLS-1$
                String[] filterExt = { "*.png" ,"*.jpg"}; //$NON-NLS-1$
                fd.setFilterExtensions(filterExt);
                String selected = fd.open();
                String selectedName = fd.getFileName();
                if (selected != null && !selected.isEmpty()) {
                    deleteExistImage(propertyName);
                    File selectedFile = new File(selected);
                    AppProjectConf.LOG.info(selected + " is selected.");
                    try {
                        Path newImagePath = GeneralSection.this.displayedProject.getPath().resolve("data").resolve(selectedName);
                        // if selected project logo and icon have the same name ...
                        int i = 1;
                        while (Files.exists(newImagePath)) 
                        {
                            selectedName = "(" + i + ")" + selectedName;
                            newImagePath =  newImagePath.resolveSibling(selectedName);
                            i++;
                        }
                        Files.copy(selectedFile.toPath(), newImagePath);
                        GeneralSection.this.displayedProject.getProperties().setProperty(propertyName, selectedName, DefinitionScope.LOCAL);
                        createAndDisplayImage(propertyName);
                    } catch (IOException e1) {
                        AppProjectConf.LOG.error("Error when copy the project icon to data file.");
                        AppProjectConf.LOG.debug(e1);
                    }
                    
                }
            }
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // nothing to do
            }
        
        });
    }

    /**
     * @return
     */
    @objid ("ad71b2ad-114b-428a-bcaa-8fee9c5aa839")
    private Image createProjectLogo() {
        if (this.projectLogo!=null && !this.projectLogo.isDisposed()) {
            this.projectLogo.dispose();
        }
        if (getProjectImagePath(INFO_PROJECT_LOGO_NAME) != null) {            
            Image originalImage = new Image(null,getProjectImagePath(INFO_PROJECT_LOGO_NAME).toString());
            this.projectLogo = new Image(null, originalImage.getImageData().scaledTo(64,64));
            originalImage.dispose();
            return this.projectLogo;
        }
        return this.projectLogoPlaceholderIcon;
    }

    /**
     * Dispose all the images when close the project configuration window
     */
    @objid ("28d4656e-2a56-4c8b-bdc2-6f36e1204b61")
    protected void dispose() {
        if (this.projectIconPlaceholderIcon != null) {
            this.projectIconPlaceholderIcon.dispose();
            this.projectIconPlaceholderIcon = null;
        }
        if (this.projectLogoPlaceholderIcon != null) {
            this.projectLogoPlaceholderIcon.dispose();
            this.projectLogoPlaceholderIcon = null;
        }
        if (this.projectLogo != null) {
            this.projectLogo.dispose();
            this.projectLogo = null;
        }
        if (this.projectIcon != null) {
            this.projectIcon.dispose();
            this.projectIcon = null;
        }
    }

    @objid ("7aae0861-481f-4404-a61b-d120c4b426e5")
    private String getFilePathOf(String fileName) {
        String path="";
        Bundle bundle = Platform.getBundle(AppProjectConf.PLUGIN_ID);
        String s = "platform:/plugin/"+bundle.getSymbolicName()+"/"+fileName;   // To avoid the space in the bundle path
        URL url = null;
        try {
            url = new URL(s);
            path = FileLocator.toFileURL(url).getPath();           
        } catch (Exception e) {
            AppProjectConf.LOG.debug("File path %s is not found!", s);
            AppProjectConf.LOG.error(e);
        }
        return path;
    }

    @objid ("98a21a9d-93b1-4e14-963d-bf0b4ce2bfd8")
    private void initImages() {
        if (this.projectLogoPlaceholderIcon==null) this.projectLogoPlaceholderIcon = new Image(null, getFilePathOf("icons/placeholder64.png"));
        if (this.projectIconPlaceholderIcon==null) this.projectIconPlaceholderIcon = new Image(null, getFilePathOf("icons/placeholder16.png"));
    }

    @objid ("8b8c5b38-3ec5-11e2-8121-002564c97630")
    private class GeneralModificationListener implements ModifyListener {
        @objid ("8b8c5b39-3ec5-11e2-8121-002564c97630")
        public GeneralModificationListener() {
            // Empty constructor
        }

        @objid ("8b8c5b3b-3ec5-11e2-8121-002564c97630")
        @Override
        public void modifyText(ModifyEvent e) {
            if (e.widget == GeneralSection.this.projectName) {
                // TODO set name
            } else if (e.widget == GeneralSection.this.projectDescription) {
                GeneralSection.this.displayedProject.getProperties().setProperty(INFO_DESCRIPTION, GeneralSection.this.projectDescription.getText(), DefinitionScope.LOCAL);
            } else if (e.widget == GeneralSection.this.projectContact) {
                GeneralSection.this.displayedProject.getProperties().setProperty(INFO_CONTACT, GeneralSection.this.projectContact.getText(), DefinitionScope.LOCAL);
            }
        }

    }

}
