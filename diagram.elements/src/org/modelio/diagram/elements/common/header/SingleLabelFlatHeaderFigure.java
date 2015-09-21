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


package org.modelio.diagram.elements.common.header;

import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.OrderedLayout;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.modelio.diagram.elements.core.figures.GradientFigure;
import org.modelio.diagram.elements.core.figures.ToolbarRLayout;
import org.modelio.diagram.elements.core.figures.labelum.LabelumFigure;

/**
 * A header figure is an horizontal stack set of:
 * <ul>
 * <li>an experimental optional 'left' figure</li>
 * <li>an optional 'left' icon</li>
 * <li>a label composed of a keyword, stereotype, main and tag part
 * <li>a 'right' icon area</li>
 * </ul>
 * </p>
 * @deprecated Not nice
 */
@objid ("4f887ddb-eecb-4c49-8e03-d4382b354164")
@Deprecated
class SingleLabelFlatHeaderFigure extends GradientFigure implements IHeaderFigure {
    @objid ("aff95d59-7eab-49ba-a4db-130c357ffcc1")
    private String stereotypeText;

    @objid ("97f92cfa-91df-4de9-8ee6-dff810eae866")
    private String mainText;

    @objid ("960a045e-a85c-4d47-8a8e-daa01140f322")
    private String tagText;

    @objid ("09b95462-12e4-4679-bc8b-c022d6832829")
    private String keywordText;

    /**
     * The main label
     */
    @objid ("c26d86af-5a86-4eb5-8405-7d3c6fc2aee1")
    private LabelumFigure mainLabel;

    /**
     * The right icons container.
     */
    @objid ("29d1e114-76f0-48cb-9449-ce686a9fd59c")
    private Figure rightIconsContainer;

    /**
     * Experimental left figure.
     */
    @objid ("6ea1f2f0-4c6b-48a0-8f12-1869759f6255")
    private IFigure leftFigure = null;

    @objid ("b3e6bc34-2d59-4620-9990-f3610a6538af")
    private Figure leftIconsContainer;

    /**
     * Creates a ModelElementLabelFigure.
     */
    @objid ("ff1a0cda-646c-4252-966e-d3ca26b09bc4")
    public SingleLabelFlatHeaderFigure() {
        // The header figure is a horizontal toolbar layouted container.
        // There are plenty children ordered from left to right:
        //   - the left icons
        //   - the keyword
        //   - the left labels
        //   - the main label
        //   - the right labels
        //   - the right icons
        // Children are transparent without borders.
        
        //final ToolbarLayout layoutManager = new ToolbarLayout(true);
        //layoutManager.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
        
        final BorderLayout layoutManager = new BorderLayout();
        this.setLayoutManager(layoutManager);
        
        // Right icons container
        // an horizontal toolbar layouted container, right aligned
        this.leftIconsContainer = new Figure();
        final ToolbarLayout leftIconAreaLayout = new ToolbarLayout(true);
        leftIconAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
        leftIconAreaLayout.setSpacing(1);
        this.leftIconsContainer.setLayoutManager(leftIconAreaLayout);
        this.leftIconsContainer.setOpaque(false);
        this.add(this.leftIconsContainer, BorderLayout.LEFT);
        
        // Fourth child: the main label area
        this.mainLabel = new LabelumFigure();
        this.mainLabel.setLabelAlignment(PositionConstants.LEFT);
        this.mainLabel.setIconAlignment(PositionConstants.LEFT);
        this.mainLabel.setTextMinorAlignment(PositionConstants.BOTTOM);
        this.add(this.mainLabel, BorderLayout.CENTER);
        
        // Right icons container
        // an horizontal toolbar layouted container, right aligned
        this.rightIconsContainer = new Figure();
        final ToolbarLayout righIconAreaLayout = new ToolbarRLayout();
        righIconAreaLayout.setMinorAlignment(OrderedLayout.ALIGN_CENTER);
        righIconAreaLayout.setSpacing(1);
        this.rightIconsContainer.setLayoutManager(righIconAreaLayout);
        this.rightIconsContainer.setOpaque(false);
        this.add(this.rightIconsContainer, BorderLayout.RIGHT);
        
        // CENTER figure : the contents area
        // The contents area is a grid layouted figure holding a centered cell child
        
        // debug code here:
        //this.mainLabel.setBorder(new LineBorder(ColorConstants.darkGreen, 1));
        //this.rightIconsContainer.setBorder(new LineBorder(ColorConstants.cyan,1));
        //this.setBorder(new LineBorder());
    }

    @objid ("38ea41ed-4492-4811-bf1f-bfd55886b8a1")
    @Override
    public void addNotify() {
        super.addNotify();
        setTextFont(getFont());
    }

    @objid ("204dc12d-2646-47f4-82be-47b0b6b0196e")
    @Override
    public Color getLineColor() {
        return null;
    }

    @objid ("5fbd5d42-9556-47a1-ac33-7a880c968df9")
    @Override
    public int getLineWidth() {
        return 0;
    }

    @objid ("b6011a47-4b44-4717-afd1-17237223550c")
    @Override
    public Color getTextColor() {
        return this.mainLabel.getForegroundColor();
    }

    @objid ("3b15515d-7e49-4cac-9004-11b70646ca01")
    @Override
    public Font getTextFont() {
        return this.mainLabel.getFont();
    }

    /**
     * Experimental: set the left figure.
     * <p>
     * This figure is placed at the left of the label and its optional image.
     * @param aFigure The new left figure.
     */
    @objid ("ea3d7843-be26-4e0a-9401-a18b45a9e54c")
    public void setLeftFigure(IFigure aFigure) {
        if (this.leftFigure != null)
            remove(this.leftFigure);
        
        this.leftFigure = aFigure;
        add(aFigure, BorderLayout.LEFT);
    }

    /**
     * Set the left icon
     * @param leftIcon The left icon.
     */
    @objid ("920ec365-9c87-4f8d-abb9-59ba6ea8b3e9")
    @Deprecated
    public void setLeftIcon(Image leftIcon) {
        setLeftIcons(Collections.singletonList(leftIcon));
    }

    /**
     * Set the stereotype labels.
     * @param value the stereotype label.
     */
    @objid ("40928644-1d51-4ff6-82b6-9ebb7408a3ef")
    @Override
    public void setTopLabel(String value) {
        if (value != null && value.equals(this.stereotypeText))
            return;
        
        // The text should never be null
        if (value == null) {
            this.stereotypeText = "";
        } else {
            this.stereotypeText = value;
        }
        
        updateLabel();
    }

    @objid ("7ca98a43-c052-4b6b-828f-be91dcad8b7a")
    @Override
    public void setLineColor(Color lineColor) {
        // Nothing to do
    }

    @objid ("9e670f0d-d4a7-4916-922a-0a9715652ee4")
    @Override
    public void setLineWidth(int lineWidth) {
        // Nothing to do
    }

    /**
     * Set the main label.
     * <p>
     * The main label is usually the element name with its signature.
     * @param s The new main label
     */
    @objid ("60aaf750-7e11-469f-9cdd-10aed3089034")
    @Override
    public void setMainLabel(String s) {
        this.mainText = s;
        updateLabel();
    }

    /**
     * Set the right icons.
     * @param icons the right icons.
     */
    @objid ("b3788162-d37d-4fb3-aec1-4d1ea878fcd1")
    @Override
    public void setRightIcons(List<Image> icons) {
        // remove existing icons
        this.rightIconsContainer.removeAll();
        // add new image figures
        for (Image img : icons) {
            ImageFigure imgFigure = new ImageFigure(img);
            this.rightIconsContainer.add(imgFigure);
        }
    }

    /**
     * Set the right text.
     * @param value the right text.
     */
    @objid ("67dad387-e0e2-4388-85ac-6e5db97d0e1c")
    @Override
    public void setBottomLabel(String value) {
        if (value != null && value.equals(this.tagText))
            return;
        
        // The text should never be null
        if (value == null) {
            this.tagText = "";
        } else {
            this.tagText = value;
        }
        
        updateLabel();
    }

    @objid ("67fc7b79-a86e-4e98-891e-29aef9772ef5")
    @Override
    public void setTextColor(Color textColor) {
        this.mainLabel.setForegroundColor(textColor);
    }

    @objid ("7187e908-3e22-4b3a-b7cf-ec9844b8e830")
    @Override
    public void setTextFont(Font textFont) {
        //this.mainLabel.setFont(textFont);
        this.setFont(textFont);
    }

    /**
     * Get the main label figure.
     * @return the main label figure.
     */
    @objid ("4e45de98-71dd-4442-8e39-a5e1a9dbd974")
    @Override
    public LabelumFigure getMainLabelFigure() {
        return this.mainLabel;
    }

    /**
     * Update the displayed label
     */
    @objid ("03de90a3-cf24-4453-aed0-4ec0ae87ab80")
    private void updateLabel() {
        StringBuilder labelText = new StringBuilder();
        
        if (this.keywordText != null && !this.keywordText.isEmpty()) {
            labelText.append(this.keywordText);
            labelText.append(" ");
        }
        
        if (this.stereotypeText != null && !this.stereotypeText.isEmpty()) {
            labelText.append(this.stereotypeText);
            labelText.append(" ");
        }
        
        if (this.mainText != null && !this.mainText.isEmpty()) {
            labelText.append(this.mainText);
            labelText.append(" ");
        }
        
        if (this.tagText != null && !this.tagText.isEmpty()) {
            labelText.append(this.tagText);
        }
        
        this.mainLabel.setText(labelText.toString().trim());
    }

    /**
     * Set the keyword labels.
     * @param value the keyword label.
     */
    @objid ("82bfe519-997a-451f-9962-c6d64762997f")
    @Override
    public void setKeywordLabel(String value) {
        if (value != null && value.equals(this.keywordText))
            return;
        
        // The text should never be null
        if (value == null) {
            this.keywordText = "";
        } else {
            this.keywordText = value;
        }
        
        updateLabel();
    }

    @objid ("4ea8c8b6-987f-466d-a678-e0b756e2ce50")
    @Override
    public void setFont(final Font f) {
        super.setFont(f);
        this.mainLabel.setFont(f);
    }

    /**
     * Set whether the main label is underlined.
     * @param underline true to underline the main label
     */
    @objid ("3140bc0c-46b5-49fd-8ca5-5e5611b91edc")
    @Override
    public void setUnderline(final boolean underline) {
        this.mainLabel.setUnderline(underline);
    }

    /**
     * Set whether the main label is stroked through.
     * @param strikeThrough true to strike the label
     */
    @objid ("5951406c-2cc7-4a7a-8fe1-088e529dc0cd")
    @Override
    public void setStrikeThrough(final boolean strikeThrough) {
        this.mainLabel.setStrikeThrough(strikeThrough);
    }

    @objid ("6511bf37-6c32-4b9d-8d08-89a8ebac36bf")
    @Override
    public void setLeftIcons(List<Image> icons) {
        // remove existing icons
        this.leftIconsContainer.removeAll();
        // add new image figures
        for (Image img : icons) {
            ImageFigure imgFigure = new ImageFigure(img);
            this.leftIconsContainer.add(imgFigure);
        }
    }

    /**
     * Wrapping not supported, do nothing.
     */
    @objid ("b6862c8c-e312-479c-b96e-e4ff6c54ce54")
    @Override
    public boolean setWrapped(boolean val) {
        // no operation
        return false;
    }

    /**
     * Wrapping not supported.
     */
    @objid ("eb6dbb64-a0d1-4f21-8d50-88a1ecb0e7bb")
    @Override
    public boolean isWrapped() {
        return false;
    }

}
