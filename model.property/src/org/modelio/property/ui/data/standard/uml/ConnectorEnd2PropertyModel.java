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
                                    

package org.modelio.property.ui.data.standard.uml;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.element.SingleElementType;
import org.modelio.core.ui.ktable.types.list.EditableListType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * <i>ConnectorEnd</i> data model.
 * <p>
 * This class provides the list of properties for the <i>ConnectorEnd</i> metaclass.
 */
@objid ("8ef29195-c068-11e1-8c0a-002564c97630")
public class ConnectorEnd2PropertyModel extends AbstractPropertyModel<ConnectorEnd> {
    /**
     * Properties to display for <i>LinkEnd</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the metaclass name)
     * <li>for other rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a6c199a5-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] { "ConnectorEnd", "LinkName", "Base", "ConnectorRepresentedFeature",
            "Linked", "Name", "ConnectorEndRepresentedFeature", "MultiplicityMin", "MultiplicityMax", "IsNavigable", "IsOrdered",
            "IsUnique" };

    @objid ("8ef291a3-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = null;

    @objid ("8ef291a4-c068-11e1-8c0a-002564c97630")
    private StringType stringType = null;

    @objid ("8ef291a5-c068-11e1-8c0a-002564c97630")
    private BooleanType booleanType = null;

    @objid ("8ef291a6-c068-11e1-8c0a-002564c97630")
    private EditableListType cardinalityMinType = null;

    @objid ("8ef291a7-c068-11e1-8c0a-002564c97630")
    private EditableListType cardinalityMaxType = null;

    @objid ("8ef291a8-c068-11e1-8c0a-002564c97630")
    private SingleElementType linkedType = null;

    @objid ("8ef291a9-c068-11e1-8c0a-002564c97630")
    private SingleElementType assocType = null;

    @objid ("8ef291aa-c068-11e1-8c0a-002564c97630")
    private SingleElementType connectorRepresentedFeatureType = null;

    @objid ("8ef291ab-c068-11e1-8c0a-002564c97630")
    private SingleElementType connectorEndRepresentedFeatureType = null;

    @objid ("bb791120-19f2-11e2-ad19-002564c97630")
    private final BooleanType navigabilityType;

    @objid ("8ef291ac-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 3;
    }

    @objid ("8ef291b1-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return PROPERTIES.length;
    }

    @objid ("8ef291b6-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        if (row == 1 || row == 2 || row == 3) {
            return getLinkPropertyValue(row, col);
        }
        
        // LinkEnd rows
        switch (col) {
        
        case 0: // col 0 is the property name
            if (row == 0) {
                return this.theEditedElement.getName() + " association";
            }
            // else
            return PROPERTIES[row];
        
        case 1:
            LinkEnd relatedEnd = getRelatedEnd(this.theEditedElement);
            if (relatedEnd != null) {
                return getPropertyValue(row, relatedEnd);
            }
            // else
            return null;
        
        case 2:
            return getPropertyValue(row, this.theEditedElement);
        
        default:
            return null;
        }
    }

    @objid ("8ef291bc-c068-11e1-8c0a-002564c97630")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        switch (col) {
        
        case 0: // col 0 is the property name
            return this.labelStringType;
        
        case 1:
        case 2:
            switch (row) {
            case 0: // Title
                return this.labelStringType;
        
            case 1:
                // Link name
                return this.stringType;
        
            case 2: // Link base Association
                if (col == 1) {
                    return this.assocType;
                }
                // else
                return this.stringType;
            case 3:
                if (col == 1) {
                    return this.connectorRepresentedFeatureType;
                }
                // else
                return this.stringType;
            case 4: // LinkEnd Type
                return this.linkedType;
            case 5: // LinkEnd Name
                return this.stringType;
            case 6:
                return this.connectorEndRepresentedFeatureType;
            case 7:
                return this.cardinalityMinType;
            case 8:
                return this.cardinalityMaxType;
            case 9:
                return this.navigabilityType;
            case 10:
                return this.booleanType;
            case 11:
                return this.booleanType;
            default:
                return null;
            }
        default:
            return null;
        }
    }

    @objid ("8ef291c3-c068-11e1-8c0a-002564c97630")
    @Override
    public void setValueAt(int row, int col, Object value) {
        switch (col) {
        
        case 0:
            return;
        
        case 1:
            LinkEnd relatedEnd = getRelatedEnd(this.theEditedElement);
            if (relatedEnd != null) {
                setPropertyValue(row, relatedEnd, value);
            }
            return;
        case 2:
            setPropertyValue(row, this.theEditedElement, value);
            return;
        default:
            return;
        }
    }

    @objid ("8ef291c9-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean isEditable(int row, int col) {
        if (col == 0) {
            // Labels are not editable
            return false;
        } else if (row == 1 || row == 2 || row == 3) {
            // Link lines: only the first cell is editable
            return false;
        } else if (col == 1) {
            LinkEnd relatedEnd = getRelatedEnd(this.theEditedElement);
            if (!relatedEnd.isModifiable()) {
                return false;
            }
        } else if (col == 2) {
            if (!this.theEditedElement.isModifiable()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Create a new <i>LinkEnd</i> data model from an <i>LinkEnd</i>.
     * @param model
     */
    @objid ("8ef4182b-c068-11e1-8c0a-002564c97630")
    public ConnectorEnd2PropertyModel(ConnectorEnd theConnectorEnd) {
        super(theConnectorEnd);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
        this.booleanType = new BooleanType();
        
        ICoreSession session = CoreSession.getSession(this.theEditedElement);
        this.assocType = new SingleElementType(true, NaryAssociation.class, session);
        this.linkedType = new SingleElementType(false, Instance.class, session);
        
        List<java.lang.Class<? extends Element>> connectorRepresentedFeatureValues = new ArrayList<>();
        connectorRepresentedFeatureValues.add(Attribute.class);
        connectorRepresentedFeatureValues.add(NaryAssociation.class);
        connectorRepresentedFeatureValues.add(NaryLink.class);
        this.connectorRepresentedFeatureType = new SingleElementType(true, connectorRepresentedFeatureValues);
        
        List<java.lang.Class<? extends Element>> connectorEndRepresentedFeatureValues = new ArrayList<>();
        connectorEndRepresentedFeatureValues.add(Attribute.class);
        connectorEndRepresentedFeatureValues.add(AssociationEnd.class);
        connectorEndRepresentedFeatureValues.add(LinkEnd.class);
        this.connectorEndRepresentedFeatureType = new SingleElementType(true, connectorEndRepresentedFeatureValues);
        
        List<String> cardinalityMinValues = new ArrayList<>();
        cardinalityMinValues.add("0");
        cardinalityMinValues.add("1");
        this.cardinalityMinType = new EditableListType(true, cardinalityMinValues);
        
        List<String> cardinalityMaxValues = new ArrayList<>();
        cardinalityMaxValues.add("1");
        cardinalityMaxValues.add("*");
        this.cardinalityMaxType = new EditableListType(true, cardinalityMaxValues);
        
        this.navigabilityType = new BooleanType();
    }

    /**
     * @return
     * @return
     */
    @objid ("8ef41831-c068-11e1-8c0a-002564c97630")
    private Object getLinkPropertyValue(int row, int col) {
        // Link rows
        if (col == 0) {
            return PROPERTIES[row];
        } else if (col == 1) {
            return getPropertyValue(row, this.theEditedElement);
        } else {
            if (row == 1) {
                return ""; // Link name
            }
            // else
            return ""; // Link base Association
        }
    }

    @objid ("8ef41837-c068-11e1-8c0a-002564c97630")
    private Object getPropertyValue(int row, LinkEnd aLinkEnd) {
        LinkEnd relatedEnd = getRelatedEnd(aLinkEnd);
        
        switch (row) {
        case 0: // Title
            if (relatedEnd == null) {
                return "";
            }
        
            Instance type = relatedEnd.getTarget();
        
            if (type == null) {
                return "";
            }
        
            if (aLinkEnd == this.theEditedElement) {
                return "To: " + type.getName();
            }
            // else
            return "From: " + type.getName();
        
        case 1:
            // Link name
            return "<no link>";
        case 2:
            // Link base association
            return null;
        case 3:
            return null;
        case 4:
            if (relatedEnd != null) {
                Instance relatedInstance = relatedEnd.getTarget();
                return relatedInstance;
            }
            // else
            return null;
        case 5:
            return aLinkEnd.getName();
        case 6:
            if (aLinkEnd instanceof ConnectorEnd) {
                return ((ConnectorEnd) aLinkEnd).getRepresentedFeature();
            }
            // else
            return null;
        case 7:
            return aLinkEnd.getMultiplicityMin();
        case 8:
            return aLinkEnd.getMultiplicityMax();
        case 9:
            return aLinkEnd.isNavigable();
        case 10:
            return aLinkEnd.isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
        case 11:
            return aLinkEnd.isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
        default:
            return null;
        }
    }

    @objid ("8ef4183e-c068-11e1-8c0a-002564c97630")
    private LinkEnd getRelatedEnd(LinkEnd associationEnd) {
        return associationEnd.getOpposite();
    }

    @objid ("8ef41847-c068-11e1-8c0a-002564c97630")
    private void setPropertyValue(int row, LinkEnd linkEnd, Object value) {
        switch (row) {
        case 0:
            return;
        case 1:
            break;
        
        case 2:
            break;
        case 3:
            break;
        case 4:
            LinkEnd relatedEnd = getRelatedEnd(linkEnd);
            if (relatedEnd != null) {
                relatedEnd.setTarget((Instance) value, true);
            }
            break;
        case 5:
            linkEnd.setName(String.valueOf(value));
            break;
        case 6:
            if (linkEnd instanceof ConnectorEnd) {
                ((ConnectorEnd) linkEnd).setRepresentedFeature((ModelElement) value);
            }
            break;
        case 7:
            linkEnd.setMultiplicityMin(String.valueOf(value));
            break;
        case 8:
            linkEnd.setMultiplicityMax(String.valueOf(value));
            break;
        case 9:
            linkEnd.setNavigable((Boolean) value);
            break;
        case 10:
            linkEnd.setIsOrdered(((Boolean) value).booleanValue());
            break;
        case 11:
            linkEnd.setIsUnique(((Boolean) value).booleanValue());
            break;
        default:
            return;
        }
    }

}
