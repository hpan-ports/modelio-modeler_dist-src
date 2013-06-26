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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmndataobject;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.common.abstractdiagram.GmAbstractDiagram;
import org.modelio.diagram.elements.common.label.modelelement.GmModelElementFlatHeader;
import org.modelio.diagram.elements.core.model.IEditableText;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey.RepresentationMode;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("60d452f9-55b6-11e2-877f-002564c97630")
public class GmBpmnDataLabel extends GmModelElementFlatHeader {
    /**
     * Current version of this Gm. Defaults to 0.
     */
    @objid ("60d452fc-55b6-11e2-877f-002564c97630")
    private final int minorVersion = 0;

    @objid ("60d452ff-55b6-11e2-877f-002564c97630")
    private static final int MAJOR_VERSION = 0;

    /**
     * Create a model element label
     * @param diagram the diagram.
     * @param relatedRef a reference to the element this GmModel is related to.
     */
    @objid ("60d45301-55b6-11e2-877f-002564c97630")
    public GmBpmnDataLabel(final GmAbstractDiagram diagram, final MRef relatedRef) {
        super(diagram, relatedRef);
    }

    /**
     * For deserialization only.
     */
    @objid ("60d5d963-55b6-11e2-877f-002564c97630")
    public GmBpmnDataLabel() {
        // serialization
    }

    @objid ("60d5d966-55b6-11e2-877f-002564c97630")
    @Override
    public List<Stereotype> filterStereotypes(final List<Stereotype> stereotypes) {
        // Check the current representation mode
        final StyleKey key = getStyleKey(MetaKey.REPMODE);
        if (key != null) {
            // For image mode, filter the first image stereotype
            if (getStyle().getProperty(key) == RepresentationMode.IMAGE) {
                for (Stereotype stereo : stereotypes) {
                    if (!stereo.getIcon().isEmpty()) {
                        List<Stereotype> ret = new ArrayList<>(stereotypes);
                        ret.remove(stereo);
                        return ret;
                    }
                }
            }
        }
        return stereotypes;
    }

    @objid ("60d5d975-55b6-11e2-877f-002564c97630")
    @Override
    public List<TaggedValue> filterTags(final List<TaggedValue> taggedValues) {
        return taggedValues;
    }

    @objid ("60d5d984-55b6-11e2-877f-002564c97630")
    @Override
    public IEditableText getEditableText() {
        if (getRelatedElement() == null)
            return null;
        return new IEditableText() {
            @Override
            public String getText() {
        return getRelatedElement().getName();
                    }
        
                    @Override
                    public void setText(String text) {
        getRelatedElement().setName(text);
                    }
                };
    }

    @objid ("60d5d98b-55b6-11e2-877f-002564c97630")
    @Override
    public boolean isVisible() {
        final StyleKey key = getParent().getStyleKey(MetaKey.SHOWLABEL);
        if (key == null)
            return true;
        else
            return getStyle().getProperty(key);
    }

    @objid ("60d5d98f-55b6-11e2-877f-002564c97630")
    @Override
    protected String computeLabel() {
        String mlabel = null;
        String reference = null;
        
        if (getRelatedElement() != null && !getRelatedElement().getName().equals("")) {
            mlabel = getRelatedElement().getName();
        }
        
        BpmnItemAwareElement element = (BpmnItemAwareElement) getRelatedElement();
        if (element.getRepresentedAttribute() != null) {
            reference = element.getRepresentedAttribute().getName();
        } else if (element.getRepresentedInstance() != null) {
            reference = element.getRepresentedInstance().getName();
        } else if (element.getRepresentedAssociationEnd() != null) {
            reference = element.getRepresentedAssociationEnd().getName();
        } else if (element.getRepresentedAssociationEnd() != null) {
            reference = element.getRepresentedAssociationEnd().getName();
        } else if (element.getType() != null) {
            reference = element.getType().getName();
        } else if (element.getInState() != null) {
            reference = element.getInState().getName();
        } else if (element.getItemSubjectRef() != null) {
            BpmnItemDefinition item = element.getItemSubjectRef();
            if (item.getStructureRef() != null) {
                reference = item.getStructureRef().getName();
            } else {
                reference = item.getName();
            }
        }
        
        StringBuilder s = new StringBuilder();
        String basename = getDiagram().getModelManager().getModelServices().getElementNamer().getBaseName(element.getMClass());
        if (mlabel != null && !mlabel.equals("")) {
            if (!mlabel.startsWith(basename) || reference == null) {
                s.append(mlabel);
                if (reference != null) {
                    s.append(":");
                }
            }
        }
        
        if (reference != null)
            s.append(reference);
        return s.toString();
    }

    @objid ("60d5d994-55b6-11e2-877f-002564c97630")
    @Override
    public void styleChanged(final IStyle changedStyle) {
        fireVisibilityChanged();
        super.styleChanged(changedStyle);
    }

    @objid ("60d75ff9-55b6-11e2-877f-002564c97630")
    @Override
    public void styleChanged(final StyleKey property, final Object newValue) {
        final StyleKey key = getParent().getStyleKey(MetaKey.SHOWLABEL);
        if (key != null && key.equals(property))
            fireVisibilityChanged();
        else
            super.styleChanged(property, newValue);
    }

    @objid ("60d76002-55b6-11e2-877f-002564c97630")
    @Override
    public void read(IDiagramReader in) {
        // Read version, defaults to 0 if not found
        Object versionProperty = in.readProperty("GmBpmnDataLabel." + MINOR_VERSION_PROPERTY);
        int readVersion = versionProperty == null ? 0 : ((Integer) versionProperty).intValue();
        switch (readVersion) {
        case 0: {
            read_0(in);
            break;
        }
        default: {
            assert (false) : "version number not covered!";
            // reading as last handled version: 0
            read_0(in);
            break;
        }
        }
    }

    @objid ("60d76008-55b6-11e2-877f-002564c97630")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0.
        if (this.minorVersion != 0) {
            out.writeProperty("GmBpmnDataLabel." + MINOR_VERSION_PROPERTY, Integer.valueOf(this.minorVersion));
        }
    }

    @objid ("60d7600e-55b6-11e2-877f-002564c97630")
    private void read_0(IDiagramReader in) {
        super.read(in);
    }

    @objid ("60d76013-55b6-11e2-877f-002564c97630")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

}
