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
                                    

package org.modelio.audit.handlers;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.audit.plugin.Audit;
import org.modelio.audit.service.IAuditService;
import org.modelio.audit.view.AuditPanelProvider;
import org.modelio.audit.view.providers.AuditProviderFactory.AuditViewMode;
import org.modelio.core.ui.dialog.ModelioDialog;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.ui.UIColor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("96eb884f-f002-4509-9546-ecebafdc1802")
public class CheckerView extends ModelioDialog {
    @objid ("b2078137-7704-40d3-8131-9c7236958f1a")
    private static final String HELP_TOPIC = "/org.modelio.documentation.modeler/html/Modeler-_modeler_interface_audit_view.html";

    @objid ("ee65f8c0-a167-4569-928b-c5bf50fa2db5")
    private AuditPanelProvider auditPanel;

    @objid ("8caa1334-044b-4bca-82f3-57d3fea29201")
    private CheckElementRunner checker;

    @objid ("edde3e8d-cf80-47bb-bd39-0bb36db23963")
    private Thread checkerThread;

    @objid ("ecfc4f7c-2160-42b1-aacd-56383c21253c")
    private Text statusText;

    @objid ("839786b9-2478-4c1b-b014-047b42a0b0d0")
    private Button byTypeButton;

    @objid ("7f502ef2-95ef-4d85-b411-17655ad5d9e0")
    private Button byRuleButton;

    @objid ("8e3c6f29-fbcf-4987-bc8d-316fe35ce8d0")
    private Button byElementButton;

    @objid ("df696522-28e1-43d5-bf80-a1913925464d")
    private Button byListButton;

    @objid ("bba42d4a-5086-4baf-9209-4f16f25560c8")
    private IAuditService auditService;

    @objid ("02060f87-ee74-494d-8c22-b6a55f4f1f30")
    protected CheckerView(Shell parentShell, ICoreSession session, Object selection, IMModelServices modelService, IModelioNavigationService navigationService, MApplication application, EModelService emService, IAuditService auditService, String jodId) {
        super(parentShell);
        
        this.checker = new CheckElementRunner(auditService, selection, jodId);
        this.auditPanel = new AuditPanelProvider(session, modelService, navigationService, application, emService, jodId);
        this.auditService = auditService;
        setBlockOnOpen(false);
    }

    @objid ("b484dcf7-7e02-40ee-be38-9b221a65a6aa")
    @Override
    public Control createContentArea(Composite parent) {
        parent.setLayout(new GridLayout(1, false));
        
        Composite root = new Composite(parent, SWT.NONE);
        GridData gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.verticalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        root.setLayoutData(gridData);
        root.setLayout(new GridLayout(6, false));
        
        Label processLabel = new Label(root, SWT.NONE);
        gridData = new GridData();
        gridData.verticalAlignment = SWT.CENTER;
        processLabel.setLayoutData(gridData);
        processLabel.setText(Audit.I18N.getString("Audit.CheckerView.ProcessLabel.Name"));
        
        this.statusText = new Text(root, SWT.NONE);
        this.statusText.setForeground(UIColor.TEXT_READONLY_BG);
        this.statusText.setEnabled(false);
        gridData = new GridData();
        gridData.horizontalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        this.statusText.setLayoutData(gridData);
        
        this.byTypeButton = new Button(root, SWT.TOGGLE);
        this.byTypeButton.setImage(Audit.getImageDescriptor("icons/LayoutByType.png").createImage());
        this.byTypeButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerView.this.auditPanel.setAuditViewMode(AuditViewMode.BYTYPE);
                CheckerView.this.byRuleButton.setSelection(false);
                CheckerView.this.byElementButton.setSelection(false);
                CheckerView.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.byTypeButton.setSelection(true);
        
        this.byRuleButton = new Button(root, SWT.TOGGLE);
        this.byRuleButton.setImage(Audit.getImageDescriptor("icons/LayoutByRule.png").createImage());
        this.byRuleButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerView.this.auditPanel.setAuditViewMode(AuditViewMode.BYRULE);
                CheckerView.this.byTypeButton.setSelection(false);
                CheckerView.this.byElementButton.setSelection(false);
                CheckerView.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        
        this.byElementButton = new Button(root, SWT.TOGGLE);
        this.byElementButton.setImage(Audit.getImageDescriptor("icons/LayoutByElement.png").createImage());
        this.byElementButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerView.this.auditPanel.setAuditViewMode(AuditViewMode.BYELEMENT);
                CheckerView.this.byTypeButton.setSelection(false);
                CheckerView.this.byRuleButton.setSelection(false);
                CheckerView.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.byListButton = new Button(root, SWT.TOGGLE);
        this.byListButton.setImage(Audit.getImageDescriptor("icons/LayoutFlat.png").createImage());
        this.byListButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerView.this.auditPanel.setAuditViewMode(AuditViewMode.FLAT);
                CheckerView.this.byTypeButton.setSelection(false);
                CheckerView.this.byRuleButton.setSelection(false);
                CheckerView.this.byElementButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.auditPanel.create(root);
        gridData = new GridData();
        gridData.horizontalSpan = 6;
        gridData.horizontalAlignment = SWT.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.verticalAlignment = SWT.FILL;
        gridData.grabExcessVerticalSpace = true;
        this.auditPanel.getComposite().setLayoutData(gridData);
        
        this.auditPanel.setInput(this.auditService.getAuditEngine());
        
        this.checker.setView(this);
        this.checkerThread = new Thread(this.checker);
        this.checkerThread.setPriority(Thread.MIN_PRIORITY);
        this.checkerThread.setName("CHECKER");
        this.checkerThread.start();
        return this.auditPanel.getComposite();
    }

    @objid ("9ad02847-2a84-465f-ac9f-47e1e2c762e0")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
    }

    @objid ("511c844f-45a0-4750-9d9b-63ec8abed84f")
    @Override
    public void init() {
        getShell().setText(Audit.I18N.getString("Audit.CheckerView.DialogTitlee"));
        setTitle(Audit.I18N.getString("Audit.CheckerView.DialogTitlee"));
        setMessage(Audit.I18N.getString("Audit.CheckerView.DialogMessage"));
        this.getShell().setSize(800, 400);
        this.getShell().setMinimumSize(300, 300);
    }

    @objid ("63a3a266-4063-45a7-b816-3310e63d25b5")
    @Override
    public boolean close() {
        this.checkerThread.interrupt();
        this.auditPanel.dispose();
        return super.close();
    }

    @objid ("9f139001-78db-4aef-967b-23998fd56d4c")
    public void refresh() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                if (!CheckerView.this.statusText.isDisposed()) {
                    String status = CheckerView.this.checker.getStatus();
        
                    MObject checkedElement = CheckerView.this.checker.getCheckedElement();
                    if (checkedElement != null) {
                        status += checkedElement.getName();
                    }
        
                    CheckerView.this.statusText.setText(status);
                }
            }
        });
    }

    @objid ("9d183d37-76f3-4dbe-b645-2291bb194daf")
    @Override
    protected String getHelpId() {
        return HELP_TOPIC;
    }

}
