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


package org.modelio.diagram.browser.view;

import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.modelio.app.core.navigate.IModelioNavigationService;
import org.modelio.diagram.browser.dnd.DiagramBrowserDragListener;
import org.modelio.diagram.browser.dnd.DiagramBrowserDropListener;
import org.modelio.diagram.browser.model.IBrowserModel;
import org.modelio.gproject.gproject.GProject;
import org.modelio.ui.panel.IPanelProvider;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("85b4d950-54b9-11e2-85c1-002564c97630")
public class DiagramBrowserPanelProvider implements IPanelProvider {
    @objid ("000c9e64-0d4f-10c6-842f-001ec947cd2a")
    private ITreeViewerListener expandlistener;

    @objid ("0050759e-3566-10c7-842f-001ec947cd2a")
    protected TreeViewer treeViewer;

    @objid ("2868673c-4ab5-11e2-a4d3-002564c97630")
    private IBrowserModel model;

    @objid ("85b73aae-54b9-11e2-85c1-002564c97630")
    private GProject project;

    @objid ("cd4213ed-54c7-11e2-ae63-002564c97630")
    private DiagramBrowserActivationStrategy actSupport;

    @objid ("2d869639-093d-4d24-8c7c-60165606f245")
    protected final IModelioNavigationService navigationService;

    @objid ("85b73aaf-54b9-11e2-85c1-002564c97630")
    public DiagramBrowserPanelProvider(GProject project, IModelioNavigationService navigationService) {
        this.project = project;
        this.navigationService = navigationService;
    }

    @objid ("85b73ab2-54b9-11e2-85c1-002564c97630")
    @Override
    public Object createPanel(Composite parent) {
        this.treeViewer = new TreeViewer(parent, SWT.MULTI);
        
        Transfer[] transferTypes = new Transfer[]{LocalSelectionTransfer.getTransfer()};
        this.treeViewer.addDragSupport(DND.DROP_MOVE, transferTypes , new DiagramBrowserDragListener(this.treeViewer));
        this.treeViewer.addDropSupport(DND.DROP_MOVE, transferTypes, new DiagramBrowserDropListener(this.treeViewer,this.project.getSession()));
        
        this.treeViewer.getTree().addMouseListener(new MouseListener() {
        
            @Override
            public void mouseUp(MouseEvent e) {
                // Nothing to do
            }
        
            @Override
            public void mouseDown(MouseEvent e) {
                if (e.stateMask == (SWT.CTRL + SWT.ALT)) {
                    final ViewerCell cell = DiagramBrowserPanelProvider.this.treeViewer.getCell(new Point(e.x, e.y));
                    final Object selectedElement = cell != null ? cell.getElement() : null;
                    if (selectedElement instanceof MObject) {
                        DiagramBrowserPanelProvider.this.navigationService.fireNavigate((MObject) selectedElement);
                    }
                }
            }
        
            @Override
            public void mouseDoubleClick(MouseEvent e) {
                // Nothing to do
            }
        });
        return this.treeViewer;
    }

    @objid ("85b73ab8-54b9-11e2-85c1-002564c97630")
    @Override
    public TreeViewer getPanel() {
        return this.treeViewer;
    }

    @objid ("85b73abd-54b9-11e2-85c1-002564c97630")
    @Override
    public void setInput(Object input) {
        this.treeViewer.setInput(input);
    }

    @objid ("85b73ac1-54b9-11e2-85c1-002564c97630")
    @Override
    public Object getInput() {
        return this.treeViewer.getInput();
    }

    /**
     * @return the browser data model.
     */
    @objid ("000d0264-0d4f-10c6-842f-001ec947cd2a")
    public IBrowserModel getBrowserModel() {
        return this.model;
    }

    /**
     * Changes the browser model.
     * @param newModel The new browser data model.
     */
    @objid ("000de454-0d4f-10c6-842f-001ec947cd2a")
    public void switchBrowserModel(IBrowserModel newModel) {
        configureBrowser(newModel);
        this.treeViewer.refresh();
        this.treeViewer.expandToLevel(2);
    }

    @objid ("000e7f72-0d4f-10c6-842f-001ec947cd2a")
    private void configureBrowser(IBrowserModel newModel) {
        this.model = newModel;
        
        // install content provider
        this.treeViewer.setContentProvider(this.model.getContentProvider(this.project));
        
        // install label provider
        this.treeViewer.setLabelProvider(this.model.getLabelProvider(this.treeViewer));
        
        // install sorter
        this.treeViewer.setSorter(this.model.getSorter());
        
        
        // install label edition
        initEditor();
        //        this.treeViewer.setCellModifier(this.model.getLabelEditor(this.treeViewer));
    }

    @objid ("000ee9bc-0d4f-10c6-842f-001ec947cd2a")
    private void initEditor() {
        // // Define cell editor:
        final TextCellEditor[] cellEditors = new TextCellEditor[1];
        final TextCellEditor editor = new TextCellEditor(this.treeViewer.getTree(), SWT.NONE) {
            private Collection<String> activeContexts;
        
            @Override
            public void activate() {
                // We must deactivate the active contexts during the edition, to avoid the editor's shortcuts to be triggered when entering an element's name...
                // Store those contexts for further reactivation
                this.activeContexts = new ArrayList<>(DiagramBrowserView.contextService.getActiveContextIds());
                for (String contextId : this.activeContexts) {
                    DiagramBrowserView.contextService.deactivateContext(contextId);
                }
        
                super.activate();
            }
        
            @Override
            public void deactivate() {
                if (this.activeContexts != null) {
                    // Restore previously deactivated contexts
                    for (String contextId : this.activeContexts) {
                        DiagramBrowserView.contextService.activateContext(contextId);
                    }
                    this.activeContexts = null;
                }
        
                super.deactivate();
            }
        };
        
        editor.getControl().addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                // Nothing to do
            }
        
            @Override
            public void keyReleased(KeyEvent event) {
                if ((event.stateMask &= SWT.MOD1) != 0 && event.keyCode == 'a') {
                    final Object source = event.getSource();
                    if (source instanceof Text) {
                        final Text text = (Text) source;
                        text.selectAll();
                    }
                }
            }
        });
        
        cellEditors[0] = editor;
        this.treeViewer.setCellEditors(cellEditors);
        
        // Define ICellModifier:
        final String[] properties = new String[1];
        properties[0] = "name";
        this.treeViewer.setColumnProperties(properties);
        this.treeViewer.setCellModifier(this.model.getLabelEditor(this.treeViewer, this.project.getSession()));
        
        // Define editor activation strategy:
        this.actSupport = new DiagramBrowserActivationStrategy(this.treeViewer);
        TreeViewerEditor.create(this.treeViewer, null, this.actSupport, ColumnViewerEditor.TABBING_HORIZONTAL | ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR | ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
    }

    @objid ("3ad87aea-1000-42b1-9d2f-68020cbae703")
    @Override
    public boolean isRelevantFor(Object obj) {
        return true;
    }

    @objid ("3443826d-b68b-43f1-a267-1a4739d44862")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("ce1cc8f8-4d19-4b8a-82bc-f6926f79adc6")
    @Override
    public void dispose() {
        // nothing to do
    }

    @objid ("cd4213f2-54c7-11e2-ae63-002564c97630")
    class ExpandCollapseListener implements ITreeViewerListener {
        @objid ("cd4213f3-54c7-11e2-ae63-002564c97630")
        @Override
        public void treeCollapsed(final TreeExpansionEvent event) {
            Display.getCurrent().asyncExec(new Runnable() {
                @Override
                public void run() {
                    event.getTreeViewer().update(event.getElement(), null);
                }
            });
        }

        @objid ("cd4213f8-54c7-11e2-ae63-002564c97630")
        @Override
        public void treeExpanded(final TreeExpansionEvent event) {
            Display.getCurrent().asyncExec(new Runnable() {
                @Override
                public void run() {
                    event.getTreeViewer().update(event.getElement(), null);
                }
            });
        }

    }

}
