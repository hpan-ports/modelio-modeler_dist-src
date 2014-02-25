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
                                    

package org.modelio.property.ui.data.extensions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import de.kupzog.ktable.KTable;
import de.kupzog.ktable.KTableCellEditor;
import de.kupzog.ktable.KTableCellRenderer;
import de.kupzog.ktable.KTableDefaultModel;
import de.kupzog.ktable.renderers.DefaultCellRenderer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Color;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.core.ui.images.ModuleI18NService;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.header.HeaderType;
import org.modelio.core.ui.ktable.types.hybrid.HybridCellEditor;
import org.modelio.core.ui.ktable.types.label.LabelType;
import org.modelio.core.ui.ktable.types.text.StringNoValueType;
import org.modelio.core.ui.ktable.types.textlist.StringListType;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.property.plugin.ModelProperty;
import org.modelio.ui.UIColor;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * KTable data model for the {@link ExtensionsPropertyPanel}.
 */
@objid ("8dfff426-c068-11e1-8c0a-002564c97630")
public class ExtensionsKModel extends KTableDefaultModel {
    @objid ("8dfff430-c068-11e1-8c0a-002564c97630")
    private Color oddColor = null;

    @objid ("8dfff431-c068-11e1-8c0a-002564c97630")
    private Color evenColor = null;

    @objid ("8dfff433-c068-11e1-8c0a-002564c97630")
    private TagDataHelper data = null;

    @objid ("868d4d27-cf24-11e1-80a9-002564c97630")
    protected IProjectService projectService;

    @objid ("aa4172d5-d004-11e1-9020-002564c97630")
    protected IMModelServices modelService;

    @objid ("e27365f5-0258-11e2-8189-001ec947ccaf")
    private KTable table;

    @objid ("e27365f6-0258-11e2-8189-001ec947ccaf")
    private KTableCellEditor currentEditor = null;

    @objid ("06a3ffa8-16d1-11e2-aa0d-002564c97630")
    private IModelioPickingService pickingService;

    @objid ("f5490d95-e80a-4dd1-a978-7dd53d1552db")
    protected ModelElement typingElement;

    @objid ("9a5e8e0f-005e-493f-adf3-5f5297d773da")
    protected ModelElement typedElement;

    @objid ("8dfff434-c068-11e1-8c0a-002564c97630")
    public ExtensionsKModel(IProjectService projectService, IMModelServices modelService, IModelioPickingService pickingService, final KTable table, final ModelElement typedElement, final ModelElement typingElement) {
        this.projectService = projectService;
        this.modelService = modelService;
        this.table = table;
        this.typingElement = typingElement;
        this.typedElement = typedElement;
        this.pickingService = pickingService;
        
        this.data = new TagDataHelper();
        
        // Initialize colors
        this.oddColor = UIColor.TABLE_ODDROW_BG;
        this.evenColor = UIColor.TABLE_EVENROW_BG;
    }

    @objid ("8dfff440-c068-11e1-8c0a-002564c97630")
    @Override
    public int getFixedHeaderColumnCount() {
        return 0;
    }

    @objid ("8dfff445-c068-11e1-8c0a-002564c97630")
    @Override
    public int getFixedHeaderRowCount() {
        return 1;
    }

    @objid ("8dfff44a-c068-11e1-8c0a-002564c97630")
    @Override
    public int getFixedSelectableColumnCount() {
        return 0;
    }

    @objid ("8e017ac5-c068-11e1-8c0a-002564c97630")
    @Override
    public int getFixedSelectableRowCount() {
        return 0;
    }

    @objid ("8e017aca-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowHeightMinimum() {
        return 10;
    }

    @objid ("8e017acf-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean isColumnResizable(final int col) {
        return false;
    }

    @objid ("8e017ad6-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean isRowResizable(final int row) {
        return false;
    }

    @objid ("8e017add-c068-11e1-8c0a-002564c97630")
    @Override
    public KTableCellEditor doGetCellEditor(final int col, final int row) {
        KTableCellEditor editor = null;
        // Row 0 and col 0 are not editable
        if ((row <= 0) || (col <= 0)) {
            return null;
        }
        
        // No editor if typed element is not modifiable
        if (!this.typedElement.isModifiable()) {
            return null;
        }
        
        IPropertyType type = this.data.getPropertyType(row - 1);
        editor = type.getEditor(this.pickingService);
        
        if (this.currentEditor != null) {
            if (this.currentEditor instanceof HybridCellEditor) {
                HybridCellEditor hybridCellEditor = (HybridCellEditor) this.currentEditor;
                hybridCellEditor.forceClose();
            }
        }
        this.currentEditor = editor;
        return editor;
    }

    @objid ("8e017ae6-c068-11e1-8c0a-002564c97630")
    @Override
    public KTableCellRenderer doGetCellRenderer(final int col, final int row) {
        DefaultCellRenderer renderer = null;
        
        IPropertyType type;
        // Header row: return header renderer for all columns
        if (row == 0) {
            // First line always contains headers
            type = new HeaderType();
        } else if (col == 0) {
            // First column always contains non editable labels
            type = new LabelType();
        } else {
            type = this.data.getPropertyType(row - 1);
        }
        
        renderer = type.getRenderer();
        if (renderer != null) {
            renderer.setBackground((row % 2 == 0) ? this.oddColor : this.evenColor);
        }
        return renderer;
    }

    @objid ("8e017aef-c068-11e1-8c0a-002564c97630")
    @Override
    public int doGetColumnCount() {
        return 2;
    }

    @objid ("8e017af4-c068-11e1-8c0a-002564c97630")
    @Override
    public Object doGetContentAt(final int col, final int row) {
        if (row == 0) {
            if (col == 0) {
                return ModelProperty.I18N.getString("AnnotationView.PropertyPanel.TaggedValue");
            } else {
                return ModelProperty.I18N.getString("AnnotationView.PropertyPanel.Value");
            }
        }
        
        if (col == 0) {
            TagType type = this.data.getTagTypes().get(row - 1);
            return ModuleI18NService.getLabel(type);
        } else {
            return this.data.getPropertyValue(row - 1);
        }
    }

    @objid ("8e017afc-c068-11e1-8c0a-002564c97630")
    @Override
    public int doGetRowCount() {
        return this.data.getTagTypes().size() + 1;
    }

    @objid ("8e017b01-c068-11e1-8c0a-002564c97630")
    @Override
    public void doSetContentAt(final int col, final int row, final Object value) {
        // Row 0 and col 0 are not editable
        if (row == 0 || col == 0) {
            return;
        }
        
        // Col 1 editor depends on data type
        if (this.projectService != null) {
            try (ITransaction t = this.projectService.getSession().getTransactionSupport().createTransaction("doSetContentAt")) {
                this.data.setPropertyValue(row - 1, value);
                t.commit();
            } catch (Exception e) {
                MessageDialog.openError(this.table.getShell(), ModelProperty.I18N.getString("KeyValueModel.InvalidModelManipulationException.Title"), e.getMessage());
            }
            this.table.redraw();
        }
    }

    @objid ("8e03016a-c068-11e1-8c0a-002564c97630")
    @Override
    public int getInitialColumnWidth(final int col) {
        final double firstColumnWeight = 0.35;
        int colCount = 2;
        int availableWidth = this.table.getClientArea().width - 18;
        if (col == 0) {
            return (int) (availableWidth * firstColumnWeight);
        }
        // else
        return (int) ((availableWidth) * (1 - firstColumnWeight)) / (colCount - 1);
    }

    @objid ("8e030171-c068-11e1-8c0a-002564c97630")
    @Override
    public int getInitialRowHeight(final int row) {
        return (row == 0) ? 22 : 18;
    }

    @objid ("8e030178-c068-11e1-8c0a-002564c97630")
    private class TagDataHelper {
        @objid ("b4b0a355-8092-4e8d-be92-f7f13255cfbc")
        private List<TagType> tagTypes = null;

        @objid ("8e030185-c068-11e1-8c0a-002564c97630")
        public TagDataHelper() {
            // Compute the tag type list
            if (ExtensionsKModel.this.typingElement == null) {
                this.tagTypes = Collections.emptyList();
            
            } else if (ExtensionsKModel.this.typingElement instanceof Stereotype) {
                Stereotype s = (Stereotype) ExtensionsKModel.this.typingElement;
                this.tagTypes = new ArrayList<>();
                for (TagType tagType : s.getDefinedTagType()) {
                    if (!tagType.isIsHidden()) {
                        this.tagTypes.add(tagType);
                    }
                }
            } else if (ExtensionsKModel.this.typingElement instanceof ModuleComponent) {
                this.tagTypes = getModuleTagTypesForMetaclass((ModuleComponent) ExtensionsKModel.this.typingElement, ExtensionsKModel.this.typedElement.getMClass());
            }
        }

        @objid ("8e03018f-c068-11e1-8c0a-002564c97630")
        public List<TagType> getTagTypes() {
            return this.tagTypes;
        }

        @objid ("8e030197-c068-11e1-8c0a-002564c97630")
        public Object getPropertyValue(final int index) {
            TagType tagType = this.tagTypes.get(index);
            int paramNumber = getParamNumber(tagType);
            
            TaggedValue taggedValue = null;
            for (TaggedValue v : ExtensionsKModel.this.typedElement.getTag()) {
                if (v.getDefinition().equals(tagType)) {
                    taggedValue = v;
                    break;
                }
            }
            
            switch (paramNumber) {
            case 0:
                return (taggedValue != null);
            case 1:
                if (taggedValue != null) {
                    List<TagParameter> parameters = taggedValue.getActual();
                    if (parameters.isEmpty()) {
                        return "";
                    } else {
                        return parameters.get(0).getValue();
                    }
                } else {
                    return "";
                }
            
            default:
                if (taggedValue != null) {
                    List<TagParameter> parameters = taggedValue.getActual();
                    List<String> values = new ArrayList<>();
                    for (TagParameter parameter : parameters) {
                        values.add(parameter.getValue());
                    }
                    return values;
                } else {
                    return new ArrayList<>();
                }
            }
        }

        @objid ("8e03019c-c068-11e1-8c0a-002564c97630")
        @SuppressWarnings("unchecked")
        public void setPropertyValue(final int index, final Object value) {
            TagType tagType = this.tagTypes.get(index);
            
            int paramNumber = getParamNumber(tagType);
            
            if (paramNumber == 0) { // Boolean type
                updateBooleanTaggedValue(ExtensionsKModel.this.typedElement, tagType, (Boolean) value);
            } else if (paramNumber == 1) {
                updateStringTaggedValue(ExtensionsKModel.this.typedElement, tagType, (String) value);
            } else { 
                // paramNumber > 1 and paramNumber == -1 (param number no limit)
                updateStringlistTaggedValue(ExtensionsKModel.this.typedElement, tagType, (List<String>) value);
            }
        }

        @objid ("8e0301a2-c068-11e1-8c0a-002564c97630")
        public IPropertyType getPropertyType(final int index) {
            TagType tagType = this.tagTypes.get(index);
            int paramNumber = getParamNumber(tagType);
            if (paramNumber == 0) {
                return new BooleanType();
            } else if (paramNumber == 1) {
                return new StringNoValueType(true);
            } else { // paramNumber > 1 and paramNumber == -1 (param number no
                // limit)
                String title = ModelProperty.I18N.getString("StringListEditionDialog.Title");
                String message = ModelProperty.I18N.getMessage("StringListEditionDialog.Message", tagType.getName());
                String paramNumberStr = "";
                if (paramNumber >= 0) {
                    paramNumberStr = String.valueOf(paramNumber);
                } else {
                    paramNumberStr = "*";
                }
                String detailedMessage = ModelProperty.I18N.getMessage("StringListEditionDialog.DetailedMessage", tagType.getName(), paramNumberStr);
                return new StringListType(true, title, message, paramNumber, detailedMessage);
            }
        }

        @objid ("8e048805-c068-11e1-8c0a-002564c97630")
        private List<TagType> getModuleTagTypesForMetaclass(final ModuleComponent module, final MClass metaclass) {
            // Compute the tag types that are defined by 'module' and applicable
            // on 'element'
            List<TagType> ret = new ArrayList<>();
            
            if (module != null) {
                for (TagType tagType : ExtensionsKModel.this.modelService.findTagTypes(module.getName(), ".*", metaclass)) {
                    if (tagType.getOwnerStereotype() == null && !tagType.isIsHidden()) {
                        ret.add(tagType);
                    }
                }
            }
            return ret;
        }

        @objid ("8e048815-c068-11e1-8c0a-002564c97630")
        private int getParamNumber(final TagType type) {
            String paramNumberStr = type.getParamNumber();
            int paramNumber = -1;
            
            try {
                paramNumber = Integer.parseInt(paramNumberStr);
            } catch (NumberFormatException e) {
                paramNumber = -1;
            }
            return paramNumber;
        }

        @objid ("8e04881d-c068-11e1-8c0a-002564c97630")
        private void updateBooleanTaggedValue(final ModelElement element, final TagType tagType, final Boolean value) {
            if (value) {
                for (TaggedValue tag : element.getTag()) {
                    if (tag.getDefinition() == tagType) {
                        return;
                    }
                }
                ExtensionsKModel.this.modelService.getModelFactory().createTaggedValue(tagType, element);
            } else {
                removeTag(element, tagType);
            }
        }

        @objid ("8e04882a-c068-11e1-8c0a-002564c97630")
        private void updateStringTaggedValue(final ModelElement element, final TagType tagType, final String value) {
            try {
                putTagValue(element, tagType, "".equals(value) ? null : value);
            } catch (Exception e) {
                ModelProperty.LOG.error(e);
            }
        }

        @objid ("8e048836-c068-11e1-8c0a-002564c97630")
        private void updateStringlistTaggedValue(final ModelElement element, final TagType tagType, final List<String> values) {
            try {
                putTagValues(element, tagType, values.isEmpty() ? null : values);
            } catch (Exception e) {
                ModelProperty.LOG.error(e);
            }
        }

        /**
         * This operation returns the tagged value with the corresponding type.
         */
        @objid ("2845e304-12f2-11e2-8060-002564c97630")
        private TaggedValue getTag(ModelElement element, TagType type) {
            for (TaggedValue currentTag : element.getTag()) {
                TagType tagDef = currentTag.getDefinition();
                if (tagDef != null && tagDef == type) {
                    return currentTag;
                }
            }
            return null;
        }

        /**
         * This operation deletes the tagged value having this type from the given element.
         * @param session the modeling session.
         */
        @objid ("2845e30b-12f2-11e2-8060-002564c97630")
        private void removeTag(ModelElement element, TagType type) {
            TaggedValue tag = getTag(element, type);
            if (tag != null) {
                tag.delete();
            }
        }

        /**
         * This operation sets the parameters of the tagged value with the given type on the &lt;element&gt; IModelElement.<br/>
         * The tagged value and the parameter are created if they don't exist.<br/>
         * If values is <tt>null</tt> or empty the existing tag is deleted.
         * @param session the modeling session used to create the tagged value if it does not exist.
         * @throws org.modelio.gproject.model._ElementNotUniqueException when no tag type with the given name exists on the element's metaclass.
         */
        @objid ("2845e310-12f2-11e2-8060-002564c97630")
        private void putTagValue(ModelElement element, TagType tagType, String value) {
            IModelFactory factory = ExtensionsKModel.this.modelService.getModelFactory();
            
            TaggedValue tag = getTag(element, tagType);
            
            if (value == null) {
                // Delete the tag if no more value
                if (tag != null)
                    tag.delete();
                return;
            } else {
                // Create the tagged value if necessary
                if (tag == null) {
                    tag = factory.createTaggedValue(tagType, element);
                }
            
                final List<TagParameter> oldParameters = tag.getActual();
                int cpt = 0;
            
                // Replace existing parameter values and delete spare ones
                for (int i = 0; i < oldParameters.size() && i < 1; i++) {
                    oldParameters.get(i).setValue(value);
                    cpt++;
                }
            
                // Delete spare parameter                
                while (oldParameters.size() > 1) {
                    oldParameters.get(oldParameters.size() - 1).delete();
                }
            
                // Add missing parameter
                if (cpt < 1) {
                    factory.createTagParameter(value, tag);
                    cpt++;
                }
            }
        }

        /**
         * This operation sets the parameters of the tagged value with the given type on the &lt;element&gt; IModelElement.<br/>
         * The tagged value and the parameter are created if they don't exist.<br/>
         * If values is <tt>null</tt> or empty the existing tag is deleted.
         * @param session the modeling session used to create the tagged value if it does not exist.
         * @throws org.modelio.gproject.model._ElementNotUniqueException when no tag type with the given name exists on the element's metaclass.
         */
        @objid ("2845e316-12f2-11e2-8060-002564c97630")
        private void putTagValues(ModelElement element, TagType type, List<String> values) {
            IModelFactory factory = ExtensionsKModel.this.modelService.getModelFactory();
            
            TaggedValue tag = getTag(element, type);
            
            if (values == null || values.isEmpty()) {
                // Delete the tag if no more value
                if (tag != null)
                    tag.delete();
                return;
            } else {
                // Create the tagged value if necessary
                if (tag == null) {
                    tag = factory.createTaggedValue(type, element);
                }
            
                final int newSize = values.size();
                final List<TagParameter> oldParameters = tag.getActual();
                int cpt = 0;
            
                // Replace existing parameter values and delete spare ones
                for (int i = 0; i < oldParameters.size() && i < newSize; i++) {
                    oldParameters.get(i).setValue(values.get(i));
                    cpt++;
                }
            
                // Delete spare parameter                
                while (oldParameters.size() > newSize) {
                    oldParameters.get(oldParameters.size() - 1).delete();
                }
            
                // Add missing parameters
                while (cpt < newSize) {
                    factory.createTagParameter(values.get(cpt), tag);
                    cpt++;
                }
            }
        }

    }

}
