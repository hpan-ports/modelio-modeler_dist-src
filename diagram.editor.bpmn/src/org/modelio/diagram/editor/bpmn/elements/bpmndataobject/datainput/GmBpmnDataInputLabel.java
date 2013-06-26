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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmndataobject.datainput;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.bpmn.elements.bpmndataobject.GmBpmnDataLabel;
import org.modelio.diagram.editor.bpmn.elements.bpmndataobject.GmBpmnDataObjectStyleKeys;
import org.modelio.diagram.elements.common.abstractdiagram.GmAbstractDiagram;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("60b447e1-55b6-11e2-877f-002564c97630")
public class GmBpmnDataInputLabel extends GmBpmnDataLabel {
    /**
     * Current version of this Gm. Defaults to 0.
     */
    @objid ("60b5ce39-55b6-11e2-877f-002564c97630")
    private final int minorVersion = 0;

    @objid ("60b5ce3c-55b6-11e2-877f-002564c97630")
    private static final int MAJOR_VERSION = 0;

    @objid ("60b5ce3e-55b6-11e2-877f-002564c97630")
    public GmBpmnDataInputLabel(final GmAbstractDiagram diagram, final MRef ref) {
        super(diagram, ref);
    }

    @objid ("60b5ce48-55b6-11e2-877f-002564c97630")
    @Override
    protected String computeLabel() {
        String mlabel = null;
        String reference = null;
        
        if (getRelatedElement() != null && !getRelatedElement().getName().equals("")) {
            mlabel = getRelatedElement().getName();
        }
        
        BpmnDataInput element = (BpmnDataInput) getRelatedElement();
        if (element.getRepresentedAttribute() != null) {
            reference = element.getRepresentedAttribute().getName();
        } else if (element.getRepresentedInstance() != null) {
            reference = element.getRepresentedInstance().getName();
        } else if (element.getRepresentedAssociationEnd() != null) {
            reference = element.getRepresentedAssociationEnd().getName();
        } else if (element.getRepresentedParameter() != null) {
            reference = element.getRepresentedParameter().getName();
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
        
        Boolean showrepresented = getStyle().getProperty(GmBpmnDataObjectStyleKeys.SHOWREPRESENTED);
        
        if (!showrepresented) {
            if (reference != null) {
                s.append(reference);
            } else if (mlabel != null) {
                s.append(mlabel);
            }
        } else {
            if (mlabel != null) {
                s.append(mlabel);
                if (reference != null) {
                    s.append(" : ");
                }
            }
        
            if (reference != null) {
                s.append(reference);
            }
        
        }
        return s.toString();
    }

    /**
     * Empty c'tor for deserialisation.
     */
    @objid ("60b5ce4d-55b6-11e2-877f-002564c97630")
    public GmBpmnDataInputLabel() {
        // empty constructor for the serialization
    }

    @objid ("60b5ce50-55b6-11e2-877f-002564c97630")
    @Override
    public void read(IDiagramReader in) {
        // Read version, defaults to 0 if not found
        Object versionProperty = in.readProperty("GmBpmnDataInputLabel." + MINOR_VERSION_PROPERTY);
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

    @objid ("60b5ce56-55b6-11e2-877f-002564c97630")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0.
        if (this.minorVersion != 0) {
            out.writeProperty("GmBpmnDataInputLabel." + MINOR_VERSION_PROPERTY, Integer.valueOf(this.minorVersion));
        }
    }

    @objid ("60b5ce5c-55b6-11e2-877f-002564c97630")
    private void read_0(IDiagramReader in) {
        super.read(in);
    }

    @objid ("60b5ce61-55b6-11e2-877f-002564c97630")
    @Override
    public int getMajorVersion() {
        return MAJOR_VERSION;
    }

}
