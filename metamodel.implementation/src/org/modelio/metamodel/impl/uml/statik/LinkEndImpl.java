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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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

    @objid ("ca4414da-27e5-4592-bb64-6fdaf62820eb")
    @Override
    public boolean isIsOrdered() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsOrderedAtt());
    }

    @objid ("1e858b1f-745b-4968-a6d9-0995dec2537c")
    @Override
    public void setIsOrdered(boolean value) {
        setAttVal(LinkEndData.Metadata.IsOrderedAtt(), value);
    }

    @objid ("2ec5f7f4-82fa-4799-ab6b-b52949e46aac")
    @Override
    public boolean isIsUnique() {
        return (Boolean) getAttVal(LinkEndData.Metadata.IsUniqueAtt());
    }

    @objid ("5956145b-ad48-4787-a765-2a67353da5d6")
    @Override
    public void setIsUnique(boolean value) {
        setAttVal(LinkEndData.Metadata.IsUniqueAtt(), value);
    }

    @objid ("3deb59a6-821e-41ee-a141-4aa3e04bb616")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("9e41e64f-ba97-430f-b6d6-2a3b18bd7dd4")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("5d671178-b58a-48b9-a90c-0f018a040e01")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(LinkEndData.Metadata.MultiplicityMinAtt());
    }

    @objid ("e7fccdce-f1ee-4b76-be56-68ea0854969e")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(LinkEndData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("b35d979e-03fd-46cb-a4b4-179681ddf0ff")
    @Override
    public Link getLink() {
        return (Link) getDepVal(LinkEndData.Metadata.LinkDep());
    }

    @objid ("d9277407-0d8b-4540-8c15-4c85ae1f93c7")
    @Override
    public void setLink(Link value) {
        appendDepVal(LinkEndData.Metadata.LinkDep(), (SmObjectImpl)value);
    }

    @objid ("b173dcc4-92cc-4167-ba81-54bd4e67440d")
    @Override
    public Instance getTarget() {
        return (Instance) getDepVal(LinkEndData.Metadata.TargetDep());
    }

    @objid ("fcb850bb-d75d-4b2b-9426-54453b80b6ae")
    @Override
    public void setTarget(Instance value) {
        appendDepVal(LinkEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("9834a3c6-2926-4a8a-b1b5-0f705190fb40")
    @Override
    public LinkEnd getOppositeOwner() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("275b5c48-56da-4d43-bac1-672f6ac93126")
    @Override
    public void setOppositeOwner(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f4fc2262-30cb-43c5-b3f8-14876842c23c")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, LinkEndData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("ca0364b4-5696-4fce-8664-af43977b174b")
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

    @objid ("48ec71d1-8950-4019-9145-ffec75b0e4e4")
    @Override
    public AssociationEnd getModel() {
        return (AssociationEnd) getDepVal(LinkEndData.Metadata.ModelDep());
    }

    @objid ("e0259cda-a806-4baf-930b-54a0bf0260b0")
    @Override
    public void setModel(AssociationEnd value) {
        appendDepVal(LinkEndData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("31a093be-8c44-4418-a039-c989fb384792")
    @Override
    public RequiredInterface getConsumer() {
        return (RequiredInterface) getDepVal(LinkEndData.Metadata.ConsumerDep());
    }

    @objid ("740fabe0-e870-4d8d-8175-767292b35fa8")
    @Override
    public void setConsumer(RequiredInterface value) {
        appendDepVal(LinkEndData.Metadata.ConsumerDep(), (SmObjectImpl)value);
    }

    @objid ("d5395076-6ad0-487a-ad61-7d7d0a65007f")
    @Override
    public LinkEnd getOpposite() {
        return (LinkEnd) getDepVal(LinkEndData.Metadata.OppositeDep());
    }

    @objid ("f7edad4e-986b-45ca-be94-4d7129dd4aab")
    @Override
    public void setOpposite(LinkEnd value) {
        appendDepVal(LinkEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("dab3687f-717e-44f2-a8d5-0fcf8ee28708")
    @Override
    public Instance getSource() {
        return (Instance) getDepVal(LinkEndData.Metadata.SourceDep());
    }

    @objid ("ef0ad4d9-8107-4b98-90ed-14d745360923")
    @Override
    public void setSource(Instance value) {
        appendDepVal(LinkEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("010e3355-96e1-4447-8b32-03079a5cfb12")
    @Override
    public ProvidedInterface getProvider() {
        return (ProvidedInterface) getDepVal(LinkEndData.Metadata.ProviderDep());
    }

    @objid ("330d14ba-74fe-4809-9dc7-7b29d2a2649d")
    @Override
    public void setProvider(ProvidedInterface value) {
        appendDepVal(LinkEndData.Metadata.ProviderDep(), (SmObjectImpl)value);
    }

    @objid ("c43b096b-08e7-460f-bdca-0b82487786c6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitLinkEnd(this);
        else
          return null;
    }

}
