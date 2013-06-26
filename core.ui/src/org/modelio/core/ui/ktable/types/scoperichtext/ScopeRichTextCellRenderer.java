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
import de.kupzog.ktable.KTableModel;
import de.kupzog.ktable.SWTX;
import de.kupzog.ktable.renderers.DefaultCellRenderer;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Text;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;

/**
 * This renderer displays an ExternDocument as an Icon.
 */
@objid ("8de47cf3-c068-11e1-8c0a-002564c97630")
public class ScopeRichTextCellRenderer extends DefaultCellRenderer {
    @objid ("8de47cf5-c068-11e1-8c0a-002564c97630")
    protected Text m_text;

    @objid ("8de47cf6-c068-11e1-8c0a-002564c97630")
    private Image image = null;

    /**
     * Default c'tor.
     * @param style editor's style.
     */
    @objid ("8de47cf7-c068-11e1-8c0a-002564c97630")
    public ScopeRichTextCellRenderer(final int style) {
        super(style);
    }

    @objid ("8de47cfc-c068-11e1-8c0a-002564c97630")
    @Override
    public int getOptimalWidth(final GC gc, final int col, final int row, final Object content, final boolean fixed, final KTableModel model) {
        if (content == null) {
            return 30;
        }
        return SWTX.getCachedStringExtent(gc, content.toString()).x + 8;
    }

    @objid ("8de47d0d-c068-11e1-8c0a-002564c97630")
    @Override
    public void drawCell(final GC gc, final Rectangle initialRect, final int col, final int row, final Object content, final boolean focus, final boolean fixed, final boolean clicked, final KTableModel model) {
        Rectangle rect = initialRect;
        applyFont(gc);
        
        this.image = null;
        if (content != null && content instanceof ExternDocument) {
            ExternDocument externDocument = (ExternDocument) content;
        
            /* TODO CHM rich notes
            String mimeType = externDocument.getMimeType();
            DocumentFormat format = ModelProperty.getInstance().getDocumentFormatsRegistry().getDocumentFormatForMime(mimeType);
            if (format != null) {
                ImageDescriptor desc = format.getIconDescriptor();
                if (desc != null) {
                    this.image = getCmsDecoratedImage(format.toString(), desc);
                } else {
                    this.image = StandardImageService.getCmsStereotypedImage(externDocument, null);
                }
            }
            */
        } else if (!"".equals(content)) {
            // TODO CHM images 
            //this.image = EditionUI.getSharedImages().getImage(ISharedImages.DOT);
        }
        
        // draw focus sign:
        String text = "";
        if (focus && (this.m_Style & INDICATION_FOCUS) != 0) {
            // draw content:
            rect = drawDefaultSolidCellLine(gc, rect, COLOR_LINE_LIGHTGRAY, COLOR_LINE_LIGHTGRAY);
            drawCellContent(gc, rect, text, null, getForeground(), COLOR_BGFOCUS);
            gc.drawFocus(rect.x, rect.y, rect.width, rect.height);
        
        } else if (focus && (this.m_Style & INDICATION_FOCUS_ROW) != 0) {
            rect = drawDefaultSolidCellLine(gc, rect, COLOR_BGROWFOCUS, COLOR_BGROWFOCUS);
            // draw content:
            drawCellContent(gc, rect, text, null, COLOR_FGROWFOCUS, COLOR_BGROWFOCUS);
        
        } else {
            rect = drawDefaultSolidCellLine(gc, rect, COLOR_LINE_LIGHTGRAY, COLOR_LINE_LIGHTGRAY);
            // draw content:
            drawCellContent(gc, rect, text, null, getForeground(), getBackground());
        }
        
        if ((this.m_Style & INDICATION_COMMENT) != 0)
            drawCommentSign(gc, rect);
        
        drawImage(gc, rect);
        resetFont(gc);
    }

    @objid ("8de60389-c068-11e1-8c0a-002564c97630")
    private Image getCmsDecoratedImage(final String imageKey, final ImageDescriptor descriptor) {
        String key = "MDAC." + imageKey + ".ICON";
        
        /* TODO CHM images
        Image img = StandardImageService.getImage(key);
        
        // If the image is not found in the cache, create and add it to the cache:
        if (img == null) {
            // Add this new image to the cache
            StandardImageService.declareImage(key, descriptor);
        
            img = StandardImageService.getImage(key);
        }*/
        return null;
    }

    /**
     * @param value If true, the comment sign is painted. Else it is omitted.
     */
    @objid ("8de60391-c068-11e1-8c0a-002564c97630")
    public void setCommentIndication(final boolean value) {
        if (value)
            this.m_Style = this.m_Style | INDICATION_COMMENT;
        else
            this.m_Style = this.m_Style & ~INDICATION_COMMENT;
    }

    /**
     * Paints a sign that a comment is present in the right upper corner!
     * @param gc The GC to use when painting.
     * @param rect The cell area where content should be added.
     */
    @objid ("8de60396-c068-11e1-8c0a-002564c97630")
    protected final void drawImage(final GC gc, final Rectangle rect) {
        if (this.image != null) {
            Rectangle imageRect = this.image.getBounds();
            gc.drawImage(this.image, rect.x + (rect.width - imageRect.width)/2, rect.y);
        }
    }

}
