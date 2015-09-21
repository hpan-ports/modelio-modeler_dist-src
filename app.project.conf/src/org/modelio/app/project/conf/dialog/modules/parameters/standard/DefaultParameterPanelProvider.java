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


package org.modelio.app.project.conf.dialog.modules.parameters.standard;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.modelio.api.module.IModule;
import org.modelio.api.module.IParameterGroupModel;
import org.modelio.api.module.IParameterModel;
import org.modelio.app.project.conf.plugin.AppProjectConf;
import org.modelio.ui.UIColor;
import org.modelio.ui.panel.IPanelProvider;

@objid ("37ae6a97-2dd6-4712-9b25-defc143cd60d")
public class DefaultParameterPanelProvider implements IPanelProvider {
    @objid ("a741094f-33f6-11e2-a514-002564c97630")
    protected TreeViewer parameterViewer;

    @objid ("6676430f-00ad-4e19-a9ce-92091ff287aa")
    protected Composite compo;

    @objid ("2ad48f2d-8ffb-43b1-bf13-5670fa6b515e")
    protected Text descriptionLabel;

    @objid ("8503c940-2e04-408f-867e-b306e02c42b1")
    @Override
    public Control createPanel(Composite parent) {
        this.compo = new Composite(parent, SWT.NONE);
        this.compo.setLayout(new GridLayout());
        
        this.parameterViewer = new TreeViewer(this.compo, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
        this.parameterViewer.getTree().setHeaderVisible(true);
        this.parameterViewer.getTree().setLinesVisible(true);
        
        // Create columns
        String[] columnTitles = { AppProjectConf.I18N.getMessage("ParameterSection.NameColumn"),  AppProjectConf.I18N.getMessage("ParameterSection.ValueColumn"), AppProjectConf.I18N.getMessage("ParameterSection.ScopeColumn")}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        int[] columnInitialWidths = { 300, 500,  100};
        TreeViewerColumn col1 = createTreeViewerColumn(this.parameterViewer, columnTitles[0], columnInitialWidths[0]);
        col1.setLabelProvider(new NameLabelProvider());
        
        TreeViewerColumn col2 = createTreeViewerColumn(this.parameterViewer, columnTitles[1], columnInitialWidths[1]);
        col2.setLabelProvider(new ValueLabelProvider());
        col2.setEditingSupport(new ParametersEditingSupport(this.parameterViewer));
        
        TreeViewerColumn col3 = createTreeViewerColumn(this.parameterViewer, columnTitles[2], columnInitialWidths[2]);
        col3.setLabelProvider(new ScopeLabelProvider());
        
        this.parameterViewer.setContentProvider(new ParametersContentProvider());
        this.parameterViewer.setAutoExpandLevel(2);
        this.parameterViewer.setInput(null);
        GridData gd1 = new GridData(SWT.FILL, SWT.FILL, true, true);
        this.parameterViewer.getTree().setLayoutData(gd1);
        
        this.descriptionLabel = new Text(this.compo, SWT.WRAP);
        this.descriptionLabel.setForeground(UIColor.LABEL_TIP_FG);
        GridData gd2 = new GridData(SWT.FILL, SWT.FILL, true, false);
        gd2.heightHint = 60;
        this.descriptionLabel.setLayoutData(gd2);
        
        addParameterDescriptionSectionUpdater();
        return this.compo;
    }

    @objid ("f717767c-3a39-11e2-90eb-002564c97630")
    private static TreeViewerColumn createTreeViewerColumn(TreeViewer viewer, String title, int bound) {
        final TreeViewerColumn column = new TreeViewerColumn(viewer, SWT.CENTER);
        column.getColumn().setText(title);
        column.getColumn().setWidth(bound);
        column.getColumn().setResizable(true);
        column.getColumn().setMoveable(true);
        return column;
    }

    @objid ("1ee7c435-6ff9-4a67-970c-e2693c9f452e")
    @Override
    public Control getPanel() {
        return this.compo;
    }

    @objid ("012e25a5-7037-4bcb-bfa3-7604b3eb38d2")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("ee49a683-ba97-404a-bfde-8aebe0928c11")
    @Override
    public Object getInput() {
        return this.parameterViewer.getInput();
    }

    @objid ("9114cbde-7fb0-462f-9ff4-d103e7d007f2")
    @Override
    public void setInput(Object input) {
        this.parameterViewer.setInput(input);
        if (input instanceof Collection<?>) {
            final IModule module = (IModule) ((Collection<?>)input).toArray()[0];
            this.descriptionLabel.setText(module.getDescription());
        }
    }

    @objid ("e143b5d5-e29a-42ad-94fd-4ab4e91666be")
    @Override
    public void dispose() {
        this.parameterViewer.getTree().dispose();
        this.parameterViewer = null;
        this.compo.dispose();
        this.compo = null;
    }

    /**
     * Panel is relevant when input is a module with at least one parameter.
     */
    @objid ("7a446e21-cefa-42a5-bd83-f6fd9ec4b683")
    @Override
    public boolean isRelevantFor(Object input) {
        return input instanceof IModule && !((IModule)input).getConfiguration().getParameters().isEmpty();
    }

    /**
     * Add parameter section updater
     * When selection change in the section, the description label text will be updated
     * @param descriptionLabel
     * @param parameterViewer
     */
    @objid ("abaf6b83-2a46-4049-adcb-ff38a18a35ed")
    private void addParameterDescriptionSectionUpdater() {
        this.parameterViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                // Reset description
                DefaultParameterPanelProvider.this.descriptionLabel.setText(""); //$NON-NLS-1$
        
                ISelection selection = event.getSelection();
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                    if (structuredSelection.size() == 1) {
                        Object obj = structuredSelection.getFirstElement();
        
                        if (obj instanceof IParameterModel) {
                            // Fill the module's description
                            IParameterModel param = (IParameterModel) obj;
        
                            DefaultParameterPanelProvider.this.descriptionLabel.setText(param.getDescription());
                            return;
                        } else if (obj instanceof IParameterGroupModel) {
                            // No description
                            return;
                        }
                    }
                }
                // Any other case, use module description
                final Object input = DefaultParameterPanelProvider.this.parameterViewer.getInput();
                if (input instanceof Collection<?>) {
                    final IModule module = (IModule) ((Collection<?>)input).toArray()[0];
                    DefaultParameterPanelProvider.this.descriptionLabel.setText(module.getDescription());
                }
            }
        });
    }

}
