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
                                    

package org.modelio.diagram.elements.core.figures.html.fromswing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;
import javax.swing.text.FlowView;
import javax.swing.text.GlyphView;
import javax.swing.text.Segment;
import javax.swing.text.StyleConstants;
import javax.swing.text.TableView;
import javax.swing.text.View;
import javax.swing.text.html.BlockView;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.ListView;
import javax.swing.text.html.StyleSheet.BoxPainter;
import javax.swing.text.html.StyleSheet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.AbstractFlowBorder;
import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.modelio.core.ui.CoreColorRegistry;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.diagram.elements.common.header.HeaderTextFlow;
import org.modelio.diagram.elements.plugin.DiagramElements;

@objid ("d876af86-40fc-4910-8cf9-307bb0375d5c")
class DefaultFigureFromViewFactory implements IFigureFromViewFactory {
    @objid ("43f0657b-3f7f-49a0-a95e-54039b390deb")
    protected static final String HTML_BR_VIEW = "javax.swing.text.html.BRView";

    @objid ("9e59cc54-43a0-469c-9895-33248fc7d5ef")
    protected static final String HTML_TABLE_VIEW = "javax.swing.text.html.TableView";

    @objid ("6c807ab2-34ec-4c96-95a6-e6346077a8e4")
    protected final Font defaultFont;

    @objid ("5f061516-094c-4879-aefe-98118b5354cc")
    public DefaultFigureFromViewFactory(Font defaultFont) {
        this.defaultFont = defaultFont;
    }

    @objid ("fd765034-5190-46e7-b176-de48cecd1763")
    @Override
    public Font getFont() {
        return this.defaultFont;
    }

    @objid ("9bc3855b-7ffc-42fb-9974-8cffc74eb5a2")
    @Override
    public Figure createFigure(View child, Figure parentFigure) {
        String className = child.getClass().getName();
        if (child instanceof GlyphView) {
            return createTextFlow((GlyphView) child);
            
        } else if (child instanceof FlowView  ) {
            if(child.getViewCount() == 0)
                loadFlowChildren(child);
            
            return parentFigure;
        
            //return createParagraphFlow( child);
        } else if (child instanceof ListView) {
            return createBlockFlow(child);
        } else if (child instanceof TableView || className.equals(HTML_TABLE_VIEW)) {
            return createBlockFlow(child);
        } else if (child instanceof BlockView) {
            return createBlockFlow(child);
        } else if (className.equals(HTML_BR_VIEW)) {
            return new TextFlow("\n");
        } else if (child instanceof FlowView) {
            return createBlockFlow(child);
        } else {
            DiagramElements.LOG.debug(child+" not supported");
        }
        return null;
    }

    @objid ("bceb8256-c3f9-443b-85a0-95c5ee223ba9")
    void loadFlowChildren(View flowView) {
        Element elem = flowView.getElement();
        for (int i=0, nb=elem.getElementCount(); i<nb; ++i) {
            Element childElem = elem.getElement(i);
            View childView = flowView.getViewFactory().create(childElem);
            flowView.append(childView);
            
            // Recurse if needed
            if (childView.getViewCount() == 0)
                loadFlowChildren(childView);
        }
    }

    @objid ("8606646e-dddd-4218-95e7-feb280483bd2")
    protected static javax.swing.text.html.HTML.Tag getTag(View v) {
        return getTag(v.getElement());
    }

    @objid ("4ff093f4-bbb9-4cab-b314-0327b236c4a9")
    protected static javax.swing.text.html.HTML.Tag getTag(Element v) {
        AttributeSet attrs = v.getAttributes();
        Object o = attrs.getAttribute(StyleConstants.NameAttribute);
        if (o instanceof HTML.Tag) {
            return (HTML.Tag) o;
        } else
            return null;
    }

    @objid ("a6bfcb15-8133-4624-8c67-0fad9ebc47a3")
    @Override
    public IFigureFromViewFactory getFactory(View child, Figure parentFigure) {
        String className = child.getClass().getName();
        if (child instanceof ListView) {
            return new ListFigureFromViewFactory(this);
        } else if (child instanceof TableView || className.equals(HTML_TABLE_VIEW)) {
            return new TableFigureFromViewFactory(this, child);
        }
        return this;
    }

    @objid ("865932d0-dc97-4fd8-bca5-9a00d06bdc69")
    protected Figure createParagraphFlow(View child) {
        return createBlockFlow(child);
        /*
                        HeaderTextFlow f = new HeaderTextFlow();
                        int p0 = child.getStartOffset();
                        int p1 = child.getEndOffset();
                        String txt;
                        try {
                            txt = child.getDocument().getText(p0, p1);
                            f.setText(txt);
                        } catch (BadLocationException e) {
                            f.setText(e.toString());
                        }
                        
                        initStyle(f, child);
                        initTextStyle(f, child);
                        
                        return f;       */
    }

    @objid ("9a9e2416-dcdf-4749-bc9c-95cecc36acd3")
    protected HeaderTextFlow createTextFlow(GlyphView child) {
        HeaderTextFlow f = new HeaderTextFlow();
        int p0 = child.getStartOffset();
        int p1 = child.getEndOffset();
        Segment txt = child.getText(p0, p1);
        f.setText(txt.toString());
        
        initStyle(f, child);
        initTextStyle(f, child);
        return f;
    }

    /**
     * initialize the figure style
     * @see javax.swing.text.Utilities#paintComposedText(Graphics, Rectangle, GlyphView)
     * @param f a GEF Figure
     * @param elem a document element
     */
    @objid ("f9a5c86a-ffcf-4528-8a77-21db6b305dc5")
    @SuppressWarnings("javadoc")
    protected void initStyle(Figure f, View elem) {
        StyleSheet style = ((HTMLDocument)elem.getDocument()).getStyleSheet();
        
        AttributeSet a = style.getViewAttributes(elem); 
        
        Color col = (Color) a.getAttribute(StyleConstants.Foreground);
        if (col != null) 
            f.setForegroundColor(getSwtColor(col));
        
        col = (Color) a.getAttribute(StyleConstants.Background);
        if (col != null) 
            f.setBackgroundColor(getSwtColor(col));
        
        Integer align = (Integer) a.getAttribute(StyleConstants.Alignment);
        if (align != null && f instanceof BlockFlow) {
            BlockFlow bf = (BlockFlow) f;
            if (align == StyleConstants.ALIGN_LEFT)
                bf.setHorizontalAligment(PositionConstants.ALWAYS_LEFT);
            else if (align == StyleConstants.ALIGN_RIGHT)
                bf.setHorizontalAligment(PositionConstants.ALWAYS_RIGHT);
            else if (align == StyleConstants.ALIGN_CENTER)
                bf.setHorizontalAligment(PositionConstants.CENTER);
            else if (align == StyleConstants.ALIGN_JUSTIFIED)
                bf.setHorizontalAligment(PositionConstants.ALWAYS_LEFT);
                
        }
        
        CssFigureBorder border = new CssFigureBorder(elem);
        if (border.getInsets(f) != null)
            f.setBorder(border);
    }

    @objid ("2aef7f4f-6bfe-4467-bbc7-c4d02421615c")
    @SuppressWarnings("unused")
    private void initTextStyle(HeaderTextFlow f, GlyphView view) {
        StyleSheet style = ((HTMLDocument)view.getDocument()).getStyleSheet();
        AttributeSet a = style.getViewAttributes(view); 
        
        GlyphView gv = view;
        
        {
            gv.getFont();
            Color fg = gv.getForeground();
            Color bg = gv.getBackground();
            boolean st = gv.isStrikeThrough();
            if (st)
                f.setStrikeThrough(true);
            boolean sub = gv.isSubscript();
            boolean sup = gv.isSuperscript();
            boolean under = gv.isUnderline();
        }
        
        
        java.awt.Font awtFont = gv.getFont();
        String awtName = awtFont!= null ? awtFont.getFamily() : null;
        int awtSize = awtFont!= null ? awtFont.getSize() : null;
        
        
        int fstyle = SWT.NORMAL; 
        if (StyleConstants.isBold(a) || a.isDefined(HTML.Tag.STRONG))
            fstyle |= SWT.BOLD;
        if (StyleConstants.isItalic(a) || a.isDefined(HTML.Tag.I))
            fstyle |= SWT.ITALIC;
        
        if (StyleConstants.isStrikeThrough(a))
            f.setStrikeThrough(true);
        
        if (StyleConstants.isUnderline(a))
            f.setUnderline(true);
        
        String fontFam = (String) a.getAttribute(StyleConstants.FontFamily);
        Integer fontSize = (Integer) a.getAttribute(StyleConstants.FontSize);
        
        if (fontFam!=null || fontSize!=null || fstyle != SWT.NORMAL) {
            final FontData defFontData = this.defaultFont.getFontData()[0];
            
            if (fontSize == null) 
                fontSize = defFontData.getHeight();
            
            if (fontFam == null)
                fontFam = defFontData.getName();
            
            FontData fd = new FontData(fontFam, fontSize, fstyle);
            f.setFont(CoreFontRegistry.getFont(fd));
        }
    }

    @objid ("926e718c-901b-444e-8991-15eec00f65fb")
    private org.eclipse.swt.graphics.Color getSwtColor(Color col) {
        RGB rgb = new RGB(col.getRed(), col.getGreen(), col.getBlue());
        return CoreColorRegistry.getColor(rgb);
    }

    @objid ("bdcc55da-06fa-41e0-867c-e1990aa23878")
    protected Figure createBlockFlow(View v) {
        BlockFlow f = new BlockFlow();
        
        initStyle(f, v);
        
        /* debug border
        AbstractFlowBorder border = new AbstractFlowBorder() {
            @Override
            public void paint(FlowFigure figure, org.eclipse.draw2d.Graphics g, Rectangle where, int sides) {
                g.setAlpha(50);
                g.drawRectangle(where);
                g.restoreState();
            }
        };
        f.setBorder(border);
        */
        return f;
    }

    @objid ("49f8be05-85f7-4756-b1f5-c4732696542c")
    class CssFigureBorder extends AbstractFlowBorder {
        @objid ("b7a635a9-ad76-40a7-ba13-ed3619327a31")
        private Insets insets;

        @objid ("16286b5b-0493-44aa-8e9c-3572bfd0915f")
        CssFigureBorder(View view) {
            StyleSheet style = ((HTMLDocument)view.getDocument()).getStyleSheet();
            AttributeSet a = style.getViewAttributes(view); 
            BoxPainter boxPainter = style.getBoxPainter(a);
            
            
            int top = (int) boxPainter.getInset(SwingConstants.TOP, view);
            int left = (int) boxPainter.getInset(SwingConstants.LEFT, view);
            int bottom = (int) boxPainter.getInset(SwingConstants.BOTTOM, view);
            int right = (int) boxPainter.getInset(SwingConstants.RIGHT, view);
            
            this.insets = new Insets(top, left, bottom, right);
        }

        @objid ("1ab28668-29f0-48d1-bb2c-9e698090ed5f")
        @Override
        public Insets getInsets(IFigure figure) {
            return this.insets;
        }

    }

}
