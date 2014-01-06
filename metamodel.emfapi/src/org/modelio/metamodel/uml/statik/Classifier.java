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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;

@objid ("0003645c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Classifier extends NameSpace {
    @objid ("fec11273-d533-460c-a62b-d348c533304c")
    EList<Operation> getOwnedOperation();

    @objid ("1e730bed-e1e2-4d35-91bd-e571cec7678c")
    <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass);

    @objid ("ae633d74-3199-4156-8135-31d35f929efa")
    EList<InformationItem> getRepresentation();

    @objid ("398795af-ec90-4d94-83dc-ffa7e92dd063")
    <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("788f861e-299b-4af0-a88b-bcce96879df2")
    EList<Substitution> getSubstitued();

    @objid ("a34b8f8a-897d-4b57-b325-c3430525d4e7")
    <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass);

    @objid ("b201b6af-4efd-4d9b-a444-38b62d2aa30e")
    EList<Attribute> getOwnedAttribute();

    @objid ("6cc261aa-9d19-4dba-8d57-21d06875a75a")
    <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass);

    @objid ("01a96c5f-e8a5-4852-92e7-f0e69403e792")
    EList<NaryAssociationEnd> getOwnedNaryEnd();

    @objid ("22c2108e-f73b-44c9-9afe-d8d08f60c2d3")
    <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("cf20ed83-73bb-4a71-8da2-db95056eb13d")
    EList<InformationFlow> getConveyer();

    @objid ("5790d887-b072-4248-bbab-4ffaf8a12159")
    <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass);

    @objid ("e192bf20-1e3f-459a-8c2d-7693ae5d66cb")
    EList<Substitution> getSubstitutingSubstitution();

    @objid ("85d7ce77-4acd-457a-b1f5-36432aaac6a7")
    <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass);

    @objid ("0c5f2991-2ef4-4fba-bbd8-93438c12b226")
    EList<AssociationEnd> getTargetingEnd();

    @objid ("2cbbdd32-f458-4d0c-8174-3eb73b5d0ff9")
    <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

    @objid ("2577d462-d52c-4f6b-a410-7a45235f37b6")
    EList<AssociationEnd> getOwnedEnd();

    @objid ("45c41103-8d75-420b-b464-d3810e0e3697")
    <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("8bc3c6c9-4d70-436d-9675-caa776dcbb79")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("252c2585-daca-48ec-9854-f0eb865d18a0")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("389d6469-adcd-4bb1-b687-a2afcf24e183")
    EList<RaisedException> getThrowing();

    @objid ("c8792698-c1c0-4973-97d5-ec9c5b24698c")
    <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass);

    @objid ("651619a0-8c19-4eb6-b1d9-31d03ae87e94")
    EList<BindableInstance> getInternalStructure();

    @objid ("db867317-f135-4714-8735-36e9c21c65de")
    <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass);

}
