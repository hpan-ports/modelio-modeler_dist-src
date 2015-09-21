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

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Text;
import org.modelio.diagram.elements.common.edition.DirectEditManager2;
import org.modelio.diagram.elements.core.figures.labelum.LabelumFigure;
import org.modelio.diagram.elements.core.helpers.RequestHelper;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.model.IEditableText;
import org.modelio.diagram.elements.core.model.IGmObject;
import org.modelio.diagram.elements.core.node.GmNodeEditPart;
import org.modelio.diagram.elements.core.policies.DefaultElementDirectEditPolicy;
import org.modelio.diagram.elements.plugin.DiagramElements;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey.ShowStereotypeMode;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * Manages a GmModelElementHeader. The unique editing policy is the text edition of the main label.
 */
@objid ("7e7134d7-1dec-11e2-8cad-001ec947c8cc")
public class ModelElementHeaderEditPart extends GmNodeEditPart {
    @objid ("7e7134d9-1dec-11e2-8cad-001ec947c8cc")
    protected static final List<Image> emptyImageList = Collections.emptyList();

    /**
     * Default constructor.
     */
    @objid ("0350116f-4efc-425b-9f59-9fe8bd0d9426")
    public ModelElementHeaderEditPart() {
        super();
    }

    /**
     * Get the main label figure.
     * <p>
     * The main label usually displays the element name.
     * @return the main label figure.
     */
    @objid ("7e739715-1dec-11e2-8cad-001ec947c8cc")
    public LabelumFigure getMainLabelFigure() {
        return getHeaderFigure(getFigure()).getMainLabelFigure();
    }

    /**
     * By default model element headers are not selectable.
     */
    @objid ("7e7134e1-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public boolean isSelectable() {
        return false;
    }

    @objid ("7e73970b-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void performRequest(Request req) {
        if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
            GmModelElementHeader gm = (GmModelElementHeader) getModel();
            if (gm.getRelatedElement() == null || gm.getRelatedElement().isShell() || gm.getRelatedElement().isDeleted()
                    || !gm.getRelatedElement().getStatus().isModifiable()) {
                return;
            }
        
            final CellEditorLocator cellEditorLocator = new CellEditorLocator() {
                @Override
                public void relocate(CellEditor cellEditor) {
                    LabelumFigure label = getMainLabelFigure();
        
                    String curText = (String) cellEditor.getValue();
                    Font font = cellEditor.getControl().getFont();
                    Dimension textSize = TextUtilities.INSTANCE.getTextExtents(curText, font);
        
                    Rectangle rect = label.getBounds().getCopy();
                    label.translateToAbsolute(rect);
        
                    int minWidth = FigureUtilities.getStringExtents("abcdefghijklmn...", font).width();
                    int cw = Math.max(Math.max(textSize.width, rect.width), minWidth);
                    int ch = textSize.height;
        
                    int cx = rect.x;
                    int cy = rect.y + (rect.height / 2) - ch / 2;
        
                    cellEditor.getControl().setBounds(cx, cy, cw, ch);
                }
        
            };
        
            final IEditableText editableText = ((GmModel) getModel()).getEditableText();
            if (editableText != null) {
                DirectEditManager2 manager = new DirectEditManager2(this, TextCellEditor.class, cellEditorLocator) {
        
                    @Override
                    protected void initCellEditor() {
        
                        final TextCellEditor textEdit = (TextCellEditor) getCellEditor();
                        textEdit.setStyle(SWT.CENTER);
                        textEdit.setValue(editableText.getText());
        
                        final Text textControl = (Text) textEdit.getControl();
                        textControl.selectAll();
                        textControl.setBackground(ColorConstants.white);
                        textControl.setForeground(ColorConstants.blue);
        
                        super.initCellEditor();
                    }
        
                };
        
                manager.show();
            }
        } else {
            super.performRequest(req);
        }
    }

    @objid ("7e739711-1dec-11e2-8cad-001ec947c8cc")
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(IGmObject.PROPERTY_LABEL)) {
            refreshVisuals();
        }
        
        super.propertyChange(evt);
    }

    @objid ("7e73971c-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new DefaultElementDirectEditPolicy());
        installEditPolicy("auto_fit_on_edit", new AutoFitOnEditEditPolicy());
    }

    /**
     * Creates a {@link WrappedHeaderFigure}.
     */
    @objid ("7e73971f-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected IFigure createFigure() {
        final GmModelElementHeader gm = (GmModelElementHeader) getModel();
        // Create the header figure
        final IHeaderFigure headerFigure;
        if (isFlat(gm)) {
            headerFigure = new FlatHeaderFigure();
        } else {
            headerFigure = new WrappedHeaderFigure();
        }
        
        // Set style dependent properties
        refreshFromStyle(headerFigure, getModelStyle());
        
        // Set style independent properties
        headerFigure.setLineWidth(0);
        
        // Main label
        refreshLabel(headerFigure);
        
        // Tagged values
        refreshTaggedValues(headerFigure);
        
        // Stereotypes
        ShowStereotypeMode mode = getStereotypeMode(gm);
        refreshStereotypes(headerFigure, mode);
        
        // Keyword
        refreshMetaclassKeyword(headerFigure, gm, mode);
        
        // Metaclass icon
        refreshMetaclassIcon(headerFigure, gm, mode);
        return headerFigure;
    }

    /**
     * Get the {@link IHeaderFigure} managed by this edit part.
     * <p>
     * Default implementation casts the argument to <code>IHeaderFigure</code> and returns it.
     * <p>
     * Sub classes that may put the <code>IHeaderFigure</code> inside another figure
     * and modify the implementation.
     * @param aFigure a figure, usually {@link #getFigure()}.
     * @return the {@link IHeaderFigure}.
     */
    @objid ("22dbeaaa-2086-4b4c-9531-c5e6149dc779")
    protected IHeaderFigure getHeaderFigure(IFigure aFigure) {
        return (IHeaderFigure) aFigure;
    }

    /**
     * Get whether each stereotype is in its own &lt;&lt; >> or all are in the same &lt;&lt;a, b, c ...>>.
     * <p>
     * By default asks to {@link GmModelElementHeader#isDisplayStereotypesAsStack()}, may be redefined in sub classes.
     * @return <li><i>true</i>: each stereotype is in its &lt;&lt; >>.<br>
     * <li><i>false</i>: all stereotypes will be in a single &lt;&lt;a, b, c ...>> label
     */
    @objid ("8f3f5a12-b6c9-48dc-941b-628481899947")
    protected boolean isDisplayStereotypesAsStack(GmModelElementHeader gm) {
        return gm.isDisplayStereotypesAsStack();
    }

    /**
     * Get whether the given model must be displayed as a flat header or a stacked wrapped header.
     * <p>
     * The default implementation directly asks the question to the model.
     * @param gm the graphic model
     * @return <i>true</i> to display it flat.
     */
    @objid ("d3cd668d-b667-40fd-ab72-a5ba4c70f45e")
    protected boolean isFlat(GmModelElementHeader gm) {
        return gm.isFlat();
    }

    @objid ("7e739726-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected void refreshFromStyle(final IFigure aFigure, IStyle style) {
        final IHeaderFigure headerFigure = getHeaderFigure(aFigure);
        
        // Pen and brush options are managed by the superclass
        super.refreshFromStyle(headerFigure, style);
        
        // We have to deal with stereotype mode and show/hide for name, stereotypes and tags
        ShowStereotypeMode mode = getStereotypeMode((GmModelElementHeader) getModel());
        refreshLabel(headerFigure);
        refreshStereotypes(headerFigure, mode);
        refreshTaggedValues(headerFigure);
        refreshWrapping(headerFigure, style);
    }

    @objid ("7e739739-1dec-11e2-8cad-001ec947c8cc")
    protected void refreshMetaclassIcon(final IHeaderFigure headerFigure, final GmModelElementHeader gm, ShowStereotypeMode mode) {
        ArrayList<Image> icons = new ArrayList<>(1);
        
        if (gm.isShowMetaclassIcon() && mode != ShowStereotypeMode.NONE && mode != ShowStereotypeMode.TEXT) {
            icons.add(gm.getMetaclassIcon());
        }
        headerFigure.setLeftIcons(icons);
    }

    @objid ("7e73973f-1dec-11e2-8cad-001ec947c8cc")
    protected void refreshMetaclassKeyword(final IHeaderFigure headerFigure, final GmModelElementHeader gm, ShowStereotypeMode mode) {
        if (gm.isShowMetaclassKeyword() && mode != ShowStereotypeMode.NONE && mode != ShowStereotypeMode.ICON ) {
            headerFigure.setKeywordLabel("<<" + gm.getMetaclassKeyword() + ">>");
        } else {
            headerFigure.setKeywordLabel(null);
        }
    }

    /**
     * To be called when the stereotype mode changes or when the applied stereotypes change.
     * @param mode
     * @param aFigure The figure to update.
     */
    @objid ("7e73972e-1dec-11e2-8cad-001ec947c8cc")
    protected final void refreshStereotypes(final IHeaderFigure aFigure, ShowStereotypeMode mode) {
        GmModelElementHeader gm = (GmModelElementHeader) getModel();
        
        switch (mode) {
        case ICON:
            aFigure.setRightIcons(gm.getStereotypeIcons());
            aFigure.setTopLabel("");
            break;
        case TEXT:
            aFigure.setRightIcons(emptyImageList);
            aFigure.setTopLabel(computeStereotypeText(gm));
            break;
        case TEXTICON:
            aFigure.setRightIcons(gm.getStereotypeIcons());
            aFigure.setTopLabel(computeStereotypeText(gm));
            break;
        default:
        case NONE:
            aFigure.setRightIcons(emptyImageList);
            aFigure.setTopLabel("");
            break;
        }
    }

    @objid ("7e739733-1dec-11e2-8cad-001ec947c8cc")
    @Override
    protected void refreshVisuals() {
        final IHeaderFigure aFigure = getHeaderFigure(getFigure());
        final GmModelElementHeader gm = (GmModelElementHeader) getModel();
        
        ShowStereotypeMode mode = getStereotypeMode(gm);
        
        // Layout data
        final Object layoutData = gm.getLayoutData();
        if (layoutData != null) {
            aFigure.getParent().setConstraint(aFigure, layoutData);
        }
        
        // Main label
        refreshLabel(aFigure);
        
        // Tagged values
        refreshTaggedValues(aFigure);
        
        // Stereotypes
        refreshStereotypes(aFigure, mode);
        
        // Metaclass Keyword
        refreshMetaclassKeyword(aFigure, gm, mode);
        
        // Metaclass Icon
        refreshMetaclassIcon(aFigure, gm, mode);
    }

    /**
     * Refresh the wrapping mode from the figure.
     * @param fig
     * @param style
     * @return if the wrapping mode changed
     */
    @objid ("e4c00ec5-ef25-44b1-a89b-074c840053c5")
    protected boolean refreshWrapping(IHeaderFigure fig, IStyle style) {
        GmModelElementHeader gm = (GmModelElementHeader) getModel();
        
        StyleKey propertyKey = gm.getStyleKey(MetaKey.WRAPLABEL);
        boolean wrap = propertyKey != null ? style.getBoolean(propertyKey) : ! isFlat(gm);
        return fig.setWrapped(wrap);
    }

    @objid ("955d12ef-238c-42a7-a3a2-d978d9a8f3d0")
    private String computeStereotypeText(GmModelElementHeader gm) {
        if (gm.getStereotypesLabel().isEmpty()) {
            return "";
        }
        
        final StringBuilder labels = new StringBuilder();
        if (isDisplayStereotypesAsStack(gm)) {
            // Each stereotype in <<s1>> <<s2>>
            for (String s : gm.getStereotypesLabel()) {
                if (labels.length() > 2)
                 {
                    labels.append("\u200B"); // ZERO WIDTH SPACE
                }
        
                labels.append("<<");
                labels.append(s.replace(" ", "\u00A0")); // replace spaces by non breaking spaces
                labels.append(">>");
            }
        } else {
            //All stereotypes in <<s1, s2>>
            labels.append("<<");
            for (String s : gm.getStereotypesLabel()) {
                if (labels.length() > 2) {
                    labels.append(", ");
                }
        
                labels.append(s.replace(" ", "\u00A0")); // replace spaces by non breaking spaces
            }
            labels.append(">>");
        }
        return labels.toString();
    }

    @objid ("eca498ab-3609-4a5b-af18-99cc12a6328f")
    private String computeTagsLabel(GmModelElementHeader gm) {
        List<String> taggedValuesLabels = gm.getTaggedValueLabels();
        
        if (taggedValuesLabels.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder(taggedValuesLabels.size() * 20);
        
        // add new label figures
        for (String s : taggedValuesLabels) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
        
            sb.append(s.replace(" ", "\u00A0")); // replace spaces by non breaking spaces
        }
        return sb.toString();
    }

    @objid ("1bf5dbbb-b4f6-4d72-b42a-6577b6c7cba7")
    private ShowStereotypeMode getStereotypeMode(final GmModelElementHeader gm) {
        ShowStereotypeMode mode = gm.getStyle().getProperty(gm.getStyleKey(MetaKey.SHOWSTEREOTYPES));
        if (mode == null) {
            mode = ShowStereotypeMode.NONE;
        }
        return mode;
    }

    @objid ("7e739736-1dec-11e2-8cad-001ec947c8cc")
    private void refreshLabel(IHeaderFigure headerFigure) {
        GmModelElementHeader gm = (GmModelElementHeader) getModel();
        
        // Ask the gm if the label is shown
        if (gm.isShowLabel()) {
            headerFigure.setMainLabel(gm.getMainLabel());
        } else {
            headerFigure.setMainLabel("");
        }
    }

    /**
     * Refresh the tagged values zone.
     * @param aFigure The figure to update
     */
    @objid ("7e739745-1dec-11e2-8cad-001ec947c8cc")
    private void refreshTaggedValues(IHeaderFigure aFigure) {
        GmModelElementHeader gm = (GmModelElementHeader) getModel();
        
        boolean mode = gm.getStyle().getProperty(gm.getStyleKey(MetaKey.SHOWTAGS));
        if (mode) {
            aFigure.setBottomLabel(computeTagsLabel(gm));
        } else {
            aFigure.setBottomLabel("");
        }
    }

    /**
     * Fit to new content on text edition.
     * 
     * @author cmarin
     * @since 3.4
     */
    @objid ("bee7cdfd-15a2-4947-9906-f0106b5a8482")
    protected class AutoFitOnEditEditPolicy extends GraphicalEditPolicy {
        @objid ("499816da-7cf5-41cc-83b1-a88421b311d1")
        @Override
        public Command getCommand(Request request) {
            if (request.getType().equals(REQ_DIRECT_EDIT)) {
                return new AutoFitCommand();
            }
            return null;
        }

    }

    /**
     * Fit label figure to content according to the Ob model.
     * 
     * @author cmarin
     * @since 3.4
     */
    @objid ("54a719ba-f7d5-4a6f-9eae-0cb645bea612")
    protected class AutoFitCommand extends Command {
        @objid ("7b2a2cf5-02ce-4ce0-a97e-f42be40347f9")
        @Override
        public void execute() {
            GmModel gmModel = (GmModel) getModel();
            IFigure fig = getFigure();
            
            Dimension oldSize = fig.getSize();
            Dimension oldPrefSize = fig.getPreferredSize(-1, -1);
            
            // need to refresh gm model (and view) now because it will be triggered only after transaction commit.
            gmModel.obElementsUpdated();
            
            int wHint = -1;
            if (! oldSize.equals(oldPrefSize)) {
                // Keep same width
                wHint = oldSize.width;
            }
            
            Dimension prefSize = fig.getPreferredSize(wHint, -1);
            
            if (! oldSize.equals(prefSize)) {
                ChangeBoundsRequest req = new ChangeBoundsRequest(REQ_RESIZE);
                req.setEditParts(ModelElementHeaderEditPart.this);
                Rectangle requestedBounds = fig.getBounds().getCopy().setSize(prefSize);
                RequestHelper.setDeltas(req, fig, requestedBounds);
            
                Command cmd = getCommand(req);
                if (cmd != null && cmd.canExecute()) {
                    cmd.execute();
                } else {
                    if (DiagramElements.LOG.isDebugEnabled()) {
                        ModelElementHeaderEditPart target = ModelElementHeaderEditPart.this;
                        DiagramElements.LOG.warning("<%s> is not resizeable for request: move= %s , size+= %s", target.getClass().getSimpleName(), req.getMoveDelta(), req.getSizeDelta());
                        DiagramElements.LOG.warning("  parent edit part= <%s>;\n\t target edit part=%s\n\t command=%s",  target.getParent(), target, cmd);
                        DiagramElements.LOG.warning(new Throwable("stack trace"));
                    }
                }
            }
        }

    }

}
