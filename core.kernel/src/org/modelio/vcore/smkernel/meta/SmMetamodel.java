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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.log.Log;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.SmObjectSmClass;
import org.modelio.vcore.smkernel.mapi.MExpert;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.fake.FakeMetamodelFragment;

/**
 * Metamodel represent the so-called 'runtime metamodel' used by Modelio kernel at run time.
 * <p>
 * The runtime metamodel of Modelio is composed of several fragments
 * <ul>
 * <li>Modelio metamodel fragments covering UML and BPMN standards, provided by Modelio application, always present</li>
 * <li>extension metamodel fragments provided by application extensions (eg: Modules)</li>
 * </ul>
 * Note the Modelio kernel does not know anything about metamodel fragment providers and that the above description is there only
 * for the sake of clarity. Practically, once initialized with its composing fragments the Metamodel is only a repository for known
 * SmClass instances.
 * @since Modelio 3.4
 */
@objid ("3197dca3-5748-4365-939a-caf142a80f2e")
public class SmMetamodel implements MMetamodel {
    /**
     * All registered metaclass as a table to provide a direct indexed access.
     * <p>
     * This is the reference list of all known metaclasses. Do not use this data field directly.
     * <p>
     * In the case a metaclass should be removed from this list don't use {@link List#remove(Object)} but
     * {@link List#set(int, Object)} to nullify the entry so that other elements keep their index.
     */
    @objid ("43fc6e9f-c9da-4c5f-a835-1967c0e54451")
    private final List<SmClass> metaclasses = new ArrayList<>();

    /**
     * A cache of registered meta classes to provide a fast access by name. This cache can only be maintained in synch with the
     * registered classes table above as long as it is not directly manipulated. Only use the provided accessors.
     */
    @objid ("7e5cec9e-d30b-4070-b59d-901a49d745d2")
    private final Map<String, SmClass> byNameCache = new HashMap<>();

    /**
     * A cache of registered metaclass to provide a fast acccess by name. This cache can only be maintained in synch with the
     * registered classes table above as long as it is not directly manipulated. Only use the provided accessors.
     */
    @objid ("8336756b-8721-426f-bf7b-0a4b751e61aa")
    private final Map<Class<? extends MObject>, SmClass> byInterfaceCache = new HashMap<>();

    @objid ("3520f2a0-8d11-429f-9ac7-dab3d1356f90")
    private List<ISmMetamodelFragment> fragments = new ArrayList<>();

    @objid ("db6d575e-873e-4cb5-a005-7812d6f49c1c")
    private final MExpert mExpert = new SmExpert();

    @objid ("e4a3187c-8866-4330-a5fb-4743253b8b0b")
    private final Map<String, SmClass> fakeMetaclasses = new HashMap<>();

    /**
     * The fake metaclasses fragment.
     */
    @objid ("544cb1bf-3c44-499b-8cf2-a46d78a24c86")
    private ISmMetamodelFragment fakeFragment = new FakeMetamodelFragment();

    /**
     * Default constructor.
     */
    @objid ("dd1f7d4e-2e99-4518-9767-8e1fba21ff10")
    public SmMetamodel() {
        initKernelFragment();
    }

    /**
     * Get the list of meta classes currently composing the runtime metamodel
     * @return an unmodifiable list of the currently registered meta classes
     */
    @objid ("f75313e0-49b8-41c9-8807-dc25109998d5")
    @Override
    public List<SmClass> getRegisteredMClasses() {
        return Collections.unmodifiableList(this.metaclasses);
    }

    /**
     * Get a meta class by its name
     * @param name
     * @return the meta class named by 'name', null if it does not exist.
     */
    @objid ("a47b0c3e-43ea-4dde-9a82-5acddb06bdaf")
    @Override
    public SmClass getMClass(final String name) {
        return this.byNameCache.get(name);
    }

    /**
     * Get a meta class by its internal id
     * @param classid a metaclass internal id
     * @return the meta class number 'id', throws IndexOutOfBoundsException - if the index is out of range
     */
    @objid ("ad9615c3-39d0-4960-8af7-5afad09086c9")
    public SmClass getMClass(final short classid) {
        return this.metaclasses.get(classid);
    }

    /**
     * Get a meta class by its java interface
     * @param interf
     * @return the meta class corresponding to the 'interf' Java interface class, null if it cannot be found
     */
    @objid ("c2a385bd-81ea-4096-a2b9-21ab9fd1cce6")
    @Override
    public SmClass getMClass(Class<? extends MObject> interf) {
        return this.byInterfaceCache.get(interf);
    }

    /**
     * Add a metamodel fragment to the runtime metamodel.
     * <p>
     * Returns the fake metaclasses that already existed.
     * @param mmFragment the metamodel fragment to add
     * @return the fake metaclasses that already existed.
     */
    @objid ("8162edba-4f86-4fc1-86f9-59c770700442")
    public Collection<SmClass> addMetamodelFragment(ISmMetamodelFragment mmFragment) {
        final List<SmClass> newMetaclasses = new ArrayList<>();
        final List<SmClass> removedFakes = new ArrayList<>(0);
        Log.trace("Adding %s v%s metamodel fragment...", mmFragment.getName(), mmFragment.getVersion().toString());
        
        // First pass: create and register all metaclasses
        // Avoids adding the meta class twice. This is because the process of creating a SmClass
        // might also create its parent meta class.
        for (SmClass smClass : mmFragment.createMetaclasses()) {
            //System.out.printf("Metamodel.addMetamodelFragment() PASS 1: creating SmClass for '%s'", smClass.getName());
        
            // Remove fake metaclass
            SmClass fakesmClass = this.fakeMetaclasses.get(smClass.getQualifiedName());
            if (fakesmClass != null) {
                removeFakeMetaclass(fakesmClass);
                removedFakes.add(fakesmClass);
            }
        
            short mid = registerMetaclass(smClass);
        
            smClass.setMetaclassId(mid);
            smClass.setMetamodel(this);
        
            //System.out.printf("Metamodel.addMetamodelFragment() PASS 1: NEW CLASS: '%s'\n", smClass.getName());
            newMetaclasses.add(smClass);
        }
        
        // Second pass: load the metaclasses content
        for (SmClass smClass : newMetaclasses) {
            //System.out.println("Metamodel.addMetamodelFragment() PASS 2: loading '%s'" + smClass.getName());
            smClass.load(this);
        }
        
        // Third pass: call postInit() on the newly defined metaclasses
        for (final SmClass smClass : newMetaclasses) {
            //System.out.println("Metamodel.addMetamodelFragment() PASS 3: postInit() '%s'" + smClass.getName());
            smClass.postInit();
        }
        
        // Fourth pass: install the checkers
        mmFragment.createCheckers(this);
        
        // Register the fragment
        this.fragments.add(mmFragment);
        
        mmFragment.configureExperts(this);
        
        Log.trace("  Loaded %s v%s metamodel fragment.", mmFragment.getName(), mmFragment.getVersion().toString());
        return removedFakes;
    }

    /**
     * @param smClass
     * @return the metaclass id number.
     * @throws java.lang.IllegalStateException if no metaclass id left
     * @throws java.lang.IllegalArgumentException on duplicate metaclasses
     */
    @objid ("93c01cf5-e9ef-43f4-ab4c-148d6af18ef8")
    private short registerMetaclass(final SmClass smClass) throws IllegalArgumentException, IllegalStateException {
        final int id = this.metaclasses.size();
        
        if (id >= 0xffff) {
            throw new IllegalStateException(MessageFormat.format("No handle left for new '%s' metaclass.", smClass.getQualifiedName()));
        }
        
        this.metaclasses.add(smClass);
        
        // Register qualified name
        SmClass previous = this.byNameCache.put(smClass.getQualifiedName(), smClass);
        if (previous != null) {
            // Duplicate metaclass, abort insertion and throw exception
            this.metaclasses.remove(smClass);
            throw new IllegalArgumentException(MessageFormat.format("{0} has same ''{1}'' qualified name as {2} from {3}.",
                    smClass, smClass.getQualifiedName(), previous, previous.getOrigin()));
        }
        
        // Register short name
        previous = this.byNameCache.put(smClass.getName(), smClass);
        if (previous != null) {
            // put back the previous: the first one has priority
            this.byNameCache.put(smClass.getName(), previous);
        }
        
        // Register interface
        this.byInterfaceCache.put(smClass.getJavaInterface(), smClass);
        return (short) id;
    }

    /**
     * Load the kernel metamodel fragment.
     */
    @objid ("a02dafad-68c4-429a-a576-f387082d4750")
    private void initKernelFragment() {
        ISmMetamodelFragment mf = new KernelMetamodelFragment();
        addMetamodelFragment(mf);
    }

    /**
     * Get the metaclasses registered by a metamodel fragment.
     * @param mmFragment a metamodel fragment.
     * @return the registered fragment metaclasses.
     */
    @objid ("a754ea23-20c1-454e-97ad-e86b745d9bd6")
    public Collection<SmClass> getRegisteredMClasses(ISmMetamodelFragment mmFragment) {
        ArrayList<SmClass> ret = new ArrayList<>();
        
        for (SmClass smClass : this.metaclasses) {
            if (smClass.getOrigin().equals(mmFragment)) {
                ret.add(smClass);
            }
        }
        return ret;
    }

    /**
     * Get the registered metamodel fragments.
     * <p>
     * The returned list is not modifiable.
     * @return the metamodel fragments.
     */
    @objid ("2e718cc5-6a63-447d-993e-4a6bd4784b82")
    @Override
    public Collection<ISmMetamodelFragment> getFragments() {
        return Collections.unmodifiableCollection(this.fragments);
    }

    @objid ("0509a0ec-17b5-4cf0-96ed-a0b51e092639")
    @Override
    public MExpert getMExpert() {
        return this.mExpert;
    }

    /**
     * To be called only by {@link FakeSmClassBuilder}.
     * <p>
     * Register a new fake metaclass.
     * @param cls a fake metaclass
     */
    @objid ("ba1f9079-7818-4acb-9dbb-e013502cd86d")
    void addFakeMetaclass(SmClass cls) {
        SmClass existing = this.byNameCache.get(cls.getQualifiedName());
        if (existing != null) {
            throw new IllegalArgumentException(existing+" metaclass already exist.");
        }
        
        short mid = registerMetaclass(cls);
        this.fakeMetaclasses.put(cls.getQualifiedName(), cls);
        
        cls.setMetaclassId(mid);
        cls.setMetamodel(this);
        cls.load(this);
        cls.postInit();
    }

    /**
     * Get a builder to create fake metaclasses.
     * @return a fake metaclasses builder.
     */
    @objid ("ff2f1d77-ed65-4a1c-9a5d-2945f093fda5")
    public FakeSmClassBuilder fakeClassBuilder() {
        return new FakeSmClassBuilder(this, this.fakeFragment);
    }

    /**
     * Remove a fake metaclass from the metamodel.
     * @param smClass a fake metaclass.
     */
    @objid ("8b3385ee-8638-4372-bd2e-7293ba4d2117")
    public void removeFakeMetaclass(final SmClass smClass) {
        if (! this.fakeMetaclasses.containsKey(smClass.getQualifiedName())) {
            throw new IllegalArgumentException(smClass.toString());
        }
        
        unregisterMetaclass(smClass);
    }

    /**
     * Remove a metamodel fragment and forget all its metaclasses.
     * @param removedMm a metamodel fragment to remove.
     */
    @objid ("1f3eb837-c215-460f-8706-e023b185e0a5")
    public void removeFragment(ISmMetamodelFragment removedMm) {
        for (SmClass smClass : new ArrayList<>(getRegisteredMClasses(removedMm))) {
            unregisterMetaclass(smClass);
        }
        
        this.fragments.remove(removedMm);
    }

    @objid ("68389c69-99dd-453c-8fe7-40fe6a8ebd36")
    private void unregisterMetaclass(SmClass smClass) {
        this.byNameCache.remove(smClass.getName());
        this.byNameCache.remove(smClass.getQualifiedName());
        this.byInterfaceCache.remove(smClass.getJavaInterface());
    }

    /**
     * Fragment containing the kernel metaclasses.
     * <p>
     * Each SmMetamodel contain one KernelMetamodelFragment.
     * 
     * @author cmarin
     */
    @objid ("c567fa54-f3cc-4bfb-80bc-0cb5a14f2710")
    private static final class KernelMetamodelFragment implements ISmMetamodelFragment {
        @objid ("32857069-cbb5-4375-816d-3c3a0161b407")
        private DefaultMetaExpert mExpert;

        @objid ("84b798ca-7618-4d38-9f80-a972a784bd42")
        public KernelMetamodelFragment() {
            // nothing
        }

        @objid ("54a0fc04-d1e2-44fb-8fd3-77aefa661257")
        @Override
        public Collection<SmClass> createMetaclasses() {
            final SmClass smClass = new SmObjectSmClass(this);
            return Arrays.asList(smClass);
        }

        /**
         * The kernel version. Should not move much.
         */
        @objid ("14a8cbde-4f9e-48ab-9c01-603aacba99bb")
        @Override
        public Version getVersion() {
            return new Version(1, 0, 0);
        }

        @objid ("500305f6-1842-4914-bd7c-63456e08d5a8")
        @Override
        public String getProvider() {
            return "Modeliosoft";
        }

        @objid ("493648f1-2bb0-4502-aaa4-00f6b6c2786d")
        @Override
        public String getName() {
            return "modelio.kernel";
        }

        @objid ("7c48fa3f-f7ab-4a2e-97f5-7f0d19c6909b")
        @Override
        public List<SmDependencyTypeChecker> createCheckers(SmMetamodel mm) {
            return Collections.emptyList();
        }

        @objid ("ac44ef2c-7aee-46c8-9a4b-1dbf91570fad")
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return obj.getClass() == KernelMetamodelFragment.class;
        }

        @objid ("9c2beecf-d62d-4733-9257-e84b402a65ac")
        @Override
        public int hashCode() {
            return KernelMetamodelFragment.class.hashCode() * 31;
        }

        @objid ("7a741b6e-8cf4-41d9-ad3a-b64618a8862a")
        @Override
        public String getProviderVersion() {
            return getVersion().toString();
        }

        @objid ("2f2219b1-90dd-4e8a-afa5-32b7fc169b73")
        @Override
        public MExpert getMExpert() {
            return this.mExpert;
        }

        @objid ("3f84f317-1239-4221-8bd9-c53fa88e661c")
        @Override
        public void configureExperts(SmMetamodel mm) {
            this.mExpert = new DefaultMetaExpert();
        }

        /**
         * This is a Modelio standard fragment.
         */
        @objid ("fc2c77a9-669d-46ac-af8a-948662af7693")
        @Override
        public boolean isExtension() {
            return false;
        }

    }

}
