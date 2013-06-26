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
                                    

package org.modelio.gproject.model.importer.defaultimporter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.importer.core.ICompositionGetter;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007f1552-d3aa-108f-8d81-001ec947cd2a")
public class DefaultCompositionGetter implements ICompositionGetter {
    @objid ("0074d0b0-5541-1091-8d81-001ec947cd2a")
    @Override
    public List<SmObjectImpl> getChildren(SmObjectImpl anObject) {
        return new Impl().execute(anObject);
    }

    @objid ("00750d32-5541-1091-8d81-001ec947cd2a")
    private Collection<SmObjectImpl> getAllChildren(final Collection<SmObjectImpl> roots, final StopFilter filter) {
        Set<SmObjectImpl> results = new HashSet<>(roots);
        
        // initialize a current roots list from the passed root elements
        List<SmObjectImpl> nextRoots = new ArrayList<>(roots);
        
        Impl impl = new Impl();
        List<SmObjectImpl> tmpList = new ArrayList<>();
        
        // Loop until there is no root nodes
        while (nextRoots.size() > 0) {
        
            // Get direct children of current roots into 'impl.list'
            for (SmObjectImpl root : nextRoots) {
                // add children to 'tmpList'
                tmpList.addAll(impl.execute(root));
            }
        
            // Clear the current roots list in order to rebuild it for next iteration
            nextRoots.clear();
        
            // Add each new child to the result set and to the next roots list
            for (SmObjectImpl child : tmpList) {
                if (!results.contains(child) && (filter == null || filter.accept(child))) {
                    // Add the child to the set
                    results.add(child);
        
                    // Add the child to the next roots list
                    nextRoots.add(child);
                }
            }
            tmpList.clear();
        }
        return results;
    }

    @objid ("00756598-5541-1091-8d81-001ec947cd2a")
    @Override
    public Collection<SmObjectImpl> getAllChildren(final Collection<SmObjectImpl> roots) {
        return getAllChildren(roots, null);
    }

    @objid ("0075b584-5541-1091-8d81-001ec947cd2a")
    private Collection<SmObjectImpl> getAllChildren(SmObjectImpl anObject) {
        List<SmObjectImpl> roots = new ArrayList<>();
        roots.add(anObject);
        return getAllChildren(roots, null);
    }

    @objid ("0075e1bc-5541-1091-8d81-001ec947cd2a")
    private static class Impl extends DefaultModelVisitor {
        @objid ("0075fe72-5541-1091-8d81-001ec947cd2a")
        public Impl() {
            // Nothing to do
        }

        @objid ("00760c78-5541-1091-8d81-001ec947cd2a")
        public List<SmObjectImpl> execute(SmObjectImpl anObject) {
            return (List<SmObjectImpl>) anObject.accept(this);
        }

        @objid ("007639fa-5541-1091-8d81-001ec947cd2a")
        @Override
        public Object visitElement(Element theElement) {
            return theElement.getCompositionChildren();
        }


/*
         * @Override
         * 
         * * visitFeature(theAssociationEnd);
         * 
         * if (theAssociationEnd.getOpposite() != null) { this.list.add(theAssociationEnd.getOpposite()); } return null; }
         * 
         * * visitNameSpace(theClassifier);
         * 
         * for (int i=0, nb=theClassifier.card_Part(); i<nb; ++i) { Feature *f = theClassifier.get_Part(i); AssociationEnd* role =
         * dynamic_cast<AssociationEnd*>(f); if (role) { bool include = false; if (role.get_IsNavigable()) { include = true; } else
         * if (role.isNary() || role.isNoOriented()) { // Sur une association Naire ou non orient?e, on inclus les roles include =
         * true; } else { include = false; }
         * 
         * if (!include) { this.list.erase (role); } } } return null; }
         * 
         * * return null; }
         * 
         * * visitModelElement(theInstance);
         * 
         * for (int i=0, nb = theInstance.card_Connection(); i < nb; ++i) { LinkEnd* role = theInstance.get_Connection(i); if (role)
         * { bool include = false; if (role.get_IsNavigable()) { include = true; } else if (role.isNary() || role.isNoOriented()) {
         * include = true; } else { include = false; }
         * 
         * if (!include) { this.list.erase (role); } }
         * 
         * } return null; }
         * 
         * * for (int i = 0, nb = theLink.card_Connection(); i < nb; ++i) { this.list.add(theLink.get_Connection(i)); } return null;
         * }
         * 
         * * visitModelElement(theLinkEnd); return null; }
         * 
         * * visitElement(theModelElement);
         * 
         * int nb = theModelElement.card_ConstraintDefinition(); for (int i = 0; i < nb; ++i) { Constraint* aConstraint =
         * theModelElement.get_ConstraintDefinition(i); this.list.add(aConstraint); } return null; }
         * 
         * * ((SmClass) anObject.getMClass()).getAllComponentAndSharedDepDef()) {
         * 
         * int cardVal = anObject.cardDepVal(dep);
         * 
         * for (int j = 0; j < cardVal; ++j) { this.list.add(anObject.getDepVal(dep, j)); } } return null; } }
         */
    }

    @objid ("007667c2-5541-1091-8d81-001ec947cd2a")
    public interface StopFilter {
        @objid ("00767078-5541-1091-8d81-001ec947cd2a")
        boolean accept(Object anObject);

    }

}
