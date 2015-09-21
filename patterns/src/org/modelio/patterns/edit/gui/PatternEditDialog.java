/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.edit.gui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.ui.ModelioDialog;
import org.modelio.patterns.model.RuntimePattern;
import org.modelio.patterns.plugin.Patterns;
import org.modelio.ui.panel.IPanelListener;

@objid ("10a6e15c-5bc1-4031-b29e-e767b0109c13")
public class PatternEditDialog extends ModelioDialog {
    @objid ("8a417dba-91ec-4765-afba-37c7cc8adf18")
    private PatternEditPanel panel;

    @objid ("46e7ddbd-815b-4805-ab7f-cdec7aa2b814")
    public PatternEditDialog(Shell parentShell, RuntimePattern rtPattern) {
        super(parentShell);
        this.setShellStyle(SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM | SWT.RESIZE | SWT.MAX);
        
        this.panel = new PatternEditPanel();
        this.panel.setInput(rtPattern);
        this.panel.addListener(new IPanelListener() {
            @Override
            public void dataChanged(Object o, boolean isValidate) {
                RuntimePattern modifiedRuntimePattern = (RuntimePattern) o;
                getButton(IDialogConstants.OK_ID).setEnabled(!"".equals(modifiedRuntimePattern.getName()) && !"".equals(modifiedRuntimePattern.getVersion()));
        
            }
        });
    }

    @objid ("2817402b-a001-4b24-bf07-aa05ac6cb034")
    @Override
    public void init() {
        setTitle(Patterns.I18N.getMessage("PatternEditDialog.title"));
        setMessage(Patterns.I18N.getMessage("PatternEditDialog.message"));
    }

    @objid ("2215ac64-ebc7-4e73-a908-5ac8e211af9b")
    @Override
    public Control createContentArea(Composite parent) {
        return this.panel.createPanel(parent);
    }

    @objid ("9728690c-50be-4d21-b4c7-c792f731d0cc")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        addDefaultButtons(parent);
    }

    @objid ("6b02dfbb-5bba-4bb0-a0f8-5707f6223da1")
    @Override
    protected Point getInitialSize() {
        return new Point(600, 400);
    }

    @objid ("5cd743e1-077f-4cc0-a537-7000c85415c8")
    @Override
    protected String getHelpId() {
        return this.panel.getHelpTopic();
    }

    @objid ("451585fb-b761-4a0b-8a6e-23920faeeb34")
    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(Patterns.I18N.getMessage("PatternEditDialog.title"));
    }

}
