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
        getShell().setText(this.title);
        
        Browser browser = new Browser(parent, SWT.BORDER);
        GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd.horizontalSpan = 2;
        gd.widthHint = 600;
        gd.heightHint = 350;
        browser.setLayoutData(gd);
        
        // Fill contents
        StringBuilder msg = new StringBuilder();
        for (IModelError error : this.errorReport.getEntries()) {
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
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, Vaudit.I18N.getString("CoreAudit.report.close"), true);
    }

    @objid ("d7c923a9-8483-4ab3-ac18-744aabb33ec6")
    private String getInlineCSS() {
        if (this.cssStyles == null) {
             // Get body font family/size
            Font font = Display.getDefault().getSystemFont();
            String fontFamily = font.getFontData()[0].getName();
            int fontSize = font.getFontData()[0].getHeight();
            this.cssStyles = new String(CSSSTYLES);
            this.cssStyles = this.cssStyles.replaceAll( "\\$font_family", fontFamily);
            this.cssStyles = this.cssStyles.replaceAll("\\$font_size", Integer.toString(fontSize)+"pt");
        }
        return this.cssStyles;
    }

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
                infos.add(o);
            }
            return infos.toArray();
        }

    }

}
