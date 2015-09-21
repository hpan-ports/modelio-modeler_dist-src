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


/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 9024, by Modeliosoft
 Generator version: 3.0.01.9022
 Generated on: 28 janv. 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 9024, by Modeliosoft
 Generator version: 3.2.07.9022
 Generated on: Mar 9, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.LinkEndData;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000ff2da-c4bf-1fd8-97fe-001ec947cd2a")
public class LinkEndImpl extends ModelElementImpl implements LinkEnd {
    /**
     * Compute the link navigation way from all roles construction.
     * @return the link navigability.
     */
    @objid ("1efdf05d-4abe-4809-a5e2-6e5cf051d3a6")
    @Override
    public boolean isNavigable() {
        return getTarget() != null;
    }

    @objid ("007a3168-2787-1080-943a-001ec947cd2a")
    @Override
    public void setNavigable(final boolean isNavigable) {
        LinkEnd opposite = getOpposite();
        boolean otherNavigable = opposite.isNavigable();
        
        // The source instance is the current source or the opposite end's target according to the old navigability
        Instance source = getSource() != null ? getSource() : opposite.getTarget();
        
        // The target instance is the opposite end's source or the current target according to the old navigability
        Instance target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
        if (isNavigable && !otherNavigable) { // THIS SIDE
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(null);
            opposite.setTarget(null);
        } else if (!isNavigable && otherNavigable) { // OTHER SIDE
            this.setSource(null);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (isNavigable && otherNavigable) { // BOTH SIDES
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (!isNavigable && !otherNavigable) { // NONE
            this.setSource(source);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(null);
        }
    }

    @objid ("0047aacc-27d2-1080-943a-001ec947cd2a")
    @Override
    public void setTarget(final Instance value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();
        
            LinkEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
        
            // The source instance is the current source or the opposite end's target according to the old navigability
            Instance source = getSource() != null ? getSource() : opposite.getTarget();
        
            Instance target = value;
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            }
        } else {
            setTarget(value);
        }
    }

    @objid ("000aa226-27ef-1080-943a-001ec947cd2a")
    @Override
    public void setSource(final Instance value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();
        
            LinkEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
        
            Instance source = value;
        
            // The target instance is the opposite end's source or the current target according to the old navigability
            Instance target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(null);
        
                opposite.setSource(target);
                opposite.setTarget(null);
            }
        } else {
            setSource(value);
        }
    }

    @objid ("001f2be2-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        Instance src = getSource();
        if (src != null) {
            return (SmObjectImpl) src;
        } else {
            // Return the 'opposite' role only if it has a source:
            // Avoid cycle if both ends have no source.
            LinkEnd opp = getOpposite();
            if (opp != null && opp.getSource() != null) {
                return (SmObjectImpl) opp;
            } else {
                return null;
            }
        }
    }

    @objid ("71066600-5b42-11e2-90ce-002564c97630")
    @Override
    public List<SmObjectImpl> getCompositionChildren() {
        final List<SmObjectImpl> compositionChildren = super.getCompositionChildren();
        
        LinkEnd opp = getOpposite();
        
        // Avoid composition loops...
        if (opp != null && opp.getSource() != null) {
            // The other side has a 'strong' owner, do not return it as a child
            compositionChildren.remove(opp);
        }
        return compositionChildren;
    }

    @objid ("001f4a50-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        
        // First look for 'source'
        obj = (SmObjectImpl) getDepVal(((LinkEndSmClass) getClassOf()).getSourceDep());
        if (obj != null) {
            return new SmDepVal(((LinkEndSmClass) getClassOf()).getSourceDep(), obj);
        }
        
        // Return the 'opposite' role only if it has a source:
        // Avoid cycle if both ends have no source.
        LinkEnd opp = getOpposite();
        
        if (opp != null && opp.getSource() != null) {
            return new SmDepVal(((LinkEndSmClass) getClassOf()).getOppositeOwnerDep(), opp);
        } else {
            return null;
        }
    }

    @objid ("0aed289b-c84f-4d32-9047-10a14bf76274")
    @Override
    public Instance getOwner() {
        Instance source = getSource();
        if (source != null) {
            return source;
        } else {
            LinkEnd opposite = getOpposite();
            return opposite != null ? opposite.getTarget() : null;
        }
    }

    @objid ("891a32f4-6ac7-42a6-b286-ad0bf75273a5")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        super.afterEraseDepVal(dep, value);
        
        if (dep == ((LinkEndSmClass) getClassOf()).getSourceDep()) {
            // Workaround bug where the storage handle is not updated
            LinkEnd opposite = getOpposite();
            if (opposite != null) {
                Instance src = opposite.getSource();
                if (src != null) {
                    // detach and attach again
                    opposite.setOpposite(null);
                    opposite.setSource(null);
                    opposite.setSource(src);
                    opposite.setOpposite(this);
                }
            }
        
        }
    }

    @objid ("5ec21244-5f81-48fe-bce9-4af33eac1d39")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(((LinkEndSmClass)getClassOf()).getIsOrderedAtt());
    }

    @objid ("69a61f46-f051-4a9e-b90a-0c82d69a6f6e")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(((LinkEndSmClass)getClassOf()).getIsOrderedAtt(), value);
    }

    @objid ("e4698d2c-a6f3-4a21-b832-e215df1d4931")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(((LinkEndSmClass)getClassOf()).getIsUniqueAtt());
    }

    @objid ("f3a1b570-a519-4d4a-bb46-dc71f14d703c")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(((LinkEndSmClass)getClassOf()).getIsUniqueAtt(), value);
    }

    @objid ("651edb8a-fd47-4aa3-ae7d-b38cf4d7c56c")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(((LinkEndSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("5e650304-7c30-40a7-94b2-17382373a7fd")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(((LinkEndSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("7a51856a-e162-4a0a-886c-c7f55bf4a985")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(((LinkEndSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("fdc0a6b9-09bb-4e93-8bbd-04a358fb6bd7")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(((LinkEndSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("16ae3a9f-9224-4d87-949a-f3e59daf1645")
    @Override
    public Link getLink() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getLinkDep());
        return (obj instanceof Link)? (Link)obj : null;
    }

    @objid ("40546a0f-a7a3-47ea-83b4-efcb0ab1b1d3")
    @Override
    public void setLink(Link value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getLinkDep(), (SmObjectImpl)value);
    }

    @objid ("f107c1c1-e0ea-4f6e-b9a6-61d8a6b9bb8c")
    @Override
    public Instance getTarget() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getTargetDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("63bfe89d-9480-43fa-819d-d48b0b01816a")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("ef580854-65b8-49af-b925-98bb6bc4cad1")
    @Override
    public LinkEnd getOppositeOwner() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getOppositeOwnerDep());
        return (obj instanceof LinkEnd)? (LinkEnd)obj : null;
    }

    @objid ("f74973a5-7f87-41ce-bac7-56d66da2fc86")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getOppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("827d144f-0e9f-4795-b416-5950eb6a6fc7")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((LinkEndSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("5a765762-0dce-4814-b5e3-62426ae7de5a")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3091b29f-b52d-4cf2-b17f-88775d57a766")
    @Override
    public AssociationEnd getModel() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getModelDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("4f91f8cc-1ff6-4eb2-b4c8-dce5cf3379f9")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("d3f0013e-0e94-4357-955e-1b2c5ea7d63c")
    @Override
    public RequiredInterface getConsumer() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getConsumerDep());
        return (obj instanceof RequiredInterface)? (RequiredInterface)obj : null;
    }

    @objid ("7e7c4e57-c48d-49a3-bd4f-a09308f1ea2d")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("0ec3f155-eb66-4666-a119-19ce454e2d63")
    @Override
    public LinkEnd getOpposite() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getOppositeDep());
        return (obj instanceof LinkEnd)? (LinkEnd)obj : null;
    }

    @objid ("f84ce7d9-8adf-44fd-b918-ca993db7d205")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getOppositeDep(), (SmObjectImpl)value);
    }

    @objid ("e129f718-908b-4675-a84b-402e3f370a3b")
    @Override
    public Instance getSource() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getSourceDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("8e7cc76f-5f65-472d-93ae-f509550176d6")
    @Override
    public void setSource(Instance value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getSourceDep(), (SmObjectImpl)value);
    }

    @objid ("77720ab2-30e3-4d21-931e-368aaf084e2b")
    @Override
    public ProvidedInterface getProvider() {
        Object obj = getDepVal(((LinkEndSmClass)getClassOf()).getProviderDep());
        return (obj instanceof ProvidedInterface)? (ProvidedInterface)obj : null;
    }

    @objid ("5dd3a0d5-33b6-4fa1-87f9-2c24af70dd4b")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(((LinkEndSmClass)getClassOf()).getProviderDep(), (SmObjectImpl)value);
    }

    @objid ("5dd6e16e-03a8-411a-85e1-42e35e803e4e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
    }

}
