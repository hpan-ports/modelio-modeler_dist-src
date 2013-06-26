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
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.diagram.elements.core.figures.GradientFigure;
import org.modelio.diagram.elements.core.figures.LabelFigure;

/**
 * A header figure is a stack set of:
 * <ul>
 * <li>an icon area</li>
 * <li>a 'top' labels area, containing a vertical stack of labels</li>
 * <li>main label</li>
 * <li>a 'bottom' labels area, containing a vertical stack of labels</li>
 * </ul>
 * <p>
 * <br>
 * The top and bottom labels are displayed using a font derived from the main label font (reduced size).
 * </p>
 */
@objid ("7e6a0dcf-1dec-11e2-8cad-001ec947c8cc")
public class HeaderFigure extends GradientFigure {
    @objid ("f0097d69-5e1c-45ef-9d0a-ba6224397102")
    protected Font stereotypeFont = null;

    @objid ("5fe488d7-67cd-4289-a772-bd87446d8e7b")
    protected Font tagFont = null;

    @objid ("57ad8815-889b-44fe-83c9-71b46831b0b7")
    protected Figure iconsArea;

    @objid ("1a4116b1-4b29-4e7e-bb64-4ec0e958e315")
    protected Figure leftIconsContainer;

    @objid ("72e52d58-87ab-4834-93d2-c7b270460a76")
    protected Figure rightIconsContainer;

    @objid ("1ddbc80a-143d-469f-8046-b3c2644026e8")
    protected Label keywordLabel;

    @objid ("67956766-52ac-4fbb-a15c-70a7653029e1")
    protected Figure topLabelsArea;

    @objid ("3842928f-fb97-4e0f-b5dd-11f05f5b358e")
    protected Figure bottomLabelsArea;

    @objid ("a0f53ea2-2a68-4ee2-9cef-52e51a8e56a0")
    protected Figure contentsArea;

    @objid ("0937b530-5c95-4f57-90b0-c75437427968")
    protected Figure table;

    @objid ("7e6c700b-1dec-11e2-8cad-001ec947c8cc")
    protected LabelFigure mainLabel;

    /**
     * Constructor.
     */
    @objid ("7e6c7017-1dec-11e2-8cad-001ec947c8cc")
    public HeaderFigure() {
        // The header figure is a border layouted container.
        // There are two children: 
        //   - the icons area layouted as TOP 
        //   - the contents area layouted as CENTER
        // Children are transparent without borders
        this.setLayoutManager(new BorderLayout());
        
        // TRACE: this.setBorder(new LineBorder(ColorConstants.orange, 1));
        
        // TOP figure : the icon area
        // The icon area is a border layouted container
        this.iconsArea = new Figure();
        this.iconsArea.setLayoutManager(new BorderLayout());
        // TRACE: iconsArea.setBorder(new LineBorder(ColorConstants.green, 1));
        this.add(this.iconsArea, BorderLayout.TOP);
        
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
        ToolbarLayout righIconAreaLayout = new ToolbarRLayout(true);
        righIconAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_BOTTOMRIGHT);
        righIconAreaLayout.setSpacing(1);
        this.rightIconsContainer.setLayoutManager(righIconAreaLayout);
        // TRACE: rightIconsContainer.setBorder(new LineBorder(1));
        this.rightIconsContainer.setOpaque(false);
        this.iconsArea.add(this.rightIconsContainer, BorderLayout.RIGHT);
        
        // CENTER figure : the contents area
        // The contents area is a grid layouted figure holding a centered cell child
        this.contentsArea = new Figure();
        //TRACE: contentsArea.setBorder(new LineBorder(ColorConstants.blue, 1));
        GridLayout gl = new GridLayoutFixed(1, true);
        gl.marginHeight = 0;
        gl.marginWidth = 0;
        gl.verticalSpacing = 0;
        this.contentsArea.setLayoutManager(gl);
        this.add(this.contentsArea, BorderLayout.CENTER);
        
        this.table = new Figure();
        //TRACE table.setBorder(new LineBorder(ColorConstants.orange, 1));
        ToolbarLayout tbLayout = new ToolbarLayout(false);
        tbLayout.setStretchMinorAxis(true);
        tbLayout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
        this.table.setLayoutManager(tbLayout);
        GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, true);
        this.contentsArea.add(this.table, gd);
        
        // first row : Keyword label
        this.keywordLabel = new Label("");
        this.keywordLabel.setLabelAlignment(PositionConstants.CENTER);
        this.keywordLabel.setOpaque(false);
        //TRACE: this.keywordLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
        
        this.table.add(this.keywordLabel, gd);
        
        // second row: top labels
        this.topLabelsArea = new Figure();
        ToolbarLayout topAreaLayout = new ToolbarLayout(false);
        topAreaLayout.setSpacing(0);
        topAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
        topAreaLayout.setStretchMinorAxis(true);
        this.topLabelsArea.setLayoutManager(topAreaLayout);
        this.topLabelsArea.setOpaque(false);
        //TRACE: this.topLabelsArea.setBorder(new LineBorder(ColorConstants.green, 1));
        this.table.add(this.topLabelsArea);
        
        // Fourth child: the main label area
        this.mainLabel = new LabelFigure();
        this.mainLabel.setLabelAlignment(PositionConstants.CENTER);
        this.mainLabel.setBorder(new MarginBorder(2, 0, 4, 0));
        //TRACE: this.mainLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
        this.table.add(this.mainLabel);
        
        // Fifth child: bottom labels
        this.bottomLabelsArea = new Figure();
        ToolbarLayout bottomAreaLayout = new ToolbarLayout(false);
        bottomAreaLayout.setSpacing(0);
        bottomAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
        bottomAreaLayout.setStretchMinorAxis(true);
        this.bottomLabelsArea.setLayoutManager(bottomAreaLayout);
        this.bottomLabelsArea.setOpaque(false);
        //TRACE: this.bottomLabelsArea.setBorder(new LineBorder(ColorConstants.blue, 1));
        this.table.add(this.bottomLabelsArea);
    }

    /**
     * Set the icons displayed on the upper left corner.
     * @param icons The left icons
     */
    @objid ("7e6c701a-1dec-11e2-8cad-001ec947c8cc")
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
    @objid ("7e6c7020-1dec-11e2-8cad-001ec947c8cc")
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
    @objid ("7e6c7026-1dec-11e2-8cad-001ec947c8cc")
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
                this.keywordLabel = new Label(text);
                this.keywordLabel.setLabelAlignment(PositionConstants.CENTER);
                this.keywordLabel.setOpaque(false);
                this.keywordLabel.setFont(this.stereotypeFont);
                //TRACE: this.keywordLabel.setBorder(new LineBorder(ColorConstants.blue, 1));
                this.table.add(this.keywordLabel, 1);
            }
        
        }
    }

    /**
     * Set the labels displayed on top of the main label.
     * @param topLabels the top labels.
     */
    @objid ("7e6c702a-1dec-11e2-8cad-001ec947c8cc")
    public void setTopLabels(List<String> topLabels) {
        // remove existing labels
        this.topLabelsArea.removeAll();
        
        // add new label figures
        for (String s : topLabels) {
            Label labelFigure = new Label(s);
            //TRACE: labelFigure.setBorder(new LineBorder(1));
            labelFigure.setTextAlignment(PositionConstants.CENTER);
            this.topLabelsArea.add(labelFigure);
        }
    }

    /**
     * Set the main label.
     * @param s the main label.
     */
    @objid ("7e6c7030-1dec-11e2-8cad-001ec947c8cc")
    public void setMainLabel(String s) {
        this.mainLabel.setText(s);
    }

    /**
     * Set the labels displayed below the main label.
     * @param bottomLabels the bottom labels.
     */
    @objid ("7e6c7034-1dec-11e2-8cad-001ec947c8cc")
    public void setBottomLabels(List<String> bottomLabels) {
        // remove existing labels
        this.bottomLabelsArea.removeAll();
        
        // add new label figures
        for (String s : bottomLabels) {
            Label labelFigure = new Label(s);
            labelFigure.setTextAlignment(PositionConstants.CENTER);
            this.bottomLabelsArea.add(labelFigure);
        }
    }

    /**
     * Get the main label figure.
     * @return the main label figure.
     */
    @objid ("7e6c703a-1dec-11e2-8cad-001ec947c8cc")
    Label getMainLabelFigure() {
        return this.mainLabel;
    }

    @objid ("7e6c7041-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Color getTextColor() {
        return this.mainLabel.getForegroundColor();
    }

    @objid ("7e6c7046-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Font getTextFont() {
        return this.mainLabel.getFont();
    }

    @objid ("7e6c704b-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setTextColor(Color textColor) {
        this.topLabelsArea.setForegroundColor(textColor);
        if (this.keywordLabel != null)
            this.keywordLabel.setForegroundColor(textColor);
        this.mainLabel.setForegroundColor(textColor);
        this.bottomLabelsArea.setForegroundColor(textColor);
    }

    @objid ("7e6c704f-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setTextFont(Font textFont) {
        updateDerivedFonts(textFont);
        
        this.topLabelsArea.setFont(this.stereotypeFont);
        if (this.keywordLabel != null)
            this.keywordLabel.setFont(this.stereotypeFont);
        this.mainLabel.setFont(textFont);
        this.bottomLabelsArea.setFont(this.tagFont);
    }

    @objid ("7e6ed255-1dec-11e2-8cad-001ec947c8cc")
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

    @objid ("7e6ed258-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Color getLineColor() {
        return null;
    }

    @objid ("7e6ed25d-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public int getLineWidth() {
        return 0;
    }

    @objid ("7e6ed262-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setLineColor(Color lineColor) {
        // Nothing to do.
    }

    @objid ("7e6ed266-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void setLineWidth(int lineWidth) {
        // Nothing to do.
    }

    @objid ("7e6ed26a-1dec-11e2-8cad-001ec947c8cc")
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

    @objid ("7e6ed26e-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public Dimension getMinimumSize(int wHint, int hHint) {
        // Always ignore the vertical hint!
        return super.getMinimumSize(wHint, -1);
    }

    /**
     * Set whether the main label is underlined.
     * @param underline true to underline the main label
     */
    @objid ("7e6ed277-1dec-11e2-8cad-001ec947c8cc")
    public void setUnderline(final boolean underline) {
        this.mainLabel.setUnderline(underline);
    }

    /**
     * Set whether the main label is stroked through.
     * @param strikeThrough true to strike the label
     */
    @objid ("7e6ed27c-1dec-11e2-8cad-001ec947c8cc")
    public void setStrikeThrough(final boolean strikeThrough) {
        this.mainLabel.setStrikeThrough(strikeThrough);
    }

    /**
     * This class implements a right-aligned ToolBarLayout, ie children are stacked on the right side of the toolbar.
     * NOTE: A ToolbarRLayout is always horizontal.
     */
    @objid ("7e6ed281-1dec-11e2-8cad-001ec947c8cc")
    static class ToolbarRLayout extends ToolbarLayout {
        @objid ("7e6ed286-1dec-11e2-8cad-001ec947c8cc")
        public ToolbarRLayout(boolean isHorizontal) {
            super(isHorizontal);
        }

        @objid ("7e6ed289-1dec-11e2-8cad-001ec947c8cc")
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

        @objid ("7e6ed28f-1dec-11e2-8cad-001ec947c8cc")
        public ToolbarRLayout() {
            super(true); // force horizontal
        }

    }

}
