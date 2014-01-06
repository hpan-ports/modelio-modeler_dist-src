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
/*   Metamodel version: 9019              */
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

    @objid ("157816df-ecfe-48f6-931c-4e3137481aeb")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("5847770f-ed14-422a-97a8-9efb03cd9c49")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(LinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("555e7bc0-0a72-4f29-930a-85ffac12c573")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("c0d0f148-26bf-45c4-a17e-ea823bb9413e")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(LinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("e057734d-3b45-43f5-809a-1cf3c4729975")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("06b1ccc0-4345-4194-a068-15dc7944ca23")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("91be8146-3cee-4f58-af73-d5edb61cefd5")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("cf78008d-5317-44e2-b576-5d15edaabfdf")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("5128c691-e503-439b-8ddb-3b2daeeae989")
    @Override
    public Link getLink() {
        return (Link) getDepVal(LinkEndData.Metadata.LinkDep());
    }

    @objid ("377dee65-5a54-4c27-8cbc-3ee49876cbe2")
    @Override
    public void setLink(Link value) {
        appendDepVal(LinkEndData.Metadata.LinkDep(), (SmObjectImpl)value);
    }

    @objid ("38274e93-81e6-4fe4-93af-98def0f0a26b")
    @Override
    public Instance getTarget() {
        return (Instance) getDepVal(LinkEndData.Metadata.TargetDep());
    }

    @objid ("926163e6-d79c-48f6-934c-2e390ebcf8da")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(LinkEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("704122fd-175c-4536-9b50-b473abc42a0a")
    @Override
    public LinkEnd getOppositeOwner() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("ffef40b9-4c32-4c3a-af72-a451025229a2")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f932c6b0-1387-496f-b142-494835222492")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, LinkEndData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("168dc6a7-eac3-4726-b76a-88b2125d7202")
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

    @objid ("d62d28f6-aca9-42c3-a69e-cca6c6c3ad36")
    @Override
    public AssociationEnd getModel() {
        return (AssociationEnd) getDepVal(LinkEndData.Metadata.ModelDep());
    }

    @objid ("623ece8a-0e57-4d53-a70d-9d3783c5e736")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(LinkEndData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("0dd0d81b-815e-49ff-b274-551c357b8c8e")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(LinkEndData.Metadata.ConsumerDep());
    }

    @objid ("66dda26a-6f52-466e-93b3-eb310663b4c6")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(LinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("6656c2b5-cc00-41cd-b9f4-0505d725dccd")
    @Override
    public LinkEnd getOpposite() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeDep());
    }

    @objid ("8542a536-9ccb-43af-8965-0b2226cd202c")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("9ce23912-14d3-40aa-a456-834e1e761214")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(LinkEndData.Metadata.SourceDep());
    }

    @objid ("fa7711fd-8188-4db7-9e47-12b7ec136412")
    @Override
    public void setSource(Instance value) {
        appendDepVal(LinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("8255570b-8aec-4535-ae32-c1c2e1ae07ab")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(LinkEndData.Metadata.ProviderDep());
    }

    @objid ("8f383ced-1b07-40de-8dae-40828873a17a")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(LinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("344814ae-b1f2-4234-bf03-195d33cfbda2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
    }

}
