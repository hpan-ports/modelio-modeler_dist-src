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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmnlane.header;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.AbstractBackground;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.ImageUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.diagram.elements.common.header.GridLayoutFixed;
import org.modelio.diagram.elements.common.header.HeaderFigure;
import org.modelio.diagram.elements.core.figures.LabelFigure;

/**
 * Specialisation of HeaderFigure: all is rotated 90? counterclockwise.
 * 
 * @author fpoyer
 */
@objid ("611f1785-55b6-11e2-877f-002564c97630")
public class BpmnLaneHeaderFigure extends HeaderFigure {
    /**
     * Constructor.
     */
    @objid ("61209dfc-55b6-11e2-877f-002564c97630")
    public BpmnLaneHeaderFigure() {
        // The header figure is a border layouted container.
        // There are two children:
        // - the icons area layouted as LEFT
        // - the contents area layouted as CENTER
        // Children are transparent without borders
        this.setLayoutManager(new BorderLayout());
        
        // TRACE: this.setBorder(new LineBorder(ColorConstants.orange, 1));
        
        // TOP figure : the icon area
        // The icon area is a border layouted container
        this.iconsArea = new Figure();
        this.iconsArea.setLayoutManager(new BorderLayout());
        // TRACE: iconsArea.setBorder(new LineBorder(ColorConstants.green, 1));
        this.add(this.iconsArea, BorderLayout.LEFT);
        
        // left icons container
        // an horizontal toolbar layouted container, left aligned
        this.leftIconsContainer = new Figure();
        ToolbarLayout leftIconAreaLayout = new ToolbarLayout(false);
        leftIconAreaLayout.setMinorAlignment(ToolbarLayout.ALIGN_BOTTOMRIGHT);
        leftIconAreaLayout.setSpacing(1);
        this.leftIconsContainer.setLayoutManager(leftIconAreaLayout);
        // TRACE: leftIconsContainer.setBorder(new LineBorder(1));
        this.leftIconsContainer.setOpaque(false);
        this.iconsArea.add(this.leftIconsContainer, BorderLayout.BOTTOM);
        
        // right icons container
        // an horizontal toolbar layouted container, right aligned
        this.rightIconsContainer = new Figure();
        ToolbarLayout righIconAreaLayout = new ToolbarLayout(false);
        righIconAreaLayout.setMinorAlignment(ToolbarLayout.ALIGN_BOTTOMRIGHT);
        righIconAreaLayout.setSpacing(1);
        this.rightIconsContainer.setLayoutManager(righIconAreaLayout);
        // TRACE: rightIconsContainer.setBorder(new LineBorder(1));
        this.rightIconsContainer.setOpaque(false);
        this.iconsArea.add(this.rightIconsContainer, BorderLayout.TOP);
        
        // CENTER figure : the contents area
        // The contents area is a grid layouted figure holding a centered cell
        // child
        this.contentsArea = new Figure();
        // TRACE: contentsArea.setBorder(new LineBorder(ColorConstants.blue,
        // 1));
        GridLayout gl = new GridLayoutFixed(1, true);
        gl.marginHeight = 0;
        gl.marginWidth = 0;
        gl.verticalSpacing = 0;
        this.contentsArea.setLayoutManager(gl);
        this.add(this.contentsArea, BorderLayout.CENTER);
        
        this.table = new Figure();
        // TRACE table.setBorder(new LineBorder(ColorConstants.orange, 1));
        ToolbarLayout tbLayout = new ToolbarLayout(true);
        tbLayout.setStretchMinorAxis(true);
        tbLayout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
        this.table.setLayoutManager(tbLayout);
        GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, true);
        this.contentsArea.add(this.table, gd);
        
        // first row : Keyword label
        this.keywordLabel = new VerticalLabel("");
        this.keywordLabel.setLabelAlignment(PositionConstants.CENTER);
        this.keywordLabel.setOpaque(false);
        // TRACE: this.keywordLabel.setBorder(new
        // LineBorder(ColorConstants.blue, 1));
        
        this.table.add(this.keywordLabel, gd);
        
        // second row: top labels
        this.topLabelsArea = new Figure();
        ToolbarLayout topAreaLayout = new ToolbarLayout(true);
        topAreaLayout.setSpacing(0);
        topAreaLayout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
        topAreaLayout.setStretchMinorAxis(true);
        this.topLabelsArea.setLayoutManager(topAreaLayout);
        this.topLabelsArea.setOpaque(false);
        // TRACE: this.topLabelsArea.setBorder(new
        // LineBorder(ColorConstants.green, 1));
        this.table.add(this.topLabelsArea);
        
        // Fourth child: the main label area
        this.mainLabel = new VerticalLabel();
        this.mainLabel.setLabelAlignment(PositionConstants.CENTER);
        this.mainLabel.setBorder(new MarginBorder(2, 0, 4, 0));
        // TRACE: this.mainLabel.setBorder(new LineBorder(ColorConstants.blue,
        // 1));
        this.table.add(this.mainLabel);
        
        // Fifth child: bottom labels
        this.bottomLabelsArea = new Figure();
        ToolbarLayout bottomAreaLayout = new ToolbarLayout(true);
        bottomAreaLayout.setSpacing(0);
        bottomAreaLayout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
        bottomAreaLayout.setStretchMinorAxis(true);
        this.bottomLabelsArea.setLayoutManager(bottomAreaLayout);
        this.bottomLabelsArea.setOpaque(false);
        // TRACE: this.bottomLabelsArea.setBorder(new
        // LineBorder(ColorConstants.blue, 1));
        this.table.add(this.bottomLabelsArea);
    }

    /**
     * Set the icons displayed on the upper left corner.
     * @param icons The left icons
     */
    @objid ("61209dff-55b6-11e2-877f-002564c97630")
    @Override
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
    @objid ("61209e06-55b6-11e2-877f-002564c97630")
    @Override
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
    @objid ("61209e0d-55b6-11e2-877f-002564c97630")
    @Override
    public void setKeywordLabel(String text) {
        if (text == null) {
            if (this.keywordLabel != null) {
                this.table.remove(this.keywordLabel);
                this.keywordLabel = null;
            }
        } else {
            if (this.keywordLabel != null) {
                this.keywordLabel.setText(text);
            } else {
                this.keywordLabel = new VerticalLabel("");
                this.keywordLabel.setLabelAlignment(PositionConstants.CENTER);
                this.keywordLabel.setOpaque(false);
                this.keywordLabel.setFont(this.stereotypeFont);
                // TRACE: this.keywordLabel.setBorder(new
                // LineBorder(ColorConstants.blue, 1));
        
                this.table.add(this.keywordLabel, 1);
            }
        
        }
    }

    /**
     * Set the labels displayed on top of the main label.
     * @param topLabels the top labels.
     */
    @objid ("61209e12-55b6-11e2-877f-002564c97630")
    @Override
    public void setTopLabels(List<String> topLabels) {
        // remove existing labels
        this.topLabelsArea.removeAll();
        
        // add new label figures
        for (String s : topLabels) {
            VerticalLabel labelFigure = new VerticalLabel(s);
            // TRACE: labelFigure.setBorder(new LineBorder(1));
            labelFigure.setTextAlignment(PositionConstants.CENTER);
            this.topLabelsArea.add(labelFigure);
        }
    }

    /**
     * Set the main label.
     * @param s the main label.
     */
    @objid ("61209e19-55b6-11e2-877f-002564c97630")
    @Override
    public void setMainLabel(String s) {
        this.mainLabel.setText(s);
    }

    /**
     * Set the labels displayed below the main label.
     * @param bottomLabels the bottom labels.
     */
    @objid ("61209e1e-55b6-11e2-877f-002564c97630")
    @Override
    public void setBottomLabels(List<String> bottomLabels) {
        // remove existing labels
        this.bottomLabelsArea.removeAll();
        
        // add new label figures
        for (String s : bottomLabels) {
            VerticalLabel labelFigure = new VerticalLabel(s);
            labelFigure.setTextAlignment(PositionConstants.CENTER);
            this.bottomLabelsArea.add(labelFigure);
        }
    }

    @objid ("61209e25-55b6-11e2-877f-002564c97630")
    @Override
    public Color getTextColor() {
        return this.mainLabel.getForegroundColor();
    }

    @objid ("61209e2a-55b6-11e2-877f-002564c97630")
    @Override
    public Font getTextFont() {
        return this.mainLabel.getFont();
    }

    @objid ("61209e2f-55b6-11e2-877f-002564c97630")
    @Override
    public void setTextColor(Color textColor) {
        this.topLabelsArea.setForegroundColor(textColor);
        if (this.keywordLabel != null)
            this.keywordLabel.setForegroundColor(textColor);
        this.mainLabel.setForegroundColor(textColor);
        this.bottomLabelsArea.setForegroundColor(textColor);
    }

    @objid ("61209e33-55b6-11e2-877f-002564c97630")
    @Override
    public void setTextFont(Font textFont) {
        updateDerivedFonts(textFont);
        
        this.topLabelsArea.setFont(this.stereotypeFont);
        if (this.keywordLabel != null)
            this.keywordLabel.setFont(this.stereotypeFont);
        this.mainLabel.setFont(textFont);
        this.bottomLabelsArea.setFont(this.tagFont);
    }

    @objid ("61222499-55b6-11e2-877f-002564c97630")
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

    @objid ("6122249c-55b6-11e2-877f-002564c97630")
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
                // else
                return height * 10 / 14;
        }
    }

    @objid ("612224a0-55b6-11e2-877f-002564c97630")
    @Override
    public Dimension getMinimumSize(int wHint, int hHint) {
        // Always ignore the horizontal hint!
        return super.getMinimumSize(-1, hHint);
    }

    /**
     * Return the main label figure.
     * @return the main label figure.
     */
    @objid ("612224a7-55b6-11e2-877f-002564c97630")
    public Label getMainLabel() {
        return this.mainLabel;
    }

    @objid ("612224ac-55b6-11e2-877f-002564c97630")
    @Override
    public void setFillColor(final Color textColor) {
        this.topLabelsArea.setBackgroundColor(textColor);
        if (this.keywordLabel != null)
            this.keywordLabel.setBackgroundColor(textColor);
        this.mainLabel.setBackgroundColor(textColor);
        this.bottomLabelsArea.setBackgroundColor(textColor);
    }

    /**
     * This class implements a right-aligned ToolBarLayout, ie children are stacked on the right side of the toolbar.
     * NOTE: A ToolbarRLayout is always horizontal.
     */
    @objid ("612224b1-55b6-11e2-877f-002564c97630")
    class ToolbarRLayout extends ToolbarLayout {
        /**
         * C'tor.
         * @param isHorizontal should always be false.
         */
        @objid ("612224b3-55b6-11e2-877f-002564c97630")
        public ToolbarRLayout(boolean isHorizontal) {
            super(isHorizontal);
        }

        @objid ("612224b7-55b6-11e2-877f-002564c97630")
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

        /**
         * Default C'tor.
         */
        @objid ("612224bb-55b6-11e2-877f-002564c97630")
        public ToolbarRLayout() {
            super(false); // force horizontal
        }

    }

    /**
     * Same as label, only vertical.
     * 
     * @author fpoyer
     */
    @objid ("612224be-55b6-11e2-877f-002564c97630")
    static class VerticalLabel extends LabelFigure {
        @objid ("612224c3-55b6-11e2-877f-002564c97630")
        private String ELLIPSIS = "..."; // $NON-NLS-1$

        @objid ("612224c6-55b6-11e2-877f-002564c97630")
        private String text = ""; // $NON-NLS-1$

        @objid ("612224c8-55b6-11e2-877f-002564c97630")
        private String subStringText;

        @objid ("612224ce-55b6-11e2-877f-002564c97630")
        private int textAlignment = CENTER;

        @objid ("612224cf-55b6-11e2-877f-002564c97630")
        private int iconAlignment = CENTER;

        @objid ("612224d0-55b6-11e2-877f-002564c97630")
        private int labelAlignment = CENTER;

        @objid ("612224d1-55b6-11e2-877f-002564c97630")
        private int textPlacement = NORTH;

        @objid ("612224d2-55b6-11e2-877f-002564c97630")
        private int iconTextGap = 3;

        @objid ("612224c5-55b6-11e2-877f-002564c97630")
        private Image icon;

        @objid ("2aab6dac-0d72-4e8e-8eae-edb3b71a7de5")
        private Dimension textSize;

        @objid ("9ff58d23-1b7e-486d-8ffa-6498d1a5e439")
        private Dimension subStringTextSize;

        @objid ("aa20adf4-b19d-468e-8b13-8542f0ce9135")
        private Dimension iconSize = new Dimension(0, 0);

        @objid ("6b4be28f-24f7-4d0c-b1f9-8645f05658d6")
        private Point iconLocation;

        @objid ("6cbeee06-fd04-4c80-8153-bc6188ea315b")
        private Point textLocation;

        /**
         * Construct an empty VerticalLabel.
         */
        @objid ("612224d3-55b6-11e2-877f-002564c97630")
        public VerticalLabel() {
            // Nothing to do.
        }

        /**
         * Construct a VerticalLabel with passed String as its text.
         * @param s the label text
         */
        @objid ("6123ab39-55b6-11e2-877f-002564c97630")
        public VerticalLabel(String s) {
            setText(s);
        }

        /**
         * Construct a VerticalLabel with passed Image as its icon.
         * @param i the label image
         */
        @objid ("6123ab3d-55b6-11e2-877f-002564c97630")
        public VerticalLabel(Image i) {
            setIcon(i);
        }

        /**
         * Construct a VerticalLabel with passed String as text and passed Image as its icon.
         * @param s the label text
         * @param i the label image
         */
        @objid ("6123ab41-55b6-11e2-877f-002564c97630")
        public VerticalLabel(String s, Image i) {
            setText(s);
            setIcon(i);
        }

        @objid ("6123ab46-55b6-11e2-877f-002564c97630")
        private void alignOnwidth(Point loc, Dimension size, int alignment) {
            Insets insets = getInsets();
            switch (alignment) {
                case LEFT:
                    loc.y = insets.top;
                    break;
                case RIGHT:
                    loc.y = this.bounds.width - size.width - insets.bottom;
                    break;
                default:
                    loc.y = (this.bounds.width - size.width) / 2;
            }
        }

        @objid ("6123ab4b-55b6-11e2-877f-002564c97630")
        private void alignOnheight(Point loc, Dimension size, int alignment) {
            Insets insets = getInsets();
            switch (alignment) {
                case BOTTOM:
                    loc.x = insets.left;
                    break;
                case TOP:
                    loc.x = this.bounds.height - size.height - insets.right;
                    break;
                default:
                    loc.x = (this.bounds.height - size.height) / 2;
            }
        }

        @objid ("6123ab50-55b6-11e2-877f-002564c97630")
        private void calculateAlignment() {
            switch (this.textPlacement) {
                case NORTH:
                case SOUTH:
                    alignOnwidth(this.textLocation, getTextSize(), this.textAlignment);
                    alignOnwidth(this.iconLocation, getIconSize(), this.iconAlignment);
                    break;
                case WEST:
                case EAST:
                    alignOnheight(this.textLocation, getSubStringTextSize(), this.textAlignment);
                    alignOnheight(this.iconLocation, getIconSize(), this.iconAlignment);
                    break;
            }
        }

        /**
         * Calculates the size of the Label using the passed Dimension as the size of the Label's text.
         * @param txtSize the precalculated size of the label's text
         * @return the label's size
         */
        @objid ("6123ab52-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension calculateLabelSize(Dimension txtSize) {
            int gap = getIconTextGap();
            if (getIcon() == null || getText().equals("")) //$NON-NLS-1$
                gap = 0;
            Dimension d = new Dimension(0, 0);
            if (this.textPlacement == SOUTH || this.textPlacement == NORTH) {
                d.height = getIconSize().height + gap + txtSize.height;
                d.width = Math.max(getIconSize().width, txtSize.width);
            } else {
                d.height = Math.max(getIconSize().height, txtSize.height);
                d.width = getIconSize().width + gap + txtSize.width;
            }
            return d;
        }

        @objid ("6123ab59-55b6-11e2-877f-002564c97630")
        private void calculateLocations() {
            this.textLocation = new Point();
            this.iconLocation = new Point();
            
            calculatePlacement();
            calculateAlignment();
            Dimension offset = getSize().getShrinked(getPreferredSize());
            offset.height += getTextSize().height - getSubStringTextSize().height;
            switch (this.labelAlignment) {
                case CENTER:
                    offset.scale(0.5f);
                    break;
                case BOTTOM:
                    offset.scale(0.0f);
                    break;
                case TOP:
                    offset.scale(1.0f);
                    break;
                case LEFT:
                    offset.width = 0;
                    offset.scale(0.5f);
                    break;
                case RIGHT:
                    offset.width = offset.width * 2;
                    offset.scale(0.5f);
                    break;
                default:
                    offset.scale(0.5f);
                    break;
            }
            
            switch (this.textPlacement) {
                case NORTH:
                case SOUTH:
                    offset.width = 0;
                    break;
                case WEST:
                case EAST:
                    offset.height = 0;
                    break;
            }
            
            this.textLocation.translate(offset);
            this.iconLocation.translate(offset);
        }

        @objid ("6123ab5b-55b6-11e2-877f-002564c97630")
        private void calculatePlacement() {
            int gap = getIconTextGap();
            if (this.icon == null || this.text.equals("")) //$NON-NLS-1$
                gap = 0;
            Insets insets = getInsets();
            
            switch (this.textPlacement) {
                case NORTH:
                    this.iconLocation.x = insets.left;
                    this.textLocation.x = getIconSize().height + gap + insets.left;
                    break;
                case SOUTH:
                    this.textLocation.x = insets.left;
                    this.iconLocation.x = getSubStringTextSize().height + gap + insets.left;
                    break;
                case WEST:
                    this.textLocation.y = insets.top;
                    this.iconLocation.y = getTextSize().width + gap + insets.top;
                    break;
                case EAST:
                    this.textLocation.y = getIconSize().width + gap + insets.top;
                    this.iconLocation.y = insets.top;
            }
        }

        /**
         * Calculates the size of the Label's text size. The text size calculated takes into consideration if the
         * Label's text is currently truncated. If text size without considering current truncation is desired, use
         * {@link #calculateTextSize()}.
         * @return the size of the label's text, taking into account truncation
         * @since 2.0
         */
        @objid ("6123ab5d-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension calculateSubStringTextSize() {
            return getTextUtilities().getTextExtents(getSubStringText(), getFont()).getTransposed();
        }

        /**
         * Calculates and returns the size of the Label's text. Note that this Dimension is calculated using the Label's
         * full text, regardless of whether or not its text is currently truncated. If text size considering current
         * truncation is desired, use {@link #calculateSubStringTextSize()}.
         * @return the size of the label's text, ignoring truncation
         * @since 2.0
         */
        @objid ("6123ab63-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension calculateTextSize() {
            return getTextUtilities().getTextExtents(getText(), getFont()).getTransposed();
        }

        @objid ("6123ab69-55b6-11e2-877f-002564c97630")
        private void clearLocations() {
            this.iconLocation = this.textLocation = null;
        }

        /**
         * Returns the Label's icon.
         * @return the label icon
         * @since 2.0
         */
        @objid ("6123ab6b-55b6-11e2-877f-002564c97630")
        @Override
        public Image getIcon() {
            return this.icon;
        }

        /**
         * Returns the current alignment of the Label's icon. The default is {@link PositionConstants#CENTER}.
         * @return the icon alignment
         * @since 2.0
         */
        @objid ("612531da-55b6-11e2-877f-002564c97630")
        @Override
        public int getIconAlignment() {
            return this.iconAlignment;
        }

        /**
         * Returns the bounds of the Label's icon.
         * @return the icon's bounds
         * @since 2.0
         */
        @objid ("612531e0-55b6-11e2-877f-002564c97630")
        @Override
        public Rectangle getIconBounds() {
            Rectangle currentBounds = getBounds();
            return new Rectangle(currentBounds.getLocation().translate(getIconLocation()), getIconSize());
        }

        /**
         * Returns the location of the Label's icon relative to the Label.
         * @return the icon's location
         * @since 2.0
         */
        @objid ("612531e6-55b6-11e2-877f-002564c97630")
        @Override
        protected Point getIconLocation() {
            if (this.iconLocation == null)
                calculateLocations();
            return this.iconLocation;
        }

        /**
         * Returns the gap in pixels between the Label's icon and its text.
         * @return the gap
         * @since 2.0
         */
        @objid ("612531ec-55b6-11e2-877f-002564c97630")
        @Override
        public int getIconTextGap() {
            return this.iconTextGap;
        }

        /**
         * @see IFigure#getMinimumSize(int, int)
         */
        @objid ("612531f2-55b6-11e2-877f-002564c97630")
        @Override
        public Dimension getMinimumSize(int w, int h) {
            if (this.minSize != null)
                return this.minSize;
            this.minSize = new Dimension();
            if (getLayoutManager() != null)
                this.minSize.setSize(getLayoutManager().getMinimumSize(this, w, h));
            
            Dimension labelSize = calculateLabelSize(getTextUtilities().getTextExtents(getTruncationString(),
                                                                                       getFont())
                                                                       .getTransposed()
                                                                       .intersect(getTextUtilities().getTextExtents(getText(),
                                                                                                                    getFont())
                                                                                                    .getTransposed()));
            Insets insets = getInsets();
            labelSize.expand(insets.getHeight(), insets.getWidth());
            this.minSize.union(labelSize);
            return this.minSize;
        }

        /**
         * @see IFigure#getPreferredSize(int, int)
         */
        @objid ("612531fa-55b6-11e2-877f-002564c97630")
        @Override
        public Dimension getPreferredSize(int wHint, int hHint) {
            if (this.prefSize == null) {
                this.prefSize = calculateLabelSize(getTextSize());
                Insets insets = getInsets();
                this.prefSize.expand(insets.getHeight(), insets.getWidth());
                if (getLayoutManager() != null)
                    this.prefSize.union(getLayoutManager().getPreferredSize(this, wHint, hHint));
            }
            if (hHint >= 0 && hHint < this.prefSize.height) {
                Dimension minimumSize = getMinimumSize(wHint, hHint);
                Dimension result = this.prefSize.getCopy();
                result.height = Math.min(result.height, hHint);
                result.height = Math.max(minimumSize.height, result.height);
                return result;
            }
            return this.prefSize;
        }

        /**
         * Calculates the amount of the Label's current text will fit in the Label, including an elipsis "..." if
         * truncation is required.
         * @return the substring
         * @since 2.0
         */
        @objid ("61253202-55b6-11e2-877f-002564c97630")
        @Override
        public String getSubStringText() {
            if (this.subStringText != null)
                return this.subStringText;
            
            this.subStringText = this.text;
            int heightShrink = getPreferredSize().height - getSize().height;
            if (heightShrink <= 0)
                return this.subStringText;
            
            Dimension effectiveSize = getTextSize().getExpanded(0, -heightShrink);
            Font currentFont = getFont();
            int dotsheight = getTextUtilities().getTextExtents(getTruncationString(), currentFont)
                                               .getTransposed().height;
            
            if (effectiveSize.height < dotsheight)
                effectiveSize.height = dotsheight;
            
            int subStringLength = getTextUtilities().getLargestSubstringConfinedTo(this.text,
                                                                                   currentFont,
                                                                                   effectiveSize.height -
                                                                                           dotsheight);
            this.subStringText = new String(this.text.substring(0, subStringLength) + getTruncationString());
            return this.subStringText;
        }

        /**
         * Returns the size of the Label's current text. If the text is currently truncated, the truncated text with its
         * ellipsis is used to calculate the size.
         * @return the size of this label's text, taking into account truncation
         * @since 2.0
         */
        @objid ("61253208-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension getSubStringTextSize() {
            if (this.subStringTextSize == null)
                this.subStringTextSize = calculateSubStringTextSize();
            return this.subStringTextSize;
        }

        /**
         * Returns the text of the label. Note that this is the complete text of the label, regardless of whether it is
         * currently being truncated. Call {@link #getSubStringText()} to return the label's current text contents with
         * truncation considered.
         * @return the complete text of this label
         * @since 2.0
         */
        @objid ("6125320e-55b6-11e2-877f-002564c97630")
        @Override
        public String getText() {
            return this.text;
        }

        /**
         * Returns the current alignment of the Label's text. The default text alignment is
         * {@link PositionConstants#CENTER}.
         * @return the text alignment
         */
        @objid ("6126b87a-55b6-11e2-877f-002564c97630")
        @Override
        public int getTextAlignment() {
            return this.textAlignment;
        }

        /**
         * Returns the bounds of the label's text. Note that the bounds are calculated using the label's complete text
         * regardless of whether the label's text is currently truncated.
         * @return the bounds of this label's complete text
         * @since 2.0
         */
        @objid ("6126b880-55b6-11e2-877f-002564c97630")
        @Override
        public Rectangle getTextBounds() {
            Rectangle currentBounds = getBounds();
            return new Rectangle(currentBounds.getLocation().translate(getTextLocation()), this.textSize);
        }

        /**
         * Returns the location of the label's text relative to the label.
         * @return the text location
         * @since 2.0
         */
        @objid ("6126b886-55b6-11e2-877f-002564c97630")
        @Override
        protected Point getTextLocation() {
            if (this.textLocation != null)
                return this.textLocation;
            calculateLocations();
            return this.textLocation;
        }

        /**
         * Returns the current placement of the label's text relative to its icon. The default text placement is
         * {@link PositionConstants#EAST}.
         * @return the text placement
         * @since 2.0
         */
        @objid ("6126b88c-55b6-11e2-877f-002564c97630")
        @Override
        public int getTextPlacement() {
            return this.textPlacement;
        }

        /**
         * Returns the size of the label's complete text. Note that the text used to make this calculation is the
         * label's full text, regardless of whether the label's text is currently being truncated and is displaying an
         * ellipsis. If the size considering current truncation is desired, call {@link #getSubStringTextSize()}.
         * @return the size of this label's complete text
         * @since 2.0
         */
        @objid ("6126b892-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension getTextSize() {
            if (this.textSize == null)
                this.textSize = calculateTextSize();
            return this.textSize;
        }

        /**
         * @see IFigure#invalidate()
         */
        @objid ("6126b898-55b6-11e2-877f-002564c97630")
        @Override
        public void invalidate() {
            this.prefSize = null;
            this.minSize = null;
            clearLocations();
            this.textSize = null;
            this.subStringTextSize = null;
            this.subStringText = null;
            super.invalidate();
        }

        /**
         * Returns <code>true</code> if the label's text is currently truncated and is displaying an ellipsis,
         * <code>false</code> otherwise.
         * @return <code>true</code> if the label's text is truncated
         * @since 2.0
         */
        @objid ("6126b89c-55b6-11e2-877f-002564c97630")
        @Override
        public boolean isTextTruncated() {
            return !getSubStringText().equals(getText());
        }

        /**
         * @see Figure#paintFigure(Graphics)
         */
        @objid ("6126b8a2-55b6-11e2-877f-002564c97630")
        @Override
        protected void paintFigure(Graphics graphics) {
            if (isOpaque()) {
                if (isOpaque())
                    graphics.fillRectangle(getBounds());
                if (getBorder() instanceof AbstractBackground)
                    ((AbstractBackground) getBorder()).paintBackground(this, graphics, NO_INSETS);
            }
            Image foo = createRotatedImageOfString(graphics.getAbsoluteScale(),
                                                   getSubStringText(),
                                                   getFont(),
                                                   getForegroundColor(),
                                                   getBackgroundColor());
            double scale = graphics.getAbsoluteScale();
            graphics.pushState();
            
            graphics.scale(1 / scale);
            Point topLeft = getBounds().getTopLeft();
            
            topLeft = new PrecisionPoint(topLeft.x * scale, topLeft.y * scale);
            graphics.drawImage(foo, topLeft);
            graphics.popState();
            
            foo.dispose();
        }

        /**
         * Sets the label's icon to the passed image.
         * @param image the new label image
         * @since 2.0
         */
        @objid ("6126b8a7-55b6-11e2-877f-002564c97630")
        @Override
        public void setIcon(Image image) {
            if (this.icon == image)
                return;
            this.icon = image;
            // Call repaint, in case the image dimensions are the same.
            repaint();
            if (this.icon == null)
                setIconDimension(new Dimension());
            else
                setIconDimension(new Dimension(image));
        }

        /**
         * This method sets the alignment of the icon within the bounds of the label. If the label is larger than the
         * icon, then the icon will be aligned according to this alignment. Valid values are:
         * <UL>
         * <LI><EM>{@link PositionConstants#CENTER}</EM>
         * <LI>{@link PositionConstants#TOP}
         * <LI>{@link PositionConstants#BOTTOM}
         * <LI>{@link PositionConstants#LEFT}
         * <LI>{@link PositionConstants#RIGHT}
         * </UL>
         * @param align the icon alignment
         * @since 2.0
         */
        @objid ("61283f19-55b6-11e2-877f-002564c97630")
        @Override
        public void setIconAlignment(int align) {
            if (this.iconAlignment == align)
                return;
            this.iconAlignment = align;
            clearLocations();
            repaint();
        }

        /**
         * Sets the label's icon size to the passed Dimension.
         * @param d the new icon size
         * @deprecated the icon is automatically displayed at 1:1
         * @since 2.0
         */
        @objid ("61283f1e-55b6-11e2-877f-002564c97630")
        @Deprecated
        @Override
        public void setIconDimension(Dimension d) {
            if (d.equals(getIconSize()))
                return;
            this.iconSize = d;
            revalidate();
        }

        /**
         * Sets the gap in pixels between the label's icon and text to the passed value. The default is 4.
         * @param gap the gap
         * @since 2.0
         */
        @objid ("61283f23-55b6-11e2-877f-002564c97630")
        @Override
        public void setIconTextGap(int gap) {
            if (this.iconTextGap == gap)
                return;
            this.iconTextGap = gap;
            repaint();
            revalidate();
        }

        /**
         * Sets the alignment of the label (icon and text) within the figure. If this figure's bounds are larger than
         * the size needed to display the label, the label will be aligned accordingly. Valid values are:
         * <UL>
         * <LI><EM>{@link PositionConstants#CENTER}</EM>
         * <LI>{@link PositionConstants#TOP}
         * <LI>{@link PositionConstants#BOTTOM}
         * <LI>{@link PositionConstants#LEFT}
         * <LI>{@link PositionConstants#RIGHT}
         * </UL>
         * @param align label alignment
         */
        @objid ("61283f28-55b6-11e2-877f-002564c97630")
        @Override
        public void setLabelAlignment(int align) {
            if (this.labelAlignment == align)
                return;
            this.labelAlignment = align;
            clearLocations();
            repaint();
        }

        /**
         * Sets the label's text.
         * @param s the new label text
         * @since 2.0
         */
        @objid ("61283f2d-55b6-11e2-877f-002564c97630")
        @Override
        public void setText(String s) {
            String string = s;
            // "text" will never be null.
            if (string == null)
                string = "";//$NON-NLS-1$
            if (this.text.equals(string))
                return;
            this.text = string;
            revalidate();
            repaint();
        }

        /**
         * Sets the alignment of the text relative to the icon within the label. The text alignment must be orthogonal
         * to the text placement. For example, if the placement is EAST, then the text can be aligned using TOP, CENTER,
         * or BOTTOM. Valid values are:
         * <UL>
         * <LI><EM>{@link PositionConstants#CENTER}</EM>
         * <LI>{@link PositionConstants#TOP}
         * <LI>{@link PositionConstants#BOTTOM}
         * <LI>{@link PositionConstants#LEFT}
         * <LI>{@link PositionConstants#RIGHT}
         * </UL>
         * @see #setLabelAlignment(int)
         * @param align the text alignment
         * @since 2.0
         */
        @objid ("61283f32-55b6-11e2-877f-002564c97630")
        @Override
        public void setTextAlignment(int align) {
            if (this.textAlignment == align)
                return;
            this.textAlignment = align;
            clearLocations();
            repaint();
        }

        /**
         * Sets the placement of the text relative to the icon within the label. Valid values are:
         * <UL>
         * <LI><EM>{@link PositionConstants#EAST}</EM>
         * <LI>{@link PositionConstants#NORTH}
         * <LI>{@link PositionConstants#SOUTH}
         * <LI>{@link PositionConstants#WEST}
         * </UL>
         * @param where the text placement
         * @since 2.0
         */
        @objid ("61283f37-55b6-11e2-877f-002564c97630")
        @Override
        public void setTextPlacement(int where) {
            if (this.textPlacement == where)
                return;
            this.textPlacement = where;
            revalidate();
            repaint();
        }

        /**
         * Gets the <code>TextUtilities</code> instance to be used in measurement calculations.
         * @return a <code>TextUtilities</code> instance
         * @since 3.4
         */
        @objid ("61283f3c-55b6-11e2-877f-002564c97630")
        @Override
        public TextUtilities getTextUtilities() {
            return TextUtilities.INSTANCE;
        }

        /**
         * Gets the string that will be appended to the text when the label is truncated. By default, this returns an
         * ellipsis.
         * @return the string to append to the text when truncated
         * @since 3.4
         */
        @objid ("61283f42-55b6-11e2-877f-002564c97630")
        @Override
        protected String getTruncationString() {
            return this.ELLIPSIS;
        }

        /**
         * Gets the icon size
         * @return the icon size
         * @since 3.4
         */
        @objid ("6129c5b9-55b6-11e2-877f-002564c97630")
        @Override
        protected Dimension getIconSize() {
            return this.iconSize;
        }

        /**
         * Returns the alignment of the entire label (icon and text). The default label alignment is
         * {@link PositionConstants#CENTER}.
         * @return the label alignment
         * @since 3.5
         */
        @objid ("6129c5bf-55b6-11e2-877f-002564c97630")
        @Override
        public int getLabelAlignment() {
            return this.labelAlignment;
        }

        /**
         * Do not use the ImageUtilities version, as it has issues with zoom.
         * @param scale the double scale to use
         * @param string the String to be rendered
         * @param font the font
         * @param foreground the text's color
         * @param background the background color
         * @return an Image which must be disposed
         */
        @objid ("6129c5c5-55b6-11e2-877f-002564c97630")
        public static Image createRotatedImageOfString(double scale, String string, Font font, Color foreground, Color background) {
            Display display = Display.getCurrent();
            if (display == null) {
                SWT.error(SWT.ERROR_THREAD_INVALID_ACCESS);
            }
            
            FontData[] fontDatas = font.getFontData();
            // Take all font datas, mac and linux specific
            for (FontData data : fontDatas) {
                data.setHeight((int) (data.getHeight() * scale));
            }
            
            // Create the new font
            Font zoomedFont = CoreFontRegistry.getFont(fontDatas);
            // Get the dimension in this font
            Dimension strDim = FigureUtilities.getTextExtents(string, zoomedFont);
            if (strDim.width == 0 || strDim.height == 0) {
                strDim = FigureUtilities.getTextExtents(string, font);
            }
            
            // Create an empty image.
            Image srcImage = new Image(display, strDim.width, strDim.height);
            
            // Draw the text in the image
            GC gc = new GC(srcImage);
            gc.setFont(zoomedFont);
            
            gc.setForeground(foreground);
            gc.setBackground(background);
            gc.drawText(string, gc.getClipping().x, gc.getClipping().y);
            gc.dispose();
            
            // Rotate the image
            Image rotated = ImageUtilities.createRotatedImage(srcImage);
            srcImage.dispose();
            
            // Get the image data of the rotated image
            ImageData data = rotated.getImageData();
            rotated.dispose();
            
            // Set the background color as transparent color
            int whitePixel = data.palette.getPixel(background.getRGB());
            data.transparentPixel = whitePixel;
            
            // Return the rotated image with transparency
            return new Image(display, data);
        }

    }

}
