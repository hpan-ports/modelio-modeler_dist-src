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


package org.modelio.vcore.session.impl.load;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.log.Log;
import org.modelio.vcore.model.GetAbsoluteSymbol;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmObjectSmClass;
import org.modelio.vcore.smkernel.mapi.fake.FakeMClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;

/**
 * Used by {@link ModelLoader} to load a {@link SmDependency}.
 */
@objid ("fd26ba0e-5986-11e1-991a-001ec947ccaf")
class DependencyLoader {
    /**
     * The object owning the dependency being loaded. This field is a state. It has to be reset between usage.
     */
    @objid ("4a3e9c9c-7636-4266-a6a0-fb49bb5e61bc")
    private SmObjectImpl obj;

    /**
     * The dependency being loaded. This field is a state. It has to be reset between usage.
     */
    @objid ("7317d5dc-c789-4d42-b6a4-82daa773e9af")
    private SmDependency dep;

    @objid ("fd24579d-5986-11e1-991a-001ec947ccaf")
    public DependencyLoader() {
    }

    @objid ("fd24579a-5986-11e1-991a-001ec947ccaf")
    public void execute(SmObjectImpl anObj, SmDependency aDep, List<SmObjectImpl> newValues) {
        assert (aDep != null);
        
        if (this.dep != null) {
            throwRecursion(anObj, aDep);
        }
        
        try {
            this.obj = anObj;
            this.dep = aDep;
        
            // Compare old and new dependency values and update if required
            List<SmObjectImpl> currentValues = getCurrentContents();
        
            if (!strictEquals(currentValues,newValues)) {
                // Change detected
        
                if (this.dep.isOrdered()) {
                    updateDefaultDependency(currentValues, newValues);
                } else {
                    updateNonOrderedDependency(currentValues, newValues);
                }
            }
        } finally {
            reset();
        }
    }

    @objid ("fd245798-5986-11e1-991a-001ec947ccaf")
    private void updateDefaultDependency(List<SmObjectImpl> currentValues, List<SmObjectImpl> newValues) {
        // STEP 1 - detach all old values
        for (SmObjectImpl value : currentValues) {
            eraseDepVal(this.obj, this.dep, value);
        }
        
        // STEP 2 - add new values to the dependency
        for (SmObjectImpl value : newValues) {
        
            try {
                logShellDepVal(value);
        
                appendDepVal(this.obj, this.dep, value);
            } catch (RuntimeException e) {
                final String err = getErrorMsg(value, e);
                throw new RuntimeException(err, e);
            }
        }
    }

    @objid ("fd245796-5986-11e1-991a-001ec947ccaf")
    private void updateNonOrderedDependency(List<SmObjectImpl> currentValues, List<SmObjectImpl> newValues) {
        if (currentValues.size() == newValues.size()) {
            // Roles order is often swapped, this is useless
            boolean changeFound = false;
        
            for (SmObjectImpl role : currentValues) {
                changeFound = !newValues.contains(role);
                if (changeFound) {
                    break;
                }
            }
        
            // Update the dependency only if a real change is found
            if (changeFound) {
                updateDefaultDependency(currentValues, newValues);
            }
        } else {
            updateDefaultDependency(currentValues, newValues);
        }
    }

    @objid ("fd245792-5986-11e1-991a-001ec947ccaf")
    private void appendDepVal(SmObjectImpl anObj, final SmDependency aDep, final SmObjectImpl value) {
        // Do some cleaning first
        ISmObjectData objData = anObj.getData();
        if (aDep.getMax() == 1) {
            // Erase the old reference
            SmObjectImpl oldValue = (SmObjectImpl) aDep.getValue(objData);
            if (oldValue == value) {
                // Nothing to do
                return;
            } else if (oldValue != null) {
                // Erase old reference
                eraseDepVal(anObj, aDep, oldValue);
            }
        } else {
            // Prevent dep_val from being twice in the list
            eraseDepVal(anObj, aDep, value);
        }
        
        // Do the job
        aDep.add(objData, value);
        
        depValAdded(anObj, aDep, value);
        
        // If the dependency is symmetric and have to propagate
        propagateAppendToOpposite(anObj, aDep, value);
    }

    @objid ("fd245791-5986-11e1-991a-001ec947ccaf")
    private void eraseDepVal(SmObjectImpl anObj, SmDependency aDep, final SmObjectImpl value) {
        // do the job
        boolean returnCode = aDep.remove(anObj.getData(), value);
        
        if (returnCode) {
            // Notify change
            depValErased(anObj, aDep, value);
        
            // update the symetric dependency
            propagateEraseToOpposite(anObj, aDep, value);
        }
    }

    @objid ("fd24578f-5986-11e1-991a-001ec947ccaf")
    private void propagateAppendToOpposite(final SmObjectImpl anObj, final SmDependency aDep, final SmObjectImpl value) {
        if (value != null ) {
            SmDependency symetricDep = getOppositeDep(aDep, value);
        
            if (symetricDep != null ) {
                ISmObjectData valueData = value.getData();
                if (symetricDep.isMultiple()) {
                    // ensure the value won't be twice in the list
                    symetricDep.remove(valueData, anObj);
                } else {
                    // Remove from the symetricDep its old value with propagation.
                    SmObjectImpl oldValue = (SmObjectImpl) symetricDep.getValue(valueData);
                    if (oldValue == null) {
                        // just continue
                    } else if (oldValue.equals(anObj)) {
                        // nothing more to do, exit now.
                        return;
                    } else {
                        // Remove the old value with propagation.
                        eraseDepVal(value, symetricDep, oldValue);
                    }
                }
        
                // Propagate to symetricDep the append
                symetricDep.add(valueData, anObj);
        
                // Notify change
                depValAdded(value, symetricDep, anObj);
            }
        }
    }

    @objid ("fd245790-5986-11e1-991a-001ec947ccaf")
    private void propagateEraseToOpposite(final SmObjectImpl anObj, final SmDependency aDep, final SmObjectImpl value) {
        if (value != null) {
            SmDependency oppDep = getOppositeDep(aDep, value);
        
            if (oppDep != null) {
                oppDep.remove(value.getData(), anObj);
        
                depValErased(value, oppDep, anObj);
            }
        }
    }

    @objid ("524c828d-064d-11e2-9eb7-001ec947ccaf")
    private final void __dumpDiff(List<SmObjectImpl> currentValues, List<SmObjectImpl> newValues) {
        Log.trace(" Diff on  '%s'.%s %s :", GetAbsoluteSymbol.get(this.obj), this.dep.getName(), this.obj.getClassOf().getName());
        
        for (SmObjectImpl value : currentValues) {
            if (!newValues.contains(value)) {
                Log.trace("   - removed: '%s' %s {%s}", GetAbsoluteSymbol.get(value), value.getClassOf().getName(), value.getUuid()
                        .toString());
            }
        }
        
        for (SmObjectImpl value : newValues) {
            if (!currentValues.contains(value)) {
                Log.trace("   + added: '%s' %s {%s}", GetAbsoluteSymbol.get(value), value.getClassOf().getName(), value.getUuid()
                        .toString());
            }
        }
    }

    /**
     * Hook to notify a dependency change.
     * @param anObj the modified object
     * @param aDep the modified relation
     * @param value the added value
     */
    @objid ("7d4d2e4b-1c43-11e2-8eb9-001ec947ccaf")
    protected void depValAdded(final SmObjectImpl anObj, final SmDependency aDep, final SmObjectImpl value) {
        // do nothing by default
    }

    /**
     * Hook to notify a dependency change.
     * @param anObj the modified object
     * @param aDep the modified relation
     * @param value the removed value
     */
    @objid ("7d4d2e54-1c43-11e2-8eb9-001ec947ccaf")
    protected void depValErased(final SmObjectImpl anObj, final SmDependency aDep, final SmObjectImpl value) {
        // do nothing by default
    }

    /**
     * Compute an error message telling wich part couldn't be loaded.
     * @param destObject the object that couldn't be added
     * @param e the error
     * @return the error message.
     */
    @objid ("e9ea37fe-356c-11e2-a87b-001ec947ccaf")
    private String getErrorMsg(SmObjectImpl destObject, RuntimeException e) {
        String err;
        try {
            err = "Cannot add " + getDebugSymbol(destObject, e) + " to " + getDebugSymbol(this.obj, e) + "."
                    + this.dep.getName() + ": " + e.getLocalizedMessage();
        } catch (Exception | LinkageError t) {
            e.addSuppressed(t);
            err = "Failed loading " + this.dep.getName() + " dependency: " + e.toString();
        }
        return err;
    }

    @objid ("e9ea3805-356c-11e2-a87b-001ec947ccaf")
    private static String getDebugSymbol(SmObjectImpl obj, Throwable t) {
        /*
         * Commented: This may throw  "java.lang.IllegalStateException: Reentrant call not allowed." and make fragment go down.
         *
        try {
            return "('" + GetAbsoluteSymbol.get(obj) + "' {" + obj.getUuid() + "} " + obj.getMClass().getName() + ")";
        } catch (Exception | LinkageError e) {
            if (t != null) {
                t.addSuppressed(e);
            }
            try {
                return "(" + obj.toString() + ")";
            } catch (Exception | LinkageError e2) {
                e.addSuppressed(e2);
                return "(" + obj.getMClass().getName() + ")";
            }
        }
        */
        try {
            return "(" + obj.toString() + ")";
        } catch (Exception | LinkageError e) {
            if (t != null) {
                t.addSuppressed(e);
            }
            return "(" + obj.getMClass().getName() + ")";
        }
    }

    /**
     * Reset the state of this DependencyLoader
     */
    @objid ("009585bc-20a4-10be-92d7-001ec947cd2a")
    private void reset() {
        this.obj = null;
        this.dep = null;
    }

    @objid ("0095ff7e-20a4-10be-92d7-001ec947cd2a")
    protected List<SmObjectImpl> getCurrentContents() {
        // Get the current dependencies values
        
        if (this.dep.isMultiple()) {
            SmMultipleDependency d = (SmMultipleDependency) this.dep;
            List<SmObjectImpl> l = d.getValueList(this.obj.getData());
            return (l != SmMultipleDependency.EMPTY) ? new ArrayList<>(l) : Collections.<SmObjectImpl> emptyList();
        
        } else {
            SmObjectImpl value = (SmObjectImpl) this.dep.getValue(this.obj.getData());
            if (value == null) {
                return Collections.emptyList();
            } else {
                return Collections.singletonList(value);
            }
        }
    }

    @objid ("009732ae-20a4-10be-92d7-001ec947cd2a")
    private void throwRecursion(SmObjectImpl anObj, SmDependency aDep) throws IllegalStateException {
        throw new IllegalStateException("Reentrant call of Dependencyloader.execute({"
                + anObj.getUuid() + "} " + anObj.getClassOf().getName() + ", " + aDep
                + "): already loading {"
                + this.obj.getUuid() + "} " + this.obj.getClassOf().getName()
                + "." + this.dep);
    }

    @objid ("9dc9e0dd-66ca-432f-9f30-11388eff99e6")
    private void logShellDepVal(SmObjectImpl value) {
        if (value.isShell()) {
            Log.warning("DependencyLoader: Loading %s unresolved reference into %s.%s relation.", getDebugSymbol(value, null), getDebugSymbol(this.obj, null), this.dep.getName());
        }
    }

    @objid ("9d9edb66-8a24-432b-b5c2-403da00b51e9")
    private static SmDependency getOppositeDep(final SmDependency aDep, final SmObjectImpl value) {
        SmDependency oppositeDep = aDep.getSymetric();
        
        if (oppositeDep == null) {
            Log.trace("DependencyLoader: %s dependency on %s has no opposite dep.", aDep, value);
        }
        
        SmObjectSmClass classOf = value.getClassOf();
        if (oppositeDep != null && classOf.isFake()) {
            oppositeDep = (SmDependency) ((FakeMClass) classOf).getSameDependency(oppositeDep);
        }
        return oppositeDep;
    }

    @objid ("5e23d777-afc4-4f07-ab6d-3a4cd52a71a5")
    private static boolean strictEquals(List<SmObjectImpl> a, List<SmObjectImpl> a2) {
        if (a==a2) {
            return true;
        }
        if (a==null || a2==null) {
            return false;
        }
        
        int length = a.size();
        if (a2.size() != length) {
            return false;
        }
        
        for (int i=0; i<length; i++) {
            if (a.get(i) != a2.get(i)) {
                return false;
            }
        }
        return true;
    }

}
