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
                                    

package org.modelio.core.ui.ktable.types.scoperichtext;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.KTableCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * This Editor is used to edit a Requirement or Term,  using an external editor.
 * When opening the editor, an ExternDocument is created on the edited element, if it doesn't exists.
 * Therefore, the ExternDocument is edited  on a separate extern editor, in the same way as using a double click on it.
 */
@objid ("8dc5f866-c068-11e1-8c0a-002564c97630")
public class ScopeRichTextCellEditor extends KTableCellEditor {
    @objid ("8dc5f868-c068-11e1-8c0a-002564c97630")
    private boolean active = false;

    @objid ("8dc5f869-c068-11e1-8c0a-002564c97630")
    private ModelElement editedElement;

    @objid ("8dc5f86c-c068-11e1-8c0a-002564c97630")
    protected KeyAdapter keyListener = new KeyAdapter() {
        @SuppressWarnings("synthetic-access")
        @Override
        public void keyPressed(KeyEvent e) {
            try {
                onKeyPressed(e);
            } catch (final Exception ex) {
                ex.printStackTrace();
                // Do nothing
            }
        }
    };

    @objid ("8dc5f86d-c068-11e1-8c0a-002564c97630")
    protected TraverseListener travListener = new TraverseListener() {
        @Override
        public void keyTraversed(TraverseEvent e) {
            // onTraverse(e);
        }
    };

    /**
     * Default constructor.
     * @param editedElement the element to edit. Should be a Term or a Requirement.
     */
    @objid ("8dc5f86e-c068-11e1-8c0a-002564c97630")
    public ScopeRichTextCellEditor(final ModelElement editedElement) {
        this.editedElement = editedElement;
    }

    /**
     * Close the editor.
     * @param save true to save the content in the data model.
     */
    @objid ("8dc5f875-c068-11e1-8c0a-002564c97630")
    public void closeEditor(final boolean save) {
        this.active = false;
        super.close(save);
        selectNextField();
    }

    @objid ("8dc5f87a-c068-11e1-8c0a-002564c97630")
    @Override
    public void close(final boolean save) {
        // Nothing to do.
    }

    @objid ("8dc5f87f-c068-11e1-8c0a-002564c97630")
    @Override
    public int getActivationSignals() {
        return SINGLECLICK | KEY_ANY | KEY_RETURN_AND_SPACE;
    }

    @objid ("8dc5f884-c068-11e1-8c0a-002564c97630")
    @Override
    public void open(final KTable table, final int col, final int row, final Rectangle rect) {
        super.open(table, col, row, rect);
        
        if (!this.active) {
            this.active = true;
        
            String docTypeName;
            if (this.editedElement instanceof Goal) {
                docTypeName = "goal";
            } else if (this.editedElement instanceof BusinessRule) {
                docTypeName = "business_rule";
            } else if (this.editedElement instanceof Requirement) {
                docTypeName = "requirement";
            } else if (this.editedElement instanceof Term) {
                docTypeName = "term";
            } else {
                // Not an analyst element, should never happen
                return;
            }
        
            ExternDocument externDoc = getExternDoc(this.editedElement, docTypeName);
            if (externDoc == null) {
                /* TODO CHM rich notes...
                String mimeType = getSelectedMimeType();
                DocumentFormat format = ModelProperty.getInstance().getDocumentFormatsRegistry().getDocumentFormatForMime(mimeType);
                if (format == null) {
                    MessageDialog.openError(Display.getDefault().getActiveShell(), 
                                            ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.InvalidMimeType"),
                                            ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.InvalidMimeTypeDetails", mimeType));
                } else if ( !format.isUsable() || format.getSupportLevel()!=SupportLevel.Primary) {
                    MessageDialog.openError(Display.getDefault().getActiveShell(), 
                                            ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.InvalidMimeType"),
                                            ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.UnsupportedFormatDetails", format.getLabel()));
                } else {
                    externDoc = createExternDoc(this.editedElement, docTypeName, mimeType);
                } 
                 */
            }
        
            if (externDoc != null) {
                closeEditor(true);
                // Must call the fire after the closeEditor for focus issues...
                // TODO CHM activation service 
                //ModelProperty.getInstance().getActivationService().fireActivate(externDoc);
            } else {
                closeEditor(false);
            }
        } else {
            closeEditor(true);        
        }
    }

    @objid ("8dc5f88f-c068-11e1-8c0a-002564c97630")
    protected ExternDocument createExternDoc(final ModelElement element, final String docTypeName, final String mimeType) {
        ExternDocument externDoc = null;
        
        // TODO CHM create element
        //CoreSession session = ModelProperty.getInstance().getModelingSession();
        //try (ITransaction transaction = session.createTransaction("Create '"+mimeType+"' "+docTypeName+"rich note")) {
        //externDoc = session.getModelFactory().createExternDocument(docTypeName, element, mimeType);
        //externDoc.setName(element.getName());
        //transaction.commit();
        /*}catch (DocumentTypeNotFoundException e) {
            ModelProperty.LOG.error(e);
            MessageDialog.openError(Display.getDefault().getActiveShell(), 
                                    ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.CannotCreateRichNote"), 
                                    e.getLocalizedMessage());
        } catch (IOException e) {
            ModelProperty.LOG.error(e);
            MessageDialog.openError(Display.getDefault().getActiveShell(), 
                                    ModelProperty.I18N.getMessage("ScopeRichTextCellEditor.CannotCreateRichNote"), 
                                    e.getLocalizedMessage());*/
        //}
        return externDoc;
    }

    @objid ("8dc5f89d-c068-11e1-8c0a-002564c97630")
    protected ExternDocument getExternDoc(final ModelElement element, final String docTypeName) {
        for (ExternDocument doc : element.getDocument()) {
            ExternDocumentType docType = doc.getType ();
            if (docType != null && docType.getName ().equals (docTypeName)) {
                return doc;
            }
        }
        return null;
    }

    @objid ("8dc77f0a-c068-11e1-8c0a-002564c97630")
    @Override
    public void setContent(final Object content) {
        // Nothing to do
    }

    @objid ("8dc77f0f-c068-11e1-8c0a-002564c97630")
    @Override
    protected Control createControl() {
        final Text m_Text2 = new Text(this.m_Table, SWT.NONE);
        m_Text2.setData(null);
        m_Text2.setEnabled(false);
        m_Text2.setEditable(false);
        return m_Text2;
    }

    @objid ("8dc77f14-c068-11e1-8c0a-002564c97630")
    private void selectNextField() {
        int nextCol = this.m_Col + 1;
        int nextRow = this.m_Row;
        
        if (nextCol > this.m_Model.getColumnCount() - 1) {
            nextCol = 1;
            nextRow++;
        }
        
        if (nextRow > this.m_Model.getRowCount() - 1) {
            nextRow = 1;
        }
        
        this.m_Table.setSelection(nextCol, nextRow, true);
    }

    @objid ("8dc77f16-c068-11e1-8c0a-002564c97630")
    private String getSelectedMimeType() {
        // Get Analyst module parameter
        /* TODO CHM modules
        for (IMdac module : ModelProperty.getInstance().getModelingSession().getMdacRegistry().getStartedMdacs()) {
            if (module.getName().equals("Analyst")) {
                String mimeType = module.getConfiguration().getParameterValue("DescriptionMimeType");
                if (mimeType.equals("OoWriter")) {
                    return "application/vnd.oasis.opendocument.text";
                } else if (mimeType.equals("MsWord")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                } else if (mimeType.equals("OoHTML")) {
                    return "text/html/ooo";
                } else {
                    return "text/html";
                }
            }
        }*/
        
        // Use a default value
        if (System.getProperty("os.name").equals("Linux")) {
            return "application/vnd.oasis.opendocument.text";
        } else {
            return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        }
    }

}
