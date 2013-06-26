package org.modelio.model.search.dialog;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.core.ui.dialog.ModelioDialog;
import org.modelio.core.ui.images.MetamodelImageService;
import org.modelio.core.ui.images.StandardModelStyleProvider;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.model.search.ISearchController;
import org.modelio.model.search.ISearchPanel;
import org.modelio.model.search.engine.ISearchCriteria;
import org.modelio.model.search.engine.ISearchEngine;
import org.modelio.model.search.plugin.ModelSearch;
import org.modelio.model.search.results.ResultsPanel;
import org.modelio.model.search.searchers.model.ModelSearchPanel;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IModelChangeListener;
import org.modelio.vcore.session.api.model.change.IStatusChangeEvent;
import org.modelio.vcore.session.api.model.change.IStatusChangeListener;
import org.modelio.vcore.smkernel.mapi.MClass;

@objid ("000a8552-c59e-10ab-8258-001ec947cd2a")
public class SearchDialog extends ModelioDialog {
    @objid ("aaa00fbf-3b49-499e-879a-4883dc93ba83")
    private static final String ENGINE_DATAKEY = "engine";

    @objid ("17516b19-0ad6-435f-9df9-510d00e02614")
    private static final String PANEL_DATAKEY = "panel";

    @objid ("55dff01a-afbd-4156-bc08-dc3e408630ea")
    private static final String HELP_TOPIC = "/org.modelio.documentation.modeler/html/Modeler-_modeler_handy_tools_advanced_search.html";

    @objid ("000a8f52-c59e-10ab-8258-001ec947cd2a")
    protected List<Element> results;

    @objid ("0060cb9c-ec63-10ac-8258-001ec947cd2a")
    private final IModelioNavigationService navigationService;

    @objid ("3c199f4b-d600-4332-a4ec-d2b41637c2cd")
    private final ICoreSession session;

    @objid ("299ef093-8da5-41a1-9c22-156dc9f382f8")
    private ProgressBar progressBar;

    @objid ("521058e1-b6e2-4eb6-8cb0-bd4782a4ea85")
    private Button searchButton;

    @objid ("6209333b-4031-4811-8fd4-015b10670db7")
    private ISearchController controller;

    @objid ("63f4b569-90da-4c0c-acf8-2d14c9fe9b28")
    private TabFolder tabFolder;

    @objid ("06786cb8-3310-4a10-994f-2f6477a1bfb5")
    private ResultsPanel resultsPanel;

    @objid ("f406bacf-19af-4f8f-a74d-685fe15da136")
    private final SearchModelChangeListener listener;

    @objid ("000ac24c-c59e-10ab-8258-001ec947cd2a")
    public SearchDialog(Shell parentShell, ICoreSession session, List<Element> results, IModelioNavigationService navigationService) {
        super(parentShell);
        // this.searchEngine = SearchEngine;
        // this.searchCriteria = searchCriteria;
        this.session = session;
        this.results = null; // FIXME (results != null) ? results :
                                // SearchEngine.search(session, searchCriteria);
        this.navigationService = navigationService;
        
        this.listener = new SearchModelChangeListener(this);
        session.getModelChangeSupport().addModelChangeListener(this.listener);
    }

    @objid ("000aef60-c59e-10ab-8258-001ec947cd2a")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CLOSE_LABEL, false);
    }

    @objid ("000b0c48-c59e-10ab-8258-001ec947cd2a")
    @Override
    public Control createContentArea(Composite parent) {
        final SashForm sash = new SashForm(parent, SWT.VERTICAL | SWT.SMOOTH);
        sash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        sash.setSashWidth(12);
        createCriteriaArea(sash);
        createResultsArea(sash);
        // Search controller: drives the whole search process
        this.controller = new SearchController(this.session, this);
        return sash;
    }

    @objid ("000b386c-c59e-10ab-8258-001ec947cd2a")
    @Override
    public void init() {
        getShell().setText(ModelSearch.I18N.getString("SearchDialog.shell.title")); //$NON-NLS-1$
        setTitle(ModelSearch.I18N.getString("SearchDialog.title")); //$NON-NLS-1$
        this.setMessage(ModelSearch.I18N.getString("SearchDialog.description")); //$NON-NLS-1$
    }

    @objid ("48e673ea-cb6e-4a6b-85a5-a855bbdd0644")
    ISearchPanel getActivePanel() {
        final TabItem[] activeTabs = this.tabFolder.getSelection();
        if (activeTabs.length > 0) {
            return (ISearchPanel) activeTabs[0].getData(PANEL_DATAKEY);
        }
        return null;
    }

    @objid ("b0310ae5-cec3-42d0-9265-33e6d26ea0df")
    ISearchEngine getActiveEngine() {
        final TabItem[] activeTabs = this.tabFolder.getSelection();
        if (activeTabs.length > 0) {
            return (ISearchEngine) activeTabs[0].getData(ENGINE_DATAKEY);
        }
        return null;
    }

    @objid ("3026918d-5ab3-4cc7-8d47-6402b5804de0")
    void showResults(ISearchPanel panel, List<Element> results) {
        setActivePanel(panel);
        this.resultsPanel.showResults(results);
    }

    @objid ("b13881d8-f408-44e0-9939-cc914dd4bb1a")
    public void initCriteria(final Class<? extends ISearchPanel> panelClass, final ISearchCriteria searchCriteria, final List<Element> found) {
        this.getShell().getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                ISearchPanel panel = null;
                for (final TabItem tabItem : SearchDialog.this.tabFolder.getItems()) {
                    if (tabItem.getData(PANEL_DATAKEY).getClass() == panelClass) {
                        panel = ((ISearchPanel) tabItem.getData(PANEL_DATAKEY));
                        break;
                    }
                }
                if (panel != null) {
                    panel.setCriteria(searchCriteria);
                    SearchDialog.this.showResults(panel, found);
                }
            }
        
        });
    }

    @objid ("5fc98cdb-d759-42de-8e60-663b9093fc72")
    @Override
    protected Point getInitialSize() {
        return new Point(600, 600);
    }

    @objid ("d124b33a-1766-4bec-ae94-29f779d42eea")
    @Override
    public boolean close() {
        if (this.listener != null && this.session != null) {
            this.session.getModelChangeSupport().removeModelChangeListener(this.listener);
        }
        return super.close();
    }

    @objid ("4bd85eec-78b3-4126-876f-fce07bc713c8")
    private void createCriteriaArea(SashForm parent) {
        // The criteria edition area
        final Composite composite = new Composite(parent, 0);
        composite.setLayout(new GridLayout());
        // composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        composite.setFont(parent.getFont());
        
        // Tab folder
        this.tabFolder = new TabFolder(composite, SWT.BORDER);
        final GridData fdTabs = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.tabFolder.setLayoutData(fdTabs);
        
        // Search button
        this.searchButton = new Button(composite, SWT.PUSH);
        this.searchButton.setText(ModelSearch.I18N.getString("SearchButton.label"));
        this.searchButton.setToolTipText(ModelSearch.I18N.getString("SearchButton.tooltip"));
        final GridData fdButton = new GridData(SWT.FILL, SWT.FILL, true, false);
        this.searchButton.setLayoutData(fdButton);
        
        this.searchButton.addSelectionListener(new SelectionListener() {
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                SearchDialog.this.controller.runSearch();
            }
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // TODO Auto-generated method stub
        
            }
        });
    }

    @objid ("17937083-7e07-4dfe-8b8d-266a6003eaf4")
    private void createResultsArea(SashForm parent) {
        // Results area
        final Composite composite = new Composite(parent, 0);
        composite.setLayout(new GridLayout());
        composite.setFont(parent.getFont());
        
        this.resultsPanel = new ResultsPanel(composite, this.navigationService);
        final Control top = this.resultsPanel.getControl();
        top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    }

    @objid ("727bc3cc-9c73-4141-b7e4-c2df732cffb9")
    public void registerSearchTool(String label, ISearchPanel panel, ISearchEngine engine) {
        panel.initialize(this.tabFolder, this.session, this.controller);
        
        final TabItem tabItem = new TabItem(this.tabFolder, SWT.NULL);
        tabItem.setText(label);
        tabItem.setControl(panel.getControl());
        tabItem.setData(PANEL_DATAKEY, panel);
        tabItem.setData(ENGINE_DATAKEY, engine);
    }

    @objid ("8eb1a2aa-e3a5-44e8-a61f-50c12a61f005")
    void setActivePanel(ISearchPanel panel) {
        for (final TabItem tabItem : SearchDialog.this.tabFolder.getItems()) {
            if (tabItem.getData(PANEL_DATAKEY).getClass() == panel.getClass()) {
                this.tabFolder.setSelection(tabItem);
                break;
            }
        }
    }

    @objid ("eef0646b-b60e-43e2-9f73-54c805f67a35")
    @Override
    protected String getHelpId() {
        return HELP_TOPIC;
    }

    @objid ("691d4e0b-13ab-4b31-90c3-b32868c9a5eb")
    public static class MetaclassLabelProvider extends StyledCellLabelProvider {
        @objid ("4b859808-c0bf-4ea7-923c-dcafb0ddac68")
        @Override
        public void update(ViewerCell cell) {
            final MClass mc = (MClass) cell.getElement();
            cell.setText(mc.getName());
            cell.setImage(MetamodelImageService.getIcon(mc));
            cell.setStyleRanges(StandardModelStyleProvider.getStyleRanges(mc, cell.getText()));
        }

    }

    @objid ("1281e30e-6529-4a2e-b0dd-35b7467833ae")
    public static class SearchModelChangeListener implements IModelChangeListener, IStatusChangeListener {
        @objid ("acd6f846-d925-4b5a-9872-b5f1d993aece")
        private final SearchDialog searchDialog;

        @objid ("e7511797-08dd-417c-ac0d-db80e7e1d4ff")
        public SearchModelChangeListener(SearchDialog searchDialog) {
            this.searchDialog = searchDialog;
        }

        @objid ("d026ae1b-8147-4056-9800-07d9f444c2d2")
        @Override
        public void statusChanged(IStatusChangeEvent event) {
            this.searchDialog.getShell().getDisplay().asyncExec(new Runnable() {
            
                @Override
                public void run() {
                    SearchModelChangeListener.this.searchDialog.controller.runSearch();
                }
            
            });
        }

        @objid ("c5c8888f-edf2-46f1-a4b2-21d401345549")
        @Override
        public void modelChanged(IModelChangeEvent event) {
            this.searchDialog.getShell().getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    // TODO improve by looking up for deletions in the update
                    // event
                    SearchModelChangeListener.this.searchDialog.controller.runSearch();
                }
            
            });
        }

    }

}
