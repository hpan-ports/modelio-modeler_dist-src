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


package org.modelio.diagram.styles.viewer;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.IStyleChangeListener;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.diagram.styles.editingsupport.StyleCellLabelProvider;
import org.modelio.diagram.styles.editingsupport.StylePropertyEditingSupport;
import org.modelio.diagram.styles.editingsupport.key.KeyLabelProvider;
import org.modelio.diagram.styles.plugin.DiagramStyles;
import org.modelio.ui.UIColor;
import org.modelio.ui.panel.IPanelListener;
import org.modelio.ui.panel.IPanelProvider;

@objid ("260d58ae-7a2c-4eb5-91b3-4e26f75323f4")
public class StyleEditPanel implements IPanelProvider {
    @objid ("75e4d43e-8e6b-4aa2-bcae-15dbd39913de")
    private StyleEditPanelController controller = new StyleEditPanelController();

    @objid ("7b729eb6-f26a-49d2-a175-4b29991285f8")
    @Override
    public boolean isRelevantFor(Object obj) {
        return false;
    }

    @objid ("5afe99bf-073c-426e-a683-920f1bc11fd1")
    @Override
    public Object createPanel(Composite parent) {
        return this.controller.createUi(parent);
    }

    @objid ("70acc363-8355-41e4-bae9-8c021cc31803")
    @Override
    public Object getPanel() {
        return this.controller.getUi().sash;
    }

    @objid ("daed1f57-bfdb-4908-a52c-4a13944a2760")
    @Override
    public String getHelpTopic() {
        return DiagramStyles.I18N.getString("StyleEditPanel.helptopic");
    }

    @objid ("a609b337-5df8-4908-b0b1-9b933c4578dd")
    @Override
    public Object getInput() {
        return this.controller.getData();
    }

    @objid ("90f15233-16ba-46ba-bc91-309f2edb5027")
    @Override
    public void setInput(Object input) {
        if (input instanceof StyleEditPanelUIData) {
            this.controller.setData((StyleEditPanelUIData) input);
        } else {
            this.controller.setData(null);
        }
    }

    @objid ("621052e7-47e1-4110-8ae7-b0418866ee39")
    @Override
    public void dispose() {
        this.controller.dispose();
    }

    @objid ("92be71c5-225a-4780-ac5a-0f87549c26e9")
    @Override
    public void addListener(IPanelListener l) {
        this.controller.addListener(l);
    }

    @objid ("9d12d90c-1ede-49f4-9d40-5c17540a8138")
    @Override
    public void removeListener(IPanelListener l) {
        this.controller.removeListener(l);
    }

    @objid ("c7b10464-6f5d-41ec-81b9-f041ff5bc1fc")
    public TreeViewer getTreeViewer() {
        return this.controller.getUi().treeViewer;
    }

    @objid ("9bd23e26-401d-4314-8580-88950fdbc733")
    public void showHelpPanel(boolean showHelp) {
        this.controller.showHelp(showHelp);
    }

    @objid ("249a7a87-924f-4f95-b6f6-f2b455c509bc")
    private static class StyleEditPanelUI implements IStyleChangeListener {
        @objid ("f1e1fe0f-d9a3-4ff5-a006-18c1852bdb14")
        private TreeViewer treeViewer;

        @objid ("d347a428-9f58-4fa7-8513-9aa5ecc71353")
        private StyleEditPanelUIData model = new StyleEditPanelUIData(null, null);

        @objid ("eeed5dc3-e0bb-4814-9ad9-68b40b90811a")
        private IModelioPickingService modelioPickingService;

        @objid ("a69d5e8b-ec5e-4418-8bd7-5227a347afd6")
        private StyleEditPanelController controller;

        @objid ("37a0edd5-47b1-4d81-aed5-c52b35297982")
        private Label descriptionText;

        @objid ("1590b42f-f073-463b-8ff2-1ec25b1dd9f2")
        private SashForm sash;

        @objid ("cfa351c1-1ad9-4287-8f1d-6c89e1d537c2")
        private Action normalizeAction;

        @objid ("9aa68f24-731c-4eab-a017-6d4590fd696d")
        private Action resetAction;

        /**
         * @return the Modelio picking service
         */
        @objid ("7d656369-8c84-412a-9605-6a47389ae59b")
        public IModelioPickingService getPickingService() {
            return this.modelioPickingService;
        }

        /**
         * Called when a property changed in the edited style. See IStyleChangeListener.
         */
        @objid ("315c3151-cec4-4024-b38e-0ee99d31ae23")
        @Override
        public void styleChanged(IStyle changedStyle) {
            this.treeViewer.getTree().deselectAll();
            this.treeViewer.refresh(true);
            this.treeViewer.getTree().redraw();
            this.controller.onStyleChanged();
        }

        /**
         * @return the currently edited style.
         */
        @objid ("3d3fa04a-5ce1-427a-a44f-9f8f0d533734")
        public IStyle getEditedStyle() {
            return this.model.getStyleData();
        }

        @objid ("0b5c4210-98cf-4e1e-88f8-92d8feda2980")
        public StyleEditPanelUI(StyleEditPanelController controller) {
            this.controller = controller;
        }

        /**
         * Convenience to create and configure a column
         */
        @objid ("16853d41-4c39-4351-9f2c-67ffef1f0cd3")
        private static TreeViewerColumn createTreeViewerColumn(StyleEditPanelUI theViewer, String title, int bound) {
            final TreeViewerColumn column = new TreeViewerColumn(theViewer.treeViewer, SWT.NONE);
            column.getColumn().setText(title);
            column.getColumn().setWidth(bound);
            column.getColumn().setResizable(true);
            column.getColumn().setMoveable(true);
            return column;
        }

        /**
         * @return the edited style model.
         */
        @objid ("566c47bf-5e83-487a-a040-57d015fbc8c3")
        public StyleEditPanelUIData getModel() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return this.model;
        }

        /**
         * This will create the columns for the style table viewer
         */
        @objid ("d9104cce-fec4-47f8-bc0e-ece2572772fa")
        private void createColumns(final StyleEditPanelUI viewer) {
            String[] columnTitles = { DiagramStyles.I18N.getString("StylesViewer.Property"),
                    DiagramStyles.I18N.getString("StylesViewer.Value") };
            int[] columnInitialWidths = { 200, 100 };
            
            // First column is for the style key name
            TreeViewerColumn col1 = StyleEditPanelUI.createTreeViewerColumn(viewer, columnTitles[0], columnInitialWidths[0]);
            
            col1.setLabelProvider(new KeyLabelProvider(this.treeViewer));
            
            // Second column is for the style key type
            TreeViewerColumn col2 = StyleEditPanelUI.createTreeViewerColumn(viewer, columnTitles[1], columnInitialWidths[1]);
            
            col2.setLabelProvider(new StyleCellLabelProvider(this.treeViewer));
            col2.setEditingSupport(new StylePropertyEditingSupport(this.treeViewer));
            
            this.treeViewer.setContentProvider(new StyleDataContentProvider(this.model));
            // this.treeViewer.setLabelProvider(new StyleCellLabelProvider(this));
        }

        /**
         * Called when a property changed in the edited style See IStyleChangeListener.
         */
        @objid ("2126129c-3a2c-4c1e-b7a8-6503d9f96a9e")
        @Override
        public void styleChanged(StyleKey property, Object newValue) {
            if (!this.treeViewer.getTree().isDisposed()) {
                this.treeViewer.getTree().deselectAll();
                this.treeViewer.refresh(true);
                this.treeViewer.getTree().redraw();
                this.controller.onStyleChanged();
            } else {
                // Sometimes, this listener is called when the tree viewer is already disposed. Make sure to unregister it.
                this.model.getStyleData().removeListener(this);
            }
        }

        @objid ("559a43b2-1c24-49b0-894e-eeb907284d93")
        public Control createUI(Composite parent) {
            this.sash = new SashForm(parent, SWT.VERTICAL | SWT.NONE);
            
            this.treeViewer = new TreeViewer(this.sash, SWT.HIDE_SELECTION | SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
                    | SWT.FULL_SELECTION);
            
            this.treeViewer.getTree().setHeaderVisible(true);
            this.treeViewer.getTree().setLinesVisible(true);
            
            // this.treeViewer.setContentProvider(this.model);
            // this.treeViewer.setInput(this.model);
            
            // Layout the viewer
            GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
            this.treeViewer.getControl().setLayoutData(gridData);
            
            // Create columns
            this.createColumns(this);
            this.treeViewer.refresh();
            
            this.descriptionText = new Label(this.sash, SWT.WRAP | SWT.V_SCROLL);
            // moduleDescriptionText.setEditable(false);
            this.descriptionText.setForeground(UIColor.LABEL_TIP_FG);
            
            this.sash.setWeights(new int[] { 80, 20 });
            
            this.treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            
                @Override
                public void selectionChanged(SelectionChangedEvent event) {
                    StyleKey o = SelectionHelper.getFirst(event.getSelection(), StyleKey.class);
                    StyleEditPanelUI.this.controller.onPropertySelection(o);
                }
            });
            
            MenuManager popupMenu = new MenuManager();
            
            popupMenu.addMenuListener(new IMenuListener() {
                @Override
                public void menuAboutToShow(IMenuManager manager) {
                    ISelection selection = StyleEditPanelUI.this.treeViewer.getSelection();
                    boolean enabled = SelectionHelper.containsOnly(selection, StyleKey.class);
                    StyleEditPanelUI.this.normalizeAction.setEnabled(enabled);
                    StyleEditPanelUI.this.resetAction.setEnabled(enabled);
                }
            });
            
            this.normalizeAction = new Action() {
                @Override
                public void runWithEvent(Event event) {
                    StyleEditPanelUI.this.controller.onNormalize(StyleEditPanelUI.this.treeViewer.getSelection());
                }
            };
            this.normalizeAction.setText(DiagramStyles.I18N.getString("EditStylesDialog.NormalizeButton"));
            
            this.resetAction = new Action() {
                @Override
                public void runWithEvent(Event event) {
                    StyleEditPanelUI.this.controller.onReset(StyleEditPanelUI.this.treeViewer.getSelection());
                }
            };
            this.resetAction.setText(DiagramStyles.I18N.getString("EditStylesDialog.RestoreButton"));
            
            popupMenu.add(this.normalizeAction);
            popupMenu.add(this.resetAction);
            Menu menu = popupMenu.createContextMenu(this.treeViewer.getTree());
            this.treeViewer.getTree().setMenu(menu);
            return this.sash;
        }

        /**
         * Set the model for the viewer. The 'null' value means no model. The Viewer actually uses a fake empty model in this case,
         * displaying an empty table.
         * @param model
         * the model used by this viewer.
         */
        @objid ("257c7bd2-1239-4e57-b9d1-3e2fa3f29512")
        public void update(StyleEditPanelUIData data) {
            // unregister Style listener from previous model
            if (this.model != null && this.model.getStyleData() != null) {
                this.model.getStyleData().removeListener(this);
            }
            
            // set model
            if (data == null) {
                this.model = new StyleEditPanelUIData(null, null);
                this.treeViewer.setInput(this.model);
                // do not register a listener
            } else {
                this.model = data;
                this.treeViewer.setInput(this.model);
                // register as Style listener
                this.model.getStyleData().addListener(this);
            }
        }

        @objid ("992eebbc-aaa7-416e-b80c-f52f53f7d72c")
        public void dispose() {
            // TODO Auto-generated method stub
        }

        @objid ("79c96ed3-29f6-4637-bee1-272d29f048f9")
        public void setDescription(String s) {
            this.descriptionText.setText(s);
        }

    }

    @objid ("8bbe7dd1-10ad-4830-b5b5-7db3ca4a9e5b")
    private static class StyleEditPanelController {
        @objid ("9120fb75-40c2-4560-b8eb-16e7384b4cb8")
        private StyleEditPanelUI ui;

        @objid ("1fbfd473-4197-40e0-89fc-34e2af23aa54")
        private StyleEditPanelUIData data;

        @objid ("bbc46eed-1ef4-4c66-a1c9-0021f6183fa0")
        private List<IPanelListener> listeners = new ArrayList<>();

        @objid ("32aa3d23-f30f-4e06-9aca-40313e55be25")
        public TreeViewer createUi(Composite parent) {
            this.ui = new StyleEditPanelUI(this);
            this.ui.createUI(parent);
            return this.ui.treeViewer;
        }

        @objid ("16edb377-18ff-4125-926f-5d1dc0128267")
        public synchronized void addListener(IPanelListener l) {
            if (this.listeners.contains(l)) {
                throw new InvalidParameterException("Listener already registered");
            }
            this.listeners.add(l);
        }

        @objid ("826a9574-1fd8-49e3-a6ec-23f044ed1b33")
        public synchronized void removeListener(IPanelListener l) {
            this.listeners.remove(l);
        }

        @objid ("5f698368-cefe-4366-a26b-daaaf14e791c")
        public StyleEditPanelController() {
            // TODO Auto-generated constructor stub
        }

        @objid ("8b9ffe68-db28-4d59-ac1c-f981e40a4b0b")
        public void onPropertySelection(StyleKey sk) {
            if (sk == null) {
                this.ui.setDescription("");
            } else {
                this.ui.setDescription(sk.getTooltip());
            }
        }

        @objid ("d29b8fcf-0311-41b3-86c7-42546a1f7221")
        public StyleEditPanelUI getUi() {
            return this.ui;
        }

        @objid ("e44db11f-d5b3-4c35-af58-8f482141aff1")
        public StyleEditPanelUIData getData() {
            return this.data;
        }

        @objid ("a839442d-9ace-46df-a1e0-26390292d68e")
        public void setData(StyleEditPanelUIData data) {
            this.data = data;
            if (this.ui != null) {
                this.ui.update(this.data);
            }
        }

        @objid ("45515e54-6d9c-44c9-826c-5cb231f7a1db")
        private void fireListeners(StyleEditPanelUIData data, boolean isValidate) {
            this.listeners.forEach(l -> l.dataChanged(data, isValidate));
        }

        @objid ("ff091d5a-d2ef-4099-923a-3d7f926749e3")
        public void dispose() {
            this.ui.dispose();
            this.ui = null;
        }

        @objid ("1193c365-884c-4187-90e3-649dbbb3a1c9")
        public void showHelp(boolean showHelp) {
            if (showHelp) {
                this.ui.sash.setWeights(new int[] { 80, 20 });
            
            } else {
                this.ui.sash.setWeights(new int[] { 100, 0 });
            }
            this.ui.sash.layout(true);
        }

        @objid ("05e661e6-5156-4995-bae8-5fdbf4c9700e")
        public void onStyleChanged() {
            this.fireListeners(this.data, true);
        }

        @objid ("0b8f605b-7232-4a0b-84f6-52f11a25555c")
        public void onNormalize(ISelection selection) {
            // Process StyleKey
            List<StyleKey> selected = SelectionHelper.toList(selection, StyleKey.class);
            for (StyleKey skey : selected) {
                this.data.getStyleData().normalize(skey);
            }
        }

        @objid ("6e9f32fa-a651-40f0-b327-2f887e9b187d")
        public void onReset(ISelection selection) {
            // Process StyleKey
            List<StyleKey> selected = SelectionHelper.toList(selection, StyleKey.class);
            for (StyleKey skey : selected) {
                this.data.getStyleData().removeProperty(skey);
            }
        }

    }

    @objid ("ba3cda96-9a5c-49fc-abac-320384937daa")
    private static class StyleDataContentProvider implements ITreeContentProvider {
        @objid ("66597680-ece8-479f-85dc-97feaddce2e9")
        private StyleEditPanelUIData data;

        @objid ("1476b010-96f9-4d57-a937-9c97428ee5b8")
        private static final Object[] NO_OBJECTS = new Object[0];

        @objid ("0f9d8a5b-5399-40bf-8218-99d8e7a3eb9c")
        private final Map<String, List<StyleKey>> cache = new HashMap<>();

        @objid ("dd52e01d-6e0f-44df-8a69-9c5e707344e0")
        public StyleDataContentProvider(StyleEditPanelUIData data) {
            this.data = data;
        }

        @objid ("02119ed7-45b4-49b4-8b93-700daef53fd2")
        @Override
        public void dispose() {
            this.cache.clear();
            this.data = null;
        }

        @objid ("72d7daa2-abe1-4664-a323-e1f4093149fe")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            this.data = (StyleEditPanelUIData) newInput;
        }

        @objid ("5cae476b-3b9b-46fe-8e0c-314ad310a7e1")
        @Override
        public Object[] getElements(Object inputElement) {
            // If there is no styledata, return 'no objects'
            if (this.data == null || this.data.getStyleData() == null) {
                return NO_OBJECTS;
            }
            
            // If there is a filter, the filter defines the set of keys
            // otherwise let use the whole set of known StyleKeys instances
            List<StyleKey> displayedKeys;
            if (this.data.getKeyfilter() != null) {
                displayedKeys = new ArrayList<>(this.data.getKeyfilter());
            } else {
                displayedKeys = new ArrayList<>(StyleKey.getInstances());
            }
            
            // Build the category cache
            this.cache.clear();
            for (StyleKey skey : displayedKeys) {
                List<StyleKey> keys = this.cache.get(skey.getCategory());
                if (keys == null) {
                    this.cache.put(skey.getCategory(), keys = new ArrayList<>());
                }
                keys.add(skey);
            }
            
            // Depending on the existence of several categories, return either the categories or the stylekey.
            // This results in a tree structure when there are several categories and a flat structure when there is only one or no
            // category
            if (this.cache.keySet().size() == 1) {
                return this.cache.get(this.cache.keySet().iterator().next()).toArray();
            } else {
                ArrayList<String> categories = new ArrayList<>(this.cache.keySet());
                Collections.sort(categories);
                return categories.toArray();
            }
        }

        @objid ("6bf1a507-4893-4e72-99fc-9ebbf85909b5")
        @Override
        public Object[] getChildren(Object parentElement) {
            // A StyleKey has no children
            if (parentElement instanceof StyleKey) {
                return null;
            }
            
            // A String represents a category
            if (parentElement instanceof String) {
                return this.cache.get(parentElement).toArray();
            }
            return null;
        }

        @objid ("fa52ac64-5cf0-4766-b69e-e984da9b2d96")
        @Override
        public Object getParent(Object element) {
            if (element instanceof StyleKey && this.cache.keySet().size() > 1) {
                return ((StyleKey) element).getCategory();
            } else {
                return null;
            }
        }

        @objid ("6bdd1db6-9c1e-4ce5-8ea9-f24ba2c97482")
        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof StyleKey) {
                return false;
            } else if (element instanceof String && this.cache.containsKey(element)) {
                return true;
            }
            return false;
        }

    }

}
