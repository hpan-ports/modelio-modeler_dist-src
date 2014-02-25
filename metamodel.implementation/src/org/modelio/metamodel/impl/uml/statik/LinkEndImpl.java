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
/*   Metamodel version: 9020              */
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

    @objid ("b22872ec-32b2-4b26-a439-2355cc2fb32c")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("16e065f2-79d3-45ae-a65e-56b4ac6268d2")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(LinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("8e0df49a-4c8d-4104-baaa-fb1f812b428d")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("9b15016d-6e82-4130-9299-b7b33b06b4b4")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(LinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("883e5c04-d5bb-45f8-919f-3cc0112b9e8d")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("89dc8b80-dd7e-4b28-8922-54a0b718438a")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("6822bc31-81a8-4b49-9a2c-b94a2cacfdb5")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("4029a617-0946-4cfb-a57f-30735d0a11ed")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("67cdd902-c226-4b13-bc18-5382b64b488a")
    @Override
    public Link getLink() {
        return (Link) getDepVal(LinkEndData.Metadata.LinkDep());
    }

    @objid ("24fa3eef-1135-4d83-b270-129afafdcd66")
    @Override
    public void setLink(Link value) {
        appendDepVal(LinkEndData.Metadata.LinkDep(), (SmObjectImpl)value);
    }

    @objid ("71a2f85f-73f1-4973-b8ad-d16619230f31")
    @Override
    public Instance getTarget() {
        return (Instance) getDepVal(LinkEndData.Metadata.TargetDep());
    }

    @objid ("85a95683-8cbc-448e-b3cd-778bd1327fce")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(LinkEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("4f6c9612-96fa-475c-a517-9191c0b6e586")
    @Override
    public LinkEnd getOppositeOwner() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("f54362f1-b046-4748-bc06-d2380cffcb1d")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("655b9ea7-8dff-4780-bfc7-e2678fc06bcb")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, LinkEndData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("b4079021-f98a-4fbc-879b-03b6e8121de4")
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

    @objid ("f70e7ac1-4f7d-4912-a5c1-f3f0ff566ddf")
    @Override
    public AssociationEnd getModel() {
        return (AssociationEnd) getDepVal(LinkEndData.Metadata.ModelDep());
    }

    @objid ("8b6dab25-574f-4e37-9055-7c272e790e7c")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(LinkEndData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("8ec95264-1f18-4d4a-aa77-687227c717da")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(LinkEndData.Metadata.ConsumerDep());
    }

    @objid ("db628389-9138-4ad2-afe4-93ff0bdcac99")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(LinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("945a18fd-54d9-4cbb-ac1f-b51dd94a77b8")
    @Override
    public LinkEnd getOpposite() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeDep());
    }

    @objid ("a7cd51d8-93fb-4f28-801c-d9fecd1459f9")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("b0984c30-c1e8-4dac-bb04-4e4afd40f353")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(LinkEndData.Metadata.SourceDep());
    }

    @objid ("413a5ae1-71a3-46bd-8508-748e9df6f54d")
    @Override
    public void setSource(Instance value) {
        appendDepVal(LinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("7a313e7c-effa-4ab3-892f-dd87569b2524")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(LinkEndData.Metadata.ProviderDep());
    }

    @objid ("f51faa0b-4a50-4f86-967d-72c33063e4be")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(LinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("cd59b011-cb15-4ef9-9dd0-0810504da71b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
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

}
