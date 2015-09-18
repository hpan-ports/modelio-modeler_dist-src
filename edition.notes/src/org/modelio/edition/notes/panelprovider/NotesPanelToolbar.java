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
                                    

package org.modelio.edition.notes.panelprovider;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.modelio.edition.notes.plugin.EditionNotes;
import org.modelio.ui.panel.IPanelProvider;

/**
 * Implement the tool bar of the Notes & Constraints panel.
 * 
 * @author phv
 * 
 * @author phv
 */
@objid ("2ddaa41e-4814-4f81-b61e-131e84da513c")
public class NotesPanelToolbar implements IPanelProvider {
    @objid ("1c4a967c-0aa4-4f1e-bb8d-ffb4035892fe")
    private NotesPanelController controller;

    @objid ("a3a5892e-65e6-414a-bd38-27ef8f16e0fe")
    private ToolItem addConstraint;

    @objid ("836e36a0-85ed-4041-addb-4332228566f5")
    private Composite tbComp;

    @objid ("451dc1d9-66bd-4884-8a4f-dc06f1562d8f")
    private ToolItem addNote;

    @objid ("1fc94f0e-1841-408b-8d81-79c872712879")
    private ToolItem addDescription;

    @objid ("8e6c1346-9af8-4ff4-abf7-490fc2276faa")
    private ToolItem addExternDocument;

    @objid ("3ca5e76c-6d21-4c8a-8b32-cfaf38d3da6b")
    private ToolItem removeAnnotation;

    @objid ("9700e5d1-b696-4a90-8fa6-63944e44a723")
    private ToolItem cleanContent;

    @objid ("90f83aee-22b6-41c7-bd69-8aeb00284c35")
    private ToolItem moveUp;

    @objid ("4dca01ff-9706-419b-b42e-5ae5a610d535")
    private ToolItem moveDown;

    /**
     * C'Tor
     * @param controller the controller of the GUI panel owning the tool bar
     */
    @objid ("02ffbef3-ba8f-4cda-9c53-e3f1611c892a")
    public NotesPanelToolbar(NotesPanelController controller) {
        NotesPanelToolbar.this.controller = controller;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#isRelevantFor(java.lang.Object)
     */
    @objid ("e866b034-8b5f-4be5-b4b0-3944c2c3b8ad")
    @Override
    public boolean isRelevantFor(Object obj) {
        return true;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#createPanel(org.eclipse.swt.widgets.Composite)
     */
    @objid ("bfe0a036-16dd-465b-98c2-d660978ebab5")
    @Override
    public Object createPanel(Composite parent) {
        this.tbComp = new Composite(parent, SWT.NONE);
        GridLayout gl = new GridLayout(2, false);
        gl.horizontalSpacing = gl.verticalSpacing = 0;
        gl.marginHeight = gl.marginTop = gl.marginBottom = -1;
        gl.marginLeft = gl.marginRight = gl.marginWidth = 0;
        this.tbComp.setLayout(gl);
        
        ToolBar tb = new ToolBar(this.tbComp, SWT.HORIZONTAL | SWT.BORDER);
        tb.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
        
        this.addConstraint = createToolButton(tb, "icons/addConstraint_16.png", "AddConstraint.tooltip");
        this.addConstraint.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onAddConstraint();
            }
        });
        
        this.addNote = createToolButton(tb, "icons/addNote_16.png", "AddNote.tooltip");
        this.addNote.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onAddNote();
            }
        });
        
        this.addDescription = createToolButton(tb, "icons/addDescription_16.png", "AddDescription.tooltip");
        this.addDescription.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onAddDescription();
            }
        });
        
        this.addExternDocument = createToolButton(tb, "icons/addExternDocument_16.png", "AddExternDocument.tooltip");
        addExternDocument.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onAddRichNote();
            }
        });
        
        this.removeAnnotation = createToolButton(tb, "icons/remove_16.png", "RemoveAnnotation.tooltip");
        this.removeAnnotation.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onRemoveAnnotation();
            }
        });
        
        this.cleanContent = createToolButton(tb, "icons/cleanNote_16.png", "CleanNote.tooltip");
        this.cleanContent.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onCleanContent();
            }
        });
        
        this.moveUp = createToolButton(tb, "icons/moveup_16.png", "MoveUp.tooltip");
        this.moveUp.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onMoveUp();
            }
        });
        
        this.moveDown = createToolButton(tb, "icons/movedown_16.png", "MoveDown.tooltip");
        this.moveDown.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onMoveDown();
            }
        });
        
        ToolItem item = new ToolItem(tb, SWT.SEPARATOR);
        
        item = createToolButton(tb, "icons/horizontalLayout_16.png", "SetHorizontal.tooltip");
        item.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onHorizontalLayout();
            }
        });
        item = createToolButton(tb, "icons/verticalLayout_16.png", "SetVertical.tooltip");
        item.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onVerticalLayout();
            }
        });
        item = createToolButton(tb, "icons/automaticLayout_16.png", "SetAuto.tooltip");
        item.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                NotesPanelToolbar.this.controller.onAutomaticLayout();
            }
        });
        return this.tbComp;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#getPanel()
     */
    @objid ("9dc6c0dd-2192-43ad-8130-bf24bfa66c4c")
    @Override
    public Object getPanel() {
        return this.tbComp;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#getHelpTopic()
     */
    @objid ("428125fb-6bd7-4ee0-a8bf-62c90bebf868")
    @Override
    public String getHelpTopic() {
        return null;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#getInput()
     */
    @objid ("798623e9-0867-4212-b9a2-bad9b5ee6103")
    @Override
    public Object getInput() {
        // TODO Auto-generated method stub
        return null;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#setInput(java.lang.Object)
     */
    @objid ("acb9a9ad-6d71-48e7-b49c-90936eae166d")
    @Override
    public void setInput(Object input) {
        update();
    }

    @objid ("885b963b-95ac-4865-b924-515d3306b281")
    private void update() {
        this.addConstraint.setEnabled(this.controller.canAddConstraint());
        this.addNote.setEnabled(this.controller.canAddNote());
        this.addDescription.setEnabled(this.controller.canAddNote());
        this.addExternDocument.setEnabled(this.controller.canAddRichNote());
        this.removeAnnotation.setEnabled(this.controller.canRemoveAnnotation());
        this.cleanContent.setEnabled(this.controller.canCleanContent());
        this.moveDown.setEnabled(this.controller.canMoveDown());
        this.moveUp.setEnabled(this.controller.canMoveUp());
    }

    /**
     * Helper function to create tool item
     * @param text
     * the text to display on the tool item
     * @param image
     * the image to display on the tool item
     * @param hotImage
     * the hot image to display on the tool item
     * @param type
     * the type of tool item to create
     * @param toolTipText the tool tip text for the tool item
     * @param parent the parent toolbar
     * @return ToolItem
     */
    @objid ("83642e69-f78c-4bb4-ab09-3a9c80253628")
    private ToolItem createToolButton(ToolBar parent, String iconPath, String tooltip) {
        ToolItem item = new ToolItem(parent, SWT.PUSH);
        // Get the icon and setup a listener for disposal
        ImageDescriptor iconDescriptor = EditionNotes.getImageDescriptor(iconPath);
        if (iconDescriptor != null) {
            final Image icon = iconDescriptor.createImage();
            item.setImage(icon);
            parent.addDisposeListener(new DisposeListener() {
                @Override
                public void widgetDisposed(DisposeEvent e) {
                    icon.dispose();
                }
            });
        }
        
        item.setToolTipText(EditionNotes.I18N.getString(tooltip));
        return item;
    }

/* (non-Javadoc)
     * @see org.modelio.ui.panel.IPanelProvider#dispose()
     */
    @objid ("201e5e20-9af4-46d7-bbaf-c5033d0651cf")
    @Override
    public void dispose() {
        // nothing to do
    }

}
