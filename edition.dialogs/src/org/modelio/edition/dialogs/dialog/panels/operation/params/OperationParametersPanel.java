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
                                    

package org.modelio.edition.dialogs.dialog.panels.operation.params;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.KTableCellSelectionListener;
import de.kupzog.ktable.SWTX;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.modelio.edition.dialogs.dialog.panels.operation.IOperationPropertyModel;
import org.modelio.edition.dialogs.dialog.panels.operation.OperationModel;
import org.modelio.edition.dialogs.plugin.EditionDialogs;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.ui.UIImages;
import org.modelio.ui.panel.IPanelProvider;

@objid ("45eb4159-1cae-4674-a4c2-6b2937b1a0e4")
public class OperationParametersPanel implements IPanelProvider {
    @objid ("e1697af3-bef1-4d54-93db-99c023c97089")
    private OperationModel opModel;

    @objid ("0d16d15a-f9eb-4635-8117-407cc2a7e5aa")
    private Composite container;

    @objid ("b89d81ff-a02b-4ab8-a0b1-e83183626498")
    private KTable parametersTable;

    @objid ("7e853cb0-9f37-4e87-b636-6b628ef1009a")
    private Button addButton;

    @objid ("bf5dba0f-8477-41db-ae0c-e3ec418f99a9")
     Button removeButton;

    @objid ("f75e8e48-4b31-4ea5-b3d4-e911f3ed7b47")
     Button moveUpButton;

    @objid ("10300d44-c8cd-4151-9086-988c5971ffaf")
     Button moveDownButton;

    @objid ("f54a3ef9-d532-4722-bf89-18bf08b5a725")
    @Override
    public Object createPanel(Composite parent) {
        this.container = new Composite(parent, SWT.BORDER);
        final GridLayout gl_parametersArea = new GridLayout(1, false);
        gl_parametersArea.marginHeight = 0;
        gl_parametersArea.marginWidth = 0;
        gl_parametersArea.marginRight = 3;
        this.container.setLayout(gl_parametersArea);
        
        final Composite labelArea = new Composite(this.container, SWT.BORDER);
        final GridLayout gl_labelArea = new GridLayout(5, false);
        gl_labelArea.marginHeight = 0;
        gl_labelArea.marginWidth = 5;
        labelArea.setLayout(gl_labelArea);
        final GridData gdLabelArea = new GridData(SWT.FILL, SWT.CENTER, true, false);
        labelArea.setLayoutData(gdLabelArea);
        
        final Label parametersPropertiesLabel = new Label(labelArea, SWT.NO_REDRAW_RESIZE);
        parametersPropertiesLabel.setText(EditionDialogs.I18N.getString("OperationEditPanel.opParameters"));
        final GridData gdParametersPropertiesLabel = new GridData(SWT.FILL, SWT.CENTER, true, false);
        parametersPropertiesLabel.setLayoutData(gdParametersPropertiesLabel);
        
        // The Add parameter button
        this.addButton = new Button(labelArea, SWT.NONE);
        this.addButton.setImage(UIImages.ADD);
        this.addButton.setEnabled(true);
        GridData gd = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
        this.addButton.setLayoutData(gd);
        this.addButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                addParameter();
            }
        
        });
        
        // The Remove parameter button
        this.removeButton = new Button(labelArea, SWT.NONE);
        this.removeButton.setImage(UIImages.DELETE);
        this.removeButton.setEnabled(false);
        gd = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
        this.removeButton.setLayoutData(gd);
        this.removeButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                removeSelectedParameters();
            }
        
        });
        
        // The move parameter up button
        this.moveUpButton = new Button(labelArea, SWT.NONE);
        this.moveUpButton.setImage(UIImages.UPARROW);
        this.moveUpButton.setEnabled(false);
        gd = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
        this.moveUpButton.setLayoutData(gd);
        this.moveUpButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                moveUpSelectedParameters();
            }
        
        });
        
        // The move parameter down button
        this.moveDownButton = new Button(labelArea, SWT.NONE);
        this.moveDownButton.setImage(UIImages.DOWNARROW);
        this.moveDownButton.setEnabled(false);
        gd = new GridData(SWT.RIGHT, SWT.CENTER, false, false);
        this.moveDownButton.setLayoutData(gd);
        this.moveDownButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                moveDownSelectedParameters();
            }
        
        });
        
        // The parameters table itself
        this.parametersTable = new KTable(this.container, SWTX.AUTO_SCROLL | SWTX.FILL_WITH_LASTCOL | SWT.MULTI | SWT.FLAT
                | SWT.BORDER);
        
        final ParameterTableListener parameterTableListener = new ParameterTableListener(this);
        this.parametersTable.addCellSelectionListener(parameterTableListener);
        this.parametersTable.addKeyListener(parameterTableListener);
        
        gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.parametersTable.setLayoutData(gd);
        return this.container;
    }

    @objid ("34fd7c27-9d5d-4eba-83d6-251e8e8de620")
    @Override
    public Object getPanel() {
        return this.container;
    }

    @objid ("f23dec76-17f7-455e-b13b-0600c192ca39")
    @Override
    public void setInput(Object input) {
        if (input instanceof OperationModel) {
            this.opModel = (OperationModel) input;
        
            final ParameterPropertyModel parameterPropertyModel = new ParameterPropertyModel(this.opModel);
            final KTableParameterModel parameterKTableModel = new KTableParameterModel(this.parametersTable, parameterPropertyModel);
            this.parametersTable.setModel(parameterKTableModel);
        
        } else {
            this.opModel = null;
            this.parametersTable.setModel(null);
        }
        
        setReadOnly(this.opModel != null && !this.opModel.isModifiable());
    }

    @objid ("b52eca23-74c6-4f49-afbc-bdc86f9bc2f8")
    @Override
    public Object getInput() {
        return this.opModel;
    }

    @objid ("35466d65-d706-48b7-b7ce-d011e7f4089a")
    IOperationPropertyModel getOperationModel() {
        return this.opModel;
    }

    @objid ("e7c67f8a-e9cd-4b78-8614-0d5491f6fc14")
    void editCell(int col, int row) {
        this.parametersTable.setSelection(col, row, true);
        this.parametersTable.openEditorInFocus();
    }

    @objid ("05c8302a-c030-473f-a2e1-bbc5618ff99b")
    List<Parameter> getSelectedParameters() {
        final List<Parameter> selectedParameters = new ArrayList<>();
        
        final Point[] points = this.parametersTable.getCellSelection();
        
        final List<Integer> selectedLines = new ArrayList<>();
        
        for (final Point point : points) {
            if (!selectedLines.contains(point.y)) {
                selectedLines.add(point.y);
            }
        }
        
        // Collections.sort(selectedLines);
        Parameter parameter = null;
        
        for (final int selectedLine : selectedLines) {
            if (selectedLine > 1) {
                // selectedLine - 2 because line 0 is the header line and
                // line 1 is the return parameter.
                parameter = this.opModel.getParameter(selectedLine - 2);
                if (parameter != null && !selectedParameters.contains(parameter)) {
                    selectedParameters.add(parameter);
                }
            }
        }
        return selectedParameters;
    }

    @objid ("7b6697a7-0d8a-42c9-8558-143d44478f12")
    void selectLastParameterRow() {
        final int row = this.opModel.getIOParameterSize() + 1;
        
        final Point[] selection = { new Point(1, row), new Point(2, row), new Point(3, row), new Point(4, row), new Point(5, row) };
        this.parametersTable.setSelection(selection, false);
    }

    @objid ("c7d7d3d9-dbfe-4a63-93a9-7455569c9432")
    void clearParametersSelection() {
        this.parametersTable.clearSelection();
    }

    @objid ("de6e6c65-2973-474e-a90d-bc50b23f4483")
    void selectParameterRow(int row) {
        final Point[] selection = { new Point(1, row), new Point(2, row), new Point(3, row), new Point(4, row), new Point(5, row) };
        this.parametersTable.setSelection(selection, false);
    }

    @objid ("36d65254-afef-4ba7-af10-76337e13cd1c")
    void selectParameters(List<Parameter> selectedParameters) {
        int index = -1;
        
        for (final Parameter parameter : selectedParameters) {
            index = this.opModel.getParameterIndex(parameter);
            if (index != -1) {
                selectParameterRow(index + 2);
            }
        }
    }

    @objid ("e69e8154-7f2c-4214-a4db-662087260e83")
    void update() {
        this.parametersTable.redraw();
    }

    @objid ("ce854905-daf7-481e-aaa5-4f9b04b7061e")
    private void setReadOnly(boolean ro) {
        this.addButton.setEnabled(!ro);
        this.moveDownButton.setEnabled(!ro);
        this.moveUpButton.setEnabled(!ro);
        this.parametersTable.setEnabled(!ro);
        this.removeButton.setEnabled(!ro);
    }

    @objid ("841bdf05-2957-4ec7-9433-3803d7e9c446")
    void addParameter() {
        getOperationModel().addParameter();
        final int paramNumber = this.getOperationModel().getIOParameterSize();
        // paramNumber + 1 because the first parameter displayed is the return
        // parameter.
        editCell(1, paramNumber + 1);
    }

    @objid ("a44982ed-1691-4bfd-8cae-fff4004735db")
    void moveDownSelectedParameters() {
        final List<Parameter> selectedParameters = getSelectedParameters();
        this.opModel.moveParametersDown(selectedParameters);
        clearParametersSelection();
        // this.panel.refresh();
        selectParameters(selectedParameters);
    }

    @objid ("7a1c9d9e-2adc-401d-bd82-386bb6d9e80d")
    void moveUpSelectedParameters() {
        final List<Parameter> selectedParameters = getSelectedParameters();
        this.opModel.moveParametersUp(selectedParameters);
        clearParametersSelection();
        // this.panel.refresh();
        selectParameters(selectedParameters);
    }

    @objid ("12b29b49-f601-4c11-916a-95fe550e27c8")
    void removeSelectedParameters() {
        final List<Parameter> parameters = getSelectedParameters();
        this.opModel.removeParameter(parameters);
        
        update();
        
        if (getSelectedParameters().size() == 0) {
            selectLastParameterRow();
        }
    }

    @objid ("1e020e94-21d2-4ffb-adf7-a70211984176")
    @Override
    public boolean isRelevantFor(Object obj) {
        return true;
    }

    @objid ("db2ab7eb-3212-478a-b2a7-7f191e68ab1d")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("3bc6075a-4bc0-4e4d-8b22-59bddbbd7be7")
    @Override
    public void dispose() {
        // nothing to do
    }

    @objid ("aa64d8ab-b688-4dc7-a46a-00f83c6f4867")
    public class ParameterTableListener extends KeyAdapter implements KTableCellSelectionListener {
        @objid ("c0651960-5b8a-43c3-bb95-908adcbd4888")
        private OperationParametersPanel panel = null;

        @objid ("302974f1-92e9-4c0a-b5ed-16bfe9cad39c")
        public ParameterTableListener(OperationParametersPanel panel) {
            this.panel = panel;
        }

        @objid ("aa981f6f-52d1-408c-b918-a19daf26dfa9")
        @Override
        public void cellSelected(int col, int row, int statemask) {
            if (col == 0) {
                this.panel.selectParameterRow(row);
            }
            
            if (this.panel.getSelectedParameters().size() > 0) {
                this.panel.removeButton.setEnabled(this.panel.getOperationModel().isModifiable());
            } else {
                this.panel.removeButton.setEnabled(false);
            }
            
            if (this.panel.getSelectedParameters().size() > 0 && this.panel.getOperationModel().getIOParameterSize() > 1) {
                this.panel.moveUpButton.setEnabled(this.panel.getOperationModel().isModifiable());
                this.panel.moveDownButton.setEnabled(this.panel.getOperationModel().isModifiable());
            } else {
                this.panel.moveUpButton.setEnabled(false);
                this.panel.moveDownButton.setEnabled(false);
            }
        }

        @objid ("16e67c0b-cf82-4b4c-9a19-5df900c9882f")
        @Override
        public void fixedCellSelected(int col, int row, int statemask) {
        }

        @objid ("9c7d45ea-c17f-4084-aba1-18cbf161480d")
        @Override
        public void keyReleased(KeyEvent event) {
            if (event.keyCode == SWT.DEL) {
                removeSelectedParameters();
            } else if (event.keyCode == 'u' && (event.stateMask & SWT.CTRL) != 0 || event.keyCode == 'U'
                    && (event.stateMask & SWT.CTRL) != 0) {
                moveUpSelectedParameters();
            } else if (event.keyCode == 'd' && (event.stateMask & SWT.CTRL) != 0 || event.keyCode == 'D'
                    && (event.stateMask & SWT.CTRL) != 0) {
                moveDownSelectedParameters();
            }
        }

    }

}
