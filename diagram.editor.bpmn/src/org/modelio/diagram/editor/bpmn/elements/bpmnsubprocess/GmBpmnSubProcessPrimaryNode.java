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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmnsubprocess;

import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.core.ui.images.ElementImageService;
import org.modelio.diagram.editor.bpmn.elements.bpmnnodefooter.GmBpmnNodeFooter;
import org.modelio.diagram.editor.bpmn.elements.bpmnnodeheader.GmBpmnNodeHeader;
import org.modelio.diagram.elements.common.abstractdiagram.GmAbstractDiagram;
import org.modelio.diagram.elements.common.label.modelelement.GmDefaultFlatHeader;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNoStyleCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.elements.core.node.IImageableNode;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey.RepresentationMode;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * This class represents the Gm of a SubProcess.
 */
@objid ("61c9fd79-55b6-11e2-877f-002564c97630")
public class GmBpmnSubProcessPrimaryNode extends GmNoStyleCompositeNode implements IImageableNode {
    /**
     * Current version of this Gm.
     */
    @objid ("61c9fd83-55b6-11e2-877f-002564c97630")
    private final int minorVersion = 1;

    @objid ("61c9fd86-55b6-11e2-877f-002564c97630")
    private static final int MAJOR_VERSION = 0;

    /**
     * Header
     */
    @objid ("61c9fd7f-55b6-11e2-877f-002564c97630")
    private GmBpmnNodeHeader header;

    @objid ("61c9fd81-55b6-11e2-877f-002564c97630")
    private GmBpmnNodeFooter footer;

    @objid ("61c9fd82-55b6-11e2-877f-002564c97630")
    private GmBpmnBodyFreeZone innerZone;

    /**
     * Default constructor.
     * @param diagram the diagram in which this gm is unmasked.
     * @param relatedRef ref
     */
    @objid ("61c9fd88-55b6-11e2-877f-002564c97630")
    public GmBpmnSubProcessPrimaryNode(GmAbstractDiagram diagram, MRef relatedRef) {
        super(diagram, relatedRef);
        this.header = new GmBpmnNodeHeader(diagram, relatedRef, false);
        this.innerZone = new GmBpmnBodyFreeZone(diagram, relatedRef);
        this.footer = new GmBpmnNodeFooter(diagram, relatedRef);
        
        this.header.setRoleInComposition("HEADER");
        this.innerZone.setRoleInComposition("BODY");
        this.footer.setRoleInComposition("FOOTER");
        
        super.addChild(this.header);
        super.addChild(this.innerZone);
        super.addChild(this.footer);
    }

    @objid ("61c9fd91-55b6-11e2-877f-002564c97630")
    @Override
    public void addChild(GmNodeModel child) {
        if (child.getRelatedElement() instanceof BpmnBaseElement &&
            ((BpmnBaseElement) child.getRelatedElement()).getCompositionOwner()
                                                           .equals(getRelatedElement())) {
            this.innerZone.addChild(child);
        } else
            super.addChild(child);
    }

    /**
     * Empty constructor, needed for serialisation.
     */
    @objid ("61c9fd97-55b6-11e2-877f-002564c97630")
    public GmBpmnSubProcessPrimaryNode() {
        // empty constructor for the serialization
    }

    @objid ("61c9fd9a-55b6-11e2-877f-002564c97630")
    @Override
    public boolean canCreate(Class<? extends MObject> type) {
        return BpmnBaseElement.class.isAssignableFrom(type) &&
               !BpmnBoundaryEvent.class.isAssignableFrom(type) &&
               !BpmnLaneSet.class.isAssignableFrom(type);
    }

    @objid ("61cb83fd-55b6-11e2-877f-002564c97630")
    @Override
    public boolean canUnmask(MObject el) {
        return el instanceof BpmnBaseElement &&
               ((BpmnBaseElement) el).getCompositionOwner().equals(getRelatedElement());
    }

    @objid ("61cb8405-55b6-11e2-877f-002564c97630")
    @Override
    public GmCompositeNode getCompositeFor(Class<? extends MObject> metaclass) {
        if (canCreate(metaclass)) {
            return this.innerZone;
        }
        return null;
    }

    @objid ("61cb840f-55b6-11e2-877f-002564c97630")
    @Override
    public Image getImage() {
        return ElementImageService.getImage(getRelatedElement());
    }

    @objid ("61cb8414-55b6-11e2-877f-002564c97630")
    @Override
    public BpmnSubProcess getRelatedElement() {
        return (BpmnSubProcess) super.getRelatedElement();
    }

    @objid ("61cb841b-55b6-11e2-877f-002564c97630")
    @Override
    public RepresentationMode getRepresentationMode() {
        final StyleKey repModeKey = GmBpmnSubProcess.STRUCTURED_KEYS.getStyleKey(MetaKey.REPMODE);
        return getStyle().getProperty(repModeKey);
    }

    @objid ("61cb8422-55b6-11e2-877f-002564c97630")
    @Override
    public void read(IDiagramReader in) {
        // Read version, defaults to 0 if not found
        Object versionProperty = in.readProperty("GmBpmnSubProcessPrimaryNode." + MINOR_VERSION_PROPERTY);
        int readVersion = versionProperty == null ? 0 : ((Integer) versionProperty).intValue();
        switch (readVersion) {
            case 0: {
                read_0(in);
                break;
            }
            case 1: {
                read_1(in);
                break;
            }
            default: {
                assert (false) : "version number not covered!";
                // reading as last handled version: 1
                read_1(in);
                break;
            }
        }
    }

    @objid ("61cb8428-55b6-11e2-877f-002564c97630")
    @Override
    public void refreshFromObModel() {
        super.refreshFromObModel();
        String oldLabel = this.header.getMainLabel();
        this.header.refreshFromObModel();
        firePropertyChange(PROPERTY_LABEL, oldLabel, this.header.getMainLabel());
        firePropertyChange(PROPERTY_LAYOUTDATA, null, this.header.getMainLabel());
        
        if (this.getRelatedElement() != null) {
            if (this.getRelatedElement().isIsForCompensation()) {
                this.footer.setCompensation(true);
            } else {
                this.footer.setCompensation(false);
            }
        
            if (this.getRelatedElement().getLoopCharacteristics() instanceof BpmnStandardLoopCharacteristics) {
                this.footer.setLoop(true);
            } else {
                this.footer.setLoop(false);
            }
        
            if (this.getRelatedElement().getLoopCharacteristics() instanceof BpmnMultiInstanceLoopCharacteristics) {
                BpmnMultiInstanceLoopCharacteristics loop = (BpmnMultiInstanceLoopCharacteristics) this.getRelatedElement()
                                                                                                         .getLoopCharacteristics();
                if (loop.isIsSequencial()) {
                    this.footer.setParallel(false);
                    this.footer.setSequential(true);
                } else {
                    this.footer.setParallel(true);
                    this.footer.setSequential(false);
                }
            } else {
                this.footer.setParallel(false);
                this.footer.setSequential(false);
            }
        }
        this.footer.refreshFromObModel();
        // forcing visual refresh in case Image changed 
        firePropertyChange(PROPERTY_LAYOUTDATA, null, getLayoutData());
    }

    @objid ("61cb842b-55b6-11e2-877f-002564c97630")
    @Override
    public void obElementAdded(MObject movedEl) {
        super.obElementAdded(movedEl);
        refreshFromObModel();
    }

    @objid ("61cb8431-55b6-11e2-877f-002564c97630")
    @Override
    public void obElementsUpdated() {
        super.obElementsUpdated();
        refreshFromObModel();
    }

    /**
     * @return the structured inner zone.
     */
    @objid ("61cb8434-55b6-11e2-877f-002564c97630")
    public GmCompositeNode getInnerZone() {
        return this.innerZone;
    }

    @objid ("61cd0aa1-55b6-11e2-877f-002564c97630")
    @Override
    public List<GmNodeModel> getVisibleChildren() {
        // Returned result depends on current representation mode:
        List<GmNodeModel> ret;
        switch (this.getRepresentationMode()) {
            case IMAGE: {
                ret = Collections.emptyList();
                break;
            }
            default: {
                ret = super.getVisibleChildren();
                break;
            }
        }
        return ret;
    }

    @objid ("61cd0aaa-55b6-11e2-877f-002564c97630")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0.
        if (this.minorVersion != 0) {
            out.writeProperty("GmBpmnSubProcessPrimaryNode." + MINOR_VERSION_PROPERTY, Integer.valueOf(this.minorVersion));
        }
    }

    @objid ("61cd0ab0-55b6-11e2-877f-002564c97630")
    private void read_0(IDiagramReader in) {
        super.read(in);
        this.header = (GmBpmnNodeHeader) this.getChildren().get(0);
        this.innerZone = (GmBpmnBodyFreeZone) this.getChildren().get(1);
        this.footer = (GmBpmnNodeFooter) this.getChildren().get(2);
        
        GmDefaultFlatHeader imageModeHeader = (GmDefaultFlatHeader) this.getChildren().get(3);
        imageModeHeader.delete();
    }

    @objid ("61cd0ab5-55b6-11e2-877f-002564c97630")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

    @objid ("61cd0aba-55b6-11e2-877f-002564c97630")
    private void read_1(final IDiagramReader in) {
        super.read(in);
        this.header = (GmBpmnNodeHeader) this.getChildren().get(0);
        this.innerZone = (GmBpmnBodyFreeZone) this.getChildren().get(1);
        this.footer = (GmBpmnNodeFooter) this.getChildren().get(2);
    }

}
