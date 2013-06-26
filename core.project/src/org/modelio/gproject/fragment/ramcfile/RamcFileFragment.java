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
                                    

package org.modelio.gproject.fragment.ramcfile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.descriptor.DefinitionScope;
import org.modelio.gproject.descriptor.FragmentType;
import org.modelio.gproject.descriptor.GAuthConf;
import org.modelio.gproject.descriptor.GProperties;
import org.modelio.gproject.fragment.AbstractFragment;
import org.modelio.gproject.gproject.GProjectEvent;
import org.modelio.gproject.plugin.CoreProject;
import org.modelio.gproject.ramc.core.archive.IModelComponentInfos;
import org.modelio.gproject.ramc.core.archive.ModelComponentArchive;
import org.modelio.vbasic.files.Unzipper;
import org.modelio.vbasic.net.UriPathAccess;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.permission.BasicAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vstore.exml.local.ExmlBase;
import org.modelio.vstore.exml.resource.LocalExmlResourceProvider;

/**
 * RAMC fragment stored in a .ramc file.
 * <p>
 * The RAMC archive is extracted to the data directory on mounting.
 */
@objid ("f0e56183-cc02-11e1-87f1-001ec947ccaf")
public class RamcFileFragment extends AbstractFragment {
    /**
     * Fragment type identifier.
     */
    @objid ("746f79dc-cc3e-11e1-87f1-001ec947ccaf")
    public static final FragmentType TYPE = FragmentType.RAMC;

    @objid ("7420cc95-cc3e-11e1-87f1-001ec947ccaf")
    protected Path modelLocation;

    @objid ("7420cc97-cc3e-11e1-87f1-001ec947ccaf")
    protected ExmlBase repository;

    @objid ("7420cc98-cc3e-11e1-87f1-001ec947ccaf")
    protected URI uri;

    @objid ("bae38a1c-9935-4d5c-83da-1815dc1ede1b")
    private List<MObject> roots;

    /**
     * Initialize the RAMC fragment.
     * @param id the fragment ID.
     * @param uri the ramc file location as an URI
     * @param definitionScope definition scope
     * @param properties not used.
     * @param authConf authentication configuration
     */
    @objid ("7420cc9c-cc3e-11e1-87f1-001ec947ccaf")
    RamcFileFragment(String id, URI uri, DefinitionScope definitionScope, GProperties properties, GAuthConf authConf) {
        super(id, definitionScope, properties, authConf);
        Objects.requireNonNull(uri, "URI must be non null");
        
        this.uri = uri;
    }

    /**
     * Get the model component informations such as the version, the description, the dependencies...
     * @return the model component description.
     * @throws java.io.IOException in case of I/O failure.
     */
    @objid ("cc07bd6d-d668-4067-b513-b7afaac79182")
    public IModelComponentInfos getInformations() throws IOException {
        Path archivePath = extractRamcToLocal(null);
        return new ModelComponentArchive(archivePath).getInfos();
    }

    @objid ("7420cca7-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    public IRepository getRepository() {
        return this.repository;
    }

    @objid ("7420ccaf-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    public FragmentType getType() {
        return TYPE;
    }

    @objid ("7420ccb4-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    public URI getUri() {
        return this.uri;
    }

    @objid ("7420cca1-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    protected IRepository doMountInitRepository(IModelioProgress aMonitor) throws IOException {
        // Look for a local path and create the directory if needed
        Path runtimePath = getRuntimeDirectory();
        Files.createDirectories(runtimePath);
        
        // Copy the RAMC into the data directory if needed
        Path localUri = extractRamcToLocal(aMonitor);
        
        // The RAMC model is in a "model" sub directory.
        this.modelLocation = localUri.resolve("model");
        
        // Instantiate the repository.
        LocalExmlResourceProvider resProvider = new LocalExmlResourceProvider(this.modelLocation, this.modelLocation);
        resProvider.setName(getId());
        
        this.repository = new ExmlBase(resProvider);
        return this.repository;
    }

    @objid ("7420cca4-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    protected void doUnmountPostProcess() throws IOException {
        this.repository = null;
    }

    @objid ("24310712-d0da-11e1-b069-001ec947ccaf")
    protected final void assertOpen() throws IllegalStateException {
        if (this.repository == null) {
            throw new IllegalStateException("The '" + getId() + "' fragment is not mount.");
        }
    }

    @objid ("7420ccb9-cc3e-11e1-87f1-001ec947ccaf")
    @Override
    protected List<MObject> doGetRoots() throws IOException {
        if (this.roots == null) {
            this.roots = new ArrayList<>();
        
            IModelComponentInfos infos = ModelComponentArchive.getRamcDirectoryInfos(getContentDirectory());
            for (MRef mref : infos.getRoots()) {
                MObject obj = getRepository().findById(SmClass.getClass(mref.mc), mref.uuid);
                if (obj != null) {
                    this.roots.add(obj);
                }
            }
        }
        return ((this.roots != null)? this.roots : new ArrayList<MObject>());
    }

    @objid ("dd691981-395a-11e2-a6db-001ec947ccaf")
    @Override
    protected IAccessManager doInitAccessManager() {
        BasicAccessManager ret = new BasicAccessManager();
        ret.setWriteable(false);
        ret.setRamc(true);
        return ret;
    }

    /**
     * Redefined to delete all deployed extern files.
     */
    @objid ("4e9cb211-21ec-4f64-9002-87e35edc1543")
    @Override
    protected void doDelete(IModelioProgress monitor) {
        try {
            removeExportedFilesOfFragment(monitor);
        } catch (IOException e) {
            getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(this, e));
        }
    }

    /**
     * Copy the RAMC file into the fragment data directory if the URI is not
     * relative to the data directory.
     * @param monitor a progress monitor
     * @return the local ramc file location
     * @throws java.io.IOException in case of failure.
     */
    @objid ("b419188e-0baa-11e2-bed6-001ec947ccaf")
    private Path extractRamcToLocal(IModelioProgress monitor) throws IOException {
        Path localRamcPath = getContentDirectory();
        
        if (Files.isDirectory(localRamcPath)) {
            return localRamcPath;
        } else {
            // We have to copy the RAMC to local dir.
            Files.createDirectories(getDataDirectory());
        
            try (UriPathAccess acc = new UriPathAccess(this.uri, getAuthData())) {
                monitor.subTask(CoreProject.getMessage("RamcFileFragment.ExtractRamcFrom", getId(), this.uri));
                new Unzipper().unzip(acc.getPath(), localRamcPath, monitor);
        
                return localRamcPath;
            } catch (MalformedURLException e1) {
                String msg = CoreProject.getMessage("RamcFileFragment.InvalidUri",this.uri, e1.getLocalizedMessage());
                throw new IOException(msg, e1);
            } catch (IllegalArgumentException e1) {
                String msg = CoreProject.getMessage("RamcFileFragment.InvalidUri",this.uri, e1.getLocalizedMessage());
                throw new IOException(msg, e1);
            }
        }
    }

    /**
     * Delete other files deployed with the RAMC such as extern libraries
     * or source files.
     * @param monitor a progress monitor
     * @throws java.io.IOException in case of failure.
     */
    @objid ("85eb632b-e430-41b1-8852-4e6635050d84")
    private void removeExportedFilesOfFragment(IModelioProgress monitor) throws IOException {
        ModelComponentArchive modelComponentArchive = new ModelComponentArchive(getContentDirectory(), false);
        Path deploymentPath = getProject().getProjectDataPath();
        modelComponentArchive.removeExportedFiles(deploymentPath, monitor);
    }

    /**
     * Get the directory where the RAMC archive is extracted.
     * @return the extracted RAMC directory.
     */
    @objid ("0614b2bc-cefb-436d-9be2-84630005c75e")
    private Path getContentDirectory() {
        return getDataDirectory().resolve("content");
    }

}
