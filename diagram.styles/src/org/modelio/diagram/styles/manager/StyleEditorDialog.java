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


package org.modelio.diagram.styles.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.core.ui.dialog.ModelioDialog;
import org.modelio.diagram.styles.core.FactoryStyle;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.NamedStyle;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.diagram.styles.plugin.DiagramStyles;
import org.modelio.diagram.styles.viewer.StyleEditPanel;
import org.modelio.diagram.styles.viewer.StyleEditPanelUIData;
import org.modelio.ui.CoreFontRegistry;

/**
 * The style editor dialog is used to edit named styles.
 */
@objid ("85bc6e0a-1926-11e2-92d2-001ec947c8cc")
public class StyleEditorDialog extends ModelioDialog {
    @objid ("85bc6e0d-1926-11e2-92d2-001ec947c8cc")
    private StyleEditPanelUIData model;

    @objid ("85bed063-1926-11e2-92d2-001ec947c8cc")
    private SashForm mainSash;

    @objid ("85bed065-1926-11e2-92d2-001ec947c8cc")
    private Button saveButton;

    @objid ("85bed066-1926-11e2-92d2-001ec947c8cc")
    private Button normButton;

    @objid ("85bed067-1926-11e2-92d2-001ec947c8cc")
    private Button restoreButton;

// @objid("85bed068-1926-11e2-92d2-001ec947c8cc")
// private Font titleFont;
    @objid ("85bed069-1926-11e2-92d2-001ec947c8cc")
    private Label title;

    @objid ("28502f9a-33a9-4a20-8a1c-d1ce87d801e0")
    private IModelioPickingService pickingService;

    @objid ("33d4aab5-b343-4386-9956-a0f1177b1915")
    private TreeViewer styleViewer;

    @objid ("9806ece0-2d56-4a79-a594-4b4eef17cf49")
    private StyleEditPanel styleEditPanel;

    @objid ("b076292a-c713-4571-b134-b857028ea636")
    private Label infos;

    /**
     * C'tor.
     * @param parentShell the parent SWT shell
     * @param pickingService Modelio picking service
     */
    @objid ("85bed06b-1926-11e2-92d2-001ec947c8cc")
    public StyleEditorDialog(Shell parentShell, IModelioPickingService pickingService) {
        super(parentShell);
        this.pickingService = pickingService;
        
        final NamedStyle editedStyle = new NamedStyle("new style", FactoryStyle.getInstance());
        this.model = new StyleEditPanelUIData(editedStyle, null, null, true);
        setBlockOnOpen(false);
    }

    @objid ("85bed06f-1926-11e2-92d2-001ec947c8cc")
    @Override
    public Control createContentArea(Composite parent) {
        // The content area is made of
        // - a tree viewer showing the style hierarchy, on the left
        // - a Style editor panel on the right
        // - a StyleViewer table
        // - a description area
        // - a toolbar
        //
        this.mainSash = new SashForm(parent, SWT.HORIZONTAL);
        this.mainSash.setLayout(new FillLayout());
        this.mainSash.setFont(parent.getFont());
        this.mainSash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        
        // Create the TreeViewer
        createStyleBrowserViewer(this.mainSash);
        
        // Create the StyleViewer
        createStyleEditorPanel(this.mainSash);
        
        //
        this.styleViewer.addSelectionChangedListener(new StyleViewerSelectionChangedListener(this));
        
        this.mainSash.setWeights(new int[] { 20, 80 });
        return this.mainSash;
    }

// @objid("85c132be-1926-11e2-92d2-001ec947c8cc")
// private static StyleViewer createStyleViewer(Composite parent, final StyleModelProvider modelProvider,
// IModelioPickingService pickingService) {
// // Create table viewer
// return new StyleViewer(parent, modelProvider, pickingService);
// }
    @objid ("85c3951b-1926-11e2-92d2-001ec947c8cc")
    @Override
    public void init() {
        setTitle(DiagramStyles.I18N.getString("EditStylesDialog.SubTitle"));
        setMessage(DiagramStyles.I18N.getString("EditStylesDialog.Message"));
        getShell().setText(DiagramStyles.I18N.getString("EditStylesDialog.Title"));
    }

    @objid ("85c3951e-1926-11e2-92d2-001ec947c8cc")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.CLOSE_LABEL, false);
    }

    /**
     * Set the edited style
     * @param editedStyle the edited style
     */
    @objid ("85c39522-1926-11e2-92d2-001ec947c8cc")
    void setEditedStyle(IStyle editedStyle) {
        this.model = (editedStyle != null) ? new StyleEditPanelUIData(editedStyle, null, null, true) : null;
        
        if (editedStyle != null) {
            this.title
                    .setText(DiagramStyles.I18N.getMessage("EditStylesDialog.CurrentStyle", ((NamedStyle) editedStyle).getName()));
            this.infos.setText(DiagramStyles.I18N.getMessage("EditStylesDialog.CurrentStyle.provider",
                    ((NamedStyle) editedStyle).getProvider()));
        } else {
            this.title.setText(" ");
            this.infos.setText(" ");
        }
        
        if (this.styleViewer != null) {
        
            final Object[] expandedCategories = this.styleViewer.getExpandedElements();
        
            // change the data model, this will collapse all categories which is not user friendly :(
            this.styleEditPanel.setInput(this.model);
        
            // try to expand the categories that were previously expanded => this is user friendly :)
            this.styleViewer.getTree().setRedraw(false);
            for (final Object o : expandedCategories) {
                this.styleViewer.setExpandedState(o, true);
            }
            this.styleViewer.getTree().setRedraw(true);
        
        }
    }

    @objid ("85c39525-1926-11e2-92d2-001ec947c8cc")
    @Override
    public boolean close() {
        setEditedStyle(null);
        return super.close();
    }

    @objid ("85c3952a-1926-11e2-92d2-001ec947c8cc")
    @Override
    protected Point getInitialSize() {
        return new Point(800, 800);
    }

    /**
     * This method is called by the selection change listener (StyleViewerSelectionChangedListener) of the style viewer when the
     * selection changes in it. The method updates the buttons status (enabled/disabled) along with the description field displayed
     * text.
     */
    @objid ("85c3952f-1926-11e2-92d2-001ec947c8cc")
    protected void styleViewerSelectionChanged(final List<Object> selectedElements) {
        boolean onlyStyleKeys = true;
        
        for (final Object o : selectedElements) {
            onlyStyleKeys &= (o instanceof StyleKey);
        }
        
        if (onlyStyleKeys) {
            if (selectedElements.isEmpty()) {
                this.restoreButton.setEnabled(false);
        
            } else if (selectedElements.size() == 1) {
                this.restoreButton.setEnabled(true);
        
            } else {
                this.restoreButton.setEnabled(true);
        
            }
        } else {
            this.restoreButton.setEnabled(false);
        
        }
    }

    @objid ("85c39536-1926-11e2-92d2-001ec947c8cc")
    private Composite createStyleEditorPanel(final Composite parent) {
        final Composite composite = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(1, false);
        gl.marginHeight = 0;
        gl.marginWidth = 0;
        composite.setLayout(gl);
        
        this.title = new Label(composite, SWT.NONE);
        this.title.setText("");
        // Use a big Font for title
        this.title.setFont(CoreFontRegistry.getModifiedFont(this.title.getFont(), SWT.NONE, 1.4f));
        
        GridData gd0 = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd0.horizontalIndent = 10;
        gd0.verticalIndent = 4;
        this.title.setLayoutData(gd0);
        
        this.infos = new Label(composite, SWT.NONE);
        this.infos.setText("");
        this.infos.setFont(CoreFontRegistry.getModifiedFont(this.infos.getFont(), SWT.ITALIC, 0.8f));
        gd0 = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd0.horizontalIndent = 20;
        gd0.verticalIndent = 2;
        this.infos.setLayoutData(gd0);
        
        // Add the style viewer table
        this.styleEditPanel = new StyleEditPanel();
        this.styleEditPanel.createPanel(composite);
        this.styleViewer = this.styleEditPanel.getTreeViewer();
        final GridData gd1 = new GridData(SWT.FILL, SWT.FILL, true, true);
        gd1.verticalIndent = 2;
        ((Control) this.styleEditPanel.getPanel()).setLayoutData(gd1);
        // this.viewer = createStyleViewer(sash, this.model, this.pickingService);
        
        // Add the toolbar
        final Composite editionToolbar = createStyleEditorButtons(composite);
        final GridData gd2 = new GridData(SWT.FILL, SWT.BOTTOM, true, false);
        editionToolbar.setLayoutData(gd2);
        return composite;
    }

    @objid ("85c3953c-1926-11e2-92d2-001ec947c8cc")
    private TreeViewer createStyleBrowserViewer(final Composite parent) {
        final TreeViewer treeView = new TreeViewer(parent, SWT.BORDER);
        treeView.setContentProvider(new StyleTreeContentProvider());
        treeView.setLabelProvider(new StyleTreeLabelProvider());
        treeView.setInput(DiagramStyles.getStyleManager());
        treeView.addSelectionChangedListener(new StyleTreeSelectionChangedListener(this));
        treeView.setAutoExpandLevel(2);
        
        final Transfer[] transferTypes = new Transfer[] { TextTransfer.getInstance() };
        
        treeView.addDragSupport(DND.DROP_MOVE, transferTypes, new DragSourceListener() {
            @Override
            public void dragFinished(DragSourceEvent event) {
                // nothing to do
            }
        
            @Override
            public void dragSetData(DragSourceEvent event) {
                final IStructuredSelection selection = (IStructuredSelection) treeView.getSelection();
                if (!selection.isEmpty()) {
                    final IStyle style = (IStyle) selection.getFirstElement();
                    if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
                        event.data = ((NamedStyle) style).getName();
                    }
                }
            }
        
            @Override
            public void dragStart(DragSourceEvent event) {
                final IStructuredSelection selection = (IStructuredSelection) treeView.getSelection();
                event.doit = (selection.size() == 1);
            }
        });
        treeView.addDropSupport(DND.DROP_MOVE, transferTypes, new ViewerDropAdapter(treeView) {
            @Override
            public boolean performDrop(Object data) {
                final StyleManager styleManager = DiagramStyles.getStyleManager();
                final IStyle target = (IStyle) getCurrentTarget();
                final IStyle dropped = styleManager.getStyle((String) data);
                if (dropped != null) {
                    dropped.setCascadedStyle(target);
                    treeView.refresh();
                    return true;
                }
                return false;
            }
        
            @Override
            public boolean validateDrop(Object target, int operation, TransferData transferType) {
                return true;
            }
        });
        
        // Tree popupmenu
        final MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        final Action createStyleAction = new Action() {
            @Override
            public void run() {
                super.run();
                final NamedStyle parentStyle = ((NamedStyle) ((StructuredSelection) treeView.getSelection()).getFirstElement());
                final IInputValidator validator = new IInputValidator() {
                    @Override
                    public String isValid(String newText) {
                        // Check name syntax must match "[a-zA-Z0-9 ]+"
                        if (!Pattern.matches("[a-zA-Z0-9]+", newText) || DiagramStyles.getStyleManager().getStyle(newText) != null) {
                            return DiagramStyles.I18N.getString("CreateStyleDialog.ErrorBadStyleName");
                        }
                        return null;
                    }
                };
        
                final InputDialog dlg = new InputDialog(parent.getShell(), DiagramStyles.I18N.getString("CreateStyleDialog.Title"),
                        DiagramStyles.I18N.getString("CreateStyleDialog.Prompt"),
                        DiagramStyles.I18N.getString("CreateStyleDialog.DefaultName"), validator);
        
                dlg.open();
                final String name = dlg.getValue();
                if (name == null) {
                    return;
                }
        
                final NamedStyle newStyle = DiagramStyles.getStyleManager().createStyle(name, parentStyle.getName());
                if (newStyle != null) {
                    treeView.refresh();
                    treeView.expandToLevel(parentStyle, 1);
                    final ArrayList<Object> selectionList = new ArrayList<>();
                    selectionList.add(newStyle);
                    treeView.setSelection(new StructuredSelection(selectionList), true);
                    setEditedStyle(newStyle);
                }
            }
        };
        
        createStyleAction.setText(DiagramStyles.I18N.getString("EditStylesDialog.DeriveCommand"));
        
        menuMgr.add(createStyleAction);
        
        final Menu menu = menuMgr.createContextMenu(treeView.getTree());
        treeView.getTree().setMenu(menu);
        
        // editing support
        return treeView;
    }

    @objid ("85c39542-1926-11e2-92d2-001ec947c8cc")
    private Composite createStyleEditorButtons(final Composite styleEditorPanel) {
        // Create editor toolbar and buttons
        // Catalog buttons
        final Composite editionToolbar = new Composite(styleEditorPanel, SWT.NONE);
        editionToolbar.setLayout(new RowLayout(SWT.HORIZONTAL));
        
        // GridDataFactory.defaultsFor(editionToolbar).align(SWT.END, SWT.BEGINNING) // align on the right
        // .grab(false, false).applyTo(editionToolbar);
        
        // "Save" button
        this.saveButton = new Button(editionToolbar, SWT.PUSH);
        this.saveButton.setText(DiagramStyles.I18N.getString("EditStylesDialog.SaveButton"));
        this.saveButton.setToolTipText("Save the current settings for the style");
        this.saveButton.addSelectionListener(new SelectionListener() {
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // do nothing
            }
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                StyleEditPanelUIData data = (StyleEditPanelUIData) StyleEditorDialog.this.styleEditPanel.getInput();
                DiagramStyles.getStyleManager().save((NamedStyle) data.getStyleData());
            }
        
        });
        
        // "Normalize" button
        this.normButton = new Button(editionToolbar, SWT.PUSH);
        this.normButton.setText(DiagramStyles.I18N.getString("EditStylesDialog.NormalizeButton"));
        this.normButton.setToolTipText("Normalize the style definitions. Remove useless local properties definitions.");
        this.normButton.addSelectionListener(new SelectionListener() {
        
            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // do nothing
            }
        
            @Override
            public void widgetSelected(SelectionEvent e) {
                StyleEditPanelUIData data = (StyleEditPanelUIData) StyleEditorDialog.this.styleEditPanel.getInput();
                data.getStyleData().normalize();
            }
        
        });
        
        // "Restore" button
        this.restoreButton = new Button(editionToolbar, SWT.PUSH);
        this.restoreButton.setText(DiagramStyles.I18N.getString("EditStylesDialog.RestoreButton"));
        
        this.restoreButton.setToolTipText("Restore the selected values to their inherited value");
        this.restoreButton.addSelectionListener(new RestoreButtonSelectionListener(this));
        return editionToolbar;
    }

    @objid ("85c39548-1926-11e2-92d2-001ec947c8cc")
    private static class StyleTreeContentProvider implements ITreeContentProvider {
        @objid ("85c3954a-1926-11e2-92d2-001ec947c8cc")
        public StyleTreeContentProvider() {
            super();
        }

        @objid ("85c3954c-1926-11e2-92d2-001ec947c8cc")
        @Override
        public Object[] getChildren(Object parentElement) {
            final ArrayList<NamedStyle> children = new ArrayList<>();
            final IStyle parentStyle = (IStyle) parentElement;
            final StyleManager sm = DiagramStyles.getStyleManager();
            for (final String s : sm.getAvailableStyles()) {
                if (sm.getStyle(s) != null && sm.getStyle(s).getCascadedStyle() == parentStyle) {
                    children.add(sm.getStyle(s));
                }
            }
            return children.toArray();
        }

        @objid ("85c5f771-1926-11e2-92d2-001ec947c8cc")
        @Override
        public Object[] getElements(Object inputElement) {
            final IStyle defaultStyle = DiagramStyles.getStyleManager().getDefaultStyle();
            return (defaultStyle != null) ? new Object[] { defaultStyle } : new Object[0];
        }

        @objid ("85c5f779-1926-11e2-92d2-001ec947c8cc")
        @Override
        public Object getParent(Object element) {
            return null;
        }

        @objid ("85c5f77f-1926-11e2-92d2-001ec947c8cc")
        @Override
        public boolean hasChildren(Object element) {
            final IStyle parentStyle = (IStyle) element;
            final StyleManager sm = DiagramStyles.getStyleManager();
            for (final String s : sm.getAvailableStyles()) {
                if (sm.getStyle(s) != null && sm.getStyle(s).getCascadedStyle() == parentStyle) {
                    return true;
                }
            }
            return false;
        }

        @objid ("85c5f785-1926-11e2-92d2-001ec947c8cc")
        @Override
        public void dispose() {
            // Nothing to dispose
        }

        @objid ("85c5f788-1926-11e2-92d2-001ec947c8cc")
        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            viewer.refresh();
        }

    }

    @objid ("85c5f78e-1926-11e2-92d2-001ec947c8cc")
    class StyleTreeLabelProvider extends LabelProvider {
        @objid ("85c5f78f-1926-11e2-92d2-001ec947c8cc")
        @Override
        public String getText(Object element) {
            if (element instanceof NamedStyle) {
                return ((NamedStyle) element).getName();
            } else {
                return super.getText(element);
            }
        }

    }

    @objid ("85c5f794-1926-11e2-92d2-001ec947c8cc")
    class StyleTreeSelectionChangedListener implements ISelectionChangedListener {
        @objid ("85c5f795-1926-11e2-92d2-001ec947c8cc")
        private final StyleEditorDialog styleEditorDialog;

        @objid ("85c5f797-1926-11e2-92d2-001ec947c8cc")
        public StyleTreeSelectionChangedListener(StyleEditorDialog styleEditorDialog) {
            this.styleEditorDialog = styleEditorDialog;
        }

        @objid ("85c5f79a-1926-11e2-92d2-001ec947c8cc")
        @Override
        public void selectionChanged(SelectionChangedEvent event) {
            final ISelection newSelection = event.getSelection();
            if (newSelection instanceof IStructuredSelection) {
                final Object selectedElement = ((IStructuredSelection) newSelection).getFirstElement();
                if (selectedElement instanceof IStyle) {
                    this.styleEditorDialog.setEditedStyle((IStyle) selectedElement);
                }
            }
        }

    }

    @objid ("85c5f79e-1926-11e2-92d2-001ec947c8cc")
    class StyleViewerSelectionChangedListener implements ISelectionChangedListener {
        @objid ("85c5f79f-1926-11e2-92d2-001ec947c8cc")
        private final StyleEditorDialog styleEditorDialog;

        @objid ("85c859cc-1926-11e2-92d2-001ec947c8cc")
        public StyleViewerSelectionChangedListener(final StyleEditorDialog styleEditorDialog) {
            this.styleEditorDialog = styleEditorDialog;
        }

        @objid ("85c859d0-1926-11e2-92d2-001ec947c8cc")
        @SuppressWarnings("unchecked")
        @Override
        public void selectionChanged(final SelectionChangedEvent event) {
            final ISelection newSelection = event.getSelection();
            if (newSelection instanceof IStructuredSelection) {
                final List<Object> selectedElements = ((IStructuredSelection) newSelection).toList();
                this.styleEditorDialog.styleViewerSelectionChanged(selectedElements);
            }
        }

    }

    @objid ("85cabc26-1926-11e2-92d2-001ec947c8cc")
    private static final class RestoreButtonSelectionListener implements SelectionListener {
        @objid ("85cabc28-1926-11e2-92d2-001ec947c8cc")
        private final StyleEditorDialog styleEditorDialog;

        @objid ("85cabc2a-1926-11e2-92d2-001ec947c8cc")
        public RestoreButtonSelectionListener(final StyleEditorDialog styleEditorDialog) {
            this.styleEditorDialog = styleEditorDialog;
        }

        @objid ("85cabc2e-1926-11e2-92d2-001ec947c8cc")
        @Override
        public void widgetDefaultSelected(final SelectionEvent e) {
            // do nothing
        }

        @objid ("85cabc33-1926-11e2-92d2-001ec947c8cc")
        @Override
        public void widgetSelected(final SelectionEvent event) {
            StyleEditPanelUIData data = (StyleEditPanelUIData) this.styleEditorDialog.styleEditPanel.getInput();
            final IStyle editedStyle = data.getStyleData();
            final ISelection newSelection = this.styleEditorDialog.styleViewer.getSelection();
            if (newSelection instanceof IStructuredSelection) {
                for (final Object o : ((IStructuredSelection) newSelection).toList()) {
                    if (o instanceof StyleKey) {
                        editedStyle.removeProperty((StyleKey) o);
                    }
                }
            }
        }

    }

}
