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
                                    

package org.modelio.gproject.ramc.core.model;

import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor.ExportedFileEntry;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vbasic.version.Version;

@objid ("600614b3-ecc1-420a-8382-e55155badaf6")
public interface IModelComponent {
    @objid ("99bff7fc-6a38-426c-800c-d91f679774b7")
    String getName();

    @objid ("e317c7b7-ad73-4655-b729-f25ad3d57e15")
    Version getVersion();

    @objid ("403be9bd-a970-43e8-92a4-16c7c3fb4077")
    String getDescription();

    @objid ("27e9925a-c45e-45fe-ac0b-bbb5a03abf2c")
    Artifact getArtifact();

    @objid ("47bb9700-7e8b-4194-971e-fc2fd681aec1")
    Set<Element> getExportedElements();

    @objid ("85d76c6b-c050-4299-beae-2aadcaebdc3a")
    Set<ModelComponent> getRequiredModelComponents();

    @objid ("1b49b33d-258e-4635-a0af-ca3e61c65d79")
    Set<ExportedFileEntry> getExportedFiles();

    @objid ("e79aff4f-6140-43a4-9f6a-7461e557f30b")
    Map<String, String> getContributingModules();

}
