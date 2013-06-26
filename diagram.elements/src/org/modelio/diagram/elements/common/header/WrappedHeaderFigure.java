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
                                    

package org.modelio.diagram.elements.common.header;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.AbstractFlowBorder;
import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.draw2d.text.FlowContext;
import org.eclipse.draw2d.text.FlowFigure;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.diagram.elements.core.figures.GradientFigure;

/**
 * A wrapped header figure is a stack set of:
 * <ul>
 * <li>an icon area</li>
 * <li>a 'top' labels area, containing a vertical stack of labels</li>
 * <li>main label</li>
 * <li>a 'bottom' labels area, containing a vertical stack of labels</li>
 * </ul>
 * <p>
 * <br>
 * All labels wraps to a new line. The top and bottom labels are displayed using a font derived from the main label font
 * (reduced size).
 * </p>
 */
@objid ("7e75f9af-1dec-11e2-8cad-001ec947c8cc")
public class WrappedHeaderFigure extends GradientFigure {
    @objid ("7e785bcb-1dec-11e2-8cad-001ec947c8cc")
    protected HeaderTextFlow mainLabel;

    @objid ("7e785bcf-1dec-11e2-8cad-001ec947c8cc")
    protected Font stereotypeFont = null;

    @objid ("7e785bd0-1dec-11e2-8cad-001ec947c8cc")
    protected Font tagFont = null;

    @objid ("66b13247-1e83-11e2-8cad-001ec947c8cc")
    protected Figure iconsArea;

    @objid ("66b13248-1e83-11e2-8cad-001ec947c8cc")
    protected Figure leftIconsContainer;

    @objid ("66b13249-1e83-11e2-8cad-001ec947c8cc")
    protected Figure rightIconsContainer;

    @objid ("66b1324a-1e83-11e2-8cad-001ec947c8cc")
    protected TextFlow keywordLabel;

    @objid ("66b394a1-1e83-11e2-8cad-001ec947c8cc")
    protected BlockFlow topLabelsArea;

    @objid ("66b394a2-1e83-11e2-8cad-001ec947c8cc")
    protected BlockFlow bottomLabelsArea;

    @objid ("66b5f6fb-1e83-11e2-8cad-001ec947c8cc")
    protected FlowPage table;

    /**
     * Constructor.
     */
    @objid ("7e7abe1a-1dec-11e2-8cad-001ec947c8cc")
    public WrappedHeaderFigure() {
        // The header figure is a border layouted container.
        // There are two children: 
        //   - the icons area layouted as TOP 
        //   - the contents area layouted as CENTER
        // Children are transparent without borders
        //this.setLayoutManager(new BorderLayout());
        
        Figure container = this;
        //container.setBorder(new MarginBorder(4));
        //container.setBorder(new LineBorder(ColorConstants.lightGreen, 4));
        container.setLayoutManager(new BorderLayout());
        //this.add(container, BorderLayout.CENTER);
        
        // TRACE: this.setBorder(new LineBorder(ColorConstants.orange, 1));
        
        // TOP figure : the icon area
        // The icon area is a border layouted container
        this.iconsArea = new Figure();
        this.iconsArea.setLayoutManager(new BorderLayout());
        // TRACE: iconsArea.setBorder(new LineBorder(ColorConstants.green, 1));
        container.add(this.iconsArea, BorderLayout.TOP);
        
        // left icons container
        // an horizontal toolbar layouted container, left aligned
        this.leftIconsContainer = new Figure();
        ToolbarLayout leftIconAreaLayout = new ToolbarLayout(true);
        leftIconAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
        leftIconAreaLayout.setSpacing(1);
        this.leftIconsContainer.setLayoutManager(leftIconAreaLayout);
        // TRACE: leftIconsContainer.setBorder(new LineBorder(1));
        this.leftIconsContainer.setOpaque(false);
        this.iconsArea.add(this.leftIconsContainer, BorderLayout.LEFT);
        
        // right icons container
        // an horizontal toolbar layouted container, right aligned
        this.rightIconsContainer = new Figure();
        ToolbarLayout righIconAreaLayout = new ToolbarRLayout();
        righIconAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
        righIconAreaLayout.setSpacing(1);
        this.rightIconsContainer.setLayoutManager(righIconAreaLayout);
        // TRACE: rightIconsContainer.setBorder(new LineBorder(1));
        this.rightIconsContainer.setOpaque(false);
        this.iconsArea.add(this.rightIconsContainer, BorderLayout.RIGHT);
        
        // CENTER figure : the contents area
        Figure contentArea = new Figure();
        container.add(contentArea, BorderLayout.CENTER);
        contentArea.setLayoutManager(new CenterAreaLayout());
        //contentArea.setBorder(new LineBorder(ColorConstants.blue, 1));
        
        this.table = new FlowPage();
        //this.table.setHorizontalAligment(PositionConstants.CENTER);
        //this.table.setBorder(new LineBorder(ColorConstants.orange, 1));
        contentArea.add(this.table, new GridData(SWT.FILL, SWT.CENTER, true, true)); // 
        
        // first row : Keyword label
        BlockFlow keywordBlock = new BlockFlow();
        keywordBlock.setHorizontalAligment(PositionConstants.CENTER);
        this.keywordLabel = new TextFlow("");
        keywordBlock.add(this.keywordLabel);
        //TRACE: this.keywordLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
        
        this.table.add(keywordBlock);
        
        // second row: top labels
        this.topLabelsArea = new BlockFlow();
        this.topLabelsArea.setHorizontalAligment(PositionConstants.CENTER);
        //TRACE: this.topLabelsArea.setBorder(new LineBorder(ColorConstants.green, 1));
        this.table.add(this.topLabelsArea);
        
        // Fourth child: the main label area
        BlockFlow mainLabelBlock = new BlockFlow();
        mainLabelBlock.setHorizontalAligment(PositionConstants.CENTER);
        this.mainLabel = new HeaderTextFlow();
        mainLabelBlock.add(this.mainLabel);
        //this.mainLabel.setBorder(new MarginBorder(2, 0, 4, 0));
        mainLabelBlock.setBorder(new MarginFlowBorder(new Insets(2, 0, 4, 0)));
        
        //TRACE: this.mainLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
        this.table.add(mainLabelBlock);
        
        // Fifth child: bottom labels
        // Lazily added.
    }

    /**
     * Set the icons displayed on the upper left corner.
     * @param icons The left icons
     */
    @objid ("7e7abe1d-1dec-11e2-8cad-001ec947c8cc")
    public void setLeftIcons(List<Image> icons) {
        // remove existing labels
        this.leftIconsContainer.removeAll();
        // add new image figures
        for (Image img : icons) {
            ImageFigure imgFigure = new ImageFigure(img);
            this.leftIconsContainer.add(imgFigure);
        }
    }

    /**
     * Set the icons displayed on the upper right corner.
     * @param icons The right icons
     */
    @objid ("7e7abe23-1dec-11e2-8cad-001ec947c8cc")
    public void setRightIcons(List<Image> icons) {
        // remove existing labels
        this.rightIconsContainer.removeAll();
        // add new image figures
        for (Image img : icons) {
            ImageFigure imgFigure = new ImageFigure(img);
            this.rightIconsContainer.add(imgFigure);
        }
    }

    /**
     * Set the keyword label.
     * @param text the keyword label.
     */
    @objid ("7e7abe29-1dec-11e2-8cad-001ec947c8cc")
    public void setKeywordLabel(String text) {
        if (text == null) {
            if (this.keywordLabel != null) {
                this.table.remove(this.keywordLabel.getParent());
                this.keywordLabel = null;
            }
        } else {
            if (this.keywordLabel != null) {
                this.keywordLabel.setText(text);
            } else {
                BlockFlow keywordBlock = new BlockFlow();
                keywordBlock.setHorizontalAligment(PositionConstants.CENTER);
                this.keywordLabel = new TextFlow(text);
                this.keywordLabel.setOpaque(false);
                this.keywordLabel.setFont(this.stereotypeFont);
                //TRACE: this.keywordLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
        
                // XXX Workaround for silent diagram editor: since validation is synchronous, we must set the flow context before adding the figure.
                keywordBlock.setFlowContext((FlowContext) this.table.getLayoutManager());
                this.table.add(keywordBlock, 1);
        
                this.keywordLabel.setFlowContext((FlowContext) keywordBlock.getLayoutManager());
                keywordBlock.add(this.keywordLabel);
            }
        
        }
    }

    /**
     * Set the labels displayed on top of the main label.
     * @param topLabels the top labels.
     */
    @objid ("7e7abe2d-1dec-11e2-8cad-001ec947c8cc")
    public void setTopLabels(List<String> topLabels) {
        // remove existing labels
        this.topLabelsArea.removeAll();
        
        if (topLabels.isEmpty())
            return;
        
        StringBuilder sb = new StringBuilder(topLabels.size() * 20);
        for (String s : topLabels) {
            if (sb.length() > 0)
                sb.append(" ");
            sb.append(s.replace(" ", "\u00A0")); // replace spaces by non breaking spaces
        }
        
        TextFlow labelFigure = new TextFlow(sb.toString());
        //TRACE: labelFigure.setBorder(new LineBorder(1));
        
        // XXX Workaround for silent diagram editor: since validation is synchronous, we must set the flow context before adding the figure.
        labelFigure.setFlowContext((FlowContext) this.topLabelsArea.getLayoutManager());
        this.topLabelsArea.add(labelFigure);
    }

    /**
     * Set the main label.
     * @param s the main label.
     */
    @objid ("7e7abe33-1dec-11e2-8cad-001ec947c8cc")
    public void setMainLabel(String s) {
        this.mainLabel.setText(s);
        revalidate();
    }

    /**
     * Set the labels displayed below the main label.
     * @param bottomLabels the bottom labels.
     */
    @objid ("7e7abe37-1dec-11e2-8cad-001ec947c8cc")
    public void setBottomLabels(List<String> bottomLabels) {
        if (bottomLabels == null || bottomLabels.isEmpty()) {
            if (this.bottomLabelsArea != null) {
                this.table.remove(this.bottomLabelsArea);
                this.bottomLabelsArea = null;
            }
        } else {
            if (this.bottomLabelsArea == null) {
                this.bottomLabelsArea = new BlockFlow();
                this.bottomLabelsArea.setHorizontalAligment(PositionConstants.CENTER);
                this.bottomLabelsArea.setFont(this.tagFont);
                this.bottomLabelsArea.setForegroundColor(this.mainLabel.getForegroundColor());
                //this.bottomLabelsArea.setOpaque(false);
                //TRACE: this.bottomLabelsArea.setBorder(new LineBorder(ColorConstants.blue, 1));
        
                // XXX Workaround for silent diagram editor: since validation is synchronous, we must set the flow context before adding the figure.
                this.bottomLabelsArea.setFlowContext((FlowContext) this.table.getLayoutManager());
                this.table.add(this.bottomLabelsArea);
            } else {
                // remove existing labels
                this.bottomLabelsArea.removeAll();
        
            }
        
            StringBuilder sb = new StringBuilder(bottomLabels.size() * 20);
        
            // add new label figures
            for (String s : bottomLabels) {
                if (sb.length() != 0)
                    sb.append("\n");
                sb.append(s);
            }
        
            TextFlow labelFigure = new TextFlow(sb.toString());
            // XXX Workaround for silent diagram editor: since validation is synchronous, we must set the flow context before adding the figure.
            labelFigure.setFlowContext((FlowContext) this.bottomLabelsArea.getLayoutManager());
            this.bottomLabelsArea.add(labelFigure);
        }
    }

    /**
     * Get the main label figure.
     * @return the main label figure.
     */
    @objid ("7e7abe3d-1dec-11e2-8cad-001ec947c8cc")
    TextFlow getMainLabelFigure() {
        return this.mainLabel;
    }

    @objid ("7e7abe44-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Color getTextColor() {
        return this.mainLabel.getForegroundColor();
    }

    @objid ("7e7abe49-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Font getTextFont() {
        return this.mainLabel.getFont();
    }

    @objid ("7e7abe4e-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setTextColor(Color textColor) {
        this.topLabelsArea.setForegroundColor(textColor);
        if (this.keywordLabel != null)
            this.keywordLabel.setForegroundColor(textColor);
        this.mainLabel.setForegroundColor(textColor);
        if (this.bottomLabelsArea != null)
            this.bottomLabelsArea.setForegroundColor(textColor);
    }

    @objid ("7e7abe52-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setTextFont(Font textFont) {
        updateDerivedFonts(textFont);
        
        this.topLabelsArea.setFont(this.stereotypeFont);
        if (this.keywordLabel != null)
            this.keywordLabel.setFont(this.stereotypeFont);
        this.mainLabel.setFont(textFont);
        if (this.bottomLabelsArea != null)
            this.bottomLabelsArea.setFont(this.tagFont);
    }

    @objid ("7e7abe56-1dec-11e2-8cad-001ec947c8cc")
    private void updateDerivedFonts(Font baseFont) {
        if (this.mainLabel.getFont() == baseFont && this.tagFont != null && this.stereotypeFont != null)
            return;
        
        FontData[] fontData = baseFont.getFontData();
        for (FontData data : fontData) {
            data.setHeight(deriveFontHeight(data.getHeight()));
        }
        this.stereotypeFont = CoreFontRegistry.getFont(fontData);
        this.tagFont = CoreFontRegistry.getModifiedFont(this.stereotypeFont, SWT.ITALIC);
    }

    @objid ("7e7abe59-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Color getLineColor() {
        return null;
    }

    @objid ("7e7abe5e-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public int getLineWidth() {
        return 0;
    }

    @objid ("7e7abe63-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setLineColor(Color lineColor) {
        // Nothing to do.
    }

    @objid ("7e7d2071-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setLineWidth(int lineWidth) {
        // Nothing to do.
    }

    @objid ("7e7d2075-1dec-11e2-8cad-001ec947c8cc")
    private int deriveFontHeight(int height) {
        switch (height) {
            case 8:
                return 7;
        
            case 9:
                return 7;
        
            case 10:
                return 8;
        
            case 11:
                return 8;
        
            case 12:
                return 9;
        
            case 13:
                return 10;
        
            case 14:
                return 10;
        
            default:
                if (height < 8)
                    return height;
                //else
                return height * 10 / 14;
        }
    }

    @objid ("7e7d2079-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Dimension getMinimumSize(int wHint, int hHint) {
        // Always ignore the vertical hint!
        return super.getMinimumSize(wHint, -1);
    }

    /**
     * Set whether the main label is underlined.
     * @param underline true to underline the main label
     */
    @objid ("7e7d2082-1dec-11e2-8cad-001ec947c8cc")
    public void setUnderline(final boolean underline) {
        this.mainLabel.setUnderline(underline);
    }

    /**
     * Set whether the main label is stroked through.
     * @param strikeThrough true to strike the label
     */
    @objid ("7e7d2087-1dec-11e2-8cad-001ec947c8cc")
    public void setStrikeThrough(final boolean strikeThrough) {
        this.mainLabel.setStrikeThrough(strikeThrough);
    }

    /**
     * This class implements a right-aligned ToolBarLayout, ie children are stacked on the right side of the toolbar.
     * NOTE: A ToolbarRLayout is always horizontal.
     */
    @objid ("7e7d208c-1dec-11e2-8cad-001ec947c8cc")
    private static class ToolbarRLayout extends ToolbarLayout {
        @objid ("7e7d2091-1dec-11e2-8cad-001ec947c8cc")
        @Override
        public void layout(IFigure parent) {
            super.layout(parent);
            final int Xl = parent.getBounds().x;
            final int Xr = parent.getBounds().right();
            
            for (Object obj : parent.getChildren()) {
                final IFigure child = (IFigure) obj;
                final Rectangle aBounds = child.getBounds().getCopy();
                child.translate(Xr - (aBounds.x - Xl) - aBounds.x - aBounds.width, 0);
            }
        }

        @objid ("7e7d2097-1dec-11e2-8cad-001ec947c8cc")
        public ToolbarRLayout() {
            super(true); // force horizontal
        }

    }

    /**
     * Same as {@link org.eclipse.draw2d.MarginBorder} for {@link FlowFigure}.
     */
    @objid ("7e7d2099-1dec-11e2-8cad-001ec947c8cc")
    private static final class MarginFlowBorder extends AbstractFlowBorder {
        @objid ("b9f5e485-e231-4e20-8e89-5d17bcec5502")
        private Insets inset;

        /**
         * Constructor.
         * @param inset the insets.
         */
        @objid ("7e7d20a1-1dec-11e2-8cad-001ec947c8cc")
        MarginFlowBorder(final Insets inset) {
            this.inset = inset;
        }

        @objid ("7e7d20a8-1dec-11e2-8cad-001ec947c8cc")
        @Override
        public Insets getInsets(final IFigure figure) {
            return this.inset;
        }

    }

    /**
     * Center area layout.
     * <p>
     * Fills all available space, center its content on the available space and tries to have a 2/1 width/height ratio.
     * 
     * @author cmarin
     */
    @objid ("7e7d20b3-1dec-11e2-8cad-001ec947c8cc")
    private static final class CenterAreaLayout extends GridLayout {
        @objid ("8d16fbb1-7e20-41a5-9a26-63cb762518ca")
        private Dimension cachedPreferredHint = new Dimension(-1, -1);

        @objid ("7e7f82cd-1dec-11e2-8cad-001ec947c8cc")
        CenterAreaLayout() {
            super(1, true);
        }

        @objid ("7e7f82cf-1dec-11e2-8cad-001ec947c8cc")
        @Override
        protected Dimension calculatePreferredSize(final IFigure cont, final int wHint, final int hHint) {
            Dimension ret = super.calculatePreferredSize(cont, wHint, hHint);
            if (ret.width / ret.height < 2)
                ret.width = Math.round(ret.height * 2);
            
            if (ret.width / ret.height > 8) {
                int r = 2 * (ret.width / ret.height) / 8;
                ret = super.calculatePreferredSize(cont, ret.width / r, hHint);
            }
            return ret;
        }

    }

}
