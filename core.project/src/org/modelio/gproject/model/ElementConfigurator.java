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
                                    

package org.modelio.gproject.model;

import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("dc130502-e9e1-41d8-9e62-ee45aae6a134")
public class ElementConfigurator implements IElementConfigurator {
    @objid ("9ba6a0e8-6ef8-47f1-b976-29f2b5117786")
    public static final String AGGREGATION = "aggregation";

    @objid ("af9a094d-544e-4695-9e49-af785ce51313")
    private ElementConfiguratorVisitor visitor;

    @objid ("f4629918-aa7f-4ea8-93ee-00f36a7a1406")
    public static final Object COMPLETE = "complete";

    @objid ("4cb27afe-9379-478d-88e7-23e973100aab")
    @Override
    public void configure(IModelFactory modelFactory, MObject element, Map<String, Object> properties) {
        this.visitor = new ElementConfiguratorVisitor(modelFactory, properties);
        element.accept(this.visitor);
    }

    @objid ("ddc02cb7-9098-41cd-8fbf-3b83fe4b4fd4")
    private static class ElementConfiguratorVisitor extends DefaultModelVisitor {
        @objid ("27c7211c-965c-4162-979f-a6fa9ecfd423")
        private Map<String, Object> properties;

        @objid ("78e24877-afec-4a4f-9c1f-1699eb0e8fa4")
        private IModelFactory modelFactory;

        @objid ("63ae6187-35f0-4867-a7a2-71b87a0ccc14")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            AggregationKind v = theAssociationEnd.getAggregation();
            String prop = (String) this.properties.get(AGGREGATION);
            if (prop != null) {
                v = AggregationKind.valueOf(prop);
            }
            if (v != null) {
                theAssociationEnd.setAggregation(v);
            
                if (v == AggregationKind.KINDISCOMPOSITION) {
                    AssociationEnd opposite = theAssociationEnd.getOpposite();
                    opposite.setMultiplicityMin("1");
                    opposite.setMultiplicityMax("1");
                } else if (v == AggregationKind.KINDISAGGREGATION) {
                    AssociationEnd opposite = theAssociationEnd.getOpposite();
                    opposite.setMultiplicityMin("0");
                    opposite.setMultiplicityMax("1");
                } else {
                    theAssociationEnd.setMultiplicityMin("0");
                    theAssociationEnd.setMultiplicityMax("1");
                }
            
            }
            return super.visitAssociationEnd(theAssociationEnd);
        }

        @objid ("817bbef7-90c2-4cec-a610-8e734d8ef1cf")
        @Override
        public Object visitActivityParameterNode(ActivityParameterNode theActivityParameterNode) {
            if (this.properties.containsKey(COMPLETE)) {
                // Create the behavior parameter
                final BehaviorParameter param = this.modelFactory.createBehaviorParameter();
            
                final Activity activity = theActivityParameterNode.getOwner();
                activity.getParameter().add(param);
            
                // Associate the behavior parameter to the activity parameter
                // node.
                theActivityParameterNode.setRepresentedRealParameter(param);
                theActivityParameterNode.setName(param.getName());
            
            }
            return theActivityParameterNode;
        }

        @objid ("f60cb054-fcdb-4438-968e-775c45223d97")
        @Override
        public Object visitObjectNode(ObjectNode theObjectNode) {
            if (this.properties.containsKey(COMPLETE)) {
                // Create a variable in the activity local collaboration
                final Activity activity = getActivity(theObjectNode);
                final Collaboration locals = getLocalCollaboration(activity);
                final BindableInstance var = this.modelFactory.createBindableInstance();
            
                var.setOwner(locals);
            
                // Let the node reference the variable
                theObjectNode.setRepresented(var);
                theObjectNode.setName(var.getName());
            
            }
            return theObjectNode;
        }

        @objid ("20d7484e-d060-458f-bca5-9f0aa4805d61")
        private Collaboration getLocalCollaboration(Activity activity) {
            final List<Collaboration> collabs = activity.getOwnedCollaboration();
            // Return the first collaboration names "locals"
            for (Collaboration c : collabs) {
                if (c.getName().equals("locals")) {
                    return c;
                }
            }
            
            // Return the first collaboration
            if (!collabs.isEmpty()) {
                return collabs.get(0);
            }
            
            // Create a "locals" collaboration and return it.
            final Collaboration created = this.modelFactory.createCollaboration();
            created.setName("locals");
            activity.getOwnedCollaboration().add(created);
            return created;
        }

        @objid ("855c3284-47dd-4605-8baa-f71c264ff051")
        private static Activity getActivity(ActivityNode aNode) {
            MObject o = aNode;
            
            while (o != null && !(o instanceof Activity)) {
                o = o.getCompositionOwner();
            }
            return (Activity) o;
        }

        @objid ("51cb5419-3b26-4681-9691-e615a05bb706")
        public ElementConfiguratorVisitor(IModelFactory modelFactory, Map<String, Object> properties) {
            this.modelFactory = modelFactory;
            this.properties = properties;
        }

    }

}
