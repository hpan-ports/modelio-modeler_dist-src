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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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
            if (opp != null && opp.getSource() != null)
                return (SmObjectImpl) opp;
            else
                return null;
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
        obj = (SmObjectImpl) getDepVal(LinkEndData.Metadata.SourceDep());
        if (obj != null) {
            return new SmDepVal(LinkEndData.Metadata.SourceDep(), obj);
        }
        
        // Return the 'opposite' role only if it has a source:
        // Avoid cycle if both ends have no source.
        LinkEnd opp = getOpposite();
        
        if (opp != null && opp.getSource() != null) {
            return new SmDepVal(LinkEndData.Metadata.OppositeOwnerDep(), opp);
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
            return opposite != null ? opposite.getTarget(): null;   
        }
    }

    @objid ("891a32f4-6ac7-42a6-b286-ad0bf75273a5")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        super.afterEraseDepVal(dep, value);
        
        if (dep == LinkEndData.Metadata.getSourceDep()) {
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

    @objid ("9e4470e6-1430-44c1-820f-17e083868840")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("afab1a7f-6047-4d1b-bf63-c9736cf0bf4b")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(LinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("c083ac84-a985-4c85-a979-ced07104732e")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("8c3a5ac4-12f8-461f-b53a-39b411c7e195")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(LinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("5e60cfd3-7335-44a5-94e5-ce2ed21e9bc9")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("01a52109-65cb-4f3c-b54f-d4cfae6539e3")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("322e9568-594c-4b80-85f2-71ae5b2f288b")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("a51fb370-0aeb-4e32-af18-9bbeed82703e")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("74654d48-59a6-4649-a5c0-109797dc256f")
    @Override
    public Link getLink() {
        return (Link) getDepVal(LinkEndData.Metadata.LinkDep());
    }

    @objid ("999522b1-4cbc-4ef8-ae50-f42995e0cfd7")
    @Override
    public void setLink(Link value) {
        appendDepVal(LinkEndData.Metadata.LinkDep(), (SmObjectImpl)value);
    }

    @objid ("80183e88-0818-43c7-98f8-2c77fec59b58")
    @Override
    public Instance getTarget() {
        return (Instance) getDepVal(LinkEndData.Metadata.TargetDep());
    }

    @objid ("0b2a43da-7ee5-40f6-9302-47094a0b6b07")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(LinkEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("c1b1152d-70e2-473a-a6d3-fe6bee959526")
    @Override
    public LinkEnd getOppositeOwner() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("25a9d036-419e-4148-8254-80ebf5941f72")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("297761bb-216a-4f55-aa75-11d6f382dba5")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, LinkEndData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("842cf38d-a931-49c0-93d0-54a881aadef3")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("93e1d088-5281-42eb-b7cb-4bdda6fbcbbf")
    @Override
    public AssociationEnd getModel() {
        return (AssociationEnd) getDepVal(LinkEndData.Metadata.ModelDep());
    }

    @objid ("3ded4b03-e776-4e22-9e04-3998080a199f")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(LinkEndData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("47339707-6205-43cc-bcf3-e69a5d0f9946")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(LinkEndData.Metadata.ConsumerDep());
    }

    @objid ("636b2412-fc85-421e-a949-a1a78e1ecd58")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(LinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("bb9ba407-3d39-408e-ab61-a50497dd079e")
    @Override
    public LinkEnd getOpposite() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeDep());
    }

    @objid ("be22b0e9-e062-490c-bb86-c8696b5bd2fa")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("16f73a05-fd1f-45a6-982d-025e7c2b6ab2")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(LinkEndData.Metadata.SourceDep());
    }

    @objid ("4301937b-1c68-4f5c-adca-39eb2974a11b")
    @Override
    public void setSource(Instance value) {
        appendDepVal(LinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("78969b0a-7537-45dc-a421-1bbb506ebdf2")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(LinkEndData.Metadata.ProviderDep());
    }

    @objid ("6d209d84-cf9f-4b5f-987c-d88505cd702f")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(LinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("630bf40a-51c6-45d8-a368-2cfee4f5d8e5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
    }

}
