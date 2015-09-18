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
                                    

package org.modelio.diagram.elements.core.figures.labelum;

import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionDimension;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;

/**
 * This is a rotatable wrapped label with an icon .
 * <p>
 * The word wrap strategy is set using a {@link ILabelumTextLayouter}.
 * <p>
 * <h3>Implementation:</h3>
 * <li> It is derived from the {@link Label} implementation.
 * <li> It can be viewed as a rectangle containing a rotated rectangle that
 * take the maximum place.
 */
@objid ("40f780d8-45b2-488a-bbd5-92127d2ccf12")
@SuppressWarnings("incomplete-switch")
public class LabelumFigure extends Figure implements PositionConstants {
    @objid ("4539091d-b35d-42d1-9c65-db3caa478ded")
    private boolean underline = false;

    @objid ("cfe635e2-ad26-4e12-b1c0-a3ec1b287a28")
    private boolean strikeThrough = false;

    @objid ("45a72aca-91e9-4a70-9e68-223bc6f5f163")
    private int orientation = 10;

    @objid ("1bdd77d0-6436-4084-89b0-4b95b3ffcff4")
    private String subStringText;

    @objid ("5b107b27-90b4-4282-870c-28338d37cc52")
    private static String ELLIPSIS = "..."; // $NON-NLS-1$

    @objid ("ab21b6a3-1d50-4903-9b92-4b221ec8568a")
    private String text = ""; // $NON-NLS-1$

    @objid ("ed0c38c0-9d92-48f5-b7a3-dcbd8bf95561")
    private int textAlignment = CENTER;

    @objid ("39c8428f-4885-429f-9b88-10e4212c604a")
    private int iconAlignment = CENTER;

    @objid ("89a28b84-6ae6-4b29-9d52-28175933ea5d")
    private int labelAlignment = CENTER;

    @objid ("2cedf9be-346b-4685-87bd-5d428b57f6df")
    private int textPlacement = EAST;

    @objid ("a9b8c818-8468-42e7-b107-1f6a76576fe4")
    private int iconTextGap = 3;

    @objid ("3fbb86f9-824a-4e55-a8f2-8f6464811d80")
    private ILabelumTextLayouter labellumLayouter = WordBreakTextLayouter.INSTANCE;

    @objid ("24358d17-3cbe-43d5-a48c-d84063f42484")
    private StyleRange[] styleRanges;

    @objid ("3334e4ea-067a-4e75-9658-41058379b4dc")
    private static TextLayout layout = null;

    /**
     * The inner rotated rectangle coordinates.
     */
    @objid ("77ae41b5-78e7-45af-93e3-7378ab0dc58d")
    private Rectangle innerRectangle;

    @objid ("068a8d0b-91b3-4f5f-b1b8-2c647e95c8ce")
    private Image icon;

    @objid ("3df57a7e-2122-459e-ae86-d0b9c0d7702e")
    private Dimension textSize;

    @objid ("271e5f87-8ba4-44f5-a13f-c0ff674d6fc7")
    private Dimension subStringTextSize;

    @objid ("86a60302-2be2-49f8-9fde-07091dc0ebf5")
    private Dimension iconSize = new Dimension(0, 0);

    @objid ("9a42e983-ce39-48e7-9d4e-7ecdc02195aa")
    private Point iconLocation;

    @objid ("05b23814-78c6-42e1-b9bb-676906e56616")
    private Point textLocation;

    /**
     * Creates an empty label figure.
     */
    @objid ("a0ae666b-bb4e-4dce-9576-f88f13eb9274")
    public LabelumFigure() {
    }

    @objid ("50a44741-d2c6-4f37-b6a7-b1c28ef6720d")
    @Override
    protected void paintFigure(final Graphics graphics) {
        if (isOpaque())
            super.paintFigure(graphics);
        
        Rectangle lbounds = getBounds();
        graphics.translate(lbounds.x, lbounds.y);
        
        if (this.orientation != 0) {
            graphics.pushState();
            final Rectangle innerRect = getInnerRectangle();
            graphics.translate((float)innerRect.preciseX(), (float)innerRect.preciseY());
            graphics.rotate(-this.orientation);
            graphics.drawRectangle(0, 0, innerRect.width(), innerRect.height);
        }
        
        if (this.icon != null)
            graphics.drawImage(this.icon, getIconLocation());
        
        final Point lTextLocation = getTextLocation();
        graphics.translate(lTextLocation.x, lTextLocation.y);
        
        TextLayout tl = getTextLayout();
        String draw = getSubStringText();
        setupTextLayout(tl, draw);
        
        if (!isEnabled()) {
            graphics.translate(1, 1);
            graphics.setForegroundColor(ColorConstants.buttonLightest);
            
            graphics.drawTextLayout(tl, 0, 0);
            
            graphics.translate(-1, -1);
            graphics.setForegroundColor(ColorConstants.buttonDarker);
        }
        
        graphics.drawTextLayout(tl, 0, 0);
        
        if (this.orientation != 0) {
            graphics.popState();
        }
        
        graphics.translate(-lTextLocation.x, -lTextLocation.y);
        graphics.translate(-lbounds.x, -lbounds.y);
    }

    /**
     * Provides a TextLayout that can be used by the Draw2d text package for Bidi. This TextLayout should not be
     * disposed by clients. The provided TextLayout's orientation will be LTR.
     * @return an SWT TextLayout that can be used for Bidi
     */
    @objid ("db9e29bd-fc87-4788-9c72-4844f0787c2d")
    TextLayout getTextLayout() {
        if (layout == null)
            layout = new TextLayout(Display.getDefault());
        layout.setOrientation(SWT.LEFT_TO_RIGHT);
        return layout;
    }

    /**
     * Get the text orientation in counter-clockwise degrees.
     * @return the text orientation in degrees. 0 means horizontal.
     */
    @objid ("8a5d2760-6bfa-4e43-b289-e66017e8be69")
    public int getTextOrientation() {
        return this.orientation;
    }

    /**
     * Rotates the label text by the given counter-clockwise angle.
     * @param orientation the text orientation in degrees. 0 means horizontal.
     */
    @objid ("f8145a3d-7ad2-4f9d-aa83-4f3fc87ee75e")
    public void setTextOrientation(int orientation) {
        this.orientation = orientation;
    }

    @objid ("5a0aa123-4923-499c-a372-6b1a2e93179b")
    @Override
    public void invalidate() {
        super.invalidate();
        
        this.innerRectangle = null;
        this.prefSize = null;
        this.minSize = null;
        clearLocations();
        this.textSize = null;
        this.subStringTextSize = null;
        this.subStringText = null;
    }

    /**
     * Configure the given {@link TextLayout} to be ready to draw the given text.
     * <p>
     * Wrapping is disabled on the given text layout.
     * @param tl a text layouter
     * @param text the text to draw
     */
    @objid ("dd7b25a3-d2df-4a31-8270-05e35ab6b277")
    void setupTextLayout(TextLayout tl, final String text) {
        try {
            if (isMirrored())
                tl.setOrientation(SWT.RIGHT_TO_LEFT);
        } catch (org.eclipse.swt.SWTException e) {
            // the diagram is probably already disposed...
            return;
        }
        
        if (tl.getWidth() == -1 && Objects.equals(tl.getFont(),getFont()) && text.equals(tl.getText()))
            return;
        
        tl.setWidth(-1); // disable wrap for drawing
        tl.setFont(getFont());
        tl.setText(text);
        
        TextStyle ts = new TextStyle(getFont(), getForegroundColor(), null);
        ts.underline = this.underline;
        ts.strikeout = this.strikeThrough;
        ts.underlineColor = ts.foreground;
        
        tl.setStyle(ts, 0, text.length());
        
        StyleRange[] lstyleRanges = getStyleRanges();
        if (lstyleRanges != null) { 
            // user did fill styled ranges
            for (int i = 0; i < lstyleRanges.length; i++) {
                StyleRange curr = lstyleRanges[i];
                if (this.underline) {
                    curr.underline = true;
                    curr.underlineColor = curr.foreground;
                }
                if (this.strikeThrough)
                    curr.strikeout = true;
                
                tl.setStyle(curr, curr.start, curr.start + curr.length - 1);
                /*if (curr.font != null) {
                    containsOtherFont= true;
                }*/
            }
        }
    }

    /**
     * @return the style ranges
     */
    @objid ("3272452c-501e-4b46-a6e5-6f5f9e29945b")
    public StyleRange[] getStyleRanges() {
        return this.styleRanges;
    }

    /**
     * @param styleRanges the new style ranges,
     */
    @objid ("a8c9a9c3-c991-4f68-8a01-0282d833a271")
    public void setStyleRanges(StyleRange[] styleRanges) {
        this.styleRanges = styleRanges;
        invalidate();
    }

    @objid ("992612f4-1234-47d5-9497-7c7b4f3834dc")
    @Override
    public Dimension getMinimumSize(int w, int h) {
        if (this.minSize != null)
            return this.minSize;
        
        this.minSize = new Dimension();
        
        // reformat text, also setup the text layouter
        Dimension availTextSize = calculateAvailableTextSize(calculateMaxRotatedRectangleSize(w, h)); 
        
        @SuppressWarnings("unused")
        String tt = this.labellumLayouter.formatText(this, getText(), availTextSize);
        
        org.eclipse.swt.graphics.Rectangle ttBounds = getTextLayout().getBounds();
        Dimension ttDim = new Dimension(ttBounds.width, ttBounds.height);
        
        Dimension labelSize = calculateRotatedRectangleBounds(calculateLabelSize(
                getTextUtilities().getTextExtents(getTruncationString(), getFont()))
                .union(ttDim));
        
        Insets insets = getInsets();
        labelSize.expand(insets.getWidth(), insets.getHeight());
        this.minSize.union(labelSize);
        return this.minSize;
    }

    /**
     * Calculate the max size of a rectangle inside the given rectangle size rotated by the labelum angle .
     * <p>
     * @param w rectangle width
     * @param h rectangle height
     * @return the inner rotated rectangle dimension
     */
    @objid ("539b914e-677c-4607-a4bc-a0ffcdb9d534")
    private PrecisionDimension calculateMaxRotatedRectangleSize(int w, int h) {
        if (this.orientation == 0 || this.orientation==180) {
            // Horizontal
            return new PrecisionDimension(w, h);
        } else if (this.orientation==90 || this.orientation == -90) {
            // Vertical
            return new PrecisionDimension(h, w);
        } else if (h == -1) {
            // Oblique without defined height
            // http://stackoverflow.com/a/18495960/1230870
            double rangle = Math.toRadians(this.orientation);
            double cos = Math.cos(rangle);
            double sin = Math.sin(rangle);
        
            double rw = Math.abs(w / (2 * cos));
            double rh = Math.abs(w / (2 * sin)) ;
            
            return new PrecisionDimension(Math.max(rw, rh), Math.min(rw, rh));
        } else if (w == -1) {
            // Oblique without defined width
            // http://stackoverflow.com/a/18495960/1230870
            double rangle = Math.toRadians(this.orientation);
            double cos = Math.cos(rangle);
            double sin = Math.sin(rangle);
        
            double rw = Math.abs(h / (2 * sin)) ;
            double rh = Math.abs(h / (2 * cos));
            
            return new PrecisionDimension(Math.max(rw, rh), Math.min(rw, rh));
        } else {
            // Oblique fully constrained
            // see http://stackoverflow.com/questions/18472668/how-do-i-find-the-dimensions-of-a-rotated-rectangle-within-an-unrotated-rectangl
            double rangle = Math.toRadians(this.orientation);
            double cos = Math.cos(rangle);
            double sin = Math.sin(rangle);
            
            double rw = Math.abs((w * cos - h * sin) / (2*cos - 2*sin));
            double rh = Math.abs((h * cos - w * sin) / (2*cos - 2*sin));
            
            return new PrecisionDimension(Math.max(rw, rh), Math.min(rw, rh));
        }
    }

    /**
     * Get the size of the given rectangle after rotation.
     * @param d the initial size. Warn: the size may be modified.
     * @return the bounds of the rotated dimension
     */
    @objid ("e2866891-29fa-4e7c-8dd1-14c8b8591a36")
    private Dimension calculateRotatedRectangleBounds(Dimension d) {
        if (this.orientation == 0 || this.orientation == 180) {
            return d;
        } else if (this.orientation == 90 || this.orientation == -90) {
            return d.transpose(); // hack : modify the object to save allocs
        } else {
            // http://stackoverflow.com/questions/3231176/how-to-get-size-of-a-rotated-rectangle/3234405#3234405
            double rad = Math.toRadians(this.orientation);
            double cos = Math.cos(rad);
            double sin = Math.sin(rad);
            
            double a = Math.abs(d.width * cos) + Math.abs(d.height * sin);
            double b = Math.abs(d.width * sin) + Math.abs(d.height * cos);
            return new PrecisionDimension(a, b);
        }
    }

    @objid ("36f91109-f296-4d2c-ac53-a1ba8e2cc0a6")
    @Override
    public Dimension getPreferredSize(int wHint, int hHint) {
        if (this.prefSize == null) {
            
            this.prefSize = calculateRotatedRectangleBounds(calculateLabelSize(getTextSize()));
            Insets insets = getInsets();
            this.prefSize.expand(insets.getWidth(), insets.getHeight());
        }
        if ((wHint >= 0 && wHint < this.prefSize.width) || (hHint>=0 && hHint < this.prefSize.height)) {
            Dimension lminSize = getMinimumSize(wHint, hHint);
            Dimension result = lminSize.getCopy(); //this.prefSize.getCopy();
            if (wHint >= 0)
                result.width = Math.min(result.width, wHint);
        
            if (hHint >= 0)
                result.height= Math.min(result.height, hHint);
            
            //result.width = Math.max(lminSize.width, result.width);
            //result.height = Math.max(lminSize.height, result.height);
            return result;
        }
        return this.prefSize;
    }

    /**
     * Calculates the amount of the Label's current text will fit in the Label,
     * including an elipsis "..." if truncation is required.
     * @return the substring
     */
    @objid ("1d1f59f1-6eda-44d4-b9e3-6f47b5b2664e")
    public String getSubStringText() {
        if (this.subStringText == null) {
            // Compute subStringText and subStringTextSize
            final String origText = this.getText();
        
            this.subStringText = origText;
        
            int widthShrink = getPreferredSize().width - getSize().width;
            if (widthShrink > 0) {
                // Text must be shrinked/reformatted to fit
                Dimension availTextSize = calculateAvailableTextSize(getInnerRectangle().getSize()); 
                this.subStringText = this.labellumLayouter.formatText(this, origText, availTextSize);
        
            } else {
                // Configure text layouter to ask him text size
                setupTextLayout(getTextLayout(), this.subStringText);
            }
        
            // Store text size
            org.eclipse.swt.graphics.Rectangle ttb = getTextLayout().getBounds();
            this.subStringTextSize = new Dimension(ttb.width, ttb.height);
        }
        return this.subStringText;
    }

    @objid ("ecb5f083-0df4-4853-83c9-f636a0dd575e")
    protected Rectangle getInnerRectangle() {
        if (this.innerRectangle == null) {
            this.innerRectangle = new PrecisionRectangle();
            this.innerRectangle.setSize(calculateMaxRotatedRectangleSize(getSize().width, getSize().height));
            final double dy = this.innerRectangle.width() * Math.sin(Math.toRadians(this.orientation));
            this.innerRectangle.translate(0.0f, (float)dy);
        }
        return this.innerRectangle;
    }

    /**
     * Calculates the size available for text  using the passed Dimension as the size
     * of the whole Label's figure.
     * @param figureSize the precalculated size of the label's figure.
     * @return the available text size
     */
    @objid ("7841cd54-148f-4ab0-8cbd-16469aa39db9")
    protected Dimension calculateAvailableTextSize(Dimension figureSize) {
        int gap = getIconTextGap();
        if (getIcon() == null || getText().isEmpty()) 
            gap = 0;
        Dimension d = new Dimension(0, 0);
        final int txtPlacement = getTextPlacement();
        if (txtPlacement == WEST || txtPlacement == EAST) {
            d.width = figureSize.width - getIconSize().width - gap;
            d.height = Math.max(getIconSize().height, figureSize.height);
        } else {
            d.width = Math.max(getIconSize().width, figureSize.width);
            d.height = figureSize.height - getIconSize().height - gap ;
        }
        return d;
    }

    /**
     * Set whether the main label is underlined.
     * @param underline true to underline the main label
     */
    @objid ("d8dd1dde-bd96-413d-b765-5c7bda7466f3")
    public void setUnderline(final boolean underline) {
        if (this.underline != underline) {
            this.underline = underline;
            repaint();
        }
    }

    /**
     * Set whether the main label is underlined.
     * @param strikeThrough true to strike the label
     */
    @objid ("1bdf9bd4-4feb-42bf-95d9-9cfafdd72a95")
    public void setStrikeThrough(final boolean strikeThrough) {
        if (this.strikeThrough != strikeThrough) {
            this.strikeThrough = strikeThrough;
            repaint();
        }
    }

    /**
     * Construct a Label with passed String as its text.
     * @param s the label text
     * @since 2.0
     */
    @objid ("164a393c-325f-4d6b-8dfb-78a10d45b2c2")
    public LabelumFigure(String s) {
        setText(s);
    }

    /**
     * Construct a Label with passed Image as its icon.
     * @param i the label image
     * @since 2.0
     */
    @objid ("3e15a74e-f886-47b9-84c9-5a7a3a519e95")
    public LabelumFigure(Image i) {
        setIcon(i);
    }

    /**
     * Construct a Label with passed String as text and passed Image as its
     * icon.
     * @param s the label text
     * @param i the label image
     * @since 2.0
     */
    @objid ("b05b5606-5a3b-4771-a32e-86395249f624")
    public LabelumFigure(String s, Image i) {
        setText(s);
        setIcon(i);
    }

    @objid ("8b8d30c7-07f6-414e-8f71-295e243709a1")
    private void alignOnHeight(Point loc, Dimension size, int alignment) {
        Rectangle ref = getInnerRectangle();
        Insets insets = getInsets();
        switch (alignment) {
        case TOP:
            loc.y = insets.top;
            break;
        case BOTTOM:
            loc.y = ref.height - size.height - insets.bottom;
            break;
        default:
            loc.y = (ref.height - size.height) / 2;
        }
    }

    @objid ("ca2ea81c-a6de-4e96-a466-365ba6b92239")
    private void alignOnWidth(Point loc, Dimension size, int alignment) {
        Rectangle ref = getInnerRectangle();
        Insets insets = getInsets();
        switch (alignment) {
        case LEFT:
            loc.x = insets.left;
            break;
        case RIGHT:
            loc.x = ref.width - size.width - insets.right;
            break;
        default:
            loc.x = (ref.width - size.width) / 2;
        }
    }

    @objid ("81783808-7395-4cd9-83d7-4339b1389bac")
    private void calculateAlignment() {
        switch (this.textPlacement) {
        case EAST:
        case WEST:
            alignOnHeight(this.textLocation, getSubStringTextSize(), this.textAlignment);
            alignOnHeight(this.iconLocation, getIconSize(), this.iconAlignment);
            break;
        case NORTH:
        case SOUTH:
            alignOnWidth(this.textLocation, getSubStringTextSize(), this.textAlignment);
            alignOnWidth(this.iconLocation, getIconSize(), this.iconAlignment);
            break;
        }
    }

    /**
     * Calculates the size of the Label using the passed Dimension as the size
     * of the Label's text.
     * @param txtSize the precalculated size of the label's text
     * @return the label's size
     * @since 2.0
     */
    @objid ("e63d988e-0ac1-4337-a69c-d5ad22f2c1b7")
    protected Dimension calculateLabelSize(Dimension txtSize) {
        int gap = getIconTextGap();
        if (getIcon() == null || getText().equals("")) //$NON-NLS-1$
            gap = 0;
        Dimension d = new Dimension(0, 0);
        if (this.textPlacement == WEST || this.textPlacement == EAST) {
            d.width = getIconSize().width + gap + txtSize.width;
            d.height = Math.max(getIconSize().height, txtSize.height);
        } else {
            d.width = Math.max(getIconSize().width, txtSize.width);
            d.height = getIconSize().height + gap + txtSize.height;
        }
        return d;
    }

    @objid ("f84f0355-5030-44b9-8880-97f266c03555")
    private void calculateLocations() {
        this.textLocation = new Point();
        this.iconLocation = new Point();
        
        calculatePlacement();
        calculateAlignment();
        
        //Dimension offset = getSize().getShrinked(getPreferredSize());
        //offset.width += getTextSize().width - getSubStringTextSize().width;
        
        Dimension offset = getInnerRectangle().getSize().getShrinked(getSubStringTextSize());
        switch (this.labelAlignment) {
        case CENTER:
            offset.scale(0.5f);
            break;
        case LEFT:
            offset.scale(0.0f);
            break;
        case RIGHT:
            offset.scale(1.0f);
            break;
        case TOP:
            offset.height = 0;
            offset.scale(0.5f);
            break;
        case BOTTOM:
            offset.height = offset.height * 2;
            offset.scale(0.5f);
            break;
        default:
            offset.scale(0.5f);
            break;
        }
        
        switch (this.textPlacement) {
        case EAST:
        case WEST:
            offset.height = 0;
            break;
        case NORTH:
        case SOUTH:
            offset.width = 0;
            break;
        }
        
        this.textLocation.translate(offset);
        this.iconLocation.translate(offset);
    }

    @objid ("417eb5e1-9985-45b3-9001-843f23406561")
    private void calculatePlacement() {
        int gap = getIconTextGap();
        if (this.icon == null || this.text.equals("")) //$NON-NLS-1$
            gap = 0;
        Insets insets = getInsets();
        
        switch (this.textPlacement) {
        case EAST:
            this.iconLocation.x = insets.left;
            this.textLocation.x = getIconSize().width + gap + insets.left;
            break;
        case WEST:
            this.textLocation.x = insets.left;
            this.iconLocation.x = getSubStringTextSize().width + gap + insets.left;
            break;
        case NORTH:
            this.textLocation.y = insets.top;
            this.iconLocation.y = getTextSize().height + gap + insets.top;
            break;
        case SOUTH:
            this.textLocation.y = getIconSize().height + gap + insets.top;
            this.iconLocation.y = insets.top;
        }
    }

    /**
     * Calculates and returns the size of the Label's text. Note that this
     * Dimension is calculated using the Label's full text, regardless of
     * whether or not its text is currently truncated. If text size considering
     * current truncation is desired, use {@link #getSubStringTextSize()}.
     * @return the size of the label's text, ignoring truncation
     * @since 2.0
     */
    @objid ("466335a6-1da5-489d-9045-1937a7459fac")
    protected Dimension calculateTextSize() {
        setupTextLayout(getTextLayout(), getText());
        org.eclipse.swt.graphics.Rectangle ttb = getTextLayout().getBounds();
        Dimension textExtents = new Dimension(ttb.width, ttb.height);
        
        return textExtents;
        //return calculateRotatedRectangleBounds(textExtents);
    }

    @objid ("8aeb58cc-5a38-411a-a897-5bc0d41668ed")
    private void clearLocations() {
        this.iconLocation = this.textLocation = null;
    }

    /**
     * Returns the Label's icon.
     * @return the label icon
     * @since 2.0
     */
    @objid ("574e6a9e-ab60-4bc3-ad66-0c1e1706c7bf")
    public Image getIcon() {
        return this.icon;
    }

    /**
     * Returns the current alignment of the Label's icon. The default is
     * {@link PositionConstants#CENTER}.
     * @return the icon alignment
     * @since 2.0
     */
    @objid ("293aa39f-6342-4f44-a119-462745fa0b6d")
    public int getIconAlignment() {
        return this.iconAlignment;
    }

    /**
     * Returns the bounds of the Label's icon.
     * @return the icon's bounds
     * @since 2.0
     */
    @objid ("dcca7546-bb07-4a8b-8cf4-03cd88d3bc21")
    public Rectangle getIconBounds() {
        Rectangle b = getBounds();
        return new Rectangle(b.getLocation().translate(getIconLocation()),
                getIconSize());
    }

    /**
     * Returns the location of the Label's icon relative to the Label.
     * @return the icon's location
     * @since 2.0
     */
    @objid ("969f1279-9a1c-47a0-8465-11e334e753d3")
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
    @objid ("31a9e349-6492-4035-a5c3-2c355b072ccc")
    public int getIconTextGap() {
        return this.iconTextGap;
    }

    /**
     * Returns the size of the Label's current text. If the text is currently
     * truncated, the truncated text with its ellipsis is used to calculate the
     * size.
     * @return the size of this label's text, taking into account truncation
     * @since 2.0
     */
    @objid ("502de5a1-8453-4726-a57e-3297869075f9")
    protected Dimension getSubStringTextSize() {
        if (this.subStringTextSize == null)
            getSubStringText(); // compute text and text size
        return this.subStringTextSize;
    }

    /**
     * Returns the text of the label. Note that this is the complete text of the
     * label, regardless of whether it is currently being truncated. Call
     * {@link #getSubStringText()} to return the label's current text contents
     * with truncation considered.
     * @return the complete text of this label
     * @since 2.0
     */
    @objid ("7a02c1e3-38c3-47d2-a41f-60f9359c1ee1")
    public String getText() {
        return this.text;
    }

    /**
     * Returns the current alignment of the Label's text. The default text
     * alignment is {@link PositionConstants#CENTER}.
     * @return the text alignment
     */
    @objid ("f5341eec-bb0a-4309-b083-a18404ca1e9a")
    public int getTextAlignment() {
        return this.textAlignment;
    }

    /**
     * Returns the bounds of the label's text. Note that the bounds are
     * calculated using the label's complete text regardless of whether the
     * label's text is currently truncated.
     * @return the bounds of this label's complete text
     */
    @objid ("6ee9b558-e6ce-4a15-a64b-4c4e91c5f1c0")
    public Rectangle getTextBounds() {
        Rectangle r = getBounds();
        return new Rectangle(r.getLocation().translate(getTextLocation()),
                this.textSize);
    }

    /**
     * Returns the location of the label's text relative to the label.
     * @return the text location
     */
    @objid ("7d176674-2c1e-4d1b-9abb-ac5ce235d395")
    protected Point getTextLocation() {
        if (this.textLocation != null)
            return this.textLocation;
        calculateLocations();
        return this.textLocation;
    }

    /**
     * Returns the current placement of the label's text relative to its icon.
     * The default text placement is {@link PositionConstants#EAST}.
     * @return the text placement
     */
    @objid ("c90b6480-5b2c-4aa0-b6df-4ae27b4ff556")
    public int getTextPlacement() {
        return this.textPlacement;
    }

    /**
     * Returns the size of the label's complete text. Note that the text used to
     * make this calculation is the label's full text, regardless of whether the
     * label's text is currently being truncated and is displaying an ellipsis.
     * If the size considering current truncation is desired, call
     * {@link #getSubStringTextSize()}.
     * @return the size of this label's complete text
     * @since 2.0
     */
    @objid ("ec435493-2f50-413c-90fb-6b9730202db9")
    protected Dimension getTextSize() {
        if (this.textSize == null)
            this.textSize = calculateTextSize();
        return this.textSize;
    }

    /**
     * Returns <code>true</code> if the label's text is currently truncated and
     * is displaying an ellipsis, <code>false</code> otherwise.
     * @return <code>true</code> if the label's text is truncated
     * @since 2.0
     */
    @objid ("cc66a851-7db8-4a61-8987-4e36a9671f49")
    public boolean isTextTruncated() {
        return !getSubStringText().equals(getText());
    }

    /**
     * Sets the label's icon to the passed image.
     * @param image the new label image
     * @since 2.0
     */
    @objid ("f879528f-25e7-4bc6-ab5e-bb4bf23f37bd")
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
     * This method sets the alignment of the icon within the bounds of the
     * label. If the label is larger than the icon, then the icon will be
     * aligned according to this alignment. Valid values are:
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
    @objid ("3a94dcf0-1285-4c58-8d76-f5102d3cc654")
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
     */
    @objid ("7044e1cd-44ef-452b-b678-0d8ba96219ce")
    private void setIconDimension(Dimension d) {
        if (d.equals(getIconSize()))
            return;
        this.iconSize = d;
        revalidate();
    }

    /**
     * Sets the gap in pixels between the label's icon and text to the passed
     * value. The default is 4.
     * @param gap the gap
     * @since 2.0
     */
    @objid ("f89fda84-f8bc-4521-b735-0fdbca033afb")
    public void setIconTextGap(int gap) {
        if (this.iconTextGap == gap)
            return;
        this.iconTextGap = gap;
        repaint();
        revalidate();
    }

    /**
     * Sets the alignment of the label (icon and text) within the figure. If
     * this figure's bounds are larger than the size needed to display the
     * label, the label will be aligned accordingly. Valid values are:
     * <UL>
     * <LI><EM>{@link PositionConstants#CENTER}</EM>
     * <LI>{@link PositionConstants#TOP}
     * <LI>{@link PositionConstants#BOTTOM}
     * <LI>{@link PositionConstants#LEFT}
     * <LI>{@link PositionConstants#RIGHT}
     * </UL>
     * @param align label alignment
     */
    @objid ("5d0c5514-e59f-4ecc-a8b2-de45a1af3567")
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
    @objid ("2c5bbb91-fb69-48d1-90c4-01d2933437b3")
    public void setText(String s) {
        // "text" will never be null.
        String ls = s;
        if (ls == null)
            ls = "";//$NON-NLS-1$
        if (this.text.equals(ls))
            return;
        this.text = ls;
        revalidate();
        repaint();
    }

    /**
     * Sets the alignment of the text relative to the icon within the label. The
     * text alignment must be orthogonal to the text placement. For example, if
     * the placement is EAST, then the text can be aligned using TOP, CENTER, or
     * BOTTOM. Valid values are:
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
    @objid ("6bdbbb54-fe84-4d4c-8c3c-825eec0467fa")
    public void setTextAlignment(int align) {
        if (this.textAlignment == align)
            return;
        this.textAlignment = align;
        clearLocations();
        repaint();
    }

    /**
     * Sets the placement of the text relative to the icon within the label.
     * Valid values are:
     * <UL>
     * <LI><EM>{@link PositionConstants#EAST}</EM>
     * <LI>{@link PositionConstants#NORTH}
     * <LI>{@link PositionConstants#SOUTH}
     * <LI>{@link PositionConstants#WEST}
     * </UL>
     * @param where the text placement
     * @since 2.0
     */
    @objid ("6adf0349-d3c2-4187-9765-159e455eb067")
    public void setTextPlacement(int where) {
        if (this.textPlacement == where)
            return;
        this.textPlacement = where;
        revalidate();
        repaint();
    }

    /**
     * Gets the <code>TextUtilities</code> instance to be used in measurement
     * calculations.
     * @return a <code>TextUtilities</code> instance
     * @since 3.4
     */
    @objid ("c1bbffa4-be7d-42b7-8cd0-cdad191c551a")
    public TextUtilities getTextUtilities() {
        return TextUtilities.INSTANCE;
    }

    /**
     * Gets the string that will be appended to the text when the label is
     * truncated. By default, this returns an ellipsis.
     * @return the string to append to the text when truncated
     * @since 3.4
     */
    @objid ("dbce7409-6926-4659-90ff-eb6082a2113e")
    protected String getTruncationString() {
        return ELLIPSIS;
    }

    /**
     * Gets the icon size
     * @return the icon size
     * @since 3.4
     */
    @objid ("35265b6b-1888-40ae-8d91-d0fa18032ff8")
    protected Dimension getIconSize() {
        return this.iconSize;
    }

    /**
     * Returns the alignment of the entire label (icon and text). The default
     * label alignment is {@link PositionConstants#CENTER}.
     * @return the label alignment
     * @since 3.5
     */
    @objid ("c99cffac-e358-4dad-91a6-9482220db044")
    public int getLabelAlignment() {
        return this.labelAlignment;
    }

}
