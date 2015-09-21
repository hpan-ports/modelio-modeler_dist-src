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


package org.modelio.diagram.symbol.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.contexts.RunAndTrack;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.core.ui.SelectionHelper;
import org.modelio.diagram.elements.core.model.IGmObject;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.IStyleChangeListener;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.diagram.styles.manager.StyleModelProvider;
import org.modelio.diagram.styles.viewer.StyleEditPanel;
import org.modelio.diagram.styles.viewer.StyleEditPanelUIData;
import org.modelio.diagram.symbol.plugin.DiagramSymbol;
import org.modelio.vcore.session.api.ICoreSession;

/**
 * Diagram symbol view.
 * <p>
 * Displays and allow edition of the selected graphic model properties.
 */
@objid ("ac5129e6-55b7-11e2-877f-002564c97630")
public class SymbolView implements IStyleChangeListener, PropertyChangeListener {
    /**
     * The ID of the view as specified by the extension.
     */
    @objid ("ac5129e9-55b7-11e2-877f-002564c97630")
    public static final String VIEW_ID = "org.modelio.diagram.symbol.SymbolViewID";

    @objid ("37c580f0-9ff6-46d3-8063-ceea59e60ecd")
    private volatile boolean isPinned;

    @objid ("1a34880b-0e2d-4759-a27f-cff706976803")
    private boolean showHelp = true;

    @objid ("325f9f43-5991-11e2-8bfd-001ec947ccaf")
    private StyleEditPanel styleEditPanel;

    @objid ("d7ad874e-1bf3-431f-adc3-97a39bf85d2b")
    private IGmObject selectedSymbol;

    /**
     * The constructor.
     */
    @objid ("ac5129f5-55b7-11e2-877f-002564c97630")
    public SymbolView() {
    }

    @objid ("325f9f4f-5991-11e2-8bfd-001ec947ccaf")
    @Override
    protected void finalize() throws Throwable {
        if (this.styleEditPanel != null) {
            DiagramSymbol.LOG.warning("SymbolView.dispose() is not called, @PreDestroy not used, dispose() can be deleted.");
        }
        dispose();
        super.finalize();
    }

    /**
     * Called by the framework to create the view and initialize it.
     * @param svc
     * the model service
     * @param parent the composite the view must add its content into.
     * @param part the part model
     * @param pickingService the Modelio picking service
     */
    @objid ("325d3d02-5991-11e2-8bfd-001ec947ccaf")
    @PostConstruct
    public void createControls(Composite parent, MPart part, IModelioPickingService pickingService) {
        this.styleEditPanel = new StyleEditPanel();
        this.styleEditPanel.createPanel(parent);
        this.styleEditPanel.showHelpPanel(this.showHelp);
        part.getContext().runAndTrack(new Updater());
    }

    /**
     * Activated when this controller is discarded.
     */
    @objid ("ac52b070-55b7-11e2-877f-002564c97630")
    @PreDestroy
    public void dispose() {
        this.styleEditPanel = null;
    }

    /**
     * Get the symbol view panel.
     * @return the symbol view panel.
     */
    @objid ("325f9f57-5991-11e2-8bfd-001ec947ccaf")
    public StyleEditPanel getPanel() {
        return this.styleEditPanel;
    }

    /**
     * Get the selected IGmObject.
     * @return the current element displayed in the symbol view.
     */
    @objid ("ac52b073-55b7-11e2-877f-002564c97630")
    public IGmObject getSelectedSymbol() {
        return this.selectedSymbol;
    }

    /**
     * Called when the selection changes in the workbench.<br>
     * Its responsibility is to set the NotesView's current element.
     * @param sel the current modelio selection.
     */
    @objid ("325f9f52-5991-11e2-8bfd-001ec947ccaf")
    void update(IStructuredSelection sel) {
        // we ignore the selection when one of the following conditions is matched:
        // - it is 'null'
        // - we are pinned
        // - we are disposed
        // - the selection is our own selection
        // - the selection is same selection
        if (sel == null || isPinned() || this.styleEditPanel == null) {
            return;
        }
        
        // currently the selection must be unique (one element) and it must be a GmObject
        IGmObject gmObject = SelectionHelper.getFirst(sel, IGmObject.class);
        setSelectedSymbol(gmObject);
        
        // final List<?> selectedElements = sel.toList();
        // if (selectedElements.size() == 1 && selectedElements.get(0) instanceof IAdaptable) {
        // final IAdaptable selectedAdapter = (IAdaptable) selectedElements.get(0);
        // final IGmObject gmObject = (IGmObject) selectedAdapter.getAdapter(IGmObject.class);
        // this.setSelectedSymbol(gmObject);
        // } else {
        // this.setSelectedSymbol(null);
        // }
    }

    @objid ("849ed246-cf9e-4a14-b0b9-17cdeb6ad4a0")
    private boolean isPinned() {
        return this.isPinned;
    }

    @objid ("bc973ffd-17a7-4df3-a064-40c82726d0ac")
    private void setPinned(boolean val) {
        this.isPinned = val;
    }

    @objid ("0618872d-c39e-417b-b10b-9a74cbeeb8dd")
    void setSelectedSymbol(IGmObject selectedSymbol) {
        if (this.selectedSymbol != null && this.selectedSymbol == selectedSymbol) {
            return;
        }
        if (this.selectedSymbol != null) {
            this.selectedSymbol.getStyle().removeListener(this);
            this.selectedSymbol.removePropertyChangeListener(this);
        }
        
        this.selectedSymbol = selectedSymbol;
        
        if (selectedSymbol != null) {
            boolean isEditable = selectedSymbol.isEditable();
            // Change the StyleViewer model provider
            // Instead of providing the symbol Style, we provide a StyleEditor proxy
            // that will be responsible for managing transactions in the model in case of modifications
            ICoreSession session = this.selectedSymbol.getDiagram().getModelManager().getModelingSession();
            // final StyleModelProvider model = new StyleModelProvider(new StyleEditor(selectedSymbol), session,
            // selectedSymbol.getStyleKeys(), isEditable);
        
            final StyleEditPanelUIData data = new StyleEditPanelUIData(new StyleEditor(selectedSymbol), session,
                    selectedSymbol.getStyleKeys(), isEditable);
        
            this.styleEditPanel.setInput(data);
            this.styleEditPanel.getTreeViewer().expandAll();
            this.styleEditPanel.getTreeViewer().refresh();
        
            // Set the model listener
            this.selectedSymbol.getStyle().addListener(this);
            this.selectedSymbol.addPropertyChangeListener(this);
        } else {
            this.styleEditPanel.setInput(null);
            // this.styleViewer.getTreeViewer().refresh();
        }
    }

    @objid ("d7ac7f9b-cee6-4224-8b3f-df9bf15a28be")
    @Override
    public void styleChanged(final StyleKey property, final Object newValue) {
        if (this.selectedSymbol == null) {
            return;
        }
        Collection<StyleKey> keyfilter = ((StyleEditPanelUIData) this.styleEditPanel.getInput()).getKeyfilter();
        if (keyfilter == null) {
            return;
        }
        
        // Check if style keys changed.
        if (!keyfilter.equals(this.selectedSymbol.getStyleKeys())) {
            // Change the StyleViewer model provider
            // Instead of providing the symbol Style, we provide a StyleEditor proxy
            // that will be responsible for managing transactions in the model in case of modifications
            ICoreSession session = this.selectedSymbol.getDiagram().getModelManager().getModelingSession();
            final StyleModelProvider model = new StyleModelProvider(new StyleEditor(this.selectedSymbol), session,
                    this.selectedSymbol.getStyleKeys(), true);
        
            this.styleEditPanel.setInput(model);
            this.styleEditPanel.getTreeViewer().expandAll();
            this.styleEditPanel.getTreeViewer().refresh();
        
        }
    }

    @objid ("075cc19c-1a9c-4baa-ad0a-3d578b8131a1")
    @Override
    public void styleChanged(final IStyle changedStyle) {
        Collection<StyleKey> keyfilter = ((StyleEditPanelUIData) this.styleEditPanel.getInput()).getKeyfilter();
        if (keyfilter == null) {
            return;
        }
        
        // Check if style keys changed.
        if (!keyfilter.equals(this.selectedSymbol.getStyleKeys())) {
            // Change the StyleViewer model provider
            // Instead of providing the symbol Style, we provide a StyleEditor proxy
            // that will be responsible for managing transactions in the model in case of modifications
            ICoreSession session = this.selectedSymbol.getDiagram().getModelManager().getModelingSession();
            StyleModelProvider model = new StyleModelProvider(new StyleEditor(this.selectedSymbol), session,
                    this.selectedSymbol.getStyleKeys(), true);
        
            this.styleEditPanel.setInput(model);
            this.styleEditPanel.getTreeViewer().expandAll();
            this.styleEditPanel.getTreeViewer().refresh();
        }
    }

    @objid ("eee48ed5-d21d-42a9-9e60-dd90e54f9dfb")
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (this.styleEditPanel != null && evt.getPropertyName().equals(IGmObject.PROPERTY_DELETE)) {
            // The Gm displayed in the Symbol view has been deleted, reset the selection.
            setSelectedSymbol(null);
        }
    }

    @objid ("1d1e9986-4145-44b1-8385-09039f87068e")
    public void toggleHelpPanel() {
        this.showHelp = !this.showHelp;
        this.styleEditPanel.showHelpPanel(this.showHelp);
    }

    /**
     * Listener activated when the selection changes in the workbench.<br>
     * Its responsibility is to set the NotesView's current element.
     */
    @objid ("325f9f44-5991-11e2-8bfd-001ec947ccaf")
    private class Updater extends RunAndTrack {
        @objid ("325f9f46-5991-11e2-8bfd-001ec947ccaf")
        public Updater() {
            // NOOP
        }

        @objid ("325f9f48-5991-11e2-8bfd-001ec947ccaf")
        @SuppressWarnings("synthetic-access")
        @Override
        public boolean changed(IEclipseContext context) {
            if (SymbolView.this.styleEditPanel == null) {
                return false;
            }
            
            final Object sel = context.get(IServiceConstants.ACTIVE_SELECTION);
            if (sel instanceof IStructuredSelection) {
                update((IStructuredSelection) sel);
            }
            return true;
        }

    }

}
