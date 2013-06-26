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
                                    

package org.modelio.vaudit.nsuse;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.vaudit.plugin.Vaudit;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.model.CompositionGetter;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.api.transactions.ITransactionClosureHandler;
import org.modelio.vcore.session.impl.transactions.Transaction;
import org.modelio.vcore.session.impl.transactions.smAction.AppendDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.CreateElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.DeleteElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.EraseDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.IAction;
import org.modelio.vcore.session.impl.transactions.smAction.MoveDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.SetAttributeAction;
import org.modelio.vcore.session.impl.transactions.smAction.smActionInteractions.IActionVisitor;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * Blue links builder.
 * <p>
 * Can :
 * <li>build blue links from a transaction with {@link #commit(ITransaction)}
 * <li>rebuild all blue links with {@link #createNSUseGraph()}
 */
@objid ("8c7fc428-4165-4945-ada3-0c16bd1fff96")
public class NSUseUpdater implements ITransactionClosureHandler {
    @objid ("d19584e1-9e7a-4307-8081-0a4a7e837e7d")
    private long transactionId;

    @objid ("a2f8a93b-66c4-4802-ae7d-be5dd21c1069")
    private NSUseBuilder useBuilder;

    @objid ("f7786243-8b2b-4609-8ed3-2347cb25dfce")
    private Set<NamespaceUse> usesToRebuild;

    @objid ("5a7e2b55-65cc-468f-b734-a1c064c29998")
    private ICoreSession session;

    @objid ("2b6d7c99-19fd-438c-a495-d11098237772")
    private ActionVisitor actionVisitor;

    /**
     * Update the NS Use model (aka blue links) based on the passed transaction
     * contents
     */
    @objid ("9a73b617-b8c3-4a02-8fde-3f0af66ee94a")
    @Override
    public void commit(ITransaction transaction) {
        // Analyse the transaction to get the list of object to process
        this.actionVisitor.reset();
        ((Transaction) transaction).accept(this.actionVisitor);
        List<MObject> objsToRebuild = new ArrayList<>(this.actionVisitor.getResults());
        
        // Build the NSuse
        // System.out.println();
        for (MObject o : objsToRebuild) {
            if (o.isValid() && o instanceof Element) {
                this.useBuilder.buildFor((Element) o);
            }
        }
        
        // Reset visitors (facilitate garbage)
        this.actionVisitor.reset();
    }

    /**
     * Initialize the blue links updater.
     * @param session the modeling session
     * @param nsUseRepo the repository where blue links are stored.
     */
    @objid ("b7491a5f-a84c-4e34-a04f-5f3b69a6bb33")
    public NSUseUpdater(ICoreSession session, IRepository nsUseRepo) {
        this.session = session;
        this.actionVisitor = new ActionVisitor(this);
        this.useBuilder = new NSUseBuilder(session.getModel().getGenericFactory(), nsUseRepo);
    }

    /**
     * Delete and Rebuild all "blue links" under the given NameSpace.
     * @param root The root of the tree to rebuild.
     */
    @objid ("957943cd-259e-40f0-8acb-86883f7e9d93")
    public void rebuild(NameSpace root) {
        Set<SmObjectImpl> allObjs = CompositionGetter.getAllChildren(Collections.singleton((SmObjectImpl)root));
        allObjs.add((SmObjectImpl) root);
        
        for (SmObjectImpl obj : allObjs) {
            if (obj instanceof NameSpace) {
                NameSpace n = (NameSpace) obj;
                for (NamespaceUse u : n.getUsedNsu()) 
                    u.delete();
                for (NamespaceUse u : n.getUserNsu())
                    u.delete();
                
            }
        }
        
        // run visitor on root object
        root.accept(this.useBuilder);
        
        for (SmObjectImpl obj : allObjs) {
            obj.accept(this.useBuilder);
        }
    }

    @objid ("6ab676b3-c9e0-4487-aca1-f2303dcfb30f")
    private boolean isOwnedBy(MObject obj, MObject owner) {
        MObject parent = obj;
        while (parent != null && parent != owner)
            parent = parent.getCompositionOwner();
        return (parent == owner);
    }

    @objid ("01fa8b9d-923b-472e-864d-50e19d41fd8b")
    List<MObject> onObjectMovedFrom(MObject movedObj, MObject oldOwner) {
        // / Protection
        if (movedObj == null || oldOwner == null)
            return Collections.emptyList();
        
        // Theory:
        // Let's call "the NSUs of object XXX" (or XXX's NSUs) the NSU objects
        // where XXX is either the source of the target.
        // When 'movedObj' is moved:
        //
        // 1- the NSU of its composed objects remain valid unless the next
        // conditions occur.
        //
        // 2- the NSUs between the 'oldOwner' and the common owner of both the
        // old and new owner have to be rebuilt if their causes contain any of
        // the moved object composed objects.
        //
        // 3- if 'movedObj' is a NameSpace,
        // the NSUs caused by any of the movedObj's NSUs are invalid and have to
        // be rebuild
        
        List<MObject> objsToRebuild = new ArrayList<>();
        
        NameSpace oldNameSpaceOwner = null;
        NameSpace newNameSpaceOwner = NSUseUtils.getNameSpaceOwner(movedObj);
        
        if (oldOwner instanceof NameSpace)
            oldNameSpaceOwner = (NameSpace) oldOwner;
        else
            oldNameSpaceOwner = NSUseUtils.getNameSpaceOwner(oldOwner);
        
        if (oldNameSpaceOwner != null) {
            // Get all namespaces between the old owner and the common root
            // of the old and new owner.
            Deque<NameSpace> nameSpacesToCheck = new ArrayDeque<>();
            Deque<NameSpace> newPath = new ArrayDeque<>(); // parameter not used
            NSUseUtils.getRelativePathsFromCommonRoot(oldNameSpaceOwner, newNameSpaceOwner, nameSpacesToCheck, newPath);
        
            // add the new owner
            if (newNameSpaceOwner != null)
                nameSpacesToCheck.add(newNameSpaceOwner);
        
            // getAllNSUses ( oldOwners, uses);
            for (NameSpace ns : nameSpacesToCheck) {
                // Get all starting and coming NSUses
                List<NamespaceUse> uses = new ArrayList<>();
                uses.addAll(ns.getUserNsu());
                uses.addAll(ns.getUsedNsu());
        
                // Get all NSUses causes
                List<Element> causes = new ArrayList<>(uses.size() * 8);
                for (NamespaceUse nsu : uses) {
                    causes.addAll(nsu.getCause());
                }
        
                // Get causes who:
                // - are owned by the 'movedObj',
                // - or have a dependency to at least an element owned by
                // 'movedObj'
                // These causes are to be rebuilt.
                for (Element cause : causes) {
                    if (isOwnedBy(cause, movedObj)) {
                        // the cause is owned by the moved object
                        objsToRebuild.add(cause);
                    } else {
                        // Get all reference dependencies in order to get their values:
                        // if one dependency of the cause is owned by the moved object,
                        // some of its caused NSUses may be invalid so they must
                        // all be rebuilt.
                        List<SmDependency> deps = ((SmClass) cause.getMClass()).getAllReferenceDepDef();
                        // int nbdeps = deps.size();
        
                        boolean found = false;
        
                        for (SmDependency dep : deps) {
                            // ignore dynamic dependencies
                            if (!dep.isDynamic()) {
                                // iterate the dependency values
                                List<MObject> refs = cause.mGet(dep);
                                for (MObject ref : refs) {
                                    if (isOwnedBy(ref, movedObj)) {
                                        found = true;
                                        break;
                                    }
                                }
                            }
                            if (found)
                                break;
                        }
                        if (found) {
                            // at least one dependency of the cause is owned by
                            // the moved object
                            objsToRebuild.add(cause);
                        }
                    }
                } // for (icause ...)
            } // for (iowner ...)
        }
        return objsToRebuild;
    }

    @objid ("0b868718-f62a-4d5a-b499-93e34d2c9c0e")
    private void rebuildNSUse(NamespaceUse use) {
        // 1) dereference caused uses
        NSUseUtils.dereferenceNSUsesCausedBy(use);
        
        // 2) rebuild caused uses
        this.useBuilder.visitNamespaceUse(use);
    }

    @objid ("c94f67a2-135e-4619-8bac-d8793cc55305")
    void createNSUseGraphImpl(MObject obj) {
        obj.accept(this.useBuilder);
        for (MObject o : obj.getCompositionChildren()) {
            createNSUseGraphImpl(o);
        }
    }

    /**
     * Delete and Rebuild all "blue links"
     * @param aMonitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call done()
     * on the given monitor. Accepts null, indicating that no progress should be reported and that the operation cannot
     * be cancelled.
     * @throws java.lang.InterruptedException if the user cancelled the operation
     */
    @objid ("acb2b2d2-143c-4173-b236-74d6b70adb60")
    public void rebuildAll(IModelioProgress aMonitor) throws InterruptedException {
        SubProgress mainMon = SubProgress.convert(aMonitor, Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll"), 4);
        SubProgress mon;
        
        // Get all existing NSUses
        mainMon.subTask(Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll.GetBLToDelete"));
        List<NamespaceUse> uses = new ArrayList<>(this.session.getModel().findByClass(NamespaceUse.class, null));
        mainMon.worked(1);
        if (mainMon.isCanceled()) throw new InterruptedException();
        
        // Delete all existing NSUses
        mon = SubProgress.convert(mainMon.newChild(1),uses.size());
        mon.subTask(Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll.DeleteBL", String.valueOf(uses.size())));
        for (MObject o : uses) {
            o.delete();
        
            mon.worked(1);
            if (mainMon.isCanceled()) throw new InterruptedException();
        }
        
        // Get all objects
        mainMon.subTask(Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll.GettingAllObjects"));
        List<MObject> allObjs = new ArrayList<>(this.session.getModel().findByClass(MObject.class, null));
        assert(dump(allObjs));
        mainMon.worked(1);
        
        // Build blue links from all objects
        mon = SubProgress.convert(mainMon.newChild(1), allObjs.size());
        mon.subTask(Vaudit.I18N.getMessage("NSUseUpdater.RebuildAll.ComputeBL", String.valueOf(allObjs.size())));
        for (MObject obj : allObjs) {
            if (obj.isValid() && !obj.isShell())
                obj.accept(this.useBuilder);
        
            mon.worked(1);
            if (mainMon.isCanceled())
                throw new InterruptedException();
        }
    }

    @objid ("e3b8f3db-1cd6-47cd-abbe-48b7ae5e9e02")
    private boolean dump(List<MObject> allObjs) {
        List<SmClass> classes = SmClass.getRegisteredClasses();
        int nbClasses = classes.size();
        long[] count = new long[nbClasses];
        
        for (MObject obj : allObjs) {
            short clid = ((SmObjectImpl) obj).getClassOf().getId();
            count[clid]++;
        }
        
        StringBuilder s = new StringBuilder();
        s.append("Project content:\n");
        for (short i=0; i<nbClasses; i++) {
            SmClass cls = SmClass.getClass(i);
            if (! cls.isAbstract()) {
                s.append(cls.getName());
                s.append(":");
                s.append(count[i]);
                s.append("\n");
            }
        }
        Vaudit.LOG.debug(s.toString());
        return true;
    }

    @objid ("e986ecdc-174d-467b-919e-700848409f13")
    static class ActionVisitor implements IActionVisitor {
        @objid ("1169c2a0-9067-4183-95de-83c13c944e89")
        private final MClass ElementMClass = Metamodel.getMClass(Element.class);

        @objid ("8b3d271d-421e-422d-8598-cbc4656103e4")
        private final MClass NamespaceUseMClass = Metamodel.getMClass(NamespaceUse.class);

        @objid ("e1190042-c3aa-4aae-8144-40d0aa952868")
        private final MClass NameSpaceMClass = Metamodel.getMClass(NameSpace.class);

        @objid ("70bbd527-ad2d-4fa4-a45b-e21638ef96b8")
        private final MDependency NameSpaceuserNamespaceUse = this.NameSpaceMClass.getDependency("UserNsu");

        @objid ("6dd5f822-8a10-451d-9c7c-d4217dbf1715")
        private final MDependency NameSpaceusedNamespaceUse = this.NameSpaceMClass.getDependency("UsedNsu");

        @objid ("9bab6d0c-50f8-4f3f-a384-7fdab6e0cce9")
        private final MDependency NamespaceUsecauseElement = this.NamespaceUseMClass.getDependency("Cause");

        @objid ("f57158ce-f8e1-45a8-9596-314894d8f75e")
        private final MDependency NamespaceUseuserNameSpace = this.NamespaceUseMClass.getDependency("User");

        @objid ("73569436-1acb-4e55-833a-c5d563ea65ea")
        private final MDependency NamespaceUseusedNameSpace = this.NamespaceUseMClass.getDependency("Used");

        @objid ("dfaeeeff-68d4-481f-80bd-9f467e743861")
        private final MDependency ElementcausingNamespaceUse = this.ElementMClass.getDependency("Causing");

        @objid ("d87deada-b134-41a9-a9bd-28c9780c9641")
        private Set<MObject> objsToRebuild = new HashSet<>();

        @objid ("feb77af6-af47-482e-97a2-d662365b22ed")
         NSUseUpdater updater;

        @objid ("cc00abe8-586b-429b-8c51-4d5554ca0007")
        public ActionVisitor(NSUseUpdater updater) {
            this.updater = updater;
        }

        @objid ("fbba389e-9ebe-402d-9e28-4de9029dca02")
        public void reset() {
            this.objsToRebuild.clear();
        }

        @objid ("566f2fc2-e777-4b55-89b8-7c8873b5c8f2")
        public Set<MObject> getResults() {
            return this.objsToRebuild;
        }

        @objid ("c772d152-ef97-4d31-aadb-8aa417ca3e0b")
        @Override
        public void visitTransaction(Transaction theTransaction) {
            ArrayList<IAction> actions = new ArrayList<IAction>();
            for (IAction a : theTransaction.getActions())
                actions.add(a);
            
            for (IAction a : actions) {
                a.accept(this);
            }
        }

        @objid ("79e44b61-3cf3-42ae-8376-cea776051ed2")
        @Override
        public void visitCreateElementAction(CreateElementAction theCreateElementAction) {
            // nothing
        }

        @objid ("acbdb1ce-0aaf-4dbc-b019-f9da3384a3b3")
        @Override
        public void visitDeleteElementAction(DeleteElementAction theDeleteElementAction) {
            // nothing
        }

        @objid ("80fcd411-dc45-4732-ae73-e2863700b847")
        @Override
        public void visitSetAttributeAction(SetAttributeAction theSetAttributeAction) {
            // nothing
        }

        @objid ("6e5d0d67-506a-4700-b156-eba35fa406c8")
        @Override
        public void visitEraseDependencyAction(EraseDependencyAction theEraseDependencyAction) {
            MObject modified = theEraseDependencyAction.getRefered();
            if (modified.isValid()) {
                if (theEraseDependencyAction.getDep() == this.NameSpaceuserNamespaceUse
                        || theEraseDependencyAction.getDep() == this.NameSpaceusedNamespaceUse
                        || theEraseDependencyAction.getDep() == this.ElementcausingNamespaceUse) {
                    // do nothing
            
                } else if (theEraseDependencyAction.getDep().isComponent() && theEraseDependencyAction.getRef() != null
                        && theEraseDependencyAction.getRef().isValid()) {
                    this.objsToRebuild.add(modified);
                    this.objsToRebuild.addAll(this.updater.onObjectMovedFrom(theEraseDependencyAction.getRef(), modified));
            
                } else if (modified.getMClass() == this.NamespaceUseMClass) {
                    if (theEraseDependencyAction.getDep() == this.NamespaceUsecauseElement) {
                        NamespaceUse use = (NamespaceUse) modified;
                        if (use.getCause().isEmpty()) {
                            NSUseUtils.dereferenceNSUsesCausedBy(use);
                            // use.delete();
                        }
                    } else if (theEraseDependencyAction.getDep() == this.NamespaceUseuserNameSpace) {
                        NamespaceUse use = (NamespaceUse) modified;
                        if (use.getUser() == null) {
                            NSUseUtils.dereferenceNSUsesCausedBy(use);
                            use.delete();
                        }
                    } else if (theEraseDependencyAction.getDep() == this.NamespaceUseusedNameSpace) {
                        NamespaceUse use = (NamespaceUse) modified;
                        if (use.getUsed() == null) {
                            NSUseUtils.dereferenceNSUsesCausedBy(use);
                            use.delete();
                        }
                    }
                } else {
                    this.objsToRebuild.add(modified);
                }
            }
        }

        @objid ("e0e66e43-6e93-46b3-9e56-0dc7f2605925")
        @Override
        public void visitAppendDependencyAction(AppendDependencyAction theAppendDependencyAction) {
            MObject ref = theAppendDependencyAction.getRef();
            MObject refered = theAppendDependencyAction.getRefered();
            
            if ((refered.isDeleted()) || //
                    (ref != null && ref.getMClass() == this.NamespaceUseMClass || //
                    (/* refered != null && */refered.getMClass() == this.NamespaceUseMClass))) {
                // do nothing
            } else {
                this.objsToRebuild.add(refered);
            }
        }

        @objid ("e1d8a4b9-32a3-4923-ac6c-a6c1dc7b7ef4")
        @Override
        public void visitMoveDependencyAction(MoveDependencyAction theMoveDependencyAction) {
            // do nothing
        }

    }

}
