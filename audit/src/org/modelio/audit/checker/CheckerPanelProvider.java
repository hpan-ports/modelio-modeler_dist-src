/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.audit.checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.audit.checker.actions.AuditSeverityAction;
import org.modelio.audit.checker.actions.DisableRuleHandlerAction;
import org.modelio.audit.checker.actions.SelectInExplorerAction;
import org.modelio.audit.checker.actions.ShowDetailsAction;
import org.modelio.audit.plugin.Audit;
import org.modelio.audit.service.IAuditService;
import org.modelio.audit.view.AuditPanelProvider;
import org.modelio.audit.view.providers.AuditProviderFactory.AuditViewMode;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d109acb9-8b82-49bc-ad6c-1ffe1897d4e2")
public class CheckerPanelProvider implements IPanelProvider {
    @objid ("e63ccc4a-81f4-4e31-bca9-076dc20ef1a5")
    private static final String HELP_TOPIC = "/org.modelio.documentation.modeler/html/Modeler-_modeler_interface_audit_view.html";

    @objid ("68a5e4bb-9868-46d4-8af1-a1d0d04cba5f")
    private String jodId;

    @objid ("e1b1c580-b265-4add-b9ef-7ebb35a9e36c")
    @Inject
    @Optional
    private MApplication application;

    @objid ("169f9ef1-47ef-4c6d-a0b8-d16f5978601e")
    @Inject
    @Optional
    private EModelService emService;

    @objid ("6e220856-42cc-43c8-bd0f-909f5924e0f3")
    private AuditPanelProvider auditPanel;

    @objid ("47a28aa2-f0b4-4dc9-9eb8-c39d068de1b4")
    @Inject
    @Optional
    private IAuditService auditService;

    @objid ("8de8d61e-850b-4ac3-9bbd-3923394df46f")
    @Inject
    @Optional
    private IProjectService projectService;

    @objid ("dd430258-a902-4fce-a087-009382e941a0")
    @Inject
    @Optional
    private IModelioNavigationService navigationService;

    @objid ("3186ae38-056b-40f1-972b-a0e417dbe8d5")
    @Inject
    @Optional
    private IMModelServices modelService;

    @objid ("b300eafd-8ea4-4289-b3f4-97a8d6096886")
    private Object input;

    @objid ("e6ef31b9-71c1-4980-a584-a9b33b301afb")
    private Button byTypeButton;

    @objid ("ecb4712e-2799-4b16-ae3d-4c80bcb35a82")
    private Button byRuleButton;

    @objid ("b8355824-d879-4889-92d5-9043b2d14856")
    private Button byElementButton;

    @objid ("9cccfac9-56f6-42a4-bbea-fc0fd993c903")
    private Button byListButton;

    @objid ("991cfdd8-6fd6-4ab3-9af7-8192a6574d59")
    private Composite rootComposite;

    @objid ("106b1506-22a7-4fae-ba45-39f2736da135")
    public CheckerPanelProvider() {
        this.jodId = UUID.randomUUID().toString();
    }

    @objid ("44301568-bd03-4fd8-acef-96576f6c51ea")
    @Override
    public Object createPanel(Composite parent) {
        this.auditPanel = new AuditPanelProvider(this.auditService, this.projectService.getSession(), this.modelService,
                this.navigationService, this.application, this.emService, this.jodId);
        
        parent.setLayout(new GridLayout(1, false));
        this.rootComposite = new Composite(parent, SWT.NONE);
        GridData gd = new GridData();
        gd.horizontalAlignment = SWT.FILL;
        gd.verticalAlignment = SWT.FILL;
        gd.grabExcessHorizontalSpace = true;
        gd.grabExcessVerticalSpace = true;
        this.rootComposite.setLayoutData(gd);
        this.rootComposite.setLayout(new GridLayout(4, false));
        
        this.byTypeButton = new Button(this.rootComposite, SWT.TOGGLE);
        this.byTypeButton.setImage(Audit.getImageDescriptor("icons/LayoutByType.png").createImage());
        this.byTypeButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerPanelProvider.this.auditPanel.setAuditViewMode(AuditViewMode.BYTYPE);
                CheckerPanelProvider.this.byRuleButton.setSelection(false);
                CheckerPanelProvider.this.byElementButton.setSelection(false);
                CheckerPanelProvider.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.byTypeButton.setSelection(true);
        
        this.byRuleButton = new Button(this.rootComposite, SWT.TOGGLE);
        this.byRuleButton.setImage(Audit.getImageDescriptor("icons/LayoutByRule.png").createImage());
        this.byRuleButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerPanelProvider.this.auditPanel.setAuditViewMode(AuditViewMode.BYRULE);
                CheckerPanelProvider.this.byTypeButton.setSelection(false);
                CheckerPanelProvider.this.byElementButton.setSelection(false);
                CheckerPanelProvider.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        
        this.byElementButton = new Button(this.rootComposite, SWT.TOGGLE);
        this.byElementButton.setImage(Audit.getImageDescriptor("icons/LayoutByElement.png").createImage());
        this.byElementButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerPanelProvider.this.auditPanel.setAuditViewMode(AuditViewMode.BYELEMENT);
                CheckerPanelProvider.this.byTypeButton.setSelection(false);
                CheckerPanelProvider.this.byRuleButton.setSelection(false);
                CheckerPanelProvider.this.byListButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.byListButton = new Button(this.rootComposite, SWT.TOGGLE);
        this.byListButton.setImage(Audit.getImageDescriptor("icons/LayoutFlat.png").createImage());
        this.byListButton.addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                CheckerPanelProvider.this.auditPanel.setAuditViewMode(AuditViewMode.FLAT);
                CheckerPanelProvider.this.byTypeButton.setSelection(false);
                CheckerPanelProvider.this.byRuleButton.setSelection(false);
                CheckerPanelProvider.this.byElementButton.setSelection(false);
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
            }
        });
        this.auditPanel.createPanel(this.rootComposite);
        gd = new GridData();
        gd.horizontalSpan = 6;
        gd.horizontalAlignment = SWT.FILL;
        gd.grabExcessHorizontalSpace = true;
        gd.verticalAlignment = SWT.FILL;
        gd.grabExcessVerticalSpace = true;
        this.auditPanel.getPanel().setLayoutData(gd);
        
        this.auditPanel.setInput(this.auditService.getAuditEngine().getAuditDiagnostic());
        
        initContextMenu();
        return this.rootComposite;
    }

    @objid ("6b242d1d-b598-463a-a0e2-f62417c51b33")
    private void initContextMenu() {
        // initalize the context menu
        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            @Override
            public void menuAboutToShow(IMenuManager manager) {
                manager.add(new SelectInExplorerAction(CheckerPanelProvider.this.navigationService,
                        CheckerPanelProvider.this.auditPanel.getTreeViewer()));
                manager.add(new ShowDetailsAction(CheckerPanelProvider.this.projectService,
                        CheckerPanelProvider.this.navigationService, CheckerPanelProvider.this.auditPanel.getTreeViewer()));
                manager.add(new AuditSeverityAction("AuditAdvice", CheckerPanelProvider.this.auditService,
                        CheckerPanelProvider.this.auditPanel.getTreeViewer().getTree()));
                manager.add(new AuditSeverityAction("AuditWarning", CheckerPanelProvider.this.auditService,
                        CheckerPanelProvider.this.auditPanel.getTreeViewer().getTree()));
                manager.add(new AuditSeverityAction("AuditError", CheckerPanelProvider.this.auditService,
                        CheckerPanelProvider.this.auditPanel.getTreeViewer().getTree()));
                manager.add(new DisableRuleHandlerAction(CheckerPanelProvider.this.auditService,
                        CheckerPanelProvider.this.auditPanel.getTreeViewer().getTree()));
            }
        });
        Menu menu = menuMgr.createContextMenu(this.auditPanel.getTreeViewer().getTree());
        this.auditPanel.getTreeViewer().getTree().setMenu(menu);
    }

    @objid ("a695f1ee-e0e2-4295-87cf-050d99488846")
    @Override
    public void setInput(Object input) {
        // Because set input launches a background asynchronous process, better to avoid launching several instances for the same
        // input.
        // Furthermore, in the case of the checker panel the audit process can fire a status change event which in turn will re-set
        // this input leading to a loop without the guard coded below.
        
        if (Objects.equals(this.input, input)) {
            return;
        }
        this.input = input;
        if (input instanceof MObject) {
            List<MObject> elements = new ArrayList<>();
            elements.add((MObject) input);
            this.auditService.checkElementTree(elements, this.jodId);
        }
    }

    @objid ("e374641e-7342-40b6-9ccb-e86a2053bf49")
    @Override
    public boolean isRelevantFor(Object obj) {
        return true;
    }

    @objid ("c8d34d25-0388-4cf0-8e65-826cdbff1d24")
    @Override
    public Object getPanel() {
        return this.rootComposite;
    }

    @objid ("2b25c80e-5b3f-4014-ad7d-18014d699194")
    @Override
    public String getHelpTopic() {
        return HELP_TOPIC;
    }

    @objid ("502adaa9-c837-4e3d-809a-75afbc81b3e2")
    @Override
    public Object getInput() {
        return this.input;
    }

    @objid ("a83365ee-8848-4ff9-b3c5-18efaa1f82e9")
    public AuditPanelProvider getAuditPanel() {
        return this.auditPanel;
    }

    @objid ("5d6bc26e-7708-4530-8173-9e69209fbc5a")
    public void setAuditService(IAuditService auditService) {
        this.auditService = auditService;
    }

    @objid ("b3da36c0-6983-4a37-9897-67466e6d8cba")
    public void setProjectService(IProjectService projectService) {
        this.projectService = projectService;
    }

    @objid ("4931c70f-4887-4677-8a71-b33fb2cba5fc")
    public void setNavigationService(IModelioNavigationService navigationService) {
        this.navigationService = navigationService;
    }

    @objid ("b2171e31-c1e5-46f3-b01c-ff6fcdde325e")
    public void setModelService(IMModelServices modelService) {
        this.modelService = modelService;
    }

    @objid ("64278a24-d758-439c-a27f-05a78a249a7b")
    public void setApplication(MApplication application) {
        this.application = application;
    }

    @objid ("826f3c54-42e0-47ad-b064-b18116eac958")
    public void setEmService(EModelService emService) {
        this.emService = emService;
    }

    @objid ("e4dc3dcf-ce7f-45d4-aaec-a3e0efb445af")
    public void setJodId(String jodId) {
        this.jodId = jodId;
    }

    @objid ("892d6ff0-3650-41d2-bbcc-2941e23f5f1d")
    @Override
    public void dispose() {
        this.auditService.interuptCheck(this.jodId);
        this.auditPanel.dispose();
    }

}
