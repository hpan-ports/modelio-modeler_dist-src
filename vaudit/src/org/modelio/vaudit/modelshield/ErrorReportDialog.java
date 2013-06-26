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
                                    

package org.modelio.vaudit.modelshield;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IconAndMessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.vaudit.plugin.Vaudit;

/**
 * This class implements the dialog box that display a core audit error report
 */
@objid ("b622ae3f-4413-45e5-8da2-42b675fcb499")
public class ErrorReportDialog extends IconAndMessageDialog {
    @objid ("bb614345-76a3-40be-8411-9cd4f0d3e3b8")
    private String title;

    @objid ("9d11b9b1-4686-494d-89f7-be6a6e833e2a")
    private static final String CSSSTYLES = "#desc { margin-left:20px; color:grey; font-size:$font_size; font-family: $font_family; font-style: italic;}"
			+ " #what {font-size:$font_size; font-family:$font-family; color:red;}";

    @objid ("7c731691-49d4-44c1-ab7a-0612842bc11a")
    private String cssStyles;

    @objid ("80bceeda-6d9c-4948-9990-5d0b03dfa6ad")
    private IErrorReport errorReport;

    @objid ("4fc27ce6-7554-4419-aa90-99f8fdeb90cb")
    public ErrorReportDialog(Shell parentShell, String dialogTitle, String message, IErrorReport errorReport) {
        super(parentShell);
        setShellStyle(getShellStyle() | SWT.RESIZE);
        
        this.title = (dialogTitle == null) ? "" : dialogTitle;
        this.message = (message == null) ? "" : message;
        this.errorReport = errorReport;
    }

    @objid ("14f04041-5563-4339-9548-9ee647cc9931")
    @Override
    protected Image getImage() {
        return getErrorImage();
    }

    @objid ("11de29df-b5cc-408f-8176-2037a0f195ca")
    @Override
    protected Control createDialogArea(Composite parent) {
        createMessageArea(parent);
        getShell().setText(title);
        
        System.err.println(parent.getLayout());
        Browser browser = new Browser(parent, SWT.BORDER);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.horizontalSpan = 2;
        gd.widthHint = 600;
        gd.heightHint = 350;
        browser.setLayoutData(gd);
        
        // Fill contents
        StringBuilder msg = new StringBuilder();
        for (IModelError error : errorReport.getEntries()) {
            msg.append("<head><style>");
            msg.append(getInlineCSS());
            msg.append("</style></head>");
        
            msg.append("<p id = \"what\">");
            msg.append(error.getRuleId() + ": ");
            msg.append(ErrorFormatter.getWhat(error));
        
            msg.append("<br/><span id=\"desc\">");
            msg.append(ErrorFormatter.getDescription(error));
            msg.append("</span>");
            msg.append("</p>");
        
        }
        browser.setText(msg.toString());
        return parent;
    }

    @objid ("0b91d751-f628-4ca6-8095-349d88f7270a")
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, Vaudit.I18N.getString("CoreAudit.report.close"), true);
    }

    @objid ("d7c923a9-8483-4ab3-ac18-744aabb33ec6")
    private String getInlineCSS() {
        if (cssStyles == null) {
             // Get body font family/size
            Font font = Display.getDefault().getSystemFont();
            String fontFamily = font.getFontData()[0].getName();
            int fontSize = font.getFontData()[0].getHeight();
            this.cssStyles = new String(CSSSTYLES);
            this.cssStyles = this.cssStyles.replaceAll( "\\$font_family", fontFamily);
            this.cssStyles = this.cssStyles.replaceAll("\\$font_size", Integer.toString(fontSize)+"pt");
        }
        return cssStyles;
    }

// private Composite area = null;
//
// private Image selectImage;
//
// private Browser browser;
// private ICoreSession modelingSession = null;
// private IModelioNavigationService navigationService;
// private URL ruleUrl;
//
// /**
// * Add buttons to the buttons bar in the bottom of the dialog.
// * <p>
// * Here we just need to have a "close" button.
// * @param parent the parent composite of the dialog.
// */
// @Override
// public void addButtonsInButtonBar(Composite parent) {
// createButton(parent, IDialogConstants.OK_ID,
// Audit.I18N.getString("AuditEntryDialog.Close"), true);
// }
//
// /**
// * This is the main method that is called to construct the GUI content of
// the box.
// * @param parent the parent composite of the dialog.
// */
// @Override
// public Control createContentArea(Composite parent) {
// Bundle bundle = Platform.getBundle(Audit.PLUGIN_ID);
// URL bitmapUrl = FileLocator.find(bundle, new Path("icons/select.png"),
// null);
// this.selectImage =
// ImageDescriptor.createFromURL(bitmapUrl).createImage();
// parent.addDisposeListener(new DisposeListener() {
// @Override
// public void widgetDisposed(DisposeEvent e)
// {
// AuditEntryDialog.this.selectImage.dispose();
// }
// });
//
// this.area = new Composite(parent, SWT.NONE);
// this.area.setLayoutData(new GridData(GridData.FILL_BOTH));
//
// GridLayout layout = new GridLayout(1, false);
// this.area.setLayout(layout);
//
// Group descriptionGroup = createEntryDescription(this.entry);
// GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, false);
// descriptionGroup.setLayoutData(layoutData);
//
// Group linkedElementsGroup = createLinkedElementsList();
// layoutData = new GridData(SWT.FILL, SWT.FILL, true, false);
// linkedElementsGroup.setLayoutData(layoutData);
//
// Group ruleDocumentationGroup =
// createRuleDocumentation(this.entry.getRuleId());
// layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
// ruleDocumentationGroup.setLayoutData(layoutData);
// return this.area;
// }
//
// /**
// * Init is called when the dialog box is opened.
// */
// @Override
// public void init() {
// setLogoImage(null);
// // Put the messages in the banner area
// getShell().setText(Audit.I18N.getString("AuditEntryDialog.DialogTitle"));
// setTitle(Audit.I18N.getString("AuditEntryDialog.DialogTitle"));
// //setMessage(Audit.I18N.getString("AuditEntryDialog.DialogMessage"));
// this.getShell().setSize(600, 700);
// this.getShell().setMinimumSize(600, 550);
// }
//
// /**
// * Create part of the dialog that display the tip message of the entry.
// * <p>
// * It is displayed in HTML format. The message given by the entry may
// contains HTML tags. There is no need to
// * provide HTML headers they are provided by the method.
// */
// private Group createRuleDocumentation(String ruleId) {
// Group group = new Group(this.area, SWT.NONE);
// group.setText(ruleId);
// GridLayout gl = new GridLayout(1, false);
// gl.verticalSpacing = 0;
// group.setLayout(gl);
//
// this.browser = new Browser(group, SWT.BORDER);
// GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
// this.browser.setLayoutData(gd);
// this.browser.setMenu(new Menu(this.browser));
// this.browser.setJavascriptEnabled(false);
//
// this.ruleUrl = Audit.I18N.getRuleDescription(ruleId);
// this.browser.setUrl(this.ruleUrl.toString());
// return group;
// }
//
// /**
// * Create part of the dialog that display the description of the rule that
// caused the audit report.
// * <p>
// * The displayed information are
// * <ul>
// * <li>Id of the plan that contains the rule.</li>
// * <li>Id of the rule.</li>
// * <li>Element concerned by the rule.</li>
// * <li>Description of the rule.</li>
// * </ul>
// */
// private Group createEntryDescription(final IAuditEntry entryToDescribe) {
// Group descriptionGroup = new Group(this.area, SWT.NONE);
// descriptionGroup.setText(Audit.I18N.getString("AuditEntryDialog.DescriptionGroup.Label"));
//
// GridLayout layout = new GridLayout(2, false);
// descriptionGroup.setLayout(layout);
//
// // Audit message
// Label auditMessage = new Label(descriptionGroup, SWT.WRAP |
// SWT.READ_ONLY);
// String message = DiagnosticFormatter.getMessage(entryToDescribe);
// auditMessage.setText(message);
// auditMessage.setCapture(false);
//
// // Navigation button
// Button navigationButton = new Button(descriptionGroup, SWT.NONE);
// navigationButton.setImage(this.selectImage);
//
// navigationButton.setToolTipText(Audit.I18N.getString("AuditEntryDialog.ElementLabel.ClickToNavigate"));
// navigationButton.addSelectionListener(new SelectionListener() {
// @Override
// public void widgetDefaultSelected(SelectionEvent e)
// {
// AuditEntryDialog.this.navigationService.fireNavigate(entryToDescribe.getElement());
// }
//
// @Override
// public void widgetSelected(SelectionEvent e)
// {
// AuditEntryDialog.this.navigationService.fireNavigate(entryToDescribe.getElement());
// }
// });
// // set attachments
// GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
// auditMessage.setLayoutData(layoutData);
//
// layoutData = new GridData(SWT.FILL, SWT.FILL, false, true);
// navigationButton.setLayoutData(layoutData);
// return descriptionGroup;
// }
//
// /**
// * Create the list that contains the elements linked to the audit report.
// * <p>
// * It contains the elements described in the reported error message.
// */
// private Group createLinkedElementsList() {
// Group group = new Group(this.area, SWT.NONE);
// group.setText(Audit.I18N.getString("AuditEntryDialog.LinkedElements.Label"));
//
// group.setLayout(new GridLayout(1, false));
//
// TableViewer linkedElementsList = new TableViewer(group, SWT.BORDER);
// linkedElementsList.setContentProvider(new
// LinkedElementContentProvider());
// linkedElementsList.setLabelProvider(new
// LinkedElementLabelProvider(this.modelingSession));
// linkedElementsList.setInput(this.entry);
// linkedElementsList.getControl().setToolTipText("Double-click an element to select it in the explorer");
//
// GridData gd_linkedElementsList = new GridData(SWT.FILL, SWT.FILL, true,
// true);
// linkedElementsList.getTable().setLayoutData(gd_linkedElementsList);
// linkedElementsList.addSelectionChangedListener(new
// ISelectionChangedListener() {
//
// @Override
// public void selectionChanged(SelectionChangedEvent event)
// {
// ISelection selection = event.getSelection();
// if (selection instanceof IStructuredSelection) {
// IStructuredSelection structuredSelection = (IStructuredSelection)
// selection;
// if (structuredSelection.size() == 1) {
// Object data = structuredSelection.getFirstElement();
// if (data instanceof MObject) {
// MObject element = (MObject) data;
// AuditEntryDialog.this.navigationService.fireNavigate(element);
// }
// }
// }
//
// }
// });
// return group;
// }
//
// }
    /**
     * The main composite of the dialog box The modeling session.
     */
    @objid ("9be58d3f-ba1b-4446-8c1a-5645f91bdc14")
    private static class ErrorFormatter {
        @objid ("8d74111e-9158-423a-b68e-1a3116549817")
        public static String getWhat(IModelError error) {
            try {
                String pattern = Vaudit.I18N.getString(error.getRuleId() + ".what");
                return MessageFormat.format(pattern, makeInfos(error.getElement(), error.getLinkedObjects()));
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return "!" + error.getRuleId() + ".what!";
            }
        }

        @objid ("6e89096d-6b66-440f-a4c4-e8d3505dfe54")
        public static String getDescription(IModelError error) {
            try {
                return Vaudit.I18N.getString(error.getRuleId() + ".desc");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return "!" + error.getRuleId() + ".desc!";
            }
        }

        @objid ("9def5e99-268d-40e3-8525-0a1b2eec0399")
        private static Object[] makeInfos(Object main, List<Object> linkedObjects) {
            ArrayList<Object> infos = new ArrayList<>();
            infos.add(main);
            for (Object o : linkedObjects) {
                // if (o instanceof Element){
                // Element element = (Element) o;
                // if(!element.isDeleted())
                // infos.add(element.getName());
                // }
                // else
                infos.add(o);
            }
            return infos.toArray();
        }

    }

}
