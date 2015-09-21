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


package org.modelio.vcore.smkernel.meta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.EClass;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.mapi.MAttribute;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

/**
 * A <code>SmClass</code> describes a semantic type, ie a metamodel metaclass.
 * <p>
 * Objects managed by the kernel (ie SmObject) are typed by their SmClass associated instance. Therefore, all SmObject instances
 * sharing the same SmClass instance are said to belong to the metaclass defined by SmClass. There is a unique instance of SmClass
 * per meta-class.
 * <p>
 * SmClass instances are build at run-time from the Java class that defines their meta-class. The Java reflection API along with
 * Java annotations are used to find out what are the SmAttribute and SmDependency instances to declare on the SmClass instance.
 * 
 * @author phv
 */
@objid ("008435a0-ed97-1f1f-85a5-001ec947cd2a")
public abstract class SmClass extends SmElement implements MClass {
    /**
     * The matching EMF class.
     */
    @objid ("cdf5f020-9b5a-4863-813a-6b86a75ff98c")
    private EClass emfAdapter;

    @objid ("b51291e5-6200-4c32-903d-ea001fa1f82c")
    private int hashCode;

    /**
     * The integer-based identifier of the metaclass.
     */
    @objid ("0083ed70-ed97-1f1f-85a5-001ec947cd2a")
    private short metaclassId;

    @objid ("006ca804-4412-1f74-8a7a-001ec947cd2a")
    private final List<SmAttribute> allAttributes = new ArrayList<>();

    /**
     * Self and inherited composition and shared composition dependencies.
     */
    @objid ("ef7c6080-bea9-11e1-b576-001ec947ccaf")
    private final List<SmDependency> allComponentAndSharedDep = new ArrayList<>();

    /**
     * Self and inherited composition dependencies.
     */
    @objid ("005e8648-4939-1f74-8a7a-001ec947cd2a")
    private final List<SmDependency> allComponentDep = new ArrayList<>();

    @objid ("00548684-45d1-1f74-8a7a-001ec947cd2a")
    private final List<SmDependency> allDependencies = new ArrayList<>();

    /**
     * Self and inherited reference dependencies.
     */
    @objid ("005ec806-4939-1f74-8a7a-001ec947cd2a")
    private final List<SmDependency> allReferenceDep = new ArrayList<>();

    /**
     * Self and inherited shared composition dependencies.
     */
    @objid ("f2e7fb12-bfa2-11e1-b511-001ec947ccaf")
    private final List<SmDependency> allSharedDep = new ArrayList<>();

    @objid ("784b616b-b708-4154-8e14-6ebcadd072e8")
    private SmMetamodel metamodel;

    @objid ("005144b0-fd1a-1f27-a7da-001ec947cd2a")
    private ISmObjectFactory objectFactory;

    /**
     * The metamodel fragment providing the meta class
     */
    @objid ("555abb1a-a45d-4b8c-9e83-f112bbda1cb0")
    private final ISmMetamodelFragment origin;

    /**
     * The parent SmClass of this SmClass.
     * <p>
     * The inheritance relation between SmClass instances reproduces the inheritance relation between metaclasses.
     */
    @objid ("008404ea-ed97-1f1f-85a5-001ec947cd2a")
    protected SmClass parentClass;

    /**
     * The SmAttribute instances representing the meta-attributes of the metaclass.
     */
    @objid ("00840026-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmAttribute> selfAttributes = new ArrayList<>();

    /**
     * Composition and shared composition dependencies.
     */
    @objid ("ef7c607b-bea9-11e1-b576-001ec947ccaf")
    private final List<SmDependency> selfComponentAndSharedDep = new ArrayList<>();

    @objid ("0084017a-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfComponentDep = new ArrayList<>();

    @objid ("00840288-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfDependencies = new ArrayList<>();

    /**
     * Self reference dependencies.
     */
    @objid ("00840710-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmDependency> selfReferenceDep = new ArrayList<>();

    /**
     * Shared composition dependencies.
     */
    @objid ("f2e7fb0e-bfa2-11e1-b511-001ec947ccaf")
    private final List<SmDependency> selfSharedDep = new ArrayList<>();

    /**
     * The children SmClass of this SmClass.
     * <p>
     * The inheritance relation between SmClass instances reproduces the inheritance relation between metaclasses.
     */
    @objid ("00840814-ed97-1f1f-85a5-001ec947cd2a")
    private final List<SmClass> subClasses = new ArrayList<>();

    /**
     * <s>Two <code>SmClass</code> are the same if they have the same name and their metamodel fragment are
     * {@link ISmMetamodelFragment#equals(Object) equal}.</s>
     * 
     * Since Modelio 3.4, Test for a strict equality of instances
     */
    @objid ("86233e2f-7d84-11e1-bee3-001ec947ccaf")
    @Override
    public boolean equals(final Object obj) {
        return this == obj;
    }

    /**
     * The 'extEquals' stands for "extended equals".<br/>
     * If both <i>this</i> and <i>other</i> SmClass belong to the same MM Fragment they are simply compared for strict equality.<br/>
     * If <i>this</i> and <i>other</i> SmClass belong to different fragment the returned value is equivalent to
     * <i>this.hasBase(other)</i>; ie this inherits from other.
     * 
     * The typical usage of 'extEquals' is to compare metaclasses in checkers or audit rules while taking into account the extension
     * metamodel fragments and their resulting extended inheritance tree!
     * @param other @return
     */
    @objid ("3e6f6405-4e05-4a63-a127-2c3f8d894b0a")
    public boolean extEquals(SmClass other) {
        if (getOrigin() == other.getOrigin()) {
            return (equals(other));
        } else {
            return hasBase(other);
        }
    }

    /**
     * Get self and inherited attribute definitions.
     * <p>
     * @return attribute definitions.
     */
    @objid ("0083ee2e-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmAttribute> getAllAttDef() {
        return this.allAttributes;
    }

    /**
     * Get self and inherited composition and shared composition dependencies.
     * <p>
     * @return composition and shared composition dependencies.
     */
    @objid ("ef85e9e0-bea9-11e1-b576-001ec947ccaf")
    public List<SmDependency> getAllComponentAndSharedDepDef() {
        return this.allComponentAndSharedDep;
    }

    /**
     * Get self and inherited composition dependencies.
     * <p>
     * Excludes shared compositions.
     * @return composition dependencies.
     */
    @objid ("0083eec4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllComponentDepDef() {
        return this.allComponentDep;
    }

    /**
     * Get all defined dependencies.
     * @return all dependencies.
     */
    @objid ("0083ef82-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllDepDef() {
        return this.allDependencies;
    }

    /**
     * Get self and inherited reference dependencies.
     * <p>
     * Excludes compositions, shared compositions, and "non navigable" dependencies..
     * @return composition dependencies.
     */
    @objid ("0083f0b8-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getAllReferenceDepDef() {
        return this.allReferenceDep;
    }

    /**
     * Get self and inherited shared composition dependencies.
     * @return self and inherited shared composition dependencies.
     */
    @objid ("f2e7fb1e-bfa2-11e1-b511-001ec947ccaf")
    public Collection<SmDependency> getAllSharedCompositionDep() {
        return this.allSharedDep;
    }

    /**
     * Get all the sub classes recursively.
     * @return all the sub classes.
     */
    @objid ("0083f1e4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmClass> getAllSubClasses() {
        final List<SmClass> results = new ArrayList<>();
        
        // Add direct sub classes
        results.addAll(this.subClasses);
        
        for (final SmClass c : this.subClasses) {
            results.addAll(c.getAllSubClasses());
        }
        return results;
    }

    @objid ("00034a76-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MAttribute getAttribute(final String name) {
        return getAttributeDef(name);
    }

    /**
     * Get the attribute definition with the given name.
     * <p>
     * Look into the class attributes and inherited attributes.
     * @param att_name the attribute name
     * @return the found attribute or <code>null</code> if none has the given name.
     */
    @objid ("0083f27a-ed97-1f1f-85a5-001ec947cd2a")
    public SmAttribute getAttributeDef(final String att_name) {
        // TODO optimization of the name lookup ?!
        for (final SmAttribute att : this.allAttributes) {
            if (att.getName().equals(att_name)) {
                return att;
            }
        }
        return null;
    }

    @objid ("000420e0-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MAttribute> getAttributes(boolean includeInherited) {
        final ArrayList<MAttribute> results = new ArrayList<>();
        
        if (includeInherited) {
            for (final MAttribute dep : getAllAttDef()) {
                results.add(dep);
            }
        } else {
        
            for (final MAttribute dep : getSelfAttDef()) {
                results.add(dep);
            }
        }
        return results;
    }

    @objid ("0003d806-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MDependency> getDependencies(boolean includeInherited) {
        final ArrayList<MDependency> results = new ArrayList<>();
        
        if (includeInherited) {
            for (final MDependency dep : getAllDepDef()) {
                results.add(dep);
            }
        } else {
        
            for (final MDependency dep : getSelfDepDef()) {
                results.add(dep);
            }
        }
        return results;
    }

    @objid ("000391d4-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MDependency getDependency(final String name) {
        return getDependencyDef(name);
    }

    /**
     * Get the dependency definition with the given name.
     * <p>
     * Look into the class dependency and inherited dependency.
     * @param dep_name the dependency name
     * @return the found dependency or <code>null</code> if none has the given name.
     */
    @objid ("0083f3a6-ed97-1f1f-85a5-001ec947cd2a")
    public SmDependency getDependencyDef(final String dep_name) {
        for (final SmDependency dep : this.allDependencies) {
            if (dep.getName().equals(dep_name)) {
                return dep;
            }
        }
        return null;
    }

    /**
     * Get the EMF adapter for this class.
     * @return the EMF class.
     */
    @objid ("ef9437fd-bea9-11e1-b576-001ec947ccaf")
    public EClass getEmfAdapter() {
        return this.emfAdapter;
    }

    /**
     * Get the metaclass id.
     * <p>
     * This identifier must not be used in long term storage as may change at each metamodel change.
     * @return the metaclass id.
     */
    @objid ("0056e398-fd1a-1f27-a7da-001ec947cd2a")
    public final short getId() {
        return this.metaclassId;
    }

    @objid ("4fd793dd-3830-48de-8a76-7b27689d7fa8")
    @Override
    public MMetamodel getMetamodel() {
        return this.metamodel;
    }

    /**
     * Get the factory to use to instantiate model objects of this class.
     * @return the model object factory.
     */
    @objid ("0054a61e-fd1a-1f27-a7da-001ec947cd2a")
    public ISmObjectFactory getObjectFactory() {
        return this.objectFactory;
    }

    /**
     * Get the metamodel fragment owning this metaclass.
     * @return the metamodel fragment.
     */
    @objid ("8dda2d7a-5750-4d6c-b375-b3c525533a9c")
    @Override
    public ISmMetamodelFragment getOrigin() {
        // Automatically generated method. Please do not modify this code.
        return this.origin;
    }

    /**
     * Get the parent class.
     * @return the parent class.
     */
    @objid ("00840936-ed97-1f1f-85a5-001ec947cd2a")
    public SmClass getParent() {
        return this.parentClass;
    }

    @objid ("1669a3a2-6951-4641-8845-b913afe0bbb1")
    @Override
    public String getQualifiedName() {
        return getOrigin().getName() + QUALIFIER_SEP + getName();
    }

    /**
     * Get the attributes defined on this class excluding inherited attributes.
     * @return the class attribute definitions.
     */
    @objid ("0083f5f4-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmAttribute> getSelfAttDef() {
        return this.selfAttributes;
    }

    /**
     * Get the metamodel dependencies defined on this class.
     * @return the metamodel dependencies.
     */
    @objid ("0083f680-ed97-1f1f-85a5-001ec947cd2a")
    public List<SmDependency> getSelfDepDef() {
        return this.selfDependencies;
    }

    @objid ("0004a236-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public List<MClass> getSub(boolean recursive) {
        final ArrayList<MClass> results = new ArrayList<>();
        if (recursive) {
            for (final MClass c : getAllSubClasses()) {
                results.add(c);
            }
        } else {
            for (final MClass c : this.subClasses) {
                results.add(c);
            }
        }
        return results;
    }

    @objid ("00046a1e-4c5f-1ffc-8433-001ec947cd2a")
    @Override
    public MClass getSuper() {
        return this.parentClass;
    }

    /**
     * @param parent a metamodel class
     * @return <code>true</code> if <code>this</code> class inherits from the given class. <code>false</code> otherwise.
     */
    @objid ("0083f7ac-ed97-1f1f-85a5-001ec947cd2a")
    @Override
    public boolean hasBase(MClass parent) {
        if (parent == null) {
            return false;
        } else {
            return parent.getJavaInterface().isAssignableFrom(getJavaInterface());
        }
        /*
         * SmClass cls = this; while (cls != null && !cls.equals(parent)) { cls = cls.parentClass; } return cls == parent;
         */
    }

    /**
     * Tells whether this class or an inherited class has the given {@link SmDirective}.
     * @param flag a flag to test
     * @return <code>true</code> if the class has the flag, else <code>false</code>
     */
    @objid ("0083f8ce-ed97-1f1f-85a5-001ec947cd2a")
    public boolean hasDirectiveInGraph(final SmDirective flag) {
        SmClass c = this;
        while (c != null && !c.hasDirective(flag)) {
            c = c.getParent();
        }
        return c != null;
    }

    @objid ("86233e2a-7d84-11e1-bee3-001ec947ccaf")
    @Override
    public int hashCode() {
        if (this.hashCode == 0) {
            // Compute hash code now
            final int prime = 31;
            int result = 1;
        
            String lname = getName();
            ISmMetamodelFragment lorigin = getOrigin();
        
            result = prime * result + ((lname == null) ? 0 : lname.hashCode());
            result = prime * result + ((lorigin == null) ? 0 : lorigin.hashCode());
            this.hashCode = result;
        }
        return this.hashCode;
    }

    @objid ("c966f3dc-21c9-4969-878b-331bbd8127e1")
    @Override
    public boolean isFake() {
        return false;
    }

    /**
     * Load the metaclass content.
     * @param m the metamodel asking for loading.
     */
    @objid ("0083fbda-ed97-1f1f-85a5-001ec947cd2a")
    public abstract void load(SmMetamodel m);

    /**
     * Finish the class initialization.
     * <p>
     * This method must be called once.
     */
    @objid ("00715c6e-4412-1f74-8a7a-001ec947cd2a")
    public void postInit() {
        SmClass parent = getParent();
        
        // register subclass in parent
        if (parent != null) {
            parent.subClasses.add(this);
        }
        
        initCache();
    }

    /**
     * Initialize the EMF EClass adapter.
     * @param emfAdapter the EMS EClass adapter
     */
    @objid ("ef943802-bea9-11e1-b576-001ec947ccaf")
    public void setEmfAdapter(EClass emfAdapter) {
        this.emfAdapter = emfAdapter;
    }

    @objid ("00031448-eb1c-1f22-8c06-001ec947cd2a")
    @Override
    public String toString() {
        return getName() + " SmClass";
    }

    /**
     * Note: package visibility, method to used only locally
     * @param id
     */
    @objid ("ec5ce1d3-b0aa-4486-bda6-68eed1ad47d9")
    void setMetaclassId(short id) {
        this.metaclassId = id;
    }

    /**
     * Initialize the metamodel.
     * <p>
     * This method must be called once for each SmClass.
     * @param metamodel the metamodel.
     */
    @objid ("ab0d29a0-d4f1-4346-bde6-8e413dea6f38")
    void setMetamodel(SmMetamodel metamodel) {
        assert (this.metamodel == null);
        
        this.metamodel = metamodel;
    }

    /**
     * Package visibility C'tor (usage reserved for Metamodel class)
     * @param interf
     * @param name
     * @param mmFragment
     */
    @objid ("0083fb12-ed97-1f1f-85a5-001ec947cd2a")
    protected SmClass(ISmMetamodelFragment origin) {
        this.origin = origin;
    }

    /**
     * Register an attribute.
     * @param att an attribute
     */
    @objid ("232293ad-b284-4e0f-b537-97a2325d66d7")
    protected final void registerAttribute(SmAttribute att) {
        checkNoPostInit();
        
        this.selfAttributes.add(att);
    }

    /**
     * Register a dependency.
     * @param dep a dependency.
     */
    @objid ("cbb63344-16ef-4d9c-b6e5-dfc1b729e28b")
    protected final void registerDependency(SmDependency dep) {
        checkNoPostInit();
        
        this.selfDependencies.add(dep);
        
        if (dep.isComponent()) {
            this.selfComponentDep.add(dep);
            this.selfComponentAndSharedDep.add(dep);
        } else if (dep.isSharedComposition()) {
            this.selfComponentAndSharedDep.add(dep);
            this.selfSharedDep.add(dep);
        } else if (dep.isPartOf()) {
            this.selfReferenceDep.add(dep);
        }
    }

    /**
     * Initialize the object factory.
     * <p>
     * Must be called once for each SmClass.
     * @param iSmObjectFactory the object factory.
     */
    @objid ("d0e6502b-d210-4983-9def-37b5b4167233")
    protected final void registerFactory(ISmObjectFactory iSmObjectFactory) {
        if (this.objectFactory != null) {
            throw new IllegalStateException(this + " object factory already initialized to " + this.objectFactory);
        }
        
        this.objectFactory = iSmObjectFactory;
    }

    @objid ("b6a848da-03a0-468e-832c-17636715421f")
    protected void checkNoPostInit() {
        if (!this.allDependencies.isEmpty()) {
            throw new IllegalStateException("postInit() already called" + this);
        }
    }

    @objid ("d61e55b3-d003-479c-a4c0-20851b4bcb38")
    protected void initCache() {
        this.allAttributes.clear();
        this.allDependencies.clear();
        this.allComponentDep.clear();
        this.allReferenceDep.clear();
        this.allSharedDep.clear();
        this.allComponentAndSharedDep.clear();
        
        // initialize flatten attributes and dependencies
        this.allAttributes.addAll(this.selfAttributes);
        this.allDependencies.addAll(this.selfDependencies);
        this.allComponentDep.addAll(this.selfComponentDep);
        this.allReferenceDep.addAll(this.selfReferenceDep);
        this.allSharedDep.addAll(this.selfSharedDep);
        this.allComponentAndSharedDep.addAll(this.selfComponentAndSharedDep);
        
        // flatten attributes and dependencies
        SmClass parent = getParent();
        while (parent != null) {
            this.allAttributes.addAll(parent.selfAttributes);
        
            this.allDependencies.addAll(parent.selfDependencies);
            this.allComponentDep.addAll(parent.selfComponentDep);
            this.allSharedDep.addAll(parent.selfSharedDep);
            this.allReferenceDep.addAll(parent.selfReferenceDep);
            this.allComponentAndSharedDep.addAll(parent.selfComponentAndSharedDep);
        
            parent = parent.getParent();
        }
        
        ((ArrayList<?>) this.allAttributes).trimToSize();
        ((ArrayList<?>) this.allDependencies).trimToSize();
        ((ArrayList<?>) this.allComponentDep).trimToSize();
        ((ArrayList<?>) this.allSharedDep).trimToSize();
        ((ArrayList<?>) this.allReferenceDep).trimToSize();
        ((ArrayList<?>) this.allComponentAndSharedDep).trimToSize();
    }

}
