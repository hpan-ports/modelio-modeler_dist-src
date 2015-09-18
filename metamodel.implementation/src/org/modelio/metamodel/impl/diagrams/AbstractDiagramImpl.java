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
    @objid ("22349b43-eb3c-4ca3-ac10-294fd5578f11")
    @Override
    public int getUiDataVersion() {
        return (Integer) getAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt());
    }

    @objid ("618d7d93-1d52-464c-9d44-b516c43ecba8")
    @Override
    public void setUiDataVersion(int value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt(), value);
    }

    @objid ("454c36c2-2b6b-4c88-862b-a345f661bb54")
    @Override
    public String getUiData() {
        return (String) getAttVal(AbstractDiagramData.Metadata.UiDataAtt());
    }

    @objid ("b323994a-0fd4-402e-b51a-658767d65209")
    @Override
    public void setUiData(String value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataAtt(), value);
    }

    @objid ("dbbac968-e7c0-48d7-a05f-3c0e436b6726")
    @Override
    public String getPdeProperties() {
        return (String) getAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt());
    }

    @objid ("9c9232b8-5c38-4417-89a8-de00e44e9e4a")
    @Override
    public void setPdeProperties(String value) {
        setAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt(), value);
    }

    @objid ("021cfe78-2be4-442c-90da-948445007f7e")
    @Override
    public ModelElement getOrigin() {
        return (ModelElement) getDepVal(AbstractDiagramData.Metadata.OriginDep());
    }

    @objid ("8b23229f-f1ab-43cd-9be6-cf199a7f9e0e")
    @Override
    public void setOrigin(ModelElement value) {
        appendDepVal(AbstractDiagramData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("a8f57f3a-6098-49d6-89db-b2ce52a4d93a")
    @Override
    public EList<Element> getRepresented() {
        return new SmList<>(this, AbstractDiagramData.Metadata.RepresentedDep());
    }

    @objid ("0d875304-63c5-4c67-8f53-3cf7c73516fe")
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

    @objid ("5a66c97f-a0ba-44e4-ba9e-3fd8e1074c09")
    @Override
    public EList<DiagramSet> getReferencingSet() {
        return new SmList<>(this, AbstractDiagramData.Metadata.ReferencingSetDep());
    }

    @objid ("39de26fb-8d7d-43c3-a34b-fa07c0436320")
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

    @objid ("3dc1f31d-3332-438e-9fb5-a427b977b043")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9cb30bb9-9dd9-4b53-9526-80fd63efca3e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(AbstractDiagramData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("705e066d-5cc7-4772-9a25-5155532a7825")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAbstractDiagram(this);
        else
          return null;
    }

}
