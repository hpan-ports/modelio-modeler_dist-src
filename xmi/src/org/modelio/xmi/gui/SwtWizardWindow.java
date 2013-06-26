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

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.IProgressService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.BareBonesBrowserLaunch;
import org.modelio.xmi.util.ResourceLoader;
import org.modelio.xmi.util.XMILogs;

/**
 * @author ebrosse
 */
@objid ("1a100142-c8b9-4881-a68a-b4758f54b846")
public abstract class SwtWizardWindow extends Dialog {
    @objid ("7c035128-cfc4-49db-bdff-72b432ec516b")
    private String title = "";

    @objid ("9e7ad914-ed6a-4b1d-a06d-3f37272e0a93")
    private String description = "";

    @objid ("bfe188ef-c9ff-43af-a6e3-754de862f938")
    private String frametitle = "";

    @objid ("b6afb681-a430-4d57-bd3d-f38245de7a12")
    private String cancelButton = "";

    @objid ("76288032-2547-4e34-a040-fbf8889de99f")
    private String validateButton = "";

    @objid ("98250556-a4b5-4bec-b10f-50f855908f12")
    private int selectedType = SWT.OPEN;

    @objid ("7620c237-167f-44d3-ba25-9bd8d4cebb83")
    private static boolean cancelation = false;

    @objid ("2c8e03ad-88c0-49cc-9f3c-ea39259a1031")
    protected boolean exportWindows = false;

    @objid ("ddddede0-77be-4d78-ae4b-c8b32c0f03e9")
    protected boolean error = false;

    @objid ("999a039e-dd35-4dbb-8a9e-9275d32b56ff")
    protected static String path = "";

    @objid ("8849d92a-1bae-4656-9e9b-bdf0ac8598b5")
    protected FileChooserComposite fileChooserComposite = null;

    @objid ("823d5589-9eb4-4524-aaed-b2f5c5774b11")
    protected OptionComposite optionComposite = null;

    @objid ("3282d1e7-d8e8-42e9-8ba4-6cd06dd1779c")
    private ValidationBoutonComposite validateComposite = null;

    @objid ("4ec50607-ecc1-4aa3-97d4-990f119f0ccc")
    protected ProgressBarComposite theProgressBar = null;

    @objid ("b4c6e0e7-1e30-4136-bbf5-cfad1a345f1b")
    protected XMIThread theThread = null;

    @objid ("4419d907-7f92-48ed-810d-6ee9ff84ee4c")
    protected Element selectedElt = null;

    @objid ("848d23a2-80e2-4645-b12f-8074743e9242")
    protected Shell shell = null;

    @objid ("cf69485c-7998-4e88-8140-9f9c9a71ea8f")
    protected IProgressService progressService = null;

    @objid ("09b24b1f-1421-45c0-8f89-65b989692975")
    protected IProjectService projectService = null;

    /**
     * @return nothing
     */
    @objid ("ddfdcbbf-f211-49e0-836f-d4b828921f02")
    public Object open() {
        setCancellation(false);
        createContents();
        Display display = getParent().getDisplay();
        centerOnPrimaryScreen(display);
        this.shell.open();
        this.shell.layout();
        
        while (!this.shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        return null;
    }

    @objid ("f3c9107c-43bf-4c75-848d-8ba76a81495f")
    protected void createContents() {
        setLabels();
        
        this.shell = new Shell(getParent(), 67696 | SWT.APPLICATION_MODAL | SWT.RESIZE | SWT.TITLE);
        this.shell.setLayout(new FormLayout());
        this.shell.setText(this.frametitle);
        
        this.shell.setImage(ResourceLoader.getInstance().getImage("wobjing16.bmp"));
        
        // Header composite
        final Composite headerComposite = new BannerComposite(this.shell, SWT.NONE, this.title, this.description);
        headerComposite.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
        
        // File chooser composite
        this.fileChooserComposite = new FileChooserComposite(this.shell, SWT.NONE, this.selectedType);
        
        // Option Composite
        setOptionComposite(this.shell, this.projectService);
        
        // Progress Bar Composite
        this.theProgressBar = new ProgressBarComposite(this.shell, SWT.NONE);
        
        // Validation Composite
        this. validateComposite = new ValidationBoutonComposite(this.shell, SWT.NONE, this.cancelButton, this.validateButton);
        
        this.validateComposite.getValidationButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                disableComposites();
        
                if (getFileChooserComposite().getCurrentFile() != null) {
                    validationAction();
                } else {
                    selectAFile();  
                }
                enableComposites();
            }
        });
        
        this.validateComposite.getCancelButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                setCancellation(true);
                cancelAction();
            }
        });
        
        final FormData fd_headerComposite = new FormData();
        fd_headerComposite.right = new FormAttachment(100, 0);
        fd_headerComposite.bottom = new FormAttachment(0, 50);
        fd_headerComposite.top = new FormAttachment(0, 0);
        fd_headerComposite.left = new FormAttachment(0, 0);
        headerComposite.setLayoutData(fd_headerComposite);
        
        final FormData fd_fileChooserComposite = new FormData();
        fd_fileChooserComposite.top = new FormAttachment(headerComposite, 5);
        fd_fileChooserComposite.right = new FormAttachment(headerComposite, 0, SWT.RIGHT);
        fd_fileChooserComposite.left = new FormAttachment(headerComposite, 0, SWT.LEFT);
        this.fileChooserComposite.setLayoutData(fd_fileChooserComposite);
        
        if (this.exportWindows) {
            final FormData fd_optionComposite = new FormData();
            fd_optionComposite.top = new FormAttachment(this.fileChooserComposite, 0);
            fd_optionComposite.left = new FormAttachment(this.fileChooserComposite, 5, SWT.LEFT);
            fd_optionComposite.right = new FormAttachment(this.fileChooserComposite, -5, SWT.RIGHT);
            this.optionComposite.setLayoutData(fd_optionComposite);
        
            this.optionComposite.getUMLButton().addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (SwtWizardWindow.this.optionComposite.getUMLButton().getSelection()) {
                        setUMLExtension();
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFilterNames(new String[] { "UML Files", "XMI Files" });
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.uml", "*.xmi" });
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFileName(((Package) SwtWizardWindow.this.selectedElt).getName() + ".uml");
                    }
                }
            });
        
            this.optionComposite.getUMLButton().setToolTipText(Xmi.I18N.getString("fileChooser.options.export.description.uml"));
        
            this.optionComposite.getCompatibilityButton().setToolTipText(Xmi.I18N.getString("fileChooser.options.export.description.annotation"));
        
            this.optionComposite.getComboButton().setToolTipText(Xmi.I18N.getString("fileChooser.options.export.description.compatibility"));
        
            this.optionComposite.getLabelButton().setToolTipText(Xmi.I18N.getString("fileChooser.options.export.description.compatibility"));
        
        
            this.optionComposite.getXMIButton().addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (SwtWizardWindow.this.optionComposite.getXMIButton().getSelection()) {
                        setXMIExtension();
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFilterNames(new String[] { "XMI Files", "UML Files" });
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFilterExtensions(new String[] { "*.xmi", "*.uml" });
                        SwtWizardWindow.this.fileChooserComposite.getDialog().setFileName(((Package) SwtWizardWindow.this.selectedElt).getName() + ".xmi");
                    }
                }
        
            });
        
            this.optionComposite.getXMIButton().setToolTipText(Xmi.I18N.getString("fileChooser.options.export.description.xmi"));
        
        
        }
        
        this.fileChooserComposite.getSearch().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkPath(SwtWizardWindow.this.fileChooserComposite.searchFile());
            }
        });
        
        this.fileChooserComposite.getTextButton().addMouseTrackListener(new MouseTrackAdapter() {
            @Override
            public void mouseExit(MouseEvent e) {      
                checkPath(SwtWizardWindow.this.fileChooserComposite.getText());
            }
        });
        
        this.fileChooserComposite.getTextButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                checkPath(SwtWizardWindow.this.fileChooserComposite.getText());
            }
        });
        
        final FormData fd_laProgressBar = new FormData();
        
        if (this.exportWindows) {
            fd_laProgressBar.top = new FormAttachment(this.optionComposite, 0);
        } else {
            fd_laProgressBar.top = new FormAttachment(this.fileChooserComposite, 0);
        }
        fd_laProgressBar.left = new FormAttachment(this.fileChooserComposite, 5, SWT.LEFT);
        fd_laProgressBar.right = new FormAttachment(this.fileChooserComposite, -5, SWT.RIGHT);
        this.theProgressBar.setLayoutData(fd_laProgressBar);
        
        final FormData fd_validateComposite = new FormData();
        fd_validateComposite.top = new FormAttachment(this.theProgressBar, 5);
        fd_validateComposite.bottom = new FormAttachment(100, -5);
        fd_validateComposite.left = new FormAttachment(this.theProgressBar, 0, SWT.LEFT);
        fd_validateComposite.right = new FormAttachment(this.theProgressBar, 0, SWT.RIGHT);
        this.validateComposite.setLayoutData(fd_validateComposite);
        
        setDefaultDialog();
        this.shell.pack();
        this.shell.setMinimumSize(new Point(600, this.shell.getBounds().height));
        
        this.validateComposite.getValidationButton().setFocus();
    }

    /**
     * set default configuration of the dialog box
     */
    @objid ("3bb466c9-875c-4b3c-aae1-77aad542a9cb")
    public abstract void setDefaultDialog();

    /**
     * @return the selected element i.e. Package or IModule
     */
    @objid ("67e09f32-1e3b-4469-8c64-108c98c9754a")
    public Element getSelectedPkg() {
        return this.selectedElt;
    }

    @objid ("7349b6a4-4651-434e-a008-dda27ebb897e")
    void cancelAction() {
        if (this.theThread != null && this.theThread.isAlive()) {
            this.theThread.interrupt();
        }
        
        
        if ((this.shell != null) && (!this.shell.isDisposed()))
            this.shell.dispose();
    }

    @objid ("08a1d950-e305-4518-a216-6d9aeee3a00d")
    void disableComposites() {
        enableOrDisableCompistes(false);
    }

    /**
     * enable all composites
     */
    @objid ("fd4e3a08-9e2a-4054-8bb4-6b511ff330c7")
    public void enableComposites() {
        enableOrDisableCompistes(true);
    }

    @objid ("0202ddd8-6cdd-41df-be2b-2ff0789142d9")
    private void enableOrDisableCompistes(boolean isEnable) {
        if (!this.shell.isDisposed()) {
            if (this.fileChooserComposite != null)
                this.fileChooserComposite.setEnabled(isEnable);
            if (this.optionComposite != null) {
                this.optionComposite.setEnabled(isEnable);
            }
            this.validateComposite.getValidationButton().setEnabled(isEnable);
        
            //                        this.validateComposite.getCancelButton().setEnabled(isEnable);
        }
    }

    /**
     * @param cancelButton : the text of the cancel button
     */
    @objid ("7a4c2fe7-b05d-495c-a84e-dd81d2343f9a")
    public void setCancelButton(final String cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @param description : the description of the windows
     */
    @objid ("6ce6d55e-39f6-4d7e-b853-96054c0189f8")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @param frametitle : the title of the windows frame
     */
    @objid ("c188ed57-b143-4423-8a7b-6142f6759576")
    public void setFrametitle(final String frametitle) {
        this.frametitle = frametitle;
    }

    /**
     * @param title : the title of the windows
     */
    @objid ("97f64833-4450-4665-9a8f-e45ae0123bf9")
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @param validateButton : the button of validation
     */
    @objid ("fea3f757-a3fc-41f8-9c7c-b91bfb19b0fd")
    public void setValidateButton(final String validateButton) {
        this.validateButton = validateButton;
    }

    @objid ("e11f13e5-48be-40f5-8354-62ca35063251")
    protected FileChooserComposite getFileChooserComposite() {
        return this.fileChooserComposite;
    }

    @objid ("8720a4c6-e558-49c4-8bf8-f8636b447d1d")
    protected ProgressBarComposite getTheProgressBar() {
        return this.theProgressBar;
    }

    @objid ("d891faa5-b894-49ca-9619-39f64eb24fb1")
    protected void setSelectedType(int selectedType) {
        this.selectedType = selectedType;
    }

    /**
     * @return the optionComposite
     */
    @objid ("9e49360a-f35d-454d-98f7-fc6326f48bf6")
    public OptionComposite getOptionComposite() {
        return this.optionComposite;
    }

    /**
     * Warning user that he does not select a file
     */
    @objid ("9c0dff2b-14bd-4f3f-8456-6ac48ec2d9bf")
    public void selectAFile() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(this.description);
        messageBox.open();
    }

    /**
     * @return true if the process is cancelled by the user
     */
    @objid ("3a6a8d4d-2f80-46ed-b7b7-244f8dd4a149")
    public static boolean isCancelation() {
        return SwtWizardWindow.cancelation;
    }

    /**
     * @param cancelation : set the cancellation of the process
     */
    @objid ("89c452cf-b0ff-4b33-8567-2f81a38e6eeb")
    public static void setCancellation(final boolean cancelation) {
        SwtWizardWindow.cancelation = cancelation;
    }

    /**
     * the action i.e. import or export
     */
    @objid ("62fc1726-ee1b-468f-be92-efa8c876194e")
    public abstract void validationAction();

    /**
     * set button labels
     */
    @objid ("0a55289c-059e-4a2f-a3e0-c1556bf733ad")
    public abstract void setLabels();

    /**
     * initialize file path
     */
    @objid ("b8fc2417-9570-4e2c-8114-f417f57f5ee5")
    public abstract void setPath();

    /**
     * launch a dialog box for wrong path
     */
    @objid ("ce0b8321-46e1-4ddb-b388-fb3aee7a8f68")
    public void fileDontExist() {
        MessageBox messageBox = new MessageBox(this.shell, SWT.ICON_WARNING);
        messageBox.setMessage(Xmi.I18N.getString("fileChooser.banner.import.dontexit"));
        messageBox.open();
    }

    @objid ("1e4f6ec5-b601-4ea3-bc26-c8f1084243ce")
    void helpPressed() {
        String urlPath = "http://127.0.0.1:1697/help/index.jsp";
        BareBonesBrowserLaunch.openURL(urlPath, this.shell);
    }

    /**
     * @param parent : the shell parent
     * @param style : the swt style
     */
    @objid ("779cbccf-b9fe-469e-a2a9-b07b748c1865")
    public SwtWizardWindow(final Shell parent, final int style) {
        super(parent != null ? parent : new Shell(Display.getDefault()), style);
    }

    /**
     * @param parent : the shell parent
     */
    @objid ("17129527-5969-4a3c-9c9a-df9308b8f5f1")
    public SwtWizardWindow(final Shell parent) {
        this(parent, SWT.NONE);
    }

    /**
     * @param selectedElt : set the selected element
     */
    @objid ("bd59d2d2-71e7-408c-8473-68e483f3f59b")
    public void setSelectedElt(final Element selectedElt) {
        this.selectedElt = selectedElt;
    }

    /**
     * @param shell : the current shell
     */
    @objid ("08813e8c-580a-42e8-be33-35a68dc8786c")
    public abstract void setOptionComposite(Shell shell, IProjectService projectService);

    @objid ("3687d23f-ba55-4552-8d22-5d74d7c62926")
    private void centerOnPrimaryScreen(Display display) {
        Monitor primary = display.getPrimaryMonitor();
        Rectangle bounds = primary.getBounds();
        Rectangle rect = this.shell.getBounds();
        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;
        this.shell.setLocation(x, y);
        this.shell.open();
    }

    @objid ("5898f86a-e1d1-47bc-b79a-af475fdeaaf9")
    void checkPath(String filePath) {
        if (this.exportWindows) {
            if ((filePath != null) && (!filePath.equals(""))) {
                int length = filePath.length();
                if ((length - 4) == filePath.lastIndexOf(".uml")) {
                    this.optionComposite.setUMLSelected();
                } else if (filePath.lastIndexOf(".xmi") == (length - 4)) {
                    this.optionComposite.setXMISelected();
                } else {
                    if (this.optionComposite.getXMIButton().getSelection()) {
                        setXMIExtension();
                    } else {
                        setUMLExtension();
                    }
                }
            }
        }
    }

    @objid ("dea49571-7c78-4a59-a076-bd05ddf31e7a")
    void setUMLExtension() {
        String filePath = this.fileChooserComposite.getText();
        int length = filePath.length();
        if ((length - 4) != filePath.lastIndexOf(".uml")) {
            if (filePath.lastIndexOf(".xmi") == (length - 4)) {
                filePath = filePath.substring(0, length - 4) + ".uml";
            } else {
                filePath = filePath + ".uml";
            }
            this.fileChooserComposite.setText(filePath);
        }
    }

    @objid ("13ec8a1d-8134-41dc-814a-663e886cfeb3")
    void setXMIExtension() {
        String filePath = this.fileChooserComposite.getText();
        int length = filePath.length();
        if ((length - 4) != filePath.lastIndexOf(".xmi")) {
            if (filePath.lastIndexOf(".uml") == (length - 4)) {
                filePath = filePath.substring(0, length - 4) + ".xmi";
            } else {
                filePath = filePath + ".xmi";
            }
            this.fileChooserComposite.setText(filePath);
        }
    }

    @objid ("c7b92781-5bf9-48e8-80c3-da0453c11c6a")
    protected void fileCanBeCreated(File file) {
        MessageBox messageBox = new MessageBox(this.shell, SWT.OK);
        messageBox.setMessage(Xmi.I18N.getMessage("fileChooser.dialog.confirm.canNotCreateFile.label", file.getName()));
        messageBox.setText( Xmi.I18N.getString("fileChooser.dialog.confirm.canNotCreateFile.title"));
        messageBox.open();
    }

    @objid ("2c4c58c6-1ca7-495c-8545-3ab4f428071d")
    protected boolean confirmOverwrite(File file) {
        MessageBox messageBox = new MessageBox(this.shell, SWT.YES | SWT.NO);
        messageBox.setMessage(Xmi.I18N.getMessage("fileChooser.dialog.confirm.overwriteFile.label", file.getName()));
        messageBox.setText(Xmi.I18N.getString("fileChooser.dialog.confirm.overwriteFile.title"));
        return (messageBox.open() == SWT.YES);
    }

    @objid ("80c6e145-f218-49bc-a0b5-b32e0453ac20")
    protected boolean testExportFilePath(File theFile) {
        if (theFile.exists()) {
            return confirmOverwrite(theFile);      
        } 
        
        if (theFile.getParentFile().exists() || theFile.getParentFile().mkdirs()) {
            return true;       
        } 
        
        fileCanBeCreated(theFile);
        return false;
    }

    /**
     * @param inpath : the initial path
     * @return the same path in a correct form
     */
    @objid ("39ead756-f5cd-4cc8-b785-f7e6538b88e2")
    public static String checkAndReplaceEndPath(final String inpath) {
        if (inpath.endsWith("\\")) {
            return inpath.substring(0, inpath.lastIndexOf("\\"));
        } else if (inpath.endsWith("/")) {
            return inpath.substring(0, inpath.lastIndexOf("/"));
        }
        return inpath;
    }

    @objid ("a0a9a0fc-8c23-4c89-aa85-151ed105c019")
    protected void completeBox() {
        this.title = Xmi.I18N.getString("fileChooser.dialog.endBox");
        
        XMILogs logs = XMILogs.getInstance();
        logs.saveLog();
        if (!logs.isEmpty()){
            this.description = Xmi.I18N.getMessage("warning.log.check", logs.getLogFile() + ".log");
            logs.setEmpty(true);
        }else{
            this.description = Xmi.I18N.getString("fileChooser.dialog.endBox");
        }
        
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                customMessageBox(SWT.ICON_INFORMATION);
            }
        });
    }

    @objid ("d58590f3-bfd8-46a9-8725-661412bd0ed1")
    void customMessageBox(int icon) {
        MessageBox messageBox = new MessageBox(Display.getCurrent().getActiveShell(), icon);
        messageBox.setMessage(this.description);
        messageBox.setText(this.title);
        if (messageBox.open() == SWT.OK) {            
            this.shell.dispose();             
        }
    }

    @objid ("8088700d-ffb2-4da8-8135-72fff1533300")
    protected void incompleteBox(final String errorMessage) {
        if (this.shell != null){
            this.title = Xmi.I18N.getString("fileChooser.dialog.errorBox");
        
            XMILogs logs = XMILogs.getInstance();
            logs.saveLog();
            if (!logs.isEmpty()){
                logs.setEmpty(true);
            }
        
            this.description = errorMessage;
        
            Display.getDefault().asyncExec(new Runnable() {
                @Override
                public void run() {
                    customMessageBox(SWT.ICON_ERROR);
                }
            });
        }
    }

}
