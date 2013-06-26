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
    @objid ("48dec279-f48e-449a-918c-f9a0f7856af0")
    @Override
    public int getUiDataVersion() {
        return (Integer) getAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt());
    }

    @objid ("4cc18a1e-0983-4dde-938f-c1efe3ad0f26")
    @Override
    public void setUiDataVersion(int value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataVersionAtt(), value);
    }

    @objid ("d55f23e4-ba6e-4f36-ba24-42de12659be3")
    @Override
    public String getUiData() {
        return (String) getAttVal(AbstractDiagramData.Metadata.UiDataAtt());
    }

    @objid ("e434d596-722c-44fb-8311-4ef467daa1cf")
    @Override
    public void setUiData(String value) {
        setAttVal(AbstractDiagramData.Metadata.UiDataAtt(), value);
    }

    @objid ("9d896758-2b87-4000-8f80-558ef8dba53f")
    @Override
    public String getPdeProperties() {
        return (String) getAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt());
    }

    @objid ("320bf635-6f5c-400f-9cfe-024abda70c87")
    @Override
    public void setPdeProperties(String value) {
        setAttVal(AbstractDiagramData.Metadata.PdePropertiesAtt(), value);
    }

    @objid ("5198b4df-4ea6-494b-bde8-10a9a1d2c9ac")
    @Override
    public ModelElement getOrigin() {
        return (ModelElement) getDepVal(AbstractDiagramData.Metadata.OriginDep());
    }

    @objid ("57c32df4-5ac2-4daf-89ce-8e36757f6a83")
    @Override
    public void setOrigin(ModelElement value) {
        appendDepVal(AbstractDiagramData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("4f899bd2-4494-47f2-865e-0aa96836c0c6")
    @Override
    public EList<Element> getRepresented() {
        return new SmList<>(this, AbstractDiagramData.Metadata.RepresentedDep());
    }

    @objid ("8aef130f-fdb8-4a29-93b7-67cbc9a03efd")
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

    @objid ("917f0ac8-56f1-4e15-a77f-4f515f9d2c9f")
    @Override
    public EList<DiagramSet> getReferencingSet() {
        return new SmList<>(this, AbstractDiagramData.Metadata.ReferencingSetDep());
    }

    @objid ("961700dc-e1d2-44c0-b518-67540f3ddbf1")
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

    @objid ("f51ac304-ed26-437d-93a8-49897d0aeda1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4fb761b3-5a3e-4001-ba02-9a60fd57f8d1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AbstractDiagramData.Metadata.OriginDep());
        if (obj != null)
          return new SmDepVal(AbstractDiagramData.Metadata.OriginDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ef7cee05-ddda-43f0-b12d-41ce194799aa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAbstractDiagram(this);
        else
          return null;
    }

}
