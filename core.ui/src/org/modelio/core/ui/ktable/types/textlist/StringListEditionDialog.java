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
                                    

package org.modelio.core.ui.ktable.types.textlist;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.modelio.core.ui.dialog.ModelioDialog;
import org.modelio.core.ui.plugin.CoreUi;
import org.modelio.ui.UIImages;
import org.osgi.framework.Bundle;

/**
 * This class displays the results of a search for model elements (see Searcher
 * class). The found elements are proposed to the end user in a list where he
 * can select the element of his choice. Each time the user selects a different
 * element in the list a NAVIGATION event is fired. Along with the results, the
 * dialog displays the current regular expression that produced the results.
 * This expression can be modified leading to an update of the displayed
 * results. This allows for search refinement when many elements have been
 * found.
 */
@objid ("8dcd99b0-c068-11e1-8c0a-002564c97630")
public class StringListEditionDialog extends ModelioDialog {
    @objid ("a5152245-c068-11e1-8c0a-002564c97630")
    private String title = "";

    @objid ("a517838e-c068-11e1-8c0a-002564c97630")
    private String message = "";

    @objid ("a5178392-c068-11e1-8c0a-002564c97630")
    private String detailedMessage = "";

    @objid ("8dcf2028-c068-11e1-8c0a-002564c97630")
    private int size = 0;

    @objid ("cb016f07-269e-4413-9233-94af37110107")
    private static final String HELP_TOPIC = "/org.modelio.documentation.modeler/html/Index.html";

    @objid ("8dcd99b2-c068-11e1-8c0a-002564c97630")
    private List<StringAdapter> content = null;

    @objid ("8dcd99b5-c068-11e1-8c0a-002564c97630")
    private TableViewer contentTable = null;

    @objid ("8dcd99b8-c068-11e1-8c0a-002564c97630")
    private StringListCellEditor editor = null;

    @objid ("8dcd99b9-c068-11e1-8c0a-002564c97630")
    private Button addParameterButton = null;

    @objid ("8dcd99ba-c068-11e1-8c0a-002564c97630")
    private Button removeParameterButton = null;

    @objid ("8dcd99bb-c068-11e1-8c0a-002564c97630")
    private IStringListValidator editionValidator = null;

    @objid ("8dcd99bd-c068-11e1-8c0a-002564c97630")
    private StringAdapterModifier stringAdapterModifier = null;

    @objid ("8dcd99be-c068-11e1-8c0a-002564c97630")
    private Text addStringText = null;

    @objid ("8dcf2025-c068-11e1-8c0a-002564c97630")
    private StringTextListener stringTextListener = null;

    @objid ("8dcf2029-c068-11e1-8c0a-002564c97630")
    private ContentTableListener contentTableListener = null;

    @objid ("8dcf202c-c068-11e1-8c0a-002564c97630")
    private Button moveUpParameterButton = null;

    @objid ("8dcf202d-c068-11e1-8c0a-002564c97630")
    private Button moveDownParameterButton = null;

    @objid ("8dcf202e-c068-11e1-8c0a-002564c97630")
    private AddButtonListener addButtonListener = null;

    @objid ("8dcf202f-c068-11e1-8c0a-002564c97630")
    private MoveUpButtonListener moveUpButtonListener = null;

    @objid ("8dcf2030-c068-11e1-8c0a-002564c97630")
    private MoveDownButtonListener moveDownButtonListener = null;

    @objid ("8dcf2031-c068-11e1-8c0a-002564c97630")
    private RemoveButtonListener removeButtonListener = null;

    @objid ("23381fa8-6b4d-438c-a2ef-d5c9c6b16389")
    protected static StringListEditionDialog instance;

    @objid ("8dcf2032-c068-11e1-8c0a-002564c97630")
    private StringListEditionDialog(Shell parentShell, String title, String message, int size, String detailedMessage, StringListCellEditor editor, List<String> initialContent, IStringListValidator editionValidator) {
        super(parentShell);
        this.title = title;
        this.message = message;
        this.size = size;
        this.detailedMessage = detailedMessage;
        this.content = initContent(initialContent);
        this.editor = editor;
        this.editionValidator = editionValidator;
    }

    @objid ("8dcf203e-c068-11e1-8c0a-002564c97630")
    public void addAdapter(StringAdapter adapter) {
        this.content.add(adapter);
        refresh();
    }

    @objid ("8dcf2041-c068-11e1-8c0a-002564c97630")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    @objid ("8dcf2045-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean close() {
        if (this.moveUpButtonListener != null) {
            this.moveUpParameterButton.removeSelectionListener(this.moveUpButtonListener);
            this.moveUpButtonListener = null;
        }
        
        if (this.moveDownButtonListener != null) {
            this.moveDownParameterButton.removeSelectionListener(this.moveDownButtonListener);
            this.moveDownButtonListener = null;
        }
        
        if (this.removeButtonListener != null) {
            this.removeParameterButton.removeSelectionListener(this.removeButtonListener);
            this.removeParameterButton = null;
        }
        
        if (this.addButtonListener != null) {
            this.addParameterButton.removeSelectionListener(this.addButtonListener);
            this.addButtonListener = null;
        }
        
        if (this.stringTextListener != null) {
            this.addStringText.removeModifyListener(this.stringTextListener);
            this.addStringText.removeKeyListener(this.stringTextListener);
            this.stringTextListener = null;
        }
        
        if (this.contentTableListener != null) {
            this.contentTable.removeSelectionChangedListener(this.contentTableListener);
            this.contentTable.getTable().removeKeyListener(this.contentTableListener);
            this.contentTable.getTable().removeControlListener(this.contentTableListener);
            this.contentTableListener = null;
        }
        
        if (this.equals(instance)) { // should always be the case, could be an assert!
            instance = null;
        }
        return super.close();
    }

    @objid ("8dcf204a-c068-11e1-8c0a-002564c97630")
    @Override
    public Control createContentArea(Composite parent) {
        Composite area = new Composite(parent, 0);
        area.setLayout(new GridLayout(2, false));
        area.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        area.setFont(parent.getFont());
        
        createDetailedText(area);
        createListField(area);
        createListButtons(area);
        createAddStringField(area);
        
        initListeners();
        
        getShell().pack();
        return area;
    }

    @objid ("8dcf2050-c068-11e1-8c0a-002564c97630")
    public Button getAddParameterButton() {
        return this.addParameterButton;
    }

    @objid ("8dcf2054-c068-11e1-8c0a-002564c97630")
    public Text getAddStringText() {
        return this.addStringText;
    }

    @objid ("8dcf2058-c068-11e1-8c0a-002564c97630")
    public TableViewer getContentTable() {
        return this.contentTable;
    }

    @objid ("8dcf205c-c068-11e1-8c0a-002564c97630")
    public Button getMoveDownParameterButton() {
        return this.moveDownParameterButton;
    }

    @objid ("8dd0a6c5-c068-11e1-8c0a-002564c97630")
    public Button getMoveUpParameterButton() {
        return this.moveUpParameterButton;
    }

    @objid ("8dd0a6c9-c068-11e1-8c0a-002564c97630")
    public Button getRemoveParameterButton() {
        return this.removeParameterButton;
    }

    @objid ("8dd0a6cd-c068-11e1-8c0a-002564c97630")
    @SuppressWarnings("unchecked")
    public List<StringAdapter> getSelectedAdapters() {
        IStructuredSelection structuredSelection = (IStructuredSelection)this.contentTable.getSelection();
        return structuredSelection.toList();
    }

    @objid ("8dd0a6d4-c068-11e1-8c0a-002564c97630")
    @Override
    public void init() {
        setLogoImage(null);
        
        getShell().setText(this.title);
        setTitle(this.title);
        setMessage(this.message);
        
        Point minSize = new Point(440,300);
        getShell().setMinimumSize(minSize);
    }

    @objid ("8dd0a6d7-c068-11e1-8c0a-002564c97630")
    public void moveDown(List<StringAdapter> adapters) {
        // We first move down the Last element of the list; This way the positions of other
        // selected elements are not affected by the move of the current element.
        for (int i = adapters.size() - 1; i > -1; i--) {
            StringAdapter adapter = adapters.get(i);
            
            // Retrieve the new index of the element
            int index = getIndexDown(adapter, this.content);
            
            if (index != -1) {
                // Move the element in the list 
                this.content.remove(adapter);
                this.content.add(index, adapter);
            } else {
                break;
            }
        }
        
        refresh();
    }

    @objid ("8dd0a6dc-c068-11e1-8c0a-002564c97630")
    public void moveUp(List<StringAdapter> adapters) {
        for (StringAdapter adapter : adapters) {
            int index = getIndexUp(adapter, this.content);
        
            if (index != -1) {
                this.content.remove(adapter);
                this.content.add(index, adapter);
            } else {
                break;
            }
        }
        
        this.refresh();
    }

    @objid ("8dd0a6e1-c068-11e1-8c0a-002564c97630")
    @Override
    public int open() {
        return super.open();
    }

    @objid ("8dd0a6e6-c068-11e1-8c0a-002564c97630")
    public void refresh() {
        this.contentTable.setInput(this.content);
        
        if (this.size != -1) {
            this.addStringText.setEnabled(this.content.size() < this.size);
        }
    }

    @objid ("8dd0a6e8-c068-11e1-8c0a-002564c97630")
    public void removeAdapters(List<StringAdapter> adapters) {
        for (StringAdapter adapter : adapters) {
            this.content.remove(adapter);
        }
        refresh();
    }

    @objid ("8dd0a6ed-c068-11e1-8c0a-002564c97630")
    @Override
    protected void cancelPressed() {
        this.editor.closeEditor(false);
        super.cancelPressed();
    }

    @objid ("8dd0a6f0-c068-11e1-8c0a-002564c97630")
    protected static Image getBundleImage(String relativePath) {
        Bundle imageBundle = Platform.getBundle(CoreUi.PLUGIN_ID);
        IPath bitmapPath = new Path(relativePath);
        URL bitmapUrl = FileLocator.find(imageBundle, bitmapPath, null);
        ImageDescriptor desc = ImageDescriptor.createFromURL(bitmapUrl);
        return desc.createImage();
    }

    @objid ("8dd0a6f5-c068-11e1-8c0a-002564c97630")
    @Override
    protected void okPressed() {
        List<String> values = getValues(this.content);
        this.editionValidator.validate(values);
        this.editor.closeEditor(true);
        super.okPressed();
    }

    @objid ("8dd0a6f8-c068-11e1-8c0a-002564c97630")
    private void createAddStringField(Composite area) {
        this.addStringText = new Text(area, SWT.BORDER);
        if (this.size != -1) {
            this.addStringText.setEnabled(this.content.size() < this.size);
        }
        GridData gd_addStringText = new GridData(SWT.FILL, SWT.FILL, true, false);
        this.addStringText.setLayoutData(gd_addStringText);
        this.addStringText.forceFocus();
        
        this.addParameterButton = new Button(area, SWT.PUSH);
        this.addParameterButton.setImage(UIImages.ADD);
        this.addParameterButton.setEnabled(false);
        GridData gd_addParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        this.addParameterButton.setLayoutData(gd_addParameterButton);
    }

    @objid ("8dd0a6fb-c068-11e1-8c0a-002564c97630")
    private void createDetailedText(Composite area) {
        if (this.detailedMessage != null && !this.detailedMessage.equals("")) {
            Label detailText = new Label(area, SWT.NONE);
            detailText.setText(this.detailedMessage);
            GridData gd_detailText = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
            gd_detailText.horizontalIndent = 3;
            detailText.setLayoutData(gd_detailText);
        }
    }

    @objid ("8dd0a6fe-c068-11e1-8c0a-002564c97630")
    private void createListButtons(Composite area) {
        Composite buttonsComposite = new Composite(area, SWT.NONE);
        GridLayout gl_buttonComposite = new GridLayout(1, false);
        gl_buttonComposite.marginWidth = 0;
        gl_buttonComposite.marginHeight = 0;
        buttonsComposite.setLayout(gl_buttonComposite);
        GridData gd_buttonsComposite = new GridData(SWT.LEFT, SWT.TOP, false, false);
        buttonsComposite.setLayoutData(gd_buttonsComposite);
        
        this.moveUpParameterButton = new Button(buttonsComposite, SWT.PUSH);
        this.moveUpParameterButton.setImage(UIImages.UPARROW);
        this.moveUpParameterButton.setEnabled(false);
        GridData gd_moveUpParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        this.moveUpParameterButton.setLayoutData(gd_moveUpParameterButton);
        
        this.moveDownParameterButton = new Button(buttonsComposite, SWT.PUSH);
        this.moveDownParameterButton.setImage(UIImages.DOWNARROW);
        this.moveDownParameterButton.setEnabled(false);
        GridData gd_moveDownParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        this.moveDownParameterButton.setLayoutData(gd_moveDownParameterButton);
        
        this.removeParameterButton = new Button(buttonsComposite, SWT.PUSH);
        this.removeParameterButton.setImage(UIImages.DELETE);
        this.removeParameterButton.setEnabled(false);
        GridData gd_removeParameterButton = new GridData(SWT.LEFT, SWT.TOP, false, false);
        this.removeParameterButton.setLayoutData(gd_removeParameterButton);
    }

    @objid ("8dd22d65-c068-11e1-8c0a-002564c97630")
    private void createListField(Composite area) {
        this.contentTable = new TableViewer(area);
        
        String columnNames[] = {"Value"};
        
        TableColumn column0 = new TableColumn(this.contentTable.getTable(), SWT.LEFT, 0);
        column0.setWidth(150);
        
        this.contentTable.setColumnProperties(columnNames);
        
        this.contentTable.setContentProvider(new StringListContentProvider());
        this.contentTable.setLabelProvider(new StringListLabelProvider());
        
        initEditor();
        
        this.contentTable.setInput(this.content);
        GridData gd_contentTree = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.contentTable.getControl().setLayoutData(gd_contentTree);
    }

    @objid ("8dd22d68-c068-11e1-8c0a-002564c97630")
    private static int getIndexDown(StringAdapter adapter, List<StringAdapter> list) {
        int index = list.indexOf(adapter);
        
        if (index == -1) {
            return -1;
        }
        
        index++;
        
        if (index >= list.size()) {
            return -1;
        }
        return index;
    }

    @objid ("8dd22d70-c068-11e1-8c0a-002564c97630")
    private static int getIndexUp(StringAdapter adapter, List<StringAdapter> list) {
        int index = list.indexOf(adapter);
        
        if (index < 1) {
            return -1;
        }
        
        index--;
        return index;
    }

    @objid ("8dd22d78-c068-11e1-8c0a-002564c97630")
    private static List<String> getValues(List<StringAdapter> adapters) {
        List<String> values = new ArrayList<>();
        for (StringAdapter adapter : adapters) {
            values.add(adapter.getValue());
        }
        return values;
    }

    @objid ("8dd22d81-c068-11e1-8c0a-002564c97630")
    private static List<StringAdapter> initContent(List<String> values) {
        List<StringAdapter> adapters = new ArrayList<>();
        for (String value : values) {
            adapters.add(new StringAdapter(value));
        }
        return adapters;
    }

    @objid ("8dd22d8a-c068-11e1-8c0a-002564c97630")
    private void initEditor() {
        // Define cell editor:
        //--------------------
        TextCellEditor[] cellEditors = new TextCellEditor[1];
        cellEditors[0]  = new TextCellEditor(this.contentTable.getTable(), SWT.NONE);
        this.contentTable.setCellEditors(cellEditors);
        
        // Define ICellModifier:
        //----------------------
        String[] properties = new String[1];
        properties[0] = "name";
        this.contentTable.setColumnProperties(properties);
        
        this.stringAdapterModifier = new StringAdapterModifier(this);
        this.contentTable.setCellModifier(this.stringAdapterModifier);
        this.contentTable.getTable().addKeyListener(this.stringAdapterModifier);
        
        // Define editor activation strategy:
        //-----------------------------------
        StringAdapterEditorActivationStrategy actSupport = new StringAdapterEditorActivationStrategy(this.contentTable);
        
        TableViewerEditor.create(this.contentTable, null, actSupport, ColumnViewerEditor.TABBING_HORIZONTAL
                | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
                | ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
    }

    @objid ("8dd22d8c-c068-11e1-8c0a-002564c97630")
    private void initListeners() {
        this.contentTableListener = new ContentTableListener(this);
        this.contentTable.addSelectionChangedListener(this.contentTableListener);
        this.contentTable.getTable().addKeyListener(this.contentTableListener);
        this.contentTable.getTable().addControlListener(this.contentTableListener);
        
        this.moveUpButtonListener = new MoveUpButtonListener(this);
        this.moveUpParameterButton.addSelectionListener(this.moveUpButtonListener);
        
        this.moveDownButtonListener = new MoveDownButtonListener(this);
        this.moveDownParameterButton.addSelectionListener(this.moveDownButtonListener);
        
        this.removeButtonListener = new RemoveButtonListener(this);
        this.removeParameterButton.addSelectionListener(this.removeButtonListener);
        
        this.addButtonListener = new AddButtonListener(this);
        this.addParameterButton.addSelectionListener(this.addButtonListener);
        
        this.stringTextListener = new StringTextListener(this);
        this.addStringText.addModifyListener(this.stringTextListener);
        this.addStringText.addKeyListener(this.stringTextListener);
    }

    @objid ("ea6da17a-15ca-46bb-8d09-8cde66ee1daa")
    @Override
    protected String getHelpId() {
        return HELP_TOPIC;
    }

    @objid ("ddd79991-ab0b-4f31-aaac-72d7c832f3b4")
    public static StringListEditionDialog getInstance(Shell parentShell, String title, String message, int size, String detailedMessage, StringListCellEditor editor, List<String> initialContent, IStringListValidator editionValidator) {
        if (parentShell == null)
            return null;
        
        if (instance != null) {
            return instance;
        }
        
        instance = new StringListEditionDialog(parentShell, title, message, size, detailedMessage, editor, initialContent, editionValidator);
        return instance;
    }

    @objid ("8c16dbfe-3584-4a1f-88d1-8369e5be5e18")
    public static void closeInstance() {
        if (instance != null) {
            Display.getDefault().asyncExec(new Runnable() {        
                @Override
                public void run() {
                    instance.close();
                }
            });
        }
    }

}
