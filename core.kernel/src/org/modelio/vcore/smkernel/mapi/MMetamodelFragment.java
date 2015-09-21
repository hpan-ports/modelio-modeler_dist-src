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


package org.modelio.vcore.smkernel.mapi;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.version.Version;

/**
 * A metamodel fragment.
 * <p>
 * The runtime metamodel of Modelio is composed of several fragments:
 * <ul>
 * <li>Modelio metamodel fragments covering UML and BPMN standards, provided by Modelio application, always present</li>
 * <li>extension metamodel fragments provided by application extensions (eg: Modules)</li>
 * </ul>
 * Note the Modelio kernel does not know anything about metamodel fragment providers and that the above description is there only
 * for the sake of clarity. Practically, once initialized with its composing fragments the Metamodel is only a repository for known
 * MClass instances.
 * 
 * <h2>Modelio and provider version management</h2>
 * 
 * The fragment has a Modelio version and a provider version.
 * <p>
 * Metamodel fragments are often a port from a tool to Modelio and
 * this porting may be made in several steps.
 * <ul>
 * <li>Each porting should result in an increase of the Modelio version.<br>
 * <li>When the source tool metamodel changes, the Modelio version should be modified
 * and the provider version should reflect the new metamodel version from the provider tool.
 * </ul>
 * 
 * <h2>Metamodel compatibility checking convention</h2>
 * 
 * Compatibility checking should be done by looking at the Modelio version as following:<ul>
 * <li> if major == 0 : old version numbering before Modelio 3.4
 * <li> major version different : major migration or migration impossible
 * <li> minor version different : migration needed
 * <li> release version different : can be opened by newer metamodel
 * </ul>
 * 
 * <h2>Comparison</h2>
 * Two metamodel fragments are equal if their name and version are equal.
 * The vendor is only informative.
 * @since Modelio 3.4
 * @author cmarin
 */
@objid ("b5203fb6-296a-4064-82ed-c8cdd30f41ab")
public interface MMetamodelFragment {
    /**
     * The mandatory name of this metamodel fragment. Must be distinct from any other loaded metamodel fragment.
     * 
     * Examples: org.modelio.metamodel.standard
     * @return name of this metamodel fragment.
     */
    @objid ("f0b4c213-1683-4e2d-9d38-a56891e75910")
    String getName();

    @objid ("fbd51d94-815e-4e48-b896-6fe4c2eb26de")
    MExpert getMExpert();

    /**
     * The version of the metamodel fragment for Modelio.
     * <p>
     * Compatibility checking must be done as following:<ul>
     * <li> if major == 0 : old version numbering
     * <li> major different : major migration or migration impossible
     * <li> minor different : migration needed
     * <li> release different : can be opened by newer metamodel
     * </ul>
     * @return The version idnetifier.
     */
    @objid ("5d853a4a-489a-4c47-afac-9b6eeac8894b")
    Version getVersion();

    /**
     * The optional name of the provider of this metamodel fragment, typically the vendor.
     * 
     * Example: Modeliosoft
     * @return name of the provider
     */
    @objid ("d73febc3-e78f-4e9a-b3f6-3b3e7902c537")
    String getProvider();

    /**
     * The metamodel version for/from the provider tool.
     * <p>
     * This provider metamodel version is purely informative and should reflect the metamodel version
     * from the source tool.
     * <p>
     * Metamodel fragments are often a port from a tool to Modelio.
     * This porting may be made in several steps.
     * Each porting should result in an increase of the Modelio version.
     * When the source tool metamodel changes, the Modelio version should be modified
     * and the provider version should reflect the new metamodel version from the provider tool.
     * @return The metamodel version for/from the provider.
     */
    @objid ("a2414efd-daed-48dd-b5bb-3cd91bb97783")
    String getProviderVersion();

    /**
     * Two metamodel fragments are equal if their name and version are equal
     */
    @objid ("27a49141-f181-43f8-b904-662d2cf8f549")
    @Override
    boolean equals(Object obj);

    /**
     * Two metamodel fragments are equal if their name and version are equal.
     * <p>
     * Only these 2 fields can be used to compute the hash.
     */
    @objid ("8ba4595a-ee0c-494b-8f51-edd1e5d2e135")
    @Override
    int hashCode();

    /**
     * Tells whether this metamodel fragment is an extension
     * or a standard Modelio metamodel fragment.
     * <p>
     * By default all metamodel fragments are extension fragments.
     * <p>
     * Standard Modelio metamodel fragments are guaranteed to have no metaclass name collisions.
     * @return <i>true</i> if the fragment is an extension, <i>false</i> if it is a Modelio standard fragment.
     */
    @objid ("4bac70a9-db57-4e90-acb9-f55c703d1514")
    boolean isExtension();

}
