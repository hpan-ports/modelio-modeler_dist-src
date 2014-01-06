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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00675638-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class AbstractDiagramImpl extends ModelElementImpl implements AbstractDiagram {
    @objid ("7b19f72d-6977-460e-890e-cac9f338646b")
    @Override
    public int getUiDataVersion() {
        return (Integer) getAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt());
    }

    @objid ("feace419-053a-44b5-94df-336fd0de1bfc")
    @Override
    public void setUiDataVersion(int value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt(), value);
    }

    @objid ("58de6385-fec4-40f9-ada5-79f2995bbc07")
    @Override
    public String getUiData() {
        return (String) getAttVal(AbstractDiagramData.Metadata.UiDataAtt());
    }

    @objid ("a9c1a8db-0b9f-4852-b3e5-7746c04a2b28")
    @Override
    public void setUiData(String value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataAtt(), value);
    }

    @objid ("beefcc7a-29f1-4895-bef2-f14b8bf59401")
    @Override
    public String getPdeProperties() {
        return (String) getAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt());
    }

    @objid ("9380bf54-204e-4658-9d3a-3f05584e9c62")
    @Override
    public void setPdeProperties(String value) {
        setAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt(), value);
    }

    @objid ("e8a90aa2-74b4-450d-a52a-92f7fb8ad386")
    @Override
    public ModelElement getOrigin() {
        return (ModelElement) getDepVal(AbstractDiagramData.Metadata.OriginDep());
    }

    @objid ("969b4062-cfb8-4c32-a550-31066fa5983e")
    @Override
    public void setOrigin(ModelElement value) {
        appendDepVal(AbstractDiagramData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("0880febd-f7c5-4a95-ae0a-8f42f91d5748")
    @Override
    public EList<Element> getRepresented() {
        return new SmList<>(this, AbstractDiagramData.Metadata.RepresentedDep());
    }

    @objid ("21923158-394e-4418-b79b-e664c1e75184")
    @Override
    public <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getRepresented()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2744ca7e-81e2-40f5-b0e0-1ef6ab37e3cd")
    @Override
    public EList<DiagramSet> getReferencingSet() {
        return new SmList<>(this, AbstractDiagramData.Metadata.ReferencingSetDep());
    }

    @objid ("7104a41e-ee14-41b8-af2e-374f2658d16c")
    @Override
    public <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DiagramSet element : getReferencingSet()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("393ffee1-b0a5-4393-a5e6-175f2fcdfff3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("88a901f1-42fc-4e4d-9d14-05a0abb84d3c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(AbstractDiagramData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ad612040-e7db-4e51-a44a-bd417d540182")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAbstractDiagram(this);
        else
          return null;
    }

}
