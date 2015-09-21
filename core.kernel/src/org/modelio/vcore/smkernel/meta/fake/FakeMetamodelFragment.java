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


package org.modelio.vcore.smkernel.meta.fake;

import java.util.Collection;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.mapi.MExpert;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependencyTypeChecker;
import org.modelio.vcore.smkernel.meta.SmMetamodel;

/**
 * Fake metaclasses metamodel fragment.
 */
@objid ("169efd78-92f6-405d-8fb6-1dc59ea4a540")
public class FakeMetamodelFragment implements ISmMetamodelFragment {
    @objid ("be986d9d-bdb7-4b9f-86cf-dd47b443a87f")
    private static final Version VERSION = new Version(1,0,0);

    @objid ("efc3fe20-06ab-432e-a879-6bc1584c622c")
    @Override
    public String getName() {
        return "Fake";
    }

    @objid ("62cbdffa-ddcb-403b-b03b-0e8b0e0934ae")
    @Override
    public MExpert getMExpert() {
        return null;
    }

    @objid ("908f2429-fd77-4f5d-8a42-d2ecde9d0d0c")
    @Override
    public Version getVersion() {
        return VERSION;
    }

    @objid ("8b8e6ecc-5839-4d40-b87e-86bf1e420223")
    @Override
    public String getProvider() {
        return "Unknown";
    }

    @objid ("d87f17d3-0bae-4fea-b231-7abd2dfc336d")
    @Override
    public String getProviderVersion() {
        return getVersion().toString();
    }

    @objid ("04411042-9255-4681-843d-054f0fbc2282")
    @Override
    public Collection<SmDependencyTypeChecker> createCheckers(SmMetamodel metamodel) {
        return Collections.emptyList();
    }

    @objid ("e8419915-d6c9-49e8-977c-623f0b6fa852")
    @Override
    public Collection<SmClass> createMetaclasses() {
        return Collections.emptyList();
    }

    @objid ("2212d00e-f484-4345-95b4-bf400362659a")
    @Override
    public void configureExperts(SmMetamodel mm) {
        // noop
    }

    /**
     * The fake metamodel is non standard.
     */
    @objid ("8f321bad-bd83-41a8-bd27-893e42d5a8f9")
    @Override
    public boolean isExtension() {
        return true;
    }

}
