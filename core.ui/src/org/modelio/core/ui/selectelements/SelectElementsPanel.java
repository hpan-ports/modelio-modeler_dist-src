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


package org.modelio.core.ui.selectelements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.core.ui.images.BasicModelElementLabelProvider;
import org.modelio.core.ui.plugin.CoreUi;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.model.search.engine.ISearchCriteria;
import org.modelio.model.search.engine.ISearchEngine;
import org.modelio.model.search.engine.searchers.model.ModelSearchCriteria;
import org.modelio.model.search.engine.searchers.model.ModelSearchEngine;
import org.modelio.ui.CoreFontRegistry;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * <p>
 * The SelectElementsPanel is an implementation of IPanelProvider that can be used to select several model Element from a list of
 * <em>candidates</em> into a <em>results</em> list.
 * </p>
 * <p>
 * The <em>candidates</em> list is passed as ISearchEngine and ISearchCriteria parameters. The search is launched only when the
 * panel is displayed and it is run in a separate thread in order to keep the UI refreshing.
 * </p>
 * <p>
 * The initial list of <em>results</em> has to be passed using the <em>setInput()</em> method. It must be a non-null, possibly
 * non-empty, modifiable List&lt;MObject&gt;.
 * </p>
 * <p>
 * &nbsp;
 * </p>
 */
@objid ("852f0815-b14b-4ad5-94b2-4cc2c8543b8f")
public class SelectElementsPanel implements IPanelProvider {
    @objid ("7dbb266e-96c5-45f5-9d34-6f0c5c28dfbc")
    private PanelView view;

    @objid ("d835879b-2c16-452c-a571-139dc1c6e424")
    private PanelControler controler;

    /**
     * C'tor
     * @param session
     * @param searchEngine
     * @param searchCriteria
     */
    @objid ("0936c38a-e76f-4ab1-889a-56ee03400659")
    public SelectElementsPanel(ICoreSession session, ISearchEngine searchEngine, ISearchCriteria searchCriteria) {
        this.controler = new PanelControler(session, searchEngine, searchCriteria);
    }

    /**
     * C'tor for convenience variant. Uses a ModelSearchEngine, search criteria being defined by metaclass + regexp
     */
    @objid ("98b9ab16-96d5-4e5c-9f7f-6ff1157b0eca")
    public SelectElementsPanel(ICoreSession session, Class<? extends Element> metaclass, String regexp) {
        ModelSearchCriteria searchCriteria = new ModelSearchCriteria();
        searchCriteria.setExpression(regexp);
        searchCriteria.setCaseSensitive(true);
        searchCriteria.addMetaclass(metaclass);
        this.controler = new PanelControler(session, new ModelSearchEngine(), searchCriteria);
    }

    /**
     * C'tor for convenience variant. The candidates are those of a given fixed list.
     */
    @objid ("ecb2d224-5fb6-4ebb-8a53-a5805904fc4e")
    public SelectElementsPanel(List<Element> candidates) {
        this.controler = new PanelControler(null, new ISearchEngine() {
            @Override
            public List<Element> search(ICoreSession session, ISearchCriteria criteria) {
                return candidates;
            }
        }, null);
    }

    @objid ("e6647ae9-ce34-477c-b037-3c223a4bcfeb")
    @Override
    public boolean isRelevantFor(Object obj) {
        return (obj instanceof List<?>);
    }

    @objid ("bbe28831-9cae-4299-ab08-c69c002895e9")
    @Override
    public Object createPanel(Composite parent) {
        this.view = new PanelView(parent, this.controler);
        this.controler.setView(this.view);
        return this.view.getContainer();
    }

    @objid ("a5ef7a94-f7a4-479c-bbfd-c54f6d8f2d33")
    @Override
    public Object getPanel() {
        return this.view.getContainer();
    }

    @objid ("11b9c7c0-83a1-4e11-81eb-5c7a7c1b6d41")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("593db034-bf84-4965-b846-6c0e299adc06")
    @Override
    public Object getInput() {
        return this.controler.getResults();
    }

    @objid ("9aad13a0-e00a-4ed5-8d78-63f86967ca21")
    @Override
    public void setInput(Object input) {
        this.controler.setInitialResults((List<MObject>) input);
    }

    @objid ("c44ccca4-48f5-465f-b102-7b518dd19753")
    @Override
    public void dispose() {
        this.view.dispose();
        this.controler.dispose();
    }

    @objid ("19a44d5f-8adc-4000-a396-e34dff7fc867")
    private static class PanelView {
        @objid ("91311591-dd47-4a20-a03b-361b1393b221")
        private PanelControler controler;

        @objid ("e1c45f70-75fe-432e-9bd9-afecf2235c91")
        private Composite container;

        @objid ("01bd1005-6afc-4def-ad8c-a6ff5e4664f5")
        private TableViewer candidates;

        @objid ("91f4e2d0-6548-4815-a6af-8eeb0591a293")
        private TableViewer results;

        @objid ("6a8ac9d0-6d3f-48e7-9c1d-953c12e3b66f")
        private Button addButton;

        @objid ("c2d7f476-bf44-4fe0-a554-5bdf7d239e82")
        private Button removeButton;

        @objid ("bdabff94-ed6f-4a44-8f25-666fe86106f5")
        private Label candidatesStatusLabel;

        @objid ("f586d381-3bce-4c7f-995d-8880e693ecc2")
        private Label resultsStatusLabel;

        @objid ("f443391c-fa0c-41c8-bb5c-5e53ce226f9e")
        public PanelView(Composite parent, PanelControler controler) {
            this.controler = controler;
            this.container = createGui(parent);
        }

        @objid ("1b7dc169-ea0e-4947-aa5d-7de8e2e50844")
        private Composite createGui(Composite parent) {
            final Composite composite = new Composite(parent, SWT.NONE);
            composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
            composite.setLayout(new FormLayout());
            
            // Search criteria group
            Group candidatesGroup = createCandidatesGroup(composite);
            // Command buttons group
            Composite commandsGroup = createCommandsGroup(composite);
            // Selected Elements group
            Group selectionGroup = createSelectionGroup(composite);
            
            // candidatesGroup attachments
            FormData formData = new FormData();
            formData.top = new FormAttachment(0, 5);
            formData.left = new FormAttachment(0, 5);
            formData.right = new FormAttachment(commandsGroup, 0, SWT.LEFT);
            formData.bottom = new FormAttachment(100, -5);
            candidatesGroup.setLayoutData(formData);
            
            // selectionGroup attachments
            formData = new FormData();
            formData.top = new FormAttachment(0, 5);
            formData.right = new FormAttachment(100, -5);
            formData.left = new FormAttachment(commandsGroup, 0, SWT.RIGHT);
            formData.bottom = new FormAttachment(100, -5);
            selectionGroup.setLayoutData(formData);
            
            // commandsGroup attachments
            formData = new FormData();
            formData.top = new FormAttachment(candidatesGroup, 0, SWT.CENTER);
            formData.left = new FormAttachment(50, -40);
            formData.right = new FormAttachment(50, 40);
            // formData.bottom = new FormAttachment(100, -5);
            commandsGroup.setLayoutData(formData);
            return composite;
        }

        @objid ("38d4c3b3-96ef-4aaa-8397-725a7747d086")
        private Group createCandidatesGroup(Composite composite) {
            final Group candidateGroup = new Group(composite, SWT.NONE);
            candidateGroup.setLayout(new GridLayout(1, false));
            candidateGroup.setText(CoreUi.I18N.getString("SelectElementsPanel.CandidatesElements"));
            
            // Candidates list
            this.candidates = new TableViewer(candidateGroup, SWT.BORDER | SWT.MULTI);
            GridData gd = new GridData();
            gd.grabExcessHorizontalSpace = true;
            gd.grabExcessVerticalSpace = true;
            gd.horizontalAlignment = SWT.FILL;
            gd.verticalAlignment = SWT.FILL;
            gd.horizontalSpan = 1;
            this.candidates.getTable().setLayoutData(gd);
            
            this.candidates.setContentProvider(new ArrayContentProvider());
            this.candidates.setLabelProvider(new BasicModelElementLabelProvider(true));
            
            this.candidates.setSorter(new ViewerSorter());
            
            // Status label
            this.candidatesStatusLabel = new Label(candidateGroup, SWT.NONE);
            this.candidatesStatusLabel.setText("...");
            this.candidatesStatusLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
            
            this.candidatesStatusLabel.setFont(CoreFontRegistry.getModifiedFont(this.candidatesStatusLabel.getFont(), SWT.ITALIC,
                    0.9f));
            
            // Listeners and behavior
            
            // Double click listener: add element
            this.candidates.addDoubleClickListener(new IDoubleClickListener() {
                @Override
                public void doubleClick(DoubleClickEvent event) {
                    PanelView.this.controler.onAdd(SelectionHelper.toList(event.getSelection(), MObject.class));
                }
            });
            
            // Selection change
            // - fire controler
            // - update status label
            this.candidates.addSelectionChangedListener(new ISelectionChangedListener() {
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    PanelView.this.controler.onSelectCandidate(SelectionHelper.toList(event.getSelection(), MObject.class));
                    PanelView.this.updateStatusLabel(PanelView.this.candidatesStatusLabel, (TableViewer) event.getSource());
                }
            });
            
            // <ctrl>+<alt> + right-click navigates to the selected element
            this.candidates.getTable().addMouseListener(new MouseAdapter() {
                @SuppressWarnings("synthetic-access")
                @Override
                public void mouseUp(MouseEvent e) {
                    // <CTRL><ALT> click
                    if ((e.button == 1) && (e.stateMask & (SWT.CTRL | SWT.ALT)) != 0) {
                        PanelView.this.controler.fireNavigate(SelectionHelper.toList(PanelView.this.results.getSelection(),
                                MObject.class));
                    }
                }
            });
            return candidateGroup;
        }

        @objid ("06d007b5-f81b-46cb-994b-0d5b5477b2ce")
        private Group createSelectionGroup(Composite composite) {
            final Group resultsGroup = new Group(composite, SWT.SHADOW_NONE);
            resultsGroup.setLayout(new GridLayout(1, true));
            
            resultsGroup.setText(CoreUi.I18N.getString("SelectElementsPanel.ChoosenElements"));
            
            // New content table
            this.results = new TableViewer(resultsGroup, SWT.BORDER | SWT.MULTI);
            GridData fd_contentTree = new GridData(SWT.FILL, SWT.FILL, true, true);
            this.results.getTable().setLayoutData(fd_contentTree);
            
            this.results.setContentProvider(new ArrayContentProvider());
            this.results.setLabelProvider(new BasicModelElementLabelProvider(true));
            
            // Status label
            this.resultsStatusLabel = new Label(resultsGroup, SWT.NONE);
            this.resultsStatusLabel.setText("...");
            this.resultsStatusLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
            this.resultsStatusLabel.setFont(CoreFontRegistry.getModifiedFont(this.resultsStatusLabel.getFont(), SWT.ITALIC, 0.9f));
            
            // Double click removes the element
            this.results.addDoubleClickListener(new IDoubleClickListener() {
                @Override
                public void doubleClick(DoubleClickEvent event) {
                    PanelView.this.controler.onRemove(SelectionHelper.toList(event.getSelection(), MObject.class));
                }
            });
            
            // Listeners and behavior
            
            // Selection change
            // - fire controler
            // - update status label
            this.results.addSelectionChangedListener(new ISelectionChangedListener() {
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    PanelView.this.controler.onSelectResult(SelectionHelper.toList(event.getSelection(), MObject.class));
                    PanelView.this.updateStatusLabel(PanelView.this.resultsStatusLabel, (TableViewer) event.getSource());
                }
            });
            
            // <ctrl> <alt>+ right click navigates to the selected element
            this.results.getTable().addMouseListener(new MouseAdapter() {
                @SuppressWarnings("synthetic-access")
                @Override
                public void mouseUp(MouseEvent e) {
                    // <CTRL><ALT>Right click
                    if ((e.button == 3) && (e.stateMask & (SWT.CTRL | SWT.ALT)) != 0) {
                        PanelView.this.controler.fireNavigate(SelectionHelper.toList(PanelView.this.results.getSelection(),
                                MObject.class));
                    }
                }
            });
            return resultsGroup;
        }

        @objid ("fc13812e-5033-40c6-9222-7e59806372a4")
        private Composite createCommandsGroup(Composite parent) {
            final Composite buttonsGroup = new Composite(parent, SWT.NONE);
            buttonsGroup.setLayout(new GridLayout(1, true));
            
            // Add button
            this.addButton = new Button(buttonsGroup, SWT.ARROW | SWT.PUSH);
            GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
            this.addButton.setLayoutData(gd);
            this.addButton.setText(CoreUi.I18N.getString("SelectElementsPanel.AddButton"));
            // upButton.setImage(getBundleImage("icons/add_16.png"));
            
            // Remove button
            this.removeButton = new Button(buttonsGroup, SWT.PUSH);
            gd = new GridData(SWT.FILL, SWT.FILL, true, false);
            this.removeButton.setLayoutData(gd);
            this.removeButton.setText(CoreUi.I18N.getString("SelectElementsPanel.RemoveButton"));
            
            // this.downImage = getBundleImage("icons/down_16.png");
            // downButton.setImage(this.downImage);
            
            this.removeButton.addSelectionListener(new SelectionListener() {
            
                @Override
                public void widgetSelected(SelectionEvent e) {
                    PanelView.this.controler.onRemove();
                }
            
                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    // TODO Auto-generated method stub
            
                }
            });
            
            this.addButton.addSelectionListener(new SelectionListener() {
            
                @Override
                public void widgetSelected(SelectionEvent e) {
                    PanelView.this.controler.onAdd();
                }
            
                @Override
                public void widgetDefaultSelected(SelectionEvent e) {
                    // TODO Auto-generated method stub
            
                }
            });
            return buttonsGroup;
        }

        /**
         * Ensure that setting the candidates is run in the display thread
         * @param candidatesList
         * @param selection
         */
        @objid ("f14b3481-15e6-4e79-899f-3596bbc88758")
        public void setCandidates(final List<Element> candidatesList, final List<MObject> selection) {
            this.container.getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    doSetCandidates(candidatesList, selection);
                }
            });
        }

        /**
         * Guaranteed to run in the display thread
         * @param candidatesList
         * @param selection
         */
        @objid ("c339deea-eebc-4ec6-8fbc-cd2ce35bd1b6")
        private void doSetCandidates(List<Element> candidatesList, List<MObject> selection) {
            if (candidatesList == null) {
                this.candidates.setLabelProvider(new LabelProvider());
                this.candidates.setInput(Arrays.asList(CoreUi.I18N.getString("SelectElementsPanel.Searching")));
                this.candidates.getTable().setEnabled(false);
            } else {
                this.candidates.setInput(candidatesList);
                this.candidates.setLabelProvider(new BasicModelElementLabelProvider(true));
                this.candidates.getTable().setEnabled(true);
                if (selection != null) {
                    PanelView.this.candidates.setSelection(new StructuredSelection(selection));
                }
            }
        }

        /**
         * Ensure that setting the results is run in the display thread
         * @param selected
         * @param selection
         */
        @objid ("7cacd912-f37d-448e-b55e-ef160e746a89")
        public void setResults(List<MObject> selected, List<MObject> selection) {
            this.container.getDisplay().asyncExec(new Runnable() {
                @Override
                public void run() {
                    doSetResults(selected, selection);
                }
            });
        }

        /**
         * Guaranteed to run in the display thread
         */
        @objid ("b2b557fb-0f03-4f6c-af01-b3e20c3642e7")
        private void doSetResults(List<MObject> selected, List<MObject> selection) {
            this.results.setInput(selected);
            if (selection != null) {
                this.results.setSelection(new StructuredSelection(selection));
            }
        }

        @objid ("5d9e3d86-7f9c-4da4-9227-3597e37c080e")
        public void enableAddCommand(boolean onOff) {
            this.addButton.setEnabled(onOff);
        }

        @objid ("84257cfd-cf0f-4053-b607-c2c9ec242836")
        public void enableRemoveCommand(boolean onOff) {
            this.removeButton.setEnabled(onOff);
        }

        @objid ("da0f6cf4-b6db-4be1-82ac-58bccfe05f8e")
        public List<MObject> getCandidatesSelection() {
            return SelectionHelper.toList(this.candidates.getSelection(), MObject.class);
        }

        @objid ("adfeef51-969e-42ba-af28-1244e0c78751")
        public List<MObject> getResultsSelection() {
            return SelectionHelper.toList(this.results.getSelection(), MObject.class);
        }

        /**
         * Return the top level container of the view.
         * @return
         */
        @objid ("82ac2c23-64db-4764-b0ea-433122e7180a")
        public Object getContainer() {
            return this.container;
        }

        /**
         * Dispose the view resources
         */
        @objid ("71bb8f95-4720-48f9-9e3f-ea44d7392a65")
        public void dispose() {
        }

        @objid ("08657f74-59f6-4aef-bddb-69de7f237a15")
        private void updateStatusLabel(Label label, TableViewer v) {
            final int nSelected = v.getTable().getSelectionCount();
            final int nTotal = v.getTable().getItemCount();
            label.setText(CoreUi.I18N.getMessage("SelectElementsPanel.ElementsStatus", nSelected, nTotal));
        }

    }

    @objid ("9e2d9e48-2360-40b3-96b7-6dbfc68dd3b8")
    class PanelControler {
        @objid ("e5a0ce36-3e6e-4ea3-a991-585b9dad9a24")
        private List<MObject> selected;

        @objid ("a6e57c4f-0356-45e1-9dea-f5f570c22370")
        private ISearchCriteria searchCriteria;

        @objid ("256958db-58f7-4dd3-90e4-695065da7424")
        private ISearchEngine searcher;

        @objid ("88e1da3a-66f6-4cfa-b3ec-28d43de2b4c8")
        private ICoreSession session;

        @objid ("9ba0ecc5-7998-4748-89f0-a356329aed00")
        private PanelView view;

        @objid ("1ea84e3c-741a-463a-ab47-32ce2ba4d937")
        public PanelControler(ICoreSession session, ISearchEngine searcher, ISearchCriteria searchCriteria) {
            this.session = session;
            this.searcher = searcher;
            this.searchCriteria = searchCriteria;
        }

        @objid ("10945079-5c11-4ba1-b5b2-87e47f801be3")
        private void initCandidates(List<Element> candidates) {
            this.view.setCandidates(candidates, Collections.emptyList());
        }

        /**
         * Called by the dialog just before the GUI is closed
         */
        @objid ("e78a5fc1-fed6-4cc4-8470-a2baa6a0b461")
        public void onClose() {
        }

        /**
         * Called by the dialog when selection changes in the candidates list
         * @param selectedCandidates
         */
        @objid ("25b50ea5-d8cc-4884-95c1-305b73ce61ea")
        public void onSelectCandidate(List<MObject> selectedCandidates) {
            // TODO could improve by checking that at least one of the selected candidates is not already in the results
            this.view.enableAddCommand(!selectedCandidates.isEmpty());
        }

        /**
         * Called by the dialog when selection changes in the results list
         */
        @objid ("8c82c2d1-a6fc-4dd0-ad0e-394e317779d1")
        public void onSelectResult(List<MObject> selectedResults) {
            this.view.enableRemoveCommand(!selectedResults.isEmpty());
        }

        @objid ("e0553a1c-158b-4251-a659-fda017b24148")
        public void onAdd(List<MObject> selectedCandidates) {
            for (MObject obj : selectedCandidates) {
                if (!this.selected.contains(obj)) {
                    this.selected.add(obj);
                }
            }
            this.view.setResults(this.selected, selectedCandidates);
        }

        @objid ("870f3c68-a94b-4faa-b140-cf4f65ea7e78")
        public void onAdd() {
            onAdd(this.view.getCandidatesSelection());
        }

        @objid ("ccb94a95-553d-4b27-8f9f-a9318ce675a6")
        public void onRemove(List<MObject> selectedResults) {
            for (MObject obj : selectedResults) {
                this.selected.remove(obj);
            }
            this.view.setResults(this.selected, null);
        }

        @objid ("54f80006-6b5d-45f5-802e-9f7bcedce33e")
        public void onRemove() {
            onRemove(this.view.getResultsSelection());
        }

        @objid ("1433b459-4393-437e-a97a-bd514bfb19a0")
        public void fireNavigate(List<MObject> selectedElements) {
            if (!selectedElements.isEmpty()) {
                // IModelioNavigationService s = ??? ;
                // s.fireNavigate(selectedElements.get(0));
            }
        }

        /**
         * Called by the panel once the view has been instantiated. Launch the search thread to populate the candidates list in the
         * view
         * @param view
         */
        @objid ("0dd08c93-1089-4d36-9293-3c1e70917a3a")
        public void setView(PanelView view) {
            this.view = view;
            
            this.view.setCandidates(null, Collections.emptyList());
            setInitialResults(this.selected);
            
            // run a thread to search the candidates
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    initCandidates(searchCandidates());
                }
            
            });
            
            t.start();
        }

        @objid ("ece4c6a0-d910-4e2f-9022-fcf74526bdd9")
        private List<Element> searchCandidates() {
            return this.searcher.search(this.session, this.searchCriteria);
        }

        @objid ("aca7bd7a-a718-46c8-bdad-34ad779b00b9")
        public void setInitialResults(List<MObject> elements) {
            this.selected = elements;
            if (this.view != null) {
                this.view.setResults(elements, Collections.emptyList());
            }
        }

        @objid ("ac3abca0-f7d6-4fdd-9df0-031bd01ffcce")
        public List<MObject> getResults() {
            return this.selected;
        }

        @objid ("b505f2fa-8a7b-4e89-b53f-83c743a203c1")
        public void dispose() {
            // nothing to do
        }

    }

}
