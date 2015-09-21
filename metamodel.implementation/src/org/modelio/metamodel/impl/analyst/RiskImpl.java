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
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: May 06, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Risk;
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.impl.analyst.RiskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("7ef98891-2302-46f0-b347-abe98f0bc381")
public class RiskImpl extends AnalystElementImpl implements Risk {
    @objid ("3db72107-235c-489a-9311-13d09c830e4b")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRiskVersion();
    }

    @objid ("afcd5f2e-da1a-4438-8617-cc77d1f1add3")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRiskVersion();
    }

    @objid ("f5343114-7790-4b9b-909a-42440bb8faab")
    @Override
    public EList<Risk> getSubRisk() {
        return new SmList<>(this, ((RiskSmClass)getClassOf()).getSubRiskDep());
    }

    @objid ("e2a72299-9dac-4972-a487-756707427fd5")
    @Override
    public <T extends Risk> List<T> getSubRisk(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Risk element : getSubRisk()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("51f7a68c-5511-4d45-baa7-3838e5965803")
    @Override
    public RiskContainer getOwnerContainer() {
        Object obj = getDepVal(((RiskSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof RiskContainer)? (RiskContainer)obj : null;
    }

    @objid ("04fa492f-f57f-40c8-80b1-c98dca92ec4e")
    @Override
    public void setOwnerContainer(RiskContainer value) {
        appendDepVal(((RiskSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("f105e8ac-39c4-458d-917f-de8cbfa21867")
    @Override
    public Risk getParentRisk() {
        Object obj = getDepVal(((RiskSmClass)getClassOf()).getParentRiskDep());
        return (obj instanceof Risk)? (Risk)obj : null;
    }

    @objid ("096c30c5-04ab-4e4b-b9dd-8180665f6bc1")
    @Override
    public void setParentRisk(Risk value) {
        appendDepVal(((RiskSmClass)getClassOf()).getParentRiskDep(), (SmObjectImpl)value);
    }

    @objid ("b694e67d-d506-47dd-ac76-d0f439fb443b")
    @Override
    public EList<Risk> getArchivedRiskVersion() {
        return new SmList<>(this, ((RiskSmClass)getClassOf()).getArchivedRiskVersionDep());
    }

    @objid ("d0d18909-60d8-4344-8a15-f5f2c6204943")
    @Override
    public <T extends Risk> List<T> getArchivedRiskVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Risk element : getArchivedRiskVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ff543d3c-af8a-4f68-983a-5184f6574417")
    @Override
    public Risk getLastRiskVersion() {
        Object obj = getDepVal(((RiskSmClass)getClassOf()).getLastRiskVersionDep());
        return (obj instanceof Risk)? (Risk)obj : null;
    }

    @objid ("92935ab6-672a-4684-977d-ac991f60d8b4")
    @Override
    public void setLastRiskVersion(Risk value) {
        appendDepVal(((RiskSmClass)getClassOf()).getLastRiskVersionDep(), (SmObjectImpl)value);
    }

    @objid ("a40d98f7-1b9b-4a0a-958a-c1f76384e3c3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((RiskSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // ParentRisk
        obj = (SmObjectImpl)this.getDepVal(((RiskSmClass)getClassOf()).getParentRiskDep());
        if (obj != null)
          return obj;
        // LastRiskVersion
        obj = (SmObjectImpl)this.getDepVal(((RiskSmClass)getClassOf()).getLastRiskVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d2f0327d-fbff-4ccf-b0f8-6ec7ac62c85c")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((RiskSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentRisk
        dep = ((RiskSmClass)getClassOf()).getParentRiskDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastRiskVersion
        dep = ((RiskSmClass)getClassOf()).getLastRiskVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("fa25f27f-5241-49c5-a165-ab087f89cf4c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRisk(this);
        else
          return null;
    }

}
