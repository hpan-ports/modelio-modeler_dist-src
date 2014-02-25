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
                                    

package org.modelio.gproject.fragment.exml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.descriptor.DefinitionScope;
import org.modelio.gproject.descriptor.FragmentDescriptor;
import org.modelio.gproject.descriptor.FragmentType;
import org.modelio.gproject.descriptor.GAuthConf;
import org.modelio.gproject.descriptor.GProperties;
import org.modelio.gproject.descriptor.VersionDescriptors;
import org.modelio.gproject.fragment.AbstractFragment;
import org.modelio.gproject.fragment.UmlFragmentContentInitializer;
import org.modelio.gproject.gproject.GProjectEvent;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.Project;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.local.ExmlBase;
import org.modelio.vstore.exml.resource.LocalExmlResourceProvider;

/**
 * Local EXML repository fragment.
 */
@objid ("dfa9d009-95c6-11e1-ac83-001ec947ccaf")
public class ExmlFragment extends AbstractFragment {
    /**
     * Fragment type identifier.
     */
    @objid ("f4d8467b-aa5a-11e1-8392-001ec947ccaf")
    public static final FragmentType TYPE = FragmentType.EXML;

    @objid ("c1778ccc-95da-11e1-ac83-001ec947ccaf")
    private Path location;

    @objid ("c1778ccd-95da-11e1-ac83-001ec947ccaf")
    private ExmlBase repository;

    /**
     * Instantiate a local fragment.
     * @param id the fragment name
     * @param scope definition scope
     * @param properties the fragment properties.
     * @param authData authentication configuration
     */
    @objid ("6a69b8ca-d66d-11e1-9f03-001ec947ccaf")
    public ExmlFragment(final String id, DefinitionScope scope, final GProperties properties, GAuthConf authData) {
        super(id, scope, properties, authData);
    }

    @objid ("7a4a46ef-cd07-11e1-8e98-001ec947ccaf")
    @Override
    public Collection<MObject> doGetRoots() {
        Collection<MObject> roots = this.repository.findByClass(SmClass.getClass(Project.class));
        roots.addAll(this.repository.findByClass(SmClass.getClass(AnalystProject.class)));
        roots.addAll(this.repository.findByClass(SmClass.getClass(ModuleComponent.class)));
        return roots;
    }

    @objid ("e0552a92-2025-4720-a8d6-3340c4f1f58e")
    @Override
    public VersionDescriptors getMetamodelVersion() throws IOException {
        Path p = getMmVersionPath();
        
        try (BufferedReader in = Files.newBufferedReader(p, StandardCharsets.UTF_8);) {
            return new VersionDescriptors(in);
        } catch (FileNotFoundException | NoSuchFileException e) {
            // Assume current MM version
            final VersionDescriptors current = getLastMmVersion();
            saveMmVersion(current);
            return current;
        }
    }

    @objid ("c1778ce1-95da-11e1-ac83-001ec947ccaf")
    @Override
    public IRepository getRepository() {
        return this.repository;
    }

    @objid ("13a7bf93-9a85-11e1-ac83-001ec947ccaf")
    @Override
    public FragmentType getType() {
        return TYPE;
    }

    @objid ("a301839a-abf1-11e1-8392-001ec947ccaf")
    @Override
    public URI getUri() {
        return getDataDirectory().toUri();
    }

    @objid ("890e6274-4965-4ec6-a165-ce324f1e5792")
    @Override
    public void reconfigure(FragmentDescriptor fd, IModelioProgress aMonitor) {
        // Nothing to do on a local fragment as its location does not change.
    }

    @objid ("213b2539-3eae-468b-8fa4-507e21ea9f1e")
    @Override
    protected void checkMmVersion() throws IOException {
        VersionDescriptors fragmentVersion = getMetamodelVersion();
        if (! fragmentVersion.isSame(getLastMmVersion())) {
            // last compatible version 9017
            // first incompatible version 9016
            final int mmVersion = fragmentVersion.getMmVersion();
            final String fragLabel = getId()+" v"+fragmentVersion.getMmVersion();
            if (mmVersion < 9017 || mmVersion > Integer.parseInt(Metamodel.VERSION)) {
                throw new IOException(CoreProject.getMessage("AbstractFragment.MmVersionNotSupported", getId(), fragmentVersion, getLastMmVersion()));
            } else
                getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(this, new IOException(CoreProject.getMessage("RamcFileFragment.DifferentMmVersion", fragLabel, fragmentVersion))));
        }
    }

    @objid ("dd4c7da9-395a-11e2-a6db-001ec947ccaf")
    @Override
    protected IAccessManager doInitAccessManager() {
        BasicAccessManager ret = new BasicAccessManager();
        return ret;
    }

    @objid ("c1778cd6-95da-11e1-ac83-001ec947ccaf")
    @Override
    protected IRepository doMountInitRepository(IModelioProgress aMonitor) throws IOException {
        if (this.location == null) {
            this.location = getDataDirectory();
        }
        
        LocalExmlResourceProvider resProvider = new LocalExmlResourceProvider(this.location, getRuntimeDirectory());
        resProvider.setName(getId());
        
        this.repository = new ExmlBase(resProvider);
        
        // Create the project structure if new fragment
        if (! Files.isDirectory(this.location)) {
            this.repository.create();
            UmlFragmentContentInitializer.initialize(this);
            
            // Add metamodel version file
            saveMmVersion(getMetamodelVersion());
            
        }
        return this.repository;
    }

    @objid ("c1778cd9-95da-11e1-ac83-001ec947ccaf")
    @Override
    protected void doUnmountPostProcess() {
        this.repository = null;
    }

    @objid ("06014d19-8593-4060-a4d9-5c48778d837f")
    protected Path getMmVersionPath() {
        return getDataDirectory().resolve("admin").resolve(MMVERSION_FILE_NAME);
    }

    @objid ("41d246eb-6718-4703-9dd5-00a627f2b1b3")
    private void saveMmVersion(VersionDescriptors mmVersion) throws IOException {
        final Path mmVersionPath = getMmVersionPath();
        Files.createDirectories(mmVersionPath.getParent());
        
        try (Writer out = Files.newBufferedWriter(mmVersionPath, StandardCharsets.UTF_8)) {
            mmVersion.write(out);
        }
    }

}
